package com.gopawpaw.kynb.common;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.filechooser.FileFilter;

public final class ExcelFileFilter extends FileFilter {

	private List<String> list = new ArrayList<String>();

	public ExcelFileFilter() {
		super();
		list.add("xls");
		list.add("xlsx");
	}
	
	@Override
	public boolean accept(File f) {
		if (f.isDirectory())
			return true;
		String name = f.getName();
		int p = name.lastIndexOf('.');
		if (p == -1)
			return false;
		String suffix = name.substring(p + 1).toLowerCase();
		return list.contains(suffix);
	}

	@Override
	public String getDescription() {
		return "Excel files";
	}

}