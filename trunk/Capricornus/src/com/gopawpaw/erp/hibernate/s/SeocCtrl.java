package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SeocCtrl entity. @author MyEclipse Persistence Tools
 */
public class SeocCtrl extends AbstractSeocCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SeocCtrl() {
	}

	/** minimal constructor */
	public SeocCtrl(String seocIntCust, String seocExRatetype,
			Double oidSeocCtrl) {
		super(seocIntCust, seocExRatetype, oidSeocCtrl);
	}

	/** full constructor */
	public SeocCtrl(Integer seocBoAdvice, Boolean seocQadl01,
			Integer seocDnote, Boolean seocImmedShip, String seocChr01,
			String seocChr02, String seocChr03, String seocChr04,
			String seocChr05, Double seocDec01, Double seocDec02,
			Date seocDte01, Date seocDte02, Boolean seocLog01,
			Boolean seocLog02, Integer seocIndex1, String seocSoPre,
			Boolean seocHcmmts, Boolean seocLcmmts, Integer seocSo,
			Boolean seocDetAll, Integer seocAllDays, Boolean seocLnFmt,
			Boolean seocSoHist, Boolean seocKitAuto, Boolean seocQadl02,
			Integer seocKitNbr, Boolean seocConsume, Boolean seocShipTo,
			Double seocQadd01, Boolean seocReq, Integer seocShpLead,
			String seocIntCust, Boolean seocConfirm, String seocUser1,
			String seocUser2, Date seocModDate, String seocModUserid,
			String seocKitPre, String seocQadc02, Integer seocQadi01,
			String seocExRatetype, String seocQadc03, Double seocQadd02,
			Integer seocQadi02, Date seocQadt01, Date seocQadt02,
			Double oidSeocCtrl) {
		super(seocBoAdvice, seocQadl01, seocDnote, seocImmedShip, seocChr01,
				seocChr02, seocChr03, seocChr04, seocChr05, seocDec01,
				seocDec02, seocDte01, seocDte02, seocLog01, seocLog02,
				seocIndex1, seocSoPre, seocHcmmts, seocLcmmts, seocSo,
				seocDetAll, seocAllDays, seocLnFmt, seocSoHist, seocKitAuto,
				seocQadl02, seocKitNbr, seocConsume, seocShipTo, seocQadd01,
				seocReq, seocShpLead, seocIntCust, seocConfirm, seocUser1,
				seocUser2, seocModDate, seocModUserid, seocKitPre, seocQadc02,
				seocQadi01, seocExRatetype, seocQadc03, seocQadd02, seocQadi02,
				seocQadt01, seocQadt02, oidSeocCtrl);
	}

}
