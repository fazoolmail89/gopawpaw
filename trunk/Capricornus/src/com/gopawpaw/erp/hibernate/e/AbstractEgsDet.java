package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEgsDet entity provides the base persistence definition of the EgsDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEgsDet implements java.io.Serializable {

	// Fields

	private EgsDetId id;
	private String egsLevel;
	private Date egsCert;
	private String egsChr01;
	private String egsChr02;
	private String egsChr03;
	private Double egsDec01;
	private Double egsDec02;
	private Date egsDte01;
	private Date egsDte02;
	private Boolean egsLog01;
	private Boolean egsLog02;
	private String egsUser1;
	private String egsUser2;
	private String egsArea;
	private String egsQadc01;
	private String egsQadc02;
	private Boolean egsQadl01;
	private Boolean egsQadl02;
	private Date egsQadt01;
	private Integer egsQadi01;
	private Double egsQade01;
	private Date egsModDate;
	private String egsModUserid;
	private Double oidEgsDet;

	// Constructors

	/** default constructor */
	public AbstractEgsDet() {
	}

	/** minimal constructor */
	public AbstractEgsDet(EgsDetId id, Double oidEgsDet) {
		this.id = id;
		this.oidEgsDet = oidEgsDet;
	}

	/** full constructor */
	public AbstractEgsDet(EgsDetId id, String egsLevel, Date egsCert,
			String egsChr01, String egsChr02, String egsChr03, Double egsDec01,
			Double egsDec02, Date egsDte01, Date egsDte02, Boolean egsLog01,
			Boolean egsLog02, String egsUser1, String egsUser2, String egsArea,
			String egsQadc01, String egsQadc02, Boolean egsQadl01,
			Boolean egsQadl02, Date egsQadt01, Integer egsQadi01,
			Double egsQade01, Date egsModDate, String egsModUserid,
			Double oidEgsDet) {
		this.id = id;
		this.egsLevel = egsLevel;
		this.egsCert = egsCert;
		this.egsChr01 = egsChr01;
		this.egsChr02 = egsChr02;
		this.egsChr03 = egsChr03;
		this.egsDec01 = egsDec01;
		this.egsDec02 = egsDec02;
		this.egsDte01 = egsDte01;
		this.egsDte02 = egsDte02;
		this.egsLog01 = egsLog01;
		this.egsLog02 = egsLog02;
		this.egsUser1 = egsUser1;
		this.egsUser2 = egsUser2;
		this.egsArea = egsArea;
		this.egsQadc01 = egsQadc01;
		this.egsQadc02 = egsQadc02;
		this.egsQadl01 = egsQadl01;
		this.egsQadl02 = egsQadl02;
		this.egsQadt01 = egsQadt01;
		this.egsQadi01 = egsQadi01;
		this.egsQade01 = egsQade01;
		this.egsModDate = egsModDate;
		this.egsModUserid = egsModUserid;
		this.oidEgsDet = oidEgsDet;
	}

	// Property accessors

	public EgsDetId getId() {
		return this.id;
	}

	public void setId(EgsDetId id) {
		this.id = id;
	}

	public String getEgsLevel() {
		return this.egsLevel;
	}

	public void setEgsLevel(String egsLevel) {
		this.egsLevel = egsLevel;
	}

	public Date getEgsCert() {
		return this.egsCert;
	}

	public void setEgsCert(Date egsCert) {
		this.egsCert = egsCert;
	}

	public String getEgsChr01() {
		return this.egsChr01;
	}

	public void setEgsChr01(String egsChr01) {
		this.egsChr01 = egsChr01;
	}

	public String getEgsChr02() {
		return this.egsChr02;
	}

	public void setEgsChr02(String egsChr02) {
		this.egsChr02 = egsChr02;
	}

	public String getEgsChr03() {
		return this.egsChr03;
	}

	public void setEgsChr03(String egsChr03) {
		this.egsChr03 = egsChr03;
	}

	public Double getEgsDec01() {
		return this.egsDec01;
	}

	public void setEgsDec01(Double egsDec01) {
		this.egsDec01 = egsDec01;
	}

	public Double getEgsDec02() {
		return this.egsDec02;
	}

	public void setEgsDec02(Double egsDec02) {
		this.egsDec02 = egsDec02;
	}

	public Date getEgsDte01() {
		return this.egsDte01;
	}

	public void setEgsDte01(Date egsDte01) {
		this.egsDte01 = egsDte01;
	}

	public Date getEgsDte02() {
		return this.egsDte02;
	}

	public void setEgsDte02(Date egsDte02) {
		this.egsDte02 = egsDte02;
	}

	public Boolean getEgsLog01() {
		return this.egsLog01;
	}

	public void setEgsLog01(Boolean egsLog01) {
		this.egsLog01 = egsLog01;
	}

	public Boolean getEgsLog02() {
		return this.egsLog02;
	}

	public void setEgsLog02(Boolean egsLog02) {
		this.egsLog02 = egsLog02;
	}

	public String getEgsUser1() {
		return this.egsUser1;
	}

	public void setEgsUser1(String egsUser1) {
		this.egsUser1 = egsUser1;
	}

	public String getEgsUser2() {
		return this.egsUser2;
	}

	public void setEgsUser2(String egsUser2) {
		this.egsUser2 = egsUser2;
	}

	public String getEgsArea() {
		return this.egsArea;
	}

	public void setEgsArea(String egsArea) {
		this.egsArea = egsArea;
	}

	public String getEgsQadc01() {
		return this.egsQadc01;
	}

	public void setEgsQadc01(String egsQadc01) {
		this.egsQadc01 = egsQadc01;
	}

	public String getEgsQadc02() {
		return this.egsQadc02;
	}

	public void setEgsQadc02(String egsQadc02) {
		this.egsQadc02 = egsQadc02;
	}

	public Boolean getEgsQadl01() {
		return this.egsQadl01;
	}

	public void setEgsQadl01(Boolean egsQadl01) {
		this.egsQadl01 = egsQadl01;
	}

	public Boolean getEgsQadl02() {
		return this.egsQadl02;
	}

	public void setEgsQadl02(Boolean egsQadl02) {
		this.egsQadl02 = egsQadl02;
	}

	public Date getEgsQadt01() {
		return this.egsQadt01;
	}

	public void setEgsQadt01(Date egsQadt01) {
		this.egsQadt01 = egsQadt01;
	}

	public Integer getEgsQadi01() {
		return this.egsQadi01;
	}

	public void setEgsQadi01(Integer egsQadi01) {
		this.egsQadi01 = egsQadi01;
	}

	public Double getEgsQade01() {
		return this.egsQade01;
	}

	public void setEgsQade01(Double egsQade01) {
		this.egsQade01 = egsQade01;
	}

	public Date getEgsModDate() {
		return this.egsModDate;
	}

	public void setEgsModDate(Date egsModDate) {
		this.egsModDate = egsModDate;
	}

	public String getEgsModUserid() {
		return this.egsModUserid;
	}

	public void setEgsModUserid(String egsModUserid) {
		this.egsModUserid = egsModUserid;
	}

	public Double getOidEgsDet() {
		return this.oidEgsDet;
	}

	public void setOidEgsDet(Double oidEgsDet) {
		this.oidEgsDet = oidEgsDet;
	}

}