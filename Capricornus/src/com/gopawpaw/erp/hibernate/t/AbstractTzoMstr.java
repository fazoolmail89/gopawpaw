package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * AbstractTzoMstr entity provides the base persistence definition of the
 * TzoMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractTzoMstr implements java.io.Serializable {

	// Fields

	private TzoMstrId id;
	private String tzoDesc;
	private Boolean tzoAutoAdj;
	private String tzoTzone;
	private String tzoUser1;
	private String tzoUser2;
	private String tzoChr01;
	private Boolean tzoLog01;
	private Date tzoDte01;
	private Integer tzoInt01;
	private String tzoQadc01;
	private Date tzoQadt01;
	private Integer tzoQadi01;
	private Boolean tzoQadl01;
	private String tzoModUserid;
	private Date tzoModDate;
	private Double oidTzoMstr;

	// Constructors

	/** default constructor */
	public AbstractTzoMstr() {
	}

	/** minimal constructor */
	public AbstractTzoMstr(TzoMstrId id, Double oidTzoMstr) {
		this.id = id;
		this.oidTzoMstr = oidTzoMstr;
	}

	/** full constructor */
	public AbstractTzoMstr(TzoMstrId id, String tzoDesc, Boolean tzoAutoAdj,
			String tzoTzone, String tzoUser1, String tzoUser2, String tzoChr01,
			Boolean tzoLog01, Date tzoDte01, Integer tzoInt01,
			String tzoQadc01, Date tzoQadt01, Integer tzoQadi01,
			Boolean tzoQadl01, String tzoModUserid, Date tzoModDate,
			Double oidTzoMstr) {
		this.id = id;
		this.tzoDesc = tzoDesc;
		this.tzoAutoAdj = tzoAutoAdj;
		this.tzoTzone = tzoTzone;
		this.tzoUser1 = tzoUser1;
		this.tzoUser2 = tzoUser2;
		this.tzoChr01 = tzoChr01;
		this.tzoLog01 = tzoLog01;
		this.tzoDte01 = tzoDte01;
		this.tzoInt01 = tzoInt01;
		this.tzoQadc01 = tzoQadc01;
		this.tzoQadt01 = tzoQadt01;
		this.tzoQadi01 = tzoQadi01;
		this.tzoQadl01 = tzoQadl01;
		this.tzoModUserid = tzoModUserid;
		this.tzoModDate = tzoModDate;
		this.oidTzoMstr = oidTzoMstr;
	}

	// Property accessors

	public TzoMstrId getId() {
		return this.id;
	}

	public void setId(TzoMstrId id) {
		this.id = id;
	}

	public String getTzoDesc() {
		return this.tzoDesc;
	}

	public void setTzoDesc(String tzoDesc) {
		this.tzoDesc = tzoDesc;
	}

	public Boolean getTzoAutoAdj() {
		return this.tzoAutoAdj;
	}

	public void setTzoAutoAdj(Boolean tzoAutoAdj) {
		this.tzoAutoAdj = tzoAutoAdj;
	}

	public String getTzoTzone() {
		return this.tzoTzone;
	}

	public void setTzoTzone(String tzoTzone) {
		this.tzoTzone = tzoTzone;
	}

	public String getTzoUser1() {
		return this.tzoUser1;
	}

	public void setTzoUser1(String tzoUser1) {
		this.tzoUser1 = tzoUser1;
	}

	public String getTzoUser2() {
		return this.tzoUser2;
	}

	public void setTzoUser2(String tzoUser2) {
		this.tzoUser2 = tzoUser2;
	}

	public String getTzoChr01() {
		return this.tzoChr01;
	}

	public void setTzoChr01(String tzoChr01) {
		this.tzoChr01 = tzoChr01;
	}

	public Boolean getTzoLog01() {
		return this.tzoLog01;
	}

	public void setTzoLog01(Boolean tzoLog01) {
		this.tzoLog01 = tzoLog01;
	}

	public Date getTzoDte01() {
		return this.tzoDte01;
	}

	public void setTzoDte01(Date tzoDte01) {
		this.tzoDte01 = tzoDte01;
	}

	public Integer getTzoInt01() {
		return this.tzoInt01;
	}

	public void setTzoInt01(Integer tzoInt01) {
		this.tzoInt01 = tzoInt01;
	}

	public String getTzoQadc01() {
		return this.tzoQadc01;
	}

	public void setTzoQadc01(String tzoQadc01) {
		this.tzoQadc01 = tzoQadc01;
	}

	public Date getTzoQadt01() {
		return this.tzoQadt01;
	}

	public void setTzoQadt01(Date tzoQadt01) {
		this.tzoQadt01 = tzoQadt01;
	}

	public Integer getTzoQadi01() {
		return this.tzoQadi01;
	}

	public void setTzoQadi01(Integer tzoQadi01) {
		this.tzoQadi01 = tzoQadi01;
	}

	public Boolean getTzoQadl01() {
		return this.tzoQadl01;
	}

	public void setTzoQadl01(Boolean tzoQadl01) {
		this.tzoQadl01 = tzoQadl01;
	}

	public String getTzoModUserid() {
		return this.tzoModUserid;
	}

	public void setTzoModUserid(String tzoModUserid) {
		this.tzoModUserid = tzoModUserid;
	}

	public Date getTzoModDate() {
		return this.tzoModDate;
	}

	public void setTzoModDate(Date tzoModDate) {
		this.tzoModDate = tzoModDate;
	}

	public Double getOidTzoMstr() {
		return this.oidTzoMstr;
	}

	public void setOidTzoMstr(Double oidTzoMstr) {
		this.oidTzoMstr = oidTzoMstr;
	}

}