package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEscfRef entity provides the base persistence definition of the
 * EscfRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscfRef implements java.io.Serializable {

	// Fields

	private EscfRefId id;
	private Double oidEscfRef;
	private Date escfModDate;
	private String escfModUserid;
	private String escfUser1;
	private String escfUser2;
	private String escfQadc01;
	private String escfQadc02;

	// Constructors

	/** default constructor */
	public AbstractEscfRef() {
	}

	/** full constructor */
	public AbstractEscfRef(EscfRefId id, Double oidEscfRef, Date escfModDate,
			String escfModUserid, String escfUser1, String escfUser2,
			String escfQadc01, String escfQadc02) {
		this.id = id;
		this.oidEscfRef = oidEscfRef;
		this.escfModDate = escfModDate;
		this.escfModUserid = escfModUserid;
		this.escfUser1 = escfUser1;
		this.escfUser2 = escfUser2;
		this.escfQadc01 = escfQadc01;
		this.escfQadc02 = escfQadc02;
	}

	// Property accessors

	public EscfRefId getId() {
		return this.id;
	}

	public void setId(EscfRefId id) {
		this.id = id;
	}

	public Double getOidEscfRef() {
		return this.oidEscfRef;
	}

	public void setOidEscfRef(Double oidEscfRef) {
		this.oidEscfRef = oidEscfRef;
	}

	public Date getEscfModDate() {
		return this.escfModDate;
	}

	public void setEscfModDate(Date escfModDate) {
		this.escfModDate = escfModDate;
	}

	public String getEscfModUserid() {
		return this.escfModUserid;
	}

	public void setEscfModUserid(String escfModUserid) {
		this.escfModUserid = escfModUserid;
	}

	public String getEscfUser1() {
		return this.escfUser1;
	}

	public void setEscfUser1(String escfUser1) {
		this.escfUser1 = escfUser1;
	}

	public String getEscfUser2() {
		return this.escfUser2;
	}

	public void setEscfUser2(String escfUser2) {
		this.escfUser2 = escfUser2;
	}

	public String getEscfQadc01() {
		return this.escfQadc01;
	}

	public void setEscfQadc01(String escfQadc01) {
		this.escfQadc01 = escfQadc01;
	}

	public String getEscfQadc02() {
		return this.escfQadc02;
	}

	public void setEscfQadc02(String escfQadc02) {
		this.escfQadc02 = escfQadc02;
	}

}