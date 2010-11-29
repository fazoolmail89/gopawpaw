package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AcMstr entity. @author MyEclipse Persistence Tools
 */
public class AcMstr extends AbstractAcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AcMstr() {
	}

	/** minimal constructor */
	public AcMstr(AcMstrId id, String acMatchSeq, Double oidAcMstr) {
		super(id, acMatchSeq, oidAcMstr);
	}

	/** full constructor */
	public AcMstr(AcMstrId id, String acXctr, Integer acFpos, String acType,
			String acDesc, String acXretAcc, String acXretCc, String acCurr,
			String acQad03, Boolean acActive, String acFxIndex, String acUser1,
			String acUser2, String acQad02, Date acQad01, String acStatAcc,
			String acStatCc, String acChr01, String acChr02, String acChr03,
			String acChr04, Date acDte01, Date acDte02, Boolean acLog01,
			Boolean acLog02, Boolean acModlOnly, String acMatchSeq,
			Double oidAcMstr) {
		super(id, acXctr, acFpos, acType, acDesc, acXretAcc, acXretCc, acCurr,
				acQad03, acActive, acFxIndex, acUser1, acUser2, acQad02,
				acQad01, acStatAcc, acStatCc, acChr01, acChr02, acChr03,
				acChr04, acDte01, acDte02, acLog01, acLog02, acModlOnly,
				acMatchSeq, oidAcMstr);
	}

}
