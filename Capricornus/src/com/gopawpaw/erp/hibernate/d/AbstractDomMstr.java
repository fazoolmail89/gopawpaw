package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDomMstr entity provides the base persistence definition of the
 * DomMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDomMstr implements java.io.Serializable {

	// Fields

	private String domDomain;
	private String domName;
	private String domType;
	private String domModUserid;
	private Date domModDate;
	private String domUser1;
	private String domUser2;
	private String domQadc01;
	private String domQadc02;
	private String domSname;
	private String domDb;
	private Boolean domActive;
	private Double oidDomMstr;

	// Constructors

	/** default constructor */
	public AbstractDomMstr() {
	}

	/** full constructor */
	public AbstractDomMstr(String domName, String domType, String domModUserid,
			Date domModDate, String domUser1, String domUser2,
			String domQadc01, String domQadc02, String domSname, String domDb,
			Boolean domActive, Double oidDomMstr) {
		this.domName = domName;
		this.domType = domType;
		this.domModUserid = domModUserid;
		this.domModDate = domModDate;
		this.domUser1 = domUser1;
		this.domUser2 = domUser2;
		this.domQadc01 = domQadc01;
		this.domQadc02 = domQadc02;
		this.domSname = domSname;
		this.domDb = domDb;
		this.domActive = domActive;
		this.oidDomMstr = oidDomMstr;
	}

	// Property accessors

	public String getDomDomain() {
		return this.domDomain;
	}

	public void setDomDomain(String domDomain) {
		this.domDomain = domDomain;
	}

	public String getDomName() {
		return this.domName;
	}

	public void setDomName(String domName) {
		this.domName = domName;
	}

	public String getDomType() {
		return this.domType;
	}

	public void setDomType(String domType) {
		this.domType = domType;
	}

	public String getDomModUserid() {
		return this.domModUserid;
	}

	public void setDomModUserid(String domModUserid) {
		this.domModUserid = domModUserid;
	}

	public Date getDomModDate() {
		return this.domModDate;
	}

	public void setDomModDate(Date domModDate) {
		this.domModDate = domModDate;
	}

	public String getDomUser1() {
		return this.domUser1;
	}

	public void setDomUser1(String domUser1) {
		this.domUser1 = domUser1;
	}

	public String getDomUser2() {
		return this.domUser2;
	}

	public void setDomUser2(String domUser2) {
		this.domUser2 = domUser2;
	}

	public String getDomQadc01() {
		return this.domQadc01;
	}

	public void setDomQadc01(String domQadc01) {
		this.domQadc01 = domQadc01;
	}

	public String getDomQadc02() {
		return this.domQadc02;
	}

	public void setDomQadc02(String domQadc02) {
		this.domQadc02 = domQadc02;
	}

	public String getDomSname() {
		return this.domSname;
	}

	public void setDomSname(String domSname) {
		this.domSname = domSname;
	}

	public String getDomDb() {
		return this.domDb;
	}

	public void setDomDb(String domDb) {
		this.domDb = domDb;
	}

	public Boolean getDomActive() {
		return this.domActive;
	}

	public void setDomActive(Boolean domActive) {
		this.domActive = domActive;
	}

	public Double getOidDomMstr() {
		return this.oidDomMstr;
	}

	public void setOidDomMstr(Double oidDomMstr) {
		this.oidDomMstr = oidDomMstr;
	}

}