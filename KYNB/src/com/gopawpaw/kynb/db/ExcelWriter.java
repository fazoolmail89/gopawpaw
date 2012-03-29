package com.gopawpaw.kynb.db;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

/**
 * excel写入类
 * @version 2012-3-29
 * @author Jason
 */
public class ExcelWriter {

	/**
	 * 模板
	 */
	private String excelTempPath = "DBCenter\\emptyTemp.xls";
	
	/**
	 * 目标
	 */
	private String excelTargetPath = "OutPut\\VillagerFormatTemp.xls";
	
	/**
	 * 表的标题
	 */
	private Vector<String> mTableTitle;
	
	/**
	 * 表的数据
	 */
	private Vector<Vector<String>> mTableData;
	
	/**
	 * 导出监听器
	 */
	private ExportExcelListener exportExcelListener;

	/**
	 * 
	 * @param excelTempPath
	 * @param excelTargetPath
	 */
	public ExcelWriter(String excelTempPath, String excelTargetPath) {
		super();
		this.excelTempPath = excelTempPath;
		this.excelTargetPath = excelTargetPath;
	}

	public String getExcelTempPath() {
		return excelTempPath;
	}

	public void setExcelTempPath(String excelTempPath) {
		this.excelTempPath = excelTempPath;
	}

	public String getExcelTargetPath() {
		return excelTargetPath;
	}

	public void setExcelTargetPath(String excelTargetPath) {
		this.excelTargetPath = excelTargetPath;
	}

	public Vector<String> getmTableTitle() {
		return mTableTitle;
	}

	public void setmTableTitle(Vector<String> mTableTitle) {
		this.mTableTitle = mTableTitle;
	}

	public Vector<Vector<String>> getmTableData() {
		return mTableData;
	}

	public void setmTableData(Vector<Vector<String>> mTableData) {
		this.mTableData = mTableData;
	}

	public ExportExcelListener getExportExcelListener() {
		return exportExcelListener;
	}

	public void setExportExcelListener(ExportExcelListener exportExcelListener) {
		this.exportExcelListener = exportExcelListener;
	}
	
	/**
	 * 保存Excel数据
	 * @version 2012-3-29
	 * @author Jason
	 * @param
	 * @return boolean
	 */
	public boolean actionSave(){
		
		try {
			
			//输出文件
			FileOutputStream targetFile = new FileOutputStream(new File(excelTargetPath));
			
			
			//模板文件
			Workbook mWorkbook = Workbook.getWorkbook(new File(excelTempPath));
			
			WritableWorkbook wwb = Workbook.createWorkbook(targetFile, mWorkbook);
			
			//创建单元格并添加数据

			WritableSheet wws = wwb.getSheet("Sheet1");
			writeData(wws);

			//写入
			wwb.write();
			
			//关闭各个文件链接
			wwb.close();
			mWorkbook.close();
			targetFile.close();
			return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
	
	private void writeData(WritableSheet wws) throws RowsExceededException, WriteException{
		
		//创建单元格并添加数据
		int writeRow = 0;
		if(mTableTitle != null){
			//写入表头
			int size = mTableTitle.size();
			for(int i=0;i<size;i++){
				wws.addCell(new Label(i,writeRow,mTableTitle.get(i)));
			}
			
			writeRow++;
		}
		
		if(mTableData != null){
			//写入数据
			
			int size = mTableData.size();
			for(int i=0;i<size;i++){
				Vector<String>  row = mTableData.get(i);
				int size2 = row.size();
				for(int i2=0;i2<size2;i2++){
					wws.addCell(new Label(i2,writeRow,row.get(i2)));
				}
				writeRow++;
				
				if(exportExcelListener != null){
					exportExcelListener.onExportProgress(size, i+1, true);
				}
			}
		}
	}
}
