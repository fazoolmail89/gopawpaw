package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractChmMstr entity provides the base persistence definition of the
 * ChmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractChmMstr implements java.io.Serializable {

	// Fields

	private ChmMstrId id;
	private String chmDesc;
	private String chmName;
	private String chmPhone;
	private String chmPart;
	private String chmSerial;
	private String chmEuNbr;
	private String chmSoNbr;
	private String chmRmaNbr;
	private String chmOpnTime;
	private Date chmClsDate;
	private String chmClsTime;
	private String chmResolve;
	private Integer chmCmtindx;
	private Integer chmRef;
	private String chmProblem;
	private String chmContract;
	private String chmChr01;
	private String chmChr02;
	private String chmChr03;
	private String chmChr04;
	private String chmChr05;
	private String chmChr06;
	private String chmChr07;
	private String chmChr08;
	private String chmChr09;
	private String chmChr10;
	private Double chmDec01;
	private Double chmDec02;
	private Double chmDec03;
	private Date chmDte01;
	private Date chmDte02;
	private Date chmDte03;
	private Date chmDte04;
	private Boolean chmLog01;
	private Boolean chmLog02;
	private Boolean chmLog03;
	private Boolean chmLog04;
	private Boolean chmLog05;
	private String chmSvCode;
	private Integer chmCline;
	private String chmToQue;
	private String chmSr;
	private String chmSeverity;
	private String chmType;
	private String chmUser1;
	private String chmUser2;
	private String chmArea;
	private String chmAssign;
	private String chmCreated;
	private Date chmDateStmp;
	private String chmEngArea;
	private String chmEngGroup;
	private String chmEstTime;
	private String chmEsNbr;
	private Integer chmEsSeq;
	private Date chmEuDate;
	private String chmEuTime;
	private String chmIntType;
	private String chmPoNbr;
	private String chmQue;
	private String chmSite;
	private Double chmTimeLog;
	private String chmTimeStmp;
	private Integer chmTrvDist;
	private String chmTrvTime;
	private String chmTrvUm;
	private String chmWoLot;
	private String chmWoNbr;
	private Integer chmAckCmtindx;
	private String chmCompTime;
	private Date chmEnddownDate;
	private String chmEnddownTime;
	private String chmPrList;
	private Integer chmQoCmtindx;
	private Boolean chmQuote;
	private String chmQuoteCurr;
	private Double chmQuotePrice;
	private String chmRcSite;
	private String chmShipTo;
	private String chmStatus;
	private Date chmStdownDate;
	private String chmStdownTime;
	private Date chmStjobDate;
	private String chmStjobTime;
	private Boolean chm3rdParty;
	private String chm3rdPartyId;
	private Boolean chmAckLetter;
	private String chmBill;
	private String chmCode;
	private Date chmCompDate;
	private String chmEnterBy;
	private String chmFnNbr;
	private String chmFromQue;
	private Boolean chmIncStats;
	private Boolean chmInvDraft;
	private Boolean chmPrinted;
	private Integer chmResCmtidx;
	private Date chmDte05;
	private String chmCrTerms;
	private String chmCurr;
	private Integer chmEcmtindx;
	private String chmResolveDesc;
	private String chmRev;
	private String chmSqNbr;
	private String chmSvcType;
	private Boolean chmTaxable;
	private String chmTaxc;
	private Double chmExRate;
	private String chmSrvTimezone;
	private Boolean chmRepairCtr;
	private String chmEuTimezone;
	private String chmQadc03;
	private Integer chmQadi01;
	private Integer chmQadi02;
	private Integer chmQadi03;
	private Double chmQadde01;
	private Double chmQadde02;
	private Double chmQadde03;
	private Boolean chmQadl04;
	private Boolean chmQadl02;
	private Boolean chmQadl03;
	private Date chmQadd01;
	private Date chmQadd02;
	private Date chmQadd03;
	private String chmRpRoute;
	private String chmRpBom;
	private Boolean chmScheduleCa;
	private Date chmTaxDate;
	private Date chmQuoteExp;
	private Integer chmRrcSeq;
	private String chmRrcNbr;
	private String chmCustomer;
	private String chmTaxEnv;
	private String chmTaxUsage;
	private Double chmTaxPct;
	private String chmLang;
	private String chmQuoteNbr;
	private Double chmEntEx;
	private Boolean chmFixRate;
	private String chmChannel;
	private Double chmExRate2;
	private String chmExRatetype;
	private Integer chmExruSeq;
	private String chmQadc04;
	private String chmQadc05;
	private String chmQadc06;
	private Double oidChmMstr;

	// Constructors

	/** default constructor */
	public AbstractChmMstr() {
	}

	/** minimal constructor */
	public AbstractChmMstr(ChmMstrId id, String chmIntType, Double chmExRate2,
			String chmExRatetype, Integer chmExruSeq, Double oidChmMstr) {
		this.id = id;
		this.chmIntType = chmIntType;
		this.chmExRate2 = chmExRate2;
		this.chmExRatetype = chmExRatetype;
		this.chmExruSeq = chmExruSeq;
		this.oidChmMstr = oidChmMstr;
	}

	/** full constructor */
	public AbstractChmMstr(ChmMstrId id, String chmDesc, String chmName,
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
		this.id = id;
		this.chmDesc = chmDesc;
		this.chmName = chmName;
		this.chmPhone = chmPhone;
		this.chmPart = chmPart;
		this.chmSerial = chmSerial;
		this.chmEuNbr = chmEuNbr;
		this.chmSoNbr = chmSoNbr;
		this.chmRmaNbr = chmRmaNbr;
		this.chmOpnTime = chmOpnTime;
		this.chmClsDate = chmClsDate;
		this.chmClsTime = chmClsTime;
		this.chmResolve = chmResolve;
		this.chmCmtindx = chmCmtindx;
		this.chmRef = chmRef;
		this.chmProblem = chmProblem;
		this.chmContract = chmContract;
		this.chmChr01 = chmChr01;
		this.chmChr02 = chmChr02;
		this.chmChr03 = chmChr03;
		this.chmChr04 = chmChr04;
		this.chmChr05 = chmChr05;
		this.chmChr06 = chmChr06;
		this.chmChr07 = chmChr07;
		this.chmChr08 = chmChr08;
		this.chmChr09 = chmChr09;
		this.chmChr10 = chmChr10;
		this.chmDec01 = chmDec01;
		this.chmDec02 = chmDec02;
		this.chmDec03 = chmDec03;
		this.chmDte01 = chmDte01;
		this.chmDte02 = chmDte02;
		this.chmDte03 = chmDte03;
		this.chmDte04 = chmDte04;
		this.chmLog01 = chmLog01;
		this.chmLog02 = chmLog02;
		this.chmLog03 = chmLog03;
		this.chmLog04 = chmLog04;
		this.chmLog05 = chmLog05;
		this.chmSvCode = chmSvCode;
		this.chmCline = chmCline;
		this.chmToQue = chmToQue;
		this.chmSr = chmSr;
		this.chmSeverity = chmSeverity;
		this.chmType = chmType;
		this.chmUser1 = chmUser1;
		this.chmUser2 = chmUser2;
		this.chmArea = chmArea;
		this.chmAssign = chmAssign;
		this.chmCreated = chmCreated;
		this.chmDateStmp = chmDateStmp;
		this.chmEngArea = chmEngArea;
		this.chmEngGroup = chmEngGroup;
		this.chmEstTime = chmEstTime;
		this.chmEsNbr = chmEsNbr;
		this.chmEsSeq = chmEsSeq;
		this.chmEuDate = chmEuDate;
		this.chmEuTime = chmEuTime;
		this.chmIntType = chmIntType;
		this.chmPoNbr = chmPoNbr;
		this.chmQue = chmQue;
		this.chmSite = chmSite;
		this.chmTimeLog = chmTimeLog;
		this.chmTimeStmp = chmTimeStmp;
		this.chmTrvDist = chmTrvDist;
		this.chmTrvTime = chmTrvTime;
		this.chmTrvUm = chmTrvUm;
		this.chmWoLot = chmWoLot;
		this.chmWoNbr = chmWoNbr;
		this.chmAckCmtindx = chmAckCmtindx;
		this.chmCompTime = chmCompTime;
		this.chmEnddownDate = chmEnddownDate;
		this.chmEnddownTime = chmEnddownTime;
		this.chmPrList = chmPrList;
		this.chmQoCmtindx = chmQoCmtindx;
		this.chmQuote = chmQuote;
		this.chmQuoteCurr = chmQuoteCurr;
		this.chmQuotePrice = chmQuotePrice;
		this.chmRcSite = chmRcSite;
		this.chmShipTo = chmShipTo;
		this.chmStatus = chmStatus;
		this.chmStdownDate = chmStdownDate;
		this.chmStdownTime = chmStdownTime;
		this.chmStjobDate = chmStjobDate;
		this.chmStjobTime = chmStjobTime;
		this.chm3rdParty = chm3rdParty;
		this.chm3rdPartyId = chm3rdPartyId;
		this.chmAckLetter = chmAckLetter;
		this.chmBill = chmBill;
		this.chmCode = chmCode;
		this.chmCompDate = chmCompDate;
		this.chmEnterBy = chmEnterBy;
		this.chmFnNbr = chmFnNbr;
		this.chmFromQue = chmFromQue;
		this.chmIncStats = chmIncStats;
		this.chmInvDraft = chmInvDraft;
		this.chmPrinted = chmPrinted;
		this.chmResCmtidx = chmResCmtidx;
		this.chmDte05 = chmDte05;
		this.chmCrTerms = chmCrTerms;
		this.chmCurr = chmCurr;
		this.chmEcmtindx = chmEcmtindx;
		this.chmResolveDesc = chmResolveDesc;
		this.chmRev = chmRev;
		this.chmSqNbr = chmSqNbr;
		this.chmSvcType = chmSvcType;
		this.chmTaxable = chmTaxable;
		this.chmTaxc = chmTaxc;
		this.chmExRate = chmExRate;
		this.chmSrvTimezone = chmSrvTimezone;
		this.chmRepairCtr = chmRepairCtr;
		this.chmEuTimezone = chmEuTimezone;
		this.chmQadc03 = chmQadc03;
		this.chmQadi01 = chmQadi01;
		this.chmQadi02 = chmQadi02;
		this.chmQadi03 = chmQadi03;
		this.chmQadde01 = chmQadde01;
		this.chmQadde02 = chmQadde02;
		this.chmQadde03 = chmQadde03;
		this.chmQadl04 = chmQadl04;
		this.chmQadl02 = chmQadl02;
		this.chmQadl03 = chmQadl03;
		this.chmQadd01 = chmQadd01;
		this.chmQadd02 = chmQadd02;
		this.chmQadd03 = chmQadd03;
		this.chmRpRoute = chmRpRoute;
		this.chmRpBom = chmRpBom;
		this.chmScheduleCa = chmScheduleCa;
		this.chmTaxDate = chmTaxDate;
		this.chmQuoteExp = chmQuoteExp;
		this.chmRrcSeq = chmRrcSeq;
		this.chmRrcNbr = chmRrcNbr;
		this.chmCustomer = chmCustomer;
		this.chmTaxEnv = chmTaxEnv;
		this.chmTaxUsage = chmTaxUsage;
		this.chmTaxPct = chmTaxPct;
		this.chmLang = chmLang;
		this.chmQuoteNbr = chmQuoteNbr;
		this.chmEntEx = chmEntEx;
		this.chmFixRate = chmFixRate;
		this.chmChannel = chmChannel;
		this.chmExRate2 = chmExRate2;
		this.chmExRatetype = chmExRatetype;
		this.chmExruSeq = chmExruSeq;
		this.chmQadc04 = chmQadc04;
		this.chmQadc05 = chmQadc05;
		this.chmQadc06 = chmQadc06;
		this.oidChmMstr = oidChmMstr;
	}

	// Property accessors

	public ChmMstrId getId() {
		return this.id;
	}

	public void setId(ChmMstrId id) {
		this.id = id;
	}

	public String getChmDesc() {
		return this.chmDesc;
	}

	public void setChmDesc(String chmDesc) {
		this.chmDesc = chmDesc;
	}

	public String getChmName() {
		return this.chmName;
	}

	public void setChmName(String chmName) {
		this.chmName = chmName;
	}

	public String getChmPhone() {
		return this.chmPhone;
	}

	public void setChmPhone(String chmPhone) {
		this.chmPhone = chmPhone;
	}

	public String getChmPart() {
		return this.chmPart;
	}

	public void setChmPart(String chmPart) {
		this.chmPart = chmPart;
	}

	public String getChmSerial() {
		return this.chmSerial;
	}

	public void setChmSerial(String chmSerial) {
		this.chmSerial = chmSerial;
	}

	public String getChmEuNbr() {
		return this.chmEuNbr;
	}

	public void setChmEuNbr(String chmEuNbr) {
		this.chmEuNbr = chmEuNbr;
	}

	public String getChmSoNbr() {
		return this.chmSoNbr;
	}

	public void setChmSoNbr(String chmSoNbr) {
		this.chmSoNbr = chmSoNbr;
	}

	public String getChmRmaNbr() {
		return this.chmRmaNbr;
	}

	public void setChmRmaNbr(String chmRmaNbr) {
		this.chmRmaNbr = chmRmaNbr;
	}

	public String getChmOpnTime() {
		return this.chmOpnTime;
	}

	public void setChmOpnTime(String chmOpnTime) {
		this.chmOpnTime = chmOpnTime;
	}

	public Date getChmClsDate() {
		return this.chmClsDate;
	}

	public void setChmClsDate(Date chmClsDate) {
		this.chmClsDate = chmClsDate;
	}

	public String getChmClsTime() {
		return this.chmClsTime;
	}

	public void setChmClsTime(String chmClsTime) {
		this.chmClsTime = chmClsTime;
	}

	public String getChmResolve() {
		return this.chmResolve;
	}

	public void setChmResolve(String chmResolve) {
		this.chmResolve = chmResolve;
	}

	public Integer getChmCmtindx() {
		return this.chmCmtindx;
	}

	public void setChmCmtindx(Integer chmCmtindx) {
		this.chmCmtindx = chmCmtindx;
	}

	public Integer getChmRef() {
		return this.chmRef;
	}

	public void setChmRef(Integer chmRef) {
		this.chmRef = chmRef;
	}

	public String getChmProblem() {
		return this.chmProblem;
	}

	public void setChmProblem(String chmProblem) {
		this.chmProblem = chmProblem;
	}

	public String getChmContract() {
		return this.chmContract;
	}

	public void setChmContract(String chmContract) {
		this.chmContract = chmContract;
	}

	public String getChmChr01() {
		return this.chmChr01;
	}

	public void setChmChr01(String chmChr01) {
		this.chmChr01 = chmChr01;
	}

	public String getChmChr02() {
		return this.chmChr02;
	}

	public void setChmChr02(String chmChr02) {
		this.chmChr02 = chmChr02;
	}

	public String getChmChr03() {
		return this.chmChr03;
	}

	public void setChmChr03(String chmChr03) {
		this.chmChr03 = chmChr03;
	}

	public String getChmChr04() {
		return this.chmChr04;
	}

	public void setChmChr04(String chmChr04) {
		this.chmChr04 = chmChr04;
	}

	public String getChmChr05() {
		return this.chmChr05;
	}

	public void setChmChr05(String chmChr05) {
		this.chmChr05 = chmChr05;
	}

	public String getChmChr06() {
		return this.chmChr06;
	}

	public void setChmChr06(String chmChr06) {
		this.chmChr06 = chmChr06;
	}

	public String getChmChr07() {
		return this.chmChr07;
	}

	public void setChmChr07(String chmChr07) {
		this.chmChr07 = chmChr07;
	}

	public String getChmChr08() {
		return this.chmChr08;
	}

	public void setChmChr08(String chmChr08) {
		this.chmChr08 = chmChr08;
	}

	public String getChmChr09() {
		return this.chmChr09;
	}

	public void setChmChr09(String chmChr09) {
		this.chmChr09 = chmChr09;
	}

	public String getChmChr10() {
		return this.chmChr10;
	}

	public void setChmChr10(String chmChr10) {
		this.chmChr10 = chmChr10;
	}

	public Double getChmDec01() {
		return this.chmDec01;
	}

	public void setChmDec01(Double chmDec01) {
		this.chmDec01 = chmDec01;
	}

	public Double getChmDec02() {
		return this.chmDec02;
	}

	public void setChmDec02(Double chmDec02) {
		this.chmDec02 = chmDec02;
	}

	public Double getChmDec03() {
		return this.chmDec03;
	}

	public void setChmDec03(Double chmDec03) {
		this.chmDec03 = chmDec03;
	}

	public Date getChmDte01() {
		return this.chmDte01;
	}

	public void setChmDte01(Date chmDte01) {
		this.chmDte01 = chmDte01;
	}

	public Date getChmDte02() {
		return this.chmDte02;
	}

	public void setChmDte02(Date chmDte02) {
		this.chmDte02 = chmDte02;
	}

	public Date getChmDte03() {
		return this.chmDte03;
	}

	public void setChmDte03(Date chmDte03) {
		this.chmDte03 = chmDte03;
	}

	public Date getChmDte04() {
		return this.chmDte04;
	}

	public void setChmDte04(Date chmDte04) {
		this.chmDte04 = chmDte04;
	}

	public Boolean getChmLog01() {
		return this.chmLog01;
	}

	public void setChmLog01(Boolean chmLog01) {
		this.chmLog01 = chmLog01;
	}

	public Boolean getChmLog02() {
		return this.chmLog02;
	}

	public void setChmLog02(Boolean chmLog02) {
		this.chmLog02 = chmLog02;
	}

	public Boolean getChmLog03() {
		return this.chmLog03;
	}

	public void setChmLog03(Boolean chmLog03) {
		this.chmLog03 = chmLog03;
	}

	public Boolean getChmLog04() {
		return this.chmLog04;
	}

	public void setChmLog04(Boolean chmLog04) {
		this.chmLog04 = chmLog04;
	}

	public Boolean getChmLog05() {
		return this.chmLog05;
	}

	public void setChmLog05(Boolean chmLog05) {
		this.chmLog05 = chmLog05;
	}

	public String getChmSvCode() {
		return this.chmSvCode;
	}

	public void setChmSvCode(String chmSvCode) {
		this.chmSvCode = chmSvCode;
	}

	public Integer getChmCline() {
		return this.chmCline;
	}

	public void setChmCline(Integer chmCline) {
		this.chmCline = chmCline;
	}

	public String getChmToQue() {
		return this.chmToQue;
	}

	public void setChmToQue(String chmToQue) {
		this.chmToQue = chmToQue;
	}

	public String getChmSr() {
		return this.chmSr;
	}

	public void setChmSr(String chmSr) {
		this.chmSr = chmSr;
	}

	public String getChmSeverity() {
		return this.chmSeverity;
	}

	public void setChmSeverity(String chmSeverity) {
		this.chmSeverity = chmSeverity;
	}

	public String getChmType() {
		return this.chmType;
	}

	public void setChmType(String chmType) {
		this.chmType = chmType;
	}

	public String getChmUser1() {
		return this.chmUser1;
	}

	public void setChmUser1(String chmUser1) {
		this.chmUser1 = chmUser1;
	}

	public String getChmUser2() {
		return this.chmUser2;
	}

	public void setChmUser2(String chmUser2) {
		this.chmUser2 = chmUser2;
	}

	public String getChmArea() {
		return this.chmArea;
	}

	public void setChmArea(String chmArea) {
		this.chmArea = chmArea;
	}

	public String getChmAssign() {
		return this.chmAssign;
	}

	public void setChmAssign(String chmAssign) {
		this.chmAssign = chmAssign;
	}

	public String getChmCreated() {
		return this.chmCreated;
	}

	public void setChmCreated(String chmCreated) {
		this.chmCreated = chmCreated;
	}

	public Date getChmDateStmp() {
		return this.chmDateStmp;
	}

	public void setChmDateStmp(Date chmDateStmp) {
		this.chmDateStmp = chmDateStmp;
	}

	public String getChmEngArea() {
		return this.chmEngArea;
	}

	public void setChmEngArea(String chmEngArea) {
		this.chmEngArea = chmEngArea;
	}

	public String getChmEngGroup() {
		return this.chmEngGroup;
	}

	public void setChmEngGroup(String chmEngGroup) {
		this.chmEngGroup = chmEngGroup;
	}

	public String getChmEstTime() {
		return this.chmEstTime;
	}

	public void setChmEstTime(String chmEstTime) {
		this.chmEstTime = chmEstTime;
	}

	public String getChmEsNbr() {
		return this.chmEsNbr;
	}

	public void setChmEsNbr(String chmEsNbr) {
		this.chmEsNbr = chmEsNbr;
	}

	public Integer getChmEsSeq() {
		return this.chmEsSeq;
	}

	public void setChmEsSeq(Integer chmEsSeq) {
		this.chmEsSeq = chmEsSeq;
	}

	public Date getChmEuDate() {
		return this.chmEuDate;
	}

	public void setChmEuDate(Date chmEuDate) {
		this.chmEuDate = chmEuDate;
	}

	public String getChmEuTime() {
		return this.chmEuTime;
	}

	public void setChmEuTime(String chmEuTime) {
		this.chmEuTime = chmEuTime;
	}

	public String getChmIntType() {
		return this.chmIntType;
	}

	public void setChmIntType(String chmIntType) {
		this.chmIntType = chmIntType;
	}

	public String getChmPoNbr() {
		return this.chmPoNbr;
	}

	public void setChmPoNbr(String chmPoNbr) {
		this.chmPoNbr = chmPoNbr;
	}

	public String getChmQue() {
		return this.chmQue;
	}

	public void setChmQue(String chmQue) {
		this.chmQue = chmQue;
	}

	public String getChmSite() {
		return this.chmSite;
	}

	public void setChmSite(String chmSite) {
		this.chmSite = chmSite;
	}

	public Double getChmTimeLog() {
		return this.chmTimeLog;
	}

	public void setChmTimeLog(Double chmTimeLog) {
		this.chmTimeLog = chmTimeLog;
	}

	public String getChmTimeStmp() {
		return this.chmTimeStmp;
	}

	public void setChmTimeStmp(String chmTimeStmp) {
		this.chmTimeStmp = chmTimeStmp;
	}

	public Integer getChmTrvDist() {
		return this.chmTrvDist;
	}

	public void setChmTrvDist(Integer chmTrvDist) {
		this.chmTrvDist = chmTrvDist;
	}

	public String getChmTrvTime() {
		return this.chmTrvTime;
	}

	public void setChmTrvTime(String chmTrvTime) {
		this.chmTrvTime = chmTrvTime;
	}

	public String getChmTrvUm() {
		return this.chmTrvUm;
	}

	public void setChmTrvUm(String chmTrvUm) {
		this.chmTrvUm = chmTrvUm;
	}

	public String getChmWoLot() {
		return this.chmWoLot;
	}

	public void setChmWoLot(String chmWoLot) {
		this.chmWoLot = chmWoLot;
	}

	public String getChmWoNbr() {
		return this.chmWoNbr;
	}

	public void setChmWoNbr(String chmWoNbr) {
		this.chmWoNbr = chmWoNbr;
	}

	public Integer getChmAckCmtindx() {
		return this.chmAckCmtindx;
	}

	public void setChmAckCmtindx(Integer chmAckCmtindx) {
		this.chmAckCmtindx = chmAckCmtindx;
	}

	public String getChmCompTime() {
		return this.chmCompTime;
	}

	public void setChmCompTime(String chmCompTime) {
		this.chmCompTime = chmCompTime;
	}

	public Date getChmEnddownDate() {
		return this.chmEnddownDate;
	}

	public void setChmEnddownDate(Date chmEnddownDate) {
		this.chmEnddownDate = chmEnddownDate;
	}

	public String getChmEnddownTime() {
		return this.chmEnddownTime;
	}

	public void setChmEnddownTime(String chmEnddownTime) {
		this.chmEnddownTime = chmEnddownTime;
	}

	public String getChmPrList() {
		return this.chmPrList;
	}

	public void setChmPrList(String chmPrList) {
		this.chmPrList = chmPrList;
	}

	public Integer getChmQoCmtindx() {
		return this.chmQoCmtindx;
	}

	public void setChmQoCmtindx(Integer chmQoCmtindx) {
		this.chmQoCmtindx = chmQoCmtindx;
	}

	public Boolean getChmQuote() {
		return this.chmQuote;
	}

	public void setChmQuote(Boolean chmQuote) {
		this.chmQuote = chmQuote;
	}

	public String getChmQuoteCurr() {
		return this.chmQuoteCurr;
	}

	public void setChmQuoteCurr(String chmQuoteCurr) {
		this.chmQuoteCurr = chmQuoteCurr;
	}

	public Double getChmQuotePrice() {
		return this.chmQuotePrice;
	}

	public void setChmQuotePrice(Double chmQuotePrice) {
		this.chmQuotePrice = chmQuotePrice;
	}

	public String getChmRcSite() {
		return this.chmRcSite;
	}

	public void setChmRcSite(String chmRcSite) {
		this.chmRcSite = chmRcSite;
	}

	public String getChmShipTo() {
		return this.chmShipTo;
	}

	public void setChmShipTo(String chmShipTo) {
		this.chmShipTo = chmShipTo;
	}

	public String getChmStatus() {
		return this.chmStatus;
	}

	public void setChmStatus(String chmStatus) {
		this.chmStatus = chmStatus;
	}

	public Date getChmStdownDate() {
		return this.chmStdownDate;
	}

	public void setChmStdownDate(Date chmStdownDate) {
		this.chmStdownDate = chmStdownDate;
	}

	public String getChmStdownTime() {
		return this.chmStdownTime;
	}

	public void setChmStdownTime(String chmStdownTime) {
		this.chmStdownTime = chmStdownTime;
	}

	public Date getChmStjobDate() {
		return this.chmStjobDate;
	}

	public void setChmStjobDate(Date chmStjobDate) {
		this.chmStjobDate = chmStjobDate;
	}

	public String getChmStjobTime() {
		return this.chmStjobTime;
	}

	public void setChmStjobTime(String chmStjobTime) {
		this.chmStjobTime = chmStjobTime;
	}

	public Boolean getChm3rdParty() {
		return this.chm3rdParty;
	}

	public void setChm3rdParty(Boolean chm3rdParty) {
		this.chm3rdParty = chm3rdParty;
	}

	public String getChm3rdPartyId() {
		return this.chm3rdPartyId;
	}

	public void setChm3rdPartyId(String chm3rdPartyId) {
		this.chm3rdPartyId = chm3rdPartyId;
	}

	public Boolean getChmAckLetter() {
		return this.chmAckLetter;
	}

	public void setChmAckLetter(Boolean chmAckLetter) {
		this.chmAckLetter = chmAckLetter;
	}

	public String getChmBill() {
		return this.chmBill;
	}

	public void setChmBill(String chmBill) {
		this.chmBill = chmBill;
	}

	public String getChmCode() {
		return this.chmCode;
	}

	public void setChmCode(String chmCode) {
		this.chmCode = chmCode;
	}

	public Date getChmCompDate() {
		return this.chmCompDate;
	}

	public void setChmCompDate(Date chmCompDate) {
		this.chmCompDate = chmCompDate;
	}

	public String getChmEnterBy() {
		return this.chmEnterBy;
	}

	public void setChmEnterBy(String chmEnterBy) {
		this.chmEnterBy = chmEnterBy;
	}

	public String getChmFnNbr() {
		return this.chmFnNbr;
	}

	public void setChmFnNbr(String chmFnNbr) {
		this.chmFnNbr = chmFnNbr;
	}

	public String getChmFromQue() {
		return this.chmFromQue;
	}

	public void setChmFromQue(String chmFromQue) {
		this.chmFromQue = chmFromQue;
	}

	public Boolean getChmIncStats() {
		return this.chmIncStats;
	}

	public void setChmIncStats(Boolean chmIncStats) {
		this.chmIncStats = chmIncStats;
	}

	public Boolean getChmInvDraft() {
		return this.chmInvDraft;
	}

	public void setChmInvDraft(Boolean chmInvDraft) {
		this.chmInvDraft = chmInvDraft;
	}

	public Boolean getChmPrinted() {
		return this.chmPrinted;
	}

	public void setChmPrinted(Boolean chmPrinted) {
		this.chmPrinted = chmPrinted;
	}

	public Integer getChmResCmtidx() {
		return this.chmResCmtidx;
	}

	public void setChmResCmtidx(Integer chmResCmtidx) {
		this.chmResCmtidx = chmResCmtidx;
	}

	public Date getChmDte05() {
		return this.chmDte05;
	}

	public void setChmDte05(Date chmDte05) {
		this.chmDte05 = chmDte05;
	}

	public String getChmCrTerms() {
		return this.chmCrTerms;
	}

	public void setChmCrTerms(String chmCrTerms) {
		this.chmCrTerms = chmCrTerms;
	}

	public String getChmCurr() {
		return this.chmCurr;
	}

	public void setChmCurr(String chmCurr) {
		this.chmCurr = chmCurr;
	}

	public Integer getChmEcmtindx() {
		return this.chmEcmtindx;
	}

	public void setChmEcmtindx(Integer chmEcmtindx) {
		this.chmEcmtindx = chmEcmtindx;
	}

	public String getChmResolveDesc() {
		return this.chmResolveDesc;
	}

	public void setChmResolveDesc(String chmResolveDesc) {
		this.chmResolveDesc = chmResolveDesc;
	}

	public String getChmRev() {
		return this.chmRev;
	}

	public void setChmRev(String chmRev) {
		this.chmRev = chmRev;
	}

	public String getChmSqNbr() {
		return this.chmSqNbr;
	}

	public void setChmSqNbr(String chmSqNbr) {
		this.chmSqNbr = chmSqNbr;
	}

	public String getChmSvcType() {
		return this.chmSvcType;
	}

	public void setChmSvcType(String chmSvcType) {
		this.chmSvcType = chmSvcType;
	}

	public Boolean getChmTaxable() {
		return this.chmTaxable;
	}

	public void setChmTaxable(Boolean chmTaxable) {
		this.chmTaxable = chmTaxable;
	}

	public String getChmTaxc() {
		return this.chmTaxc;
	}

	public void setChmTaxc(String chmTaxc) {
		this.chmTaxc = chmTaxc;
	}

	public Double getChmExRate() {
		return this.chmExRate;
	}

	public void setChmExRate(Double chmExRate) {
		this.chmExRate = chmExRate;
	}

	public String getChmSrvTimezone() {
		return this.chmSrvTimezone;
	}

	public void setChmSrvTimezone(String chmSrvTimezone) {
		this.chmSrvTimezone = chmSrvTimezone;
	}

	public Boolean getChmRepairCtr() {
		return this.chmRepairCtr;
	}

	public void setChmRepairCtr(Boolean chmRepairCtr) {
		this.chmRepairCtr = chmRepairCtr;
	}

	public String getChmEuTimezone() {
		return this.chmEuTimezone;
	}

	public void setChmEuTimezone(String chmEuTimezone) {
		this.chmEuTimezone = chmEuTimezone;
	}

	public String getChmQadc03() {
		return this.chmQadc03;
	}

	public void setChmQadc03(String chmQadc03) {
		this.chmQadc03 = chmQadc03;
	}

	public Integer getChmQadi01() {
		return this.chmQadi01;
	}

	public void setChmQadi01(Integer chmQadi01) {
		this.chmQadi01 = chmQadi01;
	}

	public Integer getChmQadi02() {
		return this.chmQadi02;
	}

	public void setChmQadi02(Integer chmQadi02) {
		this.chmQadi02 = chmQadi02;
	}

	public Integer getChmQadi03() {
		return this.chmQadi03;
	}

	public void setChmQadi03(Integer chmQadi03) {
		this.chmQadi03 = chmQadi03;
	}

	public Double getChmQadde01() {
		return this.chmQadde01;
	}

	public void setChmQadde01(Double chmQadde01) {
		this.chmQadde01 = chmQadde01;
	}

	public Double getChmQadde02() {
		return this.chmQadde02;
	}

	public void setChmQadde02(Double chmQadde02) {
		this.chmQadde02 = chmQadde02;
	}

	public Double getChmQadde03() {
		return this.chmQadde03;
	}

	public void setChmQadde03(Double chmQadde03) {
		this.chmQadde03 = chmQadde03;
	}

	public Boolean getChmQadl04() {
		return this.chmQadl04;
	}

	public void setChmQadl04(Boolean chmQadl04) {
		this.chmQadl04 = chmQadl04;
	}

	public Boolean getChmQadl02() {
		return this.chmQadl02;
	}

	public void setChmQadl02(Boolean chmQadl02) {
		this.chmQadl02 = chmQadl02;
	}

	public Boolean getChmQadl03() {
		return this.chmQadl03;
	}

	public void setChmQadl03(Boolean chmQadl03) {
		this.chmQadl03 = chmQadl03;
	}

	public Date getChmQadd01() {
		return this.chmQadd01;
	}

	public void setChmQadd01(Date chmQadd01) {
		this.chmQadd01 = chmQadd01;
	}

	public Date getChmQadd02() {
		return this.chmQadd02;
	}

	public void setChmQadd02(Date chmQadd02) {
		this.chmQadd02 = chmQadd02;
	}

	public Date getChmQadd03() {
		return this.chmQadd03;
	}

	public void setChmQadd03(Date chmQadd03) {
		this.chmQadd03 = chmQadd03;
	}

	public String getChmRpRoute() {
		return this.chmRpRoute;
	}

	public void setChmRpRoute(String chmRpRoute) {
		this.chmRpRoute = chmRpRoute;
	}

	public String getChmRpBom() {
		return this.chmRpBom;
	}

	public void setChmRpBom(String chmRpBom) {
		this.chmRpBom = chmRpBom;
	}

	public Boolean getChmScheduleCa() {
		return this.chmScheduleCa;
	}

	public void setChmScheduleCa(Boolean chmScheduleCa) {
		this.chmScheduleCa = chmScheduleCa;
	}

	public Date getChmTaxDate() {
		return this.chmTaxDate;
	}

	public void setChmTaxDate(Date chmTaxDate) {
		this.chmTaxDate = chmTaxDate;
	}

	public Date getChmQuoteExp() {
		return this.chmQuoteExp;
	}

	public void setChmQuoteExp(Date chmQuoteExp) {
		this.chmQuoteExp = chmQuoteExp;
	}

	public Integer getChmRrcSeq() {
		return this.chmRrcSeq;
	}

	public void setChmRrcSeq(Integer chmRrcSeq) {
		this.chmRrcSeq = chmRrcSeq;
	}

	public String getChmRrcNbr() {
		return this.chmRrcNbr;
	}

	public void setChmRrcNbr(String chmRrcNbr) {
		this.chmRrcNbr = chmRrcNbr;
	}

	public String getChmCustomer() {
		return this.chmCustomer;
	}

	public void setChmCustomer(String chmCustomer) {
		this.chmCustomer = chmCustomer;
	}

	public String getChmTaxEnv() {
		return this.chmTaxEnv;
	}

	public void setChmTaxEnv(String chmTaxEnv) {
		this.chmTaxEnv = chmTaxEnv;
	}

	public String getChmTaxUsage() {
		return this.chmTaxUsage;
	}

	public void setChmTaxUsage(String chmTaxUsage) {
		this.chmTaxUsage = chmTaxUsage;
	}

	public Double getChmTaxPct() {
		return this.chmTaxPct;
	}

	public void setChmTaxPct(Double chmTaxPct) {
		this.chmTaxPct = chmTaxPct;
	}

	public String getChmLang() {
		return this.chmLang;
	}

	public void setChmLang(String chmLang) {
		this.chmLang = chmLang;
	}

	public String getChmQuoteNbr() {
		return this.chmQuoteNbr;
	}

	public void setChmQuoteNbr(String chmQuoteNbr) {
		this.chmQuoteNbr = chmQuoteNbr;
	}

	public Double getChmEntEx() {
		return this.chmEntEx;
	}

	public void setChmEntEx(Double chmEntEx) {
		this.chmEntEx = chmEntEx;
	}

	public Boolean getChmFixRate() {
		return this.chmFixRate;
	}

	public void setChmFixRate(Boolean chmFixRate) {
		this.chmFixRate = chmFixRate;
	}

	public String getChmChannel() {
		return this.chmChannel;
	}

	public void setChmChannel(String chmChannel) {
		this.chmChannel = chmChannel;
	}

	public Double getChmExRate2() {
		return this.chmExRate2;
	}

	public void setChmExRate2(Double chmExRate2) {
		this.chmExRate2 = chmExRate2;
	}

	public String getChmExRatetype() {
		return this.chmExRatetype;
	}

	public void setChmExRatetype(String chmExRatetype) {
		this.chmExRatetype = chmExRatetype;
	}

	public Integer getChmExruSeq() {
		return this.chmExruSeq;
	}

	public void setChmExruSeq(Integer chmExruSeq) {
		this.chmExruSeq = chmExruSeq;
	}

	public String getChmQadc04() {
		return this.chmQadc04;
	}

	public void setChmQadc04(String chmQadc04) {
		this.chmQadc04 = chmQadc04;
	}

	public String getChmQadc05() {
		return this.chmQadc05;
	}

	public void setChmQadc05(String chmQadc05) {
		this.chmQadc05 = chmQadc05;
	}

	public String getChmQadc06() {
		return this.chmQadc06;
	}

	public void setChmQadc06(String chmQadc06) {
		this.chmQadc06 = chmQadc06;
	}

	public Double getOidChmMstr() {
		return this.oidChmMstr;
	}

	public void setOidChmMstr(Double oidChmMstr) {
		this.oidChmMstr = oidChmMstr;
	}

}