package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PigpDet entity. @author MyEclipse Persistence Tools
 */
public class PigpDet extends AbstractPigpDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PigpDet() {
	}

	/** minimal constructor */
	public PigpDet(PigpDetId id, Double oidPigpDet) {
		super(id, oidPigpDet);
	}

	/** full constructor */
	public PigpDet(PigpDetId id, String pigpDiv, Date pigpExpire,
			Boolean pigpInclude, String pigpListId, Date pigpStart,
			String pigpUser1, String pigpUser2, String pigpQadc01,
			String pigpQadc02, String pigpQadc03, Double pigpQadd01,
			Double pigpQadd02, Integer pigpQadi01, Integer pigpQadi02,
			Boolean pigpQadl01, Boolean pigpQadl02, Date pigpQadt01,
			Date pigpQadt02, String pigpCurr, Integer pigpSrchType,
			Double oidPigpDet) {
		super(id, pigpDiv, pigpExpire, pigpInclude, pigpListId, pigpStart,
				pigpUser1, pigpUser2, pigpQadc01, pigpQadc02, pigpQadc03,
				pigpQadd01, pigpQadd02, pigpQadi01, pigpQadi02, pigpQadl01,
				pigpQadl02, pigpQadt01, pigpQadt02, pigpCurr, pigpSrchType,
				oidPigpDet);
	}

}
