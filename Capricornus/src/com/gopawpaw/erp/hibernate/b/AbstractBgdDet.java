package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * AbstractBgdDet entity provides the base persistence definition of the BgdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBgdDet implements java.io.Serializable {

	// Fields

	private BgdDetId id;
	private Date bgdEntDt;
	private Double bgdAmt;
	private Double bgdPct;
	private String bgdUser1;
	private String bgdUser2;
	private String bgdUserid;
	private Date bgdDate;
	private Double bgdEcurAmt;
	private Double bgdEnEnrate;
	private String bgdQadc01;
	private Double oidBgdDet;

	// Constructors

	/** default constructor */
	public AbstractBgdDet() {
	}

	/** minimal constructor */
	public AbstractBgdDet(BgdDetId id, Double oidBgdDet) {
		this.id = id;
		this.oidBgdDet = oidBgdDet;
	}

	/** full constructor */
	public AbstractBgdDet(BgdDetId id, Date bgdEntDt, Double bgdAmt,
			Double bgdPct, String bgdUser1, String bgdUser2, String bgdUserid,
			Date bgdDate, Double bgdEcurAmt, Double bgdEnEnrate,
			String bgdQadc01, Double oidBgdDet) {
		this.id = id;
		this.bgdEntDt = bgdEntDt;
		this.bgdAmt = bgdAmt;
		this.bgdPct = bgdPct;
		this.bgdUser1 = bgdUser1;
		this.bgdUser2 = bgdUser2;
		this.bgdUserid = bgdUserid;
		this.bgdDate = bgdDate;
		this.bgdEcurAmt = bgdEcurAmt;
		this.bgdEnEnrate = bgdEnEnrate;
		this.bgdQadc01 = bgdQadc01;
		this.oidBgdDet = oidBgdDet;
	}

	// Property accessors

	public BgdDetId getId() {
		return this.id;
	}

	public void setId(BgdDetId id) {
		this.id = id;
	}

	public Date getBgdEntDt() {
		return this.bgdEntDt;
	}

	public void setBgdEntDt(Date bgdEntDt) {
		this.bgdEntDt = bgdEntDt;
	}

	public Double getBgdAmt() {
		return this.bgdAmt;
	}

	public void setBgdAmt(Double bgdAmt) {
		this.bgdAmt = bgdAmt;
	}

	public Double getBgdPct() {
		return this.bgdPct;
	}

	public void setBgdPct(Double bgdPct) {
		this.bgdPct = bgdPct;
	}

	public String getBgdUser1() {
		return this.bgdUser1;
	}

	public void setBgdUser1(String bgdUser1) {
		this.bgdUser1 = bgdUser1;
	}

	public String getBgdUser2() {
		return this.bgdUser2;
	}

	public void setBgdUser2(String bgdUser2) {
		this.bgdUser2 = bgdUser2;
	}

	public String getBgdUserid() {
		return this.bgdUserid;
	}

	public void setBgdUserid(String bgdUserid) {
		this.bgdUserid = bgdUserid;
	}

	public Date getBgdDate() {
		return this.bgdDate;
	}

	public void setBgdDate(Date bgdDate) {
		this.bgdDate = bgdDate;
	}

	public Double getBgdEcurAmt() {
		return this.bgdEcurAmt;
	}

	public void setBgdEcurAmt(Double bgdEcurAmt) {
		this.bgdEcurAmt = bgdEcurAmt;
	}

	public Double getBgdEnEnrate() {
		return this.bgdEnEnrate;
	}

	public void setBgdEnEnrate(Double bgdEnEnrate) {
		this.bgdEnEnrate = bgdEnEnrate;
	}

	public String getBgdQadc01() {
		return this.bgdQadc01;
	}

	public void setBgdQadc01(String bgdQadc01) {
		this.bgdQadc01 = bgdQadc01;
	}

	public Double getOidBgdDet() {
		return this.oidBgdDet;
	}

	public void setOidBgdDet(Double oidBgdDet) {
		this.oidBgdDet = oidBgdDet;
	}

}