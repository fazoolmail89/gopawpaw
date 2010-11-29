package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IehHist entity. @author MyEclipse Persistence Tools
 */
public class IehHist extends AbstractIehHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IehHist() {
	}

	/** minimal constructor */
	public IehHist(IehHistId id, Date iehRefDate, Boolean iehCorrection,
			String iehOrigDoc, Integer iehOrigMonth, Integer iehOrigYear,
			String iehAffiliation, Boolean iehContainer, Integer iehCsa,
			String iehDeclRegion, String iehItemSpec, Integer iehPreference,
			String iehReqNbr, String iehShipvia, Integer iehTrnbr,
			Double oidIehHist) {
		super(id, iehRefDate, iehCorrection, iehOrigDoc, iehOrigMonth,
				iehOrigYear, iehAffiliation, iehContainer, iehCsa,
				iehDeclRegion, iehItemSpec, iehPreference, iehReqNbr,
				iehShipvia, iehTrnbr, oidIehHist);
	}

	/** full constructor */
	public IehHist(IehHistId id, String iehAddr, String iehComCode,
			String iehCtryDesdisp, String iehCtryOrigin, String iehAuthority,
			String iehDeclPeriod, String iehDeclYear, Date iehDeclDate,
			String iehDeclarant, Boolean iehReported, Date iehEffdate,
			String iehFlow, String iehInvCur, Date iehInvDate,
			Double iehInvAmtGl, Double iehInvAmtCur, Integer iehLine,
			String iehModeTransp, String iehNatTrans, String iehNbr,
			Double iehNetWt, String iehNetWtUm, String iehPart,
			String iehPortArrdisp, String iehPortTransh, String iehProgram,
			Double iehQty, String iehQtyUm, String iehRef, Date iehRefDate,
			String iehPstId, String iehDeclCur, String iehSite,
			String iehStatProc, Double iehStatVal, Double iehSupplUnits,
			String iehSupplUm, String iehTermsDeliv, String iehRegion,
			Double iehDeclInvAmt, String iehType, String iehVoucher,
			String iehUserid, Date iehModDate, Double iehDeclStatval,
			Integer iehDeclarationId, String iehChr01, String iehChr02,
			String iehChr03, String iehChr04, String iehChr05, Double iehDec01,
			Double iehDec02, Double iehDec03, Double iehDec04, Double iehDec05,
			Date iehDte01, Date iehDte02, Date iehDte03, Date iehDte04,
			Date iehDte05, String iehDeclarantId, String iehAgent,
			String iehAgentId, String iehQadc04, String iehQadc05,
			String iehQadc06, String iehQadc07, String iehQadc08,
			String iehQadc09, String iehQadc10, Integer iehQadi01,
			Double iehQadd01, Double iehQadd02, Double iehQadd03,
			Double iehQadd04, Double iehQadd05, Double iehQadd06,
			Boolean iehQadl01, Boolean iehQadl02, Date iehQadt01,
			Date iehQadt02, String iehUser1, String iehUser2,
			Boolean iehCorrection, String iehOrigDoc, Integer iehOrigMonth,
			Integer iehOrigYear, String iehAffiliation, Boolean iehContainer,
			Integer iehCsa, String iehDeclRegion, String iehItemSpec,
			Integer iehPreference, String iehReqNbr, String iehShipvia,
			Integer iehTrnbr, Double oidIehHist) {
		super(id, iehAddr, iehComCode, iehCtryDesdisp, iehCtryOrigin,
				iehAuthority, iehDeclPeriod, iehDeclYear, iehDeclDate,
				iehDeclarant, iehReported, iehEffdate, iehFlow, iehInvCur,
				iehInvDate, iehInvAmtGl, iehInvAmtCur, iehLine, iehModeTransp,
				iehNatTrans, iehNbr, iehNetWt, iehNetWtUm, iehPart,
				iehPortArrdisp, iehPortTransh, iehProgram, iehQty, iehQtyUm,
				iehRef, iehRefDate, iehPstId, iehDeclCur, iehSite, iehStatProc,
				iehStatVal, iehSupplUnits, iehSupplUm, iehTermsDeliv,
				iehRegion, iehDeclInvAmt, iehType, iehVoucher, iehUserid,
				iehModDate, iehDeclStatval, iehDeclarationId, iehChr01,
				iehChr02, iehChr03, iehChr04, iehChr05, iehDec01, iehDec02,
				iehDec03, iehDec04, iehDec05, iehDte01, iehDte02, iehDte03,
				iehDte04, iehDte05, iehDeclarantId, iehAgent, iehAgentId,
				iehQadc04, iehQadc05, iehQadc06, iehQadc07, iehQadc08,
				iehQadc09, iehQadc10, iehQadi01, iehQadd01, iehQadd02,
				iehQadd03, iehQadd04, iehQadd05, iehQadd06, iehQadl01,
				iehQadl02, iehQadt01, iehQadt02, iehUser1, iehUser2,
				iehCorrection, iehOrigDoc, iehOrigMonth, iehOrigYear,
				iehAffiliation, iehContainer, iehCsa, iehDeclRegion,
				iehItemSpec, iehPreference, iehReqNbr, iehShipvia, iehTrnbr,
				oidIehHist);
	}

}
