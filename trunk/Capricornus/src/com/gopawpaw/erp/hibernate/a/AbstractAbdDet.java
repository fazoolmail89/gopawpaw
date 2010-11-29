package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbdDet entity provides the base persistence definition of the AbdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbdDet implements java.io.Serializable {

	// Fields

	private AbdDetId id;
	private String abdType;
	private Boolean abdActive;
	private Double abdCost;
	private Double abdCurrCost;
	private Double abdExRate;
	private Double abdEntEx;
	private Integer abdLifeYr;
	private Integer abdLifeMnth;
	private Integer abdRemYr;
	private Integer abdRemMnth;
	private String abdMethod;
	private Double abdSalvage;
	private Double abdDtd;
	private Double abdYtd;
	private Double abdPdDepr;
	private Date abdLastDepr;
	private Double abdExpense;
	private Double abdBonus;
	private Double abdCredit;
	private Double abdCrAmt;
	private String abdConv;
	private Double abdDbPct;
	private Integer abdUint1;
	private Integer abdUint2;
	private Integer abdUint3;
	private Double abdUdec1;
	private Double abdUdec2;
	private Double abdUdec3;
	private Double abdPriorAst;
	private String abdUser1;
	private String abdUser2;
	private String abdQad01;
	private String abdQad02;
	private Double abdRepPct;
	private Date abdDate;
	private Integer abdPeriods;
	private Double abdYtdTotal;
	private Double abdFirstMnth;
	private Date abdRtDate;
	private String abdQad03;
	private Double abdSchedDepr;
	private Double abdUdec4;
	private Double abdExRate2;
	private String abdExRatetype;
	private Integer abdExruSeq;
	private Double oidAbdDet;

	// Constructors

	/** default constructor */
	public AbstractAbdDet() {
	}

	/** minimal constructor */
	public AbstractAbdDet(AbdDetId id, Integer abdLifeYr, Integer abdLifeMnth,
			Integer abdRemYr, Integer abdRemMnth, Date abdLastDepr,
			Double abdSchedDepr, Double abdUdec4, Double abdExRate2,
			String abdExRatetype, Integer abdExruSeq, Double oidAbdDet) {
		this.id = id;
		this.abdLifeYr = abdLifeYr;
		this.abdLifeMnth = abdLifeMnth;
		this.abdRemYr = abdRemYr;
		this.abdRemMnth = abdRemMnth;
		this.abdLastDepr = abdLastDepr;
		this.abdSchedDepr = abdSchedDepr;
		this.abdUdec4 = abdUdec4;
		this.abdExRate2 = abdExRate2;
		this.abdExRatetype = abdExRatetype;
		this.abdExruSeq = abdExruSeq;
		this.oidAbdDet = oidAbdDet;
	}

	/** full constructor */
	public AbstractAbdDet(AbdDetId id, String abdType, Boolean abdActive,
			Double abdCost, Double abdCurrCost, Double abdExRate,
			Double abdEntEx, Integer abdLifeYr, Integer abdLifeMnth,
			Integer abdRemYr, Integer abdRemMnth, String abdMethod,
			Double abdSalvage, Double abdDtd, Double abdYtd, Double abdPdDepr,
			Date abdLastDepr, Double abdExpense, Double abdBonus,
			Double abdCredit, Double abdCrAmt, String abdConv, Double abdDbPct,
			Integer abdUint1, Integer abdUint2, Integer abdUint3,
			Double abdUdec1, Double abdUdec2, Double abdUdec3,
			Double abdPriorAst, String abdUser1, String abdUser2,
			String abdQad01, String abdQad02, Double abdRepPct, Date abdDate,
			Integer abdPeriods, Double abdYtdTotal, Double abdFirstMnth,
			Date abdRtDate, String abdQad03, Double abdSchedDepr,
			Double abdUdec4, Double abdExRate2, String abdExRatetype,
			Integer abdExruSeq, Double oidAbdDet) {
		this.id = id;
		this.abdType = abdType;
		this.abdActive = abdActive;
		this.abdCost = abdCost;
		this.abdCurrCost = abdCurrCost;
		this.abdExRate = abdExRate;
		this.abdEntEx = abdEntEx;
		this.abdLifeYr = abdLifeYr;
		this.abdLifeMnth = abdLifeMnth;
		this.abdRemYr = abdRemYr;
		this.abdRemMnth = abdRemMnth;
		this.abdMethod = abdMethod;
		this.abdSalvage = abdSalvage;
		this.abdDtd = abdDtd;
		this.abdYtd = abdYtd;
		this.abdPdDepr = abdPdDepr;
		this.abdLastDepr = abdLastDepr;
		this.abdExpense = abdExpense;
		this.abdBonus = abdBonus;
		this.abdCredit = abdCredit;
		this.abdCrAmt = abdCrAmt;
		this.abdConv = abdConv;
		this.abdDbPct = abdDbPct;
		this.abdUint1 = abdUint1;
		this.abdUint2 = abdUint2;
		this.abdUint3 = abdUint3;
		this.abdUdec1 = abdUdec1;
		this.abdUdec2 = abdUdec2;
		this.abdUdec3 = abdUdec3;
		this.abdPriorAst = abdPriorAst;
		this.abdUser1 = abdUser1;
		this.abdUser2 = abdUser2;
		this.abdQad01 = abdQad01;
		this.abdQad02 = abdQad02;
		this.abdRepPct = abdRepPct;
		this.abdDate = abdDate;
		this.abdPeriods = abdPeriods;
		this.abdYtdTotal = abdYtdTotal;
		this.abdFirstMnth = abdFirstMnth;
		this.abdRtDate = abdRtDate;
		this.abdQad03 = abdQad03;
		this.abdSchedDepr = abdSchedDepr;
		this.abdUdec4 = abdUdec4;
		this.abdExRate2 = abdExRate2;
		this.abdExRatetype = abdExRatetype;
		this.abdExruSeq = abdExruSeq;
		this.oidAbdDet = oidAbdDet;
	}

	// Property accessors

	public AbdDetId getId() {
		return this.id;
	}

	public void setId(AbdDetId id) {
		this.id = id;
	}

	public String getAbdType() {
		return this.abdType;
	}

	public void setAbdType(String abdType) {
		this.abdType = abdType;
	}

	public Boolean getAbdActive() {
		return this.abdActive;
	}

	public void setAbdActive(Boolean abdActive) {
		this.abdActive = abdActive;
	}

	public Double getAbdCost() {
		return this.abdCost;
	}

	public void setAbdCost(Double abdCost) {
		this.abdCost = abdCost;
	}

	public Double getAbdCurrCost() {
		return this.abdCurrCost;
	}

	public void setAbdCurrCost(Double abdCurrCost) {
		this.abdCurrCost = abdCurrCost;
	}

	public Double getAbdExRate() {
		return this.abdExRate;
	}

	public void setAbdExRate(Double abdExRate) {
		this.abdExRate = abdExRate;
	}

	public Double getAbdEntEx() {
		return this.abdEntEx;
	}

	public void setAbdEntEx(Double abdEntEx) {
		this.abdEntEx = abdEntEx;
	}

	public Integer getAbdLifeYr() {
		return this.abdLifeYr;
	}

	public void setAbdLifeYr(Integer abdLifeYr) {
		this.abdLifeYr = abdLifeYr;
	}

	public Integer getAbdLifeMnth() {
		return this.abdLifeMnth;
	}

	public void setAbdLifeMnth(Integer abdLifeMnth) {
		this.abdLifeMnth = abdLifeMnth;
	}

	public Integer getAbdRemYr() {
		return this.abdRemYr;
	}

	public void setAbdRemYr(Integer abdRemYr) {
		this.abdRemYr = abdRemYr;
	}

	public Integer getAbdRemMnth() {
		return this.abdRemMnth;
	}

	public void setAbdRemMnth(Integer abdRemMnth) {
		this.abdRemMnth = abdRemMnth;
	}

	public String getAbdMethod() {
		return this.abdMethod;
	}

	public void setAbdMethod(String abdMethod) {
		this.abdMethod = abdMethod;
	}

	public Double getAbdSalvage() {
		return this.abdSalvage;
	}

	public void setAbdSalvage(Double abdSalvage) {
		this.abdSalvage = abdSalvage;
	}

	public Double getAbdDtd() {
		return this.abdDtd;
	}

	public void setAbdDtd(Double abdDtd) {
		this.abdDtd = abdDtd;
	}

	public Double getAbdYtd() {
		return this.abdYtd;
	}

	public void setAbdYtd(Double abdYtd) {
		this.abdYtd = abdYtd;
	}

	public Double getAbdPdDepr() {
		return this.abdPdDepr;
	}

	public void setAbdPdDepr(Double abdPdDepr) {
		this.abdPdDepr = abdPdDepr;
	}

	public Date getAbdLastDepr() {
		return this.abdLastDepr;
	}

	public void setAbdLastDepr(Date abdLastDepr) {
		this.abdLastDepr = abdLastDepr;
	}

	public Double getAbdExpense() {
		return this.abdExpense;
	}

	public void setAbdExpense(Double abdExpense) {
		this.abdExpense = abdExpense;
	}

	public Double getAbdBonus() {
		return this.abdBonus;
	}

	public void setAbdBonus(Double abdBonus) {
		this.abdBonus = abdBonus;
	}

	public Double getAbdCredit() {
		return this.abdCredit;
	}

	public void setAbdCredit(Double abdCredit) {
		this.abdCredit = abdCredit;
	}

	public Double getAbdCrAmt() {
		return this.abdCrAmt;
	}

	public void setAbdCrAmt(Double abdCrAmt) {
		this.abdCrAmt = abdCrAmt;
	}

	public String getAbdConv() {
		return this.abdConv;
	}

	public void setAbdConv(String abdConv) {
		this.abdConv = abdConv;
	}

	public Double getAbdDbPct() {
		return this.abdDbPct;
	}

	public void setAbdDbPct(Double abdDbPct) {
		this.abdDbPct = abdDbPct;
	}

	public Integer getAbdUint1() {
		return this.abdUint1;
	}

	public void setAbdUint1(Integer abdUint1) {
		this.abdUint1 = abdUint1;
	}

	public Integer getAbdUint2() {
		return this.abdUint2;
	}

	public void setAbdUint2(Integer abdUint2) {
		this.abdUint2 = abdUint2;
	}

	public Integer getAbdUint3() {
		return this.abdUint3;
	}

	public void setAbdUint3(Integer abdUint3) {
		this.abdUint3 = abdUint3;
	}

	public Double getAbdUdec1() {
		return this.abdUdec1;
	}

	public void setAbdUdec1(Double abdUdec1) {
		this.abdUdec1 = abdUdec1;
	}

	public Double getAbdUdec2() {
		return this.abdUdec2;
	}

	public void setAbdUdec2(Double abdUdec2) {
		this.abdUdec2 = abdUdec2;
	}

	public Double getAbdUdec3() {
		return this.abdUdec3;
	}

	public void setAbdUdec3(Double abdUdec3) {
		this.abdUdec3 = abdUdec3;
	}

	public Double getAbdPriorAst() {
		return this.abdPriorAst;
	}

	public void setAbdPriorAst(Double abdPriorAst) {
		this.abdPriorAst = abdPriorAst;
	}

	public String getAbdUser1() {
		return this.abdUser1;
	}

	public void setAbdUser1(String abdUser1) {
		this.abdUser1 = abdUser1;
	}

	public String getAbdUser2() {
		return this.abdUser2;
	}

	public void setAbdUser2(String abdUser2) {
		this.abdUser2 = abdUser2;
	}

	public String getAbdQad01() {
		return this.abdQad01;
	}

	public void setAbdQad01(String abdQad01) {
		this.abdQad01 = abdQad01;
	}

	public String getAbdQad02() {
		return this.abdQad02;
	}

	public void setAbdQad02(String abdQad02) {
		this.abdQad02 = abdQad02;
	}

	public Double getAbdRepPct() {
		return this.abdRepPct;
	}

	public void setAbdRepPct(Double abdRepPct) {
		this.abdRepPct = abdRepPct;
	}

	public Date getAbdDate() {
		return this.abdDate;
	}

	public void setAbdDate(Date abdDate) {
		this.abdDate = abdDate;
	}

	public Integer getAbdPeriods() {
		return this.abdPeriods;
	}

	public void setAbdPeriods(Integer abdPeriods) {
		this.abdPeriods = abdPeriods;
	}

	public Double getAbdYtdTotal() {
		return this.abdYtdTotal;
	}

	public void setAbdYtdTotal(Double abdYtdTotal) {
		this.abdYtdTotal = abdYtdTotal;
	}

	public Double getAbdFirstMnth() {
		return this.abdFirstMnth;
	}

	public void setAbdFirstMnth(Double abdFirstMnth) {
		this.abdFirstMnth = abdFirstMnth;
	}

	public Date getAbdRtDate() {
		return this.abdRtDate;
	}

	public void setAbdRtDate(Date abdRtDate) {
		this.abdRtDate = abdRtDate;
	}

	public String getAbdQad03() {
		return this.abdQad03;
	}

	public void setAbdQad03(String abdQad03) {
		this.abdQad03 = abdQad03;
	}

	public Double getAbdSchedDepr() {
		return this.abdSchedDepr;
	}

	public void setAbdSchedDepr(Double abdSchedDepr) {
		this.abdSchedDepr = abdSchedDepr;
	}

	public Double getAbdUdec4() {
		return this.abdUdec4;
	}

	public void setAbdUdec4(Double abdUdec4) {
		this.abdUdec4 = abdUdec4;
	}

	public Double getAbdExRate2() {
		return this.abdExRate2;
	}

	public void setAbdExRate2(Double abdExRate2) {
		this.abdExRate2 = abdExRate2;
	}

	public String getAbdExRatetype() {
		return this.abdExRatetype;
	}

	public void setAbdExRatetype(String abdExRatetype) {
		this.abdExRatetype = abdExRatetype;
	}

	public Integer getAbdExruSeq() {
		return this.abdExruSeq;
	}

	public void setAbdExruSeq(Integer abdExruSeq) {
		this.abdExruSeq = abdExruSeq;
	}

	public Double getOidAbdDet() {
		return this.oidAbdDet;
	}

	public void setOidAbdDet(Double oidAbdDet) {
		this.oidAbdDet = oidAbdDet;
	}

}