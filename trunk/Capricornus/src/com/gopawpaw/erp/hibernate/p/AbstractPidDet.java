package com.gopawpaw.erp.hibernate.p;

/**
 * AbstractPidDet entity provides the base persistence definition of the PidDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPidDet implements java.io.Serializable {

	// Fields

	private PidDetId id;
	private Double pidAmt;
	private String pidFrTerms;
	private String pidCrTerms;
	private String pidFrList;
	private String pidUser1;
	private String pidUser2;
	private String pidQadc01;
	private Double pidQadd01;
	private Double oidPidDet;

	// Constructors

	/** default constructor */
	public AbstractPidDet() {
	}

	/** minimal constructor */
	public AbstractPidDet(PidDetId id, Double oidPidDet) {
		this.id = id;
		this.oidPidDet = oidPidDet;
	}

	/** full constructor */
	public AbstractPidDet(PidDetId id, Double pidAmt, String pidFrTerms,
			String pidCrTerms, String pidFrList, String pidUser1,
			String pidUser2, String pidQadc01, Double pidQadd01,
			Double oidPidDet) {
		this.id = id;
		this.pidAmt = pidAmt;
		this.pidFrTerms = pidFrTerms;
		this.pidCrTerms = pidCrTerms;
		this.pidFrList = pidFrList;
		this.pidUser1 = pidUser1;
		this.pidUser2 = pidUser2;
		this.pidQadc01 = pidQadc01;
		this.pidQadd01 = pidQadd01;
		this.oidPidDet = oidPidDet;
	}

	// Property accessors

	public PidDetId getId() {
		return this.id;
	}

	public void setId(PidDetId id) {
		this.id = id;
	}

	public Double getPidAmt() {
		return this.pidAmt;
	}

	public void setPidAmt(Double pidAmt) {
		this.pidAmt = pidAmt;
	}

	public String getPidFrTerms() {
		return this.pidFrTerms;
	}

	public void setPidFrTerms(String pidFrTerms) {
		this.pidFrTerms = pidFrTerms;
	}

	public String getPidCrTerms() {
		return this.pidCrTerms;
	}

	public void setPidCrTerms(String pidCrTerms) {
		this.pidCrTerms = pidCrTerms;
	}

	public String getPidFrList() {
		return this.pidFrList;
	}

	public void setPidFrList(String pidFrList) {
		this.pidFrList = pidFrList;
	}

	public String getPidUser1() {
		return this.pidUser1;
	}

	public void setPidUser1(String pidUser1) {
		this.pidUser1 = pidUser1;
	}

	public String getPidUser2() {
		return this.pidUser2;
	}

	public void setPidUser2(String pidUser2) {
		this.pidUser2 = pidUser2;
	}

	public String getPidQadc01() {
		return this.pidQadc01;
	}

	public void setPidQadc01(String pidQadc01) {
		this.pidQadc01 = pidQadc01;
	}

	public Double getPidQadd01() {
		return this.pidQadd01;
	}

	public void setPidQadd01(Double pidQadd01) {
		this.pidQadd01 = pidQadd01;
	}

	public Double getOidPidDet() {
		return this.oidPidDet;
	}

	public void setOidPidDet(Double oidPidDet) {
		this.oidPidDet = oidPidDet;
	}

}