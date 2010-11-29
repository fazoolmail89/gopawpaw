package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUsrgMstr entity provides the base persistence definition of the
 * UsrgMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUsrgMstr implements java.io.Serializable {

	// Fields

	private String usrgGroupName;
	private String usrgGroupDesc;
	private String usrgModUserid;
	private Date usrgModDate;
	private String usrgUser1;
	private String usrgUser2;
	private String usrgQadc01;
	private String usrgQadc02;
	private Double oidUsrgMstr;

	// Constructors

	/** default constructor */
	public AbstractUsrgMstr() {
	}

	/** full constructor */
	public AbstractUsrgMstr(String usrgGroupDesc, String usrgModUserid,
			Date usrgModDate, String usrgUser1, String usrgUser2,
			String usrgQadc01, String usrgQadc02, Double oidUsrgMstr) {
		this.usrgGroupDesc = usrgGroupDesc;
		this.usrgModUserid = usrgModUserid;
		this.usrgModDate = usrgModDate;
		this.usrgUser1 = usrgUser1;
		this.usrgUser2 = usrgUser2;
		this.usrgQadc01 = usrgQadc01;
		this.usrgQadc02 = usrgQadc02;
		this.oidUsrgMstr = oidUsrgMstr;
	}

	// Property accessors

	public String getUsrgGroupName() {
		return this.usrgGroupName;
	}

	public void setUsrgGroupName(String usrgGroupName) {
		this.usrgGroupName = usrgGroupName;
	}

	public String getUsrgGroupDesc() {
		return this.usrgGroupDesc;
	}

	public void setUsrgGroupDesc(String usrgGroupDesc) {
		this.usrgGroupDesc = usrgGroupDesc;
	}

	public String getUsrgModUserid() {
		return this.usrgModUserid;
	}

	public void setUsrgModUserid(String usrgModUserid) {
		this.usrgModUserid = usrgModUserid;
	}

	public Date getUsrgModDate() {
		return this.usrgModDate;
	}

	public void setUsrgModDate(Date usrgModDate) {
		this.usrgModDate = usrgModDate;
	}

	public String getUsrgUser1() {
		return this.usrgUser1;
	}

	public void setUsrgUser1(String usrgUser1) {
		this.usrgUser1 = usrgUser1;
	}

	public String getUsrgUser2() {
		return this.usrgUser2;
	}

	public void setUsrgUser2(String usrgUser2) {
		this.usrgUser2 = usrgUser2;
	}

	public String getUsrgQadc01() {
		return this.usrgQadc01;
	}

	public void setUsrgQadc01(String usrgQadc01) {
		this.usrgQadc01 = usrgQadc01;
	}

	public String getUsrgQadc02() {
		return this.usrgQadc02;
	}

	public void setUsrgQadc02(String usrgQadc02) {
		this.usrgQadc02 = usrgQadc02;
	}

	public Double getOidUsrgMstr() {
		return this.oidUsrgMstr;
	}

	public void setOidUsrgMstr(Double oidUsrgMstr) {
		this.oidUsrgMstr = oidUsrgMstr;
	}

}