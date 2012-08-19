/**     
* @{#} Print.java Create on 2012-8-17 上午1:23:13     
*     
* Copyright (c) 2012 by 卢向琪.     
*/   

package com.gopawpaw.kynb.module.print2;
/** 
 * 打印数据原子    
 * @author 卢向琪 luxiangqi521@gmail.com    
 * @version 1.0     
 */

public class PrintAtom {
	private String value;//打印值
	private int x;//X坐标
	private int y;//Y坐标
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
