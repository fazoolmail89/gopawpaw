/**
 * 
 */
package com.gopawpaw.fileencrypt;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;

/**
 * @version 2010-1-1
 * @author 李锦华
 */
public class Login extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JPanel jPanel = null;
	private JLabel jLabel = null;
	private JPasswordField jPasswordField = null;
	private JButton jButton = null;
	private JLabel jLabel1 = null;

	private JDialog jJDialog = null;
	private String pass = ""; // @jve:decl-index=0:

	/**
	 * @param owner
	 */
	public Login(Frame owner) {
		super(owner);
		initialize();
		jJDialog = this;
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(272, 76);
		this.setContentPane(getJContentPane());
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
			jContentPane.add(getJLabel1(), BorderLayout.NORTH);
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jLabel = new JLabel();
			jLabel.setText("密码：");
			jPanel = new JPanel();
			jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			jPanel.add(jLabel, null);
			jPanel.add(getJPasswordField(), null);
			jPanel.add(getJButton(), null);
		}
		return jPanel;
	}

	/**
	 * This method initializes jPasswordField
	 * 
	 * @return javax.swing.JPasswordField
	 */
	private JPasswordField getJPasswordField() {
		if (jPasswordField == null) {
			jPasswordField = new JPasswordField();
		}
		return jPasswordField;
	}

	/**
	 * This method initializes jButton
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setText("确认");
			jButton.addMouseListener(new java.awt.event.MouseAdapter() {
				@Override
				public void mouseClicked(java.awt.event.MouseEvent e) {
					pass = getJPasswordField().getText();
					if(pass.isEmpty()){
						JOptionPane.showMessageDialog(null, "密码不能为空！", "错误",
								JOptionPane.ERROR_MESSAGE);
						return;
					}
					jJDialog.setVisible(false);
				}
			});

		}
		return jButton;
	}

	/**
	 * This method initializes jLabel1
	 * 
	 * @return javax.swing.JLabel
	 */
	public JLabel getJLabel1() {
		if (jLabel1 == null) {
			jLabel1 = new JLabel();
			jLabel1.setText("请输入密码");
		}
		return jLabel1;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

} // @jve:decl-index=0:visual-constraint="10,10"
