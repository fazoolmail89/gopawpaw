package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PigcDet entity. @author MyEclipse Persistence Tools
 */
public class PigcDet extends AbstractPigcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PigcDet() {
	}

	/** minimal constructor */
	public PigcDet(PigcDetId id, Double oidPigcDet) {
		super(id, oidPigcDet);
	}

	/** full constructor */
	public PigcDet(PigcDetId id, String pigcDiv, Date pigcExpire,
			Boolean pigcInclude, Date pigcStart, String pigcUser1,
			String pigcUser2, String pigcQadc01, String pigcQadc02,
			String pigcQadc03, Double pigcQadd01, Double pigcQadd02,
			Integer pigcQadi01, Integer pigcQadi02, Boolean pigcQadl01,
			Boolean pigcQadl02, Date pigcQadt01, Date pigcQadt02,
			String pigcCurr, Integer pigcSrchType, Double oidPigcDet) {
		super(id, pigcDiv, pigcExpire, pigcInclude, pigcStart, pigcUser1,
				pigcUser2, pigcQadc01, pigcQadc02, pigcQadc03, pigcQadd01,
				pigcQadd02, pigcQadi01, pigcQadi02, pigcQadl01, pigcQadl02,
				pigcQadt01, pigcQadt02, pigcCurr, pigcSrchType, oidPigcDet);
	}

}
