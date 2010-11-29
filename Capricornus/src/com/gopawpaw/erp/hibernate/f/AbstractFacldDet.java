package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFacldDet entity provides the base persistence definition of the
 * FacldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFacldDet implements java.io.Serializable {

	// Fields

	private FacldDetId id;
	private Date facldStart;
	private Date facldEnd;
	private String facldModUserid;
	private Date facldModDate;
	private String facldUser1;
	private String facldUser2;
	private String facldChr01;
	private Double facldDec01;
	private Boolean facldLog01;
	private Date facldDte01;
	private Integer facldInt01;
	private String facldQadc01;
	private Double facldQadd01;
	private Boolean facldQadl01;
	private Integer facldQadi01;
	private Date facldQadt01;
	private Double oidFacldDet;

	// Constructors

	/** default constructor */
	public AbstractFacldDet() {
	}

	/** minimal constructor */
	public AbstractFacldDet(FacldDetId id, Date facldStart, Date facldEnd,
			String facldModUserid, Date facldModDate, String facldUser1,
			String facldUser2, String facldChr01, Double facldDec01,
			Boolean facldLog01, Integer facldInt01, String facldQadc01,
			Double facldQadd01, Boolean facldQadl01, Integer facldQadi01,
			Double oidFacldDet) {
		this.id = id;
		this.facldStart = facldStart;
		this.facldEnd = facldEnd;
		this.facldModUserid = facldModUserid;
		this.facldModDate = facldModDate;
		this.facldUser1 = facldUser1;
		this.facldUser2 = facldUser2;
		this.facldChr01 = facldChr01;
		this.facldDec01 = facldDec01;
		this.facldLog01 = facldLog01;
		this.facldInt01 = facldInt01;
		this.facldQadc01 = facldQadc01;
		this.facldQadd01 = facldQadd01;
		this.facldQadl01 = facldQadl01;
		this.facldQadi01 = facldQadi01;
		this.oidFacldDet = oidFacldDet;
	}

	/** full constructor */
	public AbstractFacldDet(FacldDetId id, Date facldStart, Date facldEnd,
			String facldModUserid, Date facldModDate, String facldUser1,
			String facldUser2, String facldChr01, Double facldDec01,
			Boolean facldLog01, Date facldDte01, Integer facldInt01,
			String facldQadc01, Double facldQadd01, Boolean facldQadl01,
			Integer facldQadi01, Date facldQadt01, Double oidFacldDet) {
		this.id = id;
		this.facldStart = facldStart;
		this.facldEnd = facldEnd;
		this.facldModUserid = facldModUserid;
		this.facldModDate = facldModDate;
		this.facldUser1 = facldUser1;
		this.facldUser2 = facldUser2;
		this.facldChr01 = facldChr01;
		this.facldDec01 = facldDec01;
		this.facldLog01 = facldLog01;
		this.facldDte01 = facldDte01;
		this.facldInt01 = facldInt01;
		this.facldQadc01 = facldQadc01;
		this.facldQadd01 = facldQadd01;
		this.facldQadl01 = facldQadl01;
		this.facldQadi01 = facldQadi01;
		this.facldQadt01 = facldQadt01;
		this.oidFacldDet = oidFacldDet;
	}

	// Property accessors

	public FacldDetId getId() {
		return this.id;
	}

	public void setId(FacldDetId id) {
		this.id = id;
	}

	public Date getFacldStart() {
		return this.facldStart;
	}

	public void setFacldStart(Date facldStart) {
		this.facldStart = facldStart;
	}

	public Date getFacldEnd() {
		return this.facldEnd;
	}

	public void setFacldEnd(Date facldEnd) {
		this.facldEnd = facldEnd;
	}

	public String getFacldModUserid() {
		return this.facldModUserid;
	}

	public void setFacldModUserid(String facldModUserid) {
		this.facldModUserid = facldModUserid;
	}

	public Date getFacldModDate() {
		return this.facldModDate;
	}

	public void setFacldModDate(Date facldModDate) {
		this.facldModDate = facldModDate;
	}

	public String getFacldUser1() {
		return this.facldUser1;
	}

	public void setFacldUser1(String facldUser1) {
		this.facldUser1 = facldUser1;
	}

	public String getFacldUser2() {
		return this.facldUser2;
	}

	public void setFacldUser2(String facldUser2) {
		this.facldUser2 = facldUser2;
	}

	public String getFacldChr01() {
		return this.facldChr01;
	}

	public void setFacldChr01(String facldChr01) {
		this.facldChr01 = facldChr01;
	}

	public Double getFacldDec01() {
		return this.facldDec01;
	}

	public void setFacldDec01(Double facldDec01) {
		this.facldDec01 = facldDec01;
	}

	public Boolean getFacldLog01() {
		return this.facldLog01;
	}

	public void setFacldLog01(Boolean facldLog01) {
		this.facldLog01 = facldLog01;
	}

	public Date getFacldDte01() {
		return this.facldDte01;
	}

	public void setFacldDte01(Date facldDte01) {
		this.facldDte01 = facldDte01;
	}

	public Integer getFacldInt01() {
		return this.facldInt01;
	}

	public void setFacldInt01(Integer facldInt01) {
		this.facldInt01 = facldInt01;
	}

	public String getFacldQadc01() {
		return this.facldQadc01;
	}

	public void setFacldQadc01(String facldQadc01) {
		this.facldQadc01 = facldQadc01;
	}

	public Double getFacldQadd01() {
		return this.facldQadd01;
	}

	public void setFacldQadd01(Double facldQadd01) {
		this.facldQadd01 = facldQadd01;
	}

	public Boolean getFacldQadl01() {
		return this.facldQadl01;
	}

	public void setFacldQadl01(Boolean facldQadl01) {
		this.facldQadl01 = facldQadl01;
	}

	public Integer getFacldQadi01() {
		return this.facldQadi01;
	}

	public void setFacldQadi01(Integer facldQadi01) {
		this.facldQadi01 = facldQadi01;
	}

	public Date getFacldQadt01() {
		return this.facldQadt01;
	}

	public void setFacldQadt01(Date facldQadt01) {
		this.facldQadt01 = facldQadt01;
	}

	public Double getOidFacldDet() {
		return this.oidFacldDet;
	}

	public void setOidFacldDet(Double oidFacldDet) {
		this.oidFacldDet = oidFacldDet;
	}

}