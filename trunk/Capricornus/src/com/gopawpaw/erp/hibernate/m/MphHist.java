package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MphHist entity. @author MyEclipse Persistence Tools
 */
public class MphHist extends AbstractMphHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MphHist() {
	}

	/** minimal constructor */
	public MphHist(MphHistId id, String mphProcedure, Date mphDate,
			Integer mphOpTrnbr, Double oidMphHist) {
		super(id, mphProcedure, mphDate, mphOpTrnbr, oidMphHist);
	}

	/** full constructor */
	public MphHist(MphHistId id, String mphProcedure, Date mphDate,
			Integer mphCmtindx, String mphRsult, Integer mphOpTrnbr,
			String mphMch, String mphWrNbr, Boolean mphPass, String mphUser1,
			String mphUser2, String mphChr01, String mphChr02, String mphChr03,
			String mphChr04, String mphChr05, Double mphDec01, Double mphDec02,
			String mphTestmthd, String mphAttribute, Double oidMphHist) {
		super(id, mphProcedure, mphDate, mphCmtindx, mphRsult, mphOpTrnbr,
				mphMch, mphWrNbr, mphPass, mphUser1, mphUser2, mphChr01,
				mphChr02, mphChr03, mphChr04, mphChr05, mphDec01, mphDec02,
				mphTestmthd, mphAttribute, oidMphHist);
	}

}
