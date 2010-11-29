package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtpDet entity provides the base persistence definition of the AtpDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtpDet implements java.io.Serializable {

	// Fields

	private AtpDetId id;
	private Date atpQad02;
	private Double atpQty;
	private String atpQad03;
	private String atpQad04;
	private String atpQad01;
	private String atpUser1;
	private String atpUser2;
	private Double oidAtpDet;

	// Constructors

	/** default constructor */
	public AbstractAtpDet() {
	}

	/** minimal constructor */
	public AbstractAtpDet(AtpDetId id, Double oidAtpDet) {
		this.id = id;
		this.oidAtpDet = oidAtpDet;
	}

	/** full constructor */
	public AbstractAtpDet(AtpDetId id, Date atpQad02, Double atpQty,
			String atpQad03, String atpQad04, String atpQad01, String atpUser1,
			String atpUser2, Double oidAtpDet) {
		this.id = id;
		this.atpQad02 = atpQad02;
		this.atpQty = atpQty;
		this.atpQad03 = atpQad03;
		this.atpQad04 = atpQad04;
		this.atpQad01 = atpQad01;
		this.atpUser1 = atpUser1;
		this.atpUser2 = atpUser2;
		this.oidAtpDet = oidAtpDet;
	}

	// Property accessors

	public AtpDetId getId() {
		return this.id;
	}

	public void setId(AtpDetId id) {
		this.id = id;
	}

	public Date getAtpQad02() {
		return this.atpQad02;
	}

	public void setAtpQad02(Date atpQad02) {
		this.atpQad02 = atpQad02;
	}

	public Double getAtpQty() {
		return this.atpQty;
	}

	public void setAtpQty(Double atpQty) {
		this.atpQty = atpQty;
	}

	public String getAtpQad03() {
		return this.atpQad03;
	}

	public void setAtpQad03(String atpQad03) {
		this.atpQad03 = atpQad03;
	}

	public String getAtpQad04() {
		return this.atpQad04;
	}

	public void setAtpQad04(String atpQad04) {
		this.atpQad04 = atpQad04;
	}

	public String getAtpQad01() {
		return this.atpQad01;
	}

	public void setAtpQad01(String atpQad01) {
		this.atpQad01 = atpQad01;
	}

	public String getAtpUser1() {
		return this.atpUser1;
	}

	public void setAtpUser1(String atpUser1) {
		this.atpUser1 = atpUser1;
	}

	public String getAtpUser2() {
		return this.atpUser2;
	}

	public void setAtpUser2(String atpUser2) {
		this.atpUser2 = atpUser2;
	}

	public Double getOidAtpDet() {
		return this.oidAtpDet;
	}

	public void setOidAtpDet(Double oidAtpDet) {
		this.oidAtpDet = oidAtpDet;
	}

}