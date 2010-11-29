package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPltDet entity provides the base persistence definition of the PltDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPltDet implements java.io.Serializable {

	// Fields

	private PltDetId id;
	private String pltTaxc;
	private Boolean pltTaxable;
	private String pltUser1;
	private String pltUser2;
	private String pltUserid;
	private Date pltModDate;
	private String pltQadc01;
	private Double oidPltDet;

	// Constructors

	/** default constructor */
	public AbstractPltDet() {
	}

	/** minimal constructor */
	public AbstractPltDet(PltDetId id, Double oidPltDet) {
		this.id = id;
		this.oidPltDet = oidPltDet;
	}

	/** full constructor */
	public AbstractPltDet(PltDetId id, String pltTaxc, Boolean pltTaxable,
			String pltUser1, String pltUser2, String pltUserid,
			Date pltModDate, String pltQadc01, Double oidPltDet) {
		this.id = id;
		this.pltTaxc = pltTaxc;
		this.pltTaxable = pltTaxable;
		this.pltUser1 = pltUser1;
		this.pltUser2 = pltUser2;
		this.pltUserid = pltUserid;
		this.pltModDate = pltModDate;
		this.pltQadc01 = pltQadc01;
		this.oidPltDet = oidPltDet;
	}

	// Property accessors

	public PltDetId getId() {
		return this.id;
	}

	public void setId(PltDetId id) {
		this.id = id;
	}

	public String getPltTaxc() {
		return this.pltTaxc;
	}

	public void setPltTaxc(String pltTaxc) {
		this.pltTaxc = pltTaxc;
	}

	public Boolean getPltTaxable() {
		return this.pltTaxable;
	}

	public void setPltTaxable(Boolean pltTaxable) {
		this.pltTaxable = pltTaxable;
	}

	public String getPltUser1() {
		return this.pltUser1;
	}

	public void setPltUser1(String pltUser1) {
		this.pltUser1 = pltUser1;
	}

	public String getPltUser2() {
		return this.pltUser2;
	}

	public void setPltUser2(String pltUser2) {
		this.pltUser2 = pltUser2;
	}

	public String getPltUserid() {
		return this.pltUserid;
	}

	public void setPltUserid(String pltUserid) {
		this.pltUserid = pltUserid;
	}

	public Date getPltModDate() {
		return this.pltModDate;
	}

	public void setPltModDate(Date pltModDate) {
		this.pltModDate = pltModDate;
	}

	public String getPltQadc01() {
		return this.pltQadc01;
	}

	public void setPltQadc01(String pltQadc01) {
		this.pltQadc01 = pltQadc01;
	}

	public Double getOidPltDet() {
		return this.oidPltDet;
	}

	public void setOidPltDet(Double oidPltDet) {
		this.oidPltDet = oidPltDet;
	}

}