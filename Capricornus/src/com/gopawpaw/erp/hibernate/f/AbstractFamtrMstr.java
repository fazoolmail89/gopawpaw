package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFamtrMstr entity provides the base persistence definition of the
 * FamtrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFamtrMstr implements java.io.Serializable {

	// Fields

	private FamtrMstrId id;
	private String famtrDesc;
	private Integer famtrInit;
	private Date famtrInitdt;
	private Integer famtrRollover;
	private String famtrModUserid;
	private Date famtrModDate;
	private String famtrUser1;
	private String famtrUser2;
	private String famtrChr01;
	private Double famtrDec01;
	private Boolean famtrLog01;
	private Date famtrDte01;
	private Integer famtrInt01;
	private String famtrQadc01;
	private Double famtrQadd01;
	private Boolean famtrQadl01;
	private Integer famtrQadi01;
	private Date famtrQadt01;
	private Double oidFamtrMstr;

	// Constructors

	/** default constructor */
	public AbstractFamtrMstr() {
	}

	/** minimal constructor */
	public AbstractFamtrMstr(FamtrMstrId id, String famtrDesc,
			Integer famtrInit, Date famtrInitdt, Integer famtrRollover,
			String famtrModUserid, Date famtrModDate, String famtrUser1,
			String famtrUser2, String famtrChr01, Double famtrDec01,
			Boolean famtrLog01, Integer famtrInt01, String famtrQadc01,
			Double famtrQadd01, Boolean famtrQadl01, Integer famtrQadi01,
			Double oidFamtrMstr) {
		this.id = id;
		this.famtrDesc = famtrDesc;
		this.famtrInit = famtrInit;
		this.famtrInitdt = famtrInitdt;
		this.famtrRollover = famtrRollover;
		this.famtrModUserid = famtrModUserid;
		this.famtrModDate = famtrModDate;
		this.famtrUser1 = famtrUser1;
		this.famtrUser2 = famtrUser2;
		this.famtrChr01 = famtrChr01;
		this.famtrDec01 = famtrDec01;
		this.famtrLog01 = famtrLog01;
		this.famtrInt01 = famtrInt01;
		this.famtrQadc01 = famtrQadc01;
		this.famtrQadd01 = famtrQadd01;
		this.famtrQadl01 = famtrQadl01;
		this.famtrQadi01 = famtrQadi01;
		this.oidFamtrMstr = oidFamtrMstr;
	}

	/** full constructor */
	public AbstractFamtrMstr(FamtrMstrId id, String famtrDesc,
			Integer famtrInit, Date famtrInitdt, Integer famtrRollover,
			String famtrModUserid, Date famtrModDate, String famtrUser1,
			String famtrUser2, String famtrChr01, Double famtrDec01,
			Boolean famtrLog01, Date famtrDte01, Integer famtrInt01,
			String famtrQadc01, Double famtrQadd01, Boolean famtrQadl01,
			Integer famtrQadi01, Date famtrQadt01, Double oidFamtrMstr) {
		this.id = id;
		this.famtrDesc = famtrDesc;
		this.famtrInit = famtrInit;
		this.famtrInitdt = famtrInitdt;
		this.famtrRollover = famtrRollover;
		this.famtrModUserid = famtrModUserid;
		this.famtrModDate = famtrModDate;
		this.famtrUser1 = famtrUser1;
		this.famtrUser2 = famtrUser2;
		this.famtrChr01 = famtrChr01;
		this.famtrDec01 = famtrDec01;
		this.famtrLog01 = famtrLog01;
		this.famtrDte01 = famtrDte01;
		this.famtrInt01 = famtrInt01;
		this.famtrQadc01 = famtrQadc01;
		this.famtrQadd01 = famtrQadd01;
		this.famtrQadl01 = famtrQadl01;
		this.famtrQadi01 = famtrQadi01;
		this.famtrQadt01 = famtrQadt01;
		this.oidFamtrMstr = oidFamtrMstr;
	}

	// Property accessors

	public FamtrMstrId getId() {
		return this.id;
	}

	public void setId(FamtrMstrId id) {
		this.id = id;
	}

	public String getFamtrDesc() {
		return this.famtrDesc;
	}

	public void setFamtrDesc(String famtrDesc) {
		this.famtrDesc = famtrDesc;
	}

	public Integer getFamtrInit() {
		return this.famtrInit;
	}

	public void setFamtrInit(Integer famtrInit) {
		this.famtrInit = famtrInit;
	}

	public Date getFamtrInitdt() {
		return this.famtrInitdt;
	}

	public void setFamtrInitdt(Date famtrInitdt) {
		this.famtrInitdt = famtrInitdt;
	}

	public Integer getFamtrRollover() {
		return this.famtrRollover;
	}

	public void setFamtrRollover(Integer famtrRollover) {
		this.famtrRollover = famtrRollover;
	}

	public String getFamtrModUserid() {
		return this.famtrModUserid;
	}

	public void setFamtrModUserid(String famtrModUserid) {
		this.famtrModUserid = famtrModUserid;
	}

	public Date getFamtrModDate() {
		return this.famtrModDate;
	}

	public void setFamtrModDate(Date famtrModDate) {
		this.famtrModDate = famtrModDate;
	}

	public String getFamtrUser1() {
		return this.famtrUser1;
	}

	public void setFamtrUser1(String famtrUser1) {
		this.famtrUser1 = famtrUser1;
	}

	public String getFamtrUser2() {
		return this.famtrUser2;
	}

	public void setFamtrUser2(String famtrUser2) {
		this.famtrUser2 = famtrUser2;
	}

	public String getFamtrChr01() {
		return this.famtrChr01;
	}

	public void setFamtrChr01(String famtrChr01) {
		this.famtrChr01 = famtrChr01;
	}

	public Double getFamtrDec01() {
		return this.famtrDec01;
	}

	public void setFamtrDec01(Double famtrDec01) {
		this.famtrDec01 = famtrDec01;
	}

	public Boolean getFamtrLog01() {
		return this.famtrLog01;
	}

	public void setFamtrLog01(Boolean famtrLog01) {
		this.famtrLog01 = famtrLog01;
	}

	public Date getFamtrDte01() {
		return this.famtrDte01;
	}

	public void setFamtrDte01(Date famtrDte01) {
		this.famtrDte01 = famtrDte01;
	}

	public Integer getFamtrInt01() {
		return this.famtrInt01;
	}

	public void setFamtrInt01(Integer famtrInt01) {
		this.famtrInt01 = famtrInt01;
	}

	public String getFamtrQadc01() {
		return this.famtrQadc01;
	}

	public void setFamtrQadc01(String famtrQadc01) {
		this.famtrQadc01 = famtrQadc01;
	}

	public Double getFamtrQadd01() {
		return this.famtrQadd01;
	}

	public void setFamtrQadd01(Double famtrQadd01) {
		this.famtrQadd01 = famtrQadd01;
	}

	public Boolean getFamtrQadl01() {
		return this.famtrQadl01;
	}

	public void setFamtrQadl01(Boolean famtrQadl01) {
		this.famtrQadl01 = famtrQadl01;
	}

	public Integer getFamtrQadi01() {
		return this.famtrQadi01;
	}

	public void setFamtrQadi01(Integer famtrQadi01) {
		this.famtrQadi01 = famtrQadi01;
	}

	public Date getFamtrQadt01() {
		return this.famtrQadt01;
	}

	public void setFamtrQadt01(Date famtrQadt01) {
		this.famtrQadt01 = famtrQadt01;
	}

	public Double getOidFamtrMstr() {
		return this.oidFamtrMstr;
	}

	public void setOidFamtrMstr(Double oidFamtrMstr) {
		this.oidFamtrMstr = oidFamtrMstr;
	}

}