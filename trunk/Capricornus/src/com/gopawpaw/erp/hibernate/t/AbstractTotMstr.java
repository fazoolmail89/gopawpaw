package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTotMstr entity provides the base persistence definition of the
 * TotMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTotMstr implements java.io.Serializable {

	// Fields

	private TotMstrId id;
	private String totTermsDesc;
	private String totModUserid;
	private Date totModDate;
	private String totUser1;
	private String totUser2;
	private String totQadc01;
	private String totQadc02;
	private Double oidTotMstr;

	// Constructors

	/** default constructor */
	public AbstractTotMstr() {
	}

	/** full constructor */
	public AbstractTotMstr(TotMstrId id, String totTermsDesc,
			String totModUserid, Date totModDate, String totUser1,
			String totUser2, String totQadc01, String totQadc02,
			Double oidTotMstr) {
		this.id = id;
		this.totTermsDesc = totTermsDesc;
		this.totModUserid = totModUserid;
		this.totModDate = totModDate;
		this.totUser1 = totUser1;
		this.totUser2 = totUser2;
		this.totQadc01 = totQadc01;
		this.totQadc02 = totQadc02;
		this.oidTotMstr = oidTotMstr;
	}

	// Property accessors

	public TotMstrId getId() {
		return this.id;
	}

	public void setId(TotMstrId id) {
		this.id = id;
	}

	public String getTotTermsDesc() {
		return this.totTermsDesc;
	}

	public void setTotTermsDesc(String totTermsDesc) {
		this.totTermsDesc = totTermsDesc;
	}

	public String getTotModUserid() {
		return this.totModUserid;
	}

	public void setTotModUserid(String totModUserid) {
		this.totModUserid = totModUserid;
	}

	public Date getTotModDate() {
		return this.totModDate;
	}

	public void setTotModDate(Date totModDate) {
		this.totModDate = totModDate;
	}

	public String getTotUser1() {
		return this.totUser1;
	}

	public void setTotUser1(String totUser1) {
		this.totUser1 = totUser1;
	}

	public String getTotUser2() {
		return this.totUser2;
	}

	public void setTotUser2(String totUser2) {
		this.totUser2 = totUser2;
	}

	public String getTotQadc01() {
		return this.totQadc01;
	}

	public void setTotQadc01(String totQadc01) {
		this.totQadc01 = totQadc01;
	}

	public String getTotQadc02() {
		return this.totQadc02;
	}

	public void setTotQadc02(String totQadc02) {
		this.totQadc02 = totQadc02;
	}

	public Double getOidTotMstr() {
		return this.oidTotMstr;
	}

	public void setOidTotMstr(Double oidTotMstr) {
		this.oidTotMstr = oidTotMstr;
	}

}