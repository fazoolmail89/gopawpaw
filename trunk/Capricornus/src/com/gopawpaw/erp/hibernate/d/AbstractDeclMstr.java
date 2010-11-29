package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDeclMstr entity provides the base persistence definition of the
 * DeclMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDeclMstr implements java.io.Serializable {

	// Fields

	private DeclMstrId id;
	private String declAgent;
	private String declBranch;
	private String declCtryCode;
	private String declCurr;
	private String declProgram;
	private String declExRatetype;
	private String declRegion;
	private Date declModDate;
	private String declModUserid;
	private String declAffiliation;
	private String declUser1;
	private String declUser2;
	private String declQadc01;
	private String declQadc02;
	private Double declNetWtMin;
	private Double oidDeclMstr;

	// Constructors

	/** default constructor */
	public AbstractDeclMstr() {
	}

	/** full constructor */
	public AbstractDeclMstr(DeclMstrId id, String declAgent, String declBranch,
			String declCtryCode, String declCurr, String declProgram,
			String declExRatetype, String declRegion, Date declModDate,
			String declModUserid, String declAffiliation, String declUser1,
			String declUser2, String declQadc01, String declQadc02,
			Double declNetWtMin, Double oidDeclMstr) {
		this.id = id;
		this.declAgent = declAgent;
		this.declBranch = declBranch;
		this.declCtryCode = declCtryCode;
		this.declCurr = declCurr;
		this.declProgram = declProgram;
		this.declExRatetype = declExRatetype;
		this.declRegion = declRegion;
		this.declModDate = declModDate;
		this.declModUserid = declModUserid;
		this.declAffiliation = declAffiliation;
		this.declUser1 = declUser1;
		this.declUser2 = declUser2;
		this.declQadc01 = declQadc01;
		this.declQadc02 = declQadc02;
		this.declNetWtMin = declNetWtMin;
		this.oidDeclMstr = oidDeclMstr;
	}

	// Property accessors

	public DeclMstrId getId() {
		return this.id;
	}

	public void setId(DeclMstrId id) {
		this.id = id;
	}

	public String getDeclAgent() {
		return this.declAgent;
	}

	public void setDeclAgent(String declAgent) {
		this.declAgent = declAgent;
	}

	public String getDeclBranch() {
		return this.declBranch;
	}

	public void setDeclBranch(String declBranch) {
		this.declBranch = declBranch;
	}

	public String getDeclCtryCode() {
		return this.declCtryCode;
	}

	public void setDeclCtryCode(String declCtryCode) {
		this.declCtryCode = declCtryCode;
	}

	public String getDeclCurr() {
		return this.declCurr;
	}

	public void setDeclCurr(String declCurr) {
		this.declCurr = declCurr;
	}

	public String getDeclProgram() {
		return this.declProgram;
	}

	public void setDeclProgram(String declProgram) {
		this.declProgram = declProgram;
	}

	public String getDeclExRatetype() {
		return this.declExRatetype;
	}

	public void setDeclExRatetype(String declExRatetype) {
		this.declExRatetype = declExRatetype;
	}

	public String getDeclRegion() {
		return this.declRegion;
	}

	public void setDeclRegion(String declRegion) {
		this.declRegion = declRegion;
	}

	public Date getDeclModDate() {
		return this.declModDate;
	}

	public void setDeclModDate(Date declModDate) {
		this.declModDate = declModDate;
	}

	public String getDeclModUserid() {
		return this.declModUserid;
	}

	public void setDeclModUserid(String declModUserid) {
		this.declModUserid = declModUserid;
	}

	public String getDeclAffiliation() {
		return this.declAffiliation;
	}

	public void setDeclAffiliation(String declAffiliation) {
		this.declAffiliation = declAffiliation;
	}

	public String getDeclUser1() {
		return this.declUser1;
	}

	public void setDeclUser1(String declUser1) {
		this.declUser1 = declUser1;
	}

	public String getDeclUser2() {
		return this.declUser2;
	}

	public void setDeclUser2(String declUser2) {
		this.declUser2 = declUser2;
	}

	public String getDeclQadc01() {
		return this.declQadc01;
	}

	public void setDeclQadc01(String declQadc01) {
		this.declQadc01 = declQadc01;
	}

	public String getDeclQadc02() {
		return this.declQadc02;
	}

	public void setDeclQadc02(String declQadc02) {
		this.declQadc02 = declQadc02;
	}

	public Double getDeclNetWtMin() {
		return this.declNetWtMin;
	}

	public void setDeclNetWtMin(Double declNetWtMin) {
		this.declNetWtMin = declNetWtMin;
	}

	public Double getOidDeclMstr() {
		return this.oidDeclMstr;
	}

	public void setOidDeclMstr(Double oidDeclMstr) {
		this.oidDeclMstr = oidDeclMstr;
	}

}