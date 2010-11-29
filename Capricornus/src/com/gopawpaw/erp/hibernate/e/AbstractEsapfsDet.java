package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapfsDet entity provides the base persistence definition of the
 * EsapfsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfsDet implements java.io.Serializable {

	// Fields

	private EsapfsDetId id;
	private Double oidEsapfsDet;
	private String esapfsSetDesc;
	private Date esapfsModDate;
	private String esapfsModUserid;
	private String esapfsUser1;
	private String esapfsUser2;
	private String esapfsQadc01;
	private String esapfsQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapfsDet() {
	}

	/** full constructor */
	public AbstractEsapfsDet(EsapfsDetId id, Double oidEsapfsDet,
			String esapfsSetDesc, Date esapfsModDate, String esapfsModUserid,
			String esapfsUser1, String esapfsUser2, String esapfsQadc01,
			String esapfsQadc02) {
		this.id = id;
		this.oidEsapfsDet = oidEsapfsDet;
		this.esapfsSetDesc = esapfsSetDesc;
		this.esapfsModDate = esapfsModDate;
		this.esapfsModUserid = esapfsModUserid;
		this.esapfsUser1 = esapfsUser1;
		this.esapfsUser2 = esapfsUser2;
		this.esapfsQadc01 = esapfsQadc01;
		this.esapfsQadc02 = esapfsQadc02;
	}

	// Property accessors

	public EsapfsDetId getId() {
		return this.id;
	}

	public void setId(EsapfsDetId id) {
		this.id = id;
	}

	public Double getOidEsapfsDet() {
		return this.oidEsapfsDet;
	}

	public void setOidEsapfsDet(Double oidEsapfsDet) {
		this.oidEsapfsDet = oidEsapfsDet;
	}

	public String getEsapfsSetDesc() {
		return this.esapfsSetDesc;
	}

	public void setEsapfsSetDesc(String esapfsSetDesc) {
		this.esapfsSetDesc = esapfsSetDesc;
	}

	public Date getEsapfsModDate() {
		return this.esapfsModDate;
	}

	public void setEsapfsModDate(Date esapfsModDate) {
		this.esapfsModDate = esapfsModDate;
	}

	public String getEsapfsModUserid() {
		return this.esapfsModUserid;
	}

	public void setEsapfsModUserid(String esapfsModUserid) {
		this.esapfsModUserid = esapfsModUserid;
	}

	public String getEsapfsUser1() {
		return this.esapfsUser1;
	}

	public void setEsapfsUser1(String esapfsUser1) {
		this.esapfsUser1 = esapfsUser1;
	}

	public String getEsapfsUser2() {
		return this.esapfsUser2;
	}

	public void setEsapfsUser2(String esapfsUser2) {
		this.esapfsUser2 = esapfsUser2;
	}

	public String getEsapfsQadc01() {
		return this.esapfsQadc01;
	}

	public void setEsapfsQadc01(String esapfsQadc01) {
		this.esapfsQadc01 = esapfsQadc01;
	}

	public String getEsapfsQadc02() {
		return this.esapfsQadc02;
	}

	public void setEsapfsQadc02(String esapfsQadc02) {
		this.esapfsQadc02 = esapfsQadc02;
	}

}