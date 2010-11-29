package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAtgtRef entity provides the base persistence definition of the
 * AtgtRef entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAtgtRef implements java.io.Serializable {

	// Fields

	private AtgtRefId id;
	private Double oidAtgtRef;
	private Date atgtModDate;
	private String atgtModUserid;
	private String atgtUser1;
	private String atgtUser2;
	private String atgtQadc01;
	private String atgtQadc02;

	// Constructors

	/** default constructor */
	public AbstractAtgtRef() {
	}

	/** full constructor */
	public AbstractAtgtRef(AtgtRefId id, Double oidAtgtRef, Date atgtModDate,
			String atgtModUserid, String atgtUser1, String atgtUser2,
			String atgtQadc01, String atgtQadc02) {
		this.id = id;
		this.oidAtgtRef = oidAtgtRef;
		this.atgtModDate = atgtModDate;
		this.atgtModUserid = atgtModUserid;
		this.atgtUser1 = atgtUser1;
		this.atgtUser2 = atgtUser2;
		this.atgtQadc01 = atgtQadc01;
		this.atgtQadc02 = atgtQadc02;
	}

	// Property accessors

	public AtgtRefId getId() {
		return this.id;
	}

	public void setId(AtgtRefId id) {
		this.id = id;
	}

	public Double getOidAtgtRef() {
		return this.oidAtgtRef;
	}

	public void setOidAtgtRef(Double oidAtgtRef) {
		this.oidAtgtRef = oidAtgtRef;
	}

	public Date getAtgtModDate() {
		return this.atgtModDate;
	}

	public void setAtgtModDate(Date atgtModDate) {
		this.atgtModDate = atgtModDate;
	}

	public String getAtgtModUserid() {
		return this.atgtModUserid;
	}

	public void setAtgtModUserid(String atgtModUserid) {
		this.atgtModUserid = atgtModUserid;
	}

	public String getAtgtUser1() {
		return this.atgtUser1;
	}

	public void setAtgtUser1(String atgtUser1) {
		this.atgtUser1 = atgtUser1;
	}

	public String getAtgtUser2() {
		return this.atgtUser2;
	}

	public void setAtgtUser2(String atgtUser2) {
		this.atgtUser2 = atgtUser2;
	}

	public String getAtgtQadc01() {
		return this.atgtQadc01;
	}

	public void setAtgtQadc01(String atgtQadc01) {
		this.atgtQadc01 = atgtQadc01;
	}

	public String getAtgtQadc02() {
		return this.atgtQadc02;
	}

	public void setAtgtQadc02(String atgtQadc02) {
		this.atgtQadc02 = atgtQadc02;
	}

}