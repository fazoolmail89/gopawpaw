package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEudDet entity provides the base persistence definition of the EudDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEudDet implements java.io.Serializable {

	// Fields

	private EudDetId id;
	private String eudAddr;
	private String eudLsType;
	private String eudSort;
	private String eudPhone;
	private String eudFax;
	private String eudTitle;
	private String eudType;
	private Date eudUpdt;
	private String eudNametype;
	private String eudUser1;
	private String eudUser2;
	private String eudMailAddr;
	private String eudModUserid;
	private Date eudModDate;
	private String eudChr01;
	private String eudChr02;
	private String eudChr03;
	private Integer eudInt01;
	private Date eudDte01;
	private Boolean eudLog01;
	private String eudQadc01;
	private String eudQadc02;
	private String eudQadc03;
	private Integer eudQadi01;
	private Date eudQadt01;
	private Boolean eudQadl01;
	private Double oidEudDet;

	// Constructors

	/** default constructor */
	public AbstractEudDet() {
	}

	/** minimal constructor */
	public AbstractEudDet(EudDetId id, String eudMailAddr, Double oidEudDet) {
		this.id = id;
		this.eudMailAddr = eudMailAddr;
		this.oidEudDet = oidEudDet;
	}

	/** full constructor */
	public AbstractEudDet(EudDetId id, String eudAddr, String eudLsType,
			String eudSort, String eudPhone, String eudFax, String eudTitle,
			String eudType, Date eudUpdt, String eudNametype, String eudUser1,
			String eudUser2, String eudMailAddr, String eudModUserid,
			Date eudModDate, String eudChr01, String eudChr02, String eudChr03,
			Integer eudInt01, Date eudDte01, Boolean eudLog01,
			String eudQadc01, String eudQadc02, String eudQadc03,
			Integer eudQadi01, Date eudQadt01, Boolean eudQadl01,
			Double oidEudDet) {
		this.id = id;
		this.eudAddr = eudAddr;
		this.eudLsType = eudLsType;
		this.eudSort = eudSort;
		this.eudPhone = eudPhone;
		this.eudFax = eudFax;
		this.eudTitle = eudTitle;
		this.eudType = eudType;
		this.eudUpdt = eudUpdt;
		this.eudNametype = eudNametype;
		this.eudUser1 = eudUser1;
		this.eudUser2 = eudUser2;
		this.eudMailAddr = eudMailAddr;
		this.eudModUserid = eudModUserid;
		this.eudModDate = eudModDate;
		this.eudChr01 = eudChr01;
		this.eudChr02 = eudChr02;
		this.eudChr03 = eudChr03;
		this.eudInt01 = eudInt01;
		this.eudDte01 = eudDte01;
		this.eudLog01 = eudLog01;
		this.eudQadc01 = eudQadc01;
		this.eudQadc02 = eudQadc02;
		this.eudQadc03 = eudQadc03;
		this.eudQadi01 = eudQadi01;
		this.eudQadt01 = eudQadt01;
		this.eudQadl01 = eudQadl01;
		this.oidEudDet = oidEudDet;
	}

	// Property accessors

	public EudDetId getId() {
		return this.id;
	}

	public void setId(EudDetId id) {
		this.id = id;
	}

	public String getEudAddr() {
		return this.eudAddr;
	}

	public void setEudAddr(String eudAddr) {
		this.eudAddr = eudAddr;
	}

	public String getEudLsType() {
		return this.eudLsType;
	}

	public void setEudLsType(String eudLsType) {
		this.eudLsType = eudLsType;
	}

	public String getEudSort() {
		return this.eudSort;
	}

	public void setEudSort(String eudSort) {
		this.eudSort = eudSort;
	}

	public String getEudPhone() {
		return this.eudPhone;
	}

	public void setEudPhone(String eudPhone) {
		this.eudPhone = eudPhone;
	}

	public String getEudFax() {
		return this.eudFax;
	}

	public void setEudFax(String eudFax) {
		this.eudFax = eudFax;
	}

	public String getEudTitle() {
		return this.eudTitle;
	}

	public void setEudTitle(String eudTitle) {
		this.eudTitle = eudTitle;
	}

	public String getEudType() {
		return this.eudType;
	}

	public void setEudType(String eudType) {
		this.eudType = eudType;
	}

	public Date getEudUpdt() {
		return this.eudUpdt;
	}

	public void setEudUpdt(Date eudUpdt) {
		this.eudUpdt = eudUpdt;
	}

	public String getEudNametype() {
		return this.eudNametype;
	}

	public void setEudNametype(String eudNametype) {
		this.eudNametype = eudNametype;
	}

	public String getEudUser1() {
		return this.eudUser1;
	}

	public void setEudUser1(String eudUser1) {
		this.eudUser1 = eudUser1;
	}

	public String getEudUser2() {
		return this.eudUser2;
	}

	public void setEudUser2(String eudUser2) {
		this.eudUser2 = eudUser2;
	}

	public String getEudMailAddr() {
		return this.eudMailAddr;
	}

	public void setEudMailAddr(String eudMailAddr) {
		this.eudMailAddr = eudMailAddr;
	}

	public String getEudModUserid() {
		return this.eudModUserid;
	}

	public void setEudModUserid(String eudModUserid) {
		this.eudModUserid = eudModUserid;
	}

	public Date getEudModDate() {
		return this.eudModDate;
	}

	public void setEudModDate(Date eudModDate) {
		this.eudModDate = eudModDate;
	}

	public String getEudChr01() {
		return this.eudChr01;
	}

	public void setEudChr01(String eudChr01) {
		this.eudChr01 = eudChr01;
	}

	public String getEudChr02() {
		return this.eudChr02;
	}

	public void setEudChr02(String eudChr02) {
		this.eudChr02 = eudChr02;
	}

	public String getEudChr03() {
		return this.eudChr03;
	}

	public void setEudChr03(String eudChr03) {
		this.eudChr03 = eudChr03;
	}

	public Integer getEudInt01() {
		return this.eudInt01;
	}

	public void setEudInt01(Integer eudInt01) {
		this.eudInt01 = eudInt01;
	}

	public Date getEudDte01() {
		return this.eudDte01;
	}

	public void setEudDte01(Date eudDte01) {
		this.eudDte01 = eudDte01;
	}

	public Boolean getEudLog01() {
		return this.eudLog01;
	}

	public void setEudLog01(Boolean eudLog01) {
		this.eudLog01 = eudLog01;
	}

	public String getEudQadc01() {
		return this.eudQadc01;
	}

	public void setEudQadc01(String eudQadc01) {
		this.eudQadc01 = eudQadc01;
	}

	public String getEudQadc02() {
		return this.eudQadc02;
	}

	public void setEudQadc02(String eudQadc02) {
		this.eudQadc02 = eudQadc02;
	}

	public String getEudQadc03() {
		return this.eudQadc03;
	}

	public void setEudQadc03(String eudQadc03) {
		this.eudQadc03 = eudQadc03;
	}

	public Integer getEudQadi01() {
		return this.eudQadi01;
	}

	public void setEudQadi01(Integer eudQadi01) {
		this.eudQadi01 = eudQadi01;
	}

	public Date getEudQadt01() {
		return this.eudQadt01;
	}

	public void setEudQadt01(Date eudQadt01) {
		this.eudQadt01 = eudQadt01;
	}

	public Boolean getEudQadl01() {
		return this.eudQadl01;
	}

	public void setEudQadl01(Boolean eudQadl01) {
		this.eudQadl01 = eudQadl01;
	}

	public Double getOidEudDet() {
		return this.oidEudDet;
	}

	public void setOidEudDet(Double oidEudDet) {
		this.oidEudDet = oidEudDet;
	}

}