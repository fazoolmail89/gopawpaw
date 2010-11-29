package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PghHist entity. @author MyEclipse Persistence Tools
 */
public class PghHist extends AbstractPghHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PghHist() {
	}

	/** minimal constructor */
	public PghHist(PghHistId id, Double oidPghHist) {
		super(id, oidPghHist);
	}

	/** full constructor */
	public PghHist(PghHistId id, String pghEngCode, String pghCaNbr,
			String pghPhone, Date pghDate, String pghTimeInit,
			String pghStatus, String pghTimePaged, String pghUser1,
			String pghUser2, String pghQadc01, String pghQadc02,
			Date pghQadt01, String pghChr01, String pghChr02, Date pghDte01,
			Boolean pghLog01, Boolean pghQadl01, Double oidPghHist) {
		super(id, pghEngCode, pghCaNbr, pghPhone, pghDate, pghTimeInit,
				pghStatus, pghTimePaged, pghUser1, pghUser2, pghQadc01,
				pghQadc02, pghQadt01, pghChr01, pghChr02, pghDte01, pghLog01,
				pghQadl01, oidPghHist);
	}

}
