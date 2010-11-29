package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PthHist entity. @author MyEclipse Persistence Tools
 */
public class PthHist extends AbstractPthHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PthHist() {
	}

	/** minimal constructor */
	public PthHist(PthHistId id, String pthFor, Double oidPthHist) {
		super(id, pthFor, oidPthHist);
	}

	/** full constructor */
	public PthHist(PthHistId id, Double pthTotQty, Double pthTotSale,
			Double pthTotCost, String pthUser1, String pthUser2,
			String pthType, String pthChr01, String pthChr02, String pthChr03,
			String pthChr04, String pthChr05, Date pthDte01, Date pthDte02,
			Double pthDec01, Double pthDec02, Boolean pthLog01, String pthFor,
			Double oidPthHist) {
		super(id, pthTotQty, pthTotSale, pthTotCost, pthUser1, pthUser2,
				pthType, pthChr01, pthChr02, pthChr03, pthChr04, pthChr05,
				pthDte01, pthDte02, pthDec01, pthDec02, pthLog01, pthFor,
				oidPthHist);
	}

}
