package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RmdDet entity. @author MyEclipse Persistence Tools
 */
public class RmdDet extends AbstractRmdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RmdDet() {
	}

	/** minimal constructor */
	public RmdDet(RmdDetId id, String rmdProcess, String rmdStart,
			Double oidRmdDet) {
		super(id, rmdProcess, rmdStart, oidRmdDet);
	}

	/** full constructor */
	public RmdDet(RmdDetId id, Boolean rmdEditIsb, String rmdPart,
			Double rmdQtyOrd, Double rmdQtyAcp, String rmdQadc04,
			Double rmdPrice, String rmdSer, String rmdDesc, String rmdComment,
			Integer rmdCmtindx, String rmdStatus, String rmdUser1,
			String rmdUser2, String rmdProdline, String rmdChr01,
			String rmdChr02, String rmdChr03, String rmdChr04, String rmdChr05,
			String rmdChr06, String rmdChr07, String rmdChr08, String rmdChr09,
			String rmdChr10, Date rmdDte01, Date rmdDte02, Double rmdDec01,
			Double rmdDec02, Boolean rmdLog01, String rmdRoute,
			String rmdFaultCd, String rmdType, Integer rmdLink,
			Boolean rmdRmaRtrn, Double rmdCvrPct, Integer rmdRef,
			Date rmdExpDate, Date rmdCplDate, Boolean rmdIss, String rmdRmaNbr,
			Integer rmdRmaLine, String rmdSite, String rmdLoc,
			Double rmdRestock, Boolean rmdLoaner, String rmdSerLon,
			Boolean rmdDone, String rmdRev, String rmdChgType,
			String rmdEngCode, String rmdSvCode, String rmdUm,
			Double rmdUmConv, Double rmdCustoms, Double rmdQtyRel,
			String rmdSaNbr, Double rmdCovered, String rmdEnd, Date rmdInsDate,
			Date rmdParDate, String rmdParPart, String rmdParSer,
			String rmdProcess, Double rmdQtyNon, String rmdStart,
			String rmdOpTran, String rmdQadc01, String rmdQadc02,
			String rmdQadc03, Date rmdQadt01, Date rmdQadt02, Date rmdQadt03,
			Double rmdQadd01, Double rmdQadd02, Integer rmdQadi01,
			Integer rmdQadi02, Boolean rmdQadl01, Boolean rmdQadl02,
			Boolean rmdQadl03, Integer rmdQadi03, Double rmdQadd03,
			Date rmdQadt04, Date rmdQadt05, String rmdModUserid,
			Date rmdModDate, Double oidRmdDet) {
		super(id, rmdEditIsb, rmdPart, rmdQtyOrd, rmdQtyAcp, rmdQadc04,
				rmdPrice, rmdSer, rmdDesc, rmdComment, rmdCmtindx, rmdStatus,
				rmdUser1, rmdUser2, rmdProdline, rmdChr01, rmdChr02, rmdChr03,
				rmdChr04, rmdChr05, rmdChr06, rmdChr07, rmdChr08, rmdChr09,
				rmdChr10, rmdDte01, rmdDte02, rmdDec01, rmdDec02, rmdLog01,
				rmdRoute, rmdFaultCd, rmdType, rmdLink, rmdRmaRtrn, rmdCvrPct,
				rmdRef, rmdExpDate, rmdCplDate, rmdIss, rmdRmaNbr, rmdRmaLine,
				rmdSite, rmdLoc, rmdRestock, rmdLoaner, rmdSerLon, rmdDone,
				rmdRev, rmdChgType, rmdEngCode, rmdSvCode, rmdUm, rmdUmConv,
				rmdCustoms, rmdQtyRel, rmdSaNbr, rmdCovered, rmdEnd,
				rmdInsDate, rmdParDate, rmdParPart, rmdParSer, rmdProcess,
				rmdQtyNon, rmdStart, rmdOpTran, rmdQadc01, rmdQadc02,
				rmdQadc03, rmdQadt01, rmdQadt02, rmdQadt03, rmdQadd01,
				rmdQadd02, rmdQadi01, rmdQadi02, rmdQadl01, rmdQadl02,
				rmdQadl03, rmdQadi03, rmdQadd03, rmdQadt04, rmdQadt05,
				rmdModUserid, rmdModDate, oidRmdDet);
	}

}
