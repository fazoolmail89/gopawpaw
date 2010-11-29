package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsfilMstr entity provides the base persistence definition of the
 * EsfilMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsfilMstr implements java.io.Serializable {

	// Fields

	private String esfilFieldName;
	private Double oidEsfilMstr;
	private String esfilTableName;
	private Date esfilModDate;
	private String esfilModUserid;
	private String esfilUser1;
	private String esfilUser2;
	private String esfilQadc01;
	private String esfilQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsfilMstr() {
	}

	/** full constructor */
	public AbstractEsfilMstr(Double oidEsfilMstr, String esfilTableName,
			Date esfilModDate, String esfilModUserid, String esfilUser1,
			String esfilUser2, String esfilQadc01, String esfilQadc02) {
		this.oidEsfilMstr = oidEsfilMstr;
		this.esfilTableName = esfilTableName;
		this.esfilModDate = esfilModDate;
		this.esfilModUserid = esfilModUserid;
		this.esfilUser1 = esfilUser1;
		this.esfilUser2 = esfilUser2;
		this.esfilQadc01 = esfilQadc01;
		this.esfilQadc02 = esfilQadc02;
	}

	// Property accessors

	public String getEsfilFieldName() {
		return this.esfilFieldName;
	}

	public void setEsfilFieldName(String esfilFieldName) {
		this.esfilFieldName = esfilFieldName;
	}

	public Double getOidEsfilMstr() {
		return this.oidEsfilMstr;
	}

	public void setOidEsfilMstr(Double oidEsfilMstr) {
		this.oidEsfilMstr = oidEsfilMstr;
	}

	public String getEsfilTableName() {
		return this.esfilTableName;
	}

	public void setEsfilTableName(String esfilTableName) {
		this.esfilTableName = esfilTableName;
	}

	public Date getEsfilModDate() {
		return this.esfilModDate;
	}

	public void setEsfilModDate(Date esfilModDate) {
		this.esfilModDate = esfilModDate;
	}

	public String getEsfilModUserid() {
		return this.esfilModUserid;
	}

	public void setEsfilModUserid(String esfilModUserid) {
		this.esfilModUserid = esfilModUserid;
	}

	public String getEsfilUser1() {
		return this.esfilUser1;
	}

	public void setEsfilUser1(String esfilUser1) {
		this.esfilUser1 = esfilUser1;
	}

	public String getEsfilUser2() {
		return this.esfilUser2;
	}

	public void setEsfilUser2(String esfilUser2) {
		this.esfilUser2 = esfilUser2;
	}

	public String getEsfilQadc01() {
		return this.esfilQadc01;
	}

	public void setEsfilQadc01(String esfilQadc01) {
		this.esfilQadc01 = esfilQadc01;
	}

	public String getEsfilQadc02() {
		return this.esfilQadc02;
	}

	public void setEsfilQadc02(String esfilQadc02) {
		this.esfilQadc02 = esfilQadc02;
	}

}