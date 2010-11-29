package com.gopawpaw.erp.test;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.GppSQL;
import com.gopawpaw.erp.hibernate.c.CodeMstr;
import com.gopawpaw.erp.hibernate.m.MntDet;
import com.gopawpaw.erp.hibernate.m.MntDetDAO;
import com.gopawpaw.erp.hibernate.m.MntDetId;


/**
 * @version 2010-3-14
 * @author Àî½õ»ª
 * 
 */
public class Test {

	/**
	 * 
	 */
	public Test() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
//		
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");
////		MntDetDAO mntDAO = (MntDetDAO)ctx.getBean("MntDetDAO");
//		MntDetDAO mntDAO = MntDetDAO.getFromApplicationContext(ctx);

		int counti = 0;

//		String sqlstr = "select count(*) as cont from mnd_det where mnd_nbr='"
//				+ "3.6" + "'";

//		String sqlstr = "select 'mnt_nbr','mnt_select','mnt_lang','mnt_label','mnt_user1','mnt_user2','mnt__qadc01','oid_mnt_det' from 'MFGPROD'.'PUB'.'mnt_det'";
		
		String sqlstr = "select * from \"MFGPROD\".\"PUB\".\"pl_mstr\"";
		sqlstr = "select  distinct(code_fldname) from \"MFGPROD\".\"PUB\".\"code_mstr\"";
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(sqlstr);
		try {
			while (rst != null && rst.next()) {
				String tem = rst.getString("code_fldname");
//				System.out.println("private static ArrayList<CodeMstr> "+tem+" = null;");
//				System.out.println("	if("+tem+" == null){ reloadData();	}");
//				System.out.println("else if(((CodeMstr) o).getId().getCodeFldname().equals(\""+tem+"\")){"+tem+".add((CodeMstr) o);}");
//				System.out.println(tem+" = new  ArrayList<CodeMstr>();");
				System.out.println("else if(temp_CodeMstr.getId().getCodeFldname().equals(\""+tem+"\")) {"+tem+".add(temp_CodeMstr);}");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gppsql.close();
		
		
	}

	private static void p(MntDet mntDet){

	}
}
