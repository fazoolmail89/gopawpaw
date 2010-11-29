package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMndDet entity provides the base persistence definition of the MndDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMndDet implements java.io.Serializable {

	// Fields

	private MndDetId id;
	private String mndLabel;
	private String mndExec;
	private Integer mndFkey;
	private String mndHelp;
	private String mndCanrun;
	private String mndName;
	private String mndUser1;
	private String mndUser2;
	private String mndQadc01;
	private Double oidMndDet;
	private String mndUri;

	// Constructors

	/** default constructor */
	public AbstractMndDet() {
	}

	/** minimal constructor */
	public AbstractMndDet(MndDetId id, String mndLabel, String mndExec,
			String mndCanrun, Double oidMndDet, String mndUri) {
		this.id = id;
		this.mndLabel = mndLabel;
		this.mndExec = mndExec;
		this.mndCanrun = mndCanrun;
		this.oidMndDet = oidMndDet;
		this.mndUri = mndUri;
	}

	/** full constructor */
	public AbstractMndDet(MndDetId id, String mndLabel, String mndExec,
			Integer mndFkey, String mndHelp, String mndCanrun, String mndName,
			String mndUser1, String mndUser2, String mndQadc01,
			Double oidMndDet, String mndUri) {
		this.id = id;
		this.mndLabel = mndLabel;
		this.mndExec = mndExec;
		this.mndFkey = mndFkey;
		this.mndHelp = mndHelp;
		this.mndCanrun = mndCanrun;
		this.mndName = mndName;
		this.mndUser1 = mndUser1;
		this.mndUser2 = mndUser2;
		this.mndQadc01 = mndQadc01;
		this.oidMndDet = oidMndDet;
		this.mndUri = mndUri;
	}

	// Property accessors

	public MndDetId getId() {
		return this.id;
	}

	public void setId(MndDetId id) {
		this.id = id;
	}

	public String getMndLabel() {
		return this.mndLabel;
	}

	public void setMndLabel(String mndLabel) {
		this.mndLabel = mndLabel;
	}

	public String getMndExec() {
		return this.mndExec;
	}

	public void setMndExec(String mndExec) {
		this.mndExec = mndExec;
	}

	public Integer getMndFkey() {
		return this.mndFkey;
	}

	public void setMndFkey(Integer mndFkey) {
		this.mndFkey = mndFkey;
	}

	public String getMndHelp() {
		return this.mndHelp;
	}

	public void setMndHelp(String mndHelp) {
		this.mndHelp = mndHelp;
	}

	public String getMndCanrun() {
		return this.mndCanrun;
	}

	public void setMndCanrun(String mndCanrun) {
		this.mndCanrun = mndCanrun;
	}

	public String getMndName() {
		return this.mndName;
	}

	public void setMndName(String mndName) {
		this.mndName = mndName;
	}

	public String getMndUser1() {
		return this.mndUser1;
	}

	public void setMndUser1(String mndUser1) {
		this.mndUser1 = mndUser1;
	}

	public String getMndUser2() {
		return this.mndUser2;
	}

	public void setMndUser2(String mndUser2) {
		this.mndUser2 = mndUser2;
	}

	public String getMndQadc01() {
		return this.mndQadc01;
	}

	public void setMndQadc01(String mndQadc01) {
		this.mndQadc01 = mndQadc01;
	}

	public Double getOidMndDet() {
		return this.oidMndDet;
	}

	public void setOidMndDet(Double oidMndDet) {
		this.oidMndDet = oidMndDet;
	}

	public String getMndUri() {
		return this.mndUri;
	}

	public void setMndUri(String mndUri) {
		this.mndUri = mndUri;
	}

}