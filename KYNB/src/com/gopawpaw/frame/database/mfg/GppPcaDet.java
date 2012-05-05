/**
 * 
 */
package com.gopawpaw.frame.database.mfg;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.gopawpaw.frame.GlobalParameter;
import com.gopawpaw.frame.database.GppSQL;
import com.gopawpaw.frame.struct.p.PcaDet;
import com.gopawpaw.frame.struct.p.PcaDetId;

/**
 * @version 2010-7-13
 * @author 李锦华
 * 
 */
public class GppPcaDet {
	private PcaDet pcadet = null;

	private PcaDetId pcadetid = null;

	/**
	 * 
	 */
	public GppPcaDet() {
	}

	/**
	 * 需要实体对象构造方法
	 * 
	 * @param pcadet
	 */
	public GppPcaDet(PcaDet pcadet) {
		this.pcadet = pcadet;
	}

	/**
	 * 需要主键对象构造方法
	 * 
	 * @param pcadetid
	 */
	public GppPcaDet(PcaDetId pcadetid) {
		this.pcadetid = pcadetid;
	}

	public PcaDet getPcadet() {
		return pcadet;
	}

	public void setPcadet(PcaDet pcadet) {
		this.pcadet = pcadet;
	}

	public PcaDetId getPcadetid() {
		return pcadetid;
	}

	public void setPcadetid(PcaDetId pcadetid) {
		this.pcadetid = pcadetid;
	}

	/**
	 * 根据主键获取授权对象,没有则返回null
	 */
	public static PcaDet getPcadet(PcaDetId pcadetid) {
		PcaDet retpcadet = null;
		
		String gpp_sqlstr = "";

		if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Progress) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Access) {

		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_SQLServer) {
			gpp_sqlstr = "select * from pca_det where pca_mnd_nbr_select='"
					+ pcadetid.getPcaMndNbrSelect()
					+ "' and pca_pro_com_serial='"
					+ pcadetid.getPcaProComSerial() + "' and pca_target='"
					+ pcadetid.getPcaTarget() + "' and pca_type='"
					+ pcadetid.getPcaType() + "' ";
		} else if (GlobalParameter.getDataBaseType() == GlobalParameter.DataBaseType_Hibernate) {

		} else {

		}
		GppSQL gppsql = new GppSQL();
		ResultSet rst = gppsql.query(gpp_sqlstr);

		try {
			while (rst != null && rst.next()) {
				byte temvisi = rst.getByte("pca_visible");
				byte temenab = rst.getByte("pca_enable");
				retpcadet = new PcaDet();
				retpcadet.setId(pcadetid);
				
				if(temvisi == 1){
					retpcadet.setPcaVisible(true);
				}else{
					retpcadet.setPcaVisible(false);
				}
				
				if(temenab == 1){
					retpcadet.setPcaEnable(true);
				}else{
					retpcadet.setPcaEnable(false);
				}
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		gppsql.close();
		return retpcadet;
	}

	public static void main(String[] args) {
		GlobalParameter.initialize();
		PcaDetId pcadetid = new PcaDetId();
		pcadetid.setPcaMndNbrSelect("eee");
		pcadetid.setPcaProComSerial("1967458358996351974");
		pcadetid.setPcaTarget("mg");
		pcadetid.setPcaType("u");
		
		System.out.println(GppPcaDet.getPcadet(pcadetid));
	}
}
