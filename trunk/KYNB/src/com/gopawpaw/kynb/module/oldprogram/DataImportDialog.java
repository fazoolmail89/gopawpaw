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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import com.gopawpaw.frame.widget.GJButton;
import com.gopawpaw.frame.widget.GJDialog;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelDBAccess;
import com.gopawpaw.kynb.db.GppCommonDBAccess;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * @version 2011-11-18
 * @author Jason
 */
public class DataImportDialog extends GJDialog implements ActionListener {

	public final static int YES_OPTION = JOptionPane.YES_OPTION;

	public final static int NO_OPTION = JOptionPane.NO_OPTION;

	private String title;

	private Thorp thorp;

	private JPanel jPanelContent;

	private JButton jButtonConfirm;

	private JButton jButtonCancel;

	private JTextField mJTextExcelPath;

	private JProgressBar progressBar = new JProgressBar();

	private ExcelDBAccess mExcelDBAccess;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param owner
	 */
	public DataImportDialog() {
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public DataImportDialog(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public DataImportDialog(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public DataImportDialog(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public DataImportDialog(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public DataImportDialog(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public DataImportDialog(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public DataImportDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public DataImportDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public DataImportDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public DataImportDialog(Window owner, String title,
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
	public DataImportDialog(Frame owner, String title, boolean modal,
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
	public DataImportDialog(Dialog owner, String title, boolean modal,
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
	public DataImportDialog(Window owner, String title,
			ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				DataImportDialog.this.setVisible(false);
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
			jButtonConfirm = new GJButton("ȷ��") {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionEnter() {

					actionFinish(YES_OPTION, thorp);
					return true;
				};
			};
			jButtonCancel = new GJButton("ȡ��") {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionEnter() {
					actionFinish(NO_OPTION, null);
					return true;
				};
			};

			jButtonConfirm.addActionListener(this);
			jButtonCancel.addActionListener(this);

			JLabel jLabel = new JLabel();
			jLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			jPanelBottom.setBorder(BorderFactory
					.createEmptyBorder(0, 30, 0, 30));
			jPanelBottom.add(jButtonConfirm, null);
			jPanelBottom.add(jLabel, null);
			jPanelBottom.add(jButtonCancel, null);

			// �ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
			// jLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10,
			// 20));
			JPanel jPanelV = new JPanel();
//			JPanel jPanelC = new JPanel();
			jPanelV.setLayout(new BoxLayout(jPanelV, BoxLayout.Y_AXIS));

			// ����
//			if (thorp != null) {
//				JLabel jLabel2 = new JLabel("������" + thorp.getT_name());
//				jPanelC.add(jLabel2, null);
//			}

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
						System.out.println(ph);
						mJTextExcelPath.setText(ph);
					}

				}
			});

			mJTextExcelPath = new JTextField();
			mJTextExcelPath.setPreferredSize(new Dimension(400, 20));

			jPanelC2.add(mJTextExcelPath);
			jPanelC2.add(button);

			progressBar.setStringPainted(true); // ��ʾ��ʾ��Ϣ
			progressBar.setIndeterminate(false); // ȷ�����ȵĽ�����

//			jPanelV.add(jPanelC);
			jPanelV.add(jPanelC2);
			jPanelV.add(progressBar);
			jPanelContent.add(jPanelV, BorderLayout.NORTH);
			jPanelContent.add(jPanelBottom, BorderLayout.SOUTH);
		}
		return jPanelContent;
	}

	@Override
	public void setVisible(boolean arg0) {
		super.setTitle(this.title);
		this.setSize(400, 150);

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
			
			actionFinish(YES_OPTION, thorp);
		} else if (jButtonCancel.equals(arg0.getSource())) {
			actionFinish(NO_OPTION, null);
			this.setVisible(false);
		}

	}

	public Thorp getThorp() {
		return thorp;
	}

	public void setThorp(Thorp thorp) {
		this.thorp = thorp;
	}

	class Progress extends Thread {// �Զ�����progress
		
		private JProgressBar progressBar;
		private JButton button;
		private XXNCYLBXDBAccess mXXNCYLBXDBAccess;
		public Progress(JProgressBar progressBar, JButton button) {
			this.progressBar = progressBar;
			this.button = button;
			
			mExcelDBAccess = new ExcelDBAccess(mJTextExcelPath.getText());
			mXXNCYLBXDBAccess = new XXNCYLBXDBAccess();
			
		}

		public void run() {
			try {
				button.setEnabled(false);
//				System.out.println("=="+mExcelDBAccess.cheakVillagerTitle());
//				
//				List<Villager> list = mExcelDBAccess.getVillagerAll();
//				
//				
//				if (list != null) {
//					int size = list.size();
//					progressBar.setMaximum(size);
//					Villager villager = null;
//					Villager villagerSrc = null;
//					
//					int importOKCount = 0;
//					int importErrorCount = 0;
//					int importHasExistCount = 0;
//					int importBlackNameCount = 0;
//					
//					for (int i = 0; i < size; i++) {
//						villager = new Villager();
//						villagerSrc = list.get(i);
//						
//						villager.setT_id(0);
//						villager.setV_name(villagerSrc.getV_name());
//						villager.setV_sex(villagerSrc.getV_sex());
//						villager.setV_nation(villagerSrc.getV_nation());
//						villager.setV_birthday(villagerSrc.getV_birthday());
//						villager.setV_ic(villagerSrc.getV_ic());
//						villager.setV_address_live(villagerSrc.getV_address_live());
//						villager.setV_householder_name(villagerSrc.getV_householder_name());
//						
//						if(mXXNCYLBXDBAccess.isExistVillager(villager.getV_ic())){
//							//�Ѿ�����
//							importHasExistCount++;
//							progressBar.setString("���ȣ�"+(i+1)+"/"+size+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount+" ��������"+importBlackNameCount);
//							progressBar.setValue(i+1); // ����ֵ
//							continue;
//						}
//						
//						if(mXXNCYLBXDBAccess.isExistVillagerError(villager.getV_ic())){
//							//���ں�������
//							importBlackNameCount++;
//							
//							villager.setV_status("b");
//						}else{
//							villager.setV_status("a");
//						}
//						
//						
//						
//						if(mXXNCYLBXDBAccess.insertVillager(villager)){
//							//����ɹ�
//							importOKCount++;
//						}else{
//							//����ʧ��
//							importErrorCount++;
//						}
//						
//						progressBar.setString("���ȣ�"+(i+1)+"/"+size+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount+" ��������"+importBlackNameCount);
//						progressBar.setValue(i+1); // ����ֵ
//					}
//				}
//
//				progressBar.setIndeterminate(false); // ����ȷ���Ľ�����
				// progressBar.setIndeterminate(true); //��ȷ�����ȵĽ�����
				
				//===================================������ begin
				GppCommonDBAccess commonsql = mExcelDBAccess.getVillagerAllSQL();
				if(commonsql != null && commonsql.getrowcount()>0){
					
					int size = (int) commonsql.getrowcount();
					int importOKCount = 0;
					int importErrorCount = 0;
					int importHasExistCount = 0;
					int importBlackNameCount = 0;
					progressBar.setMaximum(size);
					
					Villager villager = new Villager();
					
					int i = -1;
					while (commonsql.nextrecord()) {
						i++;
						villager.setT_id(0);
						villager.setV_name(commonsql.getString(1));
						villager.setV_sex(commonsql.getString(2));
						villager.setV_nation(commonsql.getString(3));
						villager.setV_birthday(commonsql.getString(4));
						villager.setV_ic(commonsql.getString(5));
						villager.setV_address_live(commonsql.getString(6));
						villager.setV_householder_name(commonsql.getString(7));
						
						
						if(mXXNCYLBXDBAccess.isExistVillager(villager.getV_ic())){
							//�Ѿ�����
							importHasExistCount++;
							progressBar.setString("���ȣ�"+(i+1)+"/"+size+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount+" ��������"+importBlackNameCount);
							progressBar.setValue(i+1); // ����ֵ
							continue;
						}
						
						if(mXXNCYLBXDBAccess.isExistVillagerError(villager.getV_ic())){
							//���ں�������
							importBlackNameCount++;
							
							villager.setV_status("b");
						}else{
							villager.setV_status("a");
						}
						
						if(mXXNCYLBXDBAccess.insertVillager(villager)){
							//����ɹ�
							importOKCount++;
						}else{
							//����ʧ��
							importErrorCount++;
						}
						
						progressBar.setString("���ȣ�"+(i+1)+"/"+size+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount+" ��������"+importBlackNameCount);
						progressBar.setValue(i+1); // ����ֵ
					}

					commonsql.close();
					
					progressBar.setIndeterminate(false);
				}
				//==========================������ end
				
//				//==========================������  begin
//				GppCommonDBAccess commonsql = mExcelDBAccess.getCommonSQL();
//				String sql = "select count(1) as totalCount from [Sheet1$] ";
//	
//				if(commonsql == null){
//					return;
//				}
//				
//				if (commonsql.query(sql)) {
//					int totalCount = 0;
//					int currentCount = 0;
//					int importOKCount = 0;
//					int importErrorCount = 0;
//					int importHasExistCount = 0;
//					int importBlackNameCount = 0;
//					
//					while (commonsql.nextrecord()) {
//						totalCount = commonsql.getInt("totalCount");
//					}
//					progressBar.setMaximum(totalCount);
//					int pageSize = 2000;
//					
//					
//					if(totalCount > pageSize){
//						//��Ҫ��ҳ����
//						int pageCount = totalCount / pageSize;
//						if((totalCount%pageSize) > 0){
//							pageCount = pageCount + 1;
//						}
//						
//						String idc = "���֤��";
//						for(int i=0;i<pageCount;i++){
//							
//							if(i==0){
//								sql = "select top " + pageSize + " * from [Sheet1$] order by "+idc;
//
//							}else{
//								sql = "select top "+pageSize+" * from [Sheet1$] where "+idc+" > (select top 1 max("+idc+") as idc from (select top "+(i*pageSize)+" * from [Sheet1$] order by "+idc+")) order by "+idc+";";
//							}
//							System.out.println("page:"+i+"="+sql);
//							if (commonsql.query(sql)) {
//								
//								Villager villager = new Villager();
//								
//								while (commonsql.nextrecord()) {
//									currentCount++;
//									villager.setT_id(0);
//									villager.setV_name(commonsql.getString(1));
//									villager.setV_sex(commonsql.getString(2));
//									villager.setV_nation(commonsql.getString(3));
//									villager.setV_birthday(commonsql.getString(4));
//									villager.setV_ic(commonsql.getString(5));
//									villager.setV_address_live(commonsql.getString(6));
//									villager.setV_householder_name(commonsql.getString(7));
//									
//									
//									if(mXXNCYLBXDBAccess.isExistVillager(villager.getV_ic())){
//										//�Ѿ�����
//										importHasExistCount++;
//										progressBar.setString("���ȣ�"+currentCount+"/"+totalCount+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount+" ��������"+importBlackNameCount);
//										progressBar.setValue(currentCount); // ����ֵ
//										continue;
//									}
//									
//									if(mXXNCYLBXDBAccess.isExistVillagerError(villager.getV_ic())){
//										//���ں�������
//										importBlackNameCount++;
//										
//										villager.setV_status("b");
//									}else{
//										villager.setV_status("a");
//									}
//									
//									if(mXXNCYLBXDBAccess.insertVillager(villager)){
//										//����ɹ�
//										importOKCount++;
//									}else{
//										//����ʧ��
//										importErrorCount++;
//									}
//									
//									progressBar.setString("���ȣ�"+currentCount+"/"+totalCount+" �ɹ���"+importOKCount+" ʧ�ܣ�"+importErrorCount+" �Ѵ��ڣ�"+importHasExistCount+" ��������"+importBlackNameCount);
//									progressBar.setValue(currentCount); // ����ֵ
//								}
//							}
//						}
//						
////						sql = "select top 4 * from [Sheet1$]";
////						
////						if (commonsql.query(sql)) {
////							
////							 ResultSetMetaData   metaDate   =   commonsql.getResultLists().getMetaData();     
////							 int   number   =   metaDate.getColumnCount();     
////							 String[]   column   =   new   String[number];     
////							 for   (int   j   =   0;   j   <   column.length;   j++)   {     
////								 column[j]   =   metaDate.getColumnName(j   +   1);     
////								 System.out.println("name "+j+":"+column[j]);
////							 }
////							
////							while (commonsql.nextrecord()) {
////								System.out.println("+++::"+commonsql.getString(1));
////							}
////							System.out.println("sql");
////						}
//////						System.out.println(sql);
//						
//					}else {
//		
//					}
//					
//					System.out.println("size==========="+totalCount+""+(5/4)+":"+(6/6)+":"+(7%5));
//				}
//				
//				commonsql.close();
//				//==========================������  end
				
			} catch (DBException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			button.setEnabled(true); // ��ť����
			
			
			
			
		}
	}

}
