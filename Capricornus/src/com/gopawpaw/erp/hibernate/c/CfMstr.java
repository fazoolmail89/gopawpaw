package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CfMstr entity. @author MyEclipse Persistence Tools
 */
public class CfMstr extends AbstractCfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CfMstr() {
	}

	/** minimal constructor */
	public CfMstr(CfMstrId id, Boolean cfType, Double cfExRate2,
			String cfExRatetype, Integer cfExruSeq, Double oidCfMstr) {
		super(id, cfType, cfExRate2, cfExRatetype, cfExruSeq, oidCfMstr);
	}

	/** full constructor */
	public CfMstr(CfMstrId id, Double cfRefAmt, Double cfCumAmt,
			Double cfExptAmt, String cfBank, Boolean cfType, Integer cfCmtindx,
			String cfCurr, Date cfDate, Date cfDueDate, Double cfExRate,
			String cfEntity, Double cfEntEx, Date cfExptDate, Date cfLdueDate,
			String cfUser1, String cfUser2, String cfChr01, String cfChr02,
			String cfChr03, String cfChr04, String cfChr05, Double cfDec01,
			Double cfDec02, Date cfDte01, Date cfDte02, Boolean cfLog01,
			String cfDesc1, String cfDesc2, Date cfLastedit, String cfRef,
			String cfUserid, Double cfExRate2, String cfExRatetype,
			Integer cfExruSeq, Double oidCfMstr) {
		super(id, cfRefAmt, cfCumAmt, cfExptAmt, cfBank, cfType, cfCmtindx,
				cfCurr, cfDate, cfDueDate, cfExRate, cfEntity, cfEntEx,
				cfExptDate, cfLdueDate, cfUser1, cfUser2, cfChr01, cfChr02,
				cfChr03, cfChr04, cfChr05, cfDec01, cfDec02, cfDte01, cfDte02,
				cfLog01, cfDesc1, cfDesc2, cfLastedit, cfRef, cfUserid,
				cfExRate2, cfExRatetype, cfExruSeq, oidCfMstr);
	}

}
