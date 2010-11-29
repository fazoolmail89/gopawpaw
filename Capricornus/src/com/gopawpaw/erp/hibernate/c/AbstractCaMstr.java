package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCaMstr entity provides the base persistence definition of the CaMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCaMstr implements java.io.Serializable {

	// Fields

	private CaMstrId id;
	private Date caNxtDate;
	private Integer caNxtTim;
	private String caQue;
	private String caAssign;
	private String caEuNbr;
	private String caEnterBy;
	private String caStatus;
	private String caType;
	private String caPart;
	private String caSerial;
	private String caNxtAct;
	private String caSoNbr;
	private String caName;
	private String caPhone;
	private String caProblem;
	private String caResolve;
	private Integer caPri;
	private String caDesc;
	private Date caEvtDate;
	private Integer caEvtTim;
	private Integer caCmtindx;
	private String caChr01;
	private String caChr02;
	private String caChr03;
	private String caChr04;
	private String caChr05;
	private Double caDec01;
	private String caChr06;
	private String caChr07;
	private String caChr08;
	private String caChr09;
	private String caChr10;
	private Date caDte01;
	private Date caDte02;
	private Date caDte03;
	private Date caDte04;
	private Date caDte05;
	private Double caDec02;
	private Double caDec03;
	private Boolean caLog01;
	private Boolean caLog02;
	private Boolean caLog03;
	private Boolean caLog04;
	private Boolean caLog05;
	private String caArea;
	private Integer caTrvDist;
	private String caTrvUm;
	private String caSvCode;
	private String caFromQue;
	private Date caSntDate;
	private Integer caSntTime;
	private String caRmaNbr;
	private String caCode;
	private Integer caSeq;
	private String caNxtTime;
	private String caEvtTime;
	private Date caOpnDate;
	private String caOpnTime;
	private Integer caRef;
	private Double caTimeLog;
	private Date caClsDate;
	private String caClsTime;
	private String caContract;
	private String caSeverity;
	private Integer caCline;
	private String caToQue;
	private Boolean caBilled;
	private String caSr;
	private Boolean caActivity;
	private Integer caEcmtindx;
	private String caPoNbr;
	private String caQadc04;
	private String caUser1;
	private String caUser2;
	private Boolean caCmmtMod;
	private String caCreated;
	private Date caDateStmp;
	private String caEngArea;
	private String caEngGroup;
	private String caQadc06;
	private String caEstTime;
	private String caEsNbr;
	private Integer caEsSeq;
	private Date caEuDate;
	private String caEuTime;
	private String caIntType;
	private Integer caQadi01;
	private String caRev;
	private String caRpBom;
	private String caRpRoute;
	private String caSite;
	private String caTimeStmp;
	private String caTrvTime;
	private String caQadc05;
	private Boolean caScheduleCa;
	private Boolean ca3rdParty;
	private String ca3rdPartyId;
	private Integer caAckCmtindx;
	private Boolean caAckLetter;
	private Date caCompDate;
	private String caCompTime;
	private String caCrTerms;
	private String caCurr;
	private Boolean caRecorded;
	private Double caExRate;
	private String caFnNbr;
	private Boolean caIncStats;
	private Boolean caPrinted;
	private String caPrList;
	private Integer caQoCmtindx;
	private Boolean caQuote;
	private Double caQuotePrice;
	private String caRcSite;
	private String caResolveDesc;
	private Integer caResCmtidx;
	private String caShipTo;
	private String caSqNbr;
	private Boolean caSuspended;
	private String caSvcType;
	private Boolean caTaxable;
	private String caTaxc;
	private Boolean caWaitingParts;
	private String caBill;
	private Double caEntEx;
	private Boolean caInvDraft;
	private String caTaxEnv;
	private Boolean caRepairCtr;
	private String caLang;
	private Date caTaxDate;
	private Date caQuoteExp;
	private String caRrcNbr;
	private Integer caRrcSeq;
	private String caQadc03;
	private Integer caQadi02;
	private Integer caQadi03;
	private Double caQadd01;
	private Double caQadd02;
	private Double caQadd03;
	private Boolean caEuChanged;
	private Boolean caQadl02;
	private Boolean caQadl03;
	private Date caQadt01;
	private Date caQadt02;
	private Date caQadt03;
	private String caModUserid;
	private Date caModDate;
	private String caCustomer;
	private String caTaxUsage;
	private Double caTaxPct;
	private String caQuoteNbr;
	private Boolean caFixRate;
	private String caChannel;
	private Double caExRate2;
	private String caExRatetype;
	private Integer caExruSeq;
	private Boolean caQadl04;
	private Date caEndDate;
	private Date caStartDate;
	private String caPrjNbr;
	private String caDefWs;
	private Boolean caUpdIsb;
	private Double oidCaMstr;

	// Constructors

	/** default constructor */
	public AbstractCaMstr() {
	}

	/** minimal constructor */
	public AbstractCaMstr(CaMstrId id, Boolean caEuChanged, Double caExRate2,
			String caExRatetype, Integer caExruSeq, String caPrjNbr,
			String caDefWs, Boolean caUpdIsb, Double oidCaMstr) {
		this.id = id;
		this.caEuChanged = caEuChanged;
		this.caExRate2 = caExRate2;
		this.caExRatetype = caExRatetype;
		this.caExruSeq = caExruSeq;
		this.caPrjNbr = caPrjNbr;
		this.caDefWs = caDefWs;
		this.caUpdIsb = caUpdIsb;
		this.oidCaMstr = oidCaMstr;
	}

	/** full constructor */
	public AbstractCaMstr(CaMstrId id, Date caNxtDate, Integer caNxtTim,
			String caQue, String caAssign, String caEuNbr, String caEnterBy,
			String caStatus, String caType, String caPart, String caSerial,
			String caNxtAct, String caSoNbr, String caName, String caPhone,
			String caProblem, String caResolve, Integer caPri, String caDesc,
			Date caEvtDate, Integer caEvtTim, Integer caCmtindx,
			String caChr01, String caChr02, String caChr03, String caChr04,
			String caChr05, Double caDec01, String caChr06, String caChr07,
			String caChr08, String caChr09, String caChr10, Date caDte01,
			Date caDte02, Date caDte03, Date caDte04, Date caDte05,
			Double caDec02, Double caDec03, Boolean caLog01, Boolean caLog02,
			Boolean caLog03, Boolean caLog04, Boolean caLog05, String caArea,
			Integer caTrvDist, String caTrvUm, String caSvCode,
			String caFromQue, Date caSntDate, Integer caSntTime,
			String caRmaNbr, String caCode, Integer caSeq, String caNxtTime,
			String caEvtTime, Date caOpnDate, String caOpnTime, Integer caRef,
			Double caTimeLog, Date caClsDate, String caClsTime,
			String caContract, String caSeverity, Integer caCline,
			String caToQue, Boolean caBilled, String caSr, Boolean caActivity,
			Integer caEcmtindx, String caPoNbr, String caQadc04,
			String caUser1, String caUser2, Boolean caCmmtMod,
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
		this.id = id;
		this.caNxtDate = caNxtDate;
		this.caNxtTim = caNxtTim;
		this.caQue = caQue;
		this.caAssign = caAssign;
		this.caEuNbr = caEuNbr;
		this.caEnterBy = caEnterBy;
		this.caStatus = caStatus;
		this.caType = caType;
		this.caPart = caPart;
		this.caSerial = caSerial;
		this.caNxtAct = caNxtAct;
		this.caSoNbr = caSoNbr;
		this.caName = caName;
		this.caPhone = caPhone;
		this.caProblem = caProblem;
		this.caResolve = caResolve;
		this.caPri = caPri;
		this.caDesc = caDesc;
		this.caEvtDate = caEvtDate;
		this.caEvtTim = caEvtTim;
		this.caCmtindx = caCmtindx;
		this.caChr01 = caChr01;
		this.caChr02 = caChr02;
		this.caChr03 = caChr03;
		this.caChr04 = caChr04;
		this.caChr05 = caChr05;
		this.caDec01 = caDec01;
		this.caChr06 = caChr06;
		this.caChr07 = caChr07;
		this.caChr08 = caChr08;
		this.caChr09 = caChr09;
		this.caChr10 = caChr10;
		this.caDte01 = caDte01;
		this.caDte02 = caDte02;
		this.caDte03 = caDte03;
		this.caDte04 = caDte04;
		this.caDte05 = caDte05;
		this.caDec02 = caDec02;
		this.caDec03 = caDec03;
		this.caLog01 = caLog01;
		this.caLog02 = caLog02;
		this.caLog03 = caLog03;
		this.caLog04 = caLog04;
		this.caLog05 = caLog05;
		this.caArea = caArea;
		this.caTrvDist = caTrvDist;
		this.caTrvUm = caTrvUm;
		this.caSvCode = caSvCode;
		this.caFromQue = caFromQue;
		this.caSntDate = caSntDate;
		this.caSntTime = caSntTime;
		this.caRmaNbr = caRmaNbr;
		this.caCode = caCode;
		this.caSeq = caSeq;
		this.caNxtTime = caNxtTime;
		this.caEvtTime = caEvtTime;
		this.caOpnDate = caOpnDate;
		this.caOpnTime = caOpnTime;
		this.caRef = caRef;
		this.caTimeLog = caTimeLog;
		this.caClsDate = caClsDate;
		this.caClsTime = caClsTime;
		this.caContract = caContract;
		this.caSeverity = caSeverity;
		this.caCline = caCline;
		this.caToQue = caToQue;
		this.caBilled = caBilled;
		this.caSr = caSr;
		this.caActivity = caActivity;
		this.caEcmtindx = caEcmtindx;
		this.caPoNbr = caPoNbr;
		this.caQadc04 = caQadc04;
		this.caUser1 = caUser1;
		this.caUser2 = caUser2;
		this.caCmmtMod = caCmmtMod;
		this.caCreated = caCreated;
		this.caDateStmp = caDateStmp;
		this.caEngArea = caEngArea;
		this.caEngGroup = caEngGroup;
		this.caQadc06 = caQadc06;
		this.caEstTime = caEstTime;
		this.caEsNbr = caEsNbr;
		this.caEsSeq = caEsSeq;
		this.caEuDate = caEuDate;
		this.caEuTime = caEuTime;
		this.caIntType = caIntType;
		this.caQadi01 = caQadi01;
		this.caRev = caRev;
		this.caRpBom = caRpBom;
		this.caRpRoute = caRpRoute;
		this.caSite = caSite;
		this.caTimeStmp = caTimeStmp;
		this.caTrvTime = caTrvTime;
		this.caQadc05 = caQadc05;
		this.caScheduleCa = caScheduleCa;
		this.ca3rdParty = ca3rdParty;
		this.ca3rdPartyId = ca3rdPartyId;
		this.caAckCmtindx = caAckCmtindx;
		this.caAckLetter = caAckLetter;
		this.caCompDate = caCompDate;
		this.caCompTime = caCompTime;
		this.caCrTerms = caCrTerms;
		this.caCurr = caCurr;
		this.caRecorded = caRecorded;
		this.caExRate = caExRate;
		this.caFnNbr = caFnNbr;
		this.caIncStats = caIncStats;
		this.caPrinted = caPrinted;
		this.caPrList = caPrList;
		this.caQoCmtindx = caQoCmtindx;
		this.caQuote = caQuote;
		this.caQuotePrice = caQuotePrice;
		this.caRcSite = caRcSite;
		this.caResolveDesc = caResolveDesc;
		this.caResCmtidx = caResCmtidx;
		this.caShipTo = caShipTo;
		this.caSqNbr = caSqNbr;
		this.caSuspended = caSuspended;
		this.caSvcType = caSvcType;
		this.caTaxable = caTaxable;
		this.caTaxc = caTaxc;
		this.caWaitingParts = caWaitingParts;
		this.caBill = caBill;
		this.caEntEx = caEntEx;
		this.caInvDraft = caInvDraft;
		this.caTaxEnv = caTaxEnv;
		this.caRepairCtr = caRepairCtr;
		this.caLang = caLang;
		this.caTaxDate = caTaxDate;
		this.caQuoteExp = caQuoteExp;
		this.caRrcNbr = caRrcNbr;
		this.caRrcSeq = caRrcSeq;
		this.caQadc03 = caQadc03;
		this.caQadi02 = caQadi02;
		this.caQadi03 = caQadi03;
		this.caQadd01 = caQadd01;
		this.caQadd02 = caQadd02;
		this.caQadd03 = caQadd03;
		this.caEuChanged = caEuChanged;
		this.caQadl02 = caQadl02;
		this.caQadl03 = caQadl03;
		this.caQadt01 = caQadt01;
		this.caQadt02 = caQadt02;
		this.caQadt03 = caQadt03;
		this.caModUserid = caModUserid;
		this.caModDate = caModDate;
		this.caCustomer = caCustomer;
		this.caTaxUsage = caTaxUsage;
		this.caTaxPct = caTaxPct;
		this.caQuoteNbr = caQuoteNbr;
		this.caFixRate = caFixRate;
		this.caChannel = caChannel;
		this.caExRate2 = caExRate2;
		this.caExRatetype = caExRatetype;
		this.caExruSeq = caExruSeq;
		this.caQadl04 = caQadl04;
		this.caEndDate = caEndDate;
		this.caStartDate = caStartDate;
		this.caPrjNbr = caPrjNbr;
		this.caDefWs = caDefWs;
		this.caUpdIsb = caUpdIsb;
		this.oidCaMstr = oidCaMstr;
	}

	// Property accessors

	public CaMstrId getId() {
		return this.id;
	}

	public void setId(CaMstrId id) {
		this.id = id;
	}

	public Date getCaNxtDate() {
		return this.caNxtDate;
	}

	public void setCaNxtDate(Date caNxtDate) {
		this.caNxtDate = caNxtDate;
	}

	public Integer getCaNxtTim() {
		return this.caNxtTim;
	}

	public void setCaNxtTim(Integer caNxtTim) {
		this.caNxtTim = caNxtTim;
	}

	public String getCaQue() {
		return this.caQue;
	}

	public void setCaQue(String caQue) {
		this.caQue = caQue;
	}

	public String getCaAssign() {
		return this.caAssign;
	}

	public void setCaAssign(String caAssign) {
		this.caAssign = caAssign;
	}

	public String getCaEuNbr() {
		return this.caEuNbr;
	}

	public void setCaEuNbr(String caEuNbr) {
		this.caEuNbr = caEuNbr;
	}

	public String getCaEnterBy() {
		return this.caEnterBy;
	}

	public void setCaEnterBy(String caEnterBy) {
		this.caEnterBy = caEnterBy;
	}

	public String getCaStatus() {
		return this.caStatus;
	}

	public void setCaStatus(String caStatus) {
		this.caStatus = caStatus;
	}

	public String getCaType() {
		return this.caType;
	}

	public void setCaType(String caType) {
		this.caType = caType;
	}

	public String getCaPart() {
		return this.caPart;
	}

	public void setCaPart(String caPart) {
		this.caPart = caPart;
	}

	public String getCaSerial() {
		return this.caSerial;
	}

	public void setCaSerial(String caSerial) {
		this.caSerial = caSerial;
	}

	public String getCaNxtAct() {
		return this.caNxtAct;
	}

	public void setCaNxtAct(String caNxtAct) {
		this.caNxtAct = caNxtAct;
	}

	public String getCaSoNbr() {
		return this.caSoNbr;
	}

	public void setCaSoNbr(String caSoNbr) {
		this.caSoNbr = caSoNbr;
	}

	public String getCaName() {
		return this.caName;
	}

	public void setCaName(String caName) {
		this.caName = caName;
	}

	public String getCaPhone() {
		return this.caPhone;
	}

	public void setCaPhone(String caPhone) {
		this.caPhone = caPhone;
	}

	public String getCaProblem() {
		return this.caProblem;
	}

	public void setCaProblem(String caProblem) {
		this.caProblem = caProblem;
	}

	public String getCaResolve() {
		return this.caResolve;
	}

	public void setCaResolve(String caResolve) {
		this.caResolve = caResolve;
	}

	public Integer getCaPri() {
		return this.caPri;
	}

	public void setCaPri(Integer caPri) {
		this.caPri = caPri;
	}

	public String getCaDesc() {
		return this.caDesc;
	}

	public void setCaDesc(String caDesc) {
		this.caDesc = caDesc;
	}

	public Date getCaEvtDate() {
		return this.caEvtDate;
	}

	public void setCaEvtDate(Date caEvtDate) {
		this.caEvtDate = caEvtDate;
	}

	public Integer getCaEvtTim() {
		return this.caEvtTim;
	}

	public void setCaEvtTim(Integer caEvtTim) {
		this.caEvtTim = caEvtTim;
	}

	public Integer getCaCmtindx() {
		return this.caCmtindx;
	}

	public void setCaCmtindx(Integer caCmtindx) {
		this.caCmtindx = caCmtindx;
	}

	public String getCaChr01() {
		return this.caChr01;
	}

	public void setCaChr01(String caChr01) {
		this.caChr01 = caChr01;
	}

	public String getCaChr02() {
		return this.caChr02;
	}

	public void setCaChr02(String caChr02) {
		this.caChr02 = caChr02;
	}

	public String getCaChr03() {
		return this.caChr03;
	}

	public void setCaChr03(String caChr03) {
		this.caChr03 = caChr03;
	}

	public String getCaChr04() {
		return this.caChr04;
	}

	public void setCaChr04(String caChr04) {
		this.caChr04 = caChr04;
	}

	public String getCaChr05() {
		return this.caChr05;
	}

	public void setCaChr05(String caChr05) {
		this.caChr05 = caChr05;
	}

	public Double getCaDec01() {
		return this.caDec01;
	}

	public void setCaDec01(Double caDec01) {
		this.caDec01 = caDec01;
	}

	public String getCaChr06() {
		return this.caChr06;
	}

	public void setCaChr06(String caChr06) {
		this.caChr06 = caChr06;
	}

	public String getCaChr07() {
		return this.caChr07;
	}

	public void setCaChr07(String caChr07) {
		this.caChr07 = caChr07;
	}

	public String getCaChr08() {
		return this.caChr08;
	}

	public void setCaChr08(String caChr08) {
		this.caChr08 = caChr08;
	}

	public String getCaChr09() {
		return this.caChr09;
	}

	public void setCaChr09(String caChr09) {
		this.caChr09 = caChr09;
	}

	public String getCaChr10() {
		return this.caChr10;
	}

	public void setCaChr10(String caChr10) {
		this.caChr10 = caChr10;
	}

	public Date getCaDte01() {
		return this.caDte01;
	}

	public void setCaDte01(Date caDte01) {
		this.caDte01 = caDte01;
	}

	public Date getCaDte02() {
		return this.caDte02;
	}

	public void setCaDte02(Date caDte02) {
		this.caDte02 = caDte02;
	}

	public Date getCaDte03() {
		return this.caDte03;
	}

	public void setCaDte03(Date caDte03) {
		this.caDte03 = caDte03;
	}

	public Date getCaDte04() {
		return this.caDte04;
	}

	public void setCaDte04(Date caDte04) {
		this.caDte04 = caDte04;
	}

	public Date getCaDte05() {
		return this.caDte05;
	}

	public void setCaDte05(Date caDte05) {
		this.caDte05 = caDte05;
	}

	public Double getCaDec02() {
		return this.caDec02;
	}

	public void setCaDec02(Double caDec02) {
		this.caDec02 = caDec02;
	}

	public Double getCaDec03() {
		return this.caDec03;
	}

	public void setCaDec03(Double caDec03) {
		this.caDec03 = caDec03;
	}

	public Boolean getCaLog01() {
		return this.caLog01;
	}

	public void setCaLog01(Boolean caLog01) {
		this.caLog01 = caLog01;
	}

	public Boolean getCaLog02() {
		return this.caLog02;
	}

	public void setCaLog02(Boolean caLog02) {
		this.caLog02 = caLog02;
	}

	public Boolean getCaLog03() {
		return this.caLog03;
	}

	public void setCaLog03(Boolean caLog03) {
		this.caLog03 = caLog03;
	}

	public Boolean getCaLog04() {
		return this.caLog04;
	}

	public void setCaLog04(Boolean caLog04) {
		this.caLog04 = caLog04;
	}

	public Boolean getCaLog05() {
		return this.caLog05;
	}

	public void setCaLog05(Boolean caLog05) {
		this.caLog05 = caLog05;
	}

	public String getCaArea() {
		return this.caArea;
	}

	public void setCaArea(String caArea) {
		this.caArea = caArea;
	}

	public Integer getCaTrvDist() {
		return this.caTrvDist;
	}

	public void setCaTrvDist(Integer caTrvDist) {
		this.caTrvDist = caTrvDist;
	}

	public String getCaTrvUm() {
		return this.caTrvUm;
	}

	public void setCaTrvUm(String caTrvUm) {
		this.caTrvUm = caTrvUm;
	}

	public String getCaSvCode() {
		return this.caSvCode;
	}

	public void setCaSvCode(String caSvCode) {
		this.caSvCode = caSvCode;
	}

	public String getCaFromQue() {
		return this.caFromQue;
	}

	public void setCaFromQue(String caFromQue) {
		this.caFromQue = caFromQue;
	}

	public Date getCaSntDate() {
		return this.caSntDate;
	}

	public void setCaSntDate(Date caSntDate) {
		this.caSntDate = caSntDate;
	}

	public Integer getCaSntTime() {
		return this.caSntTime;
	}

	public void setCaSntTime(Integer caSntTime) {
		this.caSntTime = caSntTime;
	}

	public String getCaRmaNbr() {
		return this.caRmaNbr;
	}

	public void setCaRmaNbr(String caRmaNbr) {
		this.caRmaNbr = caRmaNbr;
	}

	public String getCaCode() {
		return this.caCode;
	}

	public void setCaCode(String caCode) {
		this.caCode = caCode;
	}

	public Integer getCaSeq() {
		return this.caSeq;
	}

	public void setCaSeq(Integer caSeq) {
		this.caSeq = caSeq;
	}

	public String getCaNxtTime() {
		return this.caNxtTime;
	}

	public void setCaNxtTime(String caNxtTime) {
		this.caNxtTime = caNxtTime;
	}

	public String getCaEvtTime() {
		return this.caEvtTime;
	}

	public void setCaEvtTime(String caEvtTime) {
		this.caEvtTime = caEvtTime;
	}

	public Date getCaOpnDate() {
		return this.caOpnDate;
	}

	public void setCaOpnDate(Date caOpnDate) {
		this.caOpnDate = caOpnDate;
	}

	public String getCaOpnTime() {
		return this.caOpnTime;
	}

	public void setCaOpnTime(String caOpnTime) {
		this.caOpnTime = caOpnTime;
	}

	public Integer getCaRef() {
		return this.caRef;
	}

	public void setCaRef(Integer caRef) {
		this.caRef = caRef;
	}

	public Double getCaTimeLog() {
		return this.caTimeLog;
	}

	public void setCaTimeLog(Double caTimeLog) {
		this.caTimeLog = caTimeLog;
	}

	public Date getCaClsDate() {
		return this.caClsDate;
	}

	public void setCaClsDate(Date caClsDate) {
		this.caClsDate = caClsDate;
	}

	public String getCaClsTime() {
		return this.caClsTime;
	}

	public void setCaClsTime(String caClsTime) {
		this.caClsTime = caClsTime;
	}

	public String getCaContract() {
		return this.caContract;
	}

	public void setCaContract(String caContract) {
		this.caContract = caContract;
	}

	public String getCaSeverity() {
		return this.caSeverity;
	}

	public void setCaSeverity(String caSeverity) {
		this.caSeverity = caSeverity;
	}

	public Integer getCaCline() {
		return this.caCline;
	}

	public void setCaCline(Integer caCline) {
		this.caCline = caCline;
	}

	public String getCaToQue() {
		return this.caToQue;
	}

	public void setCaToQue(String caToQue) {
		this.caToQue = caToQue;
	}

	public Boolean getCaBilled() {
		return this.caBilled;
	}

	public void setCaBilled(Boolean caBilled) {
		this.caBilled = caBilled;
	}

	public String getCaSr() {
		return this.caSr;
	}

	public void setCaSr(String caSr) {
		this.caSr = caSr;
	}

	public Boolean getCaActivity() {
		return this.caActivity;
	}

	public void setCaActivity(Boolean caActivity) {
		this.caActivity = caActivity;
	}

	public Integer getCaEcmtindx() {
		return this.caEcmtindx;
	}

	public void setCaEcmtindx(Integer caEcmtindx) {
		this.caEcmtindx = caEcmtindx;
	}

	public String getCaPoNbr() {
		return this.caPoNbr;
	}

	public void setCaPoNbr(String caPoNbr) {
		this.caPoNbr = caPoNbr;
	}

	public String getCaQadc04() {
		return this.caQadc04;
	}

	public void setCaQadc04(String caQadc04) {
		this.caQadc04 = caQadc04;
	}

	public String getCaUser1() {
		return this.caUser1;
	}

	public void setCaUser1(String caUser1) {
		this.caUser1 = caUser1;
	}

	public String getCaUser2() {
		return this.caUser2;
	}

	public void setCaUser2(String caUser2) {
		this.caUser2 = caUser2;
	}

	public Boolean getCaCmmtMod() {
		return this.caCmmtMod;
	}

	public void setCaCmmtMod(Boolean caCmmtMod) {
		this.caCmmtMod = caCmmtMod;
	}

	public String getCaCreated() {
		return this.caCreated;
	}

	public void setCaCreated(String caCreated) {
		this.caCreated = caCreated;
	}

	public Date getCaDateStmp() {
		return this.caDateStmp;
	}

	public void setCaDateStmp(Date caDateStmp) {
		this.caDateStmp = caDateStmp;
	}

	public String getCaEngArea() {
		return this.caEngArea;
	}

	public void setCaEngArea(String caEngArea) {
		this.caEngArea = caEngArea;
	}

	public String getCaEngGroup() {
		return this.caEngGroup;
	}

	public void setCaEngGroup(String caEngGroup) {
		this.caEngGroup = caEngGroup;
	}

	public String getCaQadc06() {
		return this.caQadc06;
	}

	public void setCaQadc06(String caQadc06) {
		this.caQadc06 = caQadc06;
	}

	public String getCaEstTime() {
		return this.caEstTime;
	}

	public void setCaEstTime(String caEstTime) {
		this.caEstTime = caEstTime;
	}

	public String getCaEsNbr() {
		return this.caEsNbr;
	}

	public void setCaEsNbr(String caEsNbr) {
		this.caEsNbr = caEsNbr;
	}

	public Integer getCaEsSeq() {
		return this.caEsSeq;
	}

	public void setCaEsSeq(Integer caEsSeq) {
		this.caEsSeq = caEsSeq;
	}

	public Date getCaEuDate() {
		return this.caEuDate;
	}

	public void setCaEuDate(Date caEuDate) {
		this.caEuDate = caEuDate;
	}

	public String getCaEuTime() {
		return this.caEuTime;
	}

	public void setCaEuTime(String caEuTime) {
		this.caEuTime = caEuTime;
	}

	public String getCaIntType() {
		return this.caIntType;
	}

	public void setCaIntType(String caIntType) {
		this.caIntType = caIntType;
	}

	public Integer getCaQadi01() {
		return this.caQadi01;
	}

	public void setCaQadi01(Integer caQadi01) {
		this.caQadi01 = caQadi01;
	}

	public String getCaRev() {
		return this.caRev;
	}

	public void setCaRev(String caRev) {
		this.caRev = caRev;
	}

	public String getCaRpBom() {
		return this.caRpBom;
	}

	public void setCaRpBom(String caRpBom) {
		this.caRpBom = caRpBom;
	}

	public String getCaRpRoute() {
		return this.caRpRoute;
	}

	public void setCaRpRoute(String caRpRoute) {
		this.caRpRoute = caRpRoute;
	}

	public String getCaSite() {
		return this.caSite;
	}

	public void setCaSite(String caSite) {
		this.caSite = caSite;
	}

	public String getCaTimeStmp() {
		return this.caTimeStmp;
	}

	public void setCaTimeStmp(String caTimeStmp) {
		this.caTimeStmp = caTimeStmp;
	}

	public String getCaTrvTime() {
		return this.caTrvTime;
	}

	public void setCaTrvTime(String caTrvTime) {
		this.caTrvTime = caTrvTime;
	}

	public String getCaQadc05() {
		return this.caQadc05;
	}

	public void setCaQadc05(String caQadc05) {
		this.caQadc05 = caQadc05;
	}

	public Boolean getCaScheduleCa() {
		return this.caScheduleCa;
	}

	public void setCaScheduleCa(Boolean caScheduleCa) {
		this.caScheduleCa = caScheduleCa;
	}

	public Boolean getCa3rdParty() {
		return this.ca3rdParty;
	}

	public void setCa3rdParty(Boolean ca3rdParty) {
		this.ca3rdParty = ca3rdParty;
	}

	public String getCa3rdPartyId() {
		return this.ca3rdPartyId;
	}

	public void setCa3rdPartyId(String ca3rdPartyId) {
		this.ca3rdPartyId = ca3rdPartyId;
	}

	public Integer getCaAckCmtindx() {
		return this.caAckCmtindx;
	}

	public void setCaAckCmtindx(Integer caAckCmtindx) {
		this.caAckCmtindx = caAckCmtindx;
	}

	public Boolean getCaAckLetter() {
		return this.caAckLetter;
	}

	public void setCaAckLetter(Boolean caAckLetter) {
		this.caAckLetter = caAckLetter;
	}

	public Date getCaCompDate() {
		return this.caCompDate;
	}

	public void setCaCompDate(Date caCompDate) {
		this.caCompDate = caCompDate;
	}

	public String getCaCompTime() {
		return this.caCompTime;
	}

	public void setCaCompTime(String caCompTime) {
		this.caCompTime = caCompTime;
	}

	public String getCaCrTerms() {
		return this.caCrTerms;
	}

	public void setCaCrTerms(String caCrTerms) {
		this.caCrTerms = caCrTerms;
	}

	public String getCaCurr() {
		return this.caCurr;
	}

	public void setCaCurr(String caCurr) {
		this.caCurr = caCurr;
	}

	public Boolean getCaRecorded() {
		return this.caRecorded;
	}

	public void setCaRecorded(Boolean caRecorded) {
		this.caRecorded = caRecorded;
	}

	public Double getCaExRate() {
		return this.caExRate;
	}

	public void setCaExRate(Double caExRate) {
		this.caExRate = caExRate;
	}

	public String getCaFnNbr() {
		return this.caFnNbr;
	}

	public void setCaFnNbr(String caFnNbr) {
		this.caFnNbr = caFnNbr;
	}

	public Boolean getCaIncStats() {
		return this.caIncStats;
	}

	public void setCaIncStats(Boolean caIncStats) {
		this.caIncStats = caIncStats;
	}

	public Boolean getCaPrinted() {
		return this.caPrinted;
	}

	public void setCaPrinted(Boolean caPrinted) {
		this.caPrinted = caPrinted;
	}

	public String getCaPrList() {
		return this.caPrList;
	}

	public void setCaPrList(String caPrList) {
		this.caPrList = caPrList;
	}

	public Integer getCaQoCmtindx() {
		return this.caQoCmtindx;
	}

	public void setCaQoCmtindx(Integer caQoCmtindx) {
		this.caQoCmtindx = caQoCmtindx;
	}

	public Boolean getCaQuote() {
		return this.caQuote;
	}

	public void setCaQuote(Boolean caQuote) {
		this.caQuote = caQuote;
	}

	public Double getCaQuotePrice() {
		return this.caQuotePrice;
	}

	public void setCaQuotePrice(Double caQuotePrice) {
		this.caQuotePrice = caQuotePrice;
	}

	public String getCaRcSite() {
		return this.caRcSite;
	}

	public void setCaRcSite(String caRcSite) {
		this.caRcSite = caRcSite;
	}

	public String getCaResolveDesc() {
		return this.caResolveDesc;
	}

	public void setCaResolveDesc(String caResolveDesc) {
		this.caResolveDesc = caResolveDesc;
	}

	public Integer getCaResCmtidx() {
		return this.caResCmtidx;
	}

	public void setCaResCmtidx(Integer caResCmtidx) {
		this.caResCmtidx = caResCmtidx;
	}

	public String getCaShipTo() {
		return this.caShipTo;
	}

	public void setCaShipTo(String caShipTo) {
		this.caShipTo = caShipTo;
	}

	public String getCaSqNbr() {
		return this.caSqNbr;
	}

	public void setCaSqNbr(String caSqNbr) {
		this.caSqNbr = caSqNbr;
	}

	public Boolean getCaSuspended() {
		return this.caSuspended;
	}

	public void setCaSuspended(Boolean caSuspended) {
		this.caSuspended = caSuspended;
	}

	public String getCaSvcType() {
		return this.caSvcType;
	}

	public void setCaSvcType(String caSvcType) {
		this.caSvcType = caSvcType;
	}

	public Boolean getCaTaxable() {
		return this.caTaxable;
	}

	public void setCaTaxable(Boolean caTaxable) {
		this.caTaxable = caTaxable;
	}

	public String getCaTaxc() {
		return this.caTaxc;
	}

	public void setCaTaxc(String caTaxc) {
		this.caTaxc = caTaxc;
	}

	public Boolean getCaWaitingParts() {
		return this.caWaitingParts;
	}

	public void setCaWaitingParts(Boolean caWaitingParts) {
		this.caWaitingParts = caWaitingParts;
	}

	public String getCaBill() {
		return this.caBill;
	}

	public void setCaBill(String caBill) {
		this.caBill = caBill;
	}

	public Double getCaEntEx() {
		return this.caEntEx;
	}

	public void setCaEntEx(Double caEntEx) {
		this.caEntEx = caEntEx;
	}

	public Boolean getCaInvDraft() {
		return this.caInvDraft;
	}

	public void setCaInvDraft(Boolean caInvDraft) {
		this.caInvDraft = caInvDraft;
	}

	public String getCaTaxEnv() {
		return this.caTaxEnv;
	}

	public void setCaTaxEnv(String caTaxEnv) {
		this.caTaxEnv = caTaxEnv;
	}

	public Boolean getCaRepairCtr() {
		return this.caRepairCtr;
	}

	public void setCaRepairCtr(Boolean caRepairCtr) {
		this.caRepairCtr = caRepairCtr;
	}

	public String getCaLang() {
		return this.caLang;
	}

	public void setCaLang(String caLang) {
		this.caLang = caLang;
	}

	public Date getCaTaxDate() {
		return this.caTaxDate;
	}

	public void setCaTaxDate(Date caTaxDate) {
		this.caTaxDate = caTaxDate;
	}

	public Date getCaQuoteExp() {
		return this.caQuoteExp;
	}

	public void setCaQuoteExp(Date caQuoteExp) {
		this.caQuoteExp = caQuoteExp;
	}

	public String getCaRrcNbr() {
		return this.caRrcNbr;
	}

	public void setCaRrcNbr(String caRrcNbr) {
		this.caRrcNbr = caRrcNbr;
	}

	public Integer getCaRrcSeq() {
		return this.caRrcSeq;
	}

	public void setCaRrcSeq(Integer caRrcSeq) {
		this.caRrcSeq = caRrcSeq;
	}

	public String getCaQadc03() {
		return this.caQadc03;
	}

	public void setCaQadc03(String caQadc03) {
		this.caQadc03 = caQadc03;
	}

	public Integer getCaQadi02() {
		return this.caQadi02;
	}

	public void setCaQadi02(Integer caQadi02) {
		this.caQadi02 = caQadi02;
	}

	public Integer getCaQadi03() {
		return this.caQadi03;
	}

	public void setCaQadi03(Integer caQadi03) {
		this.caQadi03 = caQadi03;
	}

	public Double getCaQadd01() {
		return this.caQadd01;
	}

	public void setCaQadd01(Double caQadd01) {
		this.caQadd01 = caQadd01;
	}

	public Double getCaQadd02() {
		return this.caQadd02;
	}

	public void setCaQadd02(Double caQadd02) {
		this.caQadd02 = caQadd02;
	}

	public Double getCaQadd03() {
		return this.caQadd03;
	}

	public void setCaQadd03(Double caQadd03) {
		this.caQadd03 = caQadd03;
	}

	public Boolean getCaEuChanged() {
		return this.caEuChanged;
	}

	public void setCaEuChanged(Boolean caEuChanged) {
		this.caEuChanged = caEuChanged;
	}

	public Boolean getCaQadl02() {
		return this.caQadl02;
	}

	public void setCaQadl02(Boolean caQadl02) {
		this.caQadl02 = caQadl02;
	}

	public Boolean getCaQadl03() {
		return this.caQadl03;
	}

	public void setCaQadl03(Boolean caQadl03) {
		this.caQadl03 = caQadl03;
	}

	public Date getCaQadt01() {
		return this.caQadt01;
	}

	public void setCaQadt01(Date caQadt01) {
		this.caQadt01 = caQadt01;
	}

	public Date getCaQadt02() {
		return this.caQadt02;
	}

	public void setCaQadt02(Date caQadt02) {
		this.caQadt02 = caQadt02;
	}

	public Date getCaQadt03() {
		return this.caQadt03;
	}

	public void setCaQadt03(Date caQadt03) {
		this.caQadt03 = caQadt03;
	}

	public String getCaModUserid() {
		return this.caModUserid;
	}

	public void setCaModUserid(String caModUserid) {
		this.caModUserid = caModUserid;
	}

	public Date getCaModDate() {
		return this.caModDate;
	}

	public void setCaModDate(Date caModDate) {
		this.caModDate = caModDate;
	}

	public String getCaCustomer() {
		return this.caCustomer;
	}

	public void setCaCustomer(String caCustomer) {
		this.caCustomer = caCustomer;
	}

	public String getCaTaxUsage() {
		return this.caTaxUsage;
	}

	public void setCaTaxUsage(String caTaxUsage) {
		this.caTaxUsage = caTaxUsage;
	}

	public Double getCaTaxPct() {
		return this.caTaxPct;
	}

	public void setCaTaxPct(Double caTaxPct) {
		this.caTaxPct = caTaxPct;
	}

	public String getCaQuoteNbr() {
		return this.caQuoteNbr;
	}

	public void setCaQuoteNbr(String caQuoteNbr) {
		this.caQuoteNbr = caQuoteNbr;
	}

	public Boolean getCaFixRate() {
		return this.caFixRate;
	}

	public void setCaFixRate(Boolean caFixRate) {
		this.caFixRate = caFixRate;
	}

	public String getCaChannel() {
		return this.caChannel;
	}

	public void setCaChannel(String caChannel) {
		this.caChannel = caChannel;
	}

	public Double getCaExRate2() {
		return this.caExRate2;
	}

	public void setCaExRate2(Double caExRate2) {
		this.caExRate2 = caExRate2;
	}

	public String getCaExRatetype() {
		return this.caExRatetype;
	}

	public void setCaExRatetype(String caExRatetype) {
		this.caExRatetype = caExRatetype;
	}

	public Integer getCaExruSeq() {
		return this.caExruSeq;
	}

	public void setCaExruSeq(Integer caExruSeq) {
		this.caExruSeq = caExruSeq;
	}

	public Boolean getCaQadl04() {
		return this.caQadl04;
	}

	public void setCaQadl04(Boolean caQadl04) {
		this.caQadl04 = caQadl04;
	}

	public Date getCaEndDate() {
		return this.caEndDate;
	}

	public void setCaEndDate(Date caEndDate) {
		this.caEndDate = caEndDate;
	}

	public Date getCaStartDate() {
		return this.caStartDate;
	}

	public void setCaStartDate(Date caStartDate) {
		this.caStartDate = caStartDate;
	}

	public String getCaPrjNbr() {
		return this.caPrjNbr;
	}

	public void setCaPrjNbr(String caPrjNbr) {
		this.caPrjNbr = caPrjNbr;
	}

	public String getCaDefWs() {
		return this.caDefWs;
	}

	public void setCaDefWs(String caDefWs) {
		this.caDefWs = caDefWs;
	}

	public Boolean getCaUpdIsb() {
		return this.caUpdIsb;
	}

	public void setCaUpdIsb(Boolean caUpdIsb) {
		this.caUpdIsb = caUpdIsb;
	}

	public Double getOidCaMstr() {
		return this.oidCaMstr;
	}

	public void setOidCaMstr(Double oidCaMstr) {
		this.oidCaMstr = oidCaMstr;
	}

}