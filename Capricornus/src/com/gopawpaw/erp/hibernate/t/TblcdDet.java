package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TblcdDet entity. @author MyEclipse Persistence Tools
 */
public class TblcdDet extends AbstractTblcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TblcdDet() {
	}

	/** full constructor */
	public TblcdDet(TblcdDetId id, Boolean tblcdActive, String tblcdDesc,
			String tblcdUser1, String tblcdUser2, String tblcdQadc01,
			String tblcdQadc02, Date tblcdModDate, String tblcdModUserid,
			Double oidTblcdDet) {
		super(id, tblcdActive, tblcdDesc, tblcdUser1, tblcdUser2, tblcdQadc01,
				tblcdQadc02, tblcdModDate, tblcdModUserid, oidTblcdDet);
	}

}
