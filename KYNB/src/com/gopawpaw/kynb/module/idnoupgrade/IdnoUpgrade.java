package com.gopawpaw.kynb.module.idnoupgrade;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.Progress;
import com.gopawpaw.kynb.common.ProgressBarPanel;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.module.BaseModuleFrame;

/**
 * @描述 身份证号码升级界面
 * @作者 卢向琪
 * @版本 2012-03-28
 */
public class IdnoUpgrade extends BaseModuleFrame {
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	/**
	 * 中部面板
	 */
	private JPanel panelCenter = null;
	private ProgressBarPanel pnlProgressBar;

	/**
	 * 身份证号码列表面板
	 */
	private static IdCardNoTablePanel idCardNoTablePanel = null;

	/**
	 * 按钮面板
	 */
	private JPanel panelButtonContainer = null;
	private JButton btnCheck = new JButton("验证");
	private JButton btnUpgrade = new JButton("升级");
	private JButton btnSave = new JButton("保存");
	private JButton btnQuit = new JButton("取消");
	private JButton btnExport = new JButton("导出");
	
	private JProgressBar progressBar2 = new JProgressBar();
	/**
	 * @throws HeadlessException
	 */
	public IdnoUpgrade() throws HeadlessException {
		setTitle("身份证号自动升级<一>");
		
		setSize(900, 600);
		setLocation(200, 100);
		setLayout(new BorderLayout());
		setContentPane(getJContentPane());
	}

	/**
	 * 顶部面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JPanel getJPanelTop() {

		JPanel jPanelTop = new JPanel();

		jPanelTop.setLayout(new GridBagLayout());
		jPanelTop.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

		JLabel jLabel = new JLabel();
		jLabel.setText("选择村名:   ");

		JLabel jLabel2 = new JLabel();
		jLabel2.setPreferredSize(new Dimension(30, 20));

		return jPanelTop;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				IdnoUpgrade thisClass = new IdnoUpgrade();
				thisClass.showWithFrame();
			}
		});
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		
		jContentPane = new JPanel();
		pnlProgressBar = new ProgressBarPanel();
		jContentPane.setLayout(new BorderLayout());
		jContentPane.add(getJPanelTop(), BorderLayout.NORTH);
		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		jContentPane.add(pnlProgressBar, BorderLayout.SOUTH);
		return jContentPane;
	}

	/**
	 * 
	 * @return
	 */
	private Component getJPanelCenter() {
		if (panelCenter == null)
			panelCenter = new JPanel();
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add(getIdCardNoTablePanel(), BorderLayout.CENTER);
		panelCenter.add(getPanelButtonContainer(), BorderLayout.EAST);
		//panelCenter.setVisible(true);
		return panelCenter;
	}

	/**
	 * 
	 * @return
	 */
	public JPanel getIdCardNoTablePanel() {
		if (idCardNoTablePanel == null)
			idCardNoTablePanel = new IdCardNoTablePanel(this, 800, 500);
		// 创建线形边框
		LineBorder lineBorder = (LineBorder)BorderFactory.createLineBorder(Color.black);
		idCardNoTablePanel.setBorder(lineBorder);
		return idCardNoTablePanel;
	}

	public JPanel getPanelButtonContainer() {
		if (panelButtonContainer == null)
			panelButtonContainer = new JPanel();

		btnUpgrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
			}
		});

		panelButtonContainer.add(new JLabel("相关操作"));

		// 升级按钮点击事件
		btnUpgrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 获取表格数据
				Vector<Vector<String>> rowData = idCardNoTablePanel
						.getmVillagerData();
				for (int i = 0; i < rowData.size(); i++) {
					// 获取旧身份证号码
					String oldIc = rowData.get(i)
							.get(IdCardNoTablePanel.OLD_IC_COLNUM).toString();
					//如果身份证号码为15位，并且通过验证，则自动升级
					if (oldIc.length() == 15 && IDCardUtil.validate(oldIc)) {
						rowData.get(i).set(IdCardNoTablePanel.NEW_IC_COLNUM,
								IDCardUtil.upgradeIdCardNO(oldIc));
					}
				}
				idCardNoTablePanel.refreshTable(rowData);
			}
		});

		//验证按钮点击事件
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				executValidata();
			}
		});

		//保存按钮点击事件
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = "将保存升级成功的身份证号信息，是否确认操作？";
				int choseRs = JOptionPane.showConfirmDialog(null, txt, "提示",
						JOptionPane.YES_NO_OPTION);
				if (choseRs == 0) {
					@SuppressWarnings("unused")
					boolean result = false;
					// 获取表格数据
					Vector<Vector<String>> rowData = idCardNoTablePanel
							.getmVillagerData();
					List<Villager> list = new ArrayList<Villager>();
					IdCardDbAccess icdAccess = new IdCardDbAccess();

					Villager villager = null;
					for (int i = 0; i < rowData.size(); i++) {
						String oldIc = rowData.get(i)
								.get(IdCardNoTablePanel.OLD_IC_COLNUM)
								.toString();
						String newIc = rowData.get(i)
								.get(IdCardNoTablePanel.NEW_IC_COLNUM)
								.toString();
						// 只更新通过身份证号码验证的十八位的号码
						if (!"".equals(newIc) && IDCardUtil.validate(oldIc)) {
							villager = new Villager();
							villager.setV_ic(newIc);
							villager.setV_old_ic(oldIc);
							list.add(villager);
						}
					}
					try {
						result = icdAccess.update(list);
					} catch (DBException e1) {
						e1.printStackTrace();
					}
						// 无论升级是否成功，都刷新表格
						rowData = idCardNoTablePanel.getMVillagerDataFromDb();
						idCardNoTablePanel.refreshTable(rowData);
				}
			}
		});

		//取消按钮点击事件
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = "是否确认取消所有操作？";
				int choseRs = JOptionPane.showConfirmDialog(null, txt, "警告！！！",
						JOptionPane.YES_NO_OPTION);
				if (choseRs == 0) {
					// 获取表格数据
					Vector<Vector<String>> rowData = idCardNoTablePanel
							.getmVillagerData();
					for (int i = 0; i < rowData.size(); i++) {
						rowData.get(i)
								.set(IdCardNoTablePanel.NEW_IC_COLNUM, "");
					}
					idCardNoTablePanel.refreshTable(rowData);
					//idCardNoTablePanel.getModel().setDataVector(rowData,idCardNoTablePanel.getmVillagerTableTitle());
				}
			}
		});
		
		btnExport.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				idCardNoTablePanel.actionSaveTableDateToExce(progressBar2);
			}
		});

		panelButtonContainer.add(btnCheck);
		panelButtonContainer.add(btnUpgrade);
		panelButtonContainer.add(btnSave);
		panelButtonContainer.add(btnQuit);
		panelButtonContainer.add(btnExport);
		panelButtonContainer.setPreferredSize(new Dimension(70, 500));
		return panelButtonContainer;
	}

	/**
	 * 执行导入Excel文件
	 * 
	 * @param file
	 */
	public void executValidata() {
		DataLoadProgrees dlp = new DataLoadProgrees(pnlProgressBar);
		dlp.start();
	}
	
	/**
	 * 
	 * @author 卢向琪
	 *
	 */
	class DataLoadProgrees extends Progress {
		public DataLoadProgrees(ProgressBarPanel pnlProgressBar) {
			super(pnlProgressBar);
		}
		
		@Override
		public void execut() {
			Vector<Vector<String>> rowData = idCardNoTablePanel
					.getMVillagerDataFromDb(super.getListener());
			idCardNoTablePanel.refreshTable(rowData);
		}
	}
}
