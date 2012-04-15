package com.gopawpaw.kynb.bean;

public class JComboBoxItem {
	public int index;
	public String name;

	@Override
	public String toString() {
		return "[" + index + "]" + "[" + name + "]";
	}
}