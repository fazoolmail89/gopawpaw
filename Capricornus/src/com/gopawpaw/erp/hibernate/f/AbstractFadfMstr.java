package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFadfMstr entity provides the base persistence definition of the
 * FadfMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFadfMstr implements java.io.Serializable {

	// Fields

	private FadfMstrId id;
	private String fadfFamtId;
	private Double fadfFamtElife;
	private String fadfModUserid;
	private Date fadfModDate;
	private String fadfUser1;
	private String fadfUser2;
	private String fadfChr01;
	private Double fadfDec01;
	private Boolean fadfLog01;
	private Date fadfDte01;
	private Integer fadfInt01;
	private String fadfQadc01;
	private Double fadfQadd01;
	private Boolean fadfQadl01;
	private Integer fadfQadi01;
	private Date fadfQadt01;
	private Double oidFadfMstr;

	// Constructors

	/** default constructor */
	public AbstractFadfMstr() {
	}

	/** minimal constructor */
	public AbstractFadfMstr(FadfMstrId id, String fadfFamtId,
			Double fadfFamtElife, String fadfModUserid, Date fadfModDate,
			String fadfUser1, String fadfUser2, String fadfChr01,
			Double fadfDec01, Boolean fadfLog01, Integer fadfInt01,
			String fadfQadc01, Double fadfQadd01, Boolean fadfQadl01,
			Integer fadfQadi01, Double oidFadfMstr) {
		this.id = id;
		this.fadfFamtId = fadfFamtId;
		this.fadfFamtElife = fadfFamtElife;
		this.fadfModUserid = fadfModUserid;
		this.fadfModDate = fadfModDate;
		this.fadfUser1 = fadfUser1;
		this.fadfUser2 = fadfUser2;
		this.fadfChr01 = fadfChr01;
		this.fadfDec01 = fadfDec01;
		this.fadfLog01 = fadfLog01;
		this.fadfInt01 = fadfInt01;
		this.fadfQadc01 = fadfQadc01;
		this.fadfQadd01 = fadfQadd01;
		this.fadfQadl01 = fadfQadl01;
		this.fadfQadi01 = fadfQadi01;
		this.oidFadfMstr = oidFadfMstr;
	}

	/** full constructor */
	public AbstractFadfMstr(FadfMstrId id, String fadfFamtId,
			Double fadfFamtElife, String fadfModUserid, Date fadfModDate,
			String fadfUser1, String fadfUser2, String fadfChr01,
			Double fadfDec01, Boolean fadfLog01, Date fadfDte01,
			Integer fadfInt01, String fadfQadc01, Double fadfQadd01,
			Boolean fadfQadl01, Integer fadfQadi01, Date fadfQadt01,
			Double oidFadfMstr) {
		this.id = id;
		this.fadfFamtId = fadfFamtId;
		this.fadfFamtElife = fadfFamtElife;
		this.fadfModUserid = fadfModUserid;
		this.fadfModDate = fadfModDate;
		this.fadfUser1 = fadfUser1;
		this.fadfUser2 = fadfUser2;
		this.fadfChr01 = fadfChr01;
		this.fadfDec01 = fadfDec01;
		this.fadfLog01 = fadfLog01;
		this.fadfDte01 = fadfDte01;
		this.fadfInt01 = fadfInt01;
		this.fadfQadc01 = fadfQadc01;
		this.fadfQadd01 = fadfQadd01;
		this.fadfQadl01 = fadfQadl01;
		this.fadfQadi01 = fadfQadi01;
		this.fadfQadt01 = fadfQadt01;
		this.oidFadfMstr = oidFadfMstr;
	}

	// Property accessors

	public FadfMstrId getId() {
		return this.id;
	}

	public void setId(FadfMstrId id) {
		this.id = id;
	}

	public String getFadfFamtId() {
		return this.fadfFamtId;
	}

	public void setFadfFamtId(String fadfFamtId) {
		this.fadfFamtId = fadfFamtId;
	}

	public Double getFadfFamtElife() {
		return this.fadfFamtElife;
	}

	public void setFadfFamtElife(Double fadfFamtElife) {
		this.fadfFamtElife = fadfFamtElife;
	}

	public String getFadfModUserid() {
		return this.fadfModUserid;
	}

	public void setFadfModUserid(String fadfModUserid) {
		this.fadfModUserid = fadfModUserid;
	}

	public Date getFadfModDate() {
		return this.fadfModDate;
	}

	public void setFadfModDate(Date fadfModDate) {
		this.fadfModDate = fadfModDate;
	}

	public String getFadfUser1() {
		return this.fadfUser1;
	}

	public void setFadfUser1(String fadfUser1) {
		this.fadfUser1 = fadfUser1;
	}

	public String getFadfUser2() {
		return this.fadfUser2;
	}

	public void setFadfUser2(String fadfUser2) {
		this.fadfUser2 = fadfUser2;
	}

	public String getFadfChr01() {
		return this.fadfChr01;
	}

	public void setFadfChr01(String fadfChr01) {
		this.fadfChr01 = fadfChr01;
	}

	public Double getFadfDec01() {
		return this.fadfDec01;
	}

	public void setFadfDec01(Double fadfDec01) {
		this.fadfDec01 = fadfDec01;
	}

	public Boolean getFadfLog01() {
		return this.fadfLog01;
	}

	public void setFadfLog01(Boolean fadfLog01) {
		this.fadfLog01 = fadfLog01;
	}

	public Date getFadfDte01() {
		return this.fadfDte01;
	}

	public void setFadfDte01(Date fadfDte01) {
		this.fadfDte01 = fadfDte01;
	}

	public Integer getFadfInt01() {
		return this.fadfInt01;
	}

	public void setFadfInt01(Integer fadfInt01) {
		this.fadfInt01 = fadfInt01;
	}

	public String getFadfQadc01() {
		return this.fadfQadc01;
	}

	public void setFadfQadc01(String fadfQadc01) {
		this.fadfQadc01 = fadfQadc01;
	}

	public Double getFadfQadd01() {
		return this.fadfQadd01;
	}

	public void setFadfQadd01(Double fadfQadd01) {
		this.fadfQadd01 = fadfQadd01;
	}

	public Boolean getFadfQadl01() {
		return this.fadfQadl01;
	}

	public void setFadfQadl01(Boolean fadfQadl01) {
		this.fadfQadl01 = fadfQadl01;
	}

	public Integer getFadfQadi01() {
		return this.fadfQadi01;
	}

	public void setFadfQadi01(Integer fadfQadi01) {
		this.fadfQadi01 = fadfQadi01;
	}

	public Date getFadfQadt01() {
		return this.fadfQadt01;
	}

	public void setFadfQadt01(Date fadfQadt01) {
		this.fadfQadt01 = fadfQadt01;
	}

	public Double getOidFadfMstr() {
		return this.oidFadfMstr;
	}

	public void setOidFadfMstr(Double oidFadfMstr) {
		this.oidFadfMstr = oidFadfMstr;
	}

}