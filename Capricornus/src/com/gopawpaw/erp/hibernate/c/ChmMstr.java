package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * ChmMstr entity. @author MyEclipse Persistence Tools
 */
public class ChmMstr extends AbstractChmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ChmMstr() {
	}

	/** minimal constructor */
	public ChmMstr(ChmMstrId id, String chmIntType, Double chmExRate2,
			String chmExRatetype, Integer chmExruSeq, Double oidChmMstr) {
		super(id, chmIntType, chmExRate2, chmExRatetype, chmExruSeq, oidChmMstr);
	}

	/** full constructor */
	public ChmMstr(ChmMstrId id, String chmDesc, String chmName,
			String chmPhone, String chmPart, String chmSerial, String chmEuNbr,
			String chmSoNbr, String chmRmaNbr, String chmOpnTime,
			Date chmClsDate, String chmClsTime, String chmResolve,
			Integer chmCmtindx, Integer chmRef, String chmProblem,
			String chmContract, String chmChr01, String chmChr02,
			String chmChr03, String chmChr04, String chmChr05, String chmChr06,
			String chmChr07, String chmChr08, String chmChr09, String chmChr10,
			Double chmDec01, Double chmDec02, Double chmDec03, Date chmDte01,
			Date chmDte02, Date chmDte03, Date chmDte04, Boolean chmLog01,
			Boolean chmLog02, Boolean chmLog03, Boolean chmLog04,
			Boolean chmLog05, String chmSvCode, Integer chmCline,
			String chmToQue, String chmSr, String chmSeverity, String chmType,
			String chmUser1, String chmUser2, String chmArea, String chmAssign,
			String chmCreated, Date chmDateStmp, String chmEngArea,
			String chmEngGroup, String chmEstTime, String chmEsNbr,
			Integer chmEsSeq, Date chmEuDate, String chmEuTime,
			String chmIntType, String chmPoNbr, String chmQue, String chmSite,
			Double chmTimeLog, String chmTimeStmp, Integer chmTrvDist,
			String chmTrvTime, String chmTrvUm, String chmWoLot,
			String chmWoNbr, Integer chmAckCmtindx, String chmCompTime,
			Date chmEnddownDate, String chmEnddownTime, String chmPrList,
			Integer chmQoCmtindx, Boolean chmQuote, String chmQuoteCurr,
			Double chmQuotePrice, String chmRcSite, String chmShipTo,
			String chmStatus, Date chmStdownDate, String chmStdownTime,
			Date chmStjobDate, String chmStjobTime, Boolean chm3rdParty,
			String chm3rdPartyId, Boolean chmAckLetter, String chmBill,
			String chmCode, Date chmCompDate, String chmEnterBy,
			String chmFnNbr, String chmFromQue, Boolean chmIncStats,
			Boolean chmInvDraft, Boolean chmPrinted, Integer chmResCmtidx,
			Date chmDte05, String chmCrTerms, String chmCurr,
			Integer chmEcmtindx, String chmResolveDesc, String chmRev,
			String chmSqNbr, String chmSvcType, Boolean chmTaxable,
			String chmTaxc, Double chmExRate, String chmSrvTimezone,
			Boolean chmRepairCtr, String chmEuTimezone, String chmQadc03,
			Integer chmQadi01, Integer chmQadi02, Integer chmQadi03,
			Double chmQadde01, Double chmQadde02, Double chmQadde03,
			Boolean chmQadl04, Boolean chmQadl02, Boolean chmQadl03,
			Date chmQadd01, Date chmQadd02, Date chmQadd03, String chmRpRoute,
			String chmRpBom, Boolean chmScheduleCa, Date chmTaxDate,
			Date chmQuoteExp, Integer chmRrcSeq, String chmRrcNbr,
			String chmCustomer, String chmTaxEnv, String chmTaxUsage,
			Double chmTaxPct, String chmLang, String chmQuoteNbr,
			Double chmEntEx, Boolean chmFixRate, String chmChannel,
			Double chmExRate2, String chmExRatetype, Integer chmExruSeq,
			String chmQadc04, String chmQadc05, String chmQadc06,
			Double oidChmMstr) {
		super(id, chmDesc, chmName, chmPhone, chmPart, chmSerial, chmEuNbr,
				chmSoNbr, chmRmaNbr, chmOpnTime, chmClsDate, chmClsTime,
				chmResolve, chmCmtindx, chmRef, chmProblem, chmContract,
				chmChr01, chmChr02, chmChr03, chmChr04, chmChr05, chmChr06,
				chmChr07, chmChr08, chmChr09, chmChr10, chmDec01, chmDec02,
				chmDec03, chmDte01, chmDte02, chmDte03, chmDte04, chmLog01,
				chmLog02, chmLog03, chmLog04, chmLog05, chmSvCode, chmCline,
				chmToQue, chmSr, chmSeverity, chmType, chmUser1, chmUser2,
				chmArea, chmAssign, chmCreated, chmDateStmp, chmEngArea,
				chmEngGroup, chmEstTime, chmEsNbr, chmEsSeq, chmEuDate,
				chmEuTime, chmIntType, chmPoNbr, chmQue, chmSite, chmTimeLog,
				chmTimeStmp, chmTrvDist, chmTrvTime, chmTrvUm, chmWoLot,
				chmWoNbr, chmAckCmtindx, chmCompTime, chmEnddownDate,
				chmEnddownTime, chmPrList, chmQoCmtindx, chmQuote,
				chmQuoteCurr, chmQuotePrice, chmRcSite, chmShipTo, chmStatus,
				chmStdownDate, chmStdownTime, chmStjobDate, chmStjobTime,
				chm3rdParty, chm3rdPartyId, chmAckLetter, chmBill, chmCode,
				chmCompDate, chmEnterBy, chmFnNbr, chmFromQue, chmIncStats,
				chmInvDraft, chmPrinted, chmResCmtidx, chmDte05, chmCrTerms,
				chmCurr, chmEcmtindx, chmResolveDesc, chmRev, chmSqNbr,
				chmSvcType, chmTaxable, chmTaxc, chmExRate, chmSrvTimezone,
				chmRepairCtr, chmEuTimezone, chmQadc03, chmQadi01, chmQadi02,
				chmQadi03, chmQadde01, chmQadde02, chmQadde03, chmQadl04,
				chmQadl02, chmQadl03, chmQadd01, chmQadd02, chmQadd03,
				chmRpRoute, chmRpBom, chmScheduleCa, chmTaxDate, chmQuoteExp,
				chmRrcSeq, chmRrcNbr, chmCustomer, chmTaxEnv, chmTaxUsage,
				chmTaxPct, chmLang, chmQuoteNbr, chmEntEx, chmFixRate,
				chmChannel, chmExRate2, chmExRatetype, chmExruSeq, chmQadc04,
				chmQadc05, chmQadc06, oidChmMstr);
	}

}
