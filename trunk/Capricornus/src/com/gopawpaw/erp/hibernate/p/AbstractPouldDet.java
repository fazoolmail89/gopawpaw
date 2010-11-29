package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPouldDet entity provides the base persistence definition of the
 * PouldDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPouldDet implements java.io.Serializable {

	// Fields

	private PouldDetId id;
	private Integer pouldPreference;
	private String pouldModUserid;
	private Date pouldModDate;
	private String pouldUser1;
	private String pouldUser2;
	private String pouldQadc01;
	private String pouldQadc02;
	private Double oidPouldDet;

	// Constructors

	/** default constructor */
	public AbstractPouldDet() {
	}

	/** full constructor */
	public AbstractPouldDet(PouldDetId id, Integer pouldPreference,
			String pouldModUserid, Date pouldModDate, String pouldUser1,
			String pouldUser2, String pouldQadc01, String pouldQadc02,
			Double oidPouldDet) {
		this.id = id;
		this.pouldPreference = pouldPreference;
		this.pouldModUserid = pouldModUserid;
		this.pouldModDate = pouldModDate;
		this.pouldUser1 = pouldUser1;
		this.pouldUser2 = pouldUser2;
		this.pouldQadc01 = pouldQadc01;
		this.pouldQadc02 = pouldQadc02;
		this.oidPouldDet = oidPouldDet;
	}

	// Property accessors

	public PouldDetId getId() {
		return this.id;
	}

	public void setId(PouldDetId id) {
		this.id = id;
	}

	public Integer getPouldPreference() {
		return this.pouldPreference;
	}

	public void setPouldPreference(Integer pouldPreference) {
		this.pouldPreference = pouldPreference;
	}

	public String getPouldModUserid() {
		return this.pouldModUserid;
	}

	public void setPouldModUserid(String pouldModUserid) {
		this.pouldModUserid = pouldModUserid;
	}

	public Date getPouldModDate() {
		return this.pouldModDate;
	}

	public void setPouldModDate(Date pouldModDate) {
		this.pouldModDate = pouldModDate;
	}

	public String getPouldUser1() {
		return this.pouldUser1;
	}

	public void setPouldUser1(String pouldUser1) {
		this.pouldUser1 = pouldUser1;
	}

	public String getPouldUser2() {
		return this.pouldUser2;
	}

	public void setPouldUser2(String pouldUser2) {
		this.pouldUser2 = pouldUser2;
	}

	public String getPouldQadc01() {
		return this.pouldQadc01;
	}

	public void setPouldQadc01(String pouldQadc01) {
		this.pouldQadc01 = pouldQadc01;
	}

	public String getPouldQadc02() {
		return this.pouldQadc02;
	}

	public void setPouldQadc02(String pouldQadc02) {
		this.pouldQadc02 = pouldQadc02;
	}

	public Double getOidPouldDet() {
		return this.oidPouldDet;
	}

	public void setOidPouldDet(Double oidPouldDet) {
		this.oidPouldDet = oidPouldDet;
	}

}