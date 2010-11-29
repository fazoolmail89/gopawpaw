package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CmhHist entity. @author MyEclipse Persistence Tools
 */
public class CmhHist extends AbstractCmhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmhHist() {
	}

	/** minimal constructor */
	public CmhHist(CmhHistId id, Double oidCmhHist) {
		super(id, oidCmhHist);
	}

	/** full constructor */
	public CmhHist(CmhHistId id, Double cmhTotSale, Double cmhTotCost,
			String cmhUser1, String cmhUser2, String cmhType, String cmhChr01,
			String cmhChr02, String cmhChr03, String cmhChr04, String cmhChr05,
			String cmhChr06, String cmhChr07, String cmhChr08, String cmhChr09,
			String cmhChr10, Date cmhDte01, Date cmhDte02, Double cmhDec01,
			Double cmhDec02, Boolean cmhLog01, Boolean cmhLog02,
			Double oidCmhHist) {
		super(id, cmhTotSale, cmhTotCost, cmhUser1, cmhUser2, cmhType,
				cmhChr01, cmhChr02, cmhChr03, cmhChr04, cmhChr05, cmhChr06,
				cmhChr07, cmhChr08, cmhChr09, cmhChr10, cmhDte01, cmhDte02,
				cmhDec01, cmhDec02, cmhLog01, cmhLog02, oidCmhHist);
	}

}
