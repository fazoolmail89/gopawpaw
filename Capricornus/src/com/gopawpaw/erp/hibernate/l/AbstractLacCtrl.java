package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * AbstractLacCtrl entity provides the base persistence definition of the
 * LacCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLacCtrl implements java.io.Serializable {

	// Fields

	private String lacDomain;
	private Boolean lacUseLogistics;
	private Integer lacQadi01;
	private Date lacModDate;
	private String lacModUserid;
	private String lacUser1;
	private String lacUser2;
	private String lacQadc01;
	private String lacQadc02;
	private String lacSoshipNrmId;
	private String lacDoshipNrmId;
	private Boolean lacBlankSuppliers;
	private Double oidLacCtrl;

	// Constructors

	/** default constructor */
	public AbstractLacCtrl() {
	}

	/** full constructor */
	public AbstractLacCtrl(Boolean lacUseLogistics, Integer lacQadi01,
			Date lacModDate, String lacModUserid, String lacUser1,
			String lacUser2, String lacQadc01, String lacQadc02,
			String lacSoshipNrmId, String lacDoshipNrmId,
			Boolean lacBlankSuppliers, Double oidLacCtrl) {
		this.lacUseLogistics = lacUseLogistics;
		this.lacQadi01 = lacQadi01;
		this.lacModDate = lacModDate;
		this.lacModUserid = lacModUserid;
		this.lacUser1 = lacUser1;
		this.lacUser2 = lacUser2;
		this.lacQadc01 = lacQadc01;
		this.lacQadc02 = lacQadc02;
		this.lacSoshipNrmId = lacSoshipNrmId;
		this.lacDoshipNrmId = lacDoshipNrmId;
		this.lacBlankSuppliers = lacBlankSuppliers;
		this.oidLacCtrl = oidLacCtrl;
	}

	// Property accessors

	public String getLacDomain() {
		return this.lacDomain;
	}

	public void setLacDomain(String lacDomain) {
		this.lacDomain = lacDomain;
	}

	public Boolean getLacUseLogistics() {
		return this.lacUseLogistics;
	}

	public void setLacUseLogistics(Boolean lacUseLogistics) {
		this.lacUseLogistics = lacUseLogistics;
	}

	public Integer getLacQadi01() {
		return this.lacQadi01;
	}

	public void setLacQadi01(Integer lacQadi01) {
		this.lacQadi01 = lacQadi01;
	}

	public Date getLacModDate() {
		return this.lacModDate;
	}

	public void setLacModDate(Date lacModDate) {
		this.lacModDate = lacModDate;
	}

	public String getLacModUserid() {
		return this.lacModUserid;
	}

	public void setLacModUserid(String lacModUserid) {
		this.lacModUserid = lacModUserid;
	}

	public String getLacUser1() {
		return this.lacUser1;
	}

	public void setLacUser1(String lacUser1) {
		this.lacUser1 = lacUser1;
	}

	public String getLacUser2() {
		return this.lacUser2;
	}

	public void setLacUser2(String lacUser2) {
		this.lacUser2 = lacUser2;
	}

	public String getLacQadc01() {
		return this.lacQadc01;
	}

	public void setLacQadc01(String lacQadc01) {
		this.lacQadc01 = lacQadc01;
	}

	public String getLacQadc02() {
		return this.lacQadc02;
	}

	public void setLacQadc02(String lacQadc02) {
		this.lacQadc02 = lacQadc02;
	}

	public String getLacSoshipNrmId() {
		return this.lacSoshipNrmId;
	}

	public void setLacSoshipNrmId(String lacSoshipNrmId) {
		this.lacSoshipNrmId = lacSoshipNrmId;
	}

	public String getLacDoshipNrmId() {
		return this.lacDoshipNrmId;
	}

	public void setLacDoshipNrmId(String lacDoshipNrmId) {
		this.lacDoshipNrmId = lacDoshipNrmId;
	}

	public Boolean getLacBlankSuppliers() {
		return this.lacBlankSuppliers;
	}

	public void setLacBlankSuppliers(Boolean lacBlankSuppliers) {
		this.lacBlankSuppliers = lacBlankSuppliers;
	}

	public Double getOidLacCtrl() {
		return this.oidLacCtrl;
	}

	public void setOidLacCtrl(Double oidLacCtrl) {
		this.oidLacCtrl = oidLacCtrl;
	}

}