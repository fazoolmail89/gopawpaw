package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAnxDet entity provides the base persistence definition of the AnxDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAnxDet implements java.io.Serializable {

	// Fields

	private AnxDetId id;
	private Boolean anxActive;
	private String anxUser1;
	private String anxUser2;
	private String anxQadc01;
	private Double anxQadd01;
	private Double oidAnxDet;

	// Constructors

	/** default constructor */
	public AbstractAnxDet() {
	}

	/** minimal constructor */
	public AbstractAnxDet(AnxDetId id, Double oidAnxDet) {
		this.id = id;
		this.oidAnxDet = oidAnxDet;
	}

	/** full constructor */
	public AbstractAnxDet(AnxDetId id, Boolean anxActive, String anxUser1,
			String anxUser2, String anxQadc01, Double anxQadd01,
			Double oidAnxDet) {
		this.id = id;
		this.anxActive = anxActive;
		this.anxUser1 = anxUser1;
		this.anxUser2 = anxUser2;
		this.anxQadc01 = anxQadc01;
		this.anxQadd01 = anxQadd01;
		this.oidAnxDet = oidAnxDet;
	}

	// Property accessors

	public AnxDetId getId() {
		return this.id;
	}

	public void setId(AnxDetId id) {
		this.id = id;
	}

	public Boolean getAnxActive() {
		return this.anxActive;
	}

	public void setAnxActive(Boolean anxActive) {
		this.anxActive = anxActive;
	}

	public String getAnxUser1() {
		return this.anxUser1;
	}

	public void setAnxUser1(String anxUser1) {
		this.anxUser1 = anxUser1;
	}

	public String getAnxUser2() {
		return this.anxUser2;
	}

	public void setAnxUser2(String anxUser2) {
		this.anxUser2 = anxUser2;
	}

	public String getAnxQadc01() {
		return this.anxQadc01;
	}

	public void setAnxQadc01(String anxQadc01) {
		this.anxQadc01 = anxQadc01;
	}

	public Double getAnxQadd01() {
		return this.anxQadd01;
	}

	public void setAnxQadd01(Double anxQadd01) {
		this.anxQadd01 = anxQadd01;
	}

	public Double getOidAnxDet() {
		return this.oidAnxDet;
	}

	public void setOidAnxDet(Double oidAnxDet) {
		this.oidAnxDet = oidAnxDet;
	}

}