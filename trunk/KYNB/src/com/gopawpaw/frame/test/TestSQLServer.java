/**
 * 
 */
package com.gopawpaw.frame.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gopawpaw.frame.GppSQL;

/**
 * @version 2010-5-6
 * @author 李锦华
 * 
 */
public class TestSQLServer {

	/**
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tablename = "wo_mstr";
		String sqlstr = "Select   SysColumns.name as cname,SysColumns.xusertype as utype  From   SysColumns   Left   Outer   Join   SysObjects   On   SysColumns.ID=SysObjects.ID where SysObjects.type='U' and SysObjects.name = '"+tablename+"' order by SysColumns.colid";
		GppSQLServer gppsql = new GppSQLServer();
		ResultSet rst = gppsql.query(sqlstr);
		
		try {
			while (rst != null && rst.next()) {
				String tem = rst.getString("cname");
				String tem2 = rst.getString("utype");
				
				System.out.println("temp_WoMstr.set"+convToFunction(tem)+"(rst."+getGetString(tem2)+"(\""+tem+"\"));");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//System.out.println(sqlstr);
		gppsql.close();
	}

	/**
	 * 将字段转换为方法名
	 */
	private static String convToFunction(String cname){
		String retstr = "";
		char[] ch = cname.toCharArray();
		
		for(int i=0;i<ch.length;i++){
			String tem = String.valueOf(ch[i]);
			if(i==0){
				retstr = tem.toUpperCase();
			}
			
			if(i!=0 && String.valueOf(ch[i-1]).equals("_") && !tem.equals("_")){
				retstr = retstr + tem.toUpperCase();
				continue;
			}
			
			if(i!=0 && !tem.equals("_")){
				retstr = retstr + tem;
			}
		}
		
		
		return retstr;
	}
	
	private static String getGetString(String str){
		String retstr = "";
		if(str.equals("167")){
			retstr = "getString";
		}else if(str.equals("106")){
			retstr = "getDouble";
		}else if(str.equals("48")){
			retstr = "getBoolean";
		}else if(str.equals("56")){
			retstr = "getInt";
		}else if(str.equals("61")){
			retstr = "getDate";
		}else{
			retstr = "getString";
		}
		return retstr;
	}
	
}
