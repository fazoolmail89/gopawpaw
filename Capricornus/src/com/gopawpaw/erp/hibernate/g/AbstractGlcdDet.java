package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlcdDet entity provides the base persistence definition of the
 * GlcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlcdDet implements java.io.Serializable {

	// Fields

	private GlcdDetId id;
	private Boolean glcdGlClsd;
	private Boolean glcdClosed;
	private Boolean glcdYrClsd;
	private String glcdUser1;
	private String glcdUser2;
	private String glcdQadc01;
	private Double oidGlcdDet;

	// Constructors

	/** default constructor */
	public AbstractGlcdDet() {
	}

	/** minimal constructor */
	public AbstractGlcdDet(GlcdDetId id, Double oidGlcdDet) {
		this.id = id;
		this.oidGlcdDet = oidGlcdDet;
	}

	/** full constructor */
	public AbstractGlcdDet(GlcdDetId id, Boolean glcdGlClsd,
			Boolean glcdClosed, Boolean glcdYrClsd, String glcdUser1,
			String glcdUser2, String glcdQadc01, Double oidGlcdDet) {
		this.id = id;
		this.glcdGlClsd = glcdGlClsd;
		this.glcdClosed = glcdClosed;
		this.glcdYrClsd = glcdYrClsd;
		this.glcdUser1 = glcdUser1;
		this.glcdUser2 = glcdUser2;
		this.glcdQadc01 = glcdQadc01;
		this.oidGlcdDet = oidGlcdDet;
	}

	// Property accessors

	public GlcdDetId getId() {
		return this.id;
	}

	public void setId(GlcdDetId id) {
		this.id = id;
	}

	public Boolean getGlcdGlClsd() {
		return this.glcdGlClsd;
	}

	public void setGlcdGlClsd(Boolean glcdGlClsd) {
		this.glcdGlClsd = glcdGlClsd;
	}

	public Boolean getGlcdClosed() {
		return this.glcdClosed;
	}

	public void setGlcdClosed(Boolean glcdClosed) {
		this.glcdClosed = glcdClosed;
	}

	public Boolean getGlcdYrClsd() {
		return this.glcdYrClsd;
	}

	public void setGlcdYrClsd(Boolean glcdYrClsd) {
		this.glcdYrClsd = glcdYrClsd;
	}

	public String getGlcdUser1() {
		return this.glcdUser1;
	}

	public void setGlcdUser1(String glcdUser1) {
		this.glcdUser1 = glcdUser1;
	}

	public String getGlcdUser2() {
		return this.glcdUser2;
	}

	public void setGlcdUser2(String glcdUser2) {
		this.glcdUser2 = glcdUser2;
	}

	public String getGlcdQadc01() {
		return this.glcdQadc01;
	}

	public void setGlcdQadc01(String glcdQadc01) {
		this.glcdQadc01 = glcdQadc01;
	}

	public Double getOidGlcdDet() {
		return this.oidGlcdDet;
	}

	public void setOidGlcdDet(Double oidGlcdDet) {
		this.oidGlcdDet = oidGlcdDet;
	}

}