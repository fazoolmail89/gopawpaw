package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractClcCtrl entity provides the base persistence definition of the
 * ClcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractClcCtrl implements java.io.Serializable {

	// Fields

	private String clcDomain;
	private Boolean clcActive;
	private Boolean clcCompIssue;
	private Integer clcLotlevel;
	private Boolean clcPolotRcpt;
	private Boolean clcWolotRcpt;
	private Boolean clcRelotRcpt;
	private Integer clcQadi01;
	private Boolean clcJpRcpt;
	private String clcUser1;
	private String clcUser2;
	private String clcQadc01;
	private Double oidClcCtrl;

	// Constructors

	/** default constructor */
	public AbstractClcCtrl() {
	}

	/** minimal constructor */
	public AbstractClcCtrl(Double oidClcCtrl) {
		this.oidClcCtrl = oidClcCtrl;
	}

	/** full constructor */
	public AbstractClcCtrl(Boolean clcActive, Boolean clcCompIssue,
			Integer clcLotlevel, Boolean clcPolotRcpt, Boolean clcWolotRcpt,
			Boolean clcRelotRcpt, Integer clcQadi01, Boolean clcJpRcpt,
			String clcUser1, String clcUser2, String clcQadc01,
			Double oidClcCtrl) {
		this.clcActive = clcActive;
		this.clcCompIssue = clcCompIssue;
		this.clcLotlevel = clcLotlevel;
		this.clcPolotRcpt = clcPolotRcpt;
		this.clcWolotRcpt = clcWolotRcpt;
		this.clcRelotRcpt = clcRelotRcpt;
		this.clcQadi01 = clcQadi01;
		this.clcJpRcpt = clcJpRcpt;
		this.clcUser1 = clcUser1;
		this.clcUser2 = clcUser2;
		this.clcQadc01 = clcQadc01;
		this.oidClcCtrl = oidClcCtrl;
	}

	// Property accessors

	public String getClcDomain() {
		return this.clcDomain;
	}

	public void setClcDomain(String clcDomain) {
		this.clcDomain = clcDomain;
	}

	public Boolean getClcActive() {
		return this.clcActive;
	}

	public void setClcActive(Boolean clcActive) {
		this.clcActive = clcActive;
	}

	public Boolean getClcCompIssue() {
		return this.clcCompIssue;
	}

	public void setClcCompIssue(Boolean clcCompIssue) {
		this.clcCompIssue = clcCompIssue;
	}

	public Integer getClcLotlevel() {
		return this.clcLotlevel;
	}

	public void setClcLotlevel(Integer clcLotlevel) {
		this.clcLotlevel = clcLotlevel;
	}

	public Boolean getClcPolotRcpt() {
		return this.clcPolotRcpt;
	}

	public void setClcPolotRcpt(Boolean clcPolotRcpt) {
		this.clcPolotRcpt = clcPolotRcpt;
	}

	public Boolean getClcWolotRcpt() {
		return this.clcWolotRcpt;
	}

	public void setClcWolotRcpt(Boolean clcWolotRcpt) {
		this.clcWolotRcpt = clcWolotRcpt;
	}

	public Boolean getClcRelotRcpt() {
		return this.clcRelotRcpt;
	}

	public void setClcRelotRcpt(Boolean clcRelotRcpt) {
		this.clcRelotRcpt = clcRelotRcpt;
	}

	public Integer getClcQadi01() {
		return this.clcQadi01;
	}

	public void setClcQadi01(Integer clcQadi01) {
		this.clcQadi01 = clcQadi01;
	}

	public Boolean getClcJpRcpt() {
		return this.clcJpRcpt;
	}

	public void setClcJpRcpt(Boolean clcJpRcpt) {
		this.clcJpRcpt = clcJpRcpt;
	}

	public String getClcUser1() {
		return this.clcUser1;
	}

	public void setClcUser1(String clcUser1) {
		this.clcUser1 = clcUser1;
	}

	public String getClcUser2() {
		return this.clcUser2;
	}

	public void setClcUser2(String clcUser2) {
		this.clcUser2 = clcUser2;
	}

	public String getClcQadc01() {
		return this.clcQadc01;
	}

	public void setClcQadc01(String clcQadc01) {
		this.clcQadc01 = clcQadc01;
	}

	public Double getOidClcCtrl() {
		return this.oidClcCtrl;
	}

	public void setOidClcCtrl(Double oidClcCtrl) {
		this.oidClcCtrl = oidClcCtrl;
	}

}