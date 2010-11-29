package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DptMstr entity. @author MyEclipse Persistence Tools
 */
public class DptMstr extends AbstractDptMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DptMstr() {
	}

	/** minimal constructor */
	public DptMstr(DptMstrId id, Double oidDptMstr) {
		super(id, oidDptMstr);
	}

	/** full constructor */
	public DptMstr(DptMstrId id, String dptDesc, String dptBvarAcc,
			String dptBvarCc, String dptBvrrAcc, String dptBvrrCc,
			String dptQadc03, String dptQadc04, String dptQadc07,
			String dptQadc08, String dptLvrrAcc, String dptLvrrCc,
			String dptQadc01, String dptQadc02, String dptLbrAcct,
			String dptLbrCc, String dptBdnAcct, String dptBdnCc,
			String dptLvarAcc, String dptLvarCc, String dptQadc05,
			String dptQadc06, Integer dptLbrCap, String dptCopAcct,
			String dptCopCc, String dptUser1, String dptUser2, String dptChr01,
			String dptChr02, String dptChr03, String dptChr04, String dptChr05,
			Date dptDte01, Date dptDte02, Double dptDec01, Double dptDec02,
			Boolean dptLog01, String dptUserid, Date dptModDate,
			String dptBdnSub, String dptBvarSub, String dptBvrrSub,
			String dptCopSub, String dptLbrSub, String dptLvarSub,
			String dptLvrrSub, Double oidDptMstr) {
		super(id, dptDesc, dptBvarAcc, dptBvarCc, dptBvrrAcc, dptBvrrCc,
				dptQadc03, dptQadc04, dptQadc07, dptQadc08, dptLvrrAcc,
				dptLvrrCc, dptQadc01, dptQadc02, dptLbrAcct, dptLbrCc,
				dptBdnAcct, dptBdnCc, dptLvarAcc, dptLvarCc, dptQadc05,
				dptQadc06, dptLbrCap, dptCopAcct, dptCopCc, dptUser1, dptUser2,
				dptChr01, dptChr02, dptChr03, dptChr04, dptChr05, dptDte01,
				dptDte02, dptDec01, dptDec02, dptLog01, dptUserid, dptModDate,
				dptBdnSub, dptBvarSub, dptBvrrSub, dptCopSub, dptLbrSub,
				dptLvarSub, dptLvrrSub, oidDptMstr);
	}

}
