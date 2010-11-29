package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractSbdDet entity provides the base persistence definition of the SbdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSbdDet implements java.io.Serializable {

	// Fields

	private SbdDetId id;
	private String sbdAccBeg;
	private String sbdAccEnd;
	private String sbdUser1;
	private String sbdUser2;
	private String sbdQadc01;
	private Double oidSbdDet;

	// Constructors

	/** default constructor */
	public AbstractSbdDet() {
	}

	/** minimal constructor */
	public AbstractSbdDet(SbdDetId id, Double oidSbdDet) {
		this.id = id;
		this.oidSbdDet = oidSbdDet;
	}

	/** full constructor */
	public AbstractSbdDet(SbdDetId id, String sbdAccBeg, String sbdAccEnd,
			String sbdUser1, String sbdUser2, String sbdQadc01, Double oidSbdDet) {
		this.id = id;
		this.sbdAccBeg = sbdAccBeg;
		this.sbdAccEnd = sbdAccEnd;
		this.sbdUser1 = sbdUser1;
		this.sbdUser2 = sbdUser2;
		this.sbdQadc01 = sbdQadc01;
		this.oidSbdDet = oidSbdDet;
	}

	// Property accessors

	public SbdDetId getId() {
		return this.id;
	}

	public void setId(SbdDetId id) {
		this.id = id;
	}

	public String getSbdAccBeg() {
		return this.sbdAccBeg;
	}

	public void setSbdAccBeg(String sbdAccBeg) {
		this.sbdAccBeg = sbdAccBeg;
	}

	public String getSbdAccEnd() {
		return this.sbdAccEnd;
	}

	public void setSbdAccEnd(String sbdAccEnd) {
		this.sbdAccEnd = sbdAccEnd;
	}

	public String getSbdUser1() {
		return this.sbdUser1;
	}

	public void setSbdUser1(String sbdUser1) {
		this.sbdUser1 = sbdUser1;
	}

	public String getSbdUser2() {
		return this.sbdUser2;
	}

	public void setSbdUser2(String sbdUser2) {
		this.sbdUser2 = sbdUser2;
	}

	public String getSbdQadc01() {
		return this.sbdQadc01;
	}

	public void setSbdQadc01(String sbdQadc01) {
		this.sbdQadc01 = sbdQadc01;
	}

	public Double getOidSbdDet() {
		return this.oidSbdDet;
	}

	public void setOidSbdDet(Double oidSbdDet) {
		this.oidSbdDet = oidSbdDet;
	}

}