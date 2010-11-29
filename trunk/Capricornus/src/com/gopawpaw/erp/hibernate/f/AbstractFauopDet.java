package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFauopDet entity provides the base persistence definition of the
 * FauopDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFauopDet implements java.io.Serializable {

	// Fields

	private FauopDetId id;
	private Integer fauopUpper;
	private Integer fauopAccup;
	private String fauopModUserid;
	private Date fauopModDate;
	private String fauopUser1;
	private String fauopUser2;
	private String fauopChr01;
	private Double fauopDec01;
	private Boolean fauopLog01;
	private Date fauopDte01;
	private Integer fauopInt01;
	private String fauopQadc01;
	private Double fauopQadd01;
	private Boolean fauopQadl01;
	private Integer fauopQadi01;
	private Date fauopQadt01;
	private Double oidFauopDet;

	// Constructors

	/** default constructor */
	public AbstractFauopDet() {
	}

	/** minimal constructor */
	public AbstractFauopDet(FauopDetId id, Integer fauopUpper,
			Integer fauopAccup, String fauopModUserid, Date fauopModDate,
			String fauopUser1, String fauopUser2, String fauopChr01,
			Double fauopDec01, Boolean fauopLog01, Integer fauopInt01,
			String fauopQadc01, Double fauopQadd01, Boolean fauopQadl01,
			Integer fauopQadi01, Double oidFauopDet) {
		this.id = id;
		this.fauopUpper = fauopUpper;
		this.fauopAccup = fauopAccup;
		this.fauopModUserid = fauopModUserid;
		this.fauopModDate = fauopModDate;
		this.fauopUser1 = fauopUser1;
		this.fauopUser2 = fauopUser2;
		this.fauopChr01 = fauopChr01;
		this.fauopDec01 = fauopDec01;
		this.fauopLog01 = fauopLog01;
		this.fauopInt01 = fauopInt01;
		this.fauopQadc01 = fauopQadc01;
		this.fauopQadd01 = fauopQadd01;
		this.fauopQadl01 = fauopQadl01;
		this.fauopQadi01 = fauopQadi01;
		this.oidFauopDet = oidFauopDet;
	}

	/** full constructor */
	public AbstractFauopDet(FauopDetId id, Integer fauopUpper,
			Integer fauopAccup, String fauopModUserid, Date fauopModDate,
			String fauopUser1, String fauopUser2, String fauopChr01,
			Double fauopDec01, Boolean fauopLog01, Date fauopDte01,
			Integer fauopInt01, String fauopQadc01, Double fauopQadd01,
			Boolean fauopQadl01, Integer fauopQadi01, Date fauopQadt01,
			Double oidFauopDet) {
		this.id = id;
		this.fauopUpper = fauopUpper;
		this.fauopAccup = fauopAccup;
		this.fauopModUserid = fauopModUserid;
		this.fauopModDate = fauopModDate;
		this.fauopUser1 = fauopUser1;
		this.fauopUser2 = fauopUser2;
		this.fauopChr01 = fauopChr01;
		this.fauopDec01 = fauopDec01;
		this.fauopLog01 = fauopLog01;
		this.fauopDte01 = fauopDte01;
		this.fauopInt01 = fauopInt01;
		this.fauopQadc01 = fauopQadc01;
		this.fauopQadd01 = fauopQadd01;
		this.fauopQadl01 = fauopQadl01;
		this.fauopQadi01 = fauopQadi01;
		this.fauopQadt01 = fauopQadt01;
		this.oidFauopDet = oidFauopDet;
	}

	// Property accessors

	public FauopDetId getId() {
		return this.id;
	}

	public void setId(FauopDetId id) {
		this.id = id;
	}

	public Integer getFauopUpper() {
		return this.fauopUpper;
	}

	public void setFauopUpper(Integer fauopUpper) {
		this.fauopUpper = fauopUpper;
	}

	public Integer getFauopAccup() {
		return this.fauopAccup;
	}

	public void setFauopAccup(Integer fauopAccup) {
		this.fauopAccup = fauopAccup;
	}

	public String getFauopModUserid() {
		return this.fauopModUserid;
	}

	public void setFauopModUserid(String fauopModUserid) {
		this.fauopModUserid = fauopModUserid;
	}

	public Date getFauopModDate() {
		return this.fauopModDate;
	}

	public void setFauopModDate(Date fauopModDate) {
		this.fauopModDate = fauopModDate;
	}

	public String getFauopUser1() {
		return this.fauopUser1;
	}

	public void setFauopUser1(String fauopUser1) {
		this.fauopUser1 = fauopUser1;
	}

	public String getFauopUser2() {
		return this.fauopUser2;
	}

	public void setFauopUser2(String fauopUser2) {
		this.fauopUser2 = fauopUser2;
	}

	public String getFauopChr01() {
		return this.fauopChr01;
	}

	public void setFauopChr01(String fauopChr01) {
		this.fauopChr01 = fauopChr01;
	}

	public Double getFauopDec01() {
		return this.fauopDec01;
	}

	public void setFauopDec01(Double fauopDec01) {
		this.fauopDec01 = fauopDec01;
	}

	public Boolean getFauopLog01() {
		return this.fauopLog01;
	}

	public void setFauopLog01(Boolean fauopLog01) {
		this.fauopLog01 = fauopLog01;
	}

	public Date getFauopDte01() {
		return this.fauopDte01;
	}

	public void setFauopDte01(Date fauopDte01) {
		this.fauopDte01 = fauopDte01;
	}

	public Integer getFauopInt01() {
		return this.fauopInt01;
	}

	public void setFauopInt01(Integer fauopInt01) {
		this.fauopInt01 = fauopInt01;
	}

	public String getFauopQadc01() {
		return this.fauopQadc01;
	}

	public void setFauopQadc01(String fauopQadc01) {
		this.fauopQadc01 = fauopQadc01;
	}

	public Double getFauopQadd01() {
		return this.fauopQadd01;
	}

	public void setFauopQadd01(Double fauopQadd01) {
		this.fauopQadd01 = fauopQadd01;
	}

	public Boolean getFauopQadl01() {
		return this.fauopQadl01;
	}

	public void setFauopQadl01(Boolean fauopQadl01) {
		this.fauopQadl01 = fauopQadl01;
	}

	public Integer getFauopQadi01() {
		return this.fauopQadi01;
	}

	public void setFauopQadi01(Integer fauopQadi01) {
		this.fauopQadi01 = fauopQadi01;
	}

	public Date getFauopQadt01() {
		return this.fauopQadt01;
	}

	public void setFauopQadt01(Date fauopQadt01) {
		this.fauopQadt01 = fauopQadt01;
	}

	public Double getOidFauopDet() {
		return this.oidFauopDet;
	}

	public void setOidFauopDet(Double oidFauopDet) {
		this.oidFauopDet = oidFauopDet;
	}

}