package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCtdDet entity provides the base persistence definition of the CtdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCtdDet implements java.io.Serializable {

	// Fields

	private CtdDetId id;
	private String ctdDateCd;
	private Double ctdPctDue;
	private String ctdUser1;
	private String ctdUser2;
	private String ctdQadc01;
	private Double oidCtdDet;

	// Constructors

	/** default constructor */
	public AbstractCtdDet() {
	}

	/** minimal constructor */
	public AbstractCtdDet(CtdDetId id, Double oidCtdDet) {
		this.id = id;
		this.oidCtdDet = oidCtdDet;
	}

	/** full constructor */
	public AbstractCtdDet(CtdDetId id, String ctdDateCd, Double ctdPctDue,
			String ctdUser1, String ctdUser2, String ctdQadc01, Double oidCtdDet) {
		this.id = id;
		this.ctdDateCd = ctdDateCd;
		this.ctdPctDue = ctdPctDue;
		this.ctdUser1 = ctdUser1;
		this.ctdUser2 = ctdUser2;
		this.ctdQadc01 = ctdQadc01;
		this.oidCtdDet = oidCtdDet;
	}

	// Property accessors

	public CtdDetId getId() {
		return this.id;
	}

	public void setId(CtdDetId id) {
		this.id = id;
	}

	public String getCtdDateCd() {
		return this.ctdDateCd;
	}

	public void setCtdDateCd(String ctdDateCd) {
		this.ctdDateCd = ctdDateCd;
	}

	public Double getCtdPctDue() {
		return this.ctdPctDue;
	}

	public void setCtdPctDue(Double ctdPctDue) {
		this.ctdPctDue = ctdPctDue;
	}

	public String getCtdUser1() {
		return this.ctdUser1;
	}

	public void setCtdUser1(String ctdUser1) {
		this.ctdUser1 = ctdUser1;
	}

	public String getCtdUser2() {
		return this.ctdUser2;
	}

	public void setCtdUser2(String ctdUser2) {
		this.ctdUser2 = ctdUser2;
	}

	public String getCtdQadc01() {
		return this.ctdQadc01;
	}

	public void setCtdQadc01(String ctdQadc01) {
		this.ctdQadc01 = ctdQadc01;
	}

	public Double getOidCtdDet() {
		return this.oidCtdDet;
	}

	public void setOidCtdDet(Double oidCtdDet) {
		this.oidCtdDet = oidCtdDet;
	}

}