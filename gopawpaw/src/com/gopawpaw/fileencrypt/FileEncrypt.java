/**
 * 
 */
package com.gopawpaw.fileencrypt;

import javax.swing.BoxLayout;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 2010-1-1
 * @author 李锦华
 */
public class FileEncrypt extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel1 = null;
	private JTextField jTextField = null;
	private JButton jButton = null;
	private JPanel jPanel1 = null;
	private JButton jButton1 = null;
	private JButton jButton2 = null;
	private JButton jButton3 = null;
	private String thisnewpath = null;  //  @jve:decl-index=0:

	private String fileEncrypt = "com.gopawpaw.fileencrypt.gpp"; // @jve:decl-index=0:

	/**
	 * @throws HeadlessException
	 */
	public FileEncrypt() throws HeadlessException {
		super();
		initialize();
	}

	/**
	 * @param arg0
	 */
	public FileEncrypt(GraphicsConfiguration arg0) {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public FileEncrypt(String arg0) throws HeadlessException {
		super(arg0);
		initialize();
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public FileEncrypt(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		initialize();
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("文件夹：");
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.add(jLabel1, null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJButton(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField
	 * 
	 * @return javax.swing.JTextField
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
		}
		return jTextField;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("浏览");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					JFileChooser jFileChooser = new JFileChooser();

					jFileChooser
							.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					jFileChooser.showOpenDialog(null);
					File f = jFileChooser.getSelectedFile();
					if(f==null){
						return;
					}
					String ph = f.getAbsolutePath();
					getJTextField().setText(ph);
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jPanel1
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
			gridBagConstraints11.gridx = 1;
			gridBagConstraints11.gridy = 0;
			GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
			gridBagConstraints1.gridx = 2;
			gridBagConstraints1.gridy = 0;
			GridBagConstraints gridBagConstraints = new GridBagConstraints();
			gridBagConstraints.gridx = 0;
			gridBagConstraints.gridy = 0;
			jPanel1 = new JPanel();
			jPanel1.setLayout(new GridBagLayout());
			jPanel1.add(getJButton1(), gridBagConstraints);
			jPanel1.add(getJButton2(), gridBagConstraints1);
			jPanel1.add(getJButton3(), gridBagConstraints11);
		}
		return jPanel1;
	}

	/**
	 * This method initializes jButton1
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setText("生成密匙");
			jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {

					String path = getJTextField().getText();
					
					if (path.isEmpty()) {
						JOptionPane.showMessageDialog(null, "请选择文件夹！", "错误",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (path.endsWith(".")) {
						path = substring(path, path.length() - 1, "");
					}

					GppFolder gf = new GppFolder(path);
					if (!gf.exists()) {
						JOptionPane.showMessageDialog(null, "请选择已存在的文件夹!",
								"OK", JOptionPane.OK_OPTION);
						return;
					}
					File tempf = new File(path + "..\\" + fileEncrypt);

					if (tempf.exists()) {
						JOptionPane.showMessageDialog(null, "该文件夹已经加密，请先解密!",
								"OK", JOptionPane.OK_OPTION);
						return;
					}
					if (generateKeyFile(path)) {
						JOptionPane.showMessageDialog(null, "生成密匙成功", "OK",
								JOptionPane.OK_OPTION);
						return;
					} else {
						JOptionPane.showMessageDialog(null, "生成密匙失败！", "错误",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jButton2
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton2() {
		if (jButton2 == null) {
			jButton2 = new JButton();
			jButton2.setText("解密");
			jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String path = getJTextField().getText();

					if (path.isEmpty()) {
						JOptionPane.showMessageDialog(null, "请选择文件夹！", "错误",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (!path.endsWith(".")) {
						path = path + ".";
					}

					File tempf = new File(path + ".\\" + fileEncrypt);

					if (!tempf.exists()) {
						JOptionPane.showMessageDialog(null, "该文件夹没有加密，您不需要解密!",
								"OK", JOptionPane.OK_OPTION);
						return;
					}
		
					path = substring(path, path.length() - 1, "");

					if (decryption(path)) {
						JOptionPane.showMessageDialog(null, "文件夹解密成功", "OK",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "文件夹解密失败！", "错误",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		}
		return jButton2;
	}

	/**
	 * This method initializes jButton3
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton3() {
		if (jButton3 == null) {
			jButton3 = new JButton();
			jButton3.setText("加密");
			jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					String path = getJTextField().getText();

					if (path.isEmpty()) {
						JOptionPane.showMessageDialog(null, "请选择文件夹！", "错误",
								JOptionPane.ERROR_MESSAGE);
						return;
					}

					if (!path.endsWith(".")) {
						path = path + ".";
					}

					GppFolder gf = new GppFolder(path);
					if (!gf.exists()) {
						JOptionPane.showMessageDialog(null, "请选择已存在的文件夹!",
								"OK", JOptionPane.OK_OPTION);
						return;
					}

					File tempf = new File(path + ".\\" + fileEncrypt);

					if (tempf.exists()) {
						JOptionPane.showMessageDialog(null, "该文件夹已经加密，请先解密!",
								"OK", JOptionPane.OK_OPTION);
						return;
					}

					File tempf0 = new File(path + "\\" + fileEncrypt);
					if (!tempf0.exists()) {
						JOptionPane.showMessageDialog(null, "请先生成密匙!", "OK",
								JOptionPane.OK_OPTION);
						return;
					}
					if (encrypt(path)) {
						JOptionPane.showMessageDialog(null, "文件夹加密成功", "OK",
								JOptionPane.OK_OPTION);
					} else {
						JOptionPane.showMessageDialog(null, "文件夹加密失败！", "错误",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			});
		}
		return jButton3;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				FileEncrypt thisClass = new FileEncrypt();
				thisClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
			}
		});
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(603, 83);
		this.setContentPane(getJContentPane());
		this.setTitle("FileEncrypt V0.5 - Author：木瓜");
		this.setLocation(350, 250);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
			jContentPane.add(getJPanel1(), BorderLayout.SOUTH);
		}
		return jContentPane;
	}

	/**
	 * 加密方法
	 * 
	 * @param path
	 * @return
	 */
	public boolean encrypt(String folderpath) {
		
		if(this.thisnewpath == null && folderpath.endsWith(".")){
			thisnewpath = folderpath + ".\\";
		}
		
		if(this.thisnewpath == null && !folderpath.endsWith(".")){
			thisnewpath = folderpath + "..\\";
		}
		
		try {
			GppFolder.copyFolder(folderpath, this.thisnewpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		GppFolder.delAllFile(folderpath);
		return true;
	}

	/**
	 * 解密方法
	 * 
	 * @param path
	 * @return
	 */
	public boolean decryption(String folderpath) {
		// FileInputStream input = new FileInputStream(fromFile);
		String newfolder = folderpath + "..\\";

		Login lg = new Login(this);
		lg.getJLabel1().setText("请输入加密字符串");
		lg.setLocation(350, 250);
		lg.setModal(true);
		lg.setVisible(true);
		String readStr = "", read;
		FileReader fileread;
		File filename = new File(newfolder + fileEncrypt);
		try {
			fileread = new FileReader(filename);
			BufferedReader bufread = new BufferedReader(fileread);
			try {
				while ((read = bufread.readLine()) != null) {
					readStr = readStr + read + "\r\n";
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				bufread.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fileread.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		if (!readStr.trim().equals(lg.getPass().trim())) {
			JOptionPane.showMessageDialog(null, "密匙不正确，请重新输入!", "OK",
					JOptionPane.OK_OPTION);
			return false;
		}

		try {
			GppFolder.copyFolder(newfolder, folderpath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		GppFolder.delAllFile(newfolder);
		File f = new File(folderpath + "\\" + fileEncrypt);
		f.delete();
		Runtime rt = Runtime.getRuntime();
		String cmdstr = "cmd.exe /C rd " + newfolder;
		try {
			rt.exec(cmdstr);
			rt.exec("cmd.exe /C attrib -h -s " + folderpath);
		} catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}
		return true;
	}

	/**
	 * 取字符串的前toCount个字符
	 * 
	 * @param str
	 *            被处理字符串
	 * @param toCount
	 *            截取长度
	 * @param more
	 *            后缀字符串
	 * @return String
	 */
	public static String substring(String str, int toCount, String more) {
		int reInt = 0;
		String reStr = "";
		if (str == null)
			return "";
		
		char[] tempChar = str.toCharArray();
		for (int kk = 0; (kk < tempChar.length && toCount > reInt); kk++,reInt++) {
			
			reStr += tempChar[kk];
			
		}
		if (toCount == reInt || (toCount == reInt - 1))
			reStr += more;
		return reStr;
	}

	/**
	 * 生成加密文件
	 * 
	 * @param folderpath
	 * @return
	 */
	private boolean generateKeyFile(String folderpath) {

		Login lg = new Login(this);
		lg.getJLabel1().setText("请输入加密字符串");
		lg.setLocation(350, 250);
		lg.setModal(true);
		lg.setVisible(true);
		if(lg.getPass().isEmpty() ){
			return false;
		}
		
		FileOutputStream output = null;
		String keypathabs = folderpath + File.separator + fileEncrypt;

		File tempfile = new File(keypathabs);
		if (tempfile.isFile()) {
			tempfile.delete();
		}
		try {
			output = new FileOutputStream(keypathabs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		byte[] b = (lg.getPass()).getBytes();
		try {
			output.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			output.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Runtime rt = Runtime.getRuntime();

		String newfolder = folderpath + "..\\";
		thisnewpath = newfolder;
		String cmdstr = "cmd.exe /C md " + newfolder;
		try {
			rt.exec(cmdstr);
			rt.exec("cmd.exe /C attrib +h +s " + keypathabs);
			rt.exec("cmd.exe /C attrib +h +s " + folderpath);
		} catch (IOException ex) {
			ex.printStackTrace();
			return false;
		}

		return true;
	}

} // @jve:decl-index=0:visual-constraint="10,10"

