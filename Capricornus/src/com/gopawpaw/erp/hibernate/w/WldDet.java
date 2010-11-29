package com.gopawpaw.erp.hibernate.w;

import java.util.Date;

/**
 * WldDet entity. @author MyEclipse Persistence Tools
 */
public class WldDet extends AbstractWldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WldDet() {
	}

	/** minimal constructor */
	public WldDet(WldDetId id, Double wldQtyOh, Double oidWldDet) {
		super(id, wldQtyOh, oidWldDet);
	}

	/** full constructor */
	public WldDet(WldDetId id, Double wldQtyOh, Date wldModDate,
			String wldModUserid, String wldQadc01, String wldQadc02,
			String wldQadc03, String wldQadc04, Double wldQadd01,
			Double wldQadd02, Integer wldQadi01, Integer wldQadi02,
			Boolean wldQadl01, Boolean wldQadl02, Date wldQadt01,
			Date wldQadt02, String wldChr01, String wldChr02, String wldChr03,
			String wldChr04, Double wldDec01, Double wldDec02,
			Integer wldInt01, Integer wldInt02, Boolean wldLog01,
			Boolean wldLog02, Date wldDte01, Date wldDte02, String wldUser1,
			String wldUser2, Double oidWldDet) {
		super(id, wldQtyOh, wldModDate, wldModUserid, wldQadc01, wldQadc02,
				wldQadc03, wldQadc04, wldQadd01, wldQadd02, wldQadi01,
				wldQadi02, wldQadl01, wldQadl02, wldQadt01, wldQadt02,
				wldChr01, wldChr02, wldChr03, wldChr04, wldDec01, wldDec02,
				wldInt01, wldInt02, wldLog01, wldLog02, wldDte01, wldDte02,
				wldUser1, wldUser2, oidWldDet);
	}

}
