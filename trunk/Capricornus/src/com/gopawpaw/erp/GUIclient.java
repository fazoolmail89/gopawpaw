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
 * @author �����
 * @ͼ�ν�����ʾЧ���ӿ�
 */
public interface GUIclient {
	
	/**
	 * ��ť����
	 */
	public final static int NavShowType_Button = 1;
	
	/**
	 * ���ε���
	 */
	public final static int NavShowType_Tree = 2;
	
	/**
	 * ��ȡ������ʾ����
	 */
	public int getNavShowType();
	
	/**
	 * ��ȡ�����б�����
	 */
	public Font getFontOfFunctionList();
	
	/**
	 * ��ȡ�����б���
	 */
	public Color getBackgroundOfFunctionList();
	
	/**
	 * ��ȡ��������ʾλ��
	 */
	public Point getLocationOfMainFrame();
	
	/**
	 * ��ȡ��������ʾ��С
	 */
	public Dimension getSizeOfMainFrame();
	
	/**
	 * ��ȡ���ܷ�������
	 */
	public Font getFontOfFunctionGruop();
	
	/**
	 * ��ȡ���ܷ��鱳��
	 */
	public Color getBackgroundOfFunctionGruop();
	
	/**
	 * ��ȡ���ܵ���������
	 */
	public Font getFontOfFunctionTreeNav();
	
	/**
	 * ��ȡ���ܵ�������
	 */
	public Color getBackgroundOfFunctionNav();
	
	/**
	 * ��ȡ���ܵ���������
	 */
	public Color getBackgroundOfFunctionTreeNav();
	
}
