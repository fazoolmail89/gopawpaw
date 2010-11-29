package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFacCtrl entity provides the base persistence definition of the
 * FacCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFacCtrl implements java.io.Serializable {

	// Fields

	private String facDomain;
	private Integer facQadi01;
	private Boolean facSoRec;
	private Boolean facWoRec;
	private Boolean facUnitQty;
	private String facUser1;
	private String facUser2;
	private String facQadc01;
	private Double oidFacCtrl;

	// Constructors

	/** default constructor */
	public AbstractFacCtrl() {
	}

	/** minimal constructor */
	public AbstractFacCtrl(Double oidFacCtrl) {
		this.oidFacCtrl = oidFacCtrl;
	}

	/** full constructor */
	public AbstractFacCtrl(Integer facQadi01, Boolean facSoRec,
			Boolean facWoRec, Boolean facUnitQty, String facUser1,
			String facUser2, String facQadc01, Double oidFacCtrl) {
		this.facQadi01 = facQadi01;
		this.facSoRec = facSoRec;
		this.facWoRec = facWoRec;
		this.facUnitQty = facUnitQty;
		this.facUser1 = facUser1;
		this.facUser2 = facUser2;
		this.facQadc01 = facQadc01;
		this.oidFacCtrl = oidFacCtrl;
	}

	// Property accessors

	public String getFacDomain() {
		return this.facDomain;
	}

	public void setFacDomain(String facDomain) {
		this.facDomain = facDomain;
	}

	public Integer getFacQadi01() {
		return this.facQadi01;
	}

	public void setFacQadi01(Integer facQadi01) {
		this.facQadi01 = facQadi01;
	}

	public Boolean getFacSoRec() {
		return this.facSoRec;
	}

	public void setFacSoRec(Boolean facSoRec) {
		this.facSoRec = facSoRec;
	}

	public Boolean getFacWoRec() {
		return this.facWoRec;
	}

	public void setFacWoRec(Boolean facWoRec) {
		this.facWoRec = facWoRec;
	}

	public Boolean getFacUnitQty() {
		return this.facUnitQty;
	}

	public void setFacUnitQty(Boolean facUnitQty) {
		this.facUnitQty = facUnitQty;
	}

	public String getFacUser1() {
		return this.facUser1;
	}

	public void setFacUser1(String facUser1) {
		this.facUser1 = facUser1;
	}

	public String getFacUser2() {
		return this.facUser2;
	}

	public void setFacUser2(String facUser2) {
		this.facUser2 = facUser2;
	}

	public String getFacQadc01() {
		return this.facQadc01;
	}

	public void setFacQadc01(String facQadc01) {
		this.facQadc01 = facQadc01;
	}

	public Double getOidFacCtrl() {
		return this.oidFacCtrl;
	}

	public void setOidFacCtrl(Double oidFacCtrl) {
		this.oidFacCtrl = oidFacCtrl;
	}

}