package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGlecDet entity provides the base persistence definition of the
 * GlecDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlecDet implements java.io.Serializable {

	// Fields

	private GlecDetId id;
	private String glecModUserid;
	private Date glecModDate;
	private String glecUser1;
	private String glecUser2;
	private String glecQadc01;
	private String glecQadc02;
	private String glecConsEntity;
	private String glecSubEntity;
	private Double oidGlecDet;

	// Constructors

	/** default constructor */
	public AbstractGlecDet() {
	}

	/** full constructor */
	public AbstractGlecDet(GlecDetId id, String glecModUserid,
			Date glecModDate, String glecUser1, String glecUser2,
			String glecQadc01, String glecQadc02, String glecConsEntity,
			String glecSubEntity, Double oidGlecDet) {
		this.id = id;
		this.glecModUserid = glecModUserid;
		this.glecModDate = glecModDate;
		this.glecUser1 = glecUser1;
		this.glecUser2 = glecUser2;
		this.glecQadc01 = glecQadc01;
		this.glecQadc02 = glecQadc02;
		this.glecConsEntity = glecConsEntity;
		this.glecSubEntity = glecSubEntity;
		this.oidGlecDet = oidGlecDet;
	}

	// Property accessors

	public GlecDetId getId() {
		return this.id;
	}

	public void setId(GlecDetId id) {
		this.id = id;
	}

	public String getGlecModUserid() {
		return this.glecModUserid;
	}

	public void setGlecModUserid(String glecModUserid) {
		this.glecModUserid = glecModUserid;
	}

	public Date getGlecModDate() {
		return this.glecModDate;
	}

	public void setGlecModDate(Date glecModDate) {
		this.glecModDate = glecModDate;
	}

	public String getGlecUser1() {
		return this.glecUser1;
	}

	public void setGlecUser1(String glecUser1) {
		this.glecUser1 = glecUser1;
	}

	public String getGlecUser2() {
		return this.glecUser2;
	}

	public void setGlecUser2(String glecUser2) {
		this.glecUser2 = glecUser2;
	}

	public String getGlecQadc01() {
		return this.glecQadc01;
	}

	public void setGlecQadc01(String glecQadc01) {
		this.glecQadc01 = glecQadc01;
	}

	public String getGlecQadc02() {
		return this.glecQadc02;
	}

	public void setGlecQadc02(String glecQadc02) {
		this.glecQadc02 = glecQadc02;
	}

	public String getGlecConsEntity() {
		return this.glecConsEntity;
	}

	public void setGlecConsEntity(String glecConsEntity) {
		this.glecConsEntity = glecConsEntity;
	}

	public String getGlecSubEntity() {
		return this.glecSubEntity;
	}

	public void setGlecSubEntity(String glecSubEntity) {
		this.glecSubEntity = glecSubEntity;
	}

	public Double getOidGlecDet() {
		return this.oidGlecDet;
	}

	public void setOidGlecDet(Double oidGlecDet) {
		this.oidGlecDet = oidGlecDet;
	}

}