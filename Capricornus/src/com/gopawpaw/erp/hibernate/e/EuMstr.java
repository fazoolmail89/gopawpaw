package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EuMstr entity. @author MyEclipse Persistence Tools
 */
public class EuMstr extends AbstractEuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EuMstr() {
	}

	/** minimal constructor */
	public EuMstr(EuMstrId id, Double oidEuMstr) {
		super(id, oidEuMstr);
	}

	/** full constructor */
	public EuMstr(EuMstrId id, String euRsb, String euPhone, String euModem,
			String euLogin, String euCmNbr, String euSort, String euChannel,
			String euOffice, String euMsg, String euStatus, Date euMsgEnd,
			String euEngCode, String euSvcArea, Integer euPri, String euLang,
			String euChr01, String euChr02, String euChr03, String euChr04,
			String euChr05, String euStTime, String euEdTime, String euChr06,
			String euChr07, String euChr08, String euChr09, String euChr10,
			Double euDec01, Double euDec02, Double euDec03, Date euDte01,
			Date euDte02, Date euDte03, Date euDte04, Boolean euLog01,
			Boolean euLog02, Boolean euLog03, Boolean euLog04, Boolean euLog05,
			Integer euCmtindx, String euType, String euApplication,
			String euSicCode, Date euReview, String euNode, String euNodeType,
			String euName, Boolean euAutorenew, Double euDiscPct,
			String euUser1, String euUser2, Boolean euCreateIsb,
			String euEngGroup, String euEngSec, String euEsNbr,
			Double euPoAccum, Double euPoLimit, String euPoNbr,
			Boolean euRebuildIsb, Integer euRenewDays, Boolean euReseller,
			Integer euTimeZone, Integer euTrvDist, String euTrvTime,
			String euTrvUm, String euUpdates, Double euUnBilled, String euZip,
			Boolean euSepInvoice, Integer euReceiptDays, Integer euShipDays,
			Boolean euPoReqd, String euQadc01, String euQadc02,
			String euQadc03, Integer euQadi01, Integer euQadi02, Date euQadt01,
			Date euQadt02, Double euQadd01, Boolean euQadl01, Boolean euQadl02,
			Boolean euQadl03, String euModUserid, Date euModDate,
			Double oidEuMstr) {
		super(id, euRsb, euPhone, euModem, euLogin, euCmNbr, euSort, euChannel,
				euOffice, euMsg, euStatus, euMsgEnd, euEngCode, euSvcArea,
				euPri, euLang, euChr01, euChr02, euChr03, euChr04, euChr05,
				euStTime, euEdTime, euChr06, euChr07, euChr08, euChr09,
				euChr10, euDec01, euDec02, euDec03, euDte01, euDte02, euDte03,
				euDte04, euLog01, euLog02, euLog03, euLog04, euLog05,
				euCmtindx, euType, euApplication, euSicCode, euReview, euNode,
				euNodeType, euName, euAutorenew, euDiscPct, euUser1, euUser2,
				euCreateIsb, euEngGroup, euEngSec, euEsNbr, euPoAccum,
				euPoLimit, euPoNbr, euRebuildIsb, euRenewDays, euReseller,
				euTimeZone, euTrvDist, euTrvTime, euTrvUm, euUpdates,
				euUnBilled, euZip, euSepInvoice, euReceiptDays, euShipDays,
				euPoReqd, euQadc01, euQadc02, euQadc03, euQadi01, euQadi02,
				euQadt01, euQadt02, euQadd01, euQadl01, euQadl02, euQadl03,
				euModUserid, euModDate, oidEuMstr);
	}

}
