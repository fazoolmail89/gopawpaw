package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CclscdDet entity. @author MyEclipse Persistence Tools
 */
public class CclscdDet extends AbstractCclscdDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclscdDet() {
	}

	/** minimal constructor */
	public CclscdDet(CclscdDetId id, Double cclscdPrice, String cclscdRef,
			String cclscdModUserid, String cclscdUserc01, String cclscdUserc02,
			String cclscdQadc01, String cclscdQadc02, Double oidCclscdDet) {
		super(id, cclscdPrice, cclscdRef, cclscdModUserid, cclscdUserc01,
				cclscdUserc02, cclscdQadc01, cclscdQadc02, oidCclscdDet);
	}

	/** full constructor */
	public CclscdDet(CclscdDetId id, Date cclscdExpire, Double cclscdPrice,
			String cclscdRef, String cclscdModUserid, Date cclscdModDate,
			String cclscdUserc01, String cclscdUserc02, String cclscdQadc01,
			String cclscdQadc02, Double oidCclscdDet) {
		super(id, cclscdExpire, cclscdPrice, cclscdRef, cclscdModUserid,
				cclscdModDate, cclscdUserc01, cclscdUserc02, cclscdQadc01,
				cclscdQadc02, oidCclscdDet);
	}

}
