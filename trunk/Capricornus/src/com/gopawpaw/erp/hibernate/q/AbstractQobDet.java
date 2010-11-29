package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQobDet entity provides the base persistence definition of the QobDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQobDet implements java.io.Serializable {

	// Fields

	private QobDetId id;
	private Date qobIssDate;
	private Double qobQtyReq;
	private Double qobQtyAll;
	private Double qobQtyPick;
	private Double qobQtyIss;
	private Double qobTotStd;
	private Double qobQtyChg;
	private Double qobBoChg;
	private Double qobPrice;
	private String qobLoc;
	private String qobSerial;
	private Integer qobCmtindx;
	private String qobUser1;
	private String qobUser2;
	private String qobSite;
	private String qobParent;
	private String qobQadc01;
	private String qobCfgType;
	private Double oidQobDet;

	// Constructors

	/** default constructor */
	public AbstractQobDet() {
	}

	/** minimal constructor */
	public AbstractQobDet(QobDetId id, String qobParent, Double oidQobDet) {
		this.id = id;
		this.qobParent = qobParent;
		this.oidQobDet = oidQobDet;
	}

	/** full constructor */
	public AbstractQobDet(QobDetId id, Date qobIssDate, Double qobQtyReq,
			Double qobQtyAll, Double qobQtyPick, Double qobQtyIss,
			Double qobTotStd, Double qobQtyChg, Double qobBoChg,
			Double qobPrice, String qobLoc, String qobSerial,
			Integer qobCmtindx, String qobUser1, String qobUser2,
			String qobSite, String qobParent, String qobQadc01,
			String qobCfgType, Double oidQobDet) {
		this.id = id;
		this.qobIssDate = qobIssDate;
		this.qobQtyReq = qobQtyReq;
		this.qobQtyAll = qobQtyAll;
		this.qobQtyPick = qobQtyPick;
		this.qobQtyIss = qobQtyIss;
		this.qobTotStd = qobTotStd;
		this.qobQtyChg = qobQtyChg;
		this.qobBoChg = qobBoChg;
		this.qobPrice = qobPrice;
		this.qobLoc = qobLoc;
		this.qobSerial = qobSerial;
		this.qobCmtindx = qobCmtindx;
		this.qobUser1 = qobUser1;
		this.qobUser2 = qobUser2;
		this.qobSite = qobSite;
		this.qobParent = qobParent;
		this.qobQadc01 = qobQadc01;
		this.qobCfgType = qobCfgType;
		this.oidQobDet = oidQobDet;
	}

	// Property accessors

	public QobDetId getId() {
		return this.id;
	}

	public void setId(QobDetId id) {
		this.id = id;
	}

	public Date getQobIssDate() {
		return this.qobIssDate;
	}

	public void setQobIssDate(Date qobIssDate) {
		this.qobIssDate = qobIssDate;
	}

	public Double getQobQtyReq() {
		return this.qobQtyReq;
	}

	public void setQobQtyReq(Double qobQtyReq) {
		this.qobQtyReq = qobQtyReq;
	}

	public Double getQobQtyAll() {
		return this.qobQtyAll;
	}

	public void setQobQtyAll(Double qobQtyAll) {
		this.qobQtyAll = qobQtyAll;
	}

	public Double getQobQtyPick() {
		return this.qobQtyPick;
	}

	public void setQobQtyPick(Double qobQtyPick) {
		this.qobQtyPick = qobQtyPick;
	}

	public Double getQobQtyIss() {
		return this.qobQtyIss;
	}

	public void setQobQtyIss(Double qobQtyIss) {
		this.qobQtyIss = qobQtyIss;
	}

	public Double getQobTotStd() {
		return this.qobTotStd;
	}

	public void setQobTotStd(Double qobTotStd) {
		this.qobTotStd = qobTotStd;
	}

	public Double getQobQtyChg() {
		return this.qobQtyChg;
	}

	public void setQobQtyChg(Double qobQtyChg) {
		this.qobQtyChg = qobQtyChg;
	}

	public Double getQobBoChg() {
		return this.qobBoChg;
	}

	public void setQobBoChg(Double qobBoChg) {
		this.qobBoChg = qobBoChg;
	}

	public Double getQobPrice() {
		return this.qobPrice;
	}

	public void setQobPrice(Double qobPrice) {
		this.qobPrice = qobPrice;
	}

	public String getQobLoc() {
		return this.qobLoc;
	}

	public void setQobLoc(String qobLoc) {
		this.qobLoc = qobLoc;
	}

	public String getQobSerial() {
		return this.qobSerial;
	}

	public void setQobSerial(String qobSerial) {
		this.qobSerial = qobSerial;
	}

	public Integer getQobCmtindx() {
		return this.qobCmtindx;
	}

	public void setQobCmtindx(Integer qobCmtindx) {
		this.qobCmtindx = qobCmtindx;
	}

	public String getQobUser1() {
		return this.qobUser1;
	}

	public void setQobUser1(String qobUser1) {
		this.qobUser1 = qobUser1;
	}

	public String getQobUser2() {
		return this.qobUser2;
	}

	public void setQobUser2(String qobUser2) {
		this.qobUser2 = qobUser2;
	}

	public String getQobSite() {
		return this.qobSite;
	}

	public void setQobSite(String qobSite) {
		this.qobSite = qobSite;
	}

	public String getQobParent() {
		return this.qobParent;
	}

	public void setQobParent(String qobParent) {
		this.qobParent = qobParent;
	}

	public String getQobQadc01() {
		return this.qobQadc01;
	}

	public void setQobQadc01(String qobQadc01) {
		this.qobQadc01 = qobQadc01;
	}

	public String getQobCfgType() {
		return this.qobCfgType;
	}

	public void setQobCfgType(String qobCfgType) {
		this.qobCfgType = qobCfgType;
	}

	public Double getOidQobDet() {
		return this.oidQobDet;
	}

	public void setOidQobDet(Double oidQobDet) {
		this.oidQobDet = oidQobDet;
	}

}