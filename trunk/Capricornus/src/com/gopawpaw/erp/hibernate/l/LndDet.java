package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LndDet entity. @author MyEclipse Persistence Tools
 */
public class LndDet extends AbstractLndDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LndDet() {
	}

	/** minimal constructor */
	public LndDet(LndDetId id, String lndRunSeq1, String lndRunSeq2,
			Double oidLndDet) {
		super(id, lndRunSeq1, lndRunSeq2, oidLndDet);
	}

	/** full constructor */
	public LndDet(LndDetId id, Double lndRate, Date lndExpire, String lndUser1,
			String lndUser2, Double lndSequence, String lndBom,
			String lndProdUm, String lndSetup, String lndRun, String lndTool,
			Integer lndCmtindx, Integer lndRunSize, Integer lndSetSize,
			String lndChr01, String lndChr02, String lndChr03, String lndChr04,
			String lndChr05, Double lndDec01, Double lndDec02, Double lndDec03,
			Boolean lndLog01, Boolean lndQadl01, String lndRunSeq1,
			String lndRunSeq2, Double oidLndDet) {
		super(id, lndRate, lndExpire, lndUser1, lndUser2, lndSequence, lndBom,
				lndProdUm, lndSetup, lndRun, lndTool, lndCmtindx, lndRunSize,
				lndSetSize, lndChr01, lndChr02, lndChr03, lndChr04, lndChr05,
				lndDec01, lndDec02, lndDec03, lndLog01, lndQadl01, lndRunSeq1,
				lndRunSeq2, oidLndDet);
	}

}
