package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGralDet entity provides the base persistence definition of the
 * GralDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGralDet implements java.io.Serializable {

	// Fields

	private GralDetId id;
	private String gralUser1;
	private String gralUser2;
	private String gralQadc01;
	private Double oidGralDet;

	// Constructors

	/** default constructor */
	public AbstractGralDet() {
	}

	/** minimal constructor */
	public AbstractGralDet(GralDetId id, Double oidGralDet) {
		this.id = id;
		this.oidGralDet = oidGralDet;
	}

	/** full constructor */
	public AbstractGralDet(GralDetId id, String gralUser1, String gralUser2,
			String gralQadc01, Double oidGralDet) {
		this.id = id;
		this.gralUser1 = gralUser1;
		this.gralUser2 = gralUser2;
		this.gralQadc01 = gralQadc01;
		this.oidGralDet = oidGralDet;
	}

	// Property accessors

	public GralDetId getId() {
		return this.id;
	}

	public void setId(GralDetId id) {
		this.id = id;
	}

	public String getGralUser1() {
		return this.gralUser1;
	}

	public void setGralUser1(String gralUser1) {
		this.gralUser1 = gralUser1;
	}

	public String getGralUser2() {
		return this.gralUser2;
	}

	public void setGralUser2(String gralUser2) {
		this.gralUser2 = gralUser2;
	}

	public String getGralQadc01() {
		return this.gralQadc01;
	}

	public void setGralQadc01(String gralQadc01) {
		this.gralQadc01 = gralQadc01;
	}

	public Double getOidGralDet() {
		return this.oidGralDet;
	}

	public void setOidGralDet(Double oidGralDet) {
		this.oidGralDet = oidGralDet;
	}

}