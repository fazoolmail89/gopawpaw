package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEncdDet entity provides the base persistence definition of the
 * EncdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEncdDet implements java.io.Serializable {

	// Fields

	private EncdDetId id;
	private Double encdPct;
	private String encdModUserid;
	private Date encdModDate;
	private String encdUser1;
	private String encdUser2;
	private String encdQadc01;
	private String encdQadc02;
	private Boolean encdConsolidate;
	private Double oidEncdDet;

	// Constructors

	/** default constructor */
	public AbstractEncdDet() {
	}

	/** full constructor */
	public AbstractEncdDet(EncdDetId id, Double encdPct, String encdModUserid,
			Date encdModDate, String encdUser1, String encdUser2,
			String encdQadc01, String encdQadc02, Boolean encdConsolidate,
			Double oidEncdDet) {
		this.id = id;
		this.encdPct = encdPct;
		this.encdModUserid = encdModUserid;
		this.encdModDate = encdModDate;
		this.encdUser1 = encdUser1;
		this.encdUser2 = encdUser2;
		this.encdQadc01 = encdQadc01;
		this.encdQadc02 = encdQadc02;
		this.encdConsolidate = encdConsolidate;
		this.oidEncdDet = oidEncdDet;
	}

	// Property accessors

	public EncdDetId getId() {
		return this.id;
	}

	public void setId(EncdDetId id) {
		this.id = id;
	}

	public Double getEncdPct() {
		return this.encdPct;
	}

	public void setEncdPct(Double encdPct) {
		this.encdPct = encdPct;
	}

	public String getEncdModUserid() {
		return this.encdModUserid;
	}

	public void setEncdModUserid(String encdModUserid) {
		this.encdModUserid = encdModUserid;
	}

	public Date getEncdModDate() {
		return this.encdModDate;
	}

	public void setEncdModDate(Date encdModDate) {
		this.encdModDate = encdModDate;
	}

	public String getEncdUser1() {
		return this.encdUser1;
	}

	public void setEncdUser1(String encdUser1) {
		this.encdUser1 = encdUser1;
	}

	public String getEncdUser2() {
		return this.encdUser2;
	}

	public void setEncdUser2(String encdUser2) {
		this.encdUser2 = encdUser2;
	}

	public String getEncdQadc01() {
		return this.encdQadc01;
	}

	public void setEncdQadc01(String encdQadc01) {
		this.encdQadc01 = encdQadc01;
	}

	public String getEncdQadc02() {
		return this.encdQadc02;
	}

	public void setEncdQadc02(String encdQadc02) {
		this.encdQadc02 = encdQadc02;
	}

	public Boolean getEncdConsolidate() {
		return this.encdConsolidate;
	}

	public void setEncdConsolidate(Boolean encdConsolidate) {
		this.encdConsolidate = encdConsolidate;
	}

	public Double getOidEncdDet() {
		return this.oidEncdDet;
	}

	public void setOidEncdDet(Double oidEncdDet) {
		this.oidEncdDet = oidEncdDet;
	}

}