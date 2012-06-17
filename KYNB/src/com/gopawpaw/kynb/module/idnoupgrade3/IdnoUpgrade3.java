/**
 * 
 */
package com.gopawpaw.kynb.module.idnoupgrade3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.PropertyVetoException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.log.GLog;
import com.gopawpaw.frame.utils.GppJarRunableInterface;
import com.gopawpaw.frame.widget.GJComboBox;
import com.gopawpaw.frame.widget.GJTable;
import com.gopawpaw.kynb.GlobalUI;
import com.gopawpaw.kynb.db.DBException;
import com.gopawpaw.kynb.db.ExcelDBAccess;
import com.gopawpaw.kynb.db.ExcelWriter;
import com.gopawpaw.kynb.db.ExportExcelListener;
import com.gopawpaw.kynb.db.GppCommonDBAccess;
import com.gopawpaw.kynb.module.BaseModuleFrame;
import com.gopawpaw.kynb.module.blacklist.BlackList;
import com.gopawpaw.kynb.utils.DateUtils;
import com.gopawpaw.kynb.utils.IDNumberChecker;
import com.gopawpaw.kynb.utils.StringConstant;
import com.gopawpaw.kynb.widget.GppStyleTable;

/**
 * 
 * @version 2012-4-3
 * @author Jason
 */
public class IdnoUpgrade3 extends BaseModuleFrame implements GppJarRunableInterface {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JScrollPane jScrollPane1 = null;
	private JScrollPane jScrollPane2 = null;

	private JTextArea jTextArea15 = new JTextArea();
	private JTextArea jTextArea18 = new JTextArea();
	public IdnoUpgrade3() {
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		
		if(!GlobalParameter.isAuthModuls){
			//非法授权
			JOptionPane.showConfirmDialog(null, StringConstant.isNotAuthMsg,
					"系统提示", JOptionPane.YES_NO_OPTION,
					JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		this.setSize(900, 600);
		this.setLocation(200, 100);
		this.setTitle("身份证升级验证（手工）");
		this.setContentPane(getJContentPane());
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		JPanel jContentPane = new JPanel();
		jContentPane.setLayout(new BorderLayout());

		jContentPane.add(getJPanelCenter(), BorderLayout.CENTER);
		return jContentPane;
	}

	/**
	 * 中间面板
	 * 
	 * @version 2011-11-14
	 * @author Jason
	 * @param
	 * @return JSplitPane
	 */
	private JSplitPane getJPanelCenter() {

		jScrollPane1 = new JScrollPane();
		jScrollPane2 = new JScrollPane();
		
		jScrollPane1.setViewportView(jTextArea15);
		jScrollPane2.setViewportView(jTextArea18);
		
		JPanel jPanel1 = new JPanel();
		jPanel1.setLayout(new BorderLayout());
		JPanel jPanel11 = new JPanel();
		jPanel11.setLayout(new BoxLayout(jPanel11, BoxLayout.X_AXIS));
		jPanel11.add(new JLabel("请在下面输入15位身份证号码"));
		jPanel11.add(getJButtonActionTo18());
		
		jPanel1.add(jScrollPane1, BorderLayout.CENTER);
		jPanel1.add(jPanel11, BorderLayout.NORTH);

		JPanel jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		JPanel jPanel21 = new JPanel();
		jPanel21.setLayout(new BoxLayout(jPanel21, BoxLayout.X_AXIS));
		jPanel21.add(getJButtonActionTo15());
		jPanel21.add(new JLabel("请在下面输入18位身份证号码"));
		jPanel2.add(jScrollPane2, BorderLayout.CENTER);
		jPanel2.add(jPanel21, BorderLayout.NORTH);


		JSplitPane jSplitPaneCenter = new JSplitPane(
				JSplitPane.HORIZONTAL_SPLIT, jPanel1, jPanel2);
		jSplitPaneCenter.setDividerLocation(450);

		return jSplitPaneCenter;
	}

	private JButton getJButtonActionTo18() {

		final JButton jButton = new JButton();
		jButton.setText("将15位身份证转换为18位==>");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {

				String text = jTextArea15.getText();
				if(text == null || "".equals(text.trim())){
					// 导出失败
					String tempMSG = "请输入15位身份证号码，一行一个身份证号!";
					//声音提示
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String[] s = text.split("\n");
				String[] id18 = actionTo18(s);
				
				StringBuffer sb = new StringBuffer();
				int size = id18.length;
				for(int i=0;i<size;i++){
					sb.append(id18[i]);
					sb.append("\n");
				}
				
				jTextArea18.setText(sb.toString());
			}
		});
		return jButton;
	}

	
	private JButton getJButtonActionTo15() {

		JButton jButton = new JButton();
		jButton.setText("<==将18位身份证转换为15位");
		jButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent e) {

				String text = jTextArea18.getText();
				if(text == null || "".equals(text.trim())){
					// 导出失败
					String tempMSG = "请输入18位身份证号码，一行一个身份证号!";
					//声音提示
					Toolkit.getDefaultToolkit().beep();
					JOptionPane.showConfirmDialog(null, tempMSG, "系统提示",
							JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
					return;
				}
				
				String[] s = text.split("\n");
				String[] id15 = actionTo15(s);
				
				StringBuffer sb = new StringBuffer();
				int size = id15.length;
				for(int i=0;i<size;i++){
					sb.append(id15[i]);
					sb.append("\n");
				}
				
				jTextArea15.setText(sb.toString());
			}
		});
		return jButton;
	}

	/**
	 * 将18位身份证转换为15位身份证
	 * @version 2012-4-3
	 * @author Jason
	 * @param
	 * @return String[]
	 */
	private String[] actionTo15(String[] array18){
		if(array18 == null){
			return null;
		}
		
		int size = array18.length;
		
		for(int i=0;i<size;i++){
			String temp = array18[i];
			if(temp != null && temp.endsWith("x")){
				temp = temp.subSequence(0, temp.length()-1) + "X";
				array18[i] = temp;
			}
			
			array18[i] = IDNumberChecker.SwitchIDCard18To15(array18[i]);
		}
		
		return array18;
	}


	/**
	 * 将15位身份证转换为18位身份证
	 * @version 2012-4-3
	 * @author Jason
	 * @param
	 * @return String[]
	 */
	private String[] actionTo18(String[] array15){
		if(array15 == null){
			return null;
		}
		
		int size = array15.length;
		
		for(int i=0;i<size;i++){
			try {
				String temp = array15[i];
				if(temp != null && temp.endsWith("x")){
					temp = temp.subSequence(0, temp.length()-1) + "X";
					array15[i] = temp;
				}
				int check = IDNumberChecker.checkIDCard(temp);
				if(check == IDNumberChecker.IDCARD_IS_OK){
					//是正确的18位
				}else if(check == IDNumberChecker.IDCARD_IS_OK_15){
					//是正确的15位
					array15[i] = IDNumberChecker.SwitchIDCard15To18(array15[i]);
				}else{
					//是错误的身份证
					array15[i] = IDNumberChecker.getIDCardErrorInfo(check);
				}
				
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return array15;
	}
	
	@Override
	public boolean runJar(String[] args) {
		IdnoUpgrade3.main(args);
		return false;
	}

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GlobalUI.initUI();

				IdnoUpgrade3 thisClass = new IdnoUpgrade3();
				thisClass.showWithFrame();
			}
		});
	}

}
