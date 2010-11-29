package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LgsiDet entity. @author MyEclipse Persistence Tools
 */
public class LgsiDet extends AbstractLgsiDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LgsiDet() {
	}

	/** minimal constructor */
	public LgsiDet(LgsiDetId id, Double oidLgsiDet) {
		super(id, oidLgsiDet);
	}

	/** full constructor */
	public LgsiDet(LgsiDetId id, Date lgsiModDate, String lgsiModUserid,
			String lgsiUser1, String lgsiUser2, Double lgsiDec01,
			Double lgsiDec02, Integer lgsiInt01, Integer lgsiInt02,
			Boolean lgsiLog01, Boolean lgsiLog02, Date lgsiDte01,
			Date lgsiDte02, String lgsiQadc01, String lgsiQadc02,
			String lgsiQadc03, String lgsiQadc04, Double lgsiQadd01,
			Double lgsiQadd02, Integer lgsiQadi01, Integer lgsiQadi02,
			Boolean lgsiQadl01, Boolean lgsiQadl02, Date lgsiQadt01,
			Date lgsiQadt02, Double oidLgsiDet) {
		super(id, lgsiModDate, lgsiModUserid, lgsiUser1, lgsiUser2, lgsiDec01,
				lgsiDec02, lgsiInt01, lgsiInt02, lgsiLog01, lgsiLog02,
				lgsiDte01, lgsiDte02, lgsiQadc01, lgsiQadc02, lgsiQadc03,
				lgsiQadc04, lgsiQadd01, lgsiQadd02, lgsiQadi01, lgsiQadi02,
				lgsiQadl01, lgsiQadl02, lgsiQadt01, lgsiQadt02, oidLgsiDet);
	}

}
