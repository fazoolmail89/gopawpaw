package com.gopawpaw.kynb.module.datascan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellValue;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

/**
 * @描述 Excel 文件操作类
 * 			输出函数自动检测及修改输出文件后缀名功能
 * @author 卢向琪
 * 
 */
public class PoiOperatXls {

	public static List<Map<Integer, String>> readExcelRLM(String path) {
		return readExcelRLM(new File(path));
	}

	public static List<Map<Integer, String>> readExcelRLM(File xlsFile) {
		List<Map<Integer, String>> list = null;
		List<String[]> tempList = readExcelRLA(xlsFile);
		if (tempList != null && tempList.size() > 0) {
			list = new ArrayList<Map<Integer, String>>();
			for (int i = 0; i < tempList.size(); i++) {
				Map<Integer, String> m = new HashMap<Integer, String>();
				for (int j = 0; j < tempList.get(i).length; j++) {
					m.put(j, tempList.get(i)[j]);
				}
				list.add(m);
			}
		}
		return list;
	}

	public static List<String[]> readExcelRLA(String path) {
		return readExcelRLA(new File(path));
	}
	
	public static List<String[]> readExcelRLA(File xlsFile) {
		if (xlsFile == null)
			return null;
		List<String[]> list = null;
		try {
			FileInputStream is = new FileInputStream(xlsFile);
			HSSFWorkbook wbs = new HSSFWorkbook(is);
			HSSFSheet childSheet = wbs.getSheetAt(0);
			// System.out.println(childSheet.getPhysicalNumberOfRows());
			// System.out.println("有行数" + childSheet.getLastRowNum());
			list = new ArrayList<String[]>();
			// System.out.println(result.length);
			for (int j = 0; j < childSheet.getLastRowNum(); j++) {
				HSSFRow row = childSheet.getRow(j);
				// System.out.println(row.getPhysicalNumberOfCells());
				// System.out.println("有列数" + row.getLastCellNum());
				if (null != row) {
					String[] temp = new String[row.getLastCellNum()];
					for (int k = 0; k < row.getLastCellNum(); k++) {
						HSSFCell cell = row.getCell(k);
						if (null != cell) {
							switch (cell.getCellType()) {
							case HSSFCell.CELL_TYPE_NUMERIC: // 数字
								temp[k] = String.valueOf(cell
										.getNumericCellValue());
								break;
							case HSSFCell.CELL_TYPE_STRING: // 字符串
								temp[k] = cell.getStringCellValue();
								break;
							case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
								break;
							case HSSFCell.CELL_TYPE_FORMULA: // 公式
								temp[k] = cell.getCellFormula();
								break;
							case HSSFCell.CELL_TYPE_BLANK: // 空值
								temp[k] = " ";
								break;
							case HSSFCell.CELL_TYPE_ERROR: // 故障
								temp[k] = " ";
								break;
							default:
								temp[k] = "未知类型   ";
								break;
							}
						} else {
							temp[k] = " ";
						}
						// System.out.print(temp[k] + "\t");
					}
					// System.out.println();
					list.add(temp);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Object[][] readXlsRTA(File xlsFile) {
		if (xlsFile == null)
			return null;
		Object[][] data = null;
		try {
			FileInputStream is = new FileInputStream(xlsFile);
			HSSFWorkbook wbs = new HSSFWorkbook(is);
			//--------------------------------------------------------
			HSSFSheet childSheet = wbs.getSheetAt(0);
			data = new Object[childSheet.getLastRowNum()][];
			for (int i = 0; i < childSheet.getLastRowNum(); i++) {
				HSSFRow row = childSheet.getRow(i);
				if (null != row) {
					String[] temp = new String[row.getLastCellNum()];
					for (int j = 0; j < row.getLastCellNum(); j++) {
						HSSFCell cell = row.getCell(j);
						
if(j == 0) {
	System.out.print(childSheet.getLastRowNum() + " : " + i + " : " + cell.getStringCellValue());
	System.out.println();
}
						
						if (null != cell) {
							switch (cell.getCellType()) {
							case HSSFCell.CELL_TYPE_NUMERIC: // 数字
								temp[j] = String.valueOf(cell
										.getNumericCellValue());
								break;
							case HSSFCell.CELL_TYPE_STRING: // 字符串
								temp[j] = cell.getStringCellValue();
								break;
							case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
								break;
							case HSSFCell.CELL_TYPE_FORMULA: // 公式
								//temp[j] = cell.getCellFormula();
								//temp[j] = cell.getStringCellValue();//只取单元格显示值
							 	FormulaEvaluator evaluator = cell.getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator();
							    evaluator.evaluateFormulaCell(cell);
							    CellValue cellValue = evaluator.evaluate(cell);
							    temp[j] = String.valueOf(cellValue.getNumberValue()) ;
								break;
							case HSSFCell.CELL_TYPE_BLANK: // 空值
								temp[j] = " ";
								break;
							case HSSFCell.CELL_TYPE_ERROR: // 故障
								temp[j] = " ";
								break;
							default:
								temp[j] = "未知类型   ";
								break;
							}
						} else {
							temp[j] = " ";
						}
					}
						data[i] = temp;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	/**
	 * 输出Excel表格，表头数组长度要求等于数据的列数
	 * @param data 真实数据
	 * @param columnNamds 表头
	 * @param file
	 * @return
	 */
	public static boolean writeXls(Object[][] data, Object[] columnNamds,
			File file) {
		return writeXls(data, columnNamds, file.getPath());
	}
	
	/**
	 *  输出Excel表格，表头数组长度要求等于数据的列数
	 * @param data 真实数据
	 * @param columnNamds 表头
	 * @param path 文件路径
	 * @return
	 */
	public static boolean writeXls(Object[][] data, Object[] columnNamds,
			String path) {
		boolean result = false;
		FileOutputStream fout = null;
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;

		try {
			// 创建新的Excel工作簿
			workbook = new HSSFWorkbook();
			// 在excel中新建一个工作表，起名字为工作表（一）
			sheet = workbook.createSheet("工作表（一）");

			for (int i = 0; i < data.length + 1; i++) {
				HSSFRow row = sheet.createRow(i);
				Object[] temp = data[i];
				for (int j = 0; j < temp.length; j++) {
					HSSFCell cell = row.createCell(j);
					if(i == 0) {
						cell.setCellValue((String) columnNamds[j]);
					} else {
						cell.setCellValue((String) data[i - 1][j]);
					}
				}
			}
			// 新建一输出流
			fout = new FileOutputStream(autoAddXlsSuffix(path));
			// 存盘
			workbook.write(fout);
			fout.flush();
			// 结束关闭
			fout.close();
			result = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) fout = null;
			if(workbook != null) workbook = null;
			if(sheet != null) sheet = null;
		}
		return result;
	}

	/**
	 * 输出 Excel 表格
	 * @param data
	 * @param file
	 * @return
	 */
	public static boolean writeXls(Object[][] data, File file) {
		return writeXls(data, file.getPath());
	}
	
	/**
	 * 输出 Excel 表格
	 * @param data 
	 * @param path
	 * @return
	 */
	public static boolean writeXls(Object[][] data, String path) {
		boolean result = false;
		FileOutputStream fout = null;
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;

		try {
			// 创建新的Excel工作簿
			workbook = new HSSFWorkbook();
			// 在excel中新建一个工作表，起名字为工作表（一）
			sheet = workbook.createSheet("工作表（一）");

			for (int i = 0; i < data.length; i++) {
				HSSFRow row = sheet.createRow(i);
				Object[] temp = data[i];
				for (int j = 0; j < temp.length; j++) {
					HSSFCell cell = row.createCell(j);
					cell.setCellValue((String) data[i][j]);
				}
			}
			// 新建一输出流
			fout = new FileOutputStream(autoAddXlsSuffix(path));
			// 存盘
			workbook.write(fout);
			fout.flush();
			// 结束关闭
			fout.close();
			result = true;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) fout = null;
			if(workbook != null) workbook = null;
			if(sheet != null) sheet = null;
		}
		return result;
	}
	
	/**
	 * 校验文件后缀名是否为”.xls“（忽略大小写）
	 * @param path 文件路径
	 * @return
	 */
	public static boolean checkSuffix(String path) {
		boolean result = false;
		String temp = "";
	    int index = path.lastIndexOf(".");
	    	temp = path.substring(index + 1, path.length());
	    	if("xls".equals(temp.toLowerCase())) {
	    		result = true;
	    	}
		return result;
	}
	
	/**
	 * 将不是”.xls“后缀的文件，自动添加”.xls“后缀(忽略大小写)
	 * @param path 文件路径
	 * @return 
	 */
	public static String autoAddXlsSuffix(String path) {
		if(!checkSuffix(path))
			path = path + ".xls";
		return path;
	}
	
	/**
	 * 检测文件是否正确
	 * @param xlsFile
	 * @return
	 * 0：正确；
	 * 1：不是xls文件；
	 * 2：输入流无法读取文件；
	 * 3：文件格式错误；
	 */
	public static int checkXls(File xlsFile) {
		int result = 0;
		if(!checkSuffix(xlsFile.getPath())) result = 1;
		
		FileInputStream is;
		try {
			is = new FileInputStream(xlsFile);
			HSSFWorkbook wbs = new HSSFWorkbook(is);
		} catch (FileNotFoundException e) {
			result = 2;
			e.printStackTrace();
		} catch (IOException e) {
			result = 3;
			e.printStackTrace();
		}
		return result;
		
	}
	
/*	public static void main(String[] args) {
		System.out.println(autoAddXlsSuffix("d:\\aaa.xL"));
		
		File file = new File("d:\\aaa.xls");
		List<Map<Integer, String>> list = readExcelRLM(file);
		System.out.println(FormetUtil.formetFileSize(file.length()));
		
		 for(Map m : list) { System.out.println(m.toString()); }
		
		System.out.println("总行数：" + list.size());
	}*/
}
