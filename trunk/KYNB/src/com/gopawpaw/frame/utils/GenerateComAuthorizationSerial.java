/**
 * 
 */
package com.gopawpaw.frame.utils;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BoxLayout;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import com.gopawpaw.dev.common.encryption.MD5;
import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.common.BaseFrame;
import com.gopawpaw.frame.dataEntity.mfg.GppProDet;
import com.gopawpaw.frame.hibernate.p.ProDet;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJPanel;
import com.gopawpaw.javax.swing.GppJTextField;
import java.awt.BorderLayout;
import java.util.Calendar;

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
 * @version 2010-8-14
 * @author 李锦华
 * @ 生成组件授权唯一序列号工具，开发者常用
 */
public class GenerateComAuthorizationSerial extends BaseFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 951077131996001217L;
	private GppJPanel gppJPanel1;
	private GppJPanel gppJPanel2;
	private GppJButton gppJButton1;
	private GppJTextField gppJTextField1;

	/**
	 * @throws HeadlessException
	 */
	public GenerateComAuthorizationSerial() throws HeadlessException {
		initialize();
	}

	/**
	 * @param args
	 * @throws HeadlessException
	 */
	public GenerateComAuthorizationSerial(String[] args)
			throws HeadlessException {
		super(args);
		initialize();
	}

	/**
	 * @param gc
	 */
	public GenerateComAuthorizationSerial(GraphicsConfiguration gc) {
		super(gc);
		initialize();
	}

	/**
	 * @param title
	 * @throws HeadlessException
	 */
	public GenerateComAuthorizationSerial(String title)
			throws HeadlessException {
		super(title);
		initialize();
	}

	/**
	 * @param title
	 * @param gc
	 */
	public GenerateComAuthorizationSerial(String title, GraphicsConfiguration gc) {
		super(title, gc);
		initialize();
		
		// TODO Auto-generated constructor stub
	}
	private void initialize() {
		{
			gppJPanel1 = new GppJPanel();
			gppJPanel1.setLayout(new BorderLayout());
//			gppJPanel1.setLayout(new BoxLayout(gppJPanel1, BoxLayout.Y_AXIS));
			getContentPane().add(gppJPanel1, BorderLayout.CENTER);
			{
				gppJPanel2 = new GppJPanel();
				gppJPanel2.setLayout(new BoxLayout(gppJPanel2, BoxLayout.X_AXIS));
				gppJPanel1.add(gppJPanel2, BorderLayout.NORTH);
				gppJPanel2.setPreferredSize(new java.awt.Dimension(727, 39));
				{
					gppJTextField1 = new GppJTextField();
					gppJPanel2.add(gppJTextField1);
					gppJTextField1.setText("");
					gppJTextField1.setText(generateAction(String.valueOf(Calendar.getInstance().getTimeInMillis())));
					
				}
				{
					gppJButton1 = new GppJButton();
					gppJPanel2.add(gppJButton1);
					gppJButton1.setText("获取序列号");
					gppJButton1.addMouseListener(new MouseAdapter() {
						public void mouseClicked(MouseEvent evt) {			
							gppJTextField1.setText(generateAction(String.valueOf(Calendar.getInstance().getTimeInMillis())));
						
						}
					});
				}
			}
		}

	}
	private String generateAction(String str){
		
		String retstr = null;
		MD5 m = new MD5();
		retstr = m.getMD5ofStr(str);
		ProDet prodet = new ProDet();
		prodet.setProComSerial(retstr);
		GppProDet gpd = new GppProDet(prodet);
		if(gpd.isHaveProDet()){
			retstr = generateComSerial();
		}
		return retstr;
	}
	/**
	 * 生成唯一组件序列号
	 */
	private String generateComSerial( ){
		String retstr = "";
		String tempstr = String.valueOf(Calendar.getInstance().getTimeInMillis());
		MD5 m = new MD5();
		String md5str = m.getMD5ofStr(tempstr);
		
		ProDet prodet = new ProDet();
		prodet.setProComSerial(md5str);
		GppProDet gpd = new GppProDet(prodet);
		if(gpd.isHaveProDet()){
			retstr = generateComSerial();
		}else{
			retstr = md5str;
		}
		return retstr;
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
				GenerateComAuthorizationSerial thisClass = new GenerateComAuthorizationSerial();
				thisClass.setSize(400, 70);
				thisClass.setLocation(400, 200);
				thisClass.setTitle("唯一组件序列号生成器");
				thisClass
						.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				thisClass.setVisible(true);

			}
		});
	}

}
