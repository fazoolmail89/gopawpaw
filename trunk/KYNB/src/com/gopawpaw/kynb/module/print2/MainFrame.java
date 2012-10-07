package com.gopawpaw.kynb.module.print2;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.common.ExcelFileFilter;
import com.gopawpaw.kynb.common.PoiOperatXls;
import com.gopawpaw.kynb.common.Progress;
import com.gopawpaw.kynb.common.ProgressBarPanel;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.module.print2.usermng.User;
import com.gopawpaw.kynb.module.print2.usermng.UserDAO;

public class MainFrame extends BaseModuleFrame {
	private static final long serialVersionUID = -7850040792130935086L;
	
	//为提高打印速度，打开窗口时即加载打印类，连接打印机
	private Printer printer;
	
	private QueryPanel pnlQuery;
	private BaseDataTable spnBDT;
	private OptBtnsPanel pnlOptBtns;
	private ProgressBarPanel pnlProgressBar;
	private UserMngPanel pnlUserMng;
	
	private User loginUser;
	
	// 文件选择控件
	private static final JFileChooser fileChooser = new JFileChooser();
	
	/**
	 * 为文件选择对话框设置文件过滤器
	 */
	static {		
		// 设置文件过滤器
		fileChooser.setFileFilter(new ExcelFileFilter());
	}	
	
	public MainFrame() {
		//读取打印配置文件
		PrintInit.readInitFile();
		//初始化打印类
		initPrinter();
		
		//测试用代码段，使用超级用户登录系统
		//-----------------------------------------------
		//UserDAO ud = new UserDAO();
		//loginUser = ud.findByUsername(User.SUPER_ADMIN);
		//-----------------------------------------------
		
		pnlQuery = new QueryPanel(this);
		spnBDT = new BaseDataTable(this);
		pnlOptBtns = new OptBtnsPanel(this);
		pnlUserMng = new UserMngPanel(this);

		//创建进度条面板
		pnlProgressBar = new ProgressBarPanel();
		
		setTitle("打印管理");
		setLayout(new BorderLayout());
		add(pnlQuery, BorderLayout.NORTH);
		add(pnlUserMng, BorderLayout.WEST);
		add(spnBDT, BorderLayout.CENTER);
		add(pnlOptBtns, BorderLayout.EAST);
		add(pnlProgressBar, BorderLayout.SOUTH);
		
		setSize(1400, 800);
		setVisible(true);
	}

	public static void main(String[] args) {
		com.gopawpaw.frame.GlobalParameter.isAuthModuls = true;

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();
				MainFrame thisClass = new MainFrame();
				thisClass.showWithFrame();
			}
		});
	}
	
	public BaseDataTable getSpnBDT() {
		return spnBDT;
	}
	
	public QueryPanel getPnlQuery() {
		return pnlQuery;
	}
	
	public ProgressBarPanel getPnlProgressBar() {
		return pnlProgressBar;
	}
	
	
	/**
	 * 执行导出Excel文件
	 * 
	 * @param file
	 */
	public void executExportExcel(File file) {
		if (file == null) return;
		//如果文件名已被占用，提示用户是否覆盖文件
		if(file.exists()) {
			int rv = JOptionPane.showConfirmDialog(MainFrame.this,
					file.getName() + "文件已存在是否进行覆盖？",
					"操作提示！",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.OK_CANCEL_OPTION);	
			if(rv != 0) return;
		}
		
		ExportExcelProgress eep = new ExportExcelProgress(pnlProgressBar, file);
		eep.start();
	}
	
	/**
	 * 执行查询，有进度条
	 */
/*	public void executQuery(Map<String,Object> parames) {		
		QueryProgress query = new QueryProgress(pnlProgressBar, parames);
		query.start();
	}*/
	
	/**
	 * 导出Excel线程类，显示进度条
	 * 
	 * @author lxq
	 * 
	 */
	class ExportExcelProgress extends Progress {
		private String message = "";
		private File file = null;

		public ExportExcelProgress(ProgressBarPanel pbp, File file) {
			super(pbp);
			this.file = file;
		}

		public void execut() {
			// 获取文件保存的表格数据
			Object[][] excelData = spnBDT.getExportData();

			// 保存文件
			boolean rv = PoiOperatXls.writeXls(
					excelData, 
					file.getPath(),
					super.getListener());

			Toolkit.getDefaultToolkit().beep();
			if (rv) {
				message = "成功保存文件：" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "保存文件提示！",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				message = "无法保存文件：" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "保存文件提示！",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * 查询操作线程类，显示进度条
	 * 
	 * @author lxq
	 * 
	 */
/*	class QueryProgress extends Progress {
		private Map<String,Object> parames;
		public QueryProgress(ProgressBarPanel pbp, Map<String,Object> parames) {
			super(pbp);
			this.parames = parames;
		}

		public void execut() {
			//getSpnBDT().refreshTable(new PrintDataDAO().findByParams(parames, super.getListener()));
		}
	}*/

	public JFileChooser getFilechooser() {
		return fileChooser;
	}
	
	/**
	 * 初始化打印类
	 */
	private void initPrinter() {
		printer = new Printer(); 
	}
	
	public Printer getPrinter() {
		if(printer == null) printer = new Printer(); 
		return printer;
	}

	public User getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}
}
