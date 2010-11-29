package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUsrgdDet entity provides the base persistence definition of the
 * UsrgdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrgdDet implements java.io.Serializable {

	// Fields

	private UsrgdDetId id;
	private String usrgdModUserid;
	private Date usrgdModDate;
	private String usrgdUser1;
	private String usrgdUser2;
	private String usrgdQadc01;
	private String usrgdQadc02;
	private Double oidUsrgdDet;

	// Constructors

	/** default constructor */
	public AbstractUsrgdDet() {
	}

	/** full constructor */
	public AbstractUsrgdDet(UsrgdDetId id, String usrgdModUserid,
			Date usrgdModDate, String usrgdUser1, String usrgdUser2,
			String usrgdQadc01, String usrgdQadc02, Double oidUsrgdDet) {
		this.id = id;
		this.usrgdModUserid = usrgdModUserid;
		this.usrgdModDate = usrgdModDate;
		this.usrgdUser1 = usrgdUser1;
		this.usrgdUser2 = usrgdUser2;
		this.usrgdQadc01 = usrgdQadc01;
		this.usrgdQadc02 = usrgdQadc02;
		this.oidUsrgdDet = oidUsrgdDet;
	}

	// Property accessors

	public UsrgdDetId getId() {
		return this.id;
	}

	public void setId(UsrgdDetId id) {
		this.id = id;
	}

	public String getUsrgdModUserid() {
		return this.usrgdModUserid;
	}

	public void setUsrgdModUserid(String usrgdModUserid) {
		this.usrgdModUserid = usrgdModUserid;
	}

	public Date getUsrgdModDate() {
		return this.usrgdModDate;
	}

	public void setUsrgdModDate(Date usrgdModDate) {
		this.usrgdModDate = usrgdModDate;
	}

	public String getUsrgdUser1() {
		return this.usrgdUser1;
	}

	public void setUsrgdUser1(String usrgdUser1) {
		this.usrgdUser1 = usrgdUser1;
	}

	public String getUsrgdUser2() {
		return this.usrgdUser2;
	}

	public void setUsrgdUser2(String usrgdUser2) {
		this.usrgdUser2 = usrgdUser2;
	}

	public String getUsrgdQadc01() {
		return this.usrgdQadc01;
	}

	public void setUsrgdQadc01(String usrgdQadc01) {
		this.usrgdQadc01 = usrgdQadc01;
	}

	public String getUsrgdQadc02() {
		return this.usrgdQadc02;
	}

	public void setUsrgdQadc02(String usrgdQadc02) {
		this.usrgdQadc02 = usrgdQadc02;
	}

	public Double getOidUsrgdDet() {
		return this.oidUsrgdDet;
	}

	public void setOidUsrgdDet(Double oidUsrgdDet) {
		this.oidUsrgdDet = oidUsrgdDet;
	}

}