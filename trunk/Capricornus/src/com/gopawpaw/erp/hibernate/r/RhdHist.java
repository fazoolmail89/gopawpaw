package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RhdHist entity. @author MyEclipse Persistence Tools
 */
public class RhdHist extends AbstractRhdHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RhdHist() {
	}

	/** minimal constructor */
	public RhdHist(RhdHistId id, String rhdEnduser, Double oidRhdHist) {
		super(id, rhdEnduser, oidRhdHist);
	}

	/** full constructor */
	public RhdHist(RhdHistId id, String rhdNbr, Integer rhdLine,
			String rhdPart, Double rhdQtyOrd, Double rhdQtyAcp,
			String rhdTrans, Double rhdPrice, String rhdSerial,
			String rhdStatus, String rhdUser1, String rhdUser2,
			String rhdProdline, String rhdChr01, String rhdChr02,
			String rhdChr03, String rhdChr04, String rhdChr05, String rhdChr06,
			String rhdChr07, String rhdChr08, String rhdChr09, String rhdChr10,
			Date rhdDte01, Date rhdDte02, Double rhdDec01, Double rhdDec02,
			Boolean rhdLog01, String rhdFaultCd, String rhdType,
			Integer rhdLink, Boolean rhdRmaRtrn, Double rhdCvrPct,
			Integer rhdRef, Date rhdExpDate, Date rhdCplDate, String rhdRmaNbr,
			Integer rhdRmaLine, String rhdSite, String rhdLoc,
			String rhdPrefix, String rhdRev, String rhdCust, String rhdShip,
			String rhdHistype, String rhdChgType, String rhdSaNbr,
			Double rhdCovered, String rhdSvCode, String rhdEnduser,
			Date rhdParDate, Date rhdInsDate, String rhdParPart,
			String rhdParSer, String rhdProcess, String rhdEngArea,
			String rhdEngCode, String rhdEuArea, String rhdDesc,
			Integer rhdCmtindx, Double rhdRestock, Boolean rhdLoaner,
			String rhdSerLon, Boolean rhdDone, Boolean rhdIss,
			Boolean rhdEditIsb, String rhdUm, Double rhdUmConv,
			Double rhdCustoms, Double rhdQtyRel, String rhdEnd,
			Double rhdQtyNon, String rhdStart, String rhdOpTran,
			String rhdQadc01, String rhdQadc02, String rhdQadc03,
			Date rhdQadd01, Date rhdQadd02, Date rhdQadd03, Double rhdQadde01,
			Double rhdQadde02, Integer rhdQadi01, Integer rhdQadi02,
			Boolean rhdQadl01, Boolean rhdQadl02, Boolean rhdQadl03,
			Integer rhdQadi03, Double rhdQadde03, Date rhdQadd04,
			Date rhdQadd05, String rhdModUserid, Date rhdModDate,
			Double oidRhdHist) {
		super(id, rhdNbr, rhdLine, rhdPart, rhdQtyOrd, rhdQtyAcp, rhdTrans,
				rhdPrice, rhdSerial, rhdStatus, rhdUser1, rhdUser2,
				rhdProdline, rhdChr01, rhdChr02, rhdChr03, rhdChr04, rhdChr05,
				rhdChr06, rhdChr07, rhdChr08, rhdChr09, rhdChr10, rhdDte01,
				rhdDte02, rhdDec01, rhdDec02, rhdLog01, rhdFaultCd, rhdType,
				rhdLink, rhdRmaRtrn, rhdCvrPct, rhdRef, rhdExpDate, rhdCplDate,
				rhdRmaNbr, rhdRmaLine, rhdSite, rhdLoc, rhdPrefix, rhdRev,
				rhdCust, rhdShip, rhdHistype, rhdChgType, rhdSaNbr, rhdCovered,
				rhdSvCode, rhdEnduser, rhdParDate, rhdInsDate, rhdParPart,
				rhdParSer, rhdProcess, rhdEngArea, rhdEngCode, rhdEuArea,
				rhdDesc, rhdCmtindx, rhdRestock, rhdLoaner, rhdSerLon, rhdDone,
				rhdIss, rhdEditIsb, rhdUm, rhdUmConv, rhdCustoms, rhdQtyRel,
				rhdEnd, rhdQtyNon, rhdStart, rhdOpTran, rhdQadc01, rhdQadc02,
				rhdQadc03, rhdQadd01, rhdQadd02, rhdQadd03, rhdQadde01,
				rhdQadde02, rhdQadi01, rhdQadi02, rhdQadl01, rhdQadl02,
				rhdQadl03, rhdQadi03, rhdQadde03, rhdQadd04, rhdQadd05,
				rhdModUserid, rhdModDate, oidRhdHist);
	}

}
