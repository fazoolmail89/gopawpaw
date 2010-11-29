package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CphHistId entity. @author MyEclipse Persistence Tools
 */
public class CphHistId extends AbstractCphHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CphHistId() {
	}

	/** minimal constructor */
	public CphHistId(String cphDomain, Double oidCphHist) {
		super(cphDomain, oidCphHist);
	}

	/** full constructor */
	public CphHistId(Integer cphYear, String cphCust, String cphShip,
			String cphPl, String cphPart, String cphQty, String cphSales,
			String cphCost, Double cphTotQty, Double cphTotSale,
			Double cphTotCost, String cphType, String cphUser1,
			String cphUser2, Integer cphSmonth, String cphChr01,
			String cphChr02, String cphChr03, String cphChr04, String cphChr05,
			Date cphDte01, Date cphDte02, Boolean cphLog01, String cphDec01,
			String cphDec02, String cphSite, String cphDomain, Double oidCphHist) {
		super(cphYear, cphCust, cphShip, cphPl, cphPart, cphQty, cphSales,
				cphCost, cphTotQty, cphTotSale, cphTotCost, cphType, cphUser1,
				cphUser2, cphSmonth, cphChr01, cphChr02, cphChr03, cphChr04,
				cphChr05, cphDte01, cphDte02, cphLog01, cphDec01, cphDec02,
				cphSite, cphDomain, oidCphHist);
	}

}
