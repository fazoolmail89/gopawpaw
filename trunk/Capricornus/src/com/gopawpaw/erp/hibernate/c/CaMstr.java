package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CaMstr entity. @author MyEclipse Persistence Tools
 */
public class CaMstr extends AbstractCaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CaMstr() {
	}

	/** minimal constructor */
	public CaMstr(CaMstrId id, Boolean caEuChanged, Double caExRate2,
			String caExRatetype, Integer caExruSeq, String caPrjNbr,
			String caDefWs, Boolean caUpdIsb, Double oidCaMstr) {
		super(id, caEuChanged, caExRate2, caExRatetype, caExruSeq, caPrjNbr,
				caDefWs, caUpdIsb, oidCaMstr);
	}

	/** full constructor */
	public CaMstr(CaMstrId id, Date caNxtDate, Integer caNxtTim, String caQue,
			String caAssign, String caEuNbr, String caEnterBy, String caStatus,
			String caType, String caPart, String caSerial, String caNxtAct,
			String caSoNbr, String caName, String caPhone, String caProblem,
			String caResolve, Integer caPri, String caDesc, Date caEvtDate,
			Integer caEvtTim, Integer caCmtindx, String caChr01,
			String caChr02, String caChr03, String caChr04, String caChr05,
			Double caDec01, String caChr06, String caChr07, String caChr08,
			String caChr09, String caChr10, Date caDte01, Date caDte02,
			Date caDte03, Date caDte04, Date caDte05, Double caDec02,
			Double caDec03, Boolean caLog01, Boolean caLog02, Boolean caLog03,
			Boolean caLog04, Boolean caLog05, String caArea, Integer caTrvDist,
			String caTrvUm, String caSvCode, String caFromQue, Date caSntDate,
			Integer caSntTime, String caRmaNbr, String caCode, Integer caSeq,
			String caNxtTime, String caEvtTime, Date caOpnDate,
			String caOpnTime, Integer caRef, Double caTimeLog, Date caClsDate,
			String caClsTime, String caContract, String caSeverity,
			Integer caCline, String caToQue, Boolean caBilled, String caSr,
			Boolean caActivity, Integer caEcmtindx, String caPoNbr,
			String caQadc04, String caUser1, String caUser2, Boolean caCmmtMod,
			String caCreated, Date caDateStmp, String caEngArea,
			String caEngGroup, String caQadc06, String caEstTime,
			String caEsNbr, Integer caEsSeq, Date caEuDate, String caEuTime,
			String caIntType, Integer caQadi01, String caRev, String caRpBom,
			String caRpRoute, String caSite, String caTimeStmp,
			String caTrvTime, String caQadc05, Boolean caScheduleCa,
			Boolean ca3rdParty, String ca3rdPartyId, Integer caAckCmtindx,
			Boolean caAckLetter, Date caCompDate, String caCompTime,
			String caCrTerms, String caCurr, Boolean caRecorded,
			Double caExRate, String caFnNbr, Boolean caIncStats,
			Boolean caPrinted, String caPrList, Integer caQoCmtindx,
			Boolean caQuote, Double caQuotePrice, String caRcSite,
			String caResolveDesc, Integer caResCmtidx, String caShipTo,
			String caSqNbr, Boolean caSuspended, String caSvcType,
			Boolean caTaxable, String caTaxc, Boolean caWaitingParts,
			String caBill, Double caEntEx, Boolean caInvDraft, String caTaxEnv,
			Boolean caRepairCtr, String caLang, Date caTaxDate,
			Date caQuoteExp, String caRrcNbr, Integer caRrcSeq,
			String caQadc03, Integer caQadi02, Integer caQadi03,
			Double caQadd01, Double caQadd02, Double caQadd03,
			Boolean caEuChanged, Boolean caQadl02, Boolean caQadl03,
			Date caQadt01, Date caQadt02, Date caQadt03, String caModUserid,
			Date caModDate, String caCustomer, String caTaxUsage,
			Double caTaxPct, String caQuoteNbr, Boolean caFixRate,
			String caChannel, Double caExRate2, String caExRatetype,
			Integer caExruSeq, Boolean caQadl04, Date caEndDate,
			Date caStartDate, String caPrjNbr, String caDefWs,
			Boolean caUpdIsb, Double oidCaMstr) {
		super(id, caNxtDate, caNxtTim, caQue, caAssign, caEuNbr, caEnterBy,
				caStatus, caType, caPart, caSerial, caNxtAct, caSoNbr, caName,
				caPhone, caProblem, caResolve, caPri, caDesc, caEvtDate,
				caEvtTim, caCmtindx, caChr01, caChr02, caChr03, caChr04,
				caChr05, caDec01, caChr06, caChr07, caChr08, caChr09, caChr10,
				caDte01, caDte02, caDte03, caDte04, caDte05, caDec02, caDec03,
				caLog01, caLog02, caLog03, caLog04, caLog05, caArea, caTrvDist,
				caTrvUm, caSvCode, caFromQue, caSntDate, caSntTime, caRmaNbr,
				caCode, caSeq, caNxtTime, caEvtTime, caOpnDate, caOpnTime,
				caRef, caTimeLog, caClsDate, caClsTime, caContract, caSeverity,
				caCline, caToQue, caBilled, caSr, caActivity, caEcmtindx,
				caPoNbr, caQadc04, caUser1, caUser2, caCmmtMod, caCreated,
				caDateStmp, caEngArea, caEngGroup, caQadc06, caEstTime,
				caEsNbr, caEsSeq, caEuDate, caEuTime, caIntType, caQadi01,
				caRev, caRpBom, caRpRoute, caSite, caTimeStmp, caTrvTime,
				caQadc05, caScheduleCa, ca3rdParty, ca3rdPartyId, caAckCmtindx,
				caAckLetter, caCompDate, caCompTime, caCrTerms, caCurr,
				caRecorded, caExRate, caFnNbr, caIncStats, caPrinted, caPrList,
				caQoCmtindx, caQuote, caQuotePrice, caRcSite, caResolveDesc,
				caResCmtidx, caShipTo, caSqNbr, caSuspended, caSvcType,
				caTaxable, caTaxc, caWaitingParts, caBill, caEntEx, caInvDraft,
				caTaxEnv, caRepairCtr, caLang, caTaxDate, caQuoteExp, caRrcNbr,
				caRrcSeq, caQadc03, caQadi02, caQadi03, caQadd01, caQadd02,
				caQadd03, caEuChanged, caQadl02, caQadl03, caQadt01, caQadt02,
				caQadt03, caModUserid, caModDate, caCustomer, caTaxUsage,
				caTaxPct, caQuoteNbr, caFixRate, caChannel, caExRate2,
				caExRatetype, caExruSeq, caQadl04, caEndDate, caStartDate,
				caPrjNbr, caDefWs, caUpdIsb, oidCaMstr);
	}

}
