package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapfilDet entity provides the base persistence definition of the
 * EsapfilDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapfilDet implements java.io.Serializable {

	// Fields

	private EsapfilDetId id;
	private Double oidEsapfilDet;
	private Date esapfilModDate;
	private String esapfilModUserid;
	private String esapfilUser1;
	private String esapfilUser2;
	private String esapfilQadc01;
	private String esapfilQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapfilDet() {
	}

	/** full constructor */
	public AbstractEsapfilDet(EsapfilDetId id, Double oidEsapfilDet,
			Date esapfilModDate, String esapfilModUserid, String esapfilUser1,
			String esapfilUser2, String esapfilQadc01, String esapfilQadc02) {
		this.id = id;
		this.oidEsapfilDet = oidEsapfilDet;
		this.esapfilModDate = esapfilModDate;
		this.esapfilModUserid = esapfilModUserid;
		this.esapfilUser1 = esapfilUser1;
		this.esapfilUser2 = esapfilUser2;
		this.esapfilQadc01 = esapfilQadc01;
		this.esapfilQadc02 = esapfilQadc02;
	}

	// Property accessors

	public EsapfilDetId getId() {
		return this.id;
	}

	public void setId(EsapfilDetId id) {
		this.id = id;
	}

	public Double getOidEsapfilDet() {
		return this.oidEsapfilDet;
	}

	public void setOidEsapfilDet(Double oidEsapfilDet) {
		this.oidEsapfilDet = oidEsapfilDet;
	}

	public Date getEsapfilModDate() {
		return this.esapfilModDate;
	}

	public void setEsapfilModDate(Date esapfilModDate) {
		this.esapfilModDate = esapfilModDate;
	}

	public String getEsapfilModUserid() {
		return this.esapfilModUserid;
	}

	public void setEsapfilModUserid(String esapfilModUserid) {
		this.esapfilModUserid = esapfilModUserid;
	}

	public String getEsapfilUser1() {
		return this.esapfilUser1;
	}

	public void setEsapfilUser1(String esapfilUser1) {
		this.esapfilUser1 = esapfilUser1;
	}

	public String getEsapfilUser2() {
		return this.esapfilUser2;
	}

	public void setEsapfilUser2(String esapfilUser2) {
		this.esapfilUser2 = esapfilUser2;
	}

	public String getEsapfilQadc01() {
		return this.esapfilQadc01;
	}

	public void setEsapfilQadc01(String esapfilQadc01) {
		this.esapfilQadc01 = esapfilQadc01;
	}

	public String getEsapfilQadc02() {
		return this.esapfilQadc02;
	}

	public void setEsapfilQadc02(String esapfilQadc02) {
		this.esapfilQadc02 = esapfilQadc02;
	}

}