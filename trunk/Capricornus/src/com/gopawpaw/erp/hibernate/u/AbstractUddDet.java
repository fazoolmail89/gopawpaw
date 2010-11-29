package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUddDet entity provides the base persistence definition of the UddDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUddDet implements java.io.Serializable {

	// Fields

	private UddDetId id;
	private Boolean uddPrimary;
	private String uddModUserid;
	private Date uddModDate;
	private String uddUser1;
	private String uddUser2;
	private String uddQadc01;
	private String uddQadc02;
	private String uddGroups;
	private Double oidUddDet;

	// Constructors

	/** default constructor */
	public AbstractUddDet() {
	}

	/** full constructor */
	public AbstractUddDet(UddDetId id, Boolean uddPrimary, String uddModUserid,
			Date uddModDate, String uddUser1, String uddUser2,
			String uddQadc01, String uddQadc02, String uddGroups,
			Double oidUddDet) {
		this.id = id;
		this.uddPrimary = uddPrimary;
		this.uddModUserid = uddModUserid;
		this.uddModDate = uddModDate;
		this.uddUser1 = uddUser1;
		this.uddUser2 = uddUser2;
		this.uddQadc01 = uddQadc01;
		this.uddQadc02 = uddQadc02;
		this.uddGroups = uddGroups;
		this.oidUddDet = oidUddDet;
	}

	// Property accessors

	public UddDetId getId() {
		return this.id;
	}

	public void setId(UddDetId id) {
		this.id = id;
	}

	public Boolean getUddPrimary() {
		return this.uddPrimary;
	}

	public void setUddPrimary(Boolean uddPrimary) {
		this.uddPrimary = uddPrimary;
	}

	public String getUddModUserid() {
		return this.uddModUserid;
	}

	public void setUddModUserid(String uddModUserid) {
		this.uddModUserid = uddModUserid;
	}

	public Date getUddModDate() {
		return this.uddModDate;
	}

	public void setUddModDate(Date uddModDate) {
		this.uddModDate = uddModDate;
	}

	public String getUddUser1() {
		return this.uddUser1;
	}

	public void setUddUser1(String uddUser1) {
		this.uddUser1 = uddUser1;
	}

	public String getUddUser2() {
		return this.uddUser2;
	}

	public void setUddUser2(String uddUser2) {
		this.uddUser2 = uddUser2;
	}

	public String getUddQadc01() {
		return this.uddQadc01;
	}

	public void setUddQadc01(String uddQadc01) {
		this.uddQadc01 = uddQadc01;
	}

	public String getUddQadc02() {
		return this.uddQadc02;
	}

	public void setUddQadc02(String uddQadc02) {
		this.uddQadc02 = uddQadc02;
	}

	public String getUddGroups() {
		return this.uddGroups;
	}

	public void setUddGroups(String uddGroups) {
		this.uddGroups = uddGroups;
	}

	public Double getOidUddDet() {
		return this.oidUddDet;
	}

	public void setOidUddDet(Double oidUddDet) {
		this.oidUddDet = oidUddDet;
	}

}