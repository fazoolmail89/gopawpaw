package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrqdDet entity provides the base persistence definition of the
 * GrqdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrqdDet implements java.io.Serializable {

	// Fields

	private GrqdDetId id;
	private Integer grqdPerStart;
	private String grqdUser1;
	private String grqdUser2;
	private Integer grqdPerEnd;
	private String grqdQadc01;
	private Double oidGrqdDet;

	// Constructors

	/** default constructor */
	public AbstractGrqdDet() {
	}

	/** minimal constructor */
	public AbstractGrqdDet(GrqdDetId id, Double oidGrqdDet) {
		this.id = id;
		this.oidGrqdDet = oidGrqdDet;
	}

	/** full constructor */
	public AbstractGrqdDet(GrqdDetId id, Integer grqdPerStart,
			String grqdUser1, String grqdUser2, Integer grqdPerEnd,
			String grqdQadc01, Double oidGrqdDet) {
		this.id = id;
		this.grqdPerStart = grqdPerStart;
		this.grqdUser1 = grqdUser1;
		this.grqdUser2 = grqdUser2;
		this.grqdPerEnd = grqdPerEnd;
		this.grqdQadc01 = grqdQadc01;
		this.oidGrqdDet = oidGrqdDet;
	}

	// Property accessors

	public GrqdDetId getId() {
		return this.id;
	}

	public void setId(GrqdDetId id) {
		this.id = id;
	}

	public Integer getGrqdPerStart() {
		return this.grqdPerStart;
	}

	public void setGrqdPerStart(Integer grqdPerStart) {
		this.grqdPerStart = grqdPerStart;
	}

	public String getGrqdUser1() {
		return this.grqdUser1;
	}

	public void setGrqdUser1(String grqdUser1) {
		this.grqdUser1 = grqdUser1;
	}

	public String getGrqdUser2() {
		return this.grqdUser2;
	}

	public void setGrqdUser2(String grqdUser2) {
		this.grqdUser2 = grqdUser2;
	}

	public Integer getGrqdPerEnd() {
		return this.grqdPerEnd;
	}

	public void setGrqdPerEnd(Integer grqdPerEnd) {
		this.grqdPerEnd = grqdPerEnd;
	}

	public String getGrqdQadc01() {
		return this.grqdQadc01;
	}

	public void setGrqdQadc01(String grqdQadc01) {
		this.grqdQadc01 = grqdQadc01;
	}

	public Double getOidGrqdDet() {
		return this.oidGrqdDet;
	}

	public void setOidGrqdDet(Double oidGrqdDet) {
		this.oidGrqdDet = oidGrqdDet;
	}

}