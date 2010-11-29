package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CmtDet entity. @author MyEclipse Persistence Tools
 */
public class CmtDet extends AbstractCmtDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmtDet() {
	}

	/** minimal constructor */
	public CmtDet(CmtDetId id, Double oidCmtDet) {
		super(id, oidCmtDet);
	}

	/** full constructor */
	public CmtDet(CmtDetId id, String cmtRef, String cmtType, String cmtCmmt,
			String cmtPrint, String cmtLang, String cmtUser1, String cmtUser2,
			Date cmtStart, Date cmtExpire, String cmtQadc01, Double oidCmtDet) {
		super(id, cmtRef, cmtType, cmtCmmt, cmtPrint, cmtLang, cmtUser1,
				cmtUser2, cmtStart, cmtExpire, cmtQadc01, oidCmtDet);
	}

}
