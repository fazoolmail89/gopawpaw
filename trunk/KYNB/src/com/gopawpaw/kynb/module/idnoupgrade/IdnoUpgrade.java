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
 * @���� ���֤������������
 * @���� ¬����
 * @�汾 2012-03-28
 */
public class IdnoUpgrade extends BaseModuleFrame {
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	/**
	 * �в����
	 */
	private JPanel panelCenter = null;
	private ProgressBarPanel pnlProgressBar;

	/**
	 * ���֤�����б����
	 */
	private static IdCardNoTablePanel idCardNoTablePanel = null;

	/**
	 * ��ť���
	 */
	private JPanel panelButtonContainer = null;
	private JButton btnCheck = new JButton("��֤");
	private JButton btnUpgrade = new JButton("����");
	private JButton btnSave = new JButton("����");
	private JButton btnQuit = new JButton("ȡ��");
	private JButton btnExport = new JButton("����");
	
	private JProgressBar progressBar2 = new JProgressBar();
	/**
	 * @throws HeadlessException
	 */
	public IdnoUpgrade() throws HeadlessException {
		setTitle("���֤���Զ�����<һ>");
		
		setSize(900, 600);
		setLocation(200, 100);
		setLayout(new BorderLayout());
		setContentPane(getJContentPane());
	}

	/**
	 * �������
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
		jLabel.setText("ѡ�����:   ");

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
		// �������α߿�
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

		panelButtonContainer.add(new JLabel("��ز���"));

		// ������ť����¼�
		btnUpgrade.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ȡ�������
				Vector<Vector<String>> rowData = idCardNoTablePanel
						.getmVillagerData();
				for (int i = 0; i < rowData.size(); i++) {
					// ��ȡ�����֤����
					String oldIc = rowData.get(i)
							.get(IdCardNoTablePanel.OLD_IC_COLNUM).toString();
					//������֤����Ϊ15λ������ͨ����֤�����Զ�����
					if (oldIc.length() == 15 && IDCardUtil.validate(oldIc)) {
						rowData.get(i).set(IdCardNoTablePanel.NEW_IC_COLNUM,
								IDCardUtil.upgradeIdCardNO(oldIc));
					}
				}
				idCardNoTablePanel.refreshTable(rowData);
			}
		});

		//��֤��ť����¼�
		btnCheck.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				executValidata();
			}
		});

		//���水ť����¼�
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = "�����������ɹ������֤����Ϣ���Ƿ�ȷ�ϲ�����";
				int choseRs = JOptionPane.showConfirmDialog(null, txt, "��ʾ",
						JOptionPane.YES_NO_OPTION);
				if (choseRs == 0) {
					@SuppressWarnings("unused")
					boolean result = false;
					// ��ȡ�������
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
						// ֻ����ͨ�����֤������֤��ʮ��λ�ĺ���
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
						// ���������Ƿ�ɹ�����ˢ�±��
						rowData = idCardNoTablePanel.getMVillagerDataFromDb();
						idCardNoTablePanel.refreshTable(rowData);
				}
			}
		});

		//ȡ����ť����¼�
		btnQuit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = "�Ƿ�ȷ��ȡ�����в�����";
				int choseRs = JOptionPane.showConfirmDialog(null, txt, "���棡����",
						JOptionPane.YES_NO_OPTION);
				if (choseRs == 0) {
					// ��ȡ�������
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
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executValidata() {
		DataLoadProgrees dlp = new DataLoadProgrees(pnlProgressBar);
		dlp.start();
	}
	
	/**
	 * 
	 * @author ¬����
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
