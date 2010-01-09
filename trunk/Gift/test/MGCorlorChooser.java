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
		// TODO �Զ����ɷ������
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
		   //��ɫѡ��Ի���Ĳ������� 
		   //��һ��ʾ�丸�ؼ����Ƕ����ؼ��������ࣩ����һ�����ؼ�
		   //��ʾʱ���Ը��ؼ���Ϊ������ʾ���ζ��ǶԻ���ı���
		   //�����ǣ�ȡ��ѡ��ʱ���ص�Ĭ����ɫ����Ĭ����ɫȡ��
		   //���������ı���ɫ��
		   Color rsltColor =JColorChooser.showDialog(this,
		     "��ɫѡ��",
		     this.getBackground());
		   return rsltColor;
		}
}
