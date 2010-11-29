package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSobDet entity provides the base persistence definition of the SobDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSobDet implements java.io.Serializable {

	// Fields

	private SobDetId id;
	private Date sobIssDate;
	private Double sobQtyReq;
	private Double sobQtyAll;
	private Double sobQtyPick;
	private Double sobQtyIss;
	private Double sobTotStd;
	private Double sobQtyChg;
	private Double sobBoChg;
	private Double sobPrice;
	private String sobLoc;
	private String sobSerial;
	private Integer sobCmtindx;
	private String sobUser1;
	private String sobUser2;
	private String sobSite;
	private Double sobScrpPct;
	private String sobQadc01;
	private String sobCfgType;
	private Double oidSobDet;

	// Constructors

	/** default constructor */
	public AbstractSobDet() {
	}

	/** minimal constructor */
	public AbstractSobDet(SobDetId id, Double oidSobDet) {
		this.id = id;
		this.oidSobDet = oidSobDet;
	}

	/** full constructor */
	public AbstractSobDet(SobDetId id, Date sobIssDate, Double sobQtyReq,
			Double sobQtyAll, Double sobQtyPick, Double sobQtyIss,
			Double sobTotStd, Double sobQtyChg, Double sobBoChg,
			Double sobPrice, String sobLoc, String sobSerial,
			Integer sobCmtindx, String sobUser1, String sobUser2,
			String sobSite, Double sobScrpPct, String sobQadc01,
			String sobCfgType, Double oidSobDet) {
		this.id = id;
		this.sobIssDate = sobIssDate;
		this.sobQtyReq = sobQtyReq;
		this.sobQtyAll = sobQtyAll;
		this.sobQtyPick = sobQtyPick;
		this.sobQtyIss = sobQtyIss;
		this.sobTotStd = sobTotStd;
		this.sobQtyChg = sobQtyChg;
		this.sobBoChg = sobBoChg;
		this.sobPrice = sobPrice;
		this.sobLoc = sobLoc;
		this.sobSerial = sobSerial;
		this.sobCmtindx = sobCmtindx;
		this.sobUser1 = sobUser1;
		this.sobUser2 = sobUser2;
		this.sobSite = sobSite;
		this.sobScrpPct = sobScrpPct;
		this.sobQadc01 = sobQadc01;
		this.sobCfgType = sobCfgType;
		this.oidSobDet = oidSobDet;
	}

	// Property accessors

	public SobDetId getId() {
		return this.id;
	}

	public void setId(SobDetId id) {
		this.id = id;
	}

	public Date getSobIssDate() {
		return this.sobIssDate;
	}

	public void setSobIssDate(Date sobIssDate) {
		this.sobIssDate = sobIssDate;
	}

	public Double getSobQtyReq() {
		return this.sobQtyReq;
	}

	public void setSobQtyReq(Double sobQtyReq) {
		this.sobQtyReq = sobQtyReq;
	}

	public Double getSobQtyAll() {
		return this.sobQtyAll;
	}

	public void setSobQtyAll(Double sobQtyAll) {
		this.sobQtyAll = sobQtyAll;
	}

	public Double getSobQtyPick() {
		return this.sobQtyPick;
	}

	public void setSobQtyPick(Double sobQtyPick) {
		this.sobQtyPick = sobQtyPick;
	}

	public Double getSobQtyIss() {
		return this.sobQtyIss;
	}

	public void setSobQtyIss(Double sobQtyIss) {
		this.sobQtyIss = sobQtyIss;
	}

	public Double getSobTotStd() {
		return this.sobTotStd;
	}

	public void setSobTotStd(Double sobTotStd) {
		this.sobTotStd = sobTotStd;
	}

	public Double getSobQtyChg() {
		return this.sobQtyChg;
	}

	public void setSobQtyChg(Double sobQtyChg) {
		this.sobQtyChg = sobQtyChg;
	}

	public Double getSobBoChg() {
		return this.sobBoChg;
	}

	public void setSobBoChg(Double sobBoChg) {
		this.sobBoChg = sobBoChg;
	}

	public Double getSobPrice() {
		return this.sobPrice;
	}

	public void setSobPrice(Double sobPrice) {
		this.sobPrice = sobPrice;
	}

	public String getSobLoc() {
		return this.sobLoc;
	}

	public void setSobLoc(String sobLoc) {
		this.sobLoc = sobLoc;
	}

	public String getSobSerial() {
		return this.sobSerial;
	}

	public void setSobSerial(String sobSerial) {
		this.sobSerial = sobSerial;
	}

	public Integer getSobCmtindx() {
		return this.sobCmtindx;
	}

	public void setSobCmtindx(Integer sobCmtindx) {
		this.sobCmtindx = sobCmtindx;
	}

	public String getSobUser1() {
		return this.sobUser1;
	}

	public void setSobUser1(String sobUser1) {
		this.sobUser1 = sobUser1;
	}

	public String getSobUser2() {
		return this.sobUser2;
	}

	public void setSobUser2(String sobUser2) {
		this.sobUser2 = sobUser2;
	}

	public String getSobSite() {
		return this.sobSite;
	}

	public void setSobSite(String sobSite) {
		this.sobSite = sobSite;
	}

	public Double getSobScrpPct() {
		return this.sobScrpPct;
	}

	public void setSobScrpPct(Double sobScrpPct) {
		this.sobScrpPct = sobScrpPct;
	}

	public String getSobQadc01() {
		return this.sobQadc01;
	}

	public void setSobQadc01(String sobQadc01) {
		this.sobQadc01 = sobQadc01;
	}

	public String getSobCfgType() {
		return this.sobCfgType;
	}

	public void setSobCfgType(String sobCfgType) {
		this.sobCfgType = sobCfgType;
	}

	public Double getOidSobDet() {
		return this.oidSobDet;
	}

	public void setOidSobDet(Double oidSobDet) {
		this.oidSobDet = oidSobDet;
	}

}