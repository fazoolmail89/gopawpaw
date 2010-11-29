package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EncdDet entity. @author MyEclipse Persistence Tools
 */
public class EncdDet extends AbstractEncdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EncdDet() {
	}

	/** full constructor */
	public EncdDet(EncdDetId id, Double encdPct, String encdModUserid,
			Date encdModDate, String encdUser1, String encdUser2,
			String encdQadc01, String encdQadc02, Boolean encdConsolidate,
			Double oidEncdDet) {
		super(id, encdPct, encdModUserid, encdModDate, encdUser1, encdUser2,
				encdQadc01, encdQadc02, encdConsolidate, oidEncdDet);
	}

}
