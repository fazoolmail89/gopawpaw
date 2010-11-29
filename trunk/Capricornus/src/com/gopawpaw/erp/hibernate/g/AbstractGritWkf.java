package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGritWkf entity provides the base persistence definition of the
 * GritWkf entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGritWkf implements java.io.Serializable {

	// Fields

	private GritWkfId id;
	private String gritDesc;
	private String gritMarker;
	private String gritGlType;
	private String gritAnCode;
	private String gritUser1;
	private String gritUser2;
	private String gritQadc01;
	private Double oidGritWkf;

	// Constructors

	/** default constructor */
	public AbstractGritWkf() {
	}

	/** minimal constructor */
	public AbstractGritWkf(GritWkfId id, Double oidGritWkf) {
		this.id = id;
		this.oidGritWkf = oidGritWkf;
	}

	/** full constructor */
	public AbstractGritWkf(GritWkfId id, String gritDesc, String gritMarker,
			String gritGlType, String gritAnCode, String gritUser1,
			String gritUser2, String gritQadc01, Double oidGritWkf) {
		this.id = id;
		this.gritDesc = gritDesc;
		this.gritMarker = gritMarker;
		this.gritGlType = gritGlType;
		this.gritAnCode = gritAnCode;
		this.gritUser1 = gritUser1;
		this.gritUser2 = gritUser2;
		this.gritQadc01 = gritQadc01;
		this.oidGritWkf = oidGritWkf;
	}

	// Property accessors

	public GritWkfId getId() {
		return this.id;
	}

	public void setId(GritWkfId id) {
		this.id = id;
	}

	public String getGritDesc() {
		return this.gritDesc;
	}

	public void setGritDesc(String gritDesc) {
		this.gritDesc = gritDesc;
	}

	public String getGritMarker() {
		return this.gritMarker;
	}

	public void setGritMarker(String gritMarker) {
		this.gritMarker = gritMarker;
	}

	public String getGritGlType() {
		return this.gritGlType;
	}

	public void setGritGlType(String gritGlType) {
		this.gritGlType = gritGlType;
	}

	public String getGritAnCode() {
		return this.gritAnCode;
	}

	public void setGritAnCode(String gritAnCode) {
		this.gritAnCode = gritAnCode;
	}

	public String getGritUser1() {
		return this.gritUser1;
	}

	public void setGritUser1(String gritUser1) {
		this.gritUser1 = gritUser1;
	}

	public String getGritUser2() {
		return this.gritUser2;
	}

	public void setGritUser2(String gritUser2) {
		this.gritUser2 = gritUser2;
	}

	public String getGritQadc01() {
		return this.gritQadc01;
	}

	public void setGritQadc01(String gritQadc01) {
		this.gritQadc01 = gritQadc01;
	}

	public Double getOidGritWkf() {
		return this.oidGritWkf;
	}

	public void setOidGritWkf(Double oidGritWkf) {
		this.oidGritWkf = oidGritWkf;
	}

}