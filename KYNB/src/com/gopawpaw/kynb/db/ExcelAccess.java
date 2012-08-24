/**
 * 
 */
package com.gopawpaw.kynb.db;



import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import com.gopawpaw.kynb.bean.Thorp;
import com.gopawpaw.kynb.bean.Villager;

/**
 * @author 李锦华
 * @since: 2011-11-14
 */
public class ExcelAccess {
	
	public final static int SAVE_VILLAGER = 1;
	
	public final static int SAVE_BANK = 2;
	
	private static String outputPath = "OutPut\\";
	
//	private static String excelTempPath = "DBCenter\\VillagerFormatTemp.xls";
	
	private static String excelTempPath = "DBCenter\\VillagerFormatTemp.v2.xls";
	
	private static String excelTempPathBank = "DBCenter\\广西新农保参保人员银行信息导入表.xls";
	
	private String excelPath= "";
	
	private Workbook mWorkbook = null;
	
	private List<Villager> villagerList = null;
	
	private Thorp thorp = null;
	
	private ExportExcelListener exportExcelListener;
	/**
	 * 
	 */
	public ExcelAccess(String excelFile) {
		excelPath = outputPath+excelFile;
	}
	
	/**
	 * 保存Excel数据
	 * @author 李锦华
	 * @since:2011-11-14
	 * @return
	 */
	public boolean saveExcel(int type){
		
		try {
			
			//输出文件
			FileOutputStream targetFile = new FileOutputStream(new File(excelPath));
			
			String tempPath = "";
			if(type == SAVE_VILLAGER){
				//获取指定的表
				tempPath = excelTempPath;
			}else if(type == SAVE_BANK){
				//获取指定的表
				tempPath = excelTempPathBank;
			}
			
			
			//模板文件
			mWorkbook = Workbook.getWorkbook(new File(tempPath));
			
			WritableWorkbook wwb = Workbook.createWorkbook(targetFile, mWorkbook);
			
			
			
			//创建单元格并添加数据
//			Label C1 = new Label(4,4,"单元格内容");
//			wws.addCell(C1);
			if(type == SAVE_VILLAGER){
				//获取指定的表
				WritableSheet wws = wwb.getSheet("农村居民");
				writeDataVillager(wws);
			}else if(type == SAVE_BANK){
				//获取指定的表
				WritableSheet wws = wwb.getSheet("Sheet1");
				writeDataBank(wws);
			}
			
			
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
	
	/**
	 * 写入数据
	 * @author 李锦华
	 * @since:2011-11-14
	 * @param wws
	 * @throws RowsExceededException
	 * @throws WriteException
	 */
	private void writeDataVillager(WritableSheet wws) throws RowsExceededException, WriteException{
		
		//创建单元格并添加数据
		
		if(villagerList != null){
			Villager villager = null;
			
			int beginRow = 4;
			int writeRow = 0;
			int size = villagerList.size();
			for(int i=0;i<size;i++){
				villager = villagerList.get(i);
				writeRow = beginRow+i;
				
//				wws.addCell(new Label(0,writeRow,""+villager.getV_id()));
				wws.addCell(new Label(0,writeRow,""+villager.getV_name()));
				wws.addCell(new Label(1,writeRow,""+villager.getV_sex()));
				wws.addCell(new Label(2,writeRow,""+villager.getV_ic()));
				wws.addCell(new Label(3,writeRow,""+villager.getV_nation()));
//				wws.addCell(new Label(5,writeRow,""+villager.getV_birthday()));
				wws.addCell(new Label(4,writeRow,""+villager.getV_address_live()));
				wws.addCell(new Label(5,writeRow,""+villager.getV_bank_name()));
				wws.addCell(new Label(6,writeRow,""+villager.getV_bank_account()));
				wws.addCell(new Label(7,writeRow,""+villager.getV_bank_account_name()));
				wws.addCell(new Label(8,writeRow,""+villager.getV_bank2_name()));
				wws.addCell(new Label(9,writeRow,""+villager.getV_bank2_account()));
				wws.addCell(new Label(10,writeRow,""+villager.getV_capture_expend_calss()));
				wws.addCell(new Label(11,writeRow,""+villager.getV_type()));
				wws.addCell(new Label(12,writeRow,""));
				wws.addCell(new Label(13,writeRow,""));
				wws.addCell(new Label(14,writeRow,""+villager.getV_join_time()));
				wws.addCell(new Label(15,writeRow,""+villager.getV_archival_location()));
//				wws.addCell(new Label(13,writeRow,""+villager.getV_old_balance()));
				wws.addCell(new Label(16,writeRow,""+villager.getV_old_balance_flag()));
				wws.addCell(new Label(17,writeRow,""+villager.getV_householder_name()));
				wws.addCell(new Label(18,writeRow,""+villager.getV_householder_ic()));
				wws.addCell(new Label(19,writeRow,""+villager.getV_householder_relation()));
				wws.addCell(new Label(20,writeRow,""+villager.getV_standard_culture()));
//				wws.addCell(new Label(19,writeRow,""+villager.getV_60not_enough15_flag()));
				wws.addCell(new Label(21,writeRow,""+villager.getV_phone_num()));
				wws.addCell(new Label(22,writeRow,""+villager.getV_marital_status()));
				wws.addCell(new Label(23,writeRow,""+villager.getV_politics_status()));
				wws.addCell(new Label(24,writeRow,""+villager.getV_contact_name()));
				wws.addCell(new Label(25,writeRow,""+villager.getV_address_com()));
				wws.addCell(new Label(26,writeRow,""+villager.getV_address_zip_code()));
				wws.addCell(new Label(27,writeRow,""+villager.getV_soldie_flag()));
				wws.addCell(new Label(28,writeRow,""+villager.getV_model_worker()));
				wws.addCell(new Label(29,writeRow,""+villager.getV_mark()));
				
				if(exportExcelListener != null){
					exportExcelListener.onExportProgress(size, i+1, true);
				}
			}
		}
	}
	
	private void writeDataBank(WritableSheet wws) throws RowsExceededException, WriteException{
		
		//创建单元格并添加数据
		
		if(villagerList != null){
			Villager villager = null;
			
			int beginRow = 2;
			int writeRow = 0;
			int size = villagerList.size();
			for(int i=0;i<size;i++){
				villager = villagerList.get(i);
				writeRow = beginRow+i;
				
				wws.addCell(new Label(0,writeRow,""+villager.getV_id()));
				wws.addCell(new Label(1,writeRow,""+villager.getV_name()));
				wws.addCell(new Label(2,writeRow,""+villager.getV_ic()));
				wws.addCell(new Label(3,writeRow,""+villager.getV_bank_name()));
				wws.addCell(new Label(4,writeRow,""+villager.getV_bank_account()));
				wws.addCell(new Label(5,writeRow,""+villager.getV_bank_account_name()));
				wws.addCell(new Label(6,writeRow,""+villager.getV_bank2_name()));
				wws.addCell(new Label(7,writeRow,""+villager.getV_bank2_account()));
				wws.addCell(new Label(8,writeRow,""+villager.getV_bank2_account_name()));
				wws.addCell(new Label(9,writeRow,""+villager.getV_mark2()));
				
				if(exportExcelListener != null){
					exportExcelListener.onExportProgress(size, i+1, true);
				}
			}
		}
	}
	
	public List<Villager> getVillagerList() {
		return villagerList;
	}

	public void setVillagerList(List<Villager> villagerList) {
		this.villagerList = villagerList;
	}
	
	public Thorp getThorp() {
		return thorp;
	}

	public void setThorp(Thorp thorp) {
		this.thorp = thorp;
	}

	
	/**
	 * @author 李锦华
	 * @since:2011-11-14
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ExcelAccess ea = new ExcelAccess("villagerDB.xls");
//		System.out.println("pppp:"+ea.saveExcel());
	}

	public ExportExcelListener getExportExcelListener() {
		return exportExcelListener;
	}

	public void setExportExcelListener(ExportExcelListener exportExcelListener) {
		this.exportExcelListener = exportExcelListener;
	}
}


