package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * ItmDet entity. @author MyEclipse Persistence Tools
 */
public class ItmDet extends AbstractItmDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItmDet() {
	}

	/** minimal constructor */
	public ItmDet(ItmDetId id, Double oidItmDet) {
		super(id, oidItmDet);
	}

	/** full constructor */
	public ItmDet(ItmDetId id, String itmPart, String itmRev,
			Integer itmCmtindx, String itmSerial, Integer itmRef,
			String itmUser1, String itmUser2, String itmQadc06,
			String itmQadc05, Boolean itmBillDetail, String itmBomCode,
			Boolean itmBomGen, String itmCaIntType, Date itmCompDate,
			String itmDesc, String itmEngCode, Date itmStdownDate,
			String itmNxtAct, Date itmNxtDate, String itmNxtTime,
			Date itmEndownDate, Double itmQtyCall, Double itmQtyRcRec,
			Double itmQtyRcShip, Double itmQtyRec, Double itmQtyShip,
			Date itmRecDate, String itmRoute, Boolean itmRouteGen,
			Integer itmSadLine, String itmSaNbr, Date itmShipDate,
			String itmStatus, String itmSvcType, String itmSvCode,
			Boolean itmTaxable, String itmTaxc, String itmTaxUsage,
			String itmChr01, String itmChr02, String itmChr03, String itmChr04,
			Double itmDec01, Double itmDec02, Double itmDec03, Date itmDte01,
			Date itmDte02, Date itmDte03, Boolean itmLog01, Boolean itmLog02,
			Boolean itmLog03, String itmQadc01, String itmQadc02,
			String itmQadc03, String itmQadc04, Date itmQadd01, Date itmQadd02,
			Date itmQadd03, Double itmQadde01, Double itmQadde02,
			Double itmQadde03, Boolean itmQadl01, Boolean itmQadl02,
			Boolean itmQadl03, Boolean itmUnprocessed, Boolean itmInvoiced,
			Boolean itmUninvoiced, Date itmExpRec, Boolean itmRecorded,
			Date itmDueDate, String itmEndownTime, String itmWarrSv,
			String itmSaSv, Boolean itmFixPr, String itmPrList,
			String itmStdownTime, Date itmStjobDate, String itmStjobTime,
			Double itmQtyChg, String itmTag, String itmRrcNbr,
			Integer itmRrcSeq, Boolean itmSepDoc, String itmSite,
			String itmLoc, Double itmFixedPrice, Boolean itmUpdIsb,
			String itmModUserid, Date itmModDate, String itmTaxEnv,
			Boolean itmTaxIn, String itmEstTime, String itmProdLine,
			Boolean itmOverrideLmt, String itmEuNbr, Boolean itmPst,
			String itmAcct, String itmSub, String itmCc, String itmProject,
			String itmDscAcct, String itmDscSub, String itmDscCc,
			String itmDscProject, Double oidItmDet) {
		super(id, itmPart, itmRev, itmCmtindx, itmSerial, itmRef, itmUser1,
				itmUser2, itmQadc06, itmQadc05, itmBillDetail, itmBomCode,
				itmBomGen, itmCaIntType, itmCompDate, itmDesc, itmEngCode,
				itmStdownDate, itmNxtAct, itmNxtDate, itmNxtTime,
				itmEndownDate, itmQtyCall, itmQtyRcRec, itmQtyRcShip,
				itmQtyRec, itmQtyShip, itmRecDate, itmRoute, itmRouteGen,
				itmSadLine, itmSaNbr, itmShipDate, itmStatus, itmSvcType,
				itmSvCode, itmTaxable, itmTaxc, itmTaxUsage, itmChr01,
				itmChr02, itmChr03, itmChr04, itmDec01, itmDec02, itmDec03,
				itmDte01, itmDte02, itmDte03, itmLog01, itmLog02, itmLog03,
				itmQadc01, itmQadc02, itmQadc03, itmQadc04, itmQadd01,
				itmQadd02, itmQadd03, itmQadde01, itmQadde02, itmQadde03,
				itmQadl01, itmQadl02, itmQadl03, itmUnprocessed, itmInvoiced,
				itmUninvoiced, itmExpRec, itmRecorded, itmDueDate,
				itmEndownTime, itmWarrSv, itmSaSv, itmFixPr, itmPrList,
				itmStdownTime, itmStjobDate, itmStjobTime, itmQtyChg, itmTag,
				itmRrcNbr, itmRrcSeq, itmSepDoc, itmSite, itmLoc,
				itmFixedPrice, itmUpdIsb, itmModUserid, itmModDate, itmTaxEnv,
				itmTaxIn, itmEstTime, itmProdLine, itmOverrideLmt, itmEuNbr,
				itmPst, itmAcct, itmSub, itmCc, itmProject, itmDscAcct,
				itmDscSub, itmDscCc, itmDscProject, oidItmDet);
	}

}
