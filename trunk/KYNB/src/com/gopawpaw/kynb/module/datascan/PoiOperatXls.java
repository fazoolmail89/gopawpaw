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
 * @���� Excel �ļ�������
 * 			��������Զ���⼰�޸�����ļ���׺������
 * @author ¬����
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
			// System.out.println("������" + childSheet.getLastRowNum());
			list = new ArrayList<String[]>();
			// System.out.println(result.length);
			for (int j = 0; j < childSheet.getLastRowNum(); j++) {
				HSSFRow row = childSheet.getRow(j);
				// System.out.println(row.getPhysicalNumberOfCells());
				// System.out.println("������" + row.getLastCellNum());
				if (null != row) {
					String[] temp = new String[row.getLastCellNum()];
					for (int k = 0; k < row.getLastCellNum(); k++) {
						HSSFCell cell = row.getCell(k);
						if (null != cell) {
							switch (cell.getCellType()) {
							case HSSFCell.CELL_TYPE_NUMERIC: // ����
								temp[k] = String.valueOf(cell
										.getNumericCellValue());
								break;
							case HSSFCell.CELL_TYPE_STRING: // �ַ���
								temp[k] = cell.getStringCellValue();
								break;
							case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
								break;
							case HSSFCell.CELL_TYPE_FORMULA: // ��ʽ
								temp[k] = cell.getCellFormula();
								break;
							case HSSFCell.CELL_TYPE_BLANK: // ��ֵ
								temp[k] = " ";
								break;
							case HSSFCell.CELL_TYPE_ERROR: // ����
								temp[k] = " ";
								break;
							default:
								temp[k] = "δ֪����   ";
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
							case HSSFCell.CELL_TYPE_NUMERIC: // ����
								temp[j] = String.valueOf(cell
										.getNumericCellValue());
								break;
							case HSSFCell.CELL_TYPE_STRING: // �ַ���
								temp[j] = cell.getStringCellValue();
								break;
							case HSSFCell.CELL_TYPE_BOOLEAN: // Boolean
								break;
							case HSSFCell.CELL_TYPE_FORMULA: // ��ʽ
								//temp[j] = cell.getCellFormula();
								//temp[j] = cell.getStringCellValue();//ֻȡ��Ԫ����ʾֵ
							 	FormulaEvaluator evaluator = cell.getSheet().getWorkbook().getCreationHelper().createFormulaEvaluator();
							    evaluator.evaluateFormulaCell(cell);
							    CellValue cellValue = evaluator.evaluate(cell);
							    temp[j] = String.valueOf(cellValue.getNumberValue()) ;
								break;
							case HSSFCell.CELL_TYPE_BLANK: // ��ֵ
								temp[j] = " ";
								break;
							case HSSFCell.CELL_TYPE_ERROR: // ����
								temp[j] = " ";
								break;
							default:
								temp[j] = "δ֪����   ";
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
	 * ���Excel��񣬱�ͷ���鳤��Ҫ��������ݵ�����
	 * @param data ��ʵ����
	 * @param columnNamds ��ͷ
	 * @param file
	 * @return
	 */
	public static boolean writeXls(Object[][] data, Object[] columnNamds,
			File file) {
		return writeXls(data, columnNamds, file.getPath());
	}
	
	/**
	 *  ���Excel��񣬱�ͷ���鳤��Ҫ��������ݵ�����
	 * @param data ��ʵ����
	 * @param columnNamds ��ͷ
	 * @param path �ļ�·��
	 * @return
	 */
	public static boolean writeXls(Object[][] data, Object[] columnNamds,
			String path) {
		boolean result = false;
		FileOutputStream fout = null;
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;

		try {
			// �����µ�Excel������
			workbook = new HSSFWorkbook();
			// ��excel���½�һ��������������Ϊ������һ��
			sheet = workbook.createSheet("������һ��");

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
			// �½�һ�����
			fout = new FileOutputStream(autoAddXlsSuffix(path));
			// ����
			workbook.write(fout);
			fout.flush();
			// �����ر�
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
	 * ��� Excel ���
	 * @param data
	 * @param file
	 * @return
	 */
	public static boolean writeXls(Object[][] data, File file) {
		return writeXls(data, file.getPath());
	}
	
	/**
	 * ��� Excel ���
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
			// �����µ�Excel������
			workbook = new HSSFWorkbook();
			// ��excel���½�һ��������������Ϊ������һ��
			sheet = workbook.createSheet("������һ��");

			for (int i = 0; i < data.length; i++) {
				HSSFRow row = sheet.createRow(i);
				Object[] temp = data[i];
				for (int j = 0; j < temp.length; j++) {
					HSSFCell cell = row.createCell(j);
					cell.setCellValue((String) data[i][j]);
				}
			}
			// �½�һ�����
			fout = new FileOutputStream(autoAddXlsSuffix(path));
			// ����
			workbook.write(fout);
			fout.flush();
			// �����ر�
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
	 * У���ļ���׺���Ƿ�Ϊ��.xls�������Դ�Сд��
	 * @param path �ļ�·��
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
	 * �����ǡ�.xls����׺���ļ����Զ���ӡ�.xls����׺(���Դ�Сд)
	 * @param path �ļ�·��
	 * @return 
	 */
	public static String autoAddXlsSuffix(String path) {
		if(!checkSuffix(path))
			path = path + ".xls";
		return path;
	}
	
	/**
	 * ����ļ��Ƿ���ȷ
	 * @param xlsFile
	 * @return
	 * 0����ȷ��
	 * 1������xls�ļ���
	 * 2���������޷���ȡ�ļ���
	 * 3���ļ���ʽ����
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
		
		System.out.println("��������" + list.size());
	}*/
}
