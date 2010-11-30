package ptss;

import javax.swing.JPanel;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JTextPane;

public class About extends JDialog {

	private static final long serialVersionUID = 1L;
	private JPanel jContentPane = null;
	private JTextPane jTextPane = null;

	/**
	 * @param owner
	 */
	public About(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(292, 154);
		this.setContentPane(getJContentPane());
		this.setLocation(300, 200);
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
			jContentPane.add(getJTextPane(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jTextPane	
	 * 	
	 * @return javax.swing.JTextPane	
	 */
	private JTextPane getJTextPane() {
		if (jTextPane == null) {
			jTextPane = new JTextPane();
			jTextPane.setText("�������PTSS \n�汾��V0.3 Beta \n�������ڣ�2010.04.02  \n���ߣ�ľ��\n��ϵ��QQ 330988812 \nʹ�÷�Χ�������߽����ڲ�����ʹ��");
		}
		return jTextPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"
