/**
 * 
 */
package com.gopawpaw.frame.test;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.MainFrame;
import com.gopawpaw.frame.common.BaseFrame;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJPanel;
import com.gopawpaw.javax.swing.GppJTable;
import com.gopawpaw.javax.swing.GppJTextArea;
import com.gopawpaw.javax.swing.GppJTextField;
import java.awt.BorderLayout;

/**
 * This code was edited or generated using CloudGarden's Jigloo
 * SWT/Swing GUI Builder, which is free for non-commercial
 * use. If Jigloo is being used commercially (ie, by a corporation,
 * company or business for any purpose whatever) then you
 * should purchase a license for each developer using Jigloo.
 * Please visit www.cloudgarden.com for details.
 * Use of Jigloo implies acceptance of these licensing terms.
 * A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED FOR
 * THIS MACHINE, SO JIGLOO OR THIS CODE CANNOT BE USED
 * LEGALLY FOR ANY CORPORATE OR COMMERCIAL PURPOSE.
 */
/**
 * @version 2010-6-20
 * @author Àî½õ»ª
 * 
 */
public class TestBaseFrame extends BaseFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 509130823016425691L;
	private GppJPanel gppJPanel1;
	private GppJTextField gppJTextField2;
	private GppJButton gppJButton1;
	private GppJTextField gppJTextField1;

	/**
	 * @throws HeadlessException
	 */
	public TestBaseFrame() throws HeadlessException {
		initialize();
	}

	public TestBaseFrame(String[] args) throws HeadlessException {
		super(args);
		initialize();
	}
	/**
	 * @param gc
	 */
	public TestBaseFrame(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public TestBaseFrame(String title) throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public TestBaseFrame(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();

		// TODO Auto-generated constructor stub
	}

	private void initialize() {
		{
			gppJPanel1 = new GppJPanel();
			
			gppJPanel1.setAuthorizationSerial("9203E92C480C16A0C154698AE4BBBFC1");
			getContentPane().add(gppJPanel1, BorderLayout.CENTER);
			{
				gppJButton1 = new GppJButton();
				gppJButton1.setAuthorizationSerial("DC669A17D60A3B79C3A2564B311EC908");
				gppJPanel1.add(gppJButton1);
				gppJButton1.setText("gppJButton1");
			}
			{
				gppJTextField1 = new GppJTextField();
				gppJTextField1.setAuthorizationSerial("E4C8B8948D3654AE327218D6E54ACBA7");
				gppJPanel1.add(gppJTextField1);
				gppJTextField1.setText("gppJTextField1");
				gppJTextField1.setName("wwww");
			}
			{
				gppJTextField2 = new GppJTextField();
				gppJTextField2.setAuthorizationSerial("17077D9C222DC3511AA1B0114D7E49C0");
				gppJPanel1.add(gppJTextField2);
				gppJTextField2.setText("gppJTextField2");
			}
		}
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		GlobalParameter.initialize();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				try {
					UIManager.setLookAndFeel(
					"com.jgoodies.looks.plastic.Plastic3DLookAndFeel"
					);

				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (InstantiationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalAccessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (UnsupportedLookAndFeelException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
String[] aarg = new String[2];
aarg[0] = "MD5=3233441";
aarg[1] = "MND=3.6.18";
				TestBaseFrame thisClass = new TestBaseFrame(aarg);
				thisClass.setAuthorizationSerial("983ED39D96560689AFDAEBE863AAD574");
				thisClass.setSize(1000, 400);
				thisClass
						.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				thisClass.setVisible(true);
//				System.out.println(thisClass.getSerialversionuid());

			}
		});

	}

	public GppJTextField getGppJTextField1() {
		return gppJTextField1;
	}

	

}
