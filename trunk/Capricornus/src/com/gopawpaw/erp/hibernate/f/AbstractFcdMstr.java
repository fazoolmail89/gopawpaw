package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFcdMstr entity provides the base persistence definition of the
 * FcdMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFcdMstr implements java.io.Serializable {

	// Fields

	private FcdMstrId id;
	private String fcdFcgContract;
	private String fcdFcgCovered;
	private String fcdFcgFixed;
	private String fcdFcgBillable;
	private String fcdUser1;
	private String fcdUser2;
	private Date fcdModDate;
	private String fcdModUserid;
	private String fcdChr01;
	private String fcdChr02;
	private Integer fcdInt01;
	private Double fcdDec01;
	private Date fcdDte01;
	private String fcdQadc01;
	private String fcdQadc02;
	private Date fcdQadt01;
	private Double fcdQadd01;
	private Integer fcdQadi01;
	private Boolean fcdLog01;
	private Boolean fcdQadl01;
	private String fcdFcgWarranty;
	private Double oidFcdMstr;

	// Constructors

	/** default constructor */
	public AbstractFcdMstr() {
	}

	/** minimal constructor */
	public AbstractFcdMstr(FcdMstrId id, Double oidFcdMstr) {
		this.id = id;
		this.oidFcdMstr = oidFcdMstr;
	}

	/** full constructor */
	public AbstractFcdMstr(FcdMstrId id, String fcdFcgContract,
			String fcdFcgCovered, String fcdFcgFixed, String fcdFcgBillable,
			String fcdUser1, String fcdUser2, Date fcdModDate,
			String fcdModUserid, String fcdChr01, String fcdChr02,
			Integer fcdInt01, Double fcdDec01, Date fcdDte01, String fcdQadc01,
			String fcdQadc02, Date fcdQadt01, Double fcdQadd01,
			Integer fcdQadi01, Boolean fcdLog01, Boolean fcdQadl01,
			String fcdFcgWarranty, Double oidFcdMstr) {
		this.id = id;
		this.fcdFcgContract = fcdFcgContract;
		this.fcdFcgCovered = fcdFcgCovered;
		this.fcdFcgFixed = fcdFcgFixed;
		this.fcdFcgBillable = fcdFcgBillable;
		this.fcdUser1 = fcdUser1;
		this.fcdUser2 = fcdUser2;
		this.fcdModDate = fcdModDate;
		this.fcdModUserid = fcdModUserid;
		this.fcdChr01 = fcdChr01;
		this.fcdChr02 = fcdChr02;
		this.fcdInt01 = fcdInt01;
		this.fcdDec01 = fcdDec01;
		this.fcdDte01 = fcdDte01;
		this.fcdQadc01 = fcdQadc01;
		this.fcdQadc02 = fcdQadc02;
		this.fcdQadt01 = fcdQadt01;
		this.fcdQadd01 = fcdQadd01;
		this.fcdQadi01 = fcdQadi01;
		this.fcdLog01 = fcdLog01;
		this.fcdQadl01 = fcdQadl01;
		this.fcdFcgWarranty = fcdFcgWarranty;
		this.oidFcdMstr = oidFcdMstr;
	}

	// Property accessors

	public FcdMstrId getId() {
		return this.id;
	}

	public void setId(FcdMstrId id) {
		this.id = id;
	}

	public String getFcdFcgContract() {
		return this.fcdFcgContract;
	}

	public void setFcdFcgContract(String fcdFcgContract) {
		this.fcdFcgContract = fcdFcgContract;
	}

	public String getFcdFcgCovered() {
		return this.fcdFcgCovered;
	}

	public void setFcdFcgCovered(String fcdFcgCovered) {
		this.fcdFcgCovered = fcdFcgCovered;
	}

	public String getFcdFcgFixed() {
		return this.fcdFcgFixed;
	}

	public void setFcdFcgFixed(String fcdFcgFixed) {
		this.fcdFcgFixed = fcdFcgFixed;
	}

	public String getFcdFcgBillable() {
		return this.fcdFcgBillable;
	}

	public void setFcdFcgBillable(String fcdFcgBillable) {
		this.fcdFcgBillable = fcdFcgBillable;
	}

	public String getFcdUser1() {
		return this.fcdUser1;
	}

	public void setFcdUser1(String fcdUser1) {
		this.fcdUser1 = fcdUser1;
	}

	public String getFcdUser2() {
		return this.fcdUser2;
	}

	public void setFcdUser2(String fcdUser2) {
		this.fcdUser2 = fcdUser2;
	}

	public Date getFcdModDate() {
		return this.fcdModDate;
	}

	public void setFcdModDate(Date fcdModDate) {
		this.fcdModDate = fcdModDate;
	}

	public String getFcdModUserid() {
		return this.fcdModUserid;
	}

	public void setFcdModUserid(String fcdModUserid) {
		this.fcdModUserid = fcdModUserid;
	}

	public String getFcdChr01() {
		return this.fcdChr01;
	}

	public void setFcdChr01(String fcdChr01) {
		this.fcdChr01 = fcdChr01;
	}

	public String getFcdChr02() {
		return this.fcdChr02;
	}

	public void setFcdChr02(String fcdChr02) {
		this.fcdChr02 = fcdChr02;
	}

	public Integer getFcdInt01() {
		return this.fcdInt01;
	}

	public void setFcdInt01(Integer fcdInt01) {
		this.fcdInt01 = fcdInt01;
	}

	public Double getFcdDec01() {
		return this.fcdDec01;
	}

	public void setFcdDec01(Double fcdDec01) {
		this.fcdDec01 = fcdDec01;
	}

	public Date getFcdDte01() {
		return this.fcdDte01;
	}

	public void setFcdDte01(Date fcdDte01) {
		this.fcdDte01 = fcdDte01;
	}

	public String getFcdQadc01() {
		return this.fcdQadc01;
	}

	public void setFcdQadc01(String fcdQadc01) {
		this.fcdQadc01 = fcdQadc01;
	}

	public String getFcdQadc02() {
		return this.fcdQadc02;
	}

	public void setFcdQadc02(String fcdQadc02) {
		this.fcdQadc02 = fcdQadc02;
	}

	public Date getFcdQadt01() {
		return this.fcdQadt01;
	}

	public void setFcdQadt01(Date fcdQadt01) {
		this.fcdQadt01 = fcdQadt01;
	}

	public Double getFcdQadd01() {
		return this.fcdQadd01;
	}

	public void setFcdQadd01(Double fcdQadd01) {
		this.fcdQadd01 = fcdQadd01;
	}

	public Integer getFcdQadi01() {
		return this.fcdQadi01;
	}

	public void setFcdQadi01(Integer fcdQadi01) {
		this.fcdQadi01 = fcdQadi01;
	}

	public Boolean getFcdLog01() {
		return this.fcdLog01;
	}

	public void setFcdLog01(Boolean fcdLog01) {
		this.fcdLog01 = fcdLog01;
	}

	public Boolean getFcdQadl01() {
		return this.fcdQadl01;
	}

	public void setFcdQadl01(Boolean fcdQadl01) {
		this.fcdQadl01 = fcdQadl01;
	}

	public String getFcdFcgWarranty() {
		return this.fcdFcgWarranty;
	}

	public void setFcdFcgWarranty(String fcdFcgWarranty) {
		this.fcdFcgWarranty = fcdFcgWarranty;
	}

	public Double getOidFcdMstr() {
		return this.oidFcdMstr;
	}

	public void setOidFcdMstr(Double oidFcdMstr) {
		this.oidFcdMstr = oidFcdMstr;
	}

}