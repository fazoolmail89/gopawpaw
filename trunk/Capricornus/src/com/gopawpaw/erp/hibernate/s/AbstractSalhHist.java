package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSalhHist entity provides the base persistence definition of the
 * SalhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSalhHist implements java.io.Serializable {

	// Fields

	private SalhHistId id;
	private Double salhBudget;
	private String salhCaIntType;
	private String salhCode;
	private Date salhEnd;
	private String salhFcgCode;
	private String salhFile;
	private String salhFisSort;
	private String salhFscCode;
	private Double salhLimitAmt;
	private Boolean salhQadl04;
	private Integer salhLine;
	private String salhNbr;
	private String salhOvFcgCode;
	private Double salhPctCovered;
	private Boolean salhPerCall;
	private String salhPrefix;
	private Date salhStart;
	private Double salhTotal;
	private String salhType;
	private String salhUser1;
	private String salhUser2;
	private String salhChr01;
	private String salhChr02;
	private String salhChr03;
	private String salhChr04;
	private Double salhDec01;
	private Double salhDec02;
	private Double salhDec03;
	private Date salhDte01;
	private Date salhDte02;
	private Date salhDte03;
	private Boolean salhLog01;
	private Boolean salhLog02;
	private Boolean salhLog03;
	private String salhQadc01;
	private String salhQadc02;
	private String salhQadc03;
	private String salhQadc04;
	private Date salhQadt01;
	private Date salhQadt02;
	private Date salhQadt03;
	private Double salhQadd01;
	private Double salhQadd02;
	private Double salhQadd03;
	private Boolean salhQadl01;
	private Boolean salhQadl02;
	private Boolean salhQadl03;
	private Double salhUnpostedAmt;
	private Integer salhCallsAllow;
	private String salhModUserid;
	private Date salhModDate;
	private Double salhListprLimit;
	private Integer salhCallsTotal;
	private Integer salhSequence;
	private Integer salhDays;
	private Date salhFirstActivity;
	private Date salhLastActivity;
	private String salhUsage;
	private String salhReport;
	private String salhCall;
	private String salhCategory;
	private Integer salhItmLine;
	private Integer salhOp;
	private Double salhConsumedAmt;
	private Double salhQadd04;
	private Date salhConsumedDate;
	private String salhItmPart;
	private Double oidSalhHist;

	// Constructors

	/** default constructor */
	public AbstractSalhHist() {
	}

	/** minimal constructor */
	public AbstractSalhHist(SalhHistId id, Double oidSalhHist) {
		this.id = id;
		this.oidSalhHist = oidSalhHist;
	}

	/** full constructor */
	public AbstractSalhHist(SalhHistId id, Double salhBudget,
			String salhCaIntType, String salhCode, Date salhEnd,
			String salhFcgCode, String salhFile, String salhFisSort,
			String salhFscCode, Double salhLimitAmt, Boolean salhQadl04,
			Integer salhLine, String salhNbr, String salhOvFcgCode,
			Double salhPctCovered, Boolean salhPerCall, String salhPrefix,
			Date salhStart, Double salhTotal, String salhType,
			String salhUser1, String salhUser2, String salhChr01,
			String salhChr02, String salhChr03, String salhChr04,
			Double salhDec01, Double salhDec02, Double salhDec03,
			Date salhDte01, Date salhDte02, Date salhDte03, Boolean salhLog01,
			Boolean salhLog02, Boolean salhLog03, String salhQadc01,
			String salhQadc02, String salhQadc03, String salhQadc04,
			Date salhQadt01, Date salhQadt02, Date salhQadt03,
			Double salhQadd01, Double salhQadd02, Double salhQadd03,
			Boolean salhQadl01, Boolean salhQadl02, Boolean salhQadl03,
			Double salhUnpostedAmt, Integer salhCallsAllow,
			String salhModUserid, Date salhModDate, Double salhListprLimit,
			Integer salhCallsTotal, Integer salhSequence, Integer salhDays,
			Date salhFirstActivity, Date salhLastActivity, String salhUsage,
			String salhReport, String salhCall, String salhCategory,
			Integer salhItmLine, Integer salhOp, Double salhConsumedAmt,
			Double salhQadd04, Date salhConsumedDate, String salhItmPart,
			Double oidSalhHist) {
		this.id = id;
		this.salhBudget = salhBudget;
		this.salhCaIntType = salhCaIntType;
		this.salhCode = salhCode;
		this.salhEnd = salhEnd;
		this.salhFcgCode = salhFcgCode;
		this.salhFile = salhFile;
		this.salhFisSort = salhFisSort;
		this.salhFscCode = salhFscCode;
		this.salhLimitAmt = salhLimitAmt;
		this.salhQadl04 = salhQadl04;
		this.salhLine = salhLine;
		this.salhNbr = salhNbr;
		this.salhOvFcgCode = salhOvFcgCode;
		this.salhPctCovered = salhPctCovered;
		this.salhPerCall = salhPerCall;
		this.salhPrefix = salhPrefix;
		this.salhStart = salhStart;
		this.salhTotal = salhTotal;
		this.salhType = salhType;
		this.salhUser1 = salhUser1;
		this.salhUser2 = salhUser2;
		this.salhChr01 = salhChr01;
		this.salhChr02 = salhChr02;
		this.salhChr03 = salhChr03;
		this.salhChr04 = salhChr04;
		this.salhDec01 = salhDec01;
		this.salhDec02 = salhDec02;
		this.salhDec03 = salhDec03;
		this.salhDte01 = salhDte01;
		this.salhDte02 = salhDte02;
		this.salhDte03 = salhDte03;
		this.salhLog01 = salhLog01;
		this.salhLog02 = salhLog02;
		this.salhLog03 = salhLog03;
		this.salhQadc01 = salhQadc01;
		this.salhQadc02 = salhQadc02;
		this.salhQadc03 = salhQadc03;
		this.salhQadc04 = salhQadc04;
		this.salhQadt01 = salhQadt01;
		this.salhQadt02 = salhQadt02;
		this.salhQadt03 = salhQadt03;
		this.salhQadd01 = salhQadd01;
		this.salhQadd02 = salhQadd02;
		this.salhQadd03 = salhQadd03;
		this.salhQadl01 = salhQadl01;
		this.salhQadl02 = salhQadl02;
		this.salhQadl03 = salhQadl03;
		this.salhUnpostedAmt = salhUnpostedAmt;
		this.salhCallsAllow = salhCallsAllow;
		this.salhModUserid = salhModUserid;
		this.salhModDate = salhModDate;
		this.salhListprLimit = salhListprLimit;
		this.salhCallsTotal = salhCallsTotal;
		this.salhSequence = salhSequence;
		this.salhDays = salhDays;
		this.salhFirstActivity = salhFirstActivity;
		this.salhLastActivity = salhLastActivity;
		this.salhUsage = salhUsage;
		this.salhReport = salhReport;
		this.salhCall = salhCall;
		this.salhCategory = salhCategory;
		this.salhItmLine = salhItmLine;
		this.salhOp = salhOp;
		this.salhConsumedAmt = salhConsumedAmt;
		this.salhQadd04 = salhQadd04;
		this.salhConsumedDate = salhConsumedDate;
		this.salhItmPart = salhItmPart;
		this.oidSalhHist = oidSalhHist;
	}

	// Property accessors

	public SalhHistId getId() {
		return this.id;
	}

	public void setId(SalhHistId id) {
		this.id = id;
	}

	public Double getSalhBudget() {
		return this.salhBudget;
	}

	public void setSalhBudget(Double salhBudget) {
		this.salhBudget = salhBudget;
	}

	public String getSalhCaIntType() {
		return this.salhCaIntType;
	}

	public void setSalhCaIntType(String salhCaIntType) {
		this.salhCaIntType = salhCaIntType;
	}

	public String getSalhCode() {
		return this.salhCode;
	}

	public void setSalhCode(String salhCode) {
		this.salhCode = salhCode;
	}

	public Date getSalhEnd() {
		return this.salhEnd;
	}

	public void setSalhEnd(Date salhEnd) {
		this.salhEnd = salhEnd;
	}

	public String getSalhFcgCode() {
		return this.salhFcgCode;
	}

	public void setSalhFcgCode(String salhFcgCode) {
		this.salhFcgCode = salhFcgCode;
	}

	public String getSalhFile() {
		return this.salhFile;
	}

	public void setSalhFile(String salhFile) {
		this.salhFile = salhFile;
	}

	public String getSalhFisSort() {
		return this.salhFisSort;
	}

	public void setSalhFisSort(String salhFisSort) {
		this.salhFisSort = salhFisSort;
	}

	public String getSalhFscCode() {
		return this.salhFscCode;
	}

	public void setSalhFscCode(String salhFscCode) {
		this.salhFscCode = salhFscCode;
	}

	public Double getSalhLimitAmt() {
		return this.salhLimitAmt;
	}

	public void setSalhLimitAmt(Double salhLimitAmt) {
		this.salhLimitAmt = salhLimitAmt;
	}

	public Boolean getSalhQadl04() {
		return this.salhQadl04;
	}

	public void setSalhQadl04(Boolean salhQadl04) {
		this.salhQadl04 = salhQadl04;
	}

	public Integer getSalhLine() {
		return this.salhLine;
	}

	public void setSalhLine(Integer salhLine) {
		this.salhLine = salhLine;
	}

	public String getSalhNbr() {
		return this.salhNbr;
	}

	public void setSalhNbr(String salhNbr) {
		this.salhNbr = salhNbr;
	}

	public String getSalhOvFcgCode() {
		return this.salhOvFcgCode;
	}

	public void setSalhOvFcgCode(String salhOvFcgCode) {
		this.salhOvFcgCode = salhOvFcgCode;
	}

	public Double getSalhPctCovered() {
		return this.salhPctCovered;
	}

	public void setSalhPctCovered(Double salhPctCovered) {
		this.salhPctCovered = salhPctCovered;
	}

	public Boolean getSalhPerCall() {
		return this.salhPerCall;
	}

	public void setSalhPerCall(Boolean salhPerCall) {
		this.salhPerCall = salhPerCall;
	}

	public String getSalhPrefix() {
		return this.salhPrefix;
	}

	public void setSalhPrefix(String salhPrefix) {
		this.salhPrefix = salhPrefix;
	}

	public Date getSalhStart() {
		return this.salhStart;
	}

	public void setSalhStart(Date salhStart) {
		this.salhStart = salhStart;
	}

	public Double getSalhTotal() {
		return this.salhTotal;
	}

	public void setSalhTotal(Double salhTotal) {
		this.salhTotal = salhTotal;
	}

	public String getSalhType() {
		return this.salhType;
	}

	public void setSalhType(String salhType) {
		this.salhType = salhType;
	}

	public String getSalhUser1() {
		return this.salhUser1;
	}

	public void setSalhUser1(String salhUser1) {
		this.salhUser1 = salhUser1;
	}

	public String getSalhUser2() {
		return this.salhUser2;
	}

	public void setSalhUser2(String salhUser2) {
		this.salhUser2 = salhUser2;
	}

	public String getSalhChr01() {
		return this.salhChr01;
	}

	public void setSalhChr01(String salhChr01) {
		this.salhChr01 = salhChr01;
	}

	public String getSalhChr02() {
		return this.salhChr02;
	}

	public void setSalhChr02(String salhChr02) {
		this.salhChr02 = salhChr02;
	}

	public String getSalhChr03() {
		return this.salhChr03;
	}

	public void setSalhChr03(String salhChr03) {
		this.salhChr03 = salhChr03;
	}

	public String getSalhChr04() {
		return this.salhChr04;
	}

	public void setSalhChr04(String salhChr04) {
		this.salhChr04 = salhChr04;
	}

	public Double getSalhDec01() {
		return this.salhDec01;
	}

	public void setSalhDec01(Double salhDec01) {
		this.salhDec01 = salhDec01;
	}

	public Double getSalhDec02() {
		return this.salhDec02;
	}

	public void setSalhDec02(Double salhDec02) {
		this.salhDec02 = salhDec02;
	}

	public Double getSalhDec03() {
		return this.salhDec03;
	}

	public void setSalhDec03(Double salhDec03) {
		this.salhDec03 = salhDec03;
	}

	public Date getSalhDte01() {
		return this.salhDte01;
	}

	public void setSalhDte01(Date salhDte01) {
		this.salhDte01 = salhDte01;
	}

	public Date getSalhDte02() {
		return this.salhDte02;
	}

	public void setSalhDte02(Date salhDte02) {
		this.salhDte02 = salhDte02;
	}

	public Date getSalhDte03() {
		return this.salhDte03;
	}

	public void setSalhDte03(Date salhDte03) {
		this.salhDte03 = salhDte03;
	}

	public Boolean getSalhLog01() {
		return this.salhLog01;
	}

	public void setSalhLog01(Boolean salhLog01) {
		this.salhLog01 = salhLog01;
	}

	public Boolean getSalhLog02() {
		return this.salhLog02;
	}

	public void setSalhLog02(Boolean salhLog02) {
		this.salhLog02 = salhLog02;
	}

	public Boolean getSalhLog03() {
		return this.salhLog03;
	}

	public void setSalhLog03(Boolean salhLog03) {
		this.salhLog03 = salhLog03;
	}

	public String getSalhQadc01() {
		return this.salhQadc01;
	}

	public void setSalhQadc01(String salhQadc01) {
		this.salhQadc01 = salhQadc01;
	}

	public String getSalhQadc02() {
		return this.salhQadc02;
	}

	public void setSalhQadc02(String salhQadc02) {
		this.salhQadc02 = salhQadc02;
	}

	public String getSalhQadc03() {
		return this.salhQadc03;
	}

	public void setSalhQadc03(String salhQadc03) {
		this.salhQadc03 = salhQadc03;
	}

	public String getSalhQadc04() {
		return this.salhQadc04;
	}

	public void setSalhQadc04(String salhQadc04) {
		this.salhQadc04 = salhQadc04;
	}

	public Date getSalhQadt01() {
		return this.salhQadt01;
	}

	public void setSalhQadt01(Date salhQadt01) {
		this.salhQadt01 = salhQadt01;
	}

	public Date getSalhQadt02() {
		return this.salhQadt02;
	}

	public void setSalhQadt02(Date salhQadt02) {
		this.salhQadt02 = salhQadt02;
	}

	public Date getSalhQadt03() {
		return this.salhQadt03;
	}

	public void setSalhQadt03(Date salhQadt03) {
		this.salhQadt03 = salhQadt03;
	}

	public Double getSalhQadd01() {
		return this.salhQadd01;
	}

	public void setSalhQadd01(Double salhQadd01) {
		this.salhQadd01 = salhQadd01;
	}

	public Double getSalhQadd02() {
		return this.salhQadd02;
	}

	public void setSalhQadd02(Double salhQadd02) {
		this.salhQadd02 = salhQadd02;
	}

	public Double getSalhQadd03() {
		return this.salhQadd03;
	}

	public void setSalhQadd03(Double salhQadd03) {
		this.salhQadd03 = salhQadd03;
	}

	public Boolean getSalhQadl01() {
		return this.salhQadl01;
	}

	public void setSalhQadl01(Boolean salhQadl01) {
		this.salhQadl01 = salhQadl01;
	}

	public Boolean getSalhQadl02() {
		return this.salhQadl02;
	}

	public void setSalhQadl02(Boolean salhQadl02) {
		this.salhQadl02 = salhQadl02;
	}

	public Boolean getSalhQadl03() {
		return this.salhQadl03;
	}

	public void setSalhQadl03(Boolean salhQadl03) {
		this.salhQadl03 = salhQadl03;
	}

	public Double getSalhUnpostedAmt() {
		return this.salhUnpostedAmt;
	}

	public void setSalhUnpostedAmt(Double salhUnpostedAmt) {
		this.salhUnpostedAmt = salhUnpostedAmt;
	}

	public Integer getSalhCallsAllow() {
		return this.salhCallsAllow;
	}

	public void setSalhCallsAllow(Integer salhCallsAllow) {
		this.salhCallsAllow = salhCallsAllow;
	}

	public String getSalhModUserid() {
		return this.salhModUserid;
	}

	public void setSalhModUserid(String salhModUserid) {
		this.salhModUserid = salhModUserid;
	}

	public Date getSalhModDate() {
		return this.salhModDate;
	}

	public void setSalhModDate(Date salhModDate) {
		this.salhModDate = salhModDate;
	}

	public Double getSalhListprLimit() {
		return this.salhListprLimit;
	}

	public void setSalhListprLimit(Double salhListprLimit) {
		this.salhListprLimit = salhListprLimit;
	}

	public Integer getSalhCallsTotal() {
		return this.salhCallsTotal;
	}

	public void setSalhCallsTotal(Integer salhCallsTotal) {
		this.salhCallsTotal = salhCallsTotal;
	}

	public Integer getSalhSequence() {
		return this.salhSequence;
	}

	public void setSalhSequence(Integer salhSequence) {
		this.salhSequence = salhSequence;
	}

	public Integer getSalhDays() {
		return this.salhDays;
	}

	public void setSalhDays(Integer salhDays) {
		this.salhDays = salhDays;
	}

	public Date getSalhFirstActivity() {
		return this.salhFirstActivity;
	}

	public void setSalhFirstActivity(Date salhFirstActivity) {
		this.salhFirstActivity = salhFirstActivity;
	}

	public Date getSalhLastActivity() {
		return this.salhLastActivity;
	}

	public void setSalhLastActivity(Date salhLastActivity) {
		this.salhLastActivity = salhLastActivity;
	}

	public String getSalhUsage() {
		return this.salhUsage;
	}

	public void setSalhUsage(String salhUsage) {
		this.salhUsage = salhUsage;
	}

	public String getSalhReport() {
		return this.salhReport;
	}

	public void setSalhReport(String salhReport) {
		this.salhReport = salhReport;
	}

	public String getSalhCall() {
		return this.salhCall;
	}

	public void setSalhCall(String salhCall) {
		this.salhCall = salhCall;
	}

	public String getSalhCategory() {
		return this.salhCategory;
	}

	public void setSalhCategory(String salhCategory) {
		this.salhCategory = salhCategory;
	}

	public Integer getSalhItmLine() {
		return this.salhItmLine;
	}

	public void setSalhItmLine(Integer salhItmLine) {
		this.salhItmLine = salhItmLine;
	}

	public Integer getSalhOp() {
		return this.salhOp;
	}

	public void setSalhOp(Integer salhOp) {
		this.salhOp = salhOp;
	}

	public Double getSalhConsumedAmt() {
		return this.salhConsumedAmt;
	}

	public void setSalhConsumedAmt(Double salhConsumedAmt) {
		this.salhConsumedAmt = salhConsumedAmt;
	}

	public Double getSalhQadd04() {
		return this.salhQadd04;
	}

	public void setSalhQadd04(Double salhQadd04) {
		this.salhQadd04 = salhQadd04;
	}

	public Date getSalhConsumedDate() {
		return this.salhConsumedDate;
	}

	public void setSalhConsumedDate(Date salhConsumedDate) {
		this.salhConsumedDate = salhConsumedDate;
	}

	public String getSalhItmPart() {
		return this.salhItmPart;
	}

	public void setSalhItmPart(String salhItmPart) {
		this.salhItmPart = salhItmPart;
	}

	public Double getOidSalhHist() {
		return this.oidSalhHist;
	}

	public void setOidSalhHist(Double oidSalhHist) {
		this.oidSalhHist = oidSalhHist;
	}

}