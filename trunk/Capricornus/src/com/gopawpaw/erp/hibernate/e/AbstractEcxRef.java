package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEcxRef entity provides the base persistence definition of the EcxRef
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEcxRef implements java.io.Serializable {

	// Fields

	private EcxRefId id;
	private String ecxExtRef;
	private String ecxExtLine;
	private String ecxModUserid;
	private Date ecxModDate;
	private String ecxUser1;
	private String ecxUser2;
	private String ecxQadc01;
	private String ecxQadc02;
	private Double oidEcxRef;

	// Constructors

	/** default constructor */
	public AbstractEcxRef() {
	}

	/** full constructor */
	public AbstractEcxRef(EcxRefId id, String ecxExtRef, String ecxExtLine,
			String ecxModUserid, Date ecxModDate, String ecxUser1,
			String ecxUser2, String ecxQadc01, String ecxQadc02,
			Double oidEcxRef) {
		this.id = id;
		this.ecxExtRef = ecxExtRef;
		this.ecxExtLine = ecxExtLine;
		this.ecxModUserid = ecxModUserid;
		this.ecxModDate = ecxModDate;
		this.ecxUser1 = ecxUser1;
		this.ecxUser2 = ecxUser2;
		this.ecxQadc01 = ecxQadc01;
		this.ecxQadc02 = ecxQadc02;
		this.oidEcxRef = oidEcxRef;
	}

	// Property accessors

	public EcxRefId getId() {
		return this.id;
	}

	public void setId(EcxRefId id) {
		this.id = id;
	}

	public String getEcxExtRef() {
		return this.ecxExtRef;
	}

	public void setEcxExtRef(String ecxExtRef) {
		this.ecxExtRef = ecxExtRef;
	}

	public String getEcxExtLine() {
		return this.ecxExtLine;
	}

	public void setEcxExtLine(String ecxExtLine) {
		this.ecxExtLine = ecxExtLine;
	}

	public String getEcxModUserid() {
		return this.ecxModUserid;
	}

	public void setEcxModUserid(String ecxModUserid) {
		this.ecxModUserid = ecxModUserid;
	}

	public Date getEcxModDate() {
		return this.ecxModDate;
	}

	public void setEcxModDate(Date ecxModDate) {
		this.ecxModDate = ecxModDate;
	}

	public String getEcxUser1() {
		return this.ecxUser1;
	}

	public void setEcxUser1(String ecxUser1) {
		this.ecxUser1 = ecxUser1;
	}

	public String getEcxUser2() {
		return this.ecxUser2;
	}

	public void setEcxUser2(String ecxUser2) {
		this.ecxUser2 = ecxUser2;
	}

	public String getEcxQadc01() {
		return this.ecxQadc01;
	}

	public void setEcxQadc01(String ecxQadc01) {
		this.ecxQadc01 = ecxQadc01;
	}

	public String getEcxQadc02() {
		return this.ecxQadc02;
	}

	public void setEcxQadc02(String ecxQadc02) {
		this.ecxQadc02 = ecxQadc02;
	}

	public Double getOidEcxRef() {
		return this.oidEcxRef;
	}

	public void setOidEcxRef(Double oidEcxRef) {
		this.oidEcxRef = oidEcxRef;
	}

}