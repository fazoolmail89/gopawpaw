package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * ItmhHist entity. @author MyEclipse Persistence Tools
 */
public class ItmhHist extends AbstractItmhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItmhHist() {
	}

	/** minimal constructor */
	public ItmhHist(ItmhHistId id, Double oidItmhHist) {
		super(id, oidItmhHist);
	}

	/** full constructor */
	public ItmhHist(ItmhHistId id, String itmhBomCode, String itmhCaIntType,
			Integer itmhCmtindx, Date itmhCompDate, String itmhDesc,
			String itmhEngCode, String itmhNxtAct, Date itmhNxtDate,
			String itmhNxtTime, String itmhPart, Double itmhQtyCall,
			Double itmhQtyRcRec, Double itmhQtyRcShip, Double itmhQtyRec,
			Double itmhQtyShip, Date itmhRecDate, Integer itmhRef,
			String itmhRev, String itmhRoute, Integer itmhSadLine,
			String itmhSaNbr, String itmhSerial, Date itmhShipDate,
			String itmhStatus, String itmhSvCode, String itmhUser1,
			String itmhUser2, String itmhTaxc, String itmhTaxUsage,
			String itmhChr01, String itmhChr02, String itmhChr03,
			String itmhChr04, Double itmhDec01, Double itmhDec02,
			Double itmhDec03, Date itmhDte01, Date itmhDte02, Date itmhDte03,
			Boolean itmhLog01, Boolean itmhLog02, Boolean itmhLog03,
			String itmhQadc01, String itmhQadc02, String itmhQadc03,
			String itmhQadc04, Date itmhQadt01, Date itmhQadt02,
			Date itmhQadt03, Double itmhQadd01, Double itmhQadd02,
			Double itmhQadd03, Boolean itmhQadl01, Boolean itmhQadl02,
			Boolean itmhQadl03, String itmhStdownTime, Date itmhStdownDate,
			Date itmhStjobDate, Date itmhEndownDate, String itmhEndownTime,
			Boolean itmhBomGen, Date itmhDueDate, Date itmhExpRec,
			Boolean itmhFixPr, Boolean itmhRouteGen, String itmhSaSv,
			String itmhSvcType, Boolean itmhTaxable, String itmhWarrSv,
			String itmhQadc05, String itmhQadc06, Date itmhOpnDate,
			String itmhStjobTime, Double itmhFixedPrice,
			Boolean itmhBillDetail, Boolean itmhUnprocessed,
			Boolean itmhInvoiced, Boolean itmhUninvoiced, String itmhEstTime,
			Boolean itmhRecorded, Double itmhQtyChg, String itmhTag,
			String itmhRrcNbr, Integer itmhRrcSeq, Boolean itmhSepDoc,
			String itmhSite, String itmhLoc, Boolean itmhUpdIsb,
			String itmhModUserid, Date itmhModDate, String itmhTaxEnv,
			Boolean itmhTaxIn, String itmhPrList, String itmhProdLine,
			Boolean itmhOverrideLmt, String itmhEuNbr, Boolean itmhPst,
			String itmhAcct, String itmhSub, String itmhCc, String itmhProject,
			String itmhDscAcct, String itmhDscSub, String itmhDscCc,
			String itmhDscProject, Double oidItmhHist) {
		super(id, itmhBomCode, itmhCaIntType, itmhCmtindx, itmhCompDate,
				itmhDesc, itmhEngCode, itmhNxtAct, itmhNxtDate, itmhNxtTime,
				itmhPart, itmhQtyCall, itmhQtyRcRec, itmhQtyRcShip, itmhQtyRec,
				itmhQtyShip, itmhRecDate, itmhRef, itmhRev, itmhRoute,
				itmhSadLine, itmhSaNbr, itmhSerial, itmhShipDate, itmhStatus,
				itmhSvCode, itmhUser1, itmhUser2, itmhTaxc, itmhTaxUsage,
				itmhChr01, itmhChr02, itmhChr03, itmhChr04, itmhDec01,
				itmhDec02, itmhDec03, itmhDte01, itmhDte02, itmhDte03,
				itmhLog01, itmhLog02, itmhLog03, itmhQadc01, itmhQadc02,
				itmhQadc03, itmhQadc04, itmhQadt01, itmhQadt02, itmhQadt03,
				itmhQadd01, itmhQadd02, itmhQadd03, itmhQadl01, itmhQadl02,
				itmhQadl03, itmhStdownTime, itmhStdownDate, itmhStjobDate,
				itmhEndownDate, itmhEndownTime, itmhBomGen, itmhDueDate,
				itmhExpRec, itmhFixPr, itmhRouteGen, itmhSaSv, itmhSvcType,
				itmhTaxable, itmhWarrSv, itmhQadc05, itmhQadc06, itmhOpnDate,
				itmhStjobTime, itmhFixedPrice, itmhBillDetail, itmhUnprocessed,
				itmhInvoiced, itmhUninvoiced, itmhEstTime, itmhRecorded,
				itmhQtyChg, itmhTag, itmhRrcNbr, itmhRrcSeq, itmhSepDoc,
				itmhSite, itmhLoc, itmhUpdIsb, itmhModUserid, itmhModDate,
				itmhTaxEnv, itmhTaxIn, itmhPrList, itmhProdLine,
				itmhOverrideLmt, itmhEuNbr, itmhPst, itmhAcct, itmhSub, itmhCc,
				itmhProject, itmhDscAcct, itmhDscSub, itmhDscCc,
				itmhDscProject, oidItmhHist);
	}

}
