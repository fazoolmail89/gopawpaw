package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSvcCtrl entity provides the base persistence definition of the
 * SvcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSvcCtrl implements java.io.Serializable {

	// Fields

	private SvcCtrlId id;
	private String svcCode;
	private Integer svcDfltPri;
	private Boolean svcPrt0itm;
	private Boolean svcDispatch;
	private Boolean svcPtIsb;
	private String svcEngLbcd;
	private Boolean svcShipIsb;
	private String svcDfltCyc;
	private Integer svcHoldCall;
	private String svcDfltTm;
	private Boolean svcCmmts;
	private String svcDfltQue;
	private String svcTrvlUm;
	private String svcSite;
	private String svcLoc;
	private String svcUm;
	private Boolean svcAutoExt;
	private Boolean svcArears;
	private String svcOpen;
	private String svcClose;
	private Boolean svcPerBill;
	private Boolean svcProrate;
	private Boolean svcAutoTim;
	private String svcSysType;
	private Integer svcQueProg;
	private String svcCallPre;
	private String svcChr01;
	private String svcChr02;
	private String svcChr03;
	private String svcChr04;
	private String svcChr05;
	private String svcChr06;
	private Boolean svcLog01;
	private Boolean svcLog02;
	private Boolean svcLog03;
	private Boolean svcLog04;
	private Boolean svcLog05;
	private Boolean svcLog06;
	private Boolean svcLog07;
	private String svcChr07;
	private String svcChr08;
	private String svcChr09;
	private String svcChr10;
	private Boolean svcLog08;
	private Boolean svcLog09;
	private Boolean svcLog10;
	private Double svcDec01;
	private Double svcDec02;
	private Double svcDec03;
	private Double svcDec04;
	private Double svcPlstPct;
	private Boolean svcInstCl;
	private String svcSrstatus;
	private String svcSrPre;
	private Integer svcQuePaus;
	private String svcSerial;
	private Boolean svcPtMstr;
	private Boolean svcSubCvr;
	private String svcSrrClose;
	private String svcSrrOpen;
	private Boolean svcIsbNsbom;
	private Boolean svcPtProd;
	private Integer svcInsDays;
	private String svcSapBomType;
	private Boolean svcWarrSt;
	private Boolean svcSaAccounts;
	private Boolean svcIsbHist;
	private Boolean svcRmaHist;
	private Boolean svcQadl07;
	private String svcCaPvmType;
	private String svcCaUpdType;
	private Boolean svcPvmCl;
	private String svcCaInsType;
	private String svcCaCorType;
	private String svcCaTecType;
	private Boolean svcCaTimeWnd;
	private Boolean svcCaWoWnd;
	private Boolean svcCreateCus;
	private Boolean svcBill;
	private String svcCallPdev;
	private String svcGwCd;
	private String svcSvCd;
	private String svcTmCd;
	private String svcWarrCd;
	private Boolean svcAutorenew;
	private String svcUser1;
	private String svcUser2;
	private Boolean svcAssignEng;
	private Boolean svcAvoidance;
	private Integer svcQadi04;
	private String svcCaEstTime;
	private String svcCaEstTrv;
	private Boolean svcQadl04;
	private Boolean svcCaModel;
	private Boolean svcCaSys;
	private String svcChgCd;
	private String svcChgSvcode;
	private Boolean svcCpCauser;
	private Boolean svcCpSauser;
	private String svcEscDflt;
	private Integer svcEscPause;
	private String svcEscPrt;
	private Boolean svcEscSch;
	private String svcEscUser;
	private Boolean svcFaultCode;
	private Boolean svcGen0itm;
	private String svcGwSvcode;
	private Boolean svcIsbBom;
	private Boolean svcIsbCompbom;
	private String svcIsbRepair;
	private Boolean svcIvcHold;
	private Boolean svcMandPo;
	private Boolean svcSaAccount;
	private String svcSaCd;
	private Boolean svcScheduleCa;
	private Boolean svcTempClose;
	private String svcTempCus;
	private Integer svcTimeZone;
	private Integer svcTravelStep;
	private String svcWarrSvcode;
	private Boolean svcQadl06;
	private Boolean svcAckLetter;
	private String svcServerTimezone;
	private String svcCompStatus;
	private String svcConFscCode;
	private String svcEgTaxUsage;
	private String svcExchUm;
	private String svcExTaxUsage;
	private String svcFixedUm;
	private String svcHoldStatus;
	private String svcInvoiceSts;
	private Boolean svcCaInvDraft;
	private Boolean svcCloseRecord;
	private String svcLbTaxUsage;
	private Boolean svcPcListType;
	private String svcPtsFscCode;
	private String svcPtTaxUsage;
	private String svcTaxEnviron;
	private Boolean svcTrace;
	private String svcWaitStatus;
	private Integer svcScheduler;
	private String svcCanclStatus;
	private Boolean svcInvoiceAcct;
	private Boolean svcCaCoverage;
	private Boolean svcCaAllowInv;
	private Boolean svcCaPrint0;
	private String svcReturnSts;
	private String svcScrapSts;
	private Boolean svcInvoiceCost;
	private Boolean svcRcTransfer;
	private String svcDfltWarr;
	private String svcPmEstTime;
	private String svcUpdEstTime;
	private String svcInstEstTime;
	private String svcCorrEstTime;
	private String svcWkctr;
	private String svcDbTimezone;
	private String svcQadc03;
	private Date svcQadt01;
	private Date svcQadt02;
	private Date svcQadt03;
	private Double svcQadd01;
	private Double svcQadd02;
	private Double svcQadd03;
	private Integer svcProjectHndl;
	private Integer svcQadi02;
	private Integer svcQadi03;
	private Boolean svcQadl01;
	private Boolean svcQadl02;
	private Boolean svcQadl03;
	private String svcModUserid;
	private Date svcModDate;
	private Boolean svcMultiTimeZones;
	private Boolean svcItmData;
	private String svcQadc04;
	private String svcQadc05;
	private Integer svcQadi05;
	private Double oidSvcCtrl;

	// Constructors

	/** default constructor */
	public AbstractSvcCtrl() {
	}

	/** minimal constructor */
	public AbstractSvcCtrl(SvcCtrlId id, Boolean svcPvmCl, Integer svcQadi04,
			String svcCaEstTrv, Boolean svcCaModel, Integer svcProjectHndl,
			Double oidSvcCtrl) {
		this.id = id;
		this.svcPvmCl = svcPvmCl;
		this.svcQadi04 = svcQadi04;
		this.svcCaEstTrv = svcCaEstTrv;
		this.svcCaModel = svcCaModel;
		this.svcProjectHndl = svcProjectHndl;
		this.oidSvcCtrl = oidSvcCtrl;
	}

	/** full constructor */
	public AbstractSvcCtrl(SvcCtrlId id, String svcCode, Integer svcDfltPri,
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
		this.id = id;
		this.svcCode = svcCode;
		this.svcDfltPri = svcDfltPri;
		this.svcPrt0itm = svcPrt0itm;
		this.svcDispatch = svcDispatch;
		this.svcPtIsb = svcPtIsb;
		this.svcEngLbcd = svcEngLbcd;
		this.svcShipIsb = svcShipIsb;
		this.svcDfltCyc = svcDfltCyc;
		this.svcHoldCall = svcHoldCall;
		this.svcDfltTm = svcDfltTm;
		this.svcCmmts = svcCmmts;
		this.svcDfltQue = svcDfltQue;
		this.svcTrvlUm = svcTrvlUm;
		this.svcSite = svcSite;
		this.svcLoc = svcLoc;
		this.svcUm = svcUm;
		this.svcAutoExt = svcAutoExt;
		this.svcArears = svcArears;
		this.svcOpen = svcOpen;
		this.svcClose = svcClose;
		this.svcPerBill = svcPerBill;
		this.svcProrate = svcProrate;
		this.svcAutoTim = svcAutoTim;
		this.svcSysType = svcSysType;
		this.svcQueProg = svcQueProg;
		this.svcCallPre = svcCallPre;
		this.svcChr01 = svcChr01;
		this.svcChr02 = svcChr02;
		this.svcChr03 = svcChr03;
		this.svcChr04 = svcChr04;
		this.svcChr05 = svcChr05;
		this.svcChr06 = svcChr06;
		this.svcLog01 = svcLog01;
		this.svcLog02 = svcLog02;
		this.svcLog03 = svcLog03;
		this.svcLog04 = svcLog04;
		this.svcLog05 = svcLog05;
		this.svcLog06 = svcLog06;
		this.svcLog07 = svcLog07;
		this.svcChr07 = svcChr07;
		this.svcChr08 = svcChr08;
		this.svcChr09 = svcChr09;
		this.svcChr10 = svcChr10;
		this.svcLog08 = svcLog08;
		this.svcLog09 = svcLog09;
		this.svcLog10 = svcLog10;
		this.svcDec01 = svcDec01;
		this.svcDec02 = svcDec02;
		this.svcDec03 = svcDec03;
		this.svcDec04 = svcDec04;
		this.svcPlstPct = svcPlstPct;
		this.svcInstCl = svcInstCl;
		this.svcSrstatus = svcSrstatus;
		this.svcSrPre = svcSrPre;
		this.svcQuePaus = svcQuePaus;
		this.svcSerial = svcSerial;
		this.svcPtMstr = svcPtMstr;
		this.svcSubCvr = svcSubCvr;
		this.svcSrrClose = svcSrrClose;
		this.svcSrrOpen = svcSrrOpen;
		this.svcIsbNsbom = svcIsbNsbom;
		this.svcPtProd = svcPtProd;
		this.svcInsDays = svcInsDays;
		this.svcSapBomType = svcSapBomType;
		this.svcWarrSt = svcWarrSt;
		this.svcSaAccounts = svcSaAccounts;
		this.svcIsbHist = svcIsbHist;
		this.svcRmaHist = svcRmaHist;
		this.svcQadl07 = svcQadl07;
		this.svcCaPvmType = svcCaPvmType;
		this.svcCaUpdType = svcCaUpdType;
		this.svcPvmCl = svcPvmCl;
		this.svcCaInsType = svcCaInsType;
		this.svcCaCorType = svcCaCorType;
		this.svcCaTecType = svcCaTecType;
		this.svcCaTimeWnd = svcCaTimeWnd;
		this.svcCaWoWnd = svcCaWoWnd;
		this.svcCreateCus = svcCreateCus;
		this.svcBill = svcBill;
		this.svcCallPdev = svcCallPdev;
		this.svcGwCd = svcGwCd;
		this.svcSvCd = svcSvCd;
		this.svcTmCd = svcTmCd;
		this.svcWarrCd = svcWarrCd;
		this.svcAutorenew = svcAutorenew;
		this.svcUser1 = svcUser1;
		this.svcUser2 = svcUser2;
		this.svcAssignEng = svcAssignEng;
		this.svcAvoidance = svcAvoidance;
		this.svcQadi04 = svcQadi04;
		this.svcCaEstTime = svcCaEstTime;
		this.svcCaEstTrv = svcCaEstTrv;
		this.svcQadl04 = svcQadl04;
		this.svcCaModel = svcCaModel;
		this.svcCaSys = svcCaSys;
		this.svcChgCd = svcChgCd;
		this.svcChgSvcode = svcChgSvcode;
		this.svcCpCauser = svcCpCauser;
		this.svcCpSauser = svcCpSauser;
		this.svcEscDflt = svcEscDflt;
		this.svcEscPause = svcEscPause;
		this.svcEscPrt = svcEscPrt;
		this.svcEscSch = svcEscSch;
		this.svcEscUser = svcEscUser;
		this.svcFaultCode = svcFaultCode;
		this.svcGen0itm = svcGen0itm;
		this.svcGwSvcode = svcGwSvcode;
		this.svcIsbBom = svcIsbBom;
		this.svcIsbCompbom = svcIsbCompbom;
		this.svcIsbRepair = svcIsbRepair;
		this.svcIvcHold = svcIvcHold;
		this.svcMandPo = svcMandPo;
		this.svcSaAccount = svcSaAccount;
		this.svcSaCd = svcSaCd;
		this.svcScheduleCa = svcScheduleCa;
		this.svcTempClose = svcTempClose;
		this.svcTempCus = svcTempCus;
		this.svcTimeZone = svcTimeZone;
		this.svcTravelStep = svcTravelStep;
		this.svcWarrSvcode = svcWarrSvcode;
		this.svcQadl06 = svcQadl06;
		this.svcAckLetter = svcAckLetter;
		this.svcServerTimezone = svcServerTimezone;
		this.svcCompStatus = svcCompStatus;
		this.svcConFscCode = svcConFscCode;
		this.svcEgTaxUsage = svcEgTaxUsage;
		this.svcExchUm = svcExchUm;
		this.svcExTaxUsage = svcExTaxUsage;
		this.svcFixedUm = svcFixedUm;
		this.svcHoldStatus = svcHoldStatus;
		this.svcInvoiceSts = svcInvoiceSts;
		this.svcCaInvDraft = svcCaInvDraft;
		this.svcCloseRecord = svcCloseRecord;
		this.svcLbTaxUsage = svcLbTaxUsage;
		this.svcPcListType = svcPcListType;
		this.svcPtsFscCode = svcPtsFscCode;
		this.svcPtTaxUsage = svcPtTaxUsage;
		this.svcTaxEnviron = svcTaxEnviron;
		this.svcTrace = svcTrace;
		this.svcWaitStatus = svcWaitStatus;
		this.svcScheduler = svcScheduler;
		this.svcCanclStatus = svcCanclStatus;
		this.svcInvoiceAcct = svcInvoiceAcct;
		this.svcCaCoverage = svcCaCoverage;
		this.svcCaAllowInv = svcCaAllowInv;
		this.svcCaPrint0 = svcCaPrint0;
		this.svcReturnSts = svcReturnSts;
		this.svcScrapSts = svcScrapSts;
		this.svcInvoiceCost = svcInvoiceCost;
		this.svcRcTransfer = svcRcTransfer;
		this.svcDfltWarr = svcDfltWarr;
		this.svcPmEstTime = svcPmEstTime;
		this.svcUpdEstTime = svcUpdEstTime;
		this.svcInstEstTime = svcInstEstTime;
		this.svcCorrEstTime = svcCorrEstTime;
		this.svcWkctr = svcWkctr;
		this.svcDbTimezone = svcDbTimezone;
		this.svcQadc03 = svcQadc03;
		this.svcQadt01 = svcQadt01;
		this.svcQadt02 = svcQadt02;
		this.svcQadt03 = svcQadt03;
		this.svcQadd01 = svcQadd01;
		this.svcQadd02 = svcQadd02;
		this.svcQadd03 = svcQadd03;
		this.svcProjectHndl = svcProjectHndl;
		this.svcQadi02 = svcQadi02;
		this.svcQadi03 = svcQadi03;
		this.svcQadl01 = svcQadl01;
		this.svcQadl02 = svcQadl02;
		this.svcQadl03 = svcQadl03;
		this.svcModUserid = svcModUserid;
		this.svcModDate = svcModDate;
		this.svcMultiTimeZones = svcMultiTimeZones;
		this.svcItmData = svcItmData;
		this.svcQadc04 = svcQadc04;
		this.svcQadc05 = svcQadc05;
		this.svcQadi05 = svcQadi05;
		this.oidSvcCtrl = oidSvcCtrl;
	}

	// Property accessors

	public SvcCtrlId getId() {
		return this.id;
	}

	public void setId(SvcCtrlId id) {
		this.id = id;
	}

	public String getSvcCode() {
		return this.svcCode;
	}

	public void setSvcCode(String svcCode) {
		this.svcCode = svcCode;
	}

	public Integer getSvcDfltPri() {
		return this.svcDfltPri;
	}

	public void setSvcDfltPri(Integer svcDfltPri) {
		this.svcDfltPri = svcDfltPri;
	}

	public Boolean getSvcPrt0itm() {
		return this.svcPrt0itm;
	}

	public void setSvcPrt0itm(Boolean svcPrt0itm) {
		this.svcPrt0itm = svcPrt0itm;
	}

	public Boolean getSvcDispatch() {
		return this.svcDispatch;
	}

	public void setSvcDispatch(Boolean svcDispatch) {
		this.svcDispatch = svcDispatch;
	}

	public Boolean getSvcPtIsb() {
		return this.svcPtIsb;
	}

	public void setSvcPtIsb(Boolean svcPtIsb) {
		this.svcPtIsb = svcPtIsb;
	}

	public String getSvcEngLbcd() {
		return this.svcEngLbcd;
	}

	public void setSvcEngLbcd(String svcEngLbcd) {
		this.svcEngLbcd = svcEngLbcd;
	}

	public Boolean getSvcShipIsb() {
		return this.svcShipIsb;
	}

	public void setSvcShipIsb(Boolean svcShipIsb) {
		this.svcShipIsb = svcShipIsb;
	}

	public String getSvcDfltCyc() {
		return this.svcDfltCyc;
	}

	public void setSvcDfltCyc(String svcDfltCyc) {
		this.svcDfltCyc = svcDfltCyc;
	}

	public Integer getSvcHoldCall() {
		return this.svcHoldCall;
	}

	public void setSvcHoldCall(Integer svcHoldCall) {
		this.svcHoldCall = svcHoldCall;
	}

	public String getSvcDfltTm() {
		return this.svcDfltTm;
	}

	public void setSvcDfltTm(String svcDfltTm) {
		this.svcDfltTm = svcDfltTm;
	}

	public Boolean getSvcCmmts() {
		return this.svcCmmts;
	}

	public void setSvcCmmts(Boolean svcCmmts) {
		this.svcCmmts = svcCmmts;
	}

	public String getSvcDfltQue() {
		return this.svcDfltQue;
	}

	public void setSvcDfltQue(String svcDfltQue) {
		this.svcDfltQue = svcDfltQue;
	}

	public String getSvcTrvlUm() {
		return this.svcTrvlUm;
	}

	public void setSvcTrvlUm(String svcTrvlUm) {
		this.svcTrvlUm = svcTrvlUm;
	}

	public String getSvcSite() {
		return this.svcSite;
	}

	public void setSvcSite(String svcSite) {
		this.svcSite = svcSite;
	}

	public String getSvcLoc() {
		return this.svcLoc;
	}

	public void setSvcLoc(String svcLoc) {
		this.svcLoc = svcLoc;
	}

	public String getSvcUm() {
		return this.svcUm;
	}

	public void setSvcUm(String svcUm) {
		this.svcUm = svcUm;
	}

	public Boolean getSvcAutoExt() {
		return this.svcAutoExt;
	}

	public void setSvcAutoExt(Boolean svcAutoExt) {
		this.svcAutoExt = svcAutoExt;
	}

	public Boolean getSvcArears() {
		return this.svcArears;
	}

	public void setSvcArears(Boolean svcArears) {
		this.svcArears = svcArears;
	}

	public String getSvcOpen() {
		return this.svcOpen;
	}

	public void setSvcOpen(String svcOpen) {
		this.svcOpen = svcOpen;
	}

	public String getSvcClose() {
		return this.svcClose;
	}

	public void setSvcClose(String svcClose) {
		this.svcClose = svcClose;
	}

	public Boolean getSvcPerBill() {
		return this.svcPerBill;
	}

	public void setSvcPerBill(Boolean svcPerBill) {
		this.svcPerBill = svcPerBill;
	}

	public Boolean getSvcProrate() {
		return this.svcProrate;
	}

	public void setSvcProrate(Boolean svcProrate) {
		this.svcProrate = svcProrate;
	}

	public Boolean getSvcAutoTim() {
		return this.svcAutoTim;
	}

	public void setSvcAutoTim(Boolean svcAutoTim) {
		this.svcAutoTim = svcAutoTim;
	}

	public String getSvcSysType() {
		return this.svcSysType;
	}

	public void setSvcSysType(String svcSysType) {
		this.svcSysType = svcSysType;
	}

	public Integer getSvcQueProg() {
		return this.svcQueProg;
	}

	public void setSvcQueProg(Integer svcQueProg) {
		this.svcQueProg = svcQueProg;
	}

	public String getSvcCallPre() {
		return this.svcCallPre;
	}

	public void setSvcCallPre(String svcCallPre) {
		this.svcCallPre = svcCallPre;
	}

	public String getSvcChr01() {
		return this.svcChr01;
	}

	public void setSvcChr01(String svcChr01) {
		this.svcChr01 = svcChr01;
	}

	public String getSvcChr02() {
		return this.svcChr02;
	}

	public void setSvcChr02(String svcChr02) {
		this.svcChr02 = svcChr02;
	}

	public String getSvcChr03() {
		return this.svcChr03;
	}

	public void setSvcChr03(String svcChr03) {
		this.svcChr03 = svcChr03;
	}

	public String getSvcChr04() {
		return this.svcChr04;
	}

	public void setSvcChr04(String svcChr04) {
		this.svcChr04 = svcChr04;
	}

	public String getSvcChr05() {
		return this.svcChr05;
	}

	public void setSvcChr05(String svcChr05) {
		this.svcChr05 = svcChr05;
	}

	public String getSvcChr06() {
		return this.svcChr06;
	}

	public void setSvcChr06(String svcChr06) {
		this.svcChr06 = svcChr06;
	}

	public Boolean getSvcLog01() {
		return this.svcLog01;
	}

	public void setSvcLog01(Boolean svcLog01) {
		this.svcLog01 = svcLog01;
	}

	public Boolean getSvcLog02() {
		return this.svcLog02;
	}

	public void setSvcLog02(Boolean svcLog02) {
		this.svcLog02 = svcLog02;
	}

	public Boolean getSvcLog03() {
		return this.svcLog03;
	}

	public void setSvcLog03(Boolean svcLog03) {
		this.svcLog03 = svcLog03;
	}

	public Boolean getSvcLog04() {
		return this.svcLog04;
	}

	public void setSvcLog04(Boolean svcLog04) {
		this.svcLog04 = svcLog04;
	}

	public Boolean getSvcLog05() {
		return this.svcLog05;
	}

	public void setSvcLog05(Boolean svcLog05) {
		this.svcLog05 = svcLog05;
	}

	public Boolean getSvcLog06() {
		return this.svcLog06;
	}

	public void setSvcLog06(Boolean svcLog06) {
		this.svcLog06 = svcLog06;
	}

	public Boolean getSvcLog07() {
		return this.svcLog07;
	}

	public void setSvcLog07(Boolean svcLog07) {
		this.svcLog07 = svcLog07;
	}

	public String getSvcChr07() {
		return this.svcChr07;
	}

	public void setSvcChr07(String svcChr07) {
		this.svcChr07 = svcChr07;
	}

	public String getSvcChr08() {
		return this.svcChr08;
	}

	public void setSvcChr08(String svcChr08) {
		this.svcChr08 = svcChr08;
	}

	public String getSvcChr09() {
		return this.svcChr09;
	}

	public void setSvcChr09(String svcChr09) {
		this.svcChr09 = svcChr09;
	}

	public String getSvcChr10() {
		return this.svcChr10;
	}

	public void setSvcChr10(String svcChr10) {
		this.svcChr10 = svcChr10;
	}

	public Boolean getSvcLog08() {
		return this.svcLog08;
	}

	public void setSvcLog08(Boolean svcLog08) {
		this.svcLog08 = svcLog08;
	}

	public Boolean getSvcLog09() {
		return this.svcLog09;
	}

	public void setSvcLog09(Boolean svcLog09) {
		this.svcLog09 = svcLog09;
	}

	public Boolean getSvcLog10() {
		return this.svcLog10;
	}

	public void setSvcLog10(Boolean svcLog10) {
		this.svcLog10 = svcLog10;
	}

	public Double getSvcDec01() {
		return this.svcDec01;
	}

	public void setSvcDec01(Double svcDec01) {
		this.svcDec01 = svcDec01;
	}

	public Double getSvcDec02() {
		return this.svcDec02;
	}

	public void setSvcDec02(Double svcDec02) {
		this.svcDec02 = svcDec02;
	}

	public Double getSvcDec03() {
		return this.svcDec03;
	}

	public void setSvcDec03(Double svcDec03) {
		this.svcDec03 = svcDec03;
	}

	public Double getSvcDec04() {
		return this.svcDec04;
	}

	public void setSvcDec04(Double svcDec04) {
		this.svcDec04 = svcDec04;
	}

	public Double getSvcPlstPct() {
		return this.svcPlstPct;
	}

	public void setSvcPlstPct(Double svcPlstPct) {
		this.svcPlstPct = svcPlstPct;
	}

	public Boolean getSvcInstCl() {
		return this.svcInstCl;
	}

	public void setSvcInstCl(Boolean svcInstCl) {
		this.svcInstCl = svcInstCl;
	}

	public String getSvcSrstatus() {
		return this.svcSrstatus;
	}

	public void setSvcSrstatus(String svcSrstatus) {
		this.svcSrstatus = svcSrstatus;
	}

	public String getSvcSrPre() {
		return this.svcSrPre;
	}

	public void setSvcSrPre(String svcSrPre) {
		this.svcSrPre = svcSrPre;
	}

	public Integer getSvcQuePaus() {
		return this.svcQuePaus;
	}

	public void setSvcQuePaus(Integer svcQuePaus) {
		this.svcQuePaus = svcQuePaus;
	}

	public String getSvcSerial() {
		return this.svcSerial;
	}

	public void setSvcSerial(String svcSerial) {
		this.svcSerial = svcSerial;
	}

	public Boolean getSvcPtMstr() {
		return this.svcPtMstr;
	}

	public void setSvcPtMstr(Boolean svcPtMstr) {
		this.svcPtMstr = svcPtMstr;
	}

	public Boolean getSvcSubCvr() {
		return this.svcSubCvr;
	}

	public void setSvcSubCvr(Boolean svcSubCvr) {
		this.svcSubCvr = svcSubCvr;
	}

	public String getSvcSrrClose() {
		return this.svcSrrClose;
	}

	public void setSvcSrrClose(String svcSrrClose) {
		this.svcSrrClose = svcSrrClose;
	}

	public String getSvcSrrOpen() {
		return this.svcSrrOpen;
	}

	public void setSvcSrrOpen(String svcSrrOpen) {
		this.svcSrrOpen = svcSrrOpen;
	}

	public Boolean getSvcIsbNsbom() {
		return this.svcIsbNsbom;
	}

	public void setSvcIsbNsbom(Boolean svcIsbNsbom) {
		this.svcIsbNsbom = svcIsbNsbom;
	}

	public Boolean getSvcPtProd() {
		return this.svcPtProd;
	}

	public void setSvcPtProd(Boolean svcPtProd) {
		this.svcPtProd = svcPtProd;
	}

	public Integer getSvcInsDays() {
		return this.svcInsDays;
	}

	public void setSvcInsDays(Integer svcInsDays) {
		this.svcInsDays = svcInsDays;
	}

	public String getSvcSapBomType() {
		return this.svcSapBomType;
	}

	public void setSvcSapBomType(String svcSapBomType) {
		this.svcSapBomType = svcSapBomType;
	}

	public Boolean getSvcWarrSt() {
		return this.svcWarrSt;
	}

	public void setSvcWarrSt(Boolean svcWarrSt) {
		this.svcWarrSt = svcWarrSt;
	}

	public Boolean getSvcSaAccounts() {
		return this.svcSaAccounts;
	}

	public void setSvcSaAccounts(Boolean svcSaAccounts) {
		this.svcSaAccounts = svcSaAccounts;
	}

	public Boolean getSvcIsbHist() {
		return this.svcIsbHist;
	}

	public void setSvcIsbHist(Boolean svcIsbHist) {
		this.svcIsbHist = svcIsbHist;
	}

	public Boolean getSvcRmaHist() {
		return this.svcRmaHist;
	}

	public void setSvcRmaHist(Boolean svcRmaHist) {
		this.svcRmaHist = svcRmaHist;
	}

	public Boolean getSvcQadl07() {
		return this.svcQadl07;
	}

	public void setSvcQadl07(Boolean svcQadl07) {
		this.svcQadl07 = svcQadl07;
	}

	public String getSvcCaPvmType() {
		return this.svcCaPvmType;
	}

	public void setSvcCaPvmType(String svcCaPvmType) {
		this.svcCaPvmType = svcCaPvmType;
	}

	public String getSvcCaUpdType() {
		return this.svcCaUpdType;
	}

	public void setSvcCaUpdType(String svcCaUpdType) {
		this.svcCaUpdType = svcCaUpdType;
	}

	public Boolean getSvcPvmCl() {
		return this.svcPvmCl;
	}

	public void setSvcPvmCl(Boolean svcPvmCl) {
		this.svcPvmCl = svcPvmCl;
	}

	public String getSvcCaInsType() {
		return this.svcCaInsType;
	}

	public void setSvcCaInsType(String svcCaInsType) {
		this.svcCaInsType = svcCaInsType;
	}

	public String getSvcCaCorType() {
		return this.svcCaCorType;
	}

	public void setSvcCaCorType(String svcCaCorType) {
		this.svcCaCorType = svcCaCorType;
	}

	public String getSvcCaTecType() {
		return this.svcCaTecType;
	}

	public void setSvcCaTecType(String svcCaTecType) {
		this.svcCaTecType = svcCaTecType;
	}

	public Boolean getSvcCaTimeWnd() {
		return this.svcCaTimeWnd;
	}

	public void setSvcCaTimeWnd(Boolean svcCaTimeWnd) {
		this.svcCaTimeWnd = svcCaTimeWnd;
	}

	public Boolean getSvcCaWoWnd() {
		return this.svcCaWoWnd;
	}

	public void setSvcCaWoWnd(Boolean svcCaWoWnd) {
		this.svcCaWoWnd = svcCaWoWnd;
	}

	public Boolean getSvcCreateCus() {
		return this.svcCreateCus;
	}

	public void setSvcCreateCus(Boolean svcCreateCus) {
		this.svcCreateCus = svcCreateCus;
	}

	public Boolean getSvcBill() {
		return this.svcBill;
	}

	public void setSvcBill(Boolean svcBill) {
		this.svcBill = svcBill;
	}

	public String getSvcCallPdev() {
		return this.svcCallPdev;
	}

	public void setSvcCallPdev(String svcCallPdev) {
		this.svcCallPdev = svcCallPdev;
	}

	public String getSvcGwCd() {
		return this.svcGwCd;
	}

	public void setSvcGwCd(String svcGwCd) {
		this.svcGwCd = svcGwCd;
	}

	public String getSvcSvCd() {
		return this.svcSvCd;
	}

	public void setSvcSvCd(String svcSvCd) {
		this.svcSvCd = svcSvCd;
	}

	public String getSvcTmCd() {
		return this.svcTmCd;
	}

	public void setSvcTmCd(String svcTmCd) {
		this.svcTmCd = svcTmCd;
	}

	public String getSvcWarrCd() {
		return this.svcWarrCd;
	}

	public void setSvcWarrCd(String svcWarrCd) {
		this.svcWarrCd = svcWarrCd;
	}

	public Boolean getSvcAutorenew() {
		return this.svcAutorenew;
	}

	public void setSvcAutorenew(Boolean svcAutorenew) {
		this.svcAutorenew = svcAutorenew;
	}

	public String getSvcUser1() {
		return this.svcUser1;
	}

	public void setSvcUser1(String svcUser1) {
		this.svcUser1 = svcUser1;
	}

	public String getSvcUser2() {
		return this.svcUser2;
	}

	public void setSvcUser2(String svcUser2) {
		this.svcUser2 = svcUser2;
	}

	public Boolean getSvcAssignEng() {
		return this.svcAssignEng;
	}

	public void setSvcAssignEng(Boolean svcAssignEng) {
		this.svcAssignEng = svcAssignEng;
	}

	public Boolean getSvcAvoidance() {
		return this.svcAvoidance;
	}

	public void setSvcAvoidance(Boolean svcAvoidance) {
		this.svcAvoidance = svcAvoidance;
	}

	public Integer getSvcQadi04() {
		return this.svcQadi04;
	}

	public void setSvcQadi04(Integer svcQadi04) {
		this.svcQadi04 = svcQadi04;
	}

	public String getSvcCaEstTime() {
		return this.svcCaEstTime;
	}

	public void setSvcCaEstTime(String svcCaEstTime) {
		this.svcCaEstTime = svcCaEstTime;
	}

	public String getSvcCaEstTrv() {
		return this.svcCaEstTrv;
	}

	public void setSvcCaEstTrv(String svcCaEstTrv) {
		this.svcCaEstTrv = svcCaEstTrv;
	}

	public Boolean getSvcQadl04() {
		return this.svcQadl04;
	}

	public void setSvcQadl04(Boolean svcQadl04) {
		this.svcQadl04 = svcQadl04;
	}

	public Boolean getSvcCaModel() {
		return this.svcCaModel;
	}

	public void setSvcCaModel(Boolean svcCaModel) {
		this.svcCaModel = svcCaModel;
	}

	public Boolean getSvcCaSys() {
		return this.svcCaSys;
	}

	public void setSvcCaSys(Boolean svcCaSys) {
		this.svcCaSys = svcCaSys;
	}

	public String getSvcChgCd() {
		return this.svcChgCd;
	}

	public void setSvcChgCd(String svcChgCd) {
		this.svcChgCd = svcChgCd;
	}

	public String getSvcChgSvcode() {
		return this.svcChgSvcode;
	}

	public void setSvcChgSvcode(String svcChgSvcode) {
		this.svcChgSvcode = svcChgSvcode;
	}

	public Boolean getSvcCpCauser() {
		return this.svcCpCauser;
	}

	public void setSvcCpCauser(Boolean svcCpCauser) {
		this.svcCpCauser = svcCpCauser;
	}

	public Boolean getSvcCpSauser() {
		return this.svcCpSauser;
	}

	public void setSvcCpSauser(Boolean svcCpSauser) {
		this.svcCpSauser = svcCpSauser;
	}

	public String getSvcEscDflt() {
		return this.svcEscDflt;
	}

	public void setSvcEscDflt(String svcEscDflt) {
		this.svcEscDflt = svcEscDflt;
	}

	public Integer getSvcEscPause() {
		return this.svcEscPause;
	}

	public void setSvcEscPause(Integer svcEscPause) {
		this.svcEscPause = svcEscPause;
	}

	public String getSvcEscPrt() {
		return this.svcEscPrt;
	}

	public void setSvcEscPrt(String svcEscPrt) {
		this.svcEscPrt = svcEscPrt;
	}

	public Boolean getSvcEscSch() {
		return this.svcEscSch;
	}

	public void setSvcEscSch(Boolean svcEscSch) {
		this.svcEscSch = svcEscSch;
	}

	public String getSvcEscUser() {
		return this.svcEscUser;
	}

	public void setSvcEscUser(String svcEscUser) {
		this.svcEscUser = svcEscUser;
	}

	public Boolean getSvcFaultCode() {
		return this.svcFaultCode;
	}

	public void setSvcFaultCode(Boolean svcFaultCode) {
		this.svcFaultCode = svcFaultCode;
	}

	public Boolean getSvcGen0itm() {
		return this.svcGen0itm;
	}

	public void setSvcGen0itm(Boolean svcGen0itm) {
		this.svcGen0itm = svcGen0itm;
	}

	public String getSvcGwSvcode() {
		return this.svcGwSvcode;
	}

	public void setSvcGwSvcode(String svcGwSvcode) {
		this.svcGwSvcode = svcGwSvcode;
	}

	public Boolean getSvcIsbBom() {
		return this.svcIsbBom;
	}

	public void setSvcIsbBom(Boolean svcIsbBom) {
		this.svcIsbBom = svcIsbBom;
	}

	public Boolean getSvcIsbCompbom() {
		return this.svcIsbCompbom;
	}

	public void setSvcIsbCompbom(Boolean svcIsbCompbom) {
		this.svcIsbCompbom = svcIsbCompbom;
	}

	public String getSvcIsbRepair() {
		return this.svcIsbRepair;
	}

	public void setSvcIsbRepair(String svcIsbRepair) {
		this.svcIsbRepair = svcIsbRepair;
	}

	public Boolean getSvcIvcHold() {
		return this.svcIvcHold;
	}

	public void setSvcIvcHold(Boolean svcIvcHold) {
		this.svcIvcHold = svcIvcHold;
	}

	public Boolean getSvcMandPo() {
		return this.svcMandPo;
	}

	public void setSvcMandPo(Boolean svcMandPo) {
		this.svcMandPo = svcMandPo;
	}

	public Boolean getSvcSaAccount() {
		return this.svcSaAccount;
	}

	public void setSvcSaAccount(Boolean svcSaAccount) {
		this.svcSaAccount = svcSaAccount;
	}

	public String getSvcSaCd() {
		return this.svcSaCd;
	}

	public void setSvcSaCd(String svcSaCd) {
		this.svcSaCd = svcSaCd;
	}

	public Boolean getSvcScheduleCa() {
		return this.svcScheduleCa;
	}

	public void setSvcScheduleCa(Boolean svcScheduleCa) {
		this.svcScheduleCa = svcScheduleCa;
	}

	public Boolean getSvcTempClose() {
		return this.svcTempClose;
	}

	public void setSvcTempClose(Boolean svcTempClose) {
		this.svcTempClose = svcTempClose;
	}

	public String getSvcTempCus() {
		return this.svcTempCus;
	}

	public void setSvcTempCus(String svcTempCus) {
		this.svcTempCus = svcTempCus;
	}

	public Integer getSvcTimeZone() {
		return this.svcTimeZone;
	}

	public void setSvcTimeZone(Integer svcTimeZone) {
		this.svcTimeZone = svcTimeZone;
	}

	public Integer getSvcTravelStep() {
		return this.svcTravelStep;
	}

	public void setSvcTravelStep(Integer svcTravelStep) {
		this.svcTravelStep = svcTravelStep;
	}

	public String getSvcWarrSvcode() {
		return this.svcWarrSvcode;
	}

	public void setSvcWarrSvcode(String svcWarrSvcode) {
		this.svcWarrSvcode = svcWarrSvcode;
	}

	public Boolean getSvcQadl06() {
		return this.svcQadl06;
	}

	public void setSvcQadl06(Boolean svcQadl06) {
		this.svcQadl06 = svcQadl06;
	}

	public Boolean getSvcAckLetter() {
		return this.svcAckLetter;
	}

	public void setSvcAckLetter(Boolean svcAckLetter) {
		this.svcAckLetter = svcAckLetter;
	}

	public String getSvcServerTimezone() {
		return this.svcServerTimezone;
	}

	public void setSvcServerTimezone(String svcServerTimezone) {
		this.svcServerTimezone = svcServerTimezone;
	}

	public String getSvcCompStatus() {
		return this.svcCompStatus;
	}

	public void setSvcCompStatus(String svcCompStatus) {
		this.svcCompStatus = svcCompStatus;
	}

	public String getSvcConFscCode() {
		return this.svcConFscCode;
	}

	public void setSvcConFscCode(String svcConFscCode) {
		this.svcConFscCode = svcConFscCode;
	}

	public String getSvcEgTaxUsage() {
		return this.svcEgTaxUsage;
	}

	public void setSvcEgTaxUsage(String svcEgTaxUsage) {
		this.svcEgTaxUsage = svcEgTaxUsage;
	}

	public String getSvcExchUm() {
		return this.svcExchUm;
	}

	public void setSvcExchUm(String svcExchUm) {
		this.svcExchUm = svcExchUm;
	}

	public String getSvcExTaxUsage() {
		return this.svcExTaxUsage;
	}

	public void setSvcExTaxUsage(String svcExTaxUsage) {
		this.svcExTaxUsage = svcExTaxUsage;
	}

	public String getSvcFixedUm() {
		return this.svcFixedUm;
	}

	public void setSvcFixedUm(String svcFixedUm) {
		this.svcFixedUm = svcFixedUm;
	}

	public String getSvcHoldStatus() {
		return this.svcHoldStatus;
	}

	public void setSvcHoldStatus(String svcHoldStatus) {
		this.svcHoldStatus = svcHoldStatus;
	}

	public String getSvcInvoiceSts() {
		return this.svcInvoiceSts;
	}

	public void setSvcInvoiceSts(String svcInvoiceSts) {
		this.svcInvoiceSts = svcInvoiceSts;
	}

	public Boolean getSvcCaInvDraft() {
		return this.svcCaInvDraft;
	}

	public void setSvcCaInvDraft(Boolean svcCaInvDraft) {
		this.svcCaInvDraft = svcCaInvDraft;
	}

	public Boolean getSvcCloseRecord() {
		return this.svcCloseRecord;
	}

	public void setSvcCloseRecord(Boolean svcCloseRecord) {
		this.svcCloseRecord = svcCloseRecord;
	}

	public String getSvcLbTaxUsage() {
		return this.svcLbTaxUsage;
	}

	public void setSvcLbTaxUsage(String svcLbTaxUsage) {
		this.svcLbTaxUsage = svcLbTaxUsage;
	}

	public Boolean getSvcPcListType() {
		return this.svcPcListType;
	}

	public void setSvcPcListType(Boolean svcPcListType) {
		this.svcPcListType = svcPcListType;
	}

	public String getSvcPtsFscCode() {
		return this.svcPtsFscCode;
	}

	public void setSvcPtsFscCode(String svcPtsFscCode) {
		this.svcPtsFscCode = svcPtsFscCode;
	}

	public String getSvcPtTaxUsage() {
		return this.svcPtTaxUsage;
	}

	public void setSvcPtTaxUsage(String svcPtTaxUsage) {
		this.svcPtTaxUsage = svcPtTaxUsage;
	}

	public String getSvcTaxEnviron() {
		return this.svcTaxEnviron;
	}

	public void setSvcTaxEnviron(String svcTaxEnviron) {
		this.svcTaxEnviron = svcTaxEnviron;
	}

	public Boolean getSvcTrace() {
		return this.svcTrace;
	}

	public void setSvcTrace(Boolean svcTrace) {
		this.svcTrace = svcTrace;
	}

	public String getSvcWaitStatus() {
		return this.svcWaitStatus;
	}

	public void setSvcWaitStatus(String svcWaitStatus) {
		this.svcWaitStatus = svcWaitStatus;
	}

	public Integer getSvcScheduler() {
		return this.svcScheduler;
	}

	public void setSvcScheduler(Integer svcScheduler) {
		this.svcScheduler = svcScheduler;
	}

	public String getSvcCanclStatus() {
		return this.svcCanclStatus;
	}

	public void setSvcCanclStatus(String svcCanclStatus) {
		this.svcCanclStatus = svcCanclStatus;
	}

	public Boolean getSvcInvoiceAcct() {
		return this.svcInvoiceAcct;
	}

	public void setSvcInvoiceAcct(Boolean svcInvoiceAcct) {
		this.svcInvoiceAcct = svcInvoiceAcct;
	}

	public Boolean getSvcCaCoverage() {
		return this.svcCaCoverage;
	}

	public void setSvcCaCoverage(Boolean svcCaCoverage) {
		this.svcCaCoverage = svcCaCoverage;
	}

	public Boolean getSvcCaAllowInv() {
		return this.svcCaAllowInv;
	}

	public void setSvcCaAllowInv(Boolean svcCaAllowInv) {
		this.svcCaAllowInv = svcCaAllowInv;
	}

	public Boolean getSvcCaPrint0() {
		return this.svcCaPrint0;
	}

	public void setSvcCaPrint0(Boolean svcCaPrint0) {
		this.svcCaPrint0 = svcCaPrint0;
	}

	public String getSvcReturnSts() {
		return this.svcReturnSts;
	}

	public void setSvcReturnSts(String svcReturnSts) {
		this.svcReturnSts = svcReturnSts;
	}

	public String getSvcScrapSts() {
		return this.svcScrapSts;
	}

	public void setSvcScrapSts(String svcScrapSts) {
		this.svcScrapSts = svcScrapSts;
	}

	public Boolean getSvcInvoiceCost() {
		return this.svcInvoiceCost;
	}

	public void setSvcInvoiceCost(Boolean svcInvoiceCost) {
		this.svcInvoiceCost = svcInvoiceCost;
	}

	public Boolean getSvcRcTransfer() {
		return this.svcRcTransfer;
	}

	public void setSvcRcTransfer(Boolean svcRcTransfer) {
		this.svcRcTransfer = svcRcTransfer;
	}

	public String getSvcDfltWarr() {
		return this.svcDfltWarr;
	}

	public void setSvcDfltWarr(String svcDfltWarr) {
		this.svcDfltWarr = svcDfltWarr;
	}

	public String getSvcPmEstTime() {
		return this.svcPmEstTime;
	}

	public void setSvcPmEstTime(String svcPmEstTime) {
		this.svcPmEstTime = svcPmEstTime;
	}

	public String getSvcUpdEstTime() {
		return this.svcUpdEstTime;
	}

	public void setSvcUpdEstTime(String svcUpdEstTime) {
		this.svcUpdEstTime = svcUpdEstTime;
	}

	public String getSvcInstEstTime() {
		return this.svcInstEstTime;
	}

	public void setSvcInstEstTime(String svcInstEstTime) {
		this.svcInstEstTime = svcInstEstTime;
	}

	public String getSvcCorrEstTime() {
		return this.svcCorrEstTime;
	}

	public void setSvcCorrEstTime(String svcCorrEstTime) {
		this.svcCorrEstTime = svcCorrEstTime;
	}

	public String getSvcWkctr() {
		return this.svcWkctr;
	}

	public void setSvcWkctr(String svcWkctr) {
		this.svcWkctr = svcWkctr;
	}

	public String getSvcDbTimezone() {
		return this.svcDbTimezone;
	}

	public void setSvcDbTimezone(String svcDbTimezone) {
		this.svcDbTimezone = svcDbTimezone;
	}

	public String getSvcQadc03() {
		return this.svcQadc03;
	}

	public void setSvcQadc03(String svcQadc03) {
		this.svcQadc03 = svcQadc03;
	}

	public Date getSvcQadt01() {
		return this.svcQadt01;
	}

	public void setSvcQadt01(Date svcQadt01) {
		this.svcQadt01 = svcQadt01;
	}

	public Date getSvcQadt02() {
		return this.svcQadt02;
	}

	public void setSvcQadt02(Date svcQadt02) {
		this.svcQadt02 = svcQadt02;
	}

	public Date getSvcQadt03() {
		return this.svcQadt03;
	}

	public void setSvcQadt03(Date svcQadt03) {
		this.svcQadt03 = svcQadt03;
	}

	public Double getSvcQadd01() {
		return this.svcQadd01;
	}

	public void setSvcQadd01(Double svcQadd01) {
		this.svcQadd01 = svcQadd01;
	}

	public Double getSvcQadd02() {
		return this.svcQadd02;
	}

	public void setSvcQadd02(Double svcQadd02) {
		this.svcQadd02 = svcQadd02;
	}

	public Double getSvcQadd03() {
		return this.svcQadd03;
	}

	public void setSvcQadd03(Double svcQadd03) {
		this.svcQadd03 = svcQadd03;
	}

	public Integer getSvcProjectHndl() {
		return this.svcProjectHndl;
	}

	public void setSvcProjectHndl(Integer svcProjectHndl) {
		this.svcProjectHndl = svcProjectHndl;
	}

	public Integer getSvcQadi02() {
		return this.svcQadi02;
	}

	public void setSvcQadi02(Integer svcQadi02) {
		this.svcQadi02 = svcQadi02;
	}

	public Integer getSvcQadi03() {
		return this.svcQadi03;
	}

	public void setSvcQadi03(Integer svcQadi03) {
		this.svcQadi03 = svcQadi03;
	}

	public Boolean getSvcQadl01() {
		return this.svcQadl01;
	}

	public void setSvcQadl01(Boolean svcQadl01) {
		this.svcQadl01 = svcQadl01;
	}

	public Boolean getSvcQadl02() {
		return this.svcQadl02;
	}

	public void setSvcQadl02(Boolean svcQadl02) {
		this.svcQadl02 = svcQadl02;
	}

	public Boolean getSvcQadl03() {
		return this.svcQadl03;
	}

	public void setSvcQadl03(Boolean svcQadl03) {
		this.svcQadl03 = svcQadl03;
	}

	public String getSvcModUserid() {
		return this.svcModUserid;
	}

	public void setSvcModUserid(String svcModUserid) {
		this.svcModUserid = svcModUserid;
	}

	public Date getSvcModDate() {
		return this.svcModDate;
	}

	public void setSvcModDate(Date svcModDate) {
		this.svcModDate = svcModDate;
	}

	public Boolean getSvcMultiTimeZones() {
		return this.svcMultiTimeZones;
	}

	public void setSvcMultiTimeZones(Boolean svcMultiTimeZones) {
		this.svcMultiTimeZones = svcMultiTimeZones;
	}

	public Boolean getSvcItmData() {
		return this.svcItmData;
	}

	public void setSvcItmData(Boolean svcItmData) {
		this.svcItmData = svcItmData;
	}

	public String getSvcQadc04() {
		return this.svcQadc04;
	}

	public void setSvcQadc04(String svcQadc04) {
		this.svcQadc04 = svcQadc04;
	}

	public String getSvcQadc05() {
		return this.svcQadc05;
	}

	public void setSvcQadc05(String svcQadc05) {
		this.svcQadc05 = svcQadc05;
	}

	public Integer getSvcQadi05() {
		return this.svcQadi05;
	}

	public void setSvcQadi05(Integer svcQadi05) {
		this.svcQadi05 = svcQadi05;
	}

	public Double getOidSvcCtrl() {
		return this.oidSvcCtrl;
	}

	public void setOidSvcCtrl(Double oidSvcCtrl) {
		this.oidSvcCtrl = oidSvcCtrl;
	}

}