/**
 * 
 */
package com.gopawpaw.kynb.module.oldprogram;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.util.List;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJButton;
import com.gopawpaw.frame.widget.GJDialog;
import com.gopawpaw.frame.widget.GJTextField;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.PoiOperatXls2;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;
import com.gopawpaw.kynb.widget.GppStyleTable;
import com.gopawpaw.kynb.widget.MessageDialog;

/**
 * @version 2011-11-19
 * @author Jason
 */
public class BlackNameManagerDialog  extends GJDialog implements ActionListener, GppJarRunableInterface{

	public final static int YES_OPTION = JOptionPane.YES_OPTION;

	public final static int NO_OPTION = JOptionPane.NO_OPTION;

	private String title;

	private JPanel jPanelContent;

	private JButton jButtonConfirm;

	private JTextField mJTextExcelPath;
	
	private JTextField mJTextICEdit;

	private JProgressBar progressBar = new JProgressBar();

	private JTable jTableVillager = null;
	
	private Vector<String> mVillagerTableTitle = new Vector<String>(1);
	private Vector<Vector<String>> mVillagerData = new Vector<Vector<String>>(1);
	
	private String mCurrentBlackIC = "";
	
	private JLabel jLabelStatusInfo = new JLabel("��ʾ����");
	
	private String mStatusInfoICEdit = "Enter=��ѯ��F1=�������棻F4=��ձ༭��F5=ɾ��";
	private String mStatusInfoTableBlackName = "Up/Down=��/��һ����¼��F5=ɾ��";
	
	private JLabel jLabelResultCount = new JLabel("");
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private XXNCYLBXDBAccess mXXDB = new XXNCYLBXDBAccess();

	/**
	 * @param owner
	 */
	public BlackNameManagerDialog() {
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public BlackNameManagerDialog(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public BlackNameManagerDialog(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public BlackNameManagerDialog(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public BlackNameManagerDialog(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public BlackNameManagerDialog(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public BlackNameManagerDialog(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public BlackNameManagerDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public BlackNameManagerDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public BlackNameManagerDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public BlackNameManagerDialog(Window owner, String title,
			ModalityType modalityType) {
		super(owner, title, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public BlackNameManagerDialog(Frame owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 * @param gc
	 */
	public BlackNameManagerDialog(Dialog owner, String title, boolean modal,
			GraphicsConfiguration gc) {
		super(owner, title, modal, gc);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 * @param gc
	 */
	public BlackNameManagerDialog(Window owner, String title,
			ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				BlackNameManagerDialog.this.setVisible(false);
			}
		});

		this.setModal(true);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	protected void actionFinish(int option, Thorp thorp) {
		// this.setVisible(false);

	}

	private JPanel getJPanelContent() {
		if (jPanelContent == null) {
			jPanelContent = new JPanel();
			jPanelContent.setLayout(new BorderLayout());
			// �ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
			// jPanelContent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,
			// 5));

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
			
			mJTextICEdit = new GJTextField(){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionF1() {
					actionAddVillager();
					return true;
				};
				
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
			mJTextICEdit.addFocusListener(new FocusListener(){

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
			
			jLabelResultCount.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
			
			jPanelC2.add(new JLabel("�������֤��"));
			jPanelC2.add(mJTextICEdit);
			jPanelC2.add(jLabelResultCount);
			jPanelC2.add(new JLabel("�����ļ���"));
			jPanelC2.add(mJTextExcelPath);
			jPanelC2.add(button);
			jPanelC2.add(jButtonConfirm);
			
			progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
			progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����

			jPanelV.add(jPanelC);
			jPanelV.add(jPanelC2);
			jPanelV.add(progressBar);
			
			//��߱��
			JScrollPane jScrollPane = new JScrollPane();
			jScrollPane.setViewportView(getJTableVillager());
			jScrollPane.setPreferredSize(new Dimension(170,400));
			jScrollPane.setAutoscrolls(true);
			jScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

			jPanelContent.add(jScrollPane, BorderLayout.WEST);
			jPanelContent.add(jPanelV, BorderLayout.NORTH);
			jPanelContent.add(jPanelBottom, BorderLayout.SOUTH);
		}
		return jPanelContent;
	}

	@Override
	public void setVisible(boolean arg0) {
		super.setTitle(this.title);
		this.setSize(600, 300);

		this.setLocation(this.getOwner().getLocation().x
				+ this.getOwner().getSize().width / 3, this.getOwner()
				.getLocation().y + this.getOwner().getSize().height / 4);

		this.add(getJPanelContent());

		super.setVisible(arg0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (jButtonConfirm.equals(arg0.getSource())) {
			
			if(mJTextExcelPath.getText() != null && !mJTextExcelPath.getText().equals("")){
				new Progress(progressBar, jButtonConfirm).start(); // �Զ�����progress
			}else{
				//��ʾѡ���ļ�
			}
			
		}

	}

	private JTable getJTableVillager() {
		if (jTableVillager == null) {
			

			// �����б���(��ͷ)
//			String[] columnName = { "���","����","�Ա�","���֤��","����","��������","�־�ס��ַ","��������","�����˻�","����ɷѵ���","��Ա���","�α�ʱ��","�������λ��","��ũ���ʻ����","�μ���ũ����־","��������","�������֤��","�뻧�����ϵ","�Ļ��̶�","��60�겻��15��ɷѱ�־","��ϵ�绰","����״��","������ò","��ϵ��","ͨѶ��ַ","��������","��ת��Ա��־","�Ͷ�ģ��","�籣�˺�","��������","״̬","��ע"};

			mVillagerTableTitle.add(Villager.tab_v_ic );

			
			// ��ʼ�����
			
			DefaultTableModel model = new DefaultTableModel(mVillagerData, mVillagerTableTitle);
			jTableVillager = new GppStyleTable(model){

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
					if(rowS>0){
						rowS--;
					}
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS,0).toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					return true;
				};
				public boolean actionDown() {
					int max = jTableVillager.getRowCount()-1;
					int rowS = jTableVillager.getSelectedRow();
					if(rowS<max){
						rowS++;
					}
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS,0).toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					return true;
				};
				
			};
			jTableVillager.setRowHeight(22);
			
			jTableVillager.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					// System.out.println("mouseClicked()"); // TODO
					// Auto-generated Event stub mouseClicked()
					int rowS = jTableVillager.getSelectedRow();
					mJTextICEdit.setText(jTableVillager.getValueAt(rowS,0).toString());
					mCurrentBlackIC = mJTextICEdit.getText();
					jLabelStatusInfo.setText(mStatusInfoTableBlackName);
					
				}
			});

			
			refreshTableVillager();
		}
		return jTableVillager;
	}
	
	private void refreshTableVillager(){
		refreshTableVillager("");
	}
	
	private void refreshTableVillager(String ve_ic){
		try {
			List<String> list = mXXDB.getVillagerErrorAll(ve_ic);
			
			mVillagerData.removeAllElements();
			for(String v:list){
				Vector<String> rowdata = new Vector<String>(1);
				rowdata.add(v);
				mVillagerData.add(rowdata);
			}
			
			DefaultTableModel model = new DefaultTableModel(mVillagerData, mVillagerTableTitle);
			((GppStyleTable)jTableVillager).updateModel(model);
			
			jLabelResultCount.setText("����"+list.size()+"��");
			jTableVillager.repaint();
			jTableVillager.updateUI();
		} catch (DBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ִ�����
	 * @author �����
	 * @since:2011-11-15
	 */
	private void actionAddVillager(){
		try {
			mCurrentBlackIC = mJTextICEdit.getText();
			if(mCurrentBlackIC==null || "".equals(mCurrentBlackIC)){
				String tempMSG = "�����֤�Ų���Ϊ�գ����������룡";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			if(mXXDB.isExistVillagerError(mCurrentBlackIC)){
				String tempMSG = "��Ҫ��ӵ����֤�ţ�"+mCurrentBlackIC+"���Ѿ����ں������У�";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			if(mXXDB.insertVillagerError(mCurrentBlackIC)){
				String tempMSG = "�ɹ���ӵ����֤�ţ�"+mCurrentBlackIC+"�����������У�";
				
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
	 * @author �����
	 * @since:2011-11-15
	 */
	private void actionDeleteVillager(){
		
		try {
			
			mCurrentBlackIC = mJTextICEdit.getText();
			if(mCurrentBlackIC==null || "".equals(mCurrentBlackIC)){
				String tempMSG = "�����֤�Ų���Ϊ�գ����������룡";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			if(!mXXDB.isExistVillagerError(mCurrentBlackIC)){
				String tempMSG = "��Ҫɾ�������֤�ţ�"+mCurrentBlackIC+"���Ѿ����ں������У�";
				
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				mJTextICEdit.requestFocus();
				
				return;
			}
			
			String tempMSG = "�Ƿ�ȷ�Ͻ����֤��"+mCurrentBlackIC+"���Ӻ��������Ƴ� ��";
			MessageDialog gmd = new MessageDialog(this){
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				@Override
				protected void actionFinish(int option) {
					// TODO Auto-generated method stub
					
					super.actionFinish(option);
					if(option == MessageDialog.YES_OPTION){
						//ȷ��ɾ��
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
					progressBar.setMaximum(size);
					
					int importOKCount = 0;
					int importErrorCount = 0;
					int importHasExistCount = 0;
					
					String ve_ic = "";
					for (int i = 0; i < size; i++) {
						ve_ic = (String) arr[i][0];
						if(mXXNCYLBXDBAccess.isExistVillagerError(ve_ic)){
							//�Ѿ�����
							importHasExistCount++;
							progressBar.setString("���ȣ�"+(i+1)+"/"+size+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount);
							progressBar.setValue(i+1); // ����ֵ
							continue;
						}
						
						if(mXXNCYLBXDBAccess.insertVillagerError(ve_ic)){
							//����ɹ�
							importOKCount++;
						}else{
							//����ʧ��
							importErrorCount++;
						}
						
						progressBar.setString("���ȣ�"+(i+1)+"/"+size+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount);
						progressBar.setValue(i+1); // ����ֵ
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




	@Override
	public boolean runJar(String[] args) {
		BlackNameManagerDialog.main(args);
		return false;
	}

	public static void main(String[] args) {
		Frame f = new Frame();
		BlackNameManagerDialog gmd = new BlackNameManagerDialog(f);
		gmd.setTitle("����������");
		gmd.setVisible(true);
	}
}
