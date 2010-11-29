package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FnMstr entity. @author MyEclipse Persistence Tools
 */
public class FnMstr extends AbstractFnMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FnMstr() {
	}

	/** minimal constructor */
	public FnMstr(FnMstrId id, Boolean fnTopLevel, Double oidFnMstr) {
		super(id, fnTopLevel, oidFnMstr);
	}

	/** full constructor */
	public FnMstr(FnMstrId id, Boolean fnAccountEng, String fnCaDesc,
			String fnCaIntType, Integer fnCaPri, String fnCaProblem,
			String fnCaQue, String fnCaSeverity, String fnCaStatus,
			String fnCaType, Integer fnCmtindx, Boolean fnCombine,
			Date fnCombDate, Boolean fnComplete, Date fnCompDate,
			Boolean fnCopyEcoCmt, String fnDesc, Date fnEffDate,
			Date fnEntDate, String fnEsNbr, String fnFromEuNbr,
			String fnFromPart, String fnFromSerial, Date fnFrShipDate,
			Boolean fnGenerated, Date fnModDate, String fnToEuNbr,
			String fnToPart, String fnToSerial, Date fnToShipDate,
			String fnModUserid, String fnEntUserid, String fnDocument,
			String fnModel, String fnUser1, String fnUser2, String fnChr01,
			String fnChr02, String fnChr03, String fnChr04, Double fnDec01,
			Double fnDec02, Double fnDec03, Date fnDte01, Date fnDte02,
			Date fnDte03, Boolean fnLog01, Boolean fnLog02, Boolean fnLog03,
			String fnQadc01, String fnQadc02, String fnQadc03, String fnQadc04,
			Date fnQadt01, Date fnQadt02, Date fnQadt03, Double fnQade01,
			Double fnQade02, Double fnQade03, Boolean fnQadl01,
			Boolean fnTopLevel, Boolean fnQadl03, Date fnCaOpnDate,
			Boolean fnCopyCmmts, Boolean fnQadl04, Double oidFnMstr) {
		super(id, fnAccountEng, fnCaDesc, fnCaIntType, fnCaPri, fnCaProblem,
				fnCaQue, fnCaSeverity, fnCaStatus, fnCaType, fnCmtindx,
				fnCombine, fnCombDate, fnComplete, fnCompDate, fnCopyEcoCmt,
				fnDesc, fnEffDate, fnEntDate, fnEsNbr, fnFromEuNbr, fnFromPart,
				fnFromSerial, fnFrShipDate, fnGenerated, fnModDate, fnToEuNbr,
				fnToPart, fnToSerial, fnToShipDate, fnModUserid, fnEntUserid,
				fnDocument, fnModel, fnUser1, fnUser2, fnChr01, fnChr02,
				fnChr03, fnChr04, fnDec01, fnDec02, fnDec03, fnDte01, fnDte02,
				fnDte03, fnLog01, fnLog02, fnLog03, fnQadc01, fnQadc02,
				fnQadc03, fnQadc04, fnQadt01, fnQadt02, fnQadt03, fnQade01,
				fnQade02, fnQade03, fnQadl01, fnTopLevel, fnQadl03,
				fnCaOpnDate, fnCopyCmmts, fnQadl04, oidFnMstr);
	}

}
