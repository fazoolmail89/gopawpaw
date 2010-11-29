package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPjsxDet entity provides the base persistence definition of the
 * PjsxDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPjsxDet implements java.io.Serializable {

	// Fields

	private PjsxDetId id;
	private String pjsxPrjNbr;
	private Integer pjsxPjsLine;
	private Date pjsxDate;
	private String pjsxDefWs;
	private Date pjsxEndDate;
	private String pjsxIntStat;
	private String pjsxLoc;
	private Double pjsxQtyDemand;
	private Double pjsxQtyOrd;
	private Double pjsxQtyInProg;
	private Double pjsxQtyIss;
	private String pjsxSite;
	private String pjsxSoNbr;
	private Integer pjsxSodLine;
	private Date pjsxStartDate;
	private String pjsxType;
	private Date pjsxModDate;
	private String pjsxModUserid;
	private String pjsxUser1;
	private String pjsxUser2;
	private Double pjsxDec01;
	private Boolean pjsxLog01;
	private Date pjsxDte01;
	private String pjsxQadc01;
	private String pjsxQadc02;
	private Double pjsxQadd01;
	private Integer pjsxQadi01;
	private Boolean pjsxQadl01;
	private Date pjsxQadt01;
	private Double oidPjsxDet;

	// Constructors

	/** default constructor */
	public AbstractPjsxDet() {
	}

	/** minimal constructor */
	public AbstractPjsxDet(PjsxDetId id, String pjsxPrjNbr,
			Integer pjsxPjsLine, String pjsxDefWs, String pjsxIntStat,
			String pjsxLoc, Double pjsxQtyDemand, Double pjsxQtyOrd,
			Double pjsxQtyInProg, Double pjsxQtyIss, String pjsxSite,
			String pjsxSoNbr, Integer pjsxSodLine, String pjsxType,
			Date pjsxModDate, String pjsxModUserid, Double oidPjsxDet) {
		this.id = id;
		this.pjsxPrjNbr = pjsxPrjNbr;
		this.pjsxPjsLine = pjsxPjsLine;
		this.pjsxDefWs = pjsxDefWs;
		this.pjsxIntStat = pjsxIntStat;
		this.pjsxLoc = pjsxLoc;
		this.pjsxQtyDemand = pjsxQtyDemand;
		this.pjsxQtyOrd = pjsxQtyOrd;
		this.pjsxQtyInProg = pjsxQtyInProg;
		this.pjsxQtyIss = pjsxQtyIss;
		this.pjsxSite = pjsxSite;
		this.pjsxSoNbr = pjsxSoNbr;
		this.pjsxSodLine = pjsxSodLine;
		this.pjsxType = pjsxType;
		this.pjsxModDate = pjsxModDate;
		this.pjsxModUserid = pjsxModUserid;
		this.oidPjsxDet = oidPjsxDet;
	}

	/** full constructor */
	public AbstractPjsxDet(PjsxDetId id, String pjsxPrjNbr,
			Integer pjsxPjsLine, Date pjsxDate, String pjsxDefWs,
			Date pjsxEndDate, String pjsxIntStat, String pjsxLoc,
			Double pjsxQtyDemand, Double pjsxQtyOrd, Double pjsxQtyInProg,
			Double pjsxQtyIss, String pjsxSite, String pjsxSoNbr,
			Integer pjsxSodLine, Date pjsxStartDate, String pjsxType,
			Date pjsxModDate, String pjsxModUserid, String pjsxUser1,
			String pjsxUser2, Double pjsxDec01, Boolean pjsxLog01,
			Date pjsxDte01, String pjsxQadc01, String pjsxQadc02,
			Double pjsxQadd01, Integer pjsxQadi01, Boolean pjsxQadl01,
			Date pjsxQadt01, Double oidPjsxDet) {
		this.id = id;
		this.pjsxPrjNbr = pjsxPrjNbr;
		this.pjsxPjsLine = pjsxPjsLine;
		this.pjsxDate = pjsxDate;
		this.pjsxDefWs = pjsxDefWs;
		this.pjsxEndDate = pjsxEndDate;
		this.pjsxIntStat = pjsxIntStat;
		this.pjsxLoc = pjsxLoc;
		this.pjsxQtyDemand = pjsxQtyDemand;
		this.pjsxQtyOrd = pjsxQtyOrd;
		this.pjsxQtyInProg = pjsxQtyInProg;
		this.pjsxQtyIss = pjsxQtyIss;
		this.pjsxSite = pjsxSite;
		this.pjsxSoNbr = pjsxSoNbr;
		this.pjsxSodLine = pjsxSodLine;
		this.pjsxStartDate = pjsxStartDate;
		this.pjsxType = pjsxType;
		this.pjsxModDate = pjsxModDate;
		this.pjsxModUserid = pjsxModUserid;
		this.pjsxUser1 = pjsxUser1;
		this.pjsxUser2 = pjsxUser2;
		this.pjsxDec01 = pjsxDec01;
		this.pjsxLog01 = pjsxLog01;
		this.pjsxDte01 = pjsxDte01;
		this.pjsxQadc01 = pjsxQadc01;
		this.pjsxQadc02 = pjsxQadc02;
		this.pjsxQadd01 = pjsxQadd01;
		this.pjsxQadi01 = pjsxQadi01;
		this.pjsxQadl01 = pjsxQadl01;
		this.pjsxQadt01 = pjsxQadt01;
		this.oidPjsxDet = oidPjsxDet;
	}

	// Property accessors

	public PjsxDetId getId() {
		return this.id;
	}

	public void setId(PjsxDetId id) {
		this.id = id;
	}

	public String getPjsxPrjNbr() {
		return this.pjsxPrjNbr;
	}

	public void setPjsxPrjNbr(String pjsxPrjNbr) {
		this.pjsxPrjNbr = pjsxPrjNbr;
	}

	public Integer getPjsxPjsLine() {
		return this.pjsxPjsLine;
	}

	public void setPjsxPjsLine(Integer pjsxPjsLine) {
		this.pjsxPjsLine = pjsxPjsLine;
	}

	public Date getPjsxDate() {
		return this.pjsxDate;
	}

	public void setPjsxDate(Date pjsxDate) {
		this.pjsxDate = pjsxDate;
	}

	public String getPjsxDefWs() {
		return this.pjsxDefWs;
	}

	public void setPjsxDefWs(String pjsxDefWs) {
		this.pjsxDefWs = pjsxDefWs;
	}

	public Date getPjsxEndDate() {
		return this.pjsxEndDate;
	}

	public void setPjsxEndDate(Date pjsxEndDate) {
		this.pjsxEndDate = pjsxEndDate;
	}

	public String getPjsxIntStat() {
		return this.pjsxIntStat;
	}

	public void setPjsxIntStat(String pjsxIntStat) {
		this.pjsxIntStat = pjsxIntStat;
	}

	public String getPjsxLoc() {
		return this.pjsxLoc;
	}

	public void setPjsxLoc(String pjsxLoc) {
		this.pjsxLoc = pjsxLoc;
	}

	public Double getPjsxQtyDemand() {
		return this.pjsxQtyDemand;
	}

	public void setPjsxQtyDemand(Double pjsxQtyDemand) {
		this.pjsxQtyDemand = pjsxQtyDemand;
	}

	public Double getPjsxQtyOrd() {
		return this.pjsxQtyOrd;
	}

	public void setPjsxQtyOrd(Double pjsxQtyOrd) {
		this.pjsxQtyOrd = pjsxQtyOrd;
	}

	public Double getPjsxQtyInProg() {
		return this.pjsxQtyInProg;
	}

	public void setPjsxQtyInProg(Double pjsxQtyInProg) {
		this.pjsxQtyInProg = pjsxQtyInProg;
	}

	public Double getPjsxQtyIss() {
		return this.pjsxQtyIss;
	}

	public void setPjsxQtyIss(Double pjsxQtyIss) {
		this.pjsxQtyIss = pjsxQtyIss;
	}

	public String getPjsxSite() {
		return this.pjsxSite;
	}

	public void setPjsxSite(String pjsxSite) {
		this.pjsxSite = pjsxSite;
	}

	public String getPjsxSoNbr() {
		return this.pjsxSoNbr;
	}

	public void setPjsxSoNbr(String pjsxSoNbr) {
		this.pjsxSoNbr = pjsxSoNbr;
	}

	public Integer getPjsxSodLine() {
		return this.pjsxSodLine;
	}

	public void setPjsxSodLine(Integer pjsxSodLine) {
		this.pjsxSodLine = pjsxSodLine;
	}

	public Date getPjsxStartDate() {
		return this.pjsxStartDate;
	}

	public void setPjsxStartDate(Date pjsxStartDate) {
		this.pjsxStartDate = pjsxStartDate;
	}

	public String getPjsxType() {
		return this.pjsxType;
	}

	public void setPjsxType(String pjsxType) {
		this.pjsxType = pjsxType;
	}

	public Date getPjsxModDate() {
		return this.pjsxModDate;
	}

	public void setPjsxModDate(Date pjsxModDate) {
		this.pjsxModDate = pjsxModDate;
	}

	public String getPjsxModUserid() {
		return this.pjsxModUserid;
	}

	public void setPjsxModUserid(String pjsxModUserid) {
		this.pjsxModUserid = pjsxModUserid;
	}

	public String getPjsxUser1() {
		return this.pjsxUser1;
	}

	public void setPjsxUser1(String pjsxUser1) {
		this.pjsxUser1 = pjsxUser1;
	}

	public String getPjsxUser2() {
		return this.pjsxUser2;
	}

	public void setPjsxUser2(String pjsxUser2) {
		this.pjsxUser2 = pjsxUser2;
	}

	public Double getPjsxDec01() {
		return this.pjsxDec01;
	}

	public void setPjsxDec01(Double pjsxDec01) {
		this.pjsxDec01 = pjsxDec01;
	}

	public Boolean getPjsxLog01() {
		return this.pjsxLog01;
	}

	public void setPjsxLog01(Boolean pjsxLog01) {
		this.pjsxLog01 = pjsxLog01;
	}

	public Date getPjsxDte01() {
		return this.pjsxDte01;
	}

	public void setPjsxDte01(Date pjsxDte01) {
		this.pjsxDte01 = pjsxDte01;
	}

	public String getPjsxQadc01() {
		return this.pjsxQadc01;
	}

	public void setPjsxQadc01(String pjsxQadc01) {
		this.pjsxQadc01 = pjsxQadc01;
	}

	public String getPjsxQadc02() {
		return this.pjsxQadc02;
	}

	public void setPjsxQadc02(String pjsxQadc02) {
		this.pjsxQadc02 = pjsxQadc02;
	}

	public Double getPjsxQadd01() {
		return this.pjsxQadd01;
	}

	public void setPjsxQadd01(Double pjsxQadd01) {
		this.pjsxQadd01 = pjsxQadd01;
	}

	public Integer getPjsxQadi01() {
		return this.pjsxQadi01;
	}

	public void setPjsxQadi01(Integer pjsxQadi01) {
		this.pjsxQadi01 = pjsxQadi01;
	}

	public Boolean getPjsxQadl01() {
		return this.pjsxQadl01;
	}

	public void setPjsxQadl01(Boolean pjsxQadl01) {
		this.pjsxQadl01 = pjsxQadl01;
	}

	public Date getPjsxQadt01() {
		return this.pjsxQadt01;
	}

	public void setPjsxQadt01(Date pjsxQadt01) {
		this.pjsxQadt01 = pjsxQadt01;
	}

	public Double getOidPjsxDet() {
		return this.oidPjsxDet;
	}

	public void setOidPjsxDet(Double oidPjsxDet) {
		this.oidPjsxDet = oidPjsxDet;
	}

}