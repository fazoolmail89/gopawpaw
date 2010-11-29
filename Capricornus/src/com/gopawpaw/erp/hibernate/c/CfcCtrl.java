package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CfcCtrl entity. @author MyEclipse Persistence Tools
 */
public class CfcCtrl extends AbstractCfcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CfcCtrl() {
	}

	/** minimal constructor */
	public CfcCtrl(Double oidCfcCtrl) {
		super(oidCfcCtrl);
	}

	/** full constructor */
	public CfcCtrl(Double cfcExTol, Integer cfcQadi01, Integer cfcCfnbr,
			String cfcNbrPre, String cfcUser1, String cfcUser2,
			String cfcChr01, String cfcChr02, String cfcChr03, String cfcChr04,
			String cfcChr05, Double cfcDec01, Double cfcDec02, Date cfcDte01,
			Date cfcDte02, Boolean cfcLog01, Integer cfcExRound,
			Boolean cfcInclSo, Boolean cfcInclAr, Boolean cfcInclAp,
			Boolean cfcInclPo, Boolean cfcInclCf, Boolean cfcInclFs,
			Boolean cfcInclQad01, Boolean cfcInclQad02, Double oidCfcCtrl) {
		super(cfcExTol, cfcQadi01, cfcCfnbr, cfcNbrPre, cfcUser1, cfcUser2,
				cfcChr01, cfcChr02, cfcChr03, cfcChr04, cfcChr05, cfcDec01,
				cfcDec02, cfcDte01, cfcDte02, cfcLog01, cfcExRound, cfcInclSo,
				cfcInclAr, cfcInclAp, cfcInclPo, cfcInclCf, cfcInclFs,
				cfcInclQad01, cfcInclQad02, oidCfcCtrl);
	}

}
