package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSabDet entity provides the base persistence definition of the SabDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSabDet implements java.io.Serializable {

	// Fields

	private SabDetId id;
	private String sabLineType;
	private String sabEuNbr;
	private String sabSoNbr;
	private Integer sabSodLine;
	private String sabCust;
	private String sabBillTo;
	private String sabAmtType;
	private String sabCycle;
	private String sabDesc;
	private Date sabEndCover;
	private Date sabEndDate;
	private Double sabExtPrice;
	private String sabFor;
	private Double sabListPr;
	private Date sabLstcover;
	private String sabSvCode;
	private Double sabPrice;
	private Double sabQtyChg;
	private Double sabQtyPer;
	private Integer sabRef;
	private String sabSerial;
	private Date sabStCover;
	private Date sabStDate;
	private Boolean sabTaxable;
	private String sabTaxc;
	private String sabTaxEnv;
	private Boolean sabTaxIn;
	private String sabTaxUsage;
	private Integer sabLineSeq;
	private String sabCurr;
	private Integer sabUiLine;
	private String sabUser1;
	private String sabUser2;
	private Double sabUserd01;
	private Integer sabUseri01;
	private Boolean sabUserl01;
	private Date sabUsert01;
	private String sabQadc01;
	private Double sabQadd01;
	private Integer sabQadi01;
	private Boolean sabQadl01;
	private Date sabQadt01;
	private String sabModUserid;
	private Date sabModDate;
	private Double sabExRate;
	private Double sabExRate2;
	private String sabExRatetype;
	private Integer sabExruSeq;
	private String sabQadc02;
	private Double oidSabDet;

	// Constructors

	/** default constructor */
	public AbstractSabDet() {
	}

	/** minimal constructor */
	public AbstractSabDet(SabDetId id, String sabLineType, String sabEuNbr,
			String sabSoNbr, Integer sabSodLine, String sabCust,
			String sabBillTo, String sabAmtType, String sabCycle,
			String sabDesc, Double sabExtPrice, String sabFor,
			Double sabListPr, String sabSvCode, Double sabPrice,
			Double sabQtyChg, Double sabQtyPer, Integer sabRef,
			String sabSerial, Boolean sabTaxable, String sabTaxc,
			String sabTaxEnv, Boolean sabTaxIn, String sabTaxUsage,
			Integer sabLineSeq, String sabCurr, Integer sabUiLine,
			String sabUser1, String sabUser2, Double sabUserd01,
			Integer sabUseri01, Boolean sabUserl01, String sabQadc01,
			Double sabQadd01, Integer sabQadi01, Boolean sabQadl01,
			String sabModUserid, Date sabModDate, Double sabExRate,
			Double sabExRate2, String sabExRatetype, Integer sabExruSeq,
			String sabQadc02, Double oidSabDet) {
		this.id = id;
		this.sabLineType = sabLineType;
		this.sabEuNbr = sabEuNbr;
		this.sabSoNbr = sabSoNbr;
		this.sabSodLine = sabSodLine;
		this.sabCust = sabCust;
		this.sabBillTo = sabBillTo;
		this.sabAmtType = sabAmtType;
		this.sabCycle = sabCycle;
		this.sabDesc = sabDesc;
		this.sabExtPrice = sabExtPrice;
		this.sabFor = sabFor;
		this.sabListPr = sabListPr;
		this.sabSvCode = sabSvCode;
		this.sabPrice = sabPrice;
		this.sabQtyChg = sabQtyChg;
		this.sabQtyPer = sabQtyPer;
		this.sabRef = sabRef;
		this.sabSerial = sabSerial;
		this.sabTaxable = sabTaxable;
		this.sabTaxc = sabTaxc;
		this.sabTaxEnv = sabTaxEnv;
		this.sabTaxIn = sabTaxIn;
		this.sabTaxUsage = sabTaxUsage;
		this.sabLineSeq = sabLineSeq;
		this.sabCurr = sabCurr;
		this.sabUiLine = sabUiLine;
		this.sabUser1 = sabUser1;
		this.sabUser2 = sabUser2;
		this.sabUserd01 = sabUserd01;
		this.sabUseri01 = sabUseri01;
		this.sabUserl01 = sabUserl01;
		this.sabQadc01 = sabQadc01;
		this.sabQadd01 = sabQadd01;
		this.sabQadi01 = sabQadi01;
		this.sabQadl01 = sabQadl01;
		this.sabModUserid = sabModUserid;
		this.sabModDate = sabModDate;
		this.sabExRate = sabExRate;
		this.sabExRate2 = sabExRate2;
		this.sabExRatetype = sabExRatetype;
		this.sabExruSeq = sabExruSeq;
		this.sabQadc02 = sabQadc02;
		this.oidSabDet = oidSabDet;
	}

	/** full constructor */
	public AbstractSabDet(SabDetId id, String sabLineType, String sabEuNbr,
			String sabSoNbr, Integer sabSodLine, String sabCust,
			String sabBillTo, String sabAmtType, String sabCycle,
			String sabDesc, Date sabEndCover, Date sabEndDate,
			Double sabExtPrice, String sabFor, Double sabListPr,
			Date sabLstcover, String sabSvCode, Double sabPrice,
			Double sabQtyChg, Double sabQtyPer, Integer sabRef,
			String sabSerial, Date sabStCover, Date sabStDate,
			Boolean sabTaxable, String sabTaxc, String sabTaxEnv,
			Boolean sabTaxIn, String sabTaxUsage, Integer sabLineSeq,
			String sabCurr, Integer sabUiLine, String sabUser1,
			String sabUser2, Double sabUserd01, Integer sabUseri01,
			Boolean sabUserl01, Date sabUsert01, String sabQadc01,
			Double sabQadd01, Integer sabQadi01, Boolean sabQadl01,
			Date sabQadt01, String sabModUserid, Date sabModDate,
			Double sabExRate, Double sabExRate2, String sabExRatetype,
			Integer sabExruSeq, String sabQadc02, Double oidSabDet) {
		this.id = id;
		this.sabLineType = sabLineType;
		this.sabEuNbr = sabEuNbr;
		this.sabSoNbr = sabSoNbr;
		this.sabSodLine = sabSodLine;
		this.sabCust = sabCust;
		this.sabBillTo = sabBillTo;
		this.sabAmtType = sabAmtType;
		this.sabCycle = sabCycle;
		this.sabDesc = sabDesc;
		this.sabEndCover = sabEndCover;
		this.sabEndDate = sabEndDate;
		this.sabExtPrice = sabExtPrice;
		this.sabFor = sabFor;
		this.sabListPr = sabListPr;
		this.sabLstcover = sabLstcover;
		this.sabSvCode = sabSvCode;
		this.sabPrice = sabPrice;
		this.sabQtyChg = sabQtyChg;
		this.sabQtyPer = sabQtyPer;
		this.sabRef = sabRef;
		this.sabSerial = sabSerial;
		this.sabStCover = sabStCover;
		this.sabStDate = sabStDate;
		this.sabTaxable = sabTaxable;
		this.sabTaxc = sabTaxc;
		this.sabTaxEnv = sabTaxEnv;
		this.sabTaxIn = sabTaxIn;
		this.sabTaxUsage = sabTaxUsage;
		this.sabLineSeq = sabLineSeq;
		this.sabCurr = sabCurr;
		this.sabUiLine = sabUiLine;
		this.sabUser1 = sabUser1;
		this.sabUser2 = sabUser2;
		this.sabUserd01 = sabUserd01;
		this.sabUseri01 = sabUseri01;
		this.sabUserl01 = sabUserl01;
		this.sabUsert01 = sabUsert01;
		this.sabQadc01 = sabQadc01;
		this.sabQadd01 = sabQadd01;
		this.sabQadi01 = sabQadi01;
		this.sabQadl01 = sabQadl01;
		this.sabQadt01 = sabQadt01;
		this.sabModUserid = sabModUserid;
		this.sabModDate = sabModDate;
		this.sabExRate = sabExRate;
		this.sabExRate2 = sabExRate2;
		this.sabExRatetype = sabExRatetype;
		this.sabExruSeq = sabExruSeq;
		this.sabQadc02 = sabQadc02;
		this.oidSabDet = oidSabDet;
	}

	// Property accessors

	public SabDetId getId() {
		return this.id;
	}

	public void setId(SabDetId id) {
		this.id = id;
	}

	public String getSabLineType() {
		return this.sabLineType;
	}

	public void setSabLineType(String sabLineType) {
		this.sabLineType = sabLineType;
	}

	public String getSabEuNbr() {
		return this.sabEuNbr;
	}

	public void setSabEuNbr(String sabEuNbr) {
		this.sabEuNbr = sabEuNbr;
	}

	public String getSabSoNbr() {
		return this.sabSoNbr;
	}

	public void setSabSoNbr(String sabSoNbr) {
		this.sabSoNbr = sabSoNbr;
	}

	public Integer getSabSodLine() {
		return this.sabSodLine;
	}

	public void setSabSodLine(Integer sabSodLine) {
		this.sabSodLine = sabSodLine;
	}

	public String getSabCust() {
		return this.sabCust;
	}

	public void setSabCust(String sabCust) {
		this.sabCust = sabCust;
	}

	public String getSabBillTo() {
		return this.sabBillTo;
	}

	public void setSabBillTo(String sabBillTo) {
		this.sabBillTo = sabBillTo;
	}

	public String getSabAmtType() {
		return this.sabAmtType;
	}

	public void setSabAmtType(String sabAmtType) {
		this.sabAmtType = sabAmtType;
	}

	public String getSabCycle() {
		return this.sabCycle;
	}

	public void setSabCycle(String sabCycle) {
		this.sabCycle = sabCycle;
	}

	public String getSabDesc() {
		return this.sabDesc;
	}

	public void setSabDesc(String sabDesc) {
		this.sabDesc = sabDesc;
	}

	public Date getSabEndCover() {
		return this.sabEndCover;
	}

	public void setSabEndCover(Date sabEndCover) {
		this.sabEndCover = sabEndCover;
	}

	public Date getSabEndDate() {
		return this.sabEndDate;
	}

	public void setSabEndDate(Date sabEndDate) {
		this.sabEndDate = sabEndDate;
	}

	public Double getSabExtPrice() {
		return this.sabExtPrice;
	}

	public void setSabExtPrice(Double sabExtPrice) {
		this.sabExtPrice = sabExtPrice;
	}

	public String getSabFor() {
		return this.sabFor;
	}

	public void setSabFor(String sabFor) {
		this.sabFor = sabFor;
	}

	public Double getSabListPr() {
		return this.sabListPr;
	}

	public void setSabListPr(Double sabListPr) {
		this.sabListPr = sabListPr;
	}

	public Date getSabLstcover() {
		return this.sabLstcover;
	}

	public void setSabLstcover(Date sabLstcover) {
		this.sabLstcover = sabLstcover;
	}

	public String getSabSvCode() {
		return this.sabSvCode;
	}

	public void setSabSvCode(String sabSvCode) {
		this.sabSvCode = sabSvCode;
	}

	public Double getSabPrice() {
		return this.sabPrice;
	}

	public void setSabPrice(Double sabPrice) {
		this.sabPrice = sabPrice;
	}

	public Double getSabQtyChg() {
		return this.sabQtyChg;
	}

	public void setSabQtyChg(Double sabQtyChg) {
		this.sabQtyChg = sabQtyChg;
	}

	public Double getSabQtyPer() {
		return this.sabQtyPer;
	}

	public void setSabQtyPer(Double sabQtyPer) {
		this.sabQtyPer = sabQtyPer;
	}

	public Integer getSabRef() {
		return this.sabRef;
	}

	public void setSabRef(Integer sabRef) {
		this.sabRef = sabRef;
	}

	public String getSabSerial() {
		return this.sabSerial;
	}

	public void setSabSerial(String sabSerial) {
		this.sabSerial = sabSerial;
	}

	public Date getSabStCover() {
		return this.sabStCover;
	}

	public void setSabStCover(Date sabStCover) {
		this.sabStCover = sabStCover;
	}

	public Date getSabStDate() {
		return this.sabStDate;
	}

	public void setSabStDate(Date sabStDate) {
		this.sabStDate = sabStDate;
	}

	public Boolean getSabTaxable() {
		return this.sabTaxable;
	}

	public void setSabTaxable(Boolean sabTaxable) {
		this.sabTaxable = sabTaxable;
	}

	public String getSabTaxc() {
		return this.sabTaxc;
	}

	public void setSabTaxc(String sabTaxc) {
		this.sabTaxc = sabTaxc;
	}

	public String getSabTaxEnv() {
		return this.sabTaxEnv;
	}

	public void setSabTaxEnv(String sabTaxEnv) {
		this.sabTaxEnv = sabTaxEnv;
	}

	public Boolean getSabTaxIn() {
		return this.sabTaxIn;
	}

	public void setSabTaxIn(Boolean sabTaxIn) {
		this.sabTaxIn = sabTaxIn;
	}

	public String getSabTaxUsage() {
		return this.sabTaxUsage;
	}

	public void setSabTaxUsage(String sabTaxUsage) {
		this.sabTaxUsage = sabTaxUsage;
	}

	public Integer getSabLineSeq() {
		return this.sabLineSeq;
	}

	public void setSabLineSeq(Integer sabLineSeq) {
		this.sabLineSeq = sabLineSeq;
	}

	public String getSabCurr() {
		return this.sabCurr;
	}

	public void setSabCurr(String sabCurr) {
		this.sabCurr = sabCurr;
	}

	public Integer getSabUiLine() {
		return this.sabUiLine;
	}

	public void setSabUiLine(Integer sabUiLine) {
		this.sabUiLine = sabUiLine;
	}

	public String getSabUser1() {
		return this.sabUser1;
	}

	public void setSabUser1(String sabUser1) {
		this.sabUser1 = sabUser1;
	}

	public String getSabUser2() {
		return this.sabUser2;
	}

	public void setSabUser2(String sabUser2) {
		this.sabUser2 = sabUser2;
	}

	public Double getSabUserd01() {
		return this.sabUserd01;
	}

	public void setSabUserd01(Double sabUserd01) {
		this.sabUserd01 = sabUserd01;
	}

	public Integer getSabUseri01() {
		return this.sabUseri01;
	}

	public void setSabUseri01(Integer sabUseri01) {
		this.sabUseri01 = sabUseri01;
	}

	public Boolean getSabUserl01() {
		return this.sabUserl01;
	}

	public void setSabUserl01(Boolean sabUserl01) {
		this.sabUserl01 = sabUserl01;
	}

	public Date getSabUsert01() {
		return this.sabUsert01;
	}

	public void setSabUsert01(Date sabUsert01) {
		this.sabUsert01 = sabUsert01;
	}

	public String getSabQadc01() {
		return this.sabQadc01;
	}

	public void setSabQadc01(String sabQadc01) {
		this.sabQadc01 = sabQadc01;
	}

	public Double getSabQadd01() {
		return this.sabQadd01;
	}

	public void setSabQadd01(Double sabQadd01) {
		this.sabQadd01 = sabQadd01;
	}

	public Integer getSabQadi01() {
		return this.sabQadi01;
	}

	public void setSabQadi01(Integer sabQadi01) {
		this.sabQadi01 = sabQadi01;
	}

	public Boolean getSabQadl01() {
		return this.sabQadl01;
	}

	public void setSabQadl01(Boolean sabQadl01) {
		this.sabQadl01 = sabQadl01;
	}

	public Date getSabQadt01() {
		return this.sabQadt01;
	}

	public void setSabQadt01(Date sabQadt01) {
		this.sabQadt01 = sabQadt01;
	}

	public String getSabModUserid() {
		return this.sabModUserid;
	}

	public void setSabModUserid(String sabModUserid) {
		this.sabModUserid = sabModUserid;
	}

	public Date getSabModDate() {
		return this.sabModDate;
	}

	public void setSabModDate(Date sabModDate) {
		this.sabModDate = sabModDate;
	}

	public Double getSabExRate() {
		return this.sabExRate;
	}

	public void setSabExRate(Double sabExRate) {
		this.sabExRate = sabExRate;
	}

	public Double getSabExRate2() {
		return this.sabExRate2;
	}

	public void setSabExRate2(Double sabExRate2) {
		this.sabExRate2 = sabExRate2;
	}

	public String getSabExRatetype() {
		return this.sabExRatetype;
	}

	public void setSabExRatetype(String sabExRatetype) {
		this.sabExRatetype = sabExRatetype;
	}

	public Integer getSabExruSeq() {
		return this.sabExruSeq;
	}

	public void setSabExruSeq(Integer sabExruSeq) {
		this.sabExruSeq = sabExruSeq;
	}

	public String getSabQadc02() {
		return this.sabQadc02;
	}

	public void setSabQadc02(String sabQadc02) {
		this.sabQadc02 = sabQadc02;
	}

	public Double getOidSabDet() {
		return this.oidSabDet;
	}

	public void setOidSabDet(Double oidSabDet) {
		this.oidSabDet = oidSabDet;
	}

}