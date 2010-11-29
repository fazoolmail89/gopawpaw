package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqmMstr entity. @author MyEclipse Persistence Tools
 */
public class RqmMstr extends AbstractRqmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqmMstr() {
	}

	/** minimal constructor */
	public RqmMstr(RqmMstrId id, String rqmEndUserid, Double rqmExRate2,
			String rqmExRatetype, Integer rqmExruSeq, Double oidRqmMstr) {
		super(id, rqmEndUserid, rqmExRate2, rqmExRatetype, rqmExruSeq,
				oidRqmMstr);
	}

	/** full constructor */
	public RqmMstr(RqmMstrId id, Date rqmReqDate, String rqmRqbyUserid,
			String rqmEndUserid, String rqmShip, Integer rqmCmtindx,
			String rqmReason, String rqmEbyUserid, String rqmStatus,
			Boolean rqmPrint, Date rqmDueDate, Date rqmNeedDate,
			String rqmVend, String rqmAcct, String rqmSub, String rqmCc,
			String rqmProject, Boolean rqmFixPr, String rqmCurr,
			Double rqmExRate, Date rqmEntDate, String rqmSite, String rqmLang,
			Double rqmDiscPct, String rqmBill, String rqmContact,
			Boolean rqmLnFmt, String rqmType, String rqmPrList,
			Double rqmEntEx, Boolean rqmRtdtoPurch, Boolean rqmPartial,
			String rqmBuyer, String rqmJob, String rqmCategory,
			Boolean rqmFixRate, String rqmRmks, Boolean rqmDirect,
			Integer rqmAprCmtindx, String rqmRttoUserid, String rqmPrevUserid,
			String rqmFob, String rqmShipvia, String rqmEmailOpt,
			String rqmEntity, String rqmPentUserid, Double rqmTotal,
			Double rqmMaxTotal, String rqmPrList2, Date rqmRttoDate,
			Integer rqmRttoTime, Boolean rqmOpen, Boolean rqmPrevRtp,
			Date rqmClsDate, String rqmChr01, String rqmChr02, String rqmChr03,
			String rqmChr04, Boolean rqmLog01, Double rqmDec01,
			String rqmQadc01, String rqmQadc02, String rqmQadc03,
			String rqmQadc04, String rqmAprvStat, Double rqmExRate2,
			String rqmExRatetype, Integer rqmExruSeq, Double oidRqmMstr) {
		super(id, rqmReqDate, rqmRqbyUserid, rqmEndUserid, rqmShip, rqmCmtindx,
				rqmReason, rqmEbyUserid, rqmStatus, rqmPrint, rqmDueDate,
				rqmNeedDate, rqmVend, rqmAcct, rqmSub, rqmCc, rqmProject,
				rqmFixPr, rqmCurr, rqmExRate, rqmEntDate, rqmSite, rqmLang,
				rqmDiscPct, rqmBill, rqmContact, rqmLnFmt, rqmType, rqmPrList,
				rqmEntEx, rqmRtdtoPurch, rqmPartial, rqmBuyer, rqmJob,
				rqmCategory, rqmFixRate, rqmRmks, rqmDirect, rqmAprCmtindx,
				rqmRttoUserid, rqmPrevUserid, rqmFob, rqmShipvia, rqmEmailOpt,
				rqmEntity, rqmPentUserid, rqmTotal, rqmMaxTotal, rqmPrList2,
				rqmRttoDate, rqmRttoTime, rqmOpen, rqmPrevRtp, rqmClsDate,
				rqmChr01, rqmChr02, rqmChr03, rqmChr04, rqmLog01, rqmDec01,
				rqmQadc01, rqmQadc02, rqmQadc03, rqmQadc04, rqmAprvStat,
				rqmExRate2, rqmExRatetype, rqmExruSeq, oidRqmMstr);
	}

}
