package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFamtMstr entity provides the base persistence definition of the
 * FamtMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtMstr implements java.io.Serializable {

	// Fields

	private FamtMstrId id;
	private String famtType;
	private Boolean famtSwitchsl;
	private String famtDesc;
	private Double famtElife;
	private Boolean famtActive;
	private Double famtPerc;
	private Boolean famtSalv;
	private String famtConv;
	private Boolean famtActualdays;
	private String famtModUserid;
	private Date famtModDate;
	private String famtUser1;
	private String famtUser2;
	private String famtChr01;
	private Double famtDec01;
	private Boolean famtLog01;
	private Date famtDte01;
	private Integer famtInt01;
	private String famtQadc01;
	private Double famtQadd01;
	private Boolean famtQadl01;
	private Integer famtQadi01;
	private Date famtQadt01;
	private String famtQadc02;
	private Double oidFamtMstr;

	// Constructors

	/** default constructor */
	public AbstractFamtMstr() {
	}

	/** minimal constructor */
	public AbstractFamtMstr(FamtMstrId id, String famtType,
			Boolean famtSwitchsl, String famtDesc, Double famtElife,
			Boolean famtActive, Double famtPerc, Boolean famtSalv,
			String famtConv, Boolean famtActualdays, String famtModUserid,
			Date famtModDate, String famtUser1, String famtUser2,
			String famtChr01, Double famtDec01, Boolean famtLog01,
			Integer famtInt01, String famtQadc01, Double famtQadd01,
			Boolean famtQadl01, Integer famtQadi01, String famtQadc02,
			Double oidFamtMstr) {
		this.id = id;
		this.famtType = famtType;
		this.famtSwitchsl = famtSwitchsl;
		this.famtDesc = famtDesc;
		this.famtElife = famtElife;
		this.famtActive = famtActive;
		this.famtPerc = famtPerc;
		this.famtSalv = famtSalv;
		this.famtConv = famtConv;
		this.famtActualdays = famtActualdays;
		this.famtModUserid = famtModUserid;
		this.famtModDate = famtModDate;
		this.famtUser1 = famtUser1;
		this.famtUser2 = famtUser2;
		this.famtChr01 = famtChr01;
		this.famtDec01 = famtDec01;
		this.famtLog01 = famtLog01;
		this.famtInt01 = famtInt01;
		this.famtQadc01 = famtQadc01;
		this.famtQadd01 = famtQadd01;
		this.famtQadl01 = famtQadl01;
		this.famtQadi01 = famtQadi01;
		this.famtQadc02 = famtQadc02;
		this.oidFamtMstr = oidFamtMstr;
	}

	/** full constructor */
	public AbstractFamtMstr(FamtMstrId id, String famtType,
			Boolean famtSwitchsl, String famtDesc, Double famtElife,
			Boolean famtActive, Double famtPerc, Boolean famtSalv,
			String famtConv, Boolean famtActualdays, String famtModUserid,
			Date famtModDate, String famtUser1, String famtUser2,
			String famtChr01, Double famtDec01, Boolean famtLog01,
			Date famtDte01, Integer famtInt01, String famtQadc01,
			Double famtQadd01, Boolean famtQadl01, Integer famtQadi01,
			Date famtQadt01, String famtQadc02, Double oidFamtMstr) {
		this.id = id;
		this.famtType = famtType;
		this.famtSwitchsl = famtSwitchsl;
		this.famtDesc = famtDesc;
		this.famtElife = famtElife;
		this.famtActive = famtActive;
		this.famtPerc = famtPerc;
		this.famtSalv = famtSalv;
		this.famtConv = famtConv;
		this.famtActualdays = famtActualdays;
		this.famtModUserid = famtModUserid;
		this.famtModDate = famtModDate;
		this.famtUser1 = famtUser1;
		this.famtUser2 = famtUser2;
		this.famtChr01 = famtChr01;
		this.famtDec01 = famtDec01;
		this.famtLog01 = famtLog01;
		this.famtDte01 = famtDte01;
		this.famtInt01 = famtInt01;
		this.famtQadc01 = famtQadc01;
		this.famtQadd01 = famtQadd01;
		this.famtQadl01 = famtQadl01;
		this.famtQadi01 = famtQadi01;
		this.famtQadt01 = famtQadt01;
		this.famtQadc02 = famtQadc02;
		this.oidFamtMstr = oidFamtMstr;
	}

	// Property accessors

	public FamtMstrId getId() {
		return this.id;
	}

	public void setId(FamtMstrId id) {
		this.id = id;
	}

	public String getFamtType() {
		return this.famtType;
	}

	public void setFamtType(String famtType) {
		this.famtType = famtType;
	}

	public Boolean getFamtSwitchsl() {
		return this.famtSwitchsl;
	}

	public void setFamtSwitchsl(Boolean famtSwitchsl) {
		this.famtSwitchsl = famtSwitchsl;
	}

	public String getFamtDesc() {
		return this.famtDesc;
	}

	public void setFamtDesc(String famtDesc) {
		this.famtDesc = famtDesc;
	}

	public Double getFamtElife() {
		return this.famtElife;
	}

	public void setFamtElife(Double famtElife) {
		this.famtElife = famtElife;
	}

	public Boolean getFamtActive() {
		return this.famtActive;
	}

	public void setFamtActive(Boolean famtActive) {
		this.famtActive = famtActive;
	}

	public Double getFamtPerc() {
		return this.famtPerc;
	}

	public void setFamtPerc(Double famtPerc) {
		this.famtPerc = famtPerc;
	}

	public Boolean getFamtSalv() {
		return this.famtSalv;
	}

	public void setFamtSalv(Boolean famtSalv) {
		this.famtSalv = famtSalv;
	}

	public String getFamtConv() {
		return this.famtConv;
	}

	public void setFamtConv(String famtConv) {
		this.famtConv = famtConv;
	}

	public Boolean getFamtActualdays() {
		return this.famtActualdays;
	}

	public void setFamtActualdays(Boolean famtActualdays) {
		this.famtActualdays = famtActualdays;
	}

	public String getFamtModUserid() {
		return this.famtModUserid;
	}

	public void setFamtModUserid(String famtModUserid) {
		this.famtModUserid = famtModUserid;
	}

	public Date getFamtModDate() {
		return this.famtModDate;
	}

	public void setFamtModDate(Date famtModDate) {
		this.famtModDate = famtModDate;
	}

	public String getFamtUser1() {
		return this.famtUser1;
	}

	public void setFamtUser1(String famtUser1) {
		this.famtUser1 = famtUser1;
	}

	public String getFamtUser2() {
		return this.famtUser2;
	}

	public void setFamtUser2(String famtUser2) {
		this.famtUser2 = famtUser2;
	}

	public String getFamtChr01() {
		return this.famtChr01;
	}

	public void setFamtChr01(String famtChr01) {
		this.famtChr01 = famtChr01;
	}

	public Double getFamtDec01() {
		return this.famtDec01;
	}

	public void setFamtDec01(Double famtDec01) {
		this.famtDec01 = famtDec01;
	}

	public Boolean getFamtLog01() {
		return this.famtLog01;
	}

	public void setFamtLog01(Boolean famtLog01) {
		this.famtLog01 = famtLog01;
	}

	public Date getFamtDte01() {
		return this.famtDte01;
	}

	public void setFamtDte01(Date famtDte01) {
		this.famtDte01 = famtDte01;
	}

	public Integer getFamtInt01() {
		return this.famtInt01;
	}

	public void setFamtInt01(Integer famtInt01) {
		this.famtInt01 = famtInt01;
	}

	public String getFamtQadc01() {
		return this.famtQadc01;
	}

	public void setFamtQadc01(String famtQadc01) {
		this.famtQadc01 = famtQadc01;
	}

	public Double getFamtQadd01() {
		return this.famtQadd01;
	}

	public void setFamtQadd01(Double famtQadd01) {
		this.famtQadd01 = famtQadd01;
	}

	public Boolean getFamtQadl01() {
		return this.famtQadl01;
	}

	public void setFamtQadl01(Boolean famtQadl01) {
		this.famtQadl01 = famtQadl01;
	}

	public Integer getFamtQadi01() {
		return this.famtQadi01;
	}

	public void setFamtQadi01(Integer famtQadi01) {
		this.famtQadi01 = famtQadi01;
	}

	public Date getFamtQadt01() {
		return this.famtQadt01;
	}

	public void setFamtQadt01(Date famtQadt01) {
		this.famtQadt01 = famtQadt01;
	}

	public String getFamtQadc02() {
		return this.famtQadc02;
	}

	public void setFamtQadc02(String famtQadc02) {
		this.famtQadc02 = famtQadc02;
	}

	public Double getOidFamtMstr() {
		return this.oidFamtMstr;
	}

	public void setOidFamtMstr(Double oidFamtMstr) {
		this.oidFamtMstr = oidFamtMstr;
	}

}