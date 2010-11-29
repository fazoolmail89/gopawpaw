/**
 * 
 */
package com.gopawpaw.erp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;

/**
 * @version 2010-6-3
 * @author 李锦华
 * @图形界面显示效果接口
 */
public interface GUIclient {
	
	/**
	 * 按钮导航
	 */
	public final static int NavShowType_Button = 1;
	
	/**
	 * 树形导航
	 */
	public final static int NavShowType_Tree = 2;
	
	/**
	 * 获取导航显示类型
	 */
	public int getNavShowType();
	
	/**
	 * 获取功能列表字体
	 */
	public Font getFontOfFunctionList();
	
	/**
	 * 获取功能列表背景
	 */
	public Color getBackgroundOfFunctionList();
	
	/**
	 * 获取主窗口显示位置
	 */
	public Point getLocationOfMainFrame();
	
	/**
	 * 获取主窗口显示大小
	 */
	public Dimension getSizeOfMainFrame();
	
	/**
	 * 获取功能分组字体
	 */
	public Font getFontOfFunctionGruop();
	
	/**
	 * 获取功能分组背景
	 */
	public Color getBackgroundOfFunctionGruop();
	
	/**
	 * 获取功能导航树字体
	 */
	public Font getFontOfFunctionTreeNav();
	
	/**
	 * 获取功能导航背景
	 */
	public Color getBackgroundOfFunctionNav();
	
	/**
	 * 获取功能导航树背景
	 */
	public Color getBackgroundOfFunctionTreeNav();
	
}
