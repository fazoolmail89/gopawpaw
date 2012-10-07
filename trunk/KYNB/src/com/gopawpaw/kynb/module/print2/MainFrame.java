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
	
	//Ϊ��ߴ�ӡ�ٶȣ��򿪴���ʱ�����ش�ӡ�࣬���Ӵ�ӡ��
	private Printer printer;
	
	private QueryPanel pnlQuery;
	private BaseDataTable spnBDT;
	private OptBtnsPanel pnlOptBtns;
	private ProgressBarPanel pnlProgressBar;
	private UserMngPanel pnlUserMng;
	
	private User loginUser;
	
	// �ļ�ѡ��ؼ�
	private static final JFileChooser fileChooser = new JFileChooser();
	
	/**
	 * Ϊ�ļ�ѡ��Ի��������ļ�������
	 */
	static {		
		// �����ļ�������
		fileChooser.setFileFilter(new ExcelFileFilter());
	}	
	
	public MainFrame() {
		//��ȡ��ӡ�����ļ�
		PrintInit.readInitFile();
		//��ʼ����ӡ��
		initPrinter();
		
		//�����ô���Σ�ʹ�ó����û���¼ϵͳ
		//-----------------------------------------------
		//UserDAO ud = new UserDAO();
		//loginUser = ud.findByUsername(User.SUPER_ADMIN);
		//-----------------------------------------------
		
		pnlQuery = new QueryPanel(this);
		spnBDT = new BaseDataTable(this);
		pnlOptBtns = new OptBtnsPanel(this);
		pnlUserMng = new UserMngPanel(this);

		//�������������
		pnlProgressBar = new ProgressBarPanel();
		
		setTitle("��ӡ����");
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
	 * ִ�е���Excel�ļ�
	 * 
	 * @param file
	 */
	public void executExportExcel(File file) {
		if (file == null) return;
		//����ļ����ѱ�ռ�ã���ʾ�û��Ƿ񸲸��ļ�
		if(file.exists()) {
			int rv = JOptionPane.showConfirmDialog(MainFrame.this,
					file.getName() + "�ļ��Ѵ����Ƿ���и��ǣ�",
					"������ʾ��",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.OK_CANCEL_OPTION);	
			if(rv != 0) return;
		}
		
		ExportExcelProgress eep = new ExportExcelProgress(pnlProgressBar, file);
		eep.start();
	}
	
	/**
	 * ִ�в�ѯ���н�����
	 */
/*	public void executQuery(Map<String,Object> parames) {		
		QueryProgress query = new QueryProgress(pnlProgressBar, parames);
		query.start();
	}*/
	
	/**
	 * ����Excel�߳��࣬��ʾ������
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
			// ��ȡ�ļ�����ı������
			Object[][] excelData = spnBDT.getExportData();

			// �����ļ�
			boolean rv = PoiOperatXls.writeXls(
					excelData, 
					file.getPath(),
					super.getListener());

			Toolkit.getDefaultToolkit().beep();
			if (rv) {
				message = "�ɹ������ļ���" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "�����ļ���ʾ��",
						JOptionPane.PLAIN_MESSAGE);
			} else {
				message = "�޷������ļ���" + file.getPath();
				JOptionPane.showMessageDialog(null, message, "�����ļ���ʾ��",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * ��ѯ�����߳��࣬��ʾ������
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
	 * ��ʼ����ӡ��
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
