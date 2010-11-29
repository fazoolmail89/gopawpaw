package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqfCtrl entity. @author MyEclipse Persistence Tools
 */
public class RqfCtrl extends AbstractRqfCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqfCtrl() {
	}

	/** minimal constructor */
	public RqfCtrl(Double oidRqfCtrl) {
		super(oidRqfCtrl);
	}

	/** full constructor */
	public RqfCtrl(Integer rqfQadi01, Integer rqfNbr, String rqfPre,
			Boolean rqfLnFmt, Double rqfTolVal, Boolean rqfUseTolval,
			Double rqfTolPct, Boolean rqfUseTolpct, Boolean rqfLcmmts,
			Boolean rqfHcmmts, String rqfApprCurr, String rqfEmailOpt,
			String rqfOotRtg, Boolean rqfOotRtgMode, Integer rqfDiraprsReq,
			Integer rqfHoraprsReq, Integer rqfVrtaprsReq, String rqfChr01,
			String rqfChr02, String rqfChr03, String rqfChr04, Double rqfDec01,
			Boolean rqfLog01, Date rqfDte01, String rqfQadc01,
			String rqfQadc02, String rqfQadc03, String rqfQadc04,
			Double oidRqfCtrl) {
		super(rqfQadi01, rqfNbr, rqfPre, rqfLnFmt, rqfTolVal, rqfUseTolval,
				rqfTolPct, rqfUseTolpct, rqfLcmmts, rqfHcmmts, rqfApprCurr,
				rqfEmailOpt, rqfOotRtg, rqfOotRtgMode, rqfDiraprsReq,
				rqfHoraprsReq, rqfVrtaprsReq, rqfChr01, rqfChr02, rqfChr03,
				rqfChr04, rqfDec01, rqfLog01, rqfDte01, rqfQadc01, rqfQadc02,
				rqfQadc03, rqfQadc04, oidRqfCtrl);
	}

}
