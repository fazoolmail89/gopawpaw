package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrtxDet entity provides the base persistence definition of the
 * GrtxDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrtxDet implements java.io.Serializable {

	// Fields

	private GrtxDetId id;
	private String grtxText;
	private String grtxUser1;
	private String grtxUser2;
	private String grtxFmtTxt;
	private String grtxQadc01;
	private Double oidGrtxDet;

	// Constructors

	/** default constructor */
	public AbstractGrtxDet() {
	}

	/** minimal constructor */
	public AbstractGrtxDet(GrtxDetId id, Double oidGrtxDet) {
		this.id = id;
		this.oidGrtxDet = oidGrtxDet;
	}

	/** full constructor */
	public AbstractGrtxDet(GrtxDetId id, String grtxText, String grtxUser1,
			String grtxUser2, String grtxFmtTxt, String grtxQadc01,
			Double oidGrtxDet) {
		this.id = id;
		this.grtxText = grtxText;
		this.grtxUser1 = grtxUser1;
		this.grtxUser2 = grtxUser2;
		this.grtxFmtTxt = grtxFmtTxt;
		this.grtxQadc01 = grtxQadc01;
		this.oidGrtxDet = oidGrtxDet;
	}

	// Property accessors

	public GrtxDetId getId() {
		return this.id;
	}

	public void setId(GrtxDetId id) {
		this.id = id;
	}

	public String getGrtxText() {
		return this.grtxText;
	}

	public void setGrtxText(String grtxText) {
		this.grtxText = grtxText;
	}

	public String getGrtxUser1() {
		return this.grtxUser1;
	}

	public void setGrtxUser1(String grtxUser1) {
		this.grtxUser1 = grtxUser1;
	}

	public String getGrtxUser2() {
		return this.grtxUser2;
	}

	public void setGrtxUser2(String grtxUser2) {
		this.grtxUser2 = grtxUser2;
	}

	public String getGrtxFmtTxt() {
		return this.grtxFmtTxt;
	}

	public void setGrtxFmtTxt(String grtxFmtTxt) {
		this.grtxFmtTxt = grtxFmtTxt;
	}

	public String getGrtxQadc01() {
		return this.grtxQadc01;
	}

	public void setGrtxQadc01(String grtxQadc01) {
		this.grtxQadc01 = grtxQadc01;
	}

	public Double getOidGrtxDet() {
		return this.oidGrtxDet;
	}

	public void setOidGrtxDet(Double oidGrtxDet) {
		this.oidGrtxDet = oidGrtxDet;
	}

}