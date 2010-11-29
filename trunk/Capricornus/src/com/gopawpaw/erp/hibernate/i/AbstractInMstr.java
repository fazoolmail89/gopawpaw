package com.gopawpaw.erp.hibernate.i;

import java.math.BigDecimal;
import java.util.Date;

/**
 * AbstractInMstr entity provides the base persistence definition of the InMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractInMstr implements java.io.Serializable {

	// Fields

	private InMstrId id;
	private Double inQtyOh;
	private Double inQtyReq;
	private Double inQtyAll;
	private Double inQtyOrd;
	private Double inQtyChg;
	private Double inQtyAvail;
	private Double inSlsChg;
	private Double inIssChg;
	private Date inIssDate;
	private Date inRecDate;
	private Date inCntDate;
	private Double inAvgIss;
	private Double inAvgSls;
	private Date inAvgDate;
	private String inUser1;
	private String inUser2;
	private BigDecimal inRop;
	private BigDecimal inSftyStk;
	private Double inQtyNonet;
	private Boolean inMrp;
	private String inGlSet;
	private String inCurSet;
	private String inAbc;
	private Integer inAvgInt;
	private Integer inCycInt;
	private Integer inLevel;
	private Double inAssay;
	private String inGrade;
	private String inLoc;
	private String inLocType;
	private Integer inProjUse;
	private Boolean inRollup;
	private String inRollupId;
	private String inRctpoStatus;
	private String inRctwoStatus;
	private Boolean inRctpoActive;
	private Boolean inRctwoActive;
	private String inQadc01;
	private Boolean inWh;
	private String inGlCostSite;
	private Double inCustConsignQty;
	private Double inSuppConsignQty;
	private Double oidInMstr;

	// Constructors

	/** default constructor */
	public AbstractInMstr() {
	}

	/** minimal constructor */
	public AbstractInMstr(InMstrId id, Integer inLevel, Boolean inWh,
			String inGlCostSite, Double inCustConsignQty,
			Double inSuppConsignQty, Double oidInMstr) {
		this.id = id;
		this.inLevel = inLevel;
		this.inWh = inWh;
		this.inGlCostSite = inGlCostSite;
		this.inCustConsignQty = inCustConsignQty;
		this.inSuppConsignQty = inSuppConsignQty;
		this.oidInMstr = oidInMstr;
	}

	/** full constructor */
	public AbstractInMstr(InMstrId id, Double inQtyOh, Double inQtyReq,
			Double inQtyAll, Double inQtyOrd, Double inQtyChg,
			Double inQtyAvail, Double inSlsChg, Double inIssChg,
			Date inIssDate, Date inRecDate, Date inCntDate, Double inAvgIss,
			Double inAvgSls, Date inAvgDate, String inUser1, String inUser2,
			BigDecimal inRop, BigDecimal inSftyStk, Double inQtyNonet,
			Boolean inMrp, String inGlSet, String inCurSet, String inAbc,
			Integer inAvgInt, Integer inCycInt, Integer inLevel,
			Double inAssay, String inGrade, String inLoc, String inLocType,
			Integer inProjUse, Boolean inRollup, String inRollupId,
			String inRctpoStatus, String inRctwoStatus, Boolean inRctpoActive,
			Boolean inRctwoActive, String inQadc01, Boolean inWh,
			String inGlCostSite, Double inCustConsignQty,
			Double inSuppConsignQty, Double oidInMstr) {
		this.id = id;
		this.inQtyOh = inQtyOh;
		this.inQtyReq = inQtyReq;
		this.inQtyAll = inQtyAll;
		this.inQtyOrd = inQtyOrd;
		this.inQtyChg = inQtyChg;
		this.inQtyAvail = inQtyAvail;
		this.inSlsChg = inSlsChg;
		this.inIssChg = inIssChg;
		this.inIssDate = inIssDate;
		this.inRecDate = inRecDate;
		this.inCntDate = inCntDate;
		this.inAvgIss = inAvgIss;
		this.inAvgSls = inAvgSls;
		this.inAvgDate = inAvgDate;
		this.inUser1 = inUser1;
		this.inUser2 = inUser2;
		this.inRop = inRop;
		this.inSftyStk = inSftyStk;
		this.inQtyNonet = inQtyNonet;
		this.inMrp = inMrp;
		this.inGlSet = inGlSet;
		this.inCurSet = inCurSet;
		this.inAbc = inAbc;
		this.inAvgInt = inAvgInt;
		this.inCycInt = inCycInt;
		this.inLevel = inLevel;
		this.inAssay = inAssay;
		this.inGrade = inGrade;
		this.inLoc = inLoc;
		this.inLocType = inLocType;
		this.inProjUse = inProjUse;
		this.inRollup = inRollup;
		this.inRollupId = inRollupId;
		this.inRctpoStatus = inRctpoStatus;
		this.inRctwoStatus = inRctwoStatus;
		this.inRctpoActive = inRctpoActive;
		this.inRctwoActive = inRctwoActive;
		this.inQadc01 = inQadc01;
		this.inWh = inWh;
		this.inGlCostSite = inGlCostSite;
		this.inCustConsignQty = inCustConsignQty;
		this.inSuppConsignQty = inSuppConsignQty;
		this.oidInMstr = oidInMstr;
	}

	// Property accessors

	public InMstrId getId() {
		return this.id;
	}

	public void setId(InMstrId id) {
		this.id = id;
	}

	public Double getInQtyOh() {
		return this.inQtyOh;
	}

	public void setInQtyOh(Double inQtyOh) {
		this.inQtyOh = inQtyOh;
	}

	public Double getInQtyReq() {
		return this.inQtyReq;
	}

	public void setInQtyReq(Double inQtyReq) {
		this.inQtyReq = inQtyReq;
	}

	public Double getInQtyAll() {
		return this.inQtyAll;
	}

	public void setInQtyAll(Double inQtyAll) {
		this.inQtyAll = inQtyAll;
	}

	public Double getInQtyOrd() {
		return this.inQtyOrd;
	}

	public void setInQtyOrd(Double inQtyOrd) {
		this.inQtyOrd = inQtyOrd;
	}

	public Double getInQtyChg() {
		return this.inQtyChg;
	}

	public void setInQtyChg(Double inQtyChg) {
		this.inQtyChg = inQtyChg;
	}

	public Double getInQtyAvail() {
		return this.inQtyAvail;
	}

	public void setInQtyAvail(Double inQtyAvail) {
		this.inQtyAvail = inQtyAvail;
	}

	public Double getInSlsChg() {
		return this.inSlsChg;
	}

	public void setInSlsChg(Double inSlsChg) {
		this.inSlsChg = inSlsChg;
	}

	public Double getInIssChg() {
		return this.inIssChg;
	}

	public void setInIssChg(Double inIssChg) {
		this.inIssChg = inIssChg;
	}

	public Date getInIssDate() {
		return this.inIssDate;
	}

	public void setInIssDate(Date inIssDate) {
		this.inIssDate = inIssDate;
	}

	public Date getInRecDate() {
		return this.inRecDate;
	}

	public void setInRecDate(Date inRecDate) {
		this.inRecDate = inRecDate;
	}

	public Date getInCntDate() {
		return this.inCntDate;
	}

	public void setInCntDate(Date inCntDate) {
		this.inCntDate = inCntDate;
	}

	public Double getInAvgIss() {
		return this.inAvgIss;
	}

	public void setInAvgIss(Double inAvgIss) {
		this.inAvgIss = inAvgIss;
	}

	public Double getInAvgSls() {
		return this.inAvgSls;
	}

	public void setInAvgSls(Double inAvgSls) {
		this.inAvgSls = inAvgSls;
	}

	public Date getInAvgDate() {
		return this.inAvgDate;
	}

	public void setInAvgDate(Date inAvgDate) {
		this.inAvgDate = inAvgDate;
	}

	public String getInUser1() {
		return this.inUser1;
	}

	public void setInUser1(String inUser1) {
		this.inUser1 = inUser1;
	}

	public String getInUser2() {
		return this.inUser2;
	}

	public void setInUser2(String inUser2) {
		this.inUser2 = inUser2;
	}

	public BigDecimal getInRop() {
		return this.inRop;
	}

	public void setInRop(BigDecimal inRop) {
		this.inRop = inRop;
	}

	public BigDecimal getInSftyStk() {
		return this.inSftyStk;
	}

	public void setInSftyStk(BigDecimal inSftyStk) {
		this.inSftyStk = inSftyStk;
	}

	public Double getInQtyNonet() {
		return this.inQtyNonet;
	}

	public void setInQtyNonet(Double inQtyNonet) {
		this.inQtyNonet = inQtyNonet;
	}

	public Boolean getInMrp() {
		return this.inMrp;
	}

	public void setInMrp(Boolean inMrp) {
		this.inMrp = inMrp;
	}

	public String getInGlSet() {
		return this.inGlSet;
	}

	public void setInGlSet(String inGlSet) {
		this.inGlSet = inGlSet;
	}

	public String getInCurSet() {
		return this.inCurSet;
	}

	public void setInCurSet(String inCurSet) {
		this.inCurSet = inCurSet;
	}

	public String getInAbc() {
		return this.inAbc;
	}

	public void setInAbc(String inAbc) {
		this.inAbc = inAbc;
	}

	public Integer getInAvgInt() {
		return this.inAvgInt;
	}

	public void setInAvgInt(Integer inAvgInt) {
		this.inAvgInt = inAvgInt;
	}

	public Integer getInCycInt() {
		return this.inCycInt;
	}

	public void setInCycInt(Integer inCycInt) {
		this.inCycInt = inCycInt;
	}

	public Integer getInLevel() {
		return this.inLevel;
	}

	public void setInLevel(Integer inLevel) {
		this.inLevel = inLevel;
	}

	public Double getInAssay() {
		return this.inAssay;
	}

	public void setInAssay(Double inAssay) {
		this.inAssay = inAssay;
	}

	public String getInGrade() {
		return this.inGrade;
	}

	public void setInGrade(String inGrade) {
		this.inGrade = inGrade;
	}

	public String getInLoc() {
		return this.inLoc;
	}

	public void setInLoc(String inLoc) {
		this.inLoc = inLoc;
	}

	public String getInLocType() {
		return this.inLocType;
	}

	public void setInLocType(String inLocType) {
		this.inLocType = inLocType;
	}

	public Integer getInProjUse() {
		return this.inProjUse;
	}

	public void setInProjUse(Integer inProjUse) {
		this.inProjUse = inProjUse;
	}

	public Boolean getInRollup() {
		return this.inRollup;
	}

	public void setInRollup(Boolean inRollup) {
		this.inRollup = inRollup;
	}

	public String getInRollupId() {
		return this.inRollupId;
	}

	public void setInRollupId(String inRollupId) {
		this.inRollupId = inRollupId;
	}

	public String getInRctpoStatus() {
		return this.inRctpoStatus;
	}

	public void setInRctpoStatus(String inRctpoStatus) {
		this.inRctpoStatus = inRctpoStatus;
	}

	public String getInRctwoStatus() {
		return this.inRctwoStatus;
	}

	public void setInRctwoStatus(String inRctwoStatus) {
		this.inRctwoStatus = inRctwoStatus;
	}

	public Boolean getInRctpoActive() {
		return this.inRctpoActive;
	}

	public void setInRctpoActive(Boolean inRctpoActive) {
		this.inRctpoActive = inRctpoActive;
	}

	public Boolean getInRctwoActive() {
		return this.inRctwoActive;
	}

	public void setInRctwoActive(Boolean inRctwoActive) {
		this.inRctwoActive = inRctwoActive;
	}

	public String getInQadc01() {
		return this.inQadc01;
	}

	public void setInQadc01(String inQadc01) {
		this.inQadc01 = inQadc01;
	}

	public Boolean getInWh() {
		return this.inWh;
	}

	public void setInWh(Boolean inWh) {
		this.inWh = inWh;
	}

	public String getInGlCostSite() {
		return this.inGlCostSite;
	}

	public void setInGlCostSite(String inGlCostSite) {
		this.inGlCostSite = inGlCostSite;
	}

	public Double getInCustConsignQty() {
		return this.inCustConsignQty;
	}

	public void setInCustConsignQty(Double inCustConsignQty) {
		this.inCustConsignQty = inCustConsignQty;
	}

	public Double getInSuppConsignQty() {
		return this.inSuppConsignQty;
	}

	public void setInSuppConsignQty(Double inSuppConsignQty) {
		this.inSuppConsignQty = inSuppConsignQty;
	}

	public Double getOidInMstr() {
		return this.oidInMstr;
	}

	public void setOidInMstr(Double oidInMstr) {
		this.oidInMstr = oidInMstr;
	}

}