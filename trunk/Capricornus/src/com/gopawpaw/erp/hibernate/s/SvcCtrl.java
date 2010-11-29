package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SvcCtrl entity. @author MyEclipse Persistence Tools
 */
public class SvcCtrl extends AbstractSvcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SvcCtrl() {
	}

	/** minimal constructor */
	public SvcCtrl(SvcCtrlId id, Boolean svcPvmCl, Integer svcQadi04,
			String svcCaEstTrv, Boolean svcCaModel, Integer svcProjectHndl,
			Double oidSvcCtrl) {
		super(id, svcPvmCl, svcQadi04, svcCaEstTrv, svcCaModel, svcProjectHndl,
				oidSvcCtrl);
	}

	/** full constructor */
	public SvcCtrl(SvcCtrlId id, String svcCode, Integer svcDfltPri,
			Boolean svcPrt0itm, Boolean svcDispatch, Boolean svcPtIsb,
			String svcEngLbcd, Boolean svcShipIsb, String svcDfltCyc,
			Integer svcHoldCall, String svcDfltTm, Boolean svcCmmts,
			String svcDfltQue, String svcTrvlUm, String svcSite, String svcLoc,
			String svcUm, Boolean svcAutoExt, Boolean svcArears,
			String svcOpen, String svcClose, Boolean svcPerBill,
			Boolean svcProrate, Boolean svcAutoTim, String svcSysType,
			Integer svcQueProg, String svcCallPre, String svcChr01,
			String svcChr02, String svcChr03, String svcChr04, String svcChr05,
			String svcChr06, Boolean svcLog01, Boolean svcLog02,
			Boolean svcLog03, Boolean svcLog04, Boolean svcLog05,
			Boolean svcLog06, Boolean svcLog07, String svcChr07,
			String svcChr08, String svcChr09, String svcChr10,
			Boolean svcLog08, Boolean svcLog09, Boolean svcLog10,
			Double svcDec01, Double svcDec02, Double svcDec03, Double svcDec04,
			Double svcPlstPct, Boolean svcInstCl, String svcSrstatus,
			String svcSrPre, Integer svcQuePaus, String svcSerial,
			Boolean svcPtMstr, Boolean svcSubCvr, String svcSrrClose,
			String svcSrrOpen, Boolean svcIsbNsbom, Boolean svcPtProd,
			Integer svcInsDays, String svcSapBomType, Boolean svcWarrSt,
			Boolean svcSaAccounts, Boolean svcIsbHist, Boolean svcRmaHist,
			Boolean svcQadl07, String svcCaPvmType, String svcCaUpdType,
			Boolean svcPvmCl, String svcCaInsType, String svcCaCorType,
			String svcCaTecType, Boolean svcCaTimeWnd, Boolean svcCaWoWnd,
			Boolean svcCreateCus, Boolean svcBill, String svcCallPdev,
			String svcGwCd, String svcSvCd, String svcTmCd, String svcWarrCd,
			Boolean svcAutorenew, String svcUser1, String svcUser2,
			Boolean svcAssignEng, Boolean svcAvoidance, Integer svcQadi04,
			String svcCaEstTime, String svcCaEstTrv, Boolean svcQadl04,
			Boolean svcCaModel, Boolean svcCaSys, String svcChgCd,
			String svcChgSvcode, Boolean svcCpCauser, Boolean svcCpSauser,
			String svcEscDflt, Integer svcEscPause, String svcEscPrt,
			Boolean svcEscSch, String svcEscUser, Boolean svcFaultCode,
			Boolean svcGen0itm, String svcGwSvcode, Boolean svcIsbBom,
			Boolean svcIsbCompbom, String svcIsbRepair, Boolean svcIvcHold,
			Boolean svcMandPo, Boolean svcSaAccount, String svcSaCd,
			Boolean svcScheduleCa, Boolean svcTempClose, String svcTempCus,
			Integer svcTimeZone, Integer svcTravelStep, String svcWarrSvcode,
			Boolean svcQadl06, Boolean svcAckLetter, String svcServerTimezone,
			String svcCompStatus, String svcConFscCode, String svcEgTaxUsage,
			String svcExchUm, String svcExTaxUsage, String svcFixedUm,
			String svcHoldStatus, String svcInvoiceSts, Boolean svcCaInvDraft,
			Boolean svcCloseRecord, String svcLbTaxUsage,
			Boolean svcPcListType, String svcPtsFscCode, String svcPtTaxUsage,
			String svcTaxEnviron, Boolean svcTrace, String svcWaitStatus,
			Integer svcScheduler, String svcCanclStatus,
			Boolean svcInvoiceAcct, Boolean svcCaCoverage,
			Boolean svcCaAllowInv, Boolean svcCaPrint0, String svcReturnSts,
			String svcScrapSts, Boolean svcInvoiceCost, Boolean svcRcTransfer,
			String svcDfltWarr, String svcPmEstTime, String svcUpdEstTime,
			String svcInstEstTime, String svcCorrEstTime, String svcWkctr,
			String svcDbTimezone, String svcQadc03, Date svcQadt01,
			Date svcQadt02, Date svcQadt03, Double svcQadd01, Double svcQadd02,
			Double svcQadd03, Integer svcProjectHndl, Integer svcQadi02,
			Integer svcQadi03, Boolean svcQadl01, Boolean svcQadl02,
			Boolean svcQadl03, String svcModUserid, Date svcModDate,
			Boolean svcMultiTimeZones, Boolean svcItmData, String svcQadc04,
			String svcQadc05, Integer svcQadi05, Double oidSvcCtrl) {
		super(id, svcCode, svcDfltPri, svcPrt0itm, svcDispatch, svcPtIsb,
				svcEngLbcd, svcShipIsb, svcDfltCyc, svcHoldCall, svcDfltTm,
				svcCmmts, svcDfltQue, svcTrvlUm, svcSite, svcLoc, svcUm,
				svcAutoExt, svcArears, svcOpen, svcClose, svcPerBill,
				svcProrate, svcAutoTim, svcSysType, svcQueProg, svcCallPre,
				svcChr01, svcChr02, svcChr03, svcChr04, svcChr05, svcChr06,
				svcLog01, svcLog02, svcLog03, svcLog04, svcLog05, svcLog06,
				svcLog07, svcChr07, svcChr08, svcChr09, svcChr10, svcLog08,
				svcLog09, svcLog10, svcDec01, svcDec02, svcDec03, svcDec04,
				svcPlstPct, svcInstCl, svcSrstatus, svcSrPre, svcQuePaus,
				svcSerial, svcPtMstr, svcSubCvr, svcSrrClose, svcSrrOpen,
				svcIsbNsbom, svcPtProd, svcInsDays, svcSapBomType, svcWarrSt,
				svcSaAccounts, svcIsbHist, svcRmaHist, svcQadl07, svcCaPvmType,
				svcCaUpdType, svcPvmCl, svcCaInsType, svcCaCorType,
				svcCaTecType, svcCaTimeWnd, svcCaWoWnd, svcCreateCus, svcBill,
				svcCallPdev, svcGwCd, svcSvCd, svcTmCd, svcWarrCd,
				svcAutorenew, svcUser1, svcUser2, svcAssignEng, svcAvoidance,
				svcQadi04, svcCaEstTime, svcCaEstTrv, svcQadl04, svcCaModel,
				svcCaSys, svcChgCd, svcChgSvcode, svcCpCauser, svcCpSauser,
				svcEscDflt, svcEscPause, svcEscPrt, svcEscSch, svcEscUser,
				svcFaultCode, svcGen0itm, svcGwSvcode, svcIsbBom,
				svcIsbCompbom, svcIsbRepair, svcIvcHold, svcMandPo,
				svcSaAccount, svcSaCd, svcScheduleCa, svcTempClose, svcTempCus,
				svcTimeZone, svcTravelStep, svcWarrSvcode, svcQadl06,
				svcAckLetter, svcServerTimezone, svcCompStatus, svcConFscCode,
				svcEgTaxUsage, svcExchUm, svcExTaxUsage, svcFixedUm,
				svcHoldStatus, svcInvoiceSts, svcCaInvDraft, svcCloseRecord,
				svcLbTaxUsage, svcPcListType, svcPtsFscCode, svcPtTaxUsage,
				svcTaxEnviron, svcTrace, svcWaitStatus, svcScheduler,
				svcCanclStatus, svcInvoiceAcct, svcCaCoverage, svcCaAllowInv,
				svcCaPrint0, svcReturnSts, svcScrapSts, svcInvoiceCost,
				svcRcTransfer, svcDfltWarr, svcPmEstTime, svcUpdEstTime,
				svcInstEstTime, svcCorrEstTime, svcWkctr, svcDbTimezone,
				svcQadc03, svcQadt01, svcQadt02, svcQadt03, svcQadd01,
				svcQadd02, svcQadd03, svcProjectHndl, svcQadi02, svcQadi03,
				svcQadl01, svcQadl02, svcQadl03, svcModUserid, svcModDate,
				svcMultiTimeZones, svcItmData, svcQadc04, svcQadc05, svcQadi05,
				oidSvcCtrl);
	}

}
