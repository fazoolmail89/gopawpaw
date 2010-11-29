package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FacldDet entity. @author MyEclipse Persistence Tools
 */
public class FacldDet extends AbstractFacldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacldDet() {
	}

	/** minimal constructor */
	public FacldDet(FacldDetId id, Date facldStart, Date facldEnd,
			String facldModUserid, Date facldModDate, String facldUser1,
			String facldUser2, String facldChr01, Double facldDec01,
			Boolean facldLog01, Integer facldInt01, String facldQadc01,
			Double facldQadd01, Boolean facldQadl01, Integer facldQadi01,
			Double oidFacldDet) {
		super(id, facldStart, facldEnd, facldModUserid, facldModDate,
				facldUser1, facldUser2, facldChr01, facldDec01, facldLog01,
				facldInt01, facldQadc01, facldQadd01, facldQadl01, facldQadi01,
				oidFacldDet);
	}

	/** full constructor */
	public FacldDet(FacldDetId id, Date facldStart, Date facldEnd,
			String facldModUserid, Date facldModDate, String facldUser1,
			String facldUser2, String facldChr01, Double facldDec01,
			Boolean facldLog01, Date facldDte01, Integer facldInt01,
			String facldQadc01, Double facldQadd01, Boolean facldQadl01,
			Integer facldQadi01, Date facldQadt01, Double oidFacldDet) {
		super(id, facldStart, facldEnd, facldModUserid, facldModDate,
				facldUser1, facldUser2, facldChr01, facldDec01, facldLog01,
				facldDte01, facldInt01, facldQadc01, facldQadd01, facldQadl01,
				facldQadi01, facldQadt01, oidFacldDet);
	}

}
