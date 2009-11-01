/**
 * 
 */
package com.gopawpaw.dev.common;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;

/**
 * @version 2009-10-7
 * @author �����
 *         <p>
 *         ͨ�õ�����˳����壬�ɶ���ӵĿؼ����У��У����ӣ����������У��У��ؼ����������磺���ð������ӣ�
 *         ÿ�����5���ؼ������ڵ�һ�з���5���ؼ��󣬵�6���ؼ��Զ�������һ�е�һ��λ�ã��Դ����ơ�
 *         </p>
 */
public class GppPanelFreeOrder {

	private JPanel jPanel = null; // @jve:decl-index=0:visual-constraint="173,40"

	/**
	 * ��X�飨�У�˳�����ӿؼ����ﵽ�趨�Ŀؼ��������Զ�ת����һ�С�
	 */
	public final static int X_AXIS = 0;

	/**
	 * ��Y�飨�У�˳�����ӿؼ����ﵽ�趨�Ŀؼ��������Զ�ת����һ�С�
	 */
	public final static int Y_AXIS = 1;

	/**
	 * �л������ؼ�����
	 */
	private int maxnumbers = 1;

	/**
	 * ��ǰ�ؼ�����
	 */
	private int nownumbers = 0;

	/**
	 * ���л�������
	 */
	private int axis = X_AXIS;

	private Vector<JPanel> veJPanel = new Vector<JPanel>(); // @jve:decl-index=0:

	/**
	 * ���ÿؼ����һ����¾��ж���
	 */
	public final static int CENTER = 0;

	/**
	 * ���ÿؼ������
	 */
	public final static int LEFT = -1;

	/**
	 * ���ÿؼ��Ҷ���
	 */
	public final static int RIGHT = 1;

	/**
	 * ���ÿؼ��϶���
	 */
	public final static int TOP = -1;

	/**
	 * ���ÿؼ��¶���
	 */
	public final static int BOTTOM = 1;

	private int alignmentX = CENTER;

	private int alignmentY = CENTER;

	/**
	 * @param alignmentX
	 *            the alignmentX to set
	 */
	public void setAlignmentX(int alignmentX) {
		this.alignmentX = alignmentX;
	}

	/**
	 * @param alignmentY
	 *            the alignmentY to set
	 */
	public void setAlignmentY(int alignmentY) {
		this.alignmentY = alignmentY;
	}

	/**
	 * Ĭ�Ϲ��췽�����������ӡ�ÿ�����ؼ���Ϊ1
	 */
	public GppPanelFreeOrder() {
	}

	/**
	 * 
	 * @param axis
	 *            ���У�X_AXIS��/�У�Y_AXIS������
	 * @param maxnumbers
	 *            ��/�� �������
	 */
	public GppPanelFreeOrder(int axis, int maxnumbers) {
		this.axis = axis;
		this.maxnumbers = maxnumbers;
	}

	/**
	 * �������ӿؼ�
	 * 
	 * @param comp
	 *            �ؼ�
	 */
	public void add(Component comp) {
		nownumbers++;

		if (maxnumbers <= 0)
			return;

		/**
		 * ֻ��һ�л���
		 */
		if (maxnumbers == 1) {
			getJPanel().add(comp);
			return;
		}

		/**
		 * ����һ�л���
		 */
		if ((nownumbers % maxnumbers) == 1) {
			JPanel tempJPanel = new JPanel();

			/**
			 * ���ð��л�������
			 */
			if (this.axis == Y_AXIS) {
				tempJPanel
						.setLayout(new BoxLayout(tempJPanel, BoxLayout.Y_AXIS));
			} else {
				tempJPanel
						.setLayout(new BoxLayout(tempJPanel, BoxLayout.X_AXIS));
			}

			/**
			 * ��������������߻��ұ�
			 */
			if (this.alignmentX == LEFT) {
				tempJPanel.setAlignmentX(FlowLayout.LEFT);
			} else if (this.alignmentX == RIGHT) {
				tempJPanel.setAlignmentX(FlowLayout.RIGHT);
			} else {
				// tempJPanel.setAlignmentX(FlowLayout.CENTER);
			}

			/**
			 * �������������ϻ���
			 */
			if (this.alignmentY == TOP) {
				tempJPanel.setAlignmentY(FlowLayout.LEFT);
			} else if (this.alignmentY == BOTTOM) {
				tempJPanel.setAlignmentY(FlowLayout.RIGHT);
			} else {
				// tempJPanel.setAlignmentY(FlowLayout.CENTER);
			}

			veJPanel.addElement(tempJPanel);
		}

		int iindex;
		iindex = (nownumbers - 1) / maxnumbers;

		((JPanel) veJPanel.elementAt(iindex)).add(comp);

		getJPanel().add((JPanel) veJPanel.elementAt(iindex));

	}

	/**
	 * �������ӿؼ�
	 * 
	 * @param comp
	 *            �ؼ�
	 * @param prepn
	 *            �ڵ�N���ؼ������
	 */
	public void add(Component comp, int prepn) {

	}

	/**
	 * ��ȡ���
	 */
	public JPanel getGppPanel() {
		return this.jPanel;
	}

	/**
	 * This method initializes jPanel
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();

			if (this.axis == Y_AXIS) {
				jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
			} else {
				jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
			}

			jPanel.setSize(new Dimension(280, 81));
		}
		return jPanel;
	}

}
