package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCpMstr entity provides the base persistence definition of the CpMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCpMstr implements java.io.Serializable {

	// Fields

	private CpMstrId id;
	private String cpPart;
	private String cpComment;
	private String cpUser1;
	private String cpUser2;
	private String cpUserid;
	private Date cpModDate;
	private String cpPkgCode;
	private String cpCustEco;
	private String cpCustPartd;
	private String cpQadc01;
	private Double oidCpMstr;

	// Constructors

	/** default constructor */
	public AbstractCpMstr() {
	}

	/** minimal constructor */
	public AbstractCpMstr(CpMstrId id, Double oidCpMstr) {
		this.id = id;
		this.oidCpMstr = oidCpMstr;
	}

	/** full constructor */
	public AbstractCpMstr(CpMstrId id, String cpPart, String cpComment,
			String cpUser1, String cpUser2, String cpUserid, Date cpModDate,
			String cpPkgCode, String cpCustEco, String cpCustPartd,
			String cpQadc01, Double oidCpMstr) {
		this.id = id;
		this.cpPart = cpPart;
		this.cpComment = cpComment;
		this.cpUser1 = cpUser1;
		this.cpUser2 = cpUser2;
		this.cpUserid = cpUserid;
		this.cpModDate = cpModDate;
		this.cpPkgCode = cpPkgCode;
		this.cpCustEco = cpCustEco;
		this.cpCustPartd = cpCustPartd;
		this.cpQadc01 = cpQadc01;
		this.oidCpMstr = oidCpMstr;
	}

	// Property accessors

	public CpMstrId getId() {
		return this.id;
	}

	public void setId(CpMstrId id) {
		this.id = id;
	}

	public String getCpPart() {
		return this.cpPart;
	}

	public void setCpPart(String cpPart) {
		this.cpPart = cpPart;
	}

	public String getCpComment() {
		return this.cpComment;
	}

	public void setCpComment(String cpComment) {
		this.cpComment = cpComment;
	}

	public String getCpUser1() {
		return this.cpUser1;
	}

	public void setCpUser1(String cpUser1) {
		this.cpUser1 = cpUser1;
	}

	public String getCpUser2() {
		return this.cpUser2;
	}

	public void setCpUser2(String cpUser2) {
		this.cpUser2 = cpUser2;
	}

	public String getCpUserid() {
		return this.cpUserid;
	}

	public void setCpUserid(String cpUserid) {
		this.cpUserid = cpUserid;
	}

	public Date getCpModDate() {
		return this.cpModDate;
	}

	public void setCpModDate(Date cpModDate) {
		this.cpModDate = cpModDate;
	}

	public String getCpPkgCode() {
		return this.cpPkgCode;
	}

	public void setCpPkgCode(String cpPkgCode) {
		this.cpPkgCode = cpPkgCode;
	}

	public String getCpCustEco() {
		return this.cpCustEco;
	}

	public void setCpCustEco(String cpCustEco) {
		this.cpCustEco = cpCustEco;
	}

	public String getCpCustPartd() {
		return this.cpCustPartd;
	}

	public void setCpCustPartd(String cpCustPartd) {
		this.cpCustPartd = cpCustPartd;
	}

	public String getCpQadc01() {
		return this.cpQadc01;
	}

	public void setCpQadc01(String cpQadc01) {
		this.cpQadc01 = cpQadc01;
	}

	public Double getOidCpMstr() {
		return this.oidCpMstr;
	}

	public void setOidCpMstr(Double oidCpMstr) {
		this.oidCpMstr = oidCpMstr;
	}

}