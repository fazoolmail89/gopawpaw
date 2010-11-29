package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPcdDet entity provides the base persistence definition of the PcdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPcdDet implements java.io.Serializable {

	// Fields

	private PcdDetId id;
	private Date pcdQad01;
	private String pcdUser1;
	private String pcdUser2;
	private Boolean pcdQad03;
	private String pcdQad02;
	private Double pcdQad04;
	private String pcdCurr;
	private Double pcdAmt;
	private Double pcdQad05;
	private Double oidPcdDet;

	// Constructors

	/** default constructor */
	public AbstractPcdDet() {
	}

	/** minimal constructor */
	public AbstractPcdDet(PcdDetId id, Double oidPcdDet) {
		this.id = id;
		this.oidPcdDet = oidPcdDet;
	}

	/** full constructor */
	public AbstractPcdDet(PcdDetId id, Date pcdQad01, String pcdUser1,
			String pcdUser2, Boolean pcdQad03, String pcdQad02,
			Double pcdQad04, String pcdCurr, Double pcdAmt, Double pcdQad05,
			Double oidPcdDet) {
		this.id = id;
		this.pcdQad01 = pcdQad01;
		this.pcdUser1 = pcdUser1;
		this.pcdUser2 = pcdUser2;
		this.pcdQad03 = pcdQad03;
		this.pcdQad02 = pcdQad02;
		this.pcdQad04 = pcdQad04;
		this.pcdCurr = pcdCurr;
		this.pcdAmt = pcdAmt;
		this.pcdQad05 = pcdQad05;
		this.oidPcdDet = oidPcdDet;
	}

	// Property accessors

	public PcdDetId getId() {
		return this.id;
	}

	public void setId(PcdDetId id) {
		this.id = id;
	}

	public Date getPcdQad01() {
		return this.pcdQad01;
	}

	public void setPcdQad01(Date pcdQad01) {
		this.pcdQad01 = pcdQad01;
	}

	public String getPcdUser1() {
		return this.pcdUser1;
	}

	public void setPcdUser1(String pcdUser1) {
		this.pcdUser1 = pcdUser1;
	}

	public String getPcdUser2() {
		return this.pcdUser2;
	}

	public void setPcdUser2(String pcdUser2) {
		this.pcdUser2 = pcdUser2;
	}

	public Boolean getPcdQad03() {
		return this.pcdQad03;
	}

	public void setPcdQad03(Boolean pcdQad03) {
		this.pcdQad03 = pcdQad03;
	}

	public String getPcdQad02() {
		return this.pcdQad02;
	}

	public void setPcdQad02(String pcdQad02) {
		this.pcdQad02 = pcdQad02;
	}

	public Double getPcdQad04() {
		return this.pcdQad04;
	}

	public void setPcdQad04(Double pcdQad04) {
		this.pcdQad04 = pcdQad04;
	}

	public String getPcdCurr() {
		return this.pcdCurr;
	}

	public void setPcdCurr(String pcdCurr) {
		this.pcdCurr = pcdCurr;
	}

	public Double getPcdAmt() {
		return this.pcdAmt;
	}

	public void setPcdAmt(Double pcdAmt) {
		this.pcdAmt = pcdAmt;
	}

	public Double getPcdQad05() {
		return this.pcdQad05;
	}

	public void setPcdQad05(Double pcdQad05) {
		this.pcdQad05 = pcdQad05;
	}

	public Double getOidPcdDet() {
		return this.oidPcdDet;
	}

	public void setOidPcdDet(Double oidPcdDet) {
		this.oidPcdDet = oidPcdDet;
	}

}