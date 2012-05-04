package com.gopawpaw.kynb.common;

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

import com.gopawpaw.kynb.module.datascan.FormetUtil;

public class PoiOperatXls2 {
	public static void main(String[] args) {
		File file = new File("C:\\Documents and Settings\\Administrator\\My Documents\\�������ݽ��\\����֤������������֤����.xls");
		List<Map<Integer, String>> list = readExcelRLM(file);
		System.out.println(FormetUtil.formetFileSize(file.length()));
		
		 for(Map m : list) { System.out.println(m.toString()); }
		
		System.out.println("��������" + list.size());
		/*
		 * for(String[] s:tempList) { for(int i = 0; i < s.length; i++) {
		 * System.out.print(s[i] + "\t"); } System.out.println(); }
		 */
	}

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
		
		return readXlsRTA(xlsFile,null);
	}
	
	
	public static Object[][] readXlsRTA(File xlsFile,ReadXlsListener readXlsListener) {
		if (xlsFile == null)
			return null;
		Object[][] data = null;
		try {
			FileInputStream is = new FileInputStream(xlsFile);
			HSSFWorkbook wbs = new HSSFWorkbook(is);
			//--------------------------------------------------------
			HSSFSheet childSheet = wbs.getSheetAt(0);
			int size = childSheet.getLastRowNum();
			
			//��һ��Ϊͷ�����ڶ��п�ʼ��������
			if(readXlsListener != null){
				
				data = new Object[size-1][];
			}else{
				data = new Object[size][];
			}
			
			//�Ƿ��Ѿ���Ӧ��Ԥ��ȡ
			boolean flagOnReadXlsPre = false;
			
			for (int i = 0; i < childSheet.getLastRowNum(); i++) {
				HSSFRow row = childSheet.getRow(i);
				if (null != row) {
					String[] temp = new String[row.getLastCellNum()];
					for (int j = 0; j < row.getLastCellNum(); j++) {
						HSSFCell cell = row.getCell(j);
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
						
						if(readXlsListener != null && !flagOnReadXlsPre){
							//�ص��ӿ�,��Ӧͷ����Ϣ
							readXlsListener.onReadXlsPre(size,temp);
							flagOnReadXlsPre = true;
							
							//��һ��Ϊͷ�����ڶ��п�ʼ��������
							continue;
						}
						
						
						
						if(readXlsListener != null){
							
							//
							data[i-1] = temp;
							//�ص��ӿ�
							readXlsListener.onReadXlsProgress(i);
						}else{
							//
							data[i] = temp;
						}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}
	
	

	/**
	 * д��excle
	 * @version 2012-4-15
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public static boolean writeXls(Object[][] data, Object[] columnNamds, String path,WriteXlsListener writeXlsListener) {
		boolean result = false;
		FileOutputStream fout = null;
		HSSFWorkbook workbook = null;
		HSSFSheet sheet = null;

		try {
			// �����µ�Excel������
			workbook = new HSSFWorkbook();
			// ��excel���½�һ����������������Ϊ��������һ��
			sheet = workbook.createSheet("��������һ��");
			
			int size = data.length;
			int satrtIndex = 0;
			
			if(columnNamds != null){
				//��ͷ��Ϊ�գ��򵼳���ͷ
				HSSFRow row = sheet.createRow(0);
				for (int j = 0; j < columnNamds.length; j++) {
					HSSFCell cell = row.createCell(j);
					cell.setCellValue((String) columnNamds[j]);
				}
				satrtIndex = 1;
			}
			
		
			
			for (int i = 0; i < size; i++) {
				HSSFRow row = sheet.createRow(i+satrtIndex);
				Object[] temp = data[i];
				for (int j = 0; j < temp.length; j++) {
					HSSFCell cell = row.createCell(j);
					cell.setCellValue((String) data[i][j]);
				}
				
				if(writeXlsListener != null){
					//�ص��ӿ�
					writeXlsListener.onWriteXlsProgress(i+1);
				}
			}
			// �½�һ�����
			fout = new FileOutputStream(path);
			// ����
			workbook.write(fout);
			fout.flush();
			// �����ر�
			fout.close();
			
			if(writeXlsListener != null){
				//�ص��ӿ�
				writeXlsListener.onWriteXlsFinish(size, path);
			}
			
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
	
	
	
	
}