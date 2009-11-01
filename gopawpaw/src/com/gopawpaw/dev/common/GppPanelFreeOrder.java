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
 * @author 李锦华
 *         <p>
 *         通用的自由顺序面板，可对添加的控件按行（列）增加，并可设置列（行）控件最大个数。如：设置按行增加，
 *         每行最多5个控件，则在第一行放满5个控件后，第6个控件自动跳到第一行第一个位置，以此类推。
 *         </p>
 */
public class GppPanelFreeOrder {

	private JPanel jPanel = null; // @jve:decl-index=0:visual-constraint="173,40"

	/**
	 * 按X抽（行）顺序增加控件，达到设定的控件数量后，自动转到下一行。
	 */
	public final static int X_AXIS = 0;

	/**
	 * 按Y抽（列）顺序增加控件，达到设定的控件数量后，自动转到下一列。
	 */
	public final static int Y_AXIS = 1;

	/**
	 * 行或列最大控件数量
	 */
	private int maxnumbers = 1;

	/**
	 * 当前控件数量
	 */
	private int nownumbers = 0;

	/**
	 * 按行或列增加
	 */
	private int axis = X_AXIS;

	private Vector<JPanel> veJPanel = new Vector<JPanel>(); // @jve:decl-index=0:

	/**
	 * 设置控件左右或上下居中对齐
	 */
	public final static int CENTER = 0;

	/**
	 * 设置控件左对齐
	 */
	public final static int LEFT = -1;

	/**
	 * 设置控件右对齐
	 */
	public final static int RIGHT = 1;

	/**
	 * 设置控件上对齐
	 */
	public final static int TOP = -1;

	/**
	 * 设置控件下对齐
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
	 * 默认构造方法：按行增加、每行最大控件数为1
	 */
	public GppPanelFreeOrder() {
	}

	/**
	 * 
	 * @param axis
	 *            按行（X_AXIS）/列（Y_AXIS）增加
	 * @param maxnumbers
	 *            行/列 最大数量
	 */
	public GppPanelFreeOrder(int axis, int maxnumbers) {
		this.axis = axis;
		this.maxnumbers = maxnumbers;
	}

	/**
	 * 往面板添加控件
	 * 
	 * @param comp
	 *            控件
	 */
	public void add(Component comp) {
		nownumbers++;

		if (maxnumbers <= 0)
			return;

		/**
		 * 只有一行或列
		 */
		if (maxnumbers == 1) {
			getJPanel().add(comp);
			return;
		}

		/**
		 * 另起一行或列
		 */
		if ((nownumbers % maxnumbers) == 1) {
			JPanel tempJPanel = new JPanel();

			/**
			 * 设置按行或列排序
			 */
			if (this.axis == Y_AXIS) {
				tempJPanel
						.setLayout(new BoxLayout(tempJPanel, BoxLayout.Y_AXIS));
			} else {
				tempJPanel
						.setLayout(new BoxLayout(tempJPanel, BoxLayout.X_AXIS));
			}

			/**
			 * 设置行中先添左边或右边
			 */
			if (this.alignmentX == LEFT) {
				tempJPanel.setAlignmentX(FlowLayout.LEFT);
			} else if (this.alignmentX == RIGHT) {
				tempJPanel.setAlignmentX(FlowLayout.RIGHT);
			} else {
				// tempJPanel.setAlignmentX(FlowLayout.CENTER);
			}

			/**
			 * 设置列中先添上或下
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
	 * 往面板添加控件
	 * 
	 * @param comp
	 *            控件
	 * @param prepn
	 *            在第N个控件后插入
	 */
	public void add(Component comp, int prepn) {

	}

	/**
	 * 获取面板
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
