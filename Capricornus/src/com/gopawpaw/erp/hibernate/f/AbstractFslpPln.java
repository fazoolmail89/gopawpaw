package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFslpPln entity provides the base persistence definition of the
 * FslpPln entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFslpPln implements java.io.Serializable {

	// Fields

	private FslpPlnId id;
	private String fslpProdFcst;
	private String fslpProdAct;
	private String fslpUser1;
	private String fslpUser2;
	private Double fslpDec01;
	private Double fslpDec02;
	private String fslpDec03;
	private String fslpDec04;
	private Double oidFslpPln;

	// Constructors

	/** default constructor */
	public AbstractFslpPln() {
	}

	/** minimal constructor */
	public AbstractFslpPln(FslpPlnId id, Double oidFslpPln) {
		this.id = id;
		this.oidFslpPln = oidFslpPln;
	}

	/** full constructor */
	public AbstractFslpPln(FslpPlnId id, String fslpProdFcst,
			String fslpProdAct, String fslpUser1, String fslpUser2,
			Double fslpDec01, Double fslpDec02, String fslpDec03,
			String fslpDec04, Double oidFslpPln) {
		this.id = id;
		this.fslpProdFcst = fslpProdFcst;
		this.fslpProdAct = fslpProdAct;
		this.fslpUser1 = fslpUser1;
		this.fslpUser2 = fslpUser2;
		this.fslpDec01 = fslpDec01;
		this.fslpDec02 = fslpDec02;
		this.fslpDec03 = fslpDec03;
		this.fslpDec04 = fslpDec04;
		this.oidFslpPln = oidFslpPln;
	}

	// Property accessors

	public FslpPlnId getId() {
		return this.id;
	}

	public void setId(FslpPlnId id) {
		this.id = id;
	}

	public String getFslpProdFcst() {
		return this.fslpProdFcst;
	}

	public void setFslpProdFcst(String fslpProdFcst) {
		this.fslpProdFcst = fslpProdFcst;
	}

	public String getFslpProdAct() {
		return this.fslpProdAct;
	}

	public void setFslpProdAct(String fslpProdAct) {
		this.fslpProdAct = fslpProdAct;
	}

	public String getFslpUser1() {
		return this.fslpUser1;
	}

	public void setFslpUser1(String fslpUser1) {
		this.fslpUser1 = fslpUser1;
	}

	public String getFslpUser2() {
		return this.fslpUser2;
	}

	public void setFslpUser2(String fslpUser2) {
		this.fslpUser2 = fslpUser2;
	}

	public Double getFslpDec01() {
		return this.fslpDec01;
	}

	public void setFslpDec01(Double fslpDec01) {
		this.fslpDec01 = fslpDec01;
	}

	public Double getFslpDec02() {
		return this.fslpDec02;
	}

	public void setFslpDec02(Double fslpDec02) {
		this.fslpDec02 = fslpDec02;
	}

	public String getFslpDec03() {
		return this.fslpDec03;
	}

	public void setFslpDec03(String fslpDec03) {
		this.fslpDec03 = fslpDec03;
	}

	public String getFslpDec04() {
		return this.fslpDec04;
	}

	public void setFslpDec04(String fslpDec04) {
		this.fslpDec04 = fslpDec04;
	}

	public Double getOidFslpPln() {
		return this.oidFslpPln;
	}

	public void setOidFslpPln(Double oidFslpPln) {
		this.oidFslpPln = oidFslpPln;
	}

}