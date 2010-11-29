package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SodrDet entity. @author MyEclipse Persistence Tools
 */
public class SodrDet extends AbstractSodrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SodrDet() {
	}

	/** minimal constructor */
	public SodrDet(SodrDetId id, Double oidSodrDet) {
		super(id, oidSodrDet);
	}

	/** full constructor */
	public SodrDet(SodrDetId id, String sodrDiv, String sodrGroup,
			Integer sodrPricing, Integer sodrType, String sodrUser1,
			String sodrUser2, String sodrQadc01, String sodrQadc02,
			String sodrQadc03, Double sodrQadd01, Double sodrQadd02,
			Integer sodrQadi01, Integer sodrQadi02, Boolean sodrQadl01,
			Boolean sodrQadl02, Date sodrQadt01, Date sodrQadt02,
			Double oidSodrDet) {
		super(id, sodrDiv, sodrGroup, sodrPricing, sodrType, sodrUser1,
				sodrUser2, sodrQadc01, sodrQadc02, sodrQadc03, sodrQadd01,
				sodrQadd02, sodrQadi01, sodrQadi02, sodrQadl01, sodrQadl02,
				sodrQadt01, sodrQadt02, oidSodrDet);
	}

}
