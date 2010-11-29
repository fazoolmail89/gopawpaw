package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMpdDet entity provides the base persistence definition of the MpdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMpdDet implements java.io.Serializable {

	// Fields

	private MpdDetId id;
	private String mpdLabel;
	private String mpdTol;
	private String mpdTolType;
	private Integer mpdCmtindx;
	private String mpdUser1;
	private String mpdUser2;
	private String mpdChr01;
	private String mpdChr02;
	private String mpdChr03;
	private String mpdChr04;
	private String mpdChr05;
	private Double mpdDec01;
	private Double mpdDec02;
	private Double oidMpdDet;

	// Constructors

	/** default constructor */
	public AbstractMpdDet() {
	}

	/** minimal constructor */
	public AbstractMpdDet(MpdDetId id, Double oidMpdDet) {
		this.id = id;
		this.oidMpdDet = oidMpdDet;
	}

	/** full constructor */
	public AbstractMpdDet(MpdDetId id, String mpdLabel, String mpdTol,
			String mpdTolType, Integer mpdCmtindx, String mpdUser1,
			String mpdUser2, String mpdChr01, String mpdChr02, String mpdChr03,
			String mpdChr04, String mpdChr05, Double mpdDec01, Double mpdDec02,
			Double oidMpdDet) {
		this.id = id;
		this.mpdLabel = mpdLabel;
		this.mpdTol = mpdTol;
		this.mpdTolType = mpdTolType;
		this.mpdCmtindx = mpdCmtindx;
		this.mpdUser1 = mpdUser1;
		this.mpdUser2 = mpdUser2;
		this.mpdChr01 = mpdChr01;
		this.mpdChr02 = mpdChr02;
		this.mpdChr03 = mpdChr03;
		this.mpdChr04 = mpdChr04;
		this.mpdChr05 = mpdChr05;
		this.mpdDec01 = mpdDec01;
		this.mpdDec02 = mpdDec02;
		this.oidMpdDet = oidMpdDet;
	}

	// Property accessors

	public MpdDetId getId() {
		return this.id;
	}

	public void setId(MpdDetId id) {
		this.id = id;
	}

	public String getMpdLabel() {
		return this.mpdLabel;
	}

	public void setMpdLabel(String mpdLabel) {
		this.mpdLabel = mpdLabel;
	}

	public String getMpdTol() {
		return this.mpdTol;
	}

	public void setMpdTol(String mpdTol) {
		this.mpdTol = mpdTol;
	}

	public String getMpdTolType() {
		return this.mpdTolType;
	}

	public void setMpdTolType(String mpdTolType) {
		this.mpdTolType = mpdTolType;
	}

	public Integer getMpdCmtindx() {
		return this.mpdCmtindx;
	}

	public void setMpdCmtindx(Integer mpdCmtindx) {
		this.mpdCmtindx = mpdCmtindx;
	}

	public String getMpdUser1() {
		return this.mpdUser1;
	}

	public void setMpdUser1(String mpdUser1) {
		this.mpdUser1 = mpdUser1;
	}

	public String getMpdUser2() {
		return this.mpdUser2;
	}

	public void setMpdUser2(String mpdUser2) {
		this.mpdUser2 = mpdUser2;
	}

	public String getMpdChr01() {
		return this.mpdChr01;
	}

	public void setMpdChr01(String mpdChr01) {
		this.mpdChr01 = mpdChr01;
	}

	public String getMpdChr02() {
		return this.mpdChr02;
	}

	public void setMpdChr02(String mpdChr02) {
		this.mpdChr02 = mpdChr02;
	}

	public String getMpdChr03() {
		return this.mpdChr03;
	}

	public void setMpdChr03(String mpdChr03) {
		this.mpdChr03 = mpdChr03;
	}

	public String getMpdChr04() {
		return this.mpdChr04;
	}

	public void setMpdChr04(String mpdChr04) {
		this.mpdChr04 = mpdChr04;
	}

	public String getMpdChr05() {
		return this.mpdChr05;
	}

	public void setMpdChr05(String mpdChr05) {
		this.mpdChr05 = mpdChr05;
	}

	public Double getMpdDec01() {
		return this.mpdDec01;
	}

	public void setMpdDec01(Double mpdDec01) {
		this.mpdDec01 = mpdDec01;
	}

	public Double getMpdDec02() {
		return this.mpdDec02;
	}

	public void setMpdDec02(Double mpdDec02) {
		this.mpdDec02 = mpdDec02;
	}

	public Double getOidMpdDet() {
		return this.oidMpdDet;
	}

	public void setOidMpdDet(Double oidMpdDet) {
		this.oidMpdDet = oidMpdDet;
	}

}