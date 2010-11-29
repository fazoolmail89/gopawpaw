package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * AbstractKbtrdDet entity provides the base persistence definition of the
 * KbtrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKbtrdDet implements java.io.Serializable {

	// Fields

	private KbtrdDetId id;
	private Date kbtrdModDate;
	private String kbtrdModUserid;
	private String kbtrdUser1;
	private String kbtrdUser2;
	private Integer kbtrdUseri01;
	private String kbtrdQadc01;
	private String kbtrdQadc02;
	private Integer kbtrdQadi01;
	private Double oidKbtrdDet;

	// Constructors

	/** default constructor */
	public AbstractKbtrdDet() {
	}

	/** full constructor */
	public AbstractKbtrdDet(KbtrdDetId id, Date kbtrdModDate,
			String kbtrdModUserid, String kbtrdUser1, String kbtrdUser2,
			Integer kbtrdUseri01, String kbtrdQadc01, String kbtrdQadc02,
			Integer kbtrdQadi01, Double oidKbtrdDet) {
		this.id = id;
		this.kbtrdModDate = kbtrdModDate;
		this.kbtrdModUserid = kbtrdModUserid;
		this.kbtrdUser1 = kbtrdUser1;
		this.kbtrdUser2 = kbtrdUser2;
		this.kbtrdUseri01 = kbtrdUseri01;
		this.kbtrdQadc01 = kbtrdQadc01;
		this.kbtrdQadc02 = kbtrdQadc02;
		this.kbtrdQadi01 = kbtrdQadi01;
		this.oidKbtrdDet = oidKbtrdDet;
	}

	// Property accessors

	public KbtrdDetId getId() {
		return this.id;
	}

	public void setId(KbtrdDetId id) {
		this.id = id;
	}

	public Date getKbtrdModDate() {
		return this.kbtrdModDate;
	}

	public void setKbtrdModDate(Date kbtrdModDate) {
		this.kbtrdModDate = kbtrdModDate;
	}

	public String getKbtrdModUserid() {
		return this.kbtrdModUserid;
	}

	public void setKbtrdModUserid(String kbtrdModUserid) {
		this.kbtrdModUserid = kbtrdModUserid;
	}

	public String getKbtrdUser1() {
		return this.kbtrdUser1;
	}

	public void setKbtrdUser1(String kbtrdUser1) {
		this.kbtrdUser1 = kbtrdUser1;
	}

	public String getKbtrdUser2() {
		return this.kbtrdUser2;
	}

	public void setKbtrdUser2(String kbtrdUser2) {
		this.kbtrdUser2 = kbtrdUser2;
	}

	public Integer getKbtrdUseri01() {
		return this.kbtrdUseri01;
	}

	public void setKbtrdUseri01(Integer kbtrdUseri01) {
		this.kbtrdUseri01 = kbtrdUseri01;
	}

	public String getKbtrdQadc01() {
		return this.kbtrdQadc01;
	}

	public void setKbtrdQadc01(String kbtrdQadc01) {
		this.kbtrdQadc01 = kbtrdQadc01;
	}

	public String getKbtrdQadc02() {
		return this.kbtrdQadc02;
	}

	public void setKbtrdQadc02(String kbtrdQadc02) {
		this.kbtrdQadc02 = kbtrdQadc02;
	}

	public Integer getKbtrdQadi01() {
		return this.kbtrdQadi01;
	}

	public void setKbtrdQadi01(Integer kbtrdQadi01) {
		this.kbtrdQadi01 = kbtrdQadi01;
	}

	public Double getOidKbtrdDet() {
		return this.oidKbtrdDet;
	}

	public void setOidKbtrdDet(Double oidKbtrdDet) {
		this.oidKbtrdDet = oidKbtrdDet;
	}

}