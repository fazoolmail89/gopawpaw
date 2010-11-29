package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FnhHist entity. @author MyEclipse Persistence Tools
 */
public class FnhHist extends AbstractFnhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FnhHist() {
	}

	/** minimal constructor */
	public FnhHist(FnhHistId id, Boolean fnhTopLevel, Double oidFnhHist) {
		super(id, fnhTopLevel, oidFnhHist);
	}

	/** full constructor */
	public FnhHist(FnhHistId id, Boolean fnhAccountEng, String fnhCaDesc,
			String fnhCaIntType, Integer fnhCaPri, String fnhCaProblem,
			String fnhCaQue, String fnhCaSeverity, String fnhCaStatus,
			String fnhCaType, Integer fnhCmtindx, Boolean fnhCombine,
			Boolean fnhComplete, Date fnhCompDate, Boolean fnhCopyEcoCmt,
			String fnhDesc, Date fnhEntDate, String fnhEscNbr,
			String fnhFromEuNbr, String fnhFromPart, String fnhFromSerial,
			Date fnhFrShipDate, Boolean fnhGenerated, Date fnhModDate,
			String fnhToEuNbr, String fnhToPart, String fnhToSerial,
			Date fnhToShipDate, String fnhChr01, String fnhChr02,
			String fnhChr03, String fnhChr04, Double fnhDec01, Double fnhDec02,
			Double fnhDec03, Date fnhDte01, Date fnhDte02, Date fnhDte03,
			Boolean fnhLog01, Boolean fnhLog02, Boolean fnhLog03,
			String fnhQadc01, String fnhQadc02, String fnhQadc03,
			String fnhQadc04, Date fnhQadt01, Date fnhQadt02, Date fnhQadt03,
			Double fnhQade01, Double fnhQade02, Double fnhQade03,
			Boolean fnhQadl01, Boolean fnhTopLevel, Boolean fnhQadl03,
			String fnhFromCaNbr, String fnhToCaNbr, String fnhModel,
			String fnhDocument, String fnhUser1, String fnhUser2,
			String fnhModUserid, String fnhEntUserid, Date fnhCaOpnDate,
			Boolean fnhCopyCmmts, Boolean fnhQadl04, Double oidFnhHist) {
		super(id, fnhAccountEng, fnhCaDesc, fnhCaIntType, fnhCaPri,
				fnhCaProblem, fnhCaQue, fnhCaSeverity, fnhCaStatus, fnhCaType,
				fnhCmtindx, fnhCombine, fnhComplete, fnhCompDate,
				fnhCopyEcoCmt, fnhDesc, fnhEntDate, fnhEscNbr, fnhFromEuNbr,
				fnhFromPart, fnhFromSerial, fnhFrShipDate, fnhGenerated,
				fnhModDate, fnhToEuNbr, fnhToPart, fnhToSerial, fnhToShipDate,
				fnhChr01, fnhChr02, fnhChr03, fnhChr04, fnhDec01, fnhDec02,
				fnhDec03, fnhDte01, fnhDte02, fnhDte03, fnhLog01, fnhLog02,
				fnhLog03, fnhQadc01, fnhQadc02, fnhQadc03, fnhQadc04,
				fnhQadt01, fnhQadt02, fnhQadt03, fnhQade01, fnhQade02,
				fnhQade03, fnhQadl01, fnhTopLevel, fnhQadl03, fnhFromCaNbr,
				fnhToCaNbr, fnhModel, fnhDocument, fnhUser1, fnhUser2,
				fnhModUserid, fnhEntUserid, fnhCaOpnDate, fnhCopyCmmts,
				fnhQadl04, oidFnhHist);
	}

}
