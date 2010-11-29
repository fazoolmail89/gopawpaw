package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsgcRef entity provides the base persistence definition of the
 * EsgcRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsgcRef implements java.io.Serializable {

	// Fields

	private EsgcRefId id;
	private Double oidEsgcRef;
	private Date esgcModDate;
	private String esgcModUserid;
	private String esgcUser1;
	private String esgcUser2;
	private String esgcQadc01;
	private String esgcQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsgcRef() {
	}

	/** full constructor */
	public AbstractEsgcRef(EsgcRefId id, Double oidEsgcRef, Date esgcModDate,
			String esgcModUserid, String esgcUser1, String esgcUser2,
			String esgcQadc01, String esgcQadc02) {
		this.id = id;
		this.oidEsgcRef = oidEsgcRef;
		this.esgcModDate = esgcModDate;
		this.esgcModUserid = esgcModUserid;
		this.esgcUser1 = esgcUser1;
		this.esgcUser2 = esgcUser2;
		this.esgcQadc01 = esgcQadc01;
		this.esgcQadc02 = esgcQadc02;
	}

	// Property accessors

	public EsgcRefId getId() {
		return this.id;
	}

	public void setId(EsgcRefId id) {
		this.id = id;
	}

	public Double getOidEsgcRef() {
		return this.oidEsgcRef;
	}

	public void setOidEsgcRef(Double oidEsgcRef) {
		this.oidEsgcRef = oidEsgcRef;
	}

	public Date getEsgcModDate() {
		return this.esgcModDate;
	}

	public void setEsgcModDate(Date esgcModDate) {
		this.esgcModDate = esgcModDate;
	}

	public String getEsgcModUserid() {
		return this.esgcModUserid;
	}

	public void setEsgcModUserid(String esgcModUserid) {
		this.esgcModUserid = esgcModUserid;
	}

	public String getEsgcUser1() {
		return this.esgcUser1;
	}

	public void setEsgcUser1(String esgcUser1) {
		this.esgcUser1 = esgcUser1;
	}

	public String getEsgcUser2() {
		return this.esgcUser2;
	}

	public void setEsgcUser2(String esgcUser2) {
		this.esgcUser2 = esgcUser2;
	}

	public String getEsgcQadc01() {
		return this.esgcQadc01;
	}

	public void setEsgcQadc01(String esgcQadc01) {
		this.esgcQadc01 = esgcQadc01;
	}

	public String getEsgcQadc02() {
		return this.esgcQadc02;
	}

	public void setEsgcQadc02(String esgcQadc02) {
		this.esgcQadc02 = esgcQadc02;
	}

}