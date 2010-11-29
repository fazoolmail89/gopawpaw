package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjdDet entity provides the base persistence definition of the PjdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjdDet implements java.io.Serializable {

	// Fields

	private PjdDetId id;
	private Integer pjdBudgetType;
	private String pjdCaIntType;
	private Integer pjdCmtindx;
	private String pjdCommPct;
	private String pjdCrTerms;
	private String pjdDesc;
	private Double pjdDiscPct;
	private Date pjdEndDate;
	private Date pjdEndOrig;
	private String pjdEngNbr;
	private String pjdEuNbr;
	private Boolean pjdGlobalInv;
	private Boolean pjdInvDet;
	private Boolean pjdInvDetPr;
	private Boolean pjdInvLvl;
	private Double pjdListPr;
	private String pjdLoc;
	private String pjdPjtCode;
	private String pjdPrList;
	private Double pjdPrepaid;
	private Double pjdPrepTax;
	private String pjdProdLine;
	private String pjdSite;
	private String pjdSlspsn;
	private Date pjdStDate;
	private Date pjdStOrig;
	private String pjdStatus;
	private Double pjdTotalPrice;
	private Boolean pjdVariation;
	private Date pjdModDate;
	private String pjdModUserid;
	private String pjdUser1;
	private String pjdUser2;
	private String pjdQadc01;
	private String pjdQadc02;
	private Double pjdQadd01;
	private Integer pjdQadi01;
	private Boolean pjdQadl01;
	private Date pjdQadt01;
	private Double oidPjdDet;

	// Constructors

	/** default constructor */
	public AbstractPjdDet() {
	}

	/** minimal constructor */
	public AbstractPjdDet(PjdDetId id, Integer pjdBudgetType,
			String pjdCaIntType, Integer pjdCmtindx, String pjdCommPct,
			String pjdCrTerms, String pjdDesc, Double pjdDiscPct,
			String pjdEngNbr, String pjdEuNbr, Boolean pjdGlobalInv,
			Boolean pjdInvDet, Boolean pjdInvDetPr, Boolean pjdInvLvl,
			Double pjdListPr, String pjdLoc, String pjdPjtCode,
			String pjdPrList, Double pjdPrepaid, Double pjdPrepTax,
			String pjdProdLine, String pjdSite, String pjdSlspsn,
			String pjdStatus, Double pjdTotalPrice, Boolean pjdVariation,
			Date pjdModDate, String pjdModUserid, Double oidPjdDet) {
		this.id = id;
		this.pjdBudgetType = pjdBudgetType;
		this.pjdCaIntType = pjdCaIntType;
		this.pjdCmtindx = pjdCmtindx;
		this.pjdCommPct = pjdCommPct;
		this.pjdCrTerms = pjdCrTerms;
		this.pjdDesc = pjdDesc;
		this.pjdDiscPct = pjdDiscPct;
		this.pjdEngNbr = pjdEngNbr;
		this.pjdEuNbr = pjdEuNbr;
		this.pjdGlobalInv = pjdGlobalInv;
		this.pjdInvDet = pjdInvDet;
		this.pjdInvDetPr = pjdInvDetPr;
		this.pjdInvLvl = pjdInvLvl;
		this.pjdListPr = pjdListPr;
		this.pjdLoc = pjdLoc;
		this.pjdPjtCode = pjdPjtCode;
		this.pjdPrList = pjdPrList;
		this.pjdPrepaid = pjdPrepaid;
		this.pjdPrepTax = pjdPrepTax;
		this.pjdProdLine = pjdProdLine;
		this.pjdSite = pjdSite;
		this.pjdSlspsn = pjdSlspsn;
		this.pjdStatus = pjdStatus;
		this.pjdTotalPrice = pjdTotalPrice;
		this.pjdVariation = pjdVariation;
		this.pjdModDate = pjdModDate;
		this.pjdModUserid = pjdModUserid;
		this.oidPjdDet = oidPjdDet;
	}

	/** full constructor */
	public AbstractPjdDet(PjdDetId id, Integer pjdBudgetType,
			String pjdCaIntType, Integer pjdCmtindx, String pjdCommPct,
			String pjdCrTerms, String pjdDesc, Double pjdDiscPct,
			Date pjdEndDate, Date pjdEndOrig, String pjdEngNbr,
			String pjdEuNbr, Boolean pjdGlobalInv, Boolean pjdInvDet,
			Boolean pjdInvDetPr, Boolean pjdInvLvl, Double pjdListPr,
			String pjdLoc, String pjdPjtCode, String pjdPrList,
			Double pjdPrepaid, Double pjdPrepTax, String pjdProdLine,
			String pjdSite, String pjdSlspsn, Date pjdStDate, Date pjdStOrig,
			String pjdStatus, Double pjdTotalPrice, Boolean pjdVariation,
			Date pjdModDate, String pjdModUserid, String pjdUser1,
			String pjdUser2, String pjdQadc01, String pjdQadc02,
			Double pjdQadd01, Integer pjdQadi01, Boolean pjdQadl01,
			Date pjdQadt01, Double oidPjdDet) {
		this.id = id;
		this.pjdBudgetType = pjdBudgetType;
		this.pjdCaIntType = pjdCaIntType;
		this.pjdCmtindx = pjdCmtindx;
		this.pjdCommPct = pjdCommPct;
		this.pjdCrTerms = pjdCrTerms;
		this.pjdDesc = pjdDesc;
		this.pjdDiscPct = pjdDiscPct;
		this.pjdEndDate = pjdEndDate;
		this.pjdEndOrig = pjdEndOrig;
		this.pjdEngNbr = pjdEngNbr;
		this.pjdEuNbr = pjdEuNbr;
		this.pjdGlobalInv = pjdGlobalInv;
		this.pjdInvDet = pjdInvDet;
		this.pjdInvDetPr = pjdInvDetPr;
		this.pjdInvLvl = pjdInvLvl;
		this.pjdListPr = pjdListPr;
		this.pjdLoc = pjdLoc;
		this.pjdPjtCode = pjdPjtCode;
		this.pjdPrList = pjdPrList;
		this.pjdPrepaid = pjdPrepaid;
		this.pjdPrepTax = pjdPrepTax;
		this.pjdProdLine = pjdProdLine;
		this.pjdSite = pjdSite;
		this.pjdSlspsn = pjdSlspsn;
		this.pjdStDate = pjdStDate;
		this.pjdStOrig = pjdStOrig;
		this.pjdStatus = pjdStatus;
		this.pjdTotalPrice = pjdTotalPrice;
		this.pjdVariation = pjdVariation;
		this.pjdModDate = pjdModDate;
		this.pjdModUserid = pjdModUserid;
		this.pjdUser1 = pjdUser1;
		this.pjdUser2 = pjdUser2;
		this.pjdQadc01 = pjdQadc01;
		this.pjdQadc02 = pjdQadc02;
		this.pjdQadd01 = pjdQadd01;
		this.pjdQadi01 = pjdQadi01;
		this.pjdQadl01 = pjdQadl01;
		this.pjdQadt01 = pjdQadt01;
		this.oidPjdDet = oidPjdDet;
	}

	// Property accessors

	public PjdDetId getId() {
		return this.id;
	}

	public void setId(PjdDetId id) {
		this.id = id;
	}

	public Integer getPjdBudgetType() {
		return this.pjdBudgetType;
	}

	public void setPjdBudgetType(Integer pjdBudgetType) {
		this.pjdBudgetType = pjdBudgetType;
	}

	public String getPjdCaIntType() {
		return this.pjdCaIntType;
	}

	public void setPjdCaIntType(String pjdCaIntType) {
		this.pjdCaIntType = pjdCaIntType;
	}

	public Integer getPjdCmtindx() {
		return this.pjdCmtindx;
	}

	public void setPjdCmtindx(Integer pjdCmtindx) {
		this.pjdCmtindx = pjdCmtindx;
	}

	public String getPjdCommPct() {
		return this.pjdCommPct;
	}

	public void setPjdCommPct(String pjdCommPct) {
		this.pjdCommPct = pjdCommPct;
	}

	public String getPjdCrTerms() {
		return this.pjdCrTerms;
	}

	public void setPjdCrTerms(String pjdCrTerms) {
		this.pjdCrTerms = pjdCrTerms;
	}

	public String getPjdDesc() {
		return this.pjdDesc;
	}

	public void setPjdDesc(String pjdDesc) {
		this.pjdDesc = pjdDesc;
	}

	public Double getPjdDiscPct() {
		return this.pjdDiscPct;
	}

	public void setPjdDiscPct(Double pjdDiscPct) {
		this.pjdDiscPct = pjdDiscPct;
	}

	public Date getPjdEndDate() {
		return this.pjdEndDate;
	}

	public void setPjdEndDate(Date pjdEndDate) {
		this.pjdEndDate = pjdEndDate;
	}

	public Date getPjdEndOrig() {
		return this.pjdEndOrig;
	}

	public void setPjdEndOrig(Date pjdEndOrig) {
		this.pjdEndOrig = pjdEndOrig;
	}

	public String getPjdEngNbr() {
		return this.pjdEngNbr;
	}

	public void setPjdEngNbr(String pjdEngNbr) {
		this.pjdEngNbr = pjdEngNbr;
	}

	public String getPjdEuNbr() {
		return this.pjdEuNbr;
	}

	public void setPjdEuNbr(String pjdEuNbr) {
		this.pjdEuNbr = pjdEuNbr;
	}

	public Boolean getPjdGlobalInv() {
		return this.pjdGlobalInv;
	}

	public void setPjdGlobalInv(Boolean pjdGlobalInv) {
		this.pjdGlobalInv = pjdGlobalInv;
	}

	public Boolean getPjdInvDet() {
		return this.pjdInvDet;
	}

	public void setPjdInvDet(Boolean pjdInvDet) {
		this.pjdInvDet = pjdInvDet;
	}

	public Boolean getPjdInvDetPr() {
		return this.pjdInvDetPr;
	}

	public void setPjdInvDetPr(Boolean pjdInvDetPr) {
		this.pjdInvDetPr = pjdInvDetPr;
	}

	public Boolean getPjdInvLvl() {
		return this.pjdInvLvl;
	}

	public void setPjdInvLvl(Boolean pjdInvLvl) {
		this.pjdInvLvl = pjdInvLvl;
	}

	public Double getPjdListPr() {
		return this.pjdListPr;
	}

	public void setPjdListPr(Double pjdListPr) {
		this.pjdListPr = pjdListPr;
	}

	public String getPjdLoc() {
		return this.pjdLoc;
	}

	public void setPjdLoc(String pjdLoc) {
		this.pjdLoc = pjdLoc;
	}

	public String getPjdPjtCode() {
		return this.pjdPjtCode;
	}

	public void setPjdPjtCode(String pjdPjtCode) {
		this.pjdPjtCode = pjdPjtCode;
	}

	public String getPjdPrList() {
		return this.pjdPrList;
	}

	public void setPjdPrList(String pjdPrList) {
		this.pjdPrList = pjdPrList;
	}

	public Double getPjdPrepaid() {
		return this.pjdPrepaid;
	}

	public void setPjdPrepaid(Double pjdPrepaid) {
		this.pjdPrepaid = pjdPrepaid;
	}

	public Double getPjdPrepTax() {
		return this.pjdPrepTax;
	}

	public void setPjdPrepTax(Double pjdPrepTax) {
		this.pjdPrepTax = pjdPrepTax;
	}

	public String getPjdProdLine() {
		return this.pjdProdLine;
	}

	public void setPjdProdLine(String pjdProdLine) {
		this.pjdProdLine = pjdProdLine;
	}

	public String getPjdSite() {
		return this.pjdSite;
	}

	public void setPjdSite(String pjdSite) {
		this.pjdSite = pjdSite;
	}

	public String getPjdSlspsn() {
		return this.pjdSlspsn;
	}

	public void setPjdSlspsn(String pjdSlspsn) {
		this.pjdSlspsn = pjdSlspsn;
	}

	public Date getPjdStDate() {
		return this.pjdStDate;
	}

	public void setPjdStDate(Date pjdStDate) {
		this.pjdStDate = pjdStDate;
	}

	public Date getPjdStOrig() {
		return this.pjdStOrig;
	}

	public void setPjdStOrig(Date pjdStOrig) {
		this.pjdStOrig = pjdStOrig;
	}

	public String getPjdStatus() {
		return this.pjdStatus;
	}

	public void setPjdStatus(String pjdStatus) {
		this.pjdStatus = pjdStatus;
	}

	public Double getPjdTotalPrice() {
		return this.pjdTotalPrice;
	}

	public void setPjdTotalPrice(Double pjdTotalPrice) {
		this.pjdTotalPrice = pjdTotalPrice;
	}

	public Boolean getPjdVariation() {
		return this.pjdVariation;
	}

	public void setPjdVariation(Boolean pjdVariation) {
		this.pjdVariation = pjdVariation;
	}

	public Date getPjdModDate() {
		return this.pjdModDate;
	}

	public void setPjdModDate(Date pjdModDate) {
		this.pjdModDate = pjdModDate;
	}

	public String getPjdModUserid() {
		return this.pjdModUserid;
	}

	public void setPjdModUserid(String pjdModUserid) {
		this.pjdModUserid = pjdModUserid;
	}

	public String getPjdUser1() {
		return this.pjdUser1;
	}

	public void setPjdUser1(String pjdUser1) {
		this.pjdUser1 = pjdUser1;
	}

	public String getPjdUser2() {
		return this.pjdUser2;
	}

	public void setPjdUser2(String pjdUser2) {
		this.pjdUser2 = pjdUser2;
	}

	public String getPjdQadc01() {
		return this.pjdQadc01;
	}

	public void setPjdQadc01(String pjdQadc01) {
		this.pjdQadc01 = pjdQadc01;
	}

	public String getPjdQadc02() {
		return this.pjdQadc02;
	}

	public void setPjdQadc02(String pjdQadc02) {
		this.pjdQadc02 = pjdQadc02;
	}

	public Double getPjdQadd01() {
		return this.pjdQadd01;
	}

	public void setPjdQadd01(Double pjdQadd01) {
		this.pjdQadd01 = pjdQadd01;
	}

	public Integer getPjdQadi01() {
		return this.pjdQadi01;
	}

	public void setPjdQadi01(Integer pjdQadi01) {
		this.pjdQadi01 = pjdQadi01;
	}

	public Boolean getPjdQadl01() {
		return this.pjdQadl01;
	}

	public void setPjdQadl01(Boolean pjdQadl01) {
		this.pjdQadl01 = pjdQadl01;
	}

	public Date getPjdQadt01() {
		return this.pjdQadt01;
	}

	public void setPjdQadt01(Date pjdQadt01) {
		this.pjdQadt01 = pjdQadt01;
	}

	public Double getOidPjdDet() {
		return this.oidPjdDet;
	}

	public void setOidPjdDet(Double oidPjdDet) {
		this.oidPjdDet = oidPjdDet;
	}

}