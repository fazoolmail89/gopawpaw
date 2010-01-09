package test;

import javax.swing.JColorChooser;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.BorderLayout;
import javax.swing.JDialog;
import javax.swing.JTextArea;

public class MGCorlorChooser extends JDialog {

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JTextArea jTextArea = null;

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
			jTextArea.setText("ghngn");
		}
		return jTextArea;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成方法存根
		MGCorlorChooser mgcc = new MGCorlorChooser(new Frame());
		System.out.println(mgcc.chooseColor());
	}

	/**
	 * @param owner
	 */
	public MGCorlorChooser(Frame owner) {
		super(owner);
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(300, 200);
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
			jContentPane.add(getJTextArea(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	private Color chooseColor(){
		   //颜色选择对话框的参数意义 
		   //参一表示其父控件，非顶级控件（窗体类）都有一个父控件
		   //显示时会以父控件作为中心显示，参二是对话框的标题
		   //参三是，取消选择时返回的默认颜色这里默认颜色取自
		   //所传参数的背景色。
		   Color rsltColor =JColorChooser.showDialog(this,
		     "颜色选择",
		     this.getBackground());
		   return rsltColor;
		}
}
