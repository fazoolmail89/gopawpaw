package com.gopawpaw.kynb.module.print;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class License implements Printable{
	//print.ini ��ǩ����
	//-----------------------------------------------------------------
	public static final String PAGER = "pager";
	public static final String PAGER_W = "w";
	public static final String PAGER_H = "h";
	
	public static final String NAME = "name";//����
	public static final String OLD_NAME = "oldName";//������
	public static final String BIRTHDAY = "birthday";//����������
	public static final String SEX = "sex";//�Ա�
	public static final String CODE = "code";//��ᱣ�Ϻ�
	public static final String ADDRESS = "address";//��ַ
	public static final String ACCOUNT_TYPE = "accountType";//��������
	public static final String GRANT_DATE = "grantDate";//�˷�ʱ��
	public static final String GRANT_DPMT = "grantDpmt";//�˷���λ
	//-----------------------------------------------------------------
	
	/**
	 * �˷���λĬ��ֵ��ֵ��Ӧprint.ini�ļ��ġ�[grantDpmt].dpmt����ֵ 
	 */
	public static String GreantDpmtDV = "";
	
	/**
	 * Ĭ�ϴ�ӡҳ����
	 */
	public static int PagerSize_W = 300; 
	
	/**
	 * Ĭ�ϴ�ӡ���泤��
	 */
	public static int PagerSize_H = 400;
	
	private String name;//����
	private String oldName;//������
	private String birthday;//����������
	private String sex;//�Ա�
	private String code;//��ᱣ�Ϻ�
	private String address;//��ַ
	private String accountType;//��������
	private String grantDate;//�˷�ʱ��
	private String grantDpmt;//�˷���λ

	public static Map<String, Coordinate> print_point = new HashMap<String, Coordinate>();	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOldName() {
		return oldName;
	}

	public void setOldName(String oldName) {
		this.oldName = oldName;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getGrantDate() {
		return grantDate;
	}

	public void setGrantDate(String grantDate) {
		this.grantDate = grantDate;
	}

	/**
	 * 
	 * @return Ĭ�Ϻ˷���λ License.GRANT_DPMT_DV
	 */
	public String getGrantDpmt() {
		//return grantDpmt;
		return License.GreantDpmtDV;
	}

	public void setGrantDpmt(String grantDpmt) {
		this.grantDpmt = grantDpmt;
	}
	
	public int print(Graphics graphics, PageFormat pageFormat, int pageIndex)
			throws PrinterException {
		
		if (pageIndex < 1) {
			graphics.setColor(Color.BLACK);
			graphics.setFont(new Font("", Font.PLAIN, 8));
			
			graphics.drawString(getName(), 
					print_point.get(License.NAME).getX(), 
					print_point.get(License.NAME).getY());
			
			graphics.drawString(getOldName(), 
					print_point.get(License.OLD_NAME).getX(), 
					print_point.get(License.OLD_NAME).getY());
			
			graphics.drawString(getBirthday(), 
					print_point.get(License.BIRTHDAY).getX(), 
					print_point.get(License.BIRTHDAY).getY());
			
			graphics.drawString(getSex(), 
					print_point.get(License.SEX).getX(), 
					print_point.get(License.SEX).getY());
			
			graphics.drawString(getCode(), 
					print_point.get(License.CODE).getX(), 
					print_point.get(License.CODE).getY());
			
			graphics.drawString(getAddress(), 
					print_point.get(License.ADDRESS).getX(), 
					print_point.get(License.ADDRESS).getY());
			
			graphics.drawString(getAccountType(), 
					print_point.get(License.ACCOUNT_TYPE).getX(), 
					print_point.get(License.ACCOUNT_TYPE).getY());
			
			graphics.drawString(getGrantDate(), 
					print_point.get(License.GRANT_DATE).getX(), 
					print_point.get(License.GRANT_DATE).getY());
			
			graphics.drawString(getGrantDpmt(), 
					print_point.get(License.GRANT_DPMT).getX(), 
					print_point.get(License.GRANT_DPMT).getY());

			return Printable.PAGE_EXISTS;
		} else {
			return Printable.NO_SUCH_PAGE;
		}
	}
	
	/**
	 * ��ȡ��ӡ�����ļ�
	 */
	public static void readInitFile() {
		String path = System.getProperty("user.dir");
		path = path + "\\print.ini";
		File iniFile = new File(path);   
		if(iniFile.exists()) {
			try {
				IniReader ir = new IniReader(iniFile.getPath());
				
				PagerSize_W = Integer.parseInt(ir.getValue(License.PAGER, License.PAGER_W));
				PagerSize_H = Integer.parseInt(ir.getValue(License.PAGER, License.PAGER_H));
				
				print_point.put(License.NAME, 
						new Coordinate(Integer.parseInt(ir.getValue(License.NAME, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.NAME, Coordinate.Y))));
				print_point.put(License.OLD_NAME, 
						new Coordinate(Integer.parseInt(ir.getValue(License.OLD_NAME, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.OLD_NAME, Coordinate.Y))));
				print_point.put(License.BIRTHDAY, 
						new Coordinate(Integer.parseInt(ir.getValue(License.BIRTHDAY, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.BIRTHDAY, Coordinate.Y))));
				print_point.put(License.SEX, 
						new Coordinate(Integer.parseInt(ir.getValue(License.SEX, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.SEX, Coordinate.Y))));
				print_point.put(License.CODE, 
						new Coordinate(Integer.parseInt(ir.getValue(License.CODE, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.CODE, Coordinate.Y))));
				print_point.put(License.ADDRESS, 
						new Coordinate(Integer.parseInt(ir.getValue(License.ADDRESS, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.ADDRESS, Coordinate.Y))));
				print_point.put(License.ACCOUNT_TYPE, 
						new Coordinate(Integer.parseInt(ir.getValue(License.ACCOUNT_TYPE, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.ACCOUNT_TYPE, Coordinate.Y))));
				print_point.put(License.GRANT_DATE, 
						new Coordinate(Integer.parseInt(ir.getValue(License.GRANT_DATE, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.GRANT_DATE, Coordinate.Y))));
				print_point.put(License.GRANT_DPMT, 
						new Coordinate(Integer.parseInt(ir.getValue(License.GRANT_DPMT, Coordinate.X)), 
										Integer.parseInt(ir.getValue(License.GRANT_DPMT, Coordinate.Y))));
				
				GreantDpmtDV = ir.getValue(License.GRANT_DPMT, "dpmt");
			} catch (IOException e) {
				e.printStackTrace();
			} catch(NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new License();
		//li.readInitFile();
	}
}
