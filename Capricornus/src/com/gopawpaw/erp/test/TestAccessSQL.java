/**
 * 
 */
package com.gopawpaw.erp.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.GppSQL;
import com.gopawpaw.erp.hibernate.c.CodeMstr;
import com.gopawpaw.erp.hibernate.c.CodeMstrId;

/**
 * @version 2010-5-7
 * @author Àî½õ»ª
 *
 */
public class TestAccessSQL {

	/**
	 * 
	 */
	public TestAccessSQL() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public static void main(String[] args) {
		GlobalParameter.initialize();
		String sqlstr = "select * from code_mstr";
		//	+ GlobalParameter.getLoginSession().getDomain() + "'";
	// sqlstr =
	// "select  distinct(code_fldname) from \"MFGPROD\".\"PUB\".\"code_mstr\"";
	GppSQL gppsql = new GppSQL();
	ResultSet rst = gppsql.query(sqlstr);
	try {
		while (rst != null && rst.next()) {
			System.out.println(rst.getString("code_fldname"));
			System.out.println(rst.getString("code_value"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	gppsql.close();
	}

}
