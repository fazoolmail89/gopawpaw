package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMuMstr entity provides the base persistence definition of the MuMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMuMstr implements java.io.Serializable {

	// Fields

	private MuMstrId id;
	private String muUnionCurr;
	private Date muEndDate;
	private String muModUserid;
	private Date muModDate;
	private String muUser1;
	private String muUser2;
	private String muQadc01;
	private Boolean muQadl01;
	private Date muQadt01;
	private Double muQadd01;
	private Double oidMuMstr;

	// Constructors

	/** default constructor */
	public AbstractMuMstr() {
	}

	/** minimal constructor */
	public AbstractMuMstr(MuMstrId id, String muUnionCurr, Date muEndDate,
			String muModUserid, Date muModDate, String muUser1, String muUser2,
			String muQadc01, Boolean muQadl01, Double muQadd01, Double oidMuMstr) {
		this.id = id;
		this.muUnionCurr = muUnionCurr;
		this.muEndDate = muEndDate;
		this.muModUserid = muModUserid;
		this.muModDate = muModDate;
		this.muUser1 = muUser1;
		this.muUser2 = muUser2;
		this.muQadc01 = muQadc01;
		this.muQadl01 = muQadl01;
		this.muQadd01 = muQadd01;
		this.oidMuMstr = oidMuMstr;
	}

	/** full constructor */
	public AbstractMuMstr(MuMstrId id, String muUnionCurr, Date muEndDate,
			String muModUserid, Date muModDate, String muUser1, String muUser2,
			String muQadc01, Boolean muQadl01, Date muQadt01, Double muQadd01,
			Double oidMuMstr) {
		this.id = id;
		this.muUnionCurr = muUnionCurr;
		this.muEndDate = muEndDate;
		this.muModUserid = muModUserid;
		this.muModDate = muModDate;
		this.muUser1 = muUser1;
		this.muUser2 = muUser2;
		this.muQadc01 = muQadc01;
		this.muQadl01 = muQadl01;
		this.muQadt01 = muQadt01;
		this.muQadd01 = muQadd01;
		this.oidMuMstr = oidMuMstr;
	}

	// Property accessors

	public MuMstrId getId() {
		return this.id;
	}

	public void setId(MuMstrId id) {
		this.id = id;
	}

	public String getMuUnionCurr() {
		return this.muUnionCurr;
	}

	public void setMuUnionCurr(String muUnionCurr) {
		this.muUnionCurr = muUnionCurr;
	}

	public Date getMuEndDate() {
		return this.muEndDate;
	}

	public void setMuEndDate(Date muEndDate) {
		this.muEndDate = muEndDate;
	}

	public String getMuModUserid() {
		return this.muModUserid;
	}

	public void setMuModUserid(String muModUserid) {
		this.muModUserid = muModUserid;
	}

	public Date getMuModDate() {
		return this.muModDate;
	}

	public void setMuModDate(Date muModDate) {
		this.muModDate = muModDate;
	}

	public String getMuUser1() {
		return this.muUser1;
	}

	public void setMuUser1(String muUser1) {
		this.muUser1 = muUser1;
	}

	public String getMuUser2() {
		return this.muUser2;
	}

	public void setMuUser2(String muUser2) {
		this.muUser2 = muUser2;
	}

	public String getMuQadc01() {
		return this.muQadc01;
	}

	public void setMuQadc01(String muQadc01) {
		this.muQadc01 = muQadc01;
	}

	public Boolean getMuQadl01() {
		return this.muQadl01;
	}

	public void setMuQadl01(Boolean muQadl01) {
		this.muQadl01 = muQadl01;
	}

	public Date getMuQadt01() {
		return this.muQadt01;
	}

	public void setMuQadt01(Date muQadt01) {
		this.muQadt01 = muQadt01;
	}

	public Double getMuQadd01() {
		return this.muQadd01;
	}

	public void setMuQadd01(Double muQadd01) {
		this.muQadd01 = muQadd01;
	}

	public Double getOidMuMstr() {
		return this.oidMuMstr;
	}

	public void setOidMuMstr(Double oidMuMstr) {
		this.oidMuMstr = oidMuMstr;
	}

}