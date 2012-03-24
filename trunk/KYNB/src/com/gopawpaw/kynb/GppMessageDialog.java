/**
 * 
 */
package com.gopawpaw.kynb;

import java.awt.BorderLayout;
import java.awt.Dialog;
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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.gopawpaw.java.awt.GppDialog;
import com.gopawpaw.javax.swing.GppJButton;
import com.gopawpaw.javax.swing.GppJTextArea;

/**
 * 消息对话框
 * 
 * @author 李锦华
 * @since: 2011-11-16
 */
public class GppMessageDialog extends GppDialog implements ActionListener{

	public final static int YES_OPTION = JOptionPane.YES_OPTION;

	public final static int NO_OPTION = JOptionPane.NO_OPTION;

	private String message;

	private String title;

	private JPanel jPanelContent;

	private JButton jButtonConfirm;

	private JButton jButtonCancel;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param owner
	 */
	public GppMessageDialog(Frame owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public GppMessageDialog(Dialog owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 */
	public GppMessageDialog(Window owner) {
		super(owner);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modal
	 */
	public GppMessageDialog(Frame owner, boolean modal) {
		super(owner, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppMessageDialog(Frame owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppMessageDialog(Dialog owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 */
	public GppMessageDialog(Window owner, String title) {
		super(owner, title);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param modalityType
	 */
	public GppMessageDialog(Window owner, ModalityType modalityType) {
		super(owner, modalityType);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppMessageDialog(Frame owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modal
	 */
	public GppMessageDialog(Dialog owner, String title, boolean modal) {
		super(owner, title, modal);
		// TODO Auto-generated constructor stub
		init();
	}

	/**
	 * @param owner
	 * @param title
	 * @param modalityType
	 */
	public GppMessageDialog(Window owner, String title,
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
	public GppMessageDialog(Frame owner, String title, boolean modal,
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
	public GppMessageDialog(Dialog owner, String title, boolean modal,
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
	public GppMessageDialog(Window owner, String title,
			ModalityType modalityType, GraphicsConfiguration gc) {
		super(owner, title, modalityType, gc);
		init();
	}

	private void init() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				GppMessageDialog.this.setVisible(false);
			}
		});
		
		this.setModal(true);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	protected void actionFinish(int option) {
		this.setVisible(false);
		
	}

	private JPanel getJPanelContent() {
		if (jPanelContent == null) {
			jPanelContent = new JPanel();
			jPanelContent.setLayout(new BorderLayout());
			// 上边距，左边距，下边距，右边距
			jPanelContent.setBorder(BorderFactory.createEmptyBorder(5, 5, 5,
					5));

			JPanel jPanelBottom = new JPanel();
			jPanelBottom
					.setLayout(new GridLayout());
			jButtonConfirm = new GppJButton("确认"){

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public boolean actionEnter() {
					actionFinish(YES_OPTION);
					return true;
				};
			};
			jButtonCancel = new GppJButton("取消"){

				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				public boolean actionEnter() {
					actionFinish(NO_OPTION);
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

			GppJTextArea textA = new GppJTextArea(message);
			textA.setEditable(false);
			textA.setFocusable(false);
			textA.setLineWrap(true);
			//上边距，左边距，下边距，右边距
//			jLabel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
			JPanel jPanelC = new JPanel();
			GridLayout gl = new GridLayout();
			gl.setRows(1);
			gl.setColumns(1);
			jPanelC
					.setLayout(gl);
			jPanelC.add(textA, null);
			
			jPanelContent.add(jPanelC, BorderLayout.CENTER);
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
		//声音提示
		Toolkit.getDefaultToolkit().beep();
		super.setVisible(arg0);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(jButtonConfirm.equals(arg0.getSource())){
			actionFinish(YES_OPTION);
		}else if(jButtonCancel.equals(arg0.getSource())){
			actionFinish(NO_OPTION);
		}
		
	}

}
