package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractErsMstr entity provides the base persistence definition of the
 * ErsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractErsMstr implements java.io.Serializable {

	// Fields

	private ErsMstrId id;
	private String ersQadc01;
	private Integer ersOpt;
	private Integer ersPrLstTp;
	private String ersUser1;
	private String ersUser2;
	private String ersQadc02;
	private Date ersModDate;
	private String ersModUserid;
	private Double oidErsMstr;

	// Constructors

	/** default constructor */
	public AbstractErsMstr() {
	}

	/** minimal constructor */
	public AbstractErsMstr(ErsMstrId id, Double oidErsMstr) {
		this.id = id;
		this.oidErsMstr = oidErsMstr;
	}

	/** full constructor */
	public AbstractErsMstr(ErsMstrId id, String ersQadc01, Integer ersOpt,
			Integer ersPrLstTp, String ersUser1, String ersUser2,
			String ersQadc02, Date ersModDate, String ersModUserid,
			Double oidErsMstr) {
		this.id = id;
		this.ersQadc01 = ersQadc01;
		this.ersOpt = ersOpt;
		this.ersPrLstTp = ersPrLstTp;
		this.ersUser1 = ersUser1;
		this.ersUser2 = ersUser2;
		this.ersQadc02 = ersQadc02;
		this.ersModDate = ersModDate;
		this.ersModUserid = ersModUserid;
		this.oidErsMstr = oidErsMstr;
	}

	// Property accessors

	public ErsMstrId getId() {
		return this.id;
	}

	public void setId(ErsMstrId id) {
		this.id = id;
	}

	public String getErsQadc01() {
		return this.ersQadc01;
	}

	public void setErsQadc01(String ersQadc01) {
		this.ersQadc01 = ersQadc01;
	}

	public Integer getErsOpt() {
		return this.ersOpt;
	}

	public void setErsOpt(Integer ersOpt) {
		this.ersOpt = ersOpt;
	}

	public Integer getErsPrLstTp() {
		return this.ersPrLstTp;
	}

	public void setErsPrLstTp(Integer ersPrLstTp) {
		this.ersPrLstTp = ersPrLstTp;
	}

	public String getErsUser1() {
		return this.ersUser1;
	}

	public void setErsUser1(String ersUser1) {
		this.ersUser1 = ersUser1;
	}

	public String getErsUser2() {
		return this.ersUser2;
	}

	public void setErsUser2(String ersUser2) {
		this.ersUser2 = ersUser2;
	}

	public String getErsQadc02() {
		return this.ersQadc02;
	}

	public void setErsQadc02(String ersQadc02) {
		this.ersQadc02 = ersQadc02;
	}

	public Date getErsModDate() {
		return this.ersModDate;
	}

	public void setErsModDate(Date ersModDate) {
		this.ersModDate = ersModDate;
	}

	public String getErsModUserid() {
		return this.ersModUserid;
	}

	public void setErsModUserid(String ersModUserid) {
		this.ersModUserid = ersModUserid;
	}

	public Double getOidErsMstr() {
		return this.oidErsMstr;
	}

	public void setOidErsMstr(Double oidErsMstr) {
		this.oidErsMstr = oidErsMstr;
	}

}