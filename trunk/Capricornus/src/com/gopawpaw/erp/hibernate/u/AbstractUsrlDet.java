package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUsrlDet entity provides the base persistence definition of the
 * UsrlDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrlDet implements java.io.Serializable {

	// Fields

	private UsrlDetId id;
	private Boolean usrlActive;
	private Date usrlActiveDate;
	private Date usrlDeactiveDate;
	private String usrlDeactiveBy;
	private String usrlModUserid;
	private Date usrlModDate;
	private String usrlUser1;
	private String usrlUser2;
	private String usrlQadc01;
	private String usrlQadc02;
	private Double usrlQadd01;
	private Date usrlQadt01;
	private Double oidUsrlDet;

	// Constructors

	/** default constructor */
	public AbstractUsrlDet() {
	}

	/** minimal constructor */
	public AbstractUsrlDet(UsrlDetId id, Boolean usrlActive,
			String usrlDeactiveBy, String usrlModUserid, Date usrlModDate,
			String usrlUser1, String usrlUser2, String usrlQadc01,
			String usrlQadc02, Double usrlQadd01, Double oidUsrlDet) {
		this.id = id;
		this.usrlActive = usrlActive;
		this.usrlDeactiveBy = usrlDeactiveBy;
		this.usrlModUserid = usrlModUserid;
		this.usrlModDate = usrlModDate;
		this.usrlUser1 = usrlUser1;
		this.usrlUser2 = usrlUser2;
		this.usrlQadc01 = usrlQadc01;
		this.usrlQadc02 = usrlQadc02;
		this.usrlQadd01 = usrlQadd01;
		this.oidUsrlDet = oidUsrlDet;
	}

	/** full constructor */
	public AbstractUsrlDet(UsrlDetId id, Boolean usrlActive,
			Date usrlActiveDate, Date usrlDeactiveDate, String usrlDeactiveBy,
			String usrlModUserid, Date usrlModDate, String usrlUser1,
			String usrlUser2, String usrlQadc01, String usrlQadc02,
			Double usrlQadd01, Date usrlQadt01, Double oidUsrlDet) {
		this.id = id;
		this.usrlActive = usrlActive;
		this.usrlActiveDate = usrlActiveDate;
		this.usrlDeactiveDate = usrlDeactiveDate;
		this.usrlDeactiveBy = usrlDeactiveBy;
		this.usrlModUserid = usrlModUserid;
		this.usrlModDate = usrlModDate;
		this.usrlUser1 = usrlUser1;
		this.usrlUser2 = usrlUser2;
		this.usrlQadc01 = usrlQadc01;
		this.usrlQadc02 = usrlQadc02;
		this.usrlQadd01 = usrlQadd01;
		this.usrlQadt01 = usrlQadt01;
		this.oidUsrlDet = oidUsrlDet;
	}

	// Property accessors

	public UsrlDetId getId() {
		return this.id;
	}

	public void setId(UsrlDetId id) {
		this.id = id;
	}

	public Boolean getUsrlActive() {
		return this.usrlActive;
	}

	public void setUsrlActive(Boolean usrlActive) {
		this.usrlActive = usrlActive;
	}

	public Date getUsrlActiveDate() {
		return this.usrlActiveDate;
	}

	public void setUsrlActiveDate(Date usrlActiveDate) {
		this.usrlActiveDate = usrlActiveDate;
	}

	public Date getUsrlDeactiveDate() {
		return this.usrlDeactiveDate;
	}

	public void setUsrlDeactiveDate(Date usrlDeactiveDate) {
		this.usrlDeactiveDate = usrlDeactiveDate;
	}

	public String getUsrlDeactiveBy() {
		return this.usrlDeactiveBy;
	}

	public void setUsrlDeactiveBy(String usrlDeactiveBy) {
		this.usrlDeactiveBy = usrlDeactiveBy;
	}

	public String getUsrlModUserid() {
		return this.usrlModUserid;
	}

	public void setUsrlModUserid(String usrlModUserid) {
		this.usrlModUserid = usrlModUserid;
	}

	public Date getUsrlModDate() {
		return this.usrlModDate;
	}

	public void setUsrlModDate(Date usrlModDate) {
		this.usrlModDate = usrlModDate;
	}

	public String getUsrlUser1() {
		return this.usrlUser1;
	}

	public void setUsrlUser1(String usrlUser1) {
		this.usrlUser1 = usrlUser1;
	}

	public String getUsrlUser2() {
		return this.usrlUser2;
	}

	public void setUsrlUser2(String usrlUser2) {
		this.usrlUser2 = usrlUser2;
	}

	public String getUsrlQadc01() {
		return this.usrlQadc01;
	}

	public void setUsrlQadc01(String usrlQadc01) {
		this.usrlQadc01 = usrlQadc01;
	}

	public String getUsrlQadc02() {
		return this.usrlQadc02;
	}

	public void setUsrlQadc02(String usrlQadc02) {
		this.usrlQadc02 = usrlQadc02;
	}

	public Double getUsrlQadd01() {
		return this.usrlQadd01;
	}

	public void setUsrlQadd01(Double usrlQadd01) {
		this.usrlQadd01 = usrlQadd01;
	}

	public Date getUsrlQadt01() {
		return this.usrlQadt01;
	}

	public void setUsrlQadt01(Date usrlQadt01) {
		this.usrlQadt01 = usrlQadt01;
	}

	public Double getOidUsrlDet() {
		return this.oidUsrlDet;
	}

	public void setOidUsrlDet(Double oidUsrlDet) {
		this.oidUsrlDet = oidUsrlDet;
	}

}