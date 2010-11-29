package com.gopawpaw.erp.hibernate.m;

/**
 * AbstractMntDet entity provides the base persistence definition of the MntDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMntDet implements java.io.Serializable {

	// Fields

	private MntDetId id;
	private String mntLabel;
	private String mntUser1;
	private String mntUser2;
	private String mntQadc01;
	private Double oidMntDet;

	// Constructors

	/** default constructor */
	public AbstractMntDet() {
	}

	/** minimal constructor */
	public AbstractMntDet(MntDetId id, Double oidMntDet) {
		this.id = id;
		this.oidMntDet = oidMntDet;
	}

	/** full constructor */
	public AbstractMntDet(MntDetId id, String mntLabel, String mntUser1,
			String mntUser2, String mntQadc01, Double oidMntDet) {
		this.id = id;
		this.mntLabel = mntLabel;
		this.mntUser1 = mntUser1;
		this.mntUser2 = mntUser2;
		this.mntQadc01 = mntQadc01;
		this.oidMntDet = oidMntDet;
	}

	// Property accessors

	public MntDetId getId() {
		return this.id;
	}

	public void setId(MntDetId id) {
		this.id = id;
	}

	public String getMntLabel() {
		return this.mntLabel;
	}

	public void setMntLabel(String mntLabel) {
		this.mntLabel = mntLabel;
	}

	public String getMntUser1() {
		return this.mntUser1;
	}

	public void setMntUser1(String mntUser1) {
		this.mntUser1 = mntUser1;
	}

	public String getMntUser2() {
		return this.mntUser2;
	}

	public void setMntUser2(String mntUser2) {
		this.mntUser2 = mntUser2;
	}

	public String getMntQadc01() {
		return this.mntQadc01;
	}

	public void setMntQadc01(String mntQadc01) {
		this.mntQadc01 = mntQadc01;
	}

	public Double getOidMntDet() {
		return this.oidMntDet;
	}

	public void setOidMntDet(Double oidMntDet) {
		this.oidMntDet = oidMntDet;
	}

}