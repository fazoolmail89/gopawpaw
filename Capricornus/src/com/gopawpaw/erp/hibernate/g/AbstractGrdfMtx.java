package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrdfMtx entity provides the base persistence definition of the
 * GrdfMtx entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrdfMtx implements java.io.Serializable {

	// Fields

	private GrdfMtxId id;
	private String grdfFormat;
	private String grdfRound;
	private Boolean grdfReverse;
	private String grdfFormula;
	private Boolean grdfPrint;
	private String grdfUser1;
	private String grdfUser2;
	private String grdfQadc01;
	private Double oidGrdfMtx;

	// Constructors

	/** default constructor */
	public AbstractGrdfMtx() {
	}

	/** minimal constructor */
	public AbstractGrdfMtx(GrdfMtxId id, Double oidGrdfMtx) {
		this.id = id;
		this.oidGrdfMtx = oidGrdfMtx;
	}

	/** full constructor */
	public AbstractGrdfMtx(GrdfMtxId id, String grdfFormat, String grdfRound,
			Boolean grdfReverse, String grdfFormula, Boolean grdfPrint,
			String grdfUser1, String grdfUser2, String grdfQadc01,
			Double oidGrdfMtx) {
		this.id = id;
		this.grdfFormat = grdfFormat;
		this.grdfRound = grdfRound;
		this.grdfReverse = grdfReverse;
		this.grdfFormula = grdfFormula;
		this.grdfPrint = grdfPrint;
		this.grdfUser1 = grdfUser1;
		this.grdfUser2 = grdfUser2;
		this.grdfQadc01 = grdfQadc01;
		this.oidGrdfMtx = oidGrdfMtx;
	}

	// Property accessors

	public GrdfMtxId getId() {
		return this.id;
	}

	public void setId(GrdfMtxId id) {
		this.id = id;
	}

	public String getGrdfFormat() {
		return this.grdfFormat;
	}

	public void setGrdfFormat(String grdfFormat) {
		this.grdfFormat = grdfFormat;
	}

	public String getGrdfRound() {
		return this.grdfRound;
	}

	public void setGrdfRound(String grdfRound) {
		this.grdfRound = grdfRound;
	}

	public Boolean getGrdfReverse() {
		return this.grdfReverse;
	}

	public void setGrdfReverse(Boolean grdfReverse) {
		this.grdfReverse = grdfReverse;
	}

	public String getGrdfFormula() {
		return this.grdfFormula;
	}

	public void setGrdfFormula(String grdfFormula) {
		this.grdfFormula = grdfFormula;
	}

	public Boolean getGrdfPrint() {
		return this.grdfPrint;
	}

	public void setGrdfPrint(Boolean grdfPrint) {
		this.grdfPrint = grdfPrint;
	}

	public String getGrdfUser1() {
		return this.grdfUser1;
	}

	public void setGrdfUser1(String grdfUser1) {
		this.grdfUser1 = grdfUser1;
	}

	public String getGrdfUser2() {
		return this.grdfUser2;
	}

	public void setGrdfUser2(String grdfUser2) {
		this.grdfUser2 = grdfUser2;
	}

	public String getGrdfQadc01() {
		return this.grdfQadc01;
	}

	public void setGrdfQadc01(String grdfQadc01) {
		this.grdfQadc01 = grdfQadc01;
	}

	public Double getOidGrdfMtx() {
		return this.oidGrdfMtx;
	}

	public void setOidGrdfMtx(Double oidGrdfMtx) {
		this.oidGrdfMtx = oidGrdfMtx;
	}

}