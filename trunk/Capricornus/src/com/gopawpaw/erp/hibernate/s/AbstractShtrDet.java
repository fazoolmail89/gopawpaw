package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShtrDet entity provides the base persistence definition of the
 * ShtrDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShtrDet implements java.io.Serializable {

	// Fields

	private ShtrDetId id;
	private String shtrCurr;
	private String shtrInvNbr;
	private Date shtrShipDate;
	private String shtrSite;
	private Double shtrAmt;
	private Double shtrQad01;
	private Double shtrQad02;
	private Double shtrQad03;
	private Integer shtrQad04;
	private String shtrQad05;
	private String shtrUser1;
	private String shtrUser2;
	private Double oidShtrDet;

	// Constructors

	/** default constructor */
	public AbstractShtrDet() {
	}

	/** minimal constructor */
	public AbstractShtrDet(ShtrDetId id, Double oidShtrDet) {
		this.id = id;
		this.oidShtrDet = oidShtrDet;
	}

	/** full constructor */
	public AbstractShtrDet(ShtrDetId id, String shtrCurr, String shtrInvNbr,
			Date shtrShipDate, String shtrSite, Double shtrAmt,
			Double shtrQad01, Double shtrQad02, Double shtrQad03,
			Integer shtrQad04, String shtrQad05, String shtrUser1,
			String shtrUser2, Double oidShtrDet) {
		this.id = id;
		this.shtrCurr = shtrCurr;
		this.shtrInvNbr = shtrInvNbr;
		this.shtrShipDate = shtrShipDate;
		this.shtrSite = shtrSite;
		this.shtrAmt = shtrAmt;
		this.shtrQad01 = shtrQad01;
		this.shtrQad02 = shtrQad02;
		this.shtrQad03 = shtrQad03;
		this.shtrQad04 = shtrQad04;
		this.shtrQad05 = shtrQad05;
		this.shtrUser1 = shtrUser1;
		this.shtrUser2 = shtrUser2;
		this.oidShtrDet = oidShtrDet;
	}

	// Property accessors

	public ShtrDetId getId() {
		return this.id;
	}

	public void setId(ShtrDetId id) {
		this.id = id;
	}

	public String getShtrCurr() {
		return this.shtrCurr;
	}

	public void setShtrCurr(String shtrCurr) {
		this.shtrCurr = shtrCurr;
	}

	public String getShtrInvNbr() {
		return this.shtrInvNbr;
	}

	public void setShtrInvNbr(String shtrInvNbr) {
		this.shtrInvNbr = shtrInvNbr;
	}

	public Date getShtrShipDate() {
		return this.shtrShipDate;
	}

	public void setShtrShipDate(Date shtrShipDate) {
		this.shtrShipDate = shtrShipDate;
	}

	public String getShtrSite() {
		return this.shtrSite;
	}

	public void setShtrSite(String shtrSite) {
		this.shtrSite = shtrSite;
	}

	public Double getShtrAmt() {
		return this.shtrAmt;
	}

	public void setShtrAmt(Double shtrAmt) {
		this.shtrAmt = shtrAmt;
	}

	public Double getShtrQad01() {
		return this.shtrQad01;
	}

	public void setShtrQad01(Double shtrQad01) {
		this.shtrQad01 = shtrQad01;
	}

	public Double getShtrQad02() {
		return this.shtrQad02;
	}

	public void setShtrQad02(Double shtrQad02) {
		this.shtrQad02 = shtrQad02;
	}

	public Double getShtrQad03() {
		return this.shtrQad03;
	}

	public void setShtrQad03(Double shtrQad03) {
		this.shtrQad03 = shtrQad03;
	}

	public Integer getShtrQad04() {
		return this.shtrQad04;
	}

	public void setShtrQad04(Integer shtrQad04) {
		this.shtrQad04 = shtrQad04;
	}

	public String getShtrQad05() {
		return this.shtrQad05;
	}

	public void setShtrQad05(String shtrQad05) {
		this.shtrQad05 = shtrQad05;
	}

	public String getShtrUser1() {
		return this.shtrUser1;
	}

	public void setShtrUser1(String shtrUser1) {
		this.shtrUser1 = shtrUser1;
	}

	public String getShtrUser2() {
		return this.shtrUser2;
	}

	public void setShtrUser2(String shtrUser2) {
		this.shtrUser2 = shtrUser2;
	}

	public Double getOidShtrDet() {
		return this.oidShtrDet;
	}

	public void setOidShtrDet(Double oidShtrDet) {
		this.oidShtrDet = oidShtrDet;
	}

}