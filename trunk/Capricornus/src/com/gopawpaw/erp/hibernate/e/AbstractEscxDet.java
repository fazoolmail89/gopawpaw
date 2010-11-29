package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEscxDet entity provides the base persistence definition of the
 * EscxDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscxDet implements java.io.Serializable {

	// Fields

	private EscxDetId id;
	private Double oidEscxDet;
	private String escxXmlStamp;
	private Date escxModDate;
	private String escxModUserid;
	private String escxUser1;
	private String escxUser2;
	private String escxQadc01;
	private String escxQadc02;

	// Constructors

	/** default constructor */
	public AbstractEscxDet() {
	}

	/** full constructor */
	public AbstractEscxDet(EscxDetId id, Double oidEscxDet,
			String escxXmlStamp, Date escxModDate, String escxModUserid,
			String escxUser1, String escxUser2, String escxQadc01,
			String escxQadc02) {
		this.id = id;
		this.oidEscxDet = oidEscxDet;
		this.escxXmlStamp = escxXmlStamp;
		this.escxModDate = escxModDate;
		this.escxModUserid = escxModUserid;
		this.escxUser1 = escxUser1;
		this.escxUser2 = escxUser2;
		this.escxQadc01 = escxQadc01;
		this.escxQadc02 = escxQadc02;
	}

	// Property accessors

	public EscxDetId getId() {
		return this.id;
	}

	public void setId(EscxDetId id) {
		this.id = id;
	}

	public Double getOidEscxDet() {
		return this.oidEscxDet;
	}

	public void setOidEscxDet(Double oidEscxDet) {
		this.oidEscxDet = oidEscxDet;
	}

	public String getEscxXmlStamp() {
		return this.escxXmlStamp;
	}

	public void setEscxXmlStamp(String escxXmlStamp) {
		this.escxXmlStamp = escxXmlStamp;
	}

	public Date getEscxModDate() {
		return this.escxModDate;
	}

	public void setEscxModDate(Date escxModDate) {
		this.escxModDate = escxModDate;
	}

	public String getEscxModUserid() {
		return this.escxModUserid;
	}

	public void setEscxModUserid(String escxModUserid) {
		this.escxModUserid = escxModUserid;
	}

	public String getEscxUser1() {
		return this.escxUser1;
	}

	public void setEscxUser1(String escxUser1) {
		this.escxUser1 = escxUser1;
	}

	public String getEscxUser2() {
		return this.escxUser2;
	}

	public void setEscxUser2(String escxUser2) {
		this.escxUser2 = escxUser2;
	}

	public String getEscxQadc01() {
		return this.escxQadc01;
	}

	public void setEscxQadc01(String escxQadc01) {
		this.escxQadc01 = escxQadc01;
	}

	public String getEscxQadc02() {
		return this.escxQadc02;
	}

	public void setEscxQadc02(String escxQadc02) {
		this.escxQadc02 = escxQadc02;
	}

}