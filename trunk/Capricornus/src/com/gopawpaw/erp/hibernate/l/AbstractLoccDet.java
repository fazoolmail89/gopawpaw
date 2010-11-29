package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLoccDet entity provides the base persistence definition of the
 * LoccDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLoccDet implements java.io.Serializable {

	// Fields

	private LoccDetId id;
	private Boolean loccPrimaryLoc;
	private Date loccModDate;
	private String loccModUserid;
	private String loccUserc01;
	private String loccUserc02;
	private Double loccUserd01;
	private Date loccUsert01;
	private Integer loccUseri01;
	private Boolean loccUserl01;
	private String loccQadc01;
	private Double loccQadd01;
	private Integer loccQadi01;
	private Boolean loccQadl01;
	private Date loccQadt01;
	private Double oidLoccDet;

	// Constructors

	/** default constructor */
	public AbstractLoccDet() {
	}

	/** minimal constructor */
	public AbstractLoccDet(LoccDetId id, Boolean loccPrimaryLoc,
			Date loccModDate, String loccModUserid, String loccUserc01,
			String loccUserc02, Double loccUserd01, Integer loccUseri01,
			Boolean loccUserl01, String loccQadc01, Double loccQadd01,
			Integer loccQadi01, Boolean loccQadl01, Double oidLoccDet) {
		this.id = id;
		this.loccPrimaryLoc = loccPrimaryLoc;
		this.loccModDate = loccModDate;
		this.loccModUserid = loccModUserid;
		this.loccUserc01 = loccUserc01;
		this.loccUserc02 = loccUserc02;
		this.loccUserd01 = loccUserd01;
		this.loccUseri01 = loccUseri01;
		this.loccUserl01 = loccUserl01;
		this.loccQadc01 = loccQadc01;
		this.loccQadd01 = loccQadd01;
		this.loccQadi01 = loccQadi01;
		this.loccQadl01 = loccQadl01;
		this.oidLoccDet = oidLoccDet;
	}

	/** full constructor */
	public AbstractLoccDet(LoccDetId id, Boolean loccPrimaryLoc,
			Date loccModDate, String loccModUserid, String loccUserc01,
			String loccUserc02, Double loccUserd01, Date loccUsert01,
			Integer loccUseri01, Boolean loccUserl01, String loccQadc01,
			Double loccQadd01, Integer loccQadi01, Boolean loccQadl01,
			Date loccQadt01, Double oidLoccDet) {
		this.id = id;
		this.loccPrimaryLoc = loccPrimaryLoc;
		this.loccModDate = loccModDate;
		this.loccModUserid = loccModUserid;
		this.loccUserc01 = loccUserc01;
		this.loccUserc02 = loccUserc02;
		this.loccUserd01 = loccUserd01;
		this.loccUsert01 = loccUsert01;
		this.loccUseri01 = loccUseri01;
		this.loccUserl01 = loccUserl01;
		this.loccQadc01 = loccQadc01;
		this.loccQadd01 = loccQadd01;
		this.loccQadi01 = loccQadi01;
		this.loccQadl01 = loccQadl01;
		this.loccQadt01 = loccQadt01;
		this.oidLoccDet = oidLoccDet;
	}

	// Property accessors

	public LoccDetId getId() {
		return this.id;
	}

	public void setId(LoccDetId id) {
		this.id = id;
	}

	public Boolean getLoccPrimaryLoc() {
		return this.loccPrimaryLoc;
	}

	public void setLoccPrimaryLoc(Boolean loccPrimaryLoc) {
		this.loccPrimaryLoc = loccPrimaryLoc;
	}

	public Date getLoccModDate() {
		return this.loccModDate;
	}

	public void setLoccModDate(Date loccModDate) {
		this.loccModDate = loccModDate;
	}

	public String getLoccModUserid() {
		return this.loccModUserid;
	}

	public void setLoccModUserid(String loccModUserid) {
		this.loccModUserid = loccModUserid;
	}

	public String getLoccUserc01() {
		return this.loccUserc01;
	}

	public void setLoccUserc01(String loccUserc01) {
		this.loccUserc01 = loccUserc01;
	}

	public String getLoccUserc02() {
		return this.loccUserc02;
	}

	public void setLoccUserc02(String loccUserc02) {
		this.loccUserc02 = loccUserc02;
	}

	public Double getLoccUserd01() {
		return this.loccUserd01;
	}

	public void setLoccUserd01(Double loccUserd01) {
		this.loccUserd01 = loccUserd01;
	}

	public Date getLoccUsert01() {
		return this.loccUsert01;
	}

	public void setLoccUsert01(Date loccUsert01) {
		this.loccUsert01 = loccUsert01;
	}

	public Integer getLoccUseri01() {
		return this.loccUseri01;
	}

	public void setLoccUseri01(Integer loccUseri01) {
		this.loccUseri01 = loccUseri01;
	}

	public Boolean getLoccUserl01() {
		return this.loccUserl01;
	}

	public void setLoccUserl01(Boolean loccUserl01) {
		this.loccUserl01 = loccUserl01;
	}

	public String getLoccQadc01() {
		return this.loccQadc01;
	}

	public void setLoccQadc01(String loccQadc01) {
		this.loccQadc01 = loccQadc01;
	}

	public Double getLoccQadd01() {
		return this.loccQadd01;
	}

	public void setLoccQadd01(Double loccQadd01) {
		this.loccQadd01 = loccQadd01;
	}

	public Integer getLoccQadi01() {
		return this.loccQadi01;
	}

	public void setLoccQadi01(Integer loccQadi01) {
		this.loccQadi01 = loccQadi01;
	}

	public Boolean getLoccQadl01() {
		return this.loccQadl01;
	}

	public void setLoccQadl01(Boolean loccQadl01) {
		this.loccQadl01 = loccQadl01;
	}

	public Date getLoccQadt01() {
		return this.loccQadt01;
	}

	public void setLoccQadt01(Date loccQadt01) {
		this.loccQadt01 = loccQadt01;
	}

	public Double getOidLoccDet() {
		return this.oidLoccDet;
	}

	public void setOidLoccDet(Double oidLoccDet) {
		this.oidLoccDet = oidLoccDet;
	}

}