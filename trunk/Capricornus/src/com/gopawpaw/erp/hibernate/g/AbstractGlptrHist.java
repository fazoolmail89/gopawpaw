package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGlptrHist entity provides the base persistence definition of the
 * GlptrHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlptrHist implements java.io.Serializable {

	// Fields

	private GlptrHistId id;
	private Date glptrEffDate;
	private Date glptrPrtDate;
	private Integer glptrProtNbr;
	private String glptrUser1;
	private String glptrUser2;
	private String glptrModUserid;
	private Date glptrModDate;
	private String glptrQadc01;
	private String glptrQadc02;
	private Double oidGlptrHist;

	// Constructors

	/** default constructor */
	public AbstractGlptrHist() {
	}

	/** minimal constructor */
	public AbstractGlptrHist(GlptrHistId id, Integer glptrProtNbr,
			String glptrUser1, String glptrUser2, String glptrModUserid,
			Date glptrModDate, String glptrQadc01, String glptrQadc02,
			Double oidGlptrHist) {
		this.id = id;
		this.glptrProtNbr = glptrProtNbr;
		this.glptrUser1 = glptrUser1;
		this.glptrUser2 = glptrUser2;
		this.glptrModUserid = glptrModUserid;
		this.glptrModDate = glptrModDate;
		this.glptrQadc01 = glptrQadc01;
		this.glptrQadc02 = glptrQadc02;
		this.oidGlptrHist = oidGlptrHist;
	}

	/** full constructor */
	public AbstractGlptrHist(GlptrHistId id, Date glptrEffDate,
			Date glptrPrtDate, Integer glptrProtNbr, String glptrUser1,
			String glptrUser2, String glptrModUserid, Date glptrModDate,
			String glptrQadc01, String glptrQadc02, Double oidGlptrHist) {
		this.id = id;
		this.glptrEffDate = glptrEffDate;
		this.glptrPrtDate = glptrPrtDate;
		this.glptrProtNbr = glptrProtNbr;
		this.glptrUser1 = glptrUser1;
		this.glptrUser2 = glptrUser2;
		this.glptrModUserid = glptrModUserid;
		this.glptrModDate = glptrModDate;
		this.glptrQadc01 = glptrQadc01;
		this.glptrQadc02 = glptrQadc02;
		this.oidGlptrHist = oidGlptrHist;
	}

	// Property accessors

	public GlptrHistId getId() {
		return this.id;
	}

	public void setId(GlptrHistId id) {
		this.id = id;
	}

	public Date getGlptrEffDate() {
		return this.glptrEffDate;
	}

	public void setGlptrEffDate(Date glptrEffDate) {
		this.glptrEffDate = glptrEffDate;
	}

	public Date getGlptrPrtDate() {
		return this.glptrPrtDate;
	}

	public void setGlptrPrtDate(Date glptrPrtDate) {
		this.glptrPrtDate = glptrPrtDate;
	}

	public Integer getGlptrProtNbr() {
		return this.glptrProtNbr;
	}

	public void setGlptrProtNbr(Integer glptrProtNbr) {
		this.glptrProtNbr = glptrProtNbr;
	}

	public String getGlptrUser1() {
		return this.glptrUser1;
	}

	public void setGlptrUser1(String glptrUser1) {
		this.glptrUser1 = glptrUser1;
	}

	public String getGlptrUser2() {
		return this.glptrUser2;
	}

	public void setGlptrUser2(String glptrUser2) {
		this.glptrUser2 = glptrUser2;
	}

	public String getGlptrModUserid() {
		return this.glptrModUserid;
	}

	public void setGlptrModUserid(String glptrModUserid) {
		this.glptrModUserid = glptrModUserid;
	}

	public Date getGlptrModDate() {
		return this.glptrModDate;
	}

	public void setGlptrModDate(Date glptrModDate) {
		this.glptrModDate = glptrModDate;
	}

	public String getGlptrQadc01() {
		return this.glptrQadc01;
	}

	public void setGlptrQadc01(String glptrQadc01) {
		this.glptrQadc01 = glptrQadc01;
	}

	public String getGlptrQadc02() {
		return this.glptrQadc02;
	}

	public void setGlptrQadc02(String glptrQadc02) {
		this.glptrQadc02 = glptrQadc02;
	}

	public Double getOidGlptrHist() {
		return this.oidGlptrHist;
	}

	public void setOidGlptrHist(Double oidGlptrHist) {
		this.oidGlptrHist = oidGlptrHist;
	}

}