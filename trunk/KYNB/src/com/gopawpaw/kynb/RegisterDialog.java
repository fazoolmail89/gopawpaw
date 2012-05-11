package com.gopawpaw.kynb;

import java.awt.BorderLayout;
import java.awt.Dialog;
import java.awt.Dialog.ModalityType;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.frame.widget.GJButton;
import com.gopawpaw.frame.widget.GJTextField;

public class RegisterDialog extends JDialog implements ActionListener{

	public final static int YES_OPTION = JOptionPane.YES_OPTION;

	public final static int NO_OPTION = JOptionPane.NO_OPTION;

	private String title;

	private JPanel jPanelContent;

	private JButton jButtonConfirm;

	private JButton jButtonCancel;

	private GJTextField gppJTextFieldKeyCode;
	private GJTextField gppJTextFieldRegisterCode;
	
	private String  keyCode;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param owner
	 */
	public RegisterDialog() {
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public RegisterDialog(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public RegisterDialog(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public RegisterDialog(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public RegisterDialog(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public RegisterDialog(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public RegisterDialog(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public RegisterDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public RegisterDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public RegisterDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public RegisterDialog(Window owner, String title,
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
	public RegisterDialog(Frame owner, String title, boolean modal,
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
	public RegisterDialog(Dialog owner, String title, boolean modal,
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
	public RegisterDialog(Window owner, String title,
			ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				RegisterDialog.this.setVisible(false);
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

	protected void actionFinish(int option,String regCode) {
		this.setVisible(false);
		
	}

	private JPanel getJPanelContent() {
		if (jPanelContent == null) {
			jPanelContent = new JPanel();
			jPanelContent.setLayout(new BorderLayout());
			// �ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
			jPanelContent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,
					5));

			JPanel jPanelBottom = new JPanel();
			jPanelBottom
					.setLayout(new GridLayout());
			jButtonConfirm = new GJButton("ȷ��"){

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public boolean actionEnter() {
					
					String tname = gppJTextFieldRegisterCode.getText();
					
					
					if(tname == null || "".equals(tname)){
						String tempMSG = "ע���벻��Ϊ�գ�";
						//������ʾ
						Toolkit.getDefaultToolkit().beep();
						JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
								JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
						gppJTextFieldRegisterCode.requestFocus();
						
						return true;
					}
					
					actionFinish(YES_OPTION,tname);
					return true;
				};
			};
			jButtonCancel = new GJButton("ȡ��"){

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public boolean actionEnter() {
					actionFinish(NO_OPTION,null);
					return true;
				};
			};
			
			jButtonConfirm.addActionListener(this);
			jButtonCancel.addActionListener(this);
			
			JLabel jLabel = new JLabel();
			jLabel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
			jPanelBottom.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 30));
			jPanelBottom.add(jButtonConfirm, null);
			jPanelBottom.add(jLabel, null);
			jPanelBottom.add(jButtonCancel, null);

			
			//�ϱ߾࣬��߾࣬�±߾࣬�ұ߾�
			JPanel jPanelV = new JPanel();
			JPanel jPanelC = new JPanel();
			JPanel jPanelC0 = new JPanel();
			jPanelC0
			.setLayout(new BoxLayout(jPanelC0, BoxLayout.X_AXIS));
			
			jPanelV
			.setLayout(new BoxLayout(jPanelV, BoxLayout.Y_AXIS));
			
			//������
			jPanelC0.add(new JLabel("�����룺"));
			gppJTextFieldKeyCode = new GJTextField(keyCode);
			gppJTextFieldKeyCode.setPreferredSize(new Dimension(100,20));
			
			jPanelC0.add(gppJTextFieldKeyCode);
			
			//ע����
			gppJTextFieldRegisterCode = new GJTextField();
			gppJTextFieldRegisterCode.setPreferredSize(new Dimension(100,20));
			
			jPanelC.setPreferredSize(new Dimension(100,20));
			jPanelC
					.setLayout(new BoxLayout(jPanelC, BoxLayout.X_AXIS));
			JLabel jLabel2 = new JLabel("ע���룺");
			jPanelC.add(jLabel2, null);
			jPanelC.add(gppJTextFieldRegisterCode, null);
			
			jPanelV.add(jPanelC0);
			jPanelV.add(jPanelC);
			jPanelContent.add(jPanelV, BorderLayout.NORTH);
			jPanelContent.add(jPanelBottom, BorderLayout.SOUTH);
		}
		return jPanelContent;
	}

	@Override
	public void setVisible(boolean arg0) {
		super.setTitle(this.title);
		this.setSize(300, 150);
		
		this.setLocation(this.getOwner().getLocation().x+this.getOwner().getSize().width/3,this.getOwner().getLocation().y+this.getOwner().getSize().height/4);

		this.add(getJPanelContent());

		super.setVisible(arg0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(jButtonConfirm.equals(arg0.getSource())){
			
			
			String tname = gppJTextFieldRegisterCode.getText();
			if(tname == null || "".equals(tname)){
				String tempMSG = "ע���벻��Ϊ�գ�";
				//������ʾ
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showConfirmDialog(null, tempMSG, "ϵͳ��ʾ",
						JOptionPane.OK_OPTION, JOptionPane.WARNING_MESSAGE);
				gppJTextFieldRegisterCode.requestFocus();
				
				return;
			}
			actionFinish(YES_OPTION,tname);
		}else if(jButtonCancel.equals(arg0.getSource())){
			actionFinish(NO_OPTION,null);
		}
		
	}

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}


}