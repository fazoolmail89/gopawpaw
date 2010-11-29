package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SphHist entity. @author MyEclipse Persistence Tools
 */
public class SphHist extends AbstractSphHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SphHist() {
	}

	/** minimal constructor */
	public SphHist(SphHistId id, Double oidSphHist) {
		super(id, oidSphHist);
	}

	/** full constructor */
	public SphHist(SphHistId id, String sphSales, String sphCost,
			String sphQuota, Double sphTotSale, Double sphTotCost,
			String sphUser1, String sphUser2, Integer sphSmonth,
			String sphType, String sphChr01, String sphChr02, String sphChr03,
			String sphChr04, String sphChr05, Date sphDte01, Date sphDte02,
			Boolean sphLog01, String sphDec01, String sphDec02,
			Double oidSphHist) {
		super(id, sphSales, sphCost, sphQuota, sphTotSale, sphTotCost,
				sphUser1, sphUser2, sphSmonth, sphType, sphChr01, sphChr02,
				sphChr03, sphChr04, sphChr05, sphDte01, sphDte02, sphLog01,
				sphDec01, sphDec02, oidSphHist);
	}

}
