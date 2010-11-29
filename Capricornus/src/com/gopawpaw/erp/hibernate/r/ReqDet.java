package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * ReqDet entity. @author MyEclipse Persistence Tools
 */
public class ReqDet extends AbstractReqDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ReqDet() {
	}

	/** minimal constructor */
	public ReqDet(ReqDetId id, String reqAppOwner, Double oidReqDet) {
		super(id, reqAppOwner, oidReqDet);
	}

	/** full constructor */
	public ReqDet(ReqDetId id, String reqPart, Double reqQty, Date reqRelDate,
			Date reqNeed, String reqUm, Boolean reqPrint, String reqSoJob,
			String reqUser1, String reqUser2, String reqSite, String reqAcct,
			String reqCc, Integer reqCmtindx, String reqRequest,
			String reqAprBy, String reqChr01, String reqChr02, String reqChr03,
			String reqChr04, String reqChr05, Date reqDte01, Date reqDte02,
			Double reqDec01, Double reqDec02, Boolean reqLog01,
			String reqProject, String reqAprCode, Double reqPurCost,
			Boolean reqAprPrnt, Boolean reqApproved, String reqAprEnt,
			String reqPoSite, String reqSub, String reqAppOwner,
			Double oidReqDet) {
		super(id, reqPart, reqQty, reqRelDate, reqNeed, reqUm, reqPrint,
				reqSoJob, reqUser1, reqUser2, reqSite, reqAcct, reqCc,
				reqCmtindx, reqRequest, reqAprBy, reqChr01, reqChr02, reqChr03,
				reqChr04, reqChr05, reqDte01, reqDte02, reqDec01, reqDec02,
				reqLog01, reqProject, reqAprCode, reqPurCost, reqAprPrnt,
				reqApproved, reqAprEnt, reqPoSite, reqSub, reqAppOwner,
				oidReqDet);
	}

}
