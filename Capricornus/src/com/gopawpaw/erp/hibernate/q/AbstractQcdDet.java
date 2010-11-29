package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQcdDet entity provides the base persistence definition of the QcdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQcdDet implements java.io.Serializable {

	// Fields

	private QcdDetId id;
	private String qcdNbr;
	private Date qcdIssDate;
	private Double qcdQtyReq;
	private Double qcdQtyIss;
	private Integer qcdCmtindx;
	private String qcdUser1;
	private String qcdUser2;
	private String qcdChr01;
	private String qcdChr02;
	private String qcdChr03;
	private String qcdChr04;
	private String qcdChr05;
	private Date qcdDte01;
	private Date qcdDte02;
	private Double qcdDec01;
	private Double qcdDec02;
	private Boolean qcdLog01;
	private Double oidQcdDet;

	// Constructors

	/** default constructor */
	public AbstractQcdDet() {
	}

	/** minimal constructor */
	public AbstractQcdDet(QcdDetId id, Double oidQcdDet) {
		this.id = id;
		this.oidQcdDet = oidQcdDet;
	}

	/** full constructor */
	public AbstractQcdDet(QcdDetId id, String qcdNbr, Date qcdIssDate,
			Double qcdQtyReq, Double qcdQtyIss, Integer qcdCmtindx,
			String qcdUser1, String qcdUser2, String qcdChr01, String qcdChr02,
			String qcdChr03, String qcdChr04, String qcdChr05, Date qcdDte01,
			Date qcdDte02, Double qcdDec01, Double qcdDec02, Boolean qcdLog01,
			Double oidQcdDet) {
		this.id = id;
		this.qcdNbr = qcdNbr;
		this.qcdIssDate = qcdIssDate;
		this.qcdQtyReq = qcdQtyReq;
		this.qcdQtyIss = qcdQtyIss;
		this.qcdCmtindx = qcdCmtindx;
		this.qcdUser1 = qcdUser1;
		this.qcdUser2 = qcdUser2;
		this.qcdChr01 = qcdChr01;
		this.qcdChr02 = qcdChr02;
		this.qcdChr03 = qcdChr03;
		this.qcdChr04 = qcdChr04;
		this.qcdChr05 = qcdChr05;
		this.qcdDte01 = qcdDte01;
		this.qcdDte02 = qcdDte02;
		this.qcdDec01 = qcdDec01;
		this.qcdDec02 = qcdDec02;
		this.qcdLog01 = qcdLog01;
		this.oidQcdDet = oidQcdDet;
	}

	// Property accessors

	public QcdDetId getId() {
		return this.id;
	}

	public void setId(QcdDetId id) {
		this.id = id;
	}

	public String getQcdNbr() {
		return this.qcdNbr;
	}

	public void setQcdNbr(String qcdNbr) {
		this.qcdNbr = qcdNbr;
	}

	public Date getQcdIssDate() {
		return this.qcdIssDate;
	}

	public void setQcdIssDate(Date qcdIssDate) {
		this.qcdIssDate = qcdIssDate;
	}

	public Double getQcdQtyReq() {
		return this.qcdQtyReq;
	}

	public void setQcdQtyReq(Double qcdQtyReq) {
		this.qcdQtyReq = qcdQtyReq;
	}

	public Double getQcdQtyIss() {
		return this.qcdQtyIss;
	}

	public void setQcdQtyIss(Double qcdQtyIss) {
		this.qcdQtyIss = qcdQtyIss;
	}

	public Integer getQcdCmtindx() {
		return this.qcdCmtindx;
	}

	public void setQcdCmtindx(Integer qcdCmtindx) {
		this.qcdCmtindx = qcdCmtindx;
	}

	public String getQcdUser1() {
		return this.qcdUser1;
	}

	public void setQcdUser1(String qcdUser1) {
		this.qcdUser1 = qcdUser1;
	}

	public String getQcdUser2() {
		return this.qcdUser2;
	}

	public void setQcdUser2(String qcdUser2) {
		this.qcdUser2 = qcdUser2;
	}

	public String getQcdChr01() {
		return this.qcdChr01;
	}

	public void setQcdChr01(String qcdChr01) {
		this.qcdChr01 = qcdChr01;
	}

	public String getQcdChr02() {
		return this.qcdChr02;
	}

	public void setQcdChr02(String qcdChr02) {
		this.qcdChr02 = qcdChr02;
	}

	public String getQcdChr03() {
		return this.qcdChr03;
	}

	public void setQcdChr03(String qcdChr03) {
		this.qcdChr03 = qcdChr03;
	}

	public String getQcdChr04() {
		return this.qcdChr04;
	}

	public void setQcdChr04(String qcdChr04) {
		this.qcdChr04 = qcdChr04;
	}

	public String getQcdChr05() {
		return this.qcdChr05;
	}

	public void setQcdChr05(String qcdChr05) {
		this.qcdChr05 = qcdChr05;
	}

	public Date getQcdDte01() {
		return this.qcdDte01;
	}

	public void setQcdDte01(Date qcdDte01) {
		this.qcdDte01 = qcdDte01;
	}

	public Date getQcdDte02() {
		return this.qcdDte02;
	}

	public void setQcdDte02(Date qcdDte02) {
		this.qcdDte02 = qcdDte02;
	}

	public Double getQcdDec01() {
		return this.qcdDec01;
	}

	public void setQcdDec01(Double qcdDec01) {
		this.qcdDec01 = qcdDec01;
	}

	public Double getQcdDec02() {
		return this.qcdDec02;
	}

	public void setQcdDec02(Double qcdDec02) {
		this.qcdDec02 = qcdDec02;
	}

	public Boolean getQcdLog01() {
		return this.qcdLog01;
	}

	public void setQcdLog01(Boolean qcdLog01) {
		this.qcdLog01 = qcdLog01;
	}

	public Double getOidQcdDet() {
		return this.oidQcdDet;
	}

	public void setOidQcdDet(Double oidQcdDet) {
		this.oidQcdDet = oidQcdDet;
	}

}