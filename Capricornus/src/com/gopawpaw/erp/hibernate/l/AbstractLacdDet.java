package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLacdDet entity provides the base persistence definition of the
 * LacdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLacdDet implements java.io.Serializable {

	// Fields

	private LacdDetId id;
	private String lacdLogSupplier;
	private String lacdElement;
	private String lacdAccrualLevel;
	private String lacdModUserid;
	private Date lacdModDate;
	private String lacdUser1;
	private String lacdUser2;
	private String lacdQadc01;
	private String lacdQadc02;
	private Double oidLacdDet;

	// Constructors

	/** default constructor */
	public AbstractLacdDet() {
	}

	/** full constructor */
	public AbstractLacdDet(LacdDetId id, String lacdLogSupplier,
			String lacdElement, String lacdAccrualLevel, String lacdModUserid,
			Date lacdModDate, String lacdUser1, String lacdUser2,
			String lacdQadc01, String lacdQadc02, Double oidLacdDet) {
		this.id = id;
		this.lacdLogSupplier = lacdLogSupplier;
		this.lacdElement = lacdElement;
		this.lacdAccrualLevel = lacdAccrualLevel;
		this.lacdModUserid = lacdModUserid;
		this.lacdModDate = lacdModDate;
		this.lacdUser1 = lacdUser1;
		this.lacdUser2 = lacdUser2;
		this.lacdQadc01 = lacdQadc01;
		this.lacdQadc02 = lacdQadc02;
		this.oidLacdDet = oidLacdDet;
	}

	// Property accessors

	public LacdDetId getId() {
		return this.id;
	}

	public void setId(LacdDetId id) {
		this.id = id;
	}

	public String getLacdLogSupplier() {
		return this.lacdLogSupplier;
	}

	public void setLacdLogSupplier(String lacdLogSupplier) {
		this.lacdLogSupplier = lacdLogSupplier;
	}

	public String getLacdElement() {
		return this.lacdElement;
	}

	public void setLacdElement(String lacdElement) {
		this.lacdElement = lacdElement;
	}

	public String getLacdAccrualLevel() {
		return this.lacdAccrualLevel;
	}

	public void setLacdAccrualLevel(String lacdAccrualLevel) {
		this.lacdAccrualLevel = lacdAccrualLevel;
	}

	public String getLacdModUserid() {
		return this.lacdModUserid;
	}

	public void setLacdModUserid(String lacdModUserid) {
		this.lacdModUserid = lacdModUserid;
	}

	public Date getLacdModDate() {
		return this.lacdModDate;
	}

	public void setLacdModDate(Date lacdModDate) {
		this.lacdModDate = lacdModDate;
	}

	public String getLacdUser1() {
		return this.lacdUser1;
	}

	public void setLacdUser1(String lacdUser1) {
		this.lacdUser1 = lacdUser1;
	}

	public String getLacdUser2() {
		return this.lacdUser2;
	}

	public void setLacdUser2(String lacdUser2) {
		this.lacdUser2 = lacdUser2;
	}

	public String getLacdQadc01() {
		return this.lacdQadc01;
	}

	public void setLacdQadc01(String lacdQadc01) {
		this.lacdQadc01 = lacdQadc01;
	}

	public String getLacdQadc02() {
		return this.lacdQadc02;
	}

	public void setLacdQadc02(String lacdQadc02) {
		this.lacdQadc02 = lacdQadc02;
	}

	public Double getOidLacdDet() {
		return this.oidLacdDet;
	}

	public void setOidLacdDet(Double oidLacdDet) {
		this.oidLacdDet = oidLacdDet;
	}

}