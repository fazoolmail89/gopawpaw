package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TrHist entity. @author MyEclipse Persistence Tools
 */
public class TrHist extends AbstractTrHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrHist() {
	}

	/** minimal constructor */
	public TrHist(TrHistId id, String trBatch, String trShipInvMov,
			String trShipId, Double trExRate2, String trExRatetype,
			Integer trExruSeq, Integer trFldchgCmtindx, Double oidTrHist) {
		super(id, trBatch, trShipInvMov, trShipId, trExRate2, trExRatetype,
				trExruSeq, trFldchgCmtindx, oidTrHist);
	}

	/** full constructor */
	public TrHist(TrHistId id, String trPart, Date trDate, Date trPerDate,
			String trType, String trLoc, Double trLocBegin, Double trBeginQoh,
			Double trQtyReq, Double trQtyChg, Double trQtyShort, String trUm,
			Date trLastDate, String trNbr, String trSoJob, String trShipType,
			String trAddr, String trRmks, String trXdrAcct, String trXcrAcct,
			Double trMtlStd, Double trLbrStd, Double trBdnStd, Double trPrice,
			Double trGlAmt, String trXdrCc, String trXcrCc, String trLot,
			Double trSubStd, Date trGlDate, Double trQtyLoc, String trUserid,
			String trSerial, Date trEffdate, String trProdLine,
			String trXslspsn1, String trXslspsn2, String trXcrProj,
			String trXdrProj, Integer trLine, String trUser1, String trUser2,
			String trCurr, Double trExRate, String trRev, Integer trTime,
			Double trOvhStd, String trSite, String trStatus, String trGrade,
			Date trExpire, Double trAssay, String trXglRef, String trChr01,
			String trChr02, String trChr03, String trChr04, String trChr05,
			String trChr06, String trChr07, String trChr08, String trChr09,
			String trChr10, String trChr11, String trChr12, String trChr13,
			String trChr14, String trChr15, Date trDte01, Date trDte02,
			Date trDte03, Date trDte04, Date trDte05, Double trDec01,
			Double trDec02, Double trDec03, Double trDec04, Double trDec05,
			Boolean trLog01, Boolean trLog02, String trRef, Integer trMsg,
			String trProgram, Integer trOrdRev, String trRefSite, String trFor,
			String trRsnCode, String trDaycode, Date trVendDate,
			String trVendLot, String trSlspsn, String trFsmType,
			Boolean trUpdIsb, Boolean trAutoInstall, String trCaIntType,
			Double trCoveredAmt, String trBatch, String trFcgCode,
			String trFscCode, String trSaNbr, String trSvCode,
			String trEngArea, String trSysProd, String trSvcType,
			Date trCaOpnDate, Double trCprice, String trEngCode,
			Integer trWodOp, String trEnduser, String trShipInvMov,
			Date trShipDate, String trShipId, Double trExRate2,
			String trExRatetype, Integer trExruSeq, Date trPromiseDate,
			Integer trFldchgCmtindx, Double oidTrHist) {
		super(id, trPart, trDate, trPerDate, trType, trLoc, trLocBegin,
				trBeginQoh, trQtyReq, trQtyChg, trQtyShort, trUm, trLastDate,
				trNbr, trSoJob, trShipType, trAddr, trRmks, trXdrAcct,
				trXcrAcct, trMtlStd, trLbrStd, trBdnStd, trPrice, trGlAmt,
				trXdrCc, trXcrCc, trLot, trSubStd, trGlDate, trQtyLoc,
				trUserid, trSerial, trEffdate, trProdLine, trXslspsn1,
				trXslspsn2, trXcrProj, trXdrProj, trLine, trUser1, trUser2,
				trCurr, trExRate, trRev, trTime, trOvhStd, trSite, trStatus,
				trGrade, trExpire, trAssay, trXglRef, trChr01, trChr02,
				trChr03, trChr04, trChr05, trChr06, trChr07, trChr08, trChr09,
				trChr10, trChr11, trChr12, trChr13, trChr14, trChr15, trDte01,
				trDte02, trDte03, trDte04, trDte05, trDec01, trDec02, trDec03,
				trDec04, trDec05, trLog01, trLog02, trRef, trMsg, trProgram,
				trOrdRev, trRefSite, trFor, trRsnCode, trDaycode, trVendDate,
				trVendLot, trSlspsn, trFsmType, trUpdIsb, trAutoInstall,
				trCaIntType, trCoveredAmt, trBatch, trFcgCode, trFscCode,
				trSaNbr, trSvCode, trEngArea, trSysProd, trSvcType,
				trCaOpnDate, trCprice, trEngCode, trWodOp, trEnduser,
				trShipInvMov, trShipDate, trShipId, trExRate2, trExRatetype,
				trExruSeq, trPromiseDate, trFldchgCmtindx, oidTrHist);
	}

}
