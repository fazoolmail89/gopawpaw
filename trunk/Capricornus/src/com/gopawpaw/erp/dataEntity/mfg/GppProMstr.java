/**
 * 
 */
package com.gopawpaw.erp.dataEntity.mfg;

import java.sql.ResultSet;
import java.sql.SQLException;


import com.gopawpaw.erp.GlobalParameter;
import com.gopawpaw.erp.GppSQL;
import com.gopawpaw.erp.hibernate.p.ProMstr;
import com.gopawpaw.erp.hibernate.p.ProMstrId;

/**
 * @version 2010-7-11
 * @author 李锦华
 * 
 */
public class GppProMstr {
	private static final long serialVersionUID = 5274413356887481683L;
	private ProMstr promstr = null;

	private boolean isNeedUpdate = false;

	/**
	 * 
	 */
	public GppProMstr() {

	}

	public GppProMstr(ProMstr promstr) {
		this.promstr = promstr;
	}

	/**
	 * 根据MD5判断该程序是否需要更新，需要更新返回true,不需要更新返回false
	 */
	public boolean isNeedUpdate() {
		this.isNeedUpdate = true;
		String gpp_sqlstr = "";

		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			gpp_sqlstr = "select pro_md5 from pro_mstr where pro_mnd_nbr_select='"
					+ promstr.getId().getProMndNbrSelect()
					+ "' and pro_serial='"
					+ promstr.getId().getProSerial()
					+ "'";
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {

		} else {

		}

		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(gpp_sqlstr);
		try {
			while (rst != null && rst.next()) {
				if (this.promstr.getProMd5().equals(rst.getString("pro_md5"))) {
					isNeedUpdate = false;
				} else {
					isNeedUpdate = true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gppsql.close();

		return isNeedUpdate;
	}

	/**
	 * 判断是否有该程序主文件
	 */
	public boolean isHaveProMstr() {
		boolean retboo = false;
		String gpp_sqlstr = "";

		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			gpp_sqlstr = "select 1 from pro_mstr where pro_mnd_nbr_select='"
					+ promstr.getId().getProMndNbrSelect()
					+ "' and pro_serial='" + promstr.getId().getProSerial()
					+ "'";
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {

		} else {

		}
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(gpp_sqlstr);

		try {
			while (rst != null && rst.next()) {
				retboo = true;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		gppsql.close();
		return retboo;
	}

	public ProMstr getPromstr() {
		return promstr;
	}

	public void setPromstr(ProMstr promstr) {
		this.promstr = promstr;
	}

	/**
	 * 更新数据库信息
	 */
	public boolean updateAction() {
		boolean retboo = false;
		if (this.promstr == null) {
			return false;
		}else if (this.promstr.getId().getProSerial() == null || this.promstr.getId().getProSerial() == ""){
			return false;
		}
		String gpp_sqlstr = "";
		String in_sql = "";
		String up_sql = "";

		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			in_sql = "insert into pro_mstr (pro_mnd_nbr_select,pro_serial,pro_name,pro_md5) values ('"
					+ promstr.getId().getProMndNbrSelect()
					+ "','"
					+ promstr.getId().getProSerial()
					+ "','"
					+ promstr.getProName() + "','" + promstr.getProMd5() + "')";
			up_sql = "update pro_mstr set pro_name='" + promstr.getProName()
					+ "',pro_md5='" + promstr.getProMd5()
					+ "' where pro_mnd_nbr_select='"
					+ promstr.getId().getProMndNbrSelect()
					+ "' and pro_serial='" + promstr.getId().getProSerial()
					+ "'";
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {
			
		} else {

		}

		if (this.isHaveProMstr()) {
			gpp_sqlstr = up_sql;
		} else {
			gpp_sqlstr = in_sql;
		}
		GppSQL gppsql = new GppSQL();
		retboo = gppsql.executesql(gpp_sqlstr);
		gppsql.close();

		return retboo;
	}

	public static void main(String[] args) {
		GlobalParameter.initialize();
		ProMstr promstr = new ProMstr();
		ProMstrId promstrid = new ProMstrId();
		promstrid.setProMndNbrSelect("3.6.18");
		promstrid.setProSerial(String.valueOf(serialVersionUID));
		promstr.setId(promstrid);
		promstr.setProMd5("mmm");
		promstr.setProName("即可");

		GppProMstr gpm = new GppProMstr(promstr);

//		System.out.println(gpm.isHaveProMstr());
//		System.out.println(gpm.isNeedUpdate());
		System.out.println(gpm.updateAction());

	}
}
