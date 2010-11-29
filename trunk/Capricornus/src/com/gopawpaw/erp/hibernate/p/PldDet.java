package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PldDet entity. @author MyEclipse Persistence Tools
 */
public class PldDet extends AbstractPldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PldDet() {
	}

	/** minimal constructor */
	public PldDet(PldDetId id, Double oidPldDet) {
		super(id, oidPldDet);
	}

	/** full constructor */
	public PldDet(PldDetId id, String pldInvAcct, String pldScrpacct,
			String pldDscracct, String pldInvCc, String pldScrpCc,
			String pldDscrCc, String pldUser1, String pldUser2,
			String pldUserid, Date pldModDate, String pldCchgAcc,
			String pldCchgCc, String pldQadc01, String pldCchgSub,
			String pldDscrSub, String pldInvSub, String pldScrpSub,
			Double oidPldDet) {
		super(id, pldInvAcct, pldScrpacct, pldDscracct, pldInvCc, pldScrpCc,
				pldDscrCc, pldUser1, pldUser2, pldUserid, pldModDate,
				pldCchgAcc, pldCchgCc, pldQadc01, pldCchgSub, pldDscrSub,
				pldInvSub, pldScrpSub, oidPldDet);
	}

}
