/**     
* @{#} LayoutUtil.java Create on 2012-10-1 ÉÏÎç9:16:30     
*     
* Copyright (c) 2012 by Â¬Ïòç÷.     
*/   

package com.gopawpaw.kynb.module.print2.usermng;

import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.gopawpaw.kynb.module.print2.MyStyle;

/**     
 * @author Â¬Ïòç÷ luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class LayoutUtil {
	public static JPanel getLayoutPanel(JLabel lbl, Component input) {
		JPanel layoutPanel = new JPanel();
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		layoutPanel.add(lbl);
		layoutPanel.add(input);
		return layoutPanel;
	}
	
	public static JPanel getLayoutPanelDefDim(JLabel lbl, Component input) {
		JPanel layoutPanel = new JPanel();
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setPreferredSize(MyStyle.LBL_DIM_W50);
		input.setPreferredSize(MyStyle.TTF_DIM_W200);
		layoutPanel.add(lbl);
		layoutPanel.add(input);
		return layoutPanel;
	}
	
	public static JPanel getLayoutPanel(Component left, Component right) {
		JPanel layoutPanel = new JPanel();
		layoutPanel.add(left);
		layoutPanel.add(right);
		return layoutPanel;
	}
}
