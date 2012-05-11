/**
 * 
 */
package com.gopawpaw.kynb.module.blacklist;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.io.File;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJButton;
import com.gopawpaw.frame.widget.GJCheckBox;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.frame.widget.GJTextField;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.bean.DefultData;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.DataDefultManager;
import com.gopawpaw.kynb.common.PoiOperatXls2;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.utils.IDNumberChecker;
import com.gopawpaw.kynb.utils.KYHashMap;
import com.gopawpaw.kynb.utils.KeyConstants;
import com.gopawpaw.kynb.utils.Tools;
import com.gopawpaw.kynb.widget.GppStyleTable;
import com.gopawpaw.kynb.widget.MessageDialog;

/**
 * ����������ģ����ҳ
 * 
 * @version 2012-4-21
 * @author LiJinHua
 */
public class BlackList extends BaseModuleFrame implements ActionListener,
		GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane jScrollPane1 = null;
	private JScrollPane jScrollPane2 = null;

	private JButton jButtonConfirm;

	private JTextField mJTextExcelPath;

	private JTextField mJTextICEdit;

	private JProgressBar progressBar = new JProgressBar();

	private JTable jTableVillager = null;

	private String[] mVillagerTableTitle;
	private String[][] mVillagerData;
	private Object[][] mVillagerDataObj;

	private String mCurrentBlackIC = "";

	private JLabel jLabelStatusInfo = new JLabel("��ʾ����");

	private String mStatusInfoICEdit = "Enter=��ѯ��F4=��ձ༭��F5=ɾ��";
	private String mStatusInfoTableBlackName = "Up/Down=��/��һ����¼��F5=ɾ��";

	private JLabel jLabelResultCount = new JLabel("");

	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();

	private GppJComboBoxExp jComboBox_ic = null;
	private GppJComboBoxExp jComboBox_name = null;
	private GppJComboBoxExp jComboBox_type = null;
	private GppJComboBoxExp jComboBox_remark1 = null;
	private GppJComboBoxExp jComboBox_remark2 = null;
	private GppJComboBoxExp jComboBox_remark3 = null;

	private HashMap<String, Boolean> mDefultEditShow = DataDefultManager
			.getInstance().getmDefultEditShow();

	private GJComboBox jComboBox;
	public BlackList() {
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setContentPane(getJContentPane());
		this.setTitle("����������");
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());

		JPanel jPanelBottom = new JPanel();
		jPanelBottom.setLayout(new GridLayout());

		jButtonConfirm = new GJButton("ִ�е���");

		jButtonConfirm.addActionListener(this);

		jPanelBottom.add(jLabelStatusInfo, null);

		// �ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
		// jLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10,
		// 20));
		JPanel jPanelV = new JPanel();
		JPanel jPanelC = new JPanel();
		jPanelV.setLayout(new BoxLayout(jPanelV, BoxLayout.Y_AXIS));

		// ѡ���ļ�
		JPanel jPanelC2 = new JPanel();
		jPanelC2.setLayout(new BoxLayout(jPanelC2, BoxLayout.X_AXIS));
		jPanelC2.setAlignmentX(0);

		JButton button = new JButton("ѡ�����ļ�");
		button.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				JFileChooser jFileChooser = new JFileChooser();

				jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				jFileChooser.showOpenDialog(null);

				if (jFileChooser.getSelectedFile() != null) {
					String ph = jFileChooser.getSelectedFile()
							.getAbsolutePath();

					mJTextExcelPath.setText(ph);
				}
			}
		});

		mJTextExcelPath = new JTextField();
		mJTextExcelPath.setPreferredSize(new Dimension(100, 20));
		mJTextExcelPath.setEditable(false);
		mJTextExcelPath.setFocusable(false);

		mJTextICEdit = new GJTextField() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean actionF4() {
				mJTextICEdit.setText("");
				return true;
			};

			public boolean actionF5() {
				actionDeleteVillager();
				return true;
			};

			public boolean actionKey(int keyCode) {

				return true;
			};

			public boolean actionEnter() {
				mCurrentBlackIC = mJTextICEdit.getText();
				refreshTableVillager(mCurrentBlackIC);
				return true;
			};
		};

		mJTextICEdit.setPreferredSize(new Dimension(100, 20));
		mJTextICEdit.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				jLabelStatusInfo.setText(mStatusInfoICEdit);
			}

			@Override
			public void focusLost(FocusEvent e) {
				// TODO Auto-generated method stub
				jLabelStatusInfo.setText("");
			}

		});

		jLabelResultCount.setBorder(BorderFactory
				.createEmptyBorder(0, 0, 0, 10));
		mJTextICEdit.setToolTipText("�������֤�Ż��������֣���ģ����ѯ��");

		jPanelC2.add(new JLabel("�鿴���ͣ�"));
		jPanelC2.add(getBlackListTypeComboBox());

		jPanelC2.add(new JLabel("�����ѯ��"));
		jPanelC2.add(mJTextICEdit);
		jPanelC2.add(jLabelResultCount);
//		jPanelC2.add(new JLabel("�����ļ���"));
//		jPanelC2.add(mJTextExcelPath);
//		jPanelC2.add(button);
//		jPanelC2.add(jButtonConfirm);

		progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
		progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����

		jPanelV.add(jPanelC);
		jPanelV.add(jPanelC2);
		jPanelV.add(progressBar);

		jContentPane.add(jPanelV, BorderLayout.NORTH);
		jContentPane.add(jPanelBottom, BorderLayout.SOUTH);

		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		return jContentPane;
	}

	/**
	 * �м����
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JSplitPane getJPanelCenter() {

		jScrollPane1 = new JScrollPane();
		jScrollPane2 = new JScrollPane();

		jScrollPane1.setViewportView(getJPanelDataEdit());
		jScrollPane2.setViewportView(getJTableVillager());

		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		jPanel1.add(jScrollPane1, BorderLayout.CENTER);

		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		jPanel2.add(jScrollPane2, BorderLayout.CENTER);

		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, jPanel1, jPanel2);
		jSplitPaneCenter.setDividerLocation(270);

		return jSplitPaneCenter;
	}

	private JTable getJTableVillager() {
		if (jTableVillager == null) {

			// �����б���(��ͷ)
			mVillagerTableTitle = new String[] { "ѡ��", "���֤��", "����", "����������",
					"��ע��Ϣһ", "��ע��Ϣ��", "��ע��Ϣ��" };

			// ��ʼ�����

			DefaultTableModel model = new DefaultTableModel(mVillagerDataObj,
					mVillagerTableTitle);
			jTableVillager = new GppStyleTable(model) {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionF5() {
					actionDeleteVillager();
					return true;
				};

				public boolean actionUp() {
					int rowS = jTableVillager.getSelectedRow();
					if (rowS > 0) {
						rowS--;
					}
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS, 1)
							.toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					setEditRow(rowS);
					return true;
				};

				public boolean actionDown() {
					int max = jTableVillager.getRowCount() - 1;
					int rowS = jTableVillager.getSelectedRow();
					if (rowS < max) {
						rowS++;
					}

					mJTextICEdit.setText(jTableVillager.getValueAt(rowS, 1)
							.toString());
					mCurrentBlackIC = mJTextICEdit.getText();

					setEditRow(rowS);
					return true;
				};

			};
			jTableVillager.setRowHeight(22);

			jTableVillager.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
					int rowS = jTableVillager.getSelectedRow();
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS, 1)
							.toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					jLabelStatusInfo.setText(mStatusInfoTableBlackName);
					setEditRow(rowS);
				}
			});

			refreshTableVillager();
		}
		return jTableVillager;
	}

	/**
	 * ���ñ༭����
	 * 
	 * @version 2012-4-22
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void setEditRow(int rowS) {
		String temp = jTableVillager.getValueAt(rowS, 1).toString();
		temp = (temp == null) ? "" : temp;
		jComboBox_ic.setSelectedItem(temp);

		temp = (String) jTableVillager.getValueAt(rowS, 2);
		temp = (temp == null) ? "" : temp;
		jComboBox_name.setSelectedItem(temp);

		temp = (String) jTableVillager.getValueAt(rowS, 3);
		temp = (temp == null) ? "" : temp;
		jComboBox_type.setSelectedItem(temp);

		temp = (String) jTableVillager.getValueAt(rowS, 4);
		temp = (temp == null) ? "" : temp;
		jComboBox_remark1.setSelectedItem(temp);

		temp = (String) jTableVillager.getValueAt(rowS, 5);
		temp = (temp == null) ? "" : temp;
		jComboBox_remark2.setSelectedItem(temp);

		temp = (String) jTableVillager.getValueAt(rowS, 6);
		temp = (temp == null) ? "" : temp;
		jComboBox_remark3.setSelectedItem(temp);
	}

	private void refreshTableVillager() {
		refreshTableVillager("");
	}

	private void refreshTableVillager(String ve_ic) {
		try {

			if (Tools.isContainsChinese(ve_ic)) {
				// ��������ʱ����ѯ����
				mVillagerData = mXXDB.getVillagerErrorAll2ForName(ve_ic);

			} else {
				// �����ѯ��ݺ�

				mVillagerData = mXXDB.getVillagerErrorAll2(ve_ic);
			}

			if (mVillagerData == null) {
				return;
			}
			mVillagerDataObj = getVilagerData(mVillagerData);

			DefaultTableModel model = new DefaultTableModel(mVillagerDataObj,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillager).updateModel(model);

			jLabelResultCount.setText("����" + mVillagerData.length + "��");
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * �ڵ�һ�м��� ѡ�����
	 * 
	 * @version 2012-5-8
	 * @author Jason
	 * @param
	 * @return Object[][]
	 */
	private Object[][] getVilagerData(String[][] objects) {
		Object[][] ret = new Object[objects.length][];

		for (int row = 0; row < objects.length; row++) {

			String[] ss = objects[row];
			Object[] m = new Object[ss.length + 1];

			m[0] = Boolean.FALSE;
			for (int i = 0; i < ss.length; i++) {
				m[i + 1] = ss[i];
			}

			ret[row] = m;
		}
		return ret;
	}

	/**
	 * ���ݺ���������ˢ����Ա��Ϣ
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	private void refreshTableVillagerFromType(String ve_type) {
		try {
			ve_type = (ve_type == null || "<�鿴ȫ��>".equals(ve_type)) ? ""
					: ve_type;

			mVillagerData = mXXDB.getVillagerErrorAll2ForType(ve_type);

			if (mVillagerData == null || jTableVillager == null) {
				return;
			}
			mVillagerDataObj = getVilagerData(mVillagerData);
			DefaultTableModel model = new DefaultTableModel(mVillagerDataObj,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillager).updateModel(model);

			jLabelResultCount.setText("����" + mVillagerData.length + "��");
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private GJComboBox getBlackListTypeComboBox() {
		final GJComboBox jComboBox = new GJComboBox();
		this.jComboBox = jComboBox;
		jComboBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String item = (String) jComboBox.getSelectedItem();
				refreshTableVillagerFromType(item);
			}
		});

		List<DefultData> list = DataDefultManager.getInstance().getDefultData(
				Villager.tab_ve_type);

		jComboBox.addItem("<�鿴ȫ��>");
		if (list != null) {
			for (Iterator iterator = list.iterator(); iterator.hasNext();) {
				DefultData defultData = (DefultData) iterator.next();

				jComboBox.addItem(defultData.getValuse());
			}
		}
		return jComboBox;
	}

	private JPanel getJPanelDataEdit() {
		JPanel jPanelDataEdit0 = new JPanel();

		JPanel jPanelDataEdit = new JPanel();

		jPanelDataEdit0.setLayout(new BorderLayout());

		jPanelDataEdit
				.setLayout(new BoxLayout(jPanelDataEdit, BoxLayout.Y_AXIS));

		jComboBox_ic = new GppJComboBoxExp(DataDefultManager.getInstance()
				.getDefultData(Villager.tab_v_ic)) {

			/**
				 * 
				 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean actionEnter() {
				// TODO Auto-generated method stub
				super.actionEnter();
				String ic = getEditor().getItem().toString();
				selectEditVillager(ic);

				return true;
			}

		};

		jComboBox_name = new GppJComboBoxExp(DataDefultManager.getInstance()
				.getDefultData(Villager.tab_v_name)) {
			/**
				 * 
				 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean actionEnter() {
				// TODO Auto-generated method stub
				super.actionEnter();
				String name = getEditor().getItem().toString();

				return true;
			}
		};
		jComboBox_type = new GppJComboBoxExp(DataDefultManager.getInstance()
				.getDefultData(Villager.tab_ve_type));
		jComboBox_remark1 = new GppJComboBoxExp(DataDefultManager.getInstance()
				.getDefultData(Villager.tab_ve_remark1));
		jComboBox_remark2 = new GppJComboBoxExp(DataDefultManager.getInstance()
				.getDefultData(Villager.tab_ve_remark2));
		jComboBox_remark3 = new GppJComboBoxExp(DataDefultManager.getInstance()
				.getDefultData(Villager.tab_ve_remark3));

		jPanelDataEdit.add(getJPanelNew(Villager.tab_v_ic, jComboBox_ic), null);
		jPanelDataEdit.add(getJPanelNew(Villager.tab_v_name, jComboBox_name),
				null);
		jPanelDataEdit.add(getJPanelNew(Villager.tab_ve_type, jComboBox_type),
				null);
		jPanelDataEdit.add(
				getJPanelNew(Villager.tab_ve_remark1, jComboBox_remark1), null);
		jPanelDataEdit.add(
				getJPanelNew(Villager.tab_ve_remark2, jComboBox_remark2), null);
		jPanelDataEdit.add(
				getJPanelNew(Villager.tab_ve_remark3, jComboBox_remark3), null);

		// ����Enter��˳��
		jComboBox_ic.setFocusetNext(jComboBox_name);
		jComboBox_name.setFocusetNext(jComboBox_type);
		jComboBox_type.setFocusetNext(jComboBox_remark1);
		jComboBox_remark1.setFocusetNext(jComboBox_remark2);
		jComboBox_remark2.setFocusetNext(jComboBox_remark3);
		jComboBox_remark3.setFocusetNext(jComboBox_ic);

		// ����Esc��˳��
		jComboBox_name.setFocusetPre(jComboBox_ic);
		jComboBox_type.setFocusetPre(jComboBox_name);
		jComboBox_remark1.setFocusetPre(jComboBox_type);
		jComboBox_remark2.setFocusetPre(jComboBox_remark1);
		jComboBox_remark3.setFocusetPre(jComboBox_remark2);

		// �ײ���������ť
		JPanel jPanelButton = new JPanel();

		jPanelButton.setLayout(new BoxLayout(jPanelButton, BoxLayout.X_AXIS));
		jPanelButton.add(getJButtonAdd());
		jPanelButton.add(getJButtonUpdate());
		jPanelButton.add(getJButtonDelete());

		// �ײ�������ɾ����������ť
		JPanel jPanelButton2 = new JPanel();

		jPanelButton2.setLayout(new BoxLayout(jPanelButton2, BoxLayout.X_AXIS));
		jPanelButton2.add(getJButtonSelectAll());
		jPanelButton2.add(getJButtonUnSelectAll());
		jPanelButton2.add(getJButtonDeleteSelected());

		jPanelDataEdit.add(new JLabel("         "));
		jPanelDataEdit.add(jPanelButton);
		jPanelDataEdit.add(new JLabel("         "));
		jPanelDataEdit.add(new JLabel("         "));
		jPanelDataEdit.add(jPanelButton2);
		jPanelDataEdit0.add(jPanelDataEdit, BorderLayout.NORTH);

		return jPanelDataEdit0;
	}

	@Override
	public boolean runJar(String[] args) {
		BlackList.main(args);
		return false;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				BlackList thisClass = new BlackList();
				thisClass.showWithFrame();
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (jButtonConfirm.equals(e.getSource())) {

			if (mJTextExcelPath.getText() != null
					&& !mJTextExcelPath.getText().equals("")) {
				new Progress(progressBar, jButtonConfirm).start(); // �Զ�����progress
			} else {
				// ��ʾѡ���ļ�
			}

		}
	}

	class GppJComboBoxExp extends GJComboBox {

		private GppJComboBoxExp mFocuseNext = null;

		private GppJComboBoxExp mFocusePre = null;

		private List<DefultData> mDefData = null;

		private boolean isAutoPopup = false;
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public GppJComboBoxExp(List<DefultData> data) {
			super();
			this.setEditable(true);
			mDefData = data;
			init();
		}

		private void init() {
			if (mDefData != null) {
				for (DefultData d : mDefData) {
					addItem(d);
				}
			}
			setSelectedItem("");

			Component[] comps = this.getComponents();
			for (int i = 0; i < comps.length; i++) {

				if (comps[i] instanceof com.jgoodies.looks.common.ComboBoxEditorTextField) {
					comps[i].addFocusListener(new FocusListener() {

						@Override
						public void focusLost(FocusEvent e) {
							// TODO Auto-generated method stub
							jLabelStatusInfo.setText("");
						}

						@Override
						public void focusGained(FocusEvent e) {
							// TODO Auto-generated method stub
							jLabelStatusInfo.setText("");

							if (isAutoPopup) {
								GppJComboBoxExp.this.showPopup();
							}

						}
					});
				}

			}

			updateGppKeyListener();
		}

		@Override
		public boolean actionUp() {

			if (mFocusePre != null) {
				mFocusePre.requestFocus();
			}
			return super.actionUp();
		}

		@Override
		public boolean actionDown() {

			if (mFocuseNext != null) {
				mFocuseNext.requestFocus();
			}
			return super.actionDown();
		}

		@Override
		public boolean actionEnter() {

			Object obj = this.getEditor().getItem();

			if (obj instanceof DefultData) {
				// ʹ�ö����滻ֵ
				this.setSelectedItem(((DefultData) obj).getValuse());
			} else {
				boolean flag = false;
				for (DefultData d : mDefData) {
					if (d.getKey().equals(obj)) {
						// ʹ�ùؼ����滻ֵ
						this.setSelectedItem((d).getValuse());
						flag = true;
					}
				}

				if (!flag) {
					// ��������ʱ��ʹ��ԭ������
					String str = obj.toString();
					if (!str.equals("")) {
						int i = str.indexOf(".");
						if (i > 0) {
							String pre = str.substring(0, i);
							String suffixal = str.substring(i + 1);

							for (DefultData d : mDefData) {
								if (d.getKey().equals(pre)) {
									// ʹ�ùؼ����滻ֵ
									this.setSelectedItem((d).getValuse()
											+ suffixal);
									flag = true;
								}
							}
						}
					}

					if (!flag) {
						this.setSelectedItem(obj);
					}

				}
			}

			if (!checkDataInput(this)) {
				// ������ַ��Ƿ�

				return false;
			}

			if (mFocuseNext != null) {
				mFocuseNext.requestFocus();
			}
			return super.actionEnter();
		}

		@Override
		public boolean actionEscape() {

			if (mFocusePre != null) {
				mFocusePre.requestFocus();
			}
			return super.actionEscape();
		}

		public void setFocusetNext(GppJComboBoxExp next) {
			mFocuseNext = next;
		}

		public void setFocusetPre(GppJComboBoxExp pre) {
			mFocusePre = pre;
		}

		public boolean isAutoPopup() {
			return isAutoPopup;
		}

		public void setAutoPopup(boolean isAutoPopup) {
			this.isAutoPopup = isAutoPopup;
		}
	}

	/**
	 * ��ȡ�µ����
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JPanel
	 */
	private JPanel getJPanelNew(String tab, final JComboBox jComboBox) {

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		// �ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
		jPanel.setBorder(BorderFactory.createEmptyBorder(4, 0, 4, 0));

		Boolean b = mDefultEditShow.get(tab);
		if (b == null) {
			b = false;
		}
		boolean flagPop = b;
		final GJCheckBox gcb = new GJCheckBox(tab, flagPop);
		gcb.setHorizontalAlignment(SwingConstants.RIGHT);
		gcb.setPreferredSize(new Dimension(150, 25));

		if (jComboBox instanceof GppJComboBoxExp) {
			((GppJComboBoxExp) jComboBox).setAutoPopup(flagPop);
		}
		gcb.addItemListener(new java.awt.event.ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				// System.out.println(gcb.getText()+"=-="+e.getStateChange());
				if (jComboBox instanceof GppJComboBoxExp) {
					if (e.getStateChange() == 1) {
						((GppJComboBoxExp) jComboBox).setAutoPopup(true);
						DataDefultManager.getmGppConfigurationIni().setValue(
								gcb.getText(), "1");
						DataDefultManager.getmGppConfigurationIni().saveFile();
					} else {
						((GppJComboBoxExp) jComboBox).setAutoPopup(false);
						DataDefultManager.getmGppConfigurationIni().setValue(
								gcb.getText(), "0");
						DataDefultManager.getmGppConfigurationIni().saveFile();
					}

				}
			}

		});

		jPanel.add(gcb, null);
		jPanel.add(jComboBox, null);
		// jPanel.add(jPanel2,null);
		return jPanel;
	}

	/**
	 * ��������Ƿ�Ϸ�
	 * 
	 * @version 2012-4-12
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	private boolean checkDataInput(GppJComboBoxExp gjcbe) {

		boolean flag = true;
		String valuse = gjcbe.getSelectedItem().toString();
		if (!Tools.checkStringLegal(valuse)) {

			String tempMSG = "���������Ϣ���� ��\"-\" �� \"+\"�����Ƿ��ַ�";

			// ������ʾ
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			flag = false;
		}

		return flag;
	}

	/**
	 * ִ�����
	 * 
	 * @author �����
	 * @since:2011-11-15
	 */
	private void actionAddVillager() {
		try {
			KYHashMap<String, String> kyMap = new KYHashMap<String, String>();

			kyMap.put(KeyConstants.DB.ve_ic,
					(String) jComboBox_ic.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_name,
					(String) jComboBox_name.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_type,
					(String) jComboBox_type.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_remark1,
					(String) jComboBox_remark1.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_remark2,
					(String) jComboBox_remark2.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_remark3,
					(String) jComboBox_remark3.getSelectedItem());

			mCurrentBlackIC = kyMap.get(KeyConstants.DB.ve_ic);
			if (mCurrentBlackIC == null || "".equals(mCurrentBlackIC)) {
				String tempMSG = "�����֤�Ų���Ϊ�գ����������룡";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();

				return;
			}

			if (mXXDB.isExistVillagerError(mCurrentBlackIC)) {
				String tempMSG = "��Ҫ��ӵ����֤�ţ�" + mCurrentBlackIC + "���Ѿ����ں������У�";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();

				return;
			}

			if (mXXDB.insertVillagerError(kyMap)) {
				String tempMSG = "�ɹ���ӵ����֤�ţ�" + mCurrentBlackIC + "�����������У�";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				refreshTableVillager();

				return;
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

	/**
	 * ִ�����
	 * 
	 * @author �����
	 * @since:2011-11-15
	 */
	private void actionUpdateVillager() {
		try {
			KYHashMap<String, String> kyMap = new KYHashMap<String, String>();

			kyMap.put(KeyConstants.DB.ve_ic,
					(String) jComboBox_ic.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_name,
					(String) jComboBox_name.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_type,
					(String) jComboBox_type.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_remark1,
					(String) jComboBox_remark1.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_remark2,
					(String) jComboBox_remark2.getSelectedItem());
			kyMap.put(KeyConstants.DB.ve_remark3,
					(String) jComboBox_remark3.getSelectedItem());

			mCurrentBlackIC = kyMap.get(KeyConstants.DB.ve_ic);
			if (mCurrentBlackIC == null || "".equals(mCurrentBlackIC)) {
				String tempMSG = "�����֤�Ų���Ϊ�գ����������룡";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();

				return;
			}

			if (!mXXDB.isExistVillagerError(mCurrentBlackIC)) {
				String tempMSG = "��Ҫ��ӵ����֤�ţ�" + mCurrentBlackIC + "�������ں������У�";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();

				return;
			}

			if (mXXDB.updateVillagerError(kyMap)) {
				String tempMSG = "�ɹ��޸ĵ����֤�ţ�" + mCurrentBlackIC + "���ĺ�������Ϣ��";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				refreshTableVillager();

				return;
			}
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

	/**
	 * ִ��ɾ��
	 * 
	 * @author �����
	 * @since:2011-11-15
	 */
	private void actionDeleteVillager() {

		try {

			mCurrentBlackIC = (String) jComboBox_ic.getSelectedItem();
			if (mCurrentBlackIC == null || "".equals(mCurrentBlackIC)) {
				String tempMSG = "�����֤�Ų���Ϊ�գ����������룡";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();

				return;
			}

			if (!mXXDB.isExistVillagerError(mCurrentBlackIC)) {
				String tempMSG = "��Ҫɾ�������֤�ţ�" + mCurrentBlackIC + "���Ѿ����ں������У�";

				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();

				return;
			}

			String tempMSG = "�Ƿ�ȷ�Ͻ����֤��" + mCurrentBlackIC + "���Ӻ��������Ƴ� ��";
			MessageDialog gmd = new MessageDialog() {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				protected void actionFinish(int option) {
					// TODO Auto-generated method stub

					super.actionFinish(option);
					if (option == MessageDialog.YES_OPTION) {
						// ȷ��ɾ��
						try {
							mXXDB.deleteVillagerError(mCurrentBlackIC);
						} catch (DBException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						mJTextICEdit.requestFocus();
						refreshTableVillager();
					}
				}
			};
			gmd.setTitle("ϵͳ��ʾ");
			gmd.setMessage(tempMSG);
			gmd.setVisible(true);

		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
	}

	/**
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonAdd() {
		JButton jButton = new JButton();
		jButton.setText("���");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionAddVillager();
			}
		});
		return jButton;
	}

	/**
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonUpdate() {
		JButton jButton = new JButton();
		jButton.setText("�޸�");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionUpdateVillager();
			}
		});
		return jButton;
	}

	/**
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonDelete() {
		JButton jButton = new JButton();
		jButton.setText("ɾ��");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionDeleteVillager();
			}
		});
		return jButton;
	}

	/**
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonUnSelectAll() {
		JButton jButton = new JButton();
		jButton.setText("ȡ��ȫѡ");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionUnSelectAll();
			}
		});
		return jButton;
	}

	/**
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonSelectAll() {
		JButton jButton = new JButton();
		jButton.setText("ѡ��ȫ��");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionSelectAll();
			}
		});
		return jButton;
	}

	/**
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return JButton
	 */
	private JButton getJButtonDeleteSelected() {
		JButton jButton = new JButton();
		jButton.setText("����ɾ��");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {
				actionDeleteSelected();
			}
		});
		return jButton;
	}

	/**
	 * ȫѡ
	 * 
	 * @version 2012-5-8
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionSelectAll() {
		if (mVillagerDataObj != null) {
			for (int row = 0; row < mVillagerDataObj.length; row++) {
				mVillagerDataObj[row][0] = Boolean.TRUE;
			}
			DefaultTableModel model = new DefaultTableModel(mVillagerDataObj,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillager).updateModel(model);
			jTableVillager.repaint();
			jTableVillager.updateUI();
		}
	}

	/**
	 * ȡ��ȫѡ
	 * 
	 * @version 2012-5-8
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionUnSelectAll() {
		if (mVillagerDataObj != null) {
			for (int row = 0; row < mVillagerDataObj.length; row++) {
				mVillagerDataObj[row][0] = Boolean.FALSE;
			}

			DefaultTableModel model = new DefaultTableModel(mVillagerDataObj,
					mVillagerTableTitle);
			((GppStyleTable) jTableVillager).updateModel(model);
			jTableVillager.repaint();
			jTableVillager.updateUI();
		}
	}

	/**
	 * ɾ����ѡ
	 * 
	 * @version 2012-5-8
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionDeleteSelected() {

		final ArrayList<String> selectedList = new ArrayList<String>();
		StringBuffer  sb = new StringBuffer();
		int selectedNum = 0;
		int max = jTableVillager.getRowCount();
		for (int i = 0; i < max; i++) {
			Object obj = jTableVillager.getValueAt(i, 0);
			if (obj == Boolean.TRUE) {
				selectedNum++;
				if(selectedNum < 5){
					sb.append(jTableVillager.getValueAt(i, 2));
					sb.append("��");					
				}
				
				selectedList.add(""+jTableVillager.getValueAt(i, 1));
			}
		}
		
		if(selectedNum==0){
			String tempMSG = "��Ϊѡ��Ҫɾ����������������ѡ��";
			//������ʾ
			Toolkit.getDefaultToolkit().beep();
			JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
					JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
			
			return;
		}

		String tempMSG = "�Ƿ�ȷ������ɾ��:" + sb.toString() + "�ȣ���"
				+ selectedNum + " ����������";
		
		
		MessageDialog gmd = new MessageDialog(this) {

			private static final long serialVersionUID = 1L;

			@Override
			protected void actionFinish(int option) {
				// TODO Auto-generated method stub

				super.actionFinish(option);
				if (option == MessageDialog.YES_OPTION) {
					// ȷ��ɾ��
					actionDeleteSelectedConfirm(selectedList);
				}
			}
		};
		gmd.setTitle("ϵͳ��ʾ");
		gmd.setModal(true);
		gmd.setMessage(tempMSG);
		gmd.setVisible(true);

	}

	/**
	 * ȷ��ɾ��������
	 * @version 2012-5-8
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void actionDeleteSelectedConfirm(ArrayList<String> selectedList) {
		for (String string : selectedList) {
			try {
				mXXDB.deleteVillagerError(string);
			} catch (DBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		String tempMSG = "�ɹ�ɾ�� " +selectedList.size()+ " ������";
		JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
				JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
		
		mJTextICEdit.requestFocus();
		String item = (String) jComboBox.getSelectedItem();
		refreshTableVillagerFromType(item);
	}
	/**
	 * ѡ��༭�ĺ��������֤��
	 * 
	 * @version 2012-4-22
	 * @author LiJinHua
	 * @param
	 * @return void
	 */
	private void selectEditVillager(String v_ic) {

		if (v_ic != null && v_ic.length() == 18 && v_ic.charAt(17) == 'x') {
			// �����֤���һλСдxתΪ��дX
			v_ic = v_ic.subSequence(0, 17) + "X";
		}

		try {
			String ic_msg = IDNumberChecker.IDCardValidate(v_ic);
			if (!"".equals(ic_msg)) {
				String tempMSG = ic_msg;
				// ������ʾ
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				jComboBox_ic.requestFocus();
				return;
			}

			if (mXXDB.isExistVillagerError(v_ic)) {
				// �Ǻ���������
				String[][] arr = mXXDB.getVillagerErrorAll2(v_ic);
				if (arr == null || arr[0] == null) {
					return;
				}

				jComboBox_ic.setSelectedItem(arr[0][0]);

				jComboBox_name.setSelectedItem(arr[0][1]);

				jComboBox_type.setSelectedItem(arr[0][2]);

				jComboBox_remark1.setSelectedItem(arr[0][3]);

				jComboBox_remark2.setSelectedItem(arr[0][4]);

				jComboBox_remark3.setSelectedItem(arr[0][5]);
				return;
			}

		} catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return;
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	class Progress extends Thread {// �Զ�����progress

		private JProgressBar progressBar;
		private JButton button;
		private String excelPath;
		private XXNCYLBXDBAccess mXXNCYLBXDBAccess;

		public Progress(JProgressBar progressBar, JButton button) {
			this.progressBar = progressBar;
			this.button = button;
			this.excelPath = mJTextExcelPath.getText();
			mXXNCYLBXDBAccess = new XXNCYLBXDBAccess();

		}

		public void run() {
			try {
				Object[][] arr = PoiOperatXls2.readXlsRTA(new File(excelPath));
				if (arr != null) {
					int size = arr.length;
					progressBar.setMaximum(size - 1);

					int importOKCount = 0;
					int importErrorCount = 0;
					int importHasExistCount = 0;

					KYHashMap<String, String> kyMap = new KYHashMap<String, String>();
					String ve_ic = "";
					for (int i = 1; i < size; i++) {
						ve_ic = (String) arr[i][0];
						if (mXXNCYLBXDBAccess.isExistVillagerError(ve_ic)) {
							// �Ѿ�����
							importHasExistCount++;
							progressBar.setString("���ȣ�" + (i + 1) + "/" + size
									+ " �ɹ���" + importOKCount + " ʧ�ܣ�"
									+ importErrorCount + " �Ѵ��ڣ�"
									+ importHasExistCount);
							progressBar.setValue(i + 1); // ����ֵ
							continue;
						}
						int ccc = arr[i].length;
						kyMap.put(KeyConstants.DB.ve_name, (String) arr[i][0]);
						if (ccc > 1) {

							kyMap.put(KeyConstants.DB.ve_ic, (String) arr[i][1]);
						} else {
							kyMap.put(KeyConstants.DB.ve_ic, "");
						}
						if (ccc > 2) {
							kyMap.put(KeyConstants.DB.ve_type,
									(String) arr[i][2]);
						} else {
							kyMap.put(KeyConstants.DB.ve_type, "");
						}

						if (ccc > 3) {
							kyMap.put(KeyConstants.DB.ve_remark1,
									(String) arr[i][3]);
						} else {
							kyMap.put(KeyConstants.DB.ve_remark1, "");
						}

						if (ccc > 4) {
							kyMap.put(KeyConstants.DB.ve_remark2,
									(String) arr[i][4]);
						} else {
							kyMap.put(KeyConstants.DB.ve_remark2, "");
						}

						if (ccc > 5) {
							kyMap.put(KeyConstants.DB.ve_remark3,
									(String) arr[i][5]);
						} else {
							kyMap.put(KeyConstants.DB.ve_remark3, "");
						}

						if (mXXNCYLBXDBAccess.insertVillagerError(kyMap)) {
							// ����ɹ�
							importOKCount++;
						} else {
							// ����ʧ��
							importErrorCount++;
						}

						progressBar.setString("���ȣ�" + (i + 1) + "/"
								+ (size - 1) + " �ɹ���" + importOKCount + " ʧ�ܣ�"
								+ importErrorCount + " �Ѵ��ڣ�"
								+ importHasExistCount);
						progressBar.setValue(i + 1); // ����ֵ
					}
				}

				progressBar.setIndeterminate(false); // ����ȷ���Ľ�����
				// progressBar.setIndeterminate(true); //��ȷ�����ȵĽ�����

			} catch (DBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			refreshTableVillager();
			button.setEnabled(true); // ��ť����
		}
	}
}
