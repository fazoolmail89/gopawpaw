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
import java.io.File;
import java.sql.Connection;
import java.sql.Statement;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import com.gopawpaw.frame.widget.GJButton;
import com.gopawpaw.frame.widget.GJDialog;
import com.gopawpaw.frame.widget.GJTable;
import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;
import com.gopawpaw.kynb.common.ExcelImportListener;
import com.gopawpaw.kynb.common.PoiOperatXls2;
import com.gopawpaw.kynb.common.ProgressImportExcel;
import com.gopawpaw.kynb.db.XXNCYLBXDBAccess;

/**
 * @version 2011-11-18
 * @author Jason
 */
public class DataImportDialog2 extends GJDialog implements ActionListener {

	public final static int YES_OPTION = JOptionPane.YES_OPTION;

	public final static int NO_OPTION = JOptionPane.NO_OPTION;

	private String title;

	private Thorp thorp;

	private JPanel jPanelContent;

	private JButton jButtonConfirm;

	private JButton jButtonCancel;

	private JTextField mJTextExcelPath;

	private JProgressBar progressBar = new JProgressBar();

	private JScrollPane jScrollPane = new JScrollPane();
	
	private Object[][] mTableData;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param owner
	 */
	public DataImportDialog2(Frame owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public DataImportDialog2(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public DataImportDialog2(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public DataImportDialog2(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public DataImportDialog2(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public DataImportDialog2(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public DataImportDialog2(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public DataImportDialog2(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public DataImportDialog2(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public DataImportDialog2(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public DataImportDialog2(Window owner, String title,
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
	public DataImportDialog2(Frame owner, String title, boolean modal,
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
	public DataImportDialog2(Dialog owner, String title, boolean modal,
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
	public DataImportDialog2(Window owner, String title,
			ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				DataImportDialog2.this.setVisible(false);
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
			// 上边距，左边距，下边距，右边距
			// jPanelContent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,
			// 5));

			JPanel jPanelBottom = new JPanel();
			jPanelBottom.setLayout(new GridLayout());
			jButtonConfirm = new GJButton("确认") {

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				public boolean actionEnter() {

					actionFinish(YES_OPTION, thorp);
					return true;
				};
			};
			jButtonCancel = new GJButton("取消") {

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

			// 上边距，左边距，下边距，右边距
			// jLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10,
			// 20));
			JPanel jPanelV = new JPanel();
//			JPanel jPanelC = new JPanel();
			jPanelV.setLayout(new BoxLayout(jPanelV, BoxLayout.Y_AXIS));

			// 村名
//			if (thorp != null) {
//				JLabel jLabel2 = new JLabel("村名：" + thorp.getT_name());
//				jPanelC.add(jLabel2, null);
//			}

			// 选择文件
			JPanel jPanelC2 = new JPanel();
			jPanelC2.setLayout(new BoxLayout(jPanelC2, BoxLayout.X_AXIS));
			jPanelC2.setAlignmentX(0);

			JButton button = new JButton("选择导入文件");
			button.addMouseListener(new java.awt.event.MouseAdapter() {
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFileChooser jFileChooser = new JFileChooser();

					jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
					jFileChooser.showOpenDialog(null);

					if (jFileChooser.getSelectedFile() != null) {
						String ph = jFileChooser.getSelectedFile()
								.getAbsolutePath();
						System.out.println(ph);
						importExcel(ph);
						mJTextExcelPath.setText(ph);
					}

				}
			});

			mJTextExcelPath = new JTextField();
			mJTextExcelPath.setPreferredSize(new Dimension(600, 400));

			jPanelC2.add(mJTextExcelPath);
			jPanelC2.add(button);

			progressBar.setStringPainted(true); // 显示提示信息
			progressBar.setIndeterminate(false); // 确定进度的进度条

//			jPanelV.add(jPanelC);
			jPanelV.add(jPanelC2);
			jPanelV.add(progressBar);
			jPanelV.setPreferredSize(new Dimension(400,40));
			jPanelContent.add(jPanelV, BorderLayout.NORTH);
			jPanelContent.add(jPanelBottom, BorderLayout.SOUTH);
			
			jPanelContent.add(jScrollPane, BorderLayout.CENTER);
			
			
		}
		return jPanelContent;
	}
	
	/**
	 * 导入excle数据
	 * 
	 * @version 2012-3-28
	 * @author Jason
	 * @param
	 * @return void
	 */
	private void importExcel(String excelPath) {

		progressBar.setStringPainted(true); // 显示提示信息
		progressBar.setIndeterminate(false); // 确定进度的进度条

		//导入excel进度
		ProgressImportExcel p = new ProgressImportExcel(progressBar, excelPath);
		p.setImportListener(new ExcelImportListener() {

			@Override
			public void onImprotFinish(Object[] title, Object[][] data,
					GJTable table) {
				// TODO Auto-generated method stub
				mTableData = data;
				jScrollPane.setViewportView(table);
				table.updateUI();
			}
		});

		p.start();
	}
	@Override
	public void setVisible(boolean arg0) {
		super.setTitle(this.title);
		this.setSize(600, 400);

		this.setLocation(this.getOwner().getLocation().x
				+ this.getOwner().getSize().width / 4, this.getOwner()
				.getLocation().y + this.getOwner().getSize().height / 5);

		this.add(getJPanelContent());

		super.setVisible(arg0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (jButtonConfirm.equals(arg0.getSource())) {
			
			if(mJTextExcelPath.getText() != null && !mJTextExcelPath.getText().equals("")){
				new Progress(progressBar, jButtonConfirm).start(); // 自定义类progress
			}else{
				//提示选择文件
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

	class Progress extends Thread {// 自定义类progress
		
		private JProgressBar progressBar;
		private JButton button;
		private XXNCYLBXDBAccess mXXNCYLBXDBAccess;
		private String excelPath;
		public Progress(JProgressBar progressBar, JButton button) {
			this.progressBar = progressBar;
			this.button = button;
			
			this.excelPath = mJTextExcelPath.getText();
			mXXNCYLBXDBAccess = new XXNCYLBXDBAccess();
			
		}

		public void run() {
			try {
				button.setEnabled(false);

				//===================================方案二 begin
				Object[][] arr = PoiOperatXls2.readXlsRTA(new File(excelPath));
				if(arr != null && arr.length>0){
					
					int size = arr.length;
					int importOKCount = 0;
					int importErrorCount = 0;
					int importHasExistCount = 0;
					int importBlackNameCount = 0;
					progressBar.setMaximum(size);
					
					Villager villager = new Villager();
					XXNCYLBXDBAccess xxAccess = new XXNCYLBXDBAccess();
					Connection conn = xxAccess.getSqlCon();
					
					conn.setAutoCommit(false);
					
					for(int i=1;i<size;i++){
						//第一行是头部，需要过滤掉
						villager.setT_id(0);
						villager.setV_name((String)arr[i][0]);
						villager.setV_sex((String)arr[i][1]);
						villager.setV_nation((String)arr[i][2]);
						villager.setV_birthday((String)arr[i][3]);
						villager.setV_ic((String)arr[i][4]);
						villager.setV_address_live((String)arr[i][5]);
						villager.setV_householder_name((String)arr[i][6]);

						
						
						if(mXXNCYLBXDBAccess.isExistVillager(villager.getV_ic())){
							//已经存在
							importHasExistCount++;
							progressBar.setString("进度："+(i)+"/"+(size-1)+" 成功："+importOKCount+" 失败："+importErrorCount+" 已存在："+importHasExistCount+" 黑名单："+importBlackNameCount);
							progressBar.setValue(i+1); // 进度值
							continue;
						}
						
						if(mXXNCYLBXDBAccess.isExistVillagerError(villager.getV_ic())){
							//属于黑名单中
							importBlackNameCount++;
							
							villager.setV_status("b");
						}else{
							villager.setV_status("a");
						}
						
						
						String tsql=XXNCYLBXDBAccess.getInsertVillagerSQL(villager);
						Statement psta = conn.prepareStatement(tsql);
						
						psta.executeUpdate(tsql);
						//没1000条提交一次，可不用
						if(i%1000 == 0) conn.commit();
						
						
						if(mXXNCYLBXDBAccess.insertVillager(villager)){
							//导入成功
							importOKCount++;
						}else{
							//导入失败
							importErrorCount++;
						}
						
						progressBar.setString("进度："+(i+1)+"/"+size+" 成功："+importOKCount+" 失败："+importErrorCount+" 已存在："+importHasExistCount+" 黑名单："+importBlackNameCount);
						progressBar.setValue(i+1); // 进度值
					}

					conn.commit();
					conn.close();
					progressBar.setIndeterminate(false);
				}
				//==========================方案二 end
				

				
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			button.setEnabled(true); // 按钮可用
			
			
			
			
		}
		
		
	}

}
