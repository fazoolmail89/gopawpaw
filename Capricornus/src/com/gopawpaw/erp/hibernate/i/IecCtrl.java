package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IecCtrl entity. @author MyEclipse Persistence Tools
 */
public class IecCtrl extends AbstractIecCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IecCtrl() {
	}

	/** minimal constructor */
	public IecCtrl(String iecActInTypeList, String iecActExTypeList,
			String iecCorrFlowArr, String iecCorrFlowDisp,
			Boolean iecUseExtrastat, Boolean iecContainer,
			Integer iecPreference, Double oidIecCtrl) {
		super(iecActInTypeList, iecActExTypeList, iecCorrFlowArr,
				iecCorrFlowDisp, iecUseExtrastat, iecContainer, iecPreference,
				oidIecCtrl);
	}

	/** full constructor */
	public IecCtrl(String iecAuthority, String iecAgent, String iecAgentId,
			String iecComCode, String iecDeclarant, String iecDeclarantId,
			String iecFlowArr, String iecFlowDisp, Boolean iecInclMemo,
			String iecIntComCode, String iecModeTransp, String iecNatTrans,
			Double iecNetWtMin, String iecNetWtUm, String iecPortArrdisp,
			String iecPortTransh, String iecRefLogic, String iecStatProc,
			String iecTermsDeliv, Boolean iecUseInstat, Integer iecQadi02,
			String iecUserid, Date iecModDate, Integer iecQadi01,
			String iecRegion, Integer iecDeclarationId, String iecChr01,
			String iecChr02, String iecChr03, String iecChr04, Double iecDec01,
			Boolean iecLog01, Boolean iecLog02, String iecQadc01,
			String iecQadc02, String iecQadc03, String iecQadc04,
			Double iecQadd01, Boolean iecQadl01, Boolean iecQadl02,
			Boolean iecImpexp, String iecUser1, String iecUser2,
			String iecActInTypeList, String iecActExTypeList,
			String iecCorrFlowArr, String iecCorrFlowDisp,
			Boolean iecUseExtrastat, Boolean iecContainer,
			Integer iecPreference, Double oidIecCtrl) {
		super(iecAuthority, iecAgent, iecAgentId, iecComCode, iecDeclarant,
				iecDeclarantId, iecFlowArr, iecFlowDisp, iecInclMemo,
				iecIntComCode, iecModeTransp, iecNatTrans, iecNetWtMin,
				iecNetWtUm, iecPortArrdisp, iecPortTransh, iecRefLogic,
				iecStatProc, iecTermsDeliv, iecUseInstat, iecQadi02, iecUserid,
				iecModDate, iecQadi01, iecRegion, iecDeclarationId, iecChr01,
				iecChr02, iecChr03, iecChr04, iecDec01, iecLog01, iecLog02,
				iecQadc01, iecQadc02, iecQadc03, iecQadc04, iecQadd01,
				iecQadl01, iecQadl02, iecImpexp, iecUser1, iecUser2,
				iecActInTypeList, iecActExTypeList, iecCorrFlowArr,
				iecCorrFlowDisp, iecUseExtrastat, iecContainer, iecPreference,
				oidIecCtrl);
	}

}
