package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFaadjMstr entity provides the base persistence definition of the
 * FaadjMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFaadjMstr implements java.io.Serializable {

	// Fields

	private FaadjMstrId id;
	private String faadjType;
	private Double faadjAmt;
	private String faadjYrper;
	private Double faadjLife;
	private String faadjFamtId;
	private Boolean faadjMigrate;
	private String faadjModUserid;
	private Date faadjModDate;
	private String faadjUser1;
	private String faadjUser2;
	private String faadjChr01;
	private Double faadjDec01;
	private Boolean faadjLog01;
	private Date faadjDte01;
	private Integer faadjInt01;
	private String faadjQadc01;
	private Double faadjQadd01;
	private Boolean faadjQadl01;
	private Integer faadjQadi01;
	private Date faadjQadt01;
	private Double oidFaadjMstr;

	// Constructors

	/** default constructor */
	public AbstractFaadjMstr() {
	}

	/** minimal constructor */
	public AbstractFaadjMstr(FaadjMstrId id, String faadjType, Double faadjAmt,
			String faadjYrper, Double faadjLife, String faadjFamtId,
			Boolean faadjMigrate, String faadjModUserid, Date faadjModDate,
			String faadjUser1, String faadjUser2, String faadjChr01,
			Double faadjDec01, Boolean faadjLog01, Integer faadjInt01,
			String faadjQadc01, Double faadjQadd01, Boolean faadjQadl01,
			Integer faadjQadi01, Double oidFaadjMstr) {
		this.id = id;
		this.faadjType = faadjType;
		this.faadjAmt = faadjAmt;
		this.faadjYrper = faadjYrper;
		this.faadjLife = faadjLife;
		this.faadjFamtId = faadjFamtId;
		this.faadjMigrate = faadjMigrate;
		this.faadjModUserid = faadjModUserid;
		this.faadjModDate = faadjModDate;
		this.faadjUser1 = faadjUser1;
		this.faadjUser2 = faadjUser2;
		this.faadjChr01 = faadjChr01;
		this.faadjDec01 = faadjDec01;
		this.faadjLog01 = faadjLog01;
		this.faadjInt01 = faadjInt01;
		this.faadjQadc01 = faadjQadc01;
		this.faadjQadd01 = faadjQadd01;
		this.faadjQadl01 = faadjQadl01;
		this.faadjQadi01 = faadjQadi01;
		this.oidFaadjMstr = oidFaadjMstr;
	}

	/** full constructor */
	public AbstractFaadjMstr(FaadjMstrId id, String faadjType, Double faadjAmt,
			String faadjYrper, Double faadjLife, String faadjFamtId,
			Boolean faadjMigrate, String faadjModUserid, Date faadjModDate,
			String faadjUser1, String faadjUser2, String faadjChr01,
			Double faadjDec01, Boolean faadjLog01, Date faadjDte01,
			Integer faadjInt01, String faadjQadc01, Double faadjQadd01,
			Boolean faadjQadl01, Integer faadjQadi01, Date faadjQadt01,
			Double oidFaadjMstr) {
		this.id = id;
		this.faadjType = faadjType;
		this.faadjAmt = faadjAmt;
		this.faadjYrper = faadjYrper;
		this.faadjLife = faadjLife;
		this.faadjFamtId = faadjFamtId;
		this.faadjMigrate = faadjMigrate;
		this.faadjModUserid = faadjModUserid;
		this.faadjModDate = faadjModDate;
		this.faadjUser1 = faadjUser1;
		this.faadjUser2 = faadjUser2;
		this.faadjChr01 = faadjChr01;
		this.faadjDec01 = faadjDec01;
		this.faadjLog01 = faadjLog01;
		this.faadjDte01 = faadjDte01;
		this.faadjInt01 = faadjInt01;
		this.faadjQadc01 = faadjQadc01;
		this.faadjQadd01 = faadjQadd01;
		this.faadjQadl01 = faadjQadl01;
		this.faadjQadi01 = faadjQadi01;
		this.faadjQadt01 = faadjQadt01;
		this.oidFaadjMstr = oidFaadjMstr;
	}

	// Property accessors

	public FaadjMstrId getId() {
		return this.id;
	}

	public void setId(FaadjMstrId id) {
		this.id = id;
	}

	public String getFaadjType() {
		return this.faadjType;
	}

	public void setFaadjType(String faadjType) {
		this.faadjType = faadjType;
	}

	public Double getFaadjAmt() {
		return this.faadjAmt;
	}

	public void setFaadjAmt(Double faadjAmt) {
		this.faadjAmt = faadjAmt;
	}

	public String getFaadjYrper() {
		return this.faadjYrper;
	}

	public void setFaadjYrper(String faadjYrper) {
		this.faadjYrper = faadjYrper;
	}

	public Double getFaadjLife() {
		return this.faadjLife;
	}

	public void setFaadjLife(Double faadjLife) {
		this.faadjLife = faadjLife;
	}

	public String getFaadjFamtId() {
		return this.faadjFamtId;
	}

	public void setFaadjFamtId(String faadjFamtId) {
		this.faadjFamtId = faadjFamtId;
	}

	public Boolean getFaadjMigrate() {
		return this.faadjMigrate;
	}

	public void setFaadjMigrate(Boolean faadjMigrate) {
		this.faadjMigrate = faadjMigrate;
	}

	public String getFaadjModUserid() {
		return this.faadjModUserid;
	}

	public void setFaadjModUserid(String faadjModUserid) {
		this.faadjModUserid = faadjModUserid;
	}

	public Date getFaadjModDate() {
		return this.faadjModDate;
	}

	public void setFaadjModDate(Date faadjModDate) {
		this.faadjModDate = faadjModDate;
	}

	public String getFaadjUser1() {
		return this.faadjUser1;
	}

	public void setFaadjUser1(String faadjUser1) {
		this.faadjUser1 = faadjUser1;
	}

	public String getFaadjUser2() {
		return this.faadjUser2;
	}

	public void setFaadjUser2(String faadjUser2) {
		this.faadjUser2 = faadjUser2;
	}

	public String getFaadjChr01() {
		return this.faadjChr01;
	}

	public void setFaadjChr01(String faadjChr01) {
		this.faadjChr01 = faadjChr01;
	}

	public Double getFaadjDec01() {
		return this.faadjDec01;
	}

	public void setFaadjDec01(Double faadjDec01) {
		this.faadjDec01 = faadjDec01;
	}

	public Boolean getFaadjLog01() {
		return this.faadjLog01;
	}

	public void setFaadjLog01(Boolean faadjLog01) {
		this.faadjLog01 = faadjLog01;
	}

	public Date getFaadjDte01() {
		return this.faadjDte01;
	}

	public void setFaadjDte01(Date faadjDte01) {
		this.faadjDte01 = faadjDte01;
	}

	public Integer getFaadjInt01() {
		return this.faadjInt01;
	}

	public void setFaadjInt01(Integer faadjInt01) {
		this.faadjInt01 = faadjInt01;
	}

	public String getFaadjQadc01() {
		return this.faadjQadc01;
	}

	public void setFaadjQadc01(String faadjQadc01) {
		this.faadjQadc01 = faadjQadc01;
	}

	public Double getFaadjQadd01() {
		return this.faadjQadd01;
	}

	public void setFaadjQadd01(Double faadjQadd01) {
		this.faadjQadd01 = faadjQadd01;
	}

	public Boolean getFaadjQadl01() {
		return this.faadjQadl01;
	}

	public void setFaadjQadl01(Boolean faadjQadl01) {
		this.faadjQadl01 = faadjQadl01;
	}

	public Integer getFaadjQadi01() {
		return this.faadjQadi01;
	}

	public void setFaadjQadi01(Integer faadjQadi01) {
		this.faadjQadi01 = faadjQadi01;
	}

	public Date getFaadjQadt01() {
		return this.faadjQadt01;
	}

	public void setFaadjQadt01(Date faadjQadt01) {
		this.faadjQadt01 = faadjQadt01;
	}

	public Double getOidFaadjMstr() {
		return this.oidFaadjMstr;
	}

	public void setOidFaadjMstr(Double oidFaadjMstr) {
		this.oidFaadjMstr = oidFaadjMstr;
	}

}