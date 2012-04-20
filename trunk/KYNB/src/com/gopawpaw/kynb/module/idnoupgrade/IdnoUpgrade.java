package com.gopawpaw.kynb.module.idnoupgrade;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;

import com.gopawpaw.frame.dev.common.GppJarRunableInterface;
import com.gopawpaw.frame.javax.swing.GppJComboBox;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;

/**
 * @���� ���֤������������
 * @���� ¬����
 * @�汾 2012-03-28
 */
public class IdnoUpgrade extends BaseModuleFrame implements
		GppJarRunableInterface {

	//public JFrame mf = null;

	private static IdnoUpgrade thisClass;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;
	/**
	 * �в����
	 */
	private JPanel panelCenter = null;

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
	// ---------------------------------------------------

	private JPanel jPanelBottom = null;

	@SuppressWarnings("unused")
	private GppJComboBox jComboBoxThorp = null;

	@SuppressWarnings("unused")
	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();

	/**
	 * @throws HeadlessException
	 */
	public IdnoUpgrade() throws HeadlessException {
		initialize();
	}

	/**
	 * @param args
	 * @throws HeadlessException
	 */
	public IdnoUpgrade(String[] args) throws HeadlessException {
		super(args);
		initialize();
	}

	/**
	 * @param gc
	 */
	public IdnoUpgrade(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public IdnoUpgrade(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public IdnoUpgrade(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		setSize(900, 600);
		setLocation(200, 100);
		setLayout(new BorderLayout());
		setContentPane(getJContentPane());
		// add(getJContentPane(), BorderLayout.CENTER);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setVisible(true);
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

	@Override
	public boolean runJar(String[] args) {
		IdnoUpgrade.main(args);
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				// IdnoUpgrade thisClass = new IdnoUpgrade();
				thisClass = new IdnoUpgrade();
				// thisClass.setVisible(true);
				thisClass.setVisible(true);

				idCardNoTablePanel.setMf(thisClass);
			}
		});
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null)
			jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());
		jContentPane.add(getJPanelTop(), BorderLayout.NORTH);
		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		jContentPane.add(getJPanelBottom(), BorderLayout.SOUTH);
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
			idCardNoTablePanel = new IdCardNoTablePanel(800, 500);
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
/*				Vector<Vector<String>> rowData = idCardNoTablePanel
						.getMVillagerDataFromDb();
				idCardNoTablePanel.refreshTable(rowData);*/
				DataLoadProgrees dlp = new DataLoadProgrees(IdnoUpgrade.this);
				dlp.start();
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

	public JPanel getJPanelBottom() {
		if (jPanelBottom == null)
			jPanelBottom = new JPanel();
		return jPanelBottom;
	}
	
	/**
	 * 
	 * @author ¬����
	 *
	 */
	class DataLoadProgrees extends Progress {
		public DataLoadProgrees(Frame frame) {
			super(frame);
		}
		
		@Override
		public void execut() {
			Vector<Vector<String>> rowData = idCardNoTablePanel
					.getMVillagerDataFromDb();
			idCardNoTablePanel.refreshTable(rowData);
		}
	}
}
