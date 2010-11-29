package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSufdDet entity provides the base persistence definition of the
 * SufdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSufdDet implements java.io.Serializable {

	// Fields

	private SufdDetId id;
	private String sufdAbsFldName;
	private String sufdFldName;
	private String sufdFldValue;
	private Boolean sufdFldPrompt;
	private String sufdValidate;
	private String sufdModUserid;
	private Date sufdModDate;
	private String sufdUserc01;
	private String sufdUserc02;
	private String sufdQadc01;
	private String sufdQadc02;
	private Double oidSufdDet;

	// Constructors

	/** default constructor */
	public AbstractSufdDet() {
	}

	/** minimal constructor */
	public AbstractSufdDet(SufdDetId id, String sufdAbsFldName,
			String sufdFldName, String sufdFldValue, Boolean sufdFldPrompt,
			String sufdValidate, String sufdModUserid, String sufdUserc01,
			String sufdUserc02, String sufdQadc01, String sufdQadc02,
			Double oidSufdDet) {
		this.id = id;
		this.sufdAbsFldName = sufdAbsFldName;
		this.sufdFldName = sufdFldName;
		this.sufdFldValue = sufdFldValue;
		this.sufdFldPrompt = sufdFldPrompt;
		this.sufdValidate = sufdValidate;
		this.sufdModUserid = sufdModUserid;
		this.sufdUserc01 = sufdUserc01;
		this.sufdUserc02 = sufdUserc02;
		this.sufdQadc01 = sufdQadc01;
		this.sufdQadc02 = sufdQadc02;
		this.oidSufdDet = oidSufdDet;
	}

	/** full constructor */
	public AbstractSufdDet(SufdDetId id, String sufdAbsFldName,
			String sufdFldName, String sufdFldValue, Boolean sufdFldPrompt,
			String sufdValidate, String sufdModUserid, Date sufdModDate,
			String sufdUserc01, String sufdUserc02, String sufdQadc01,
			String sufdQadc02, Double oidSufdDet) {
		this.id = id;
		this.sufdAbsFldName = sufdAbsFldName;
		this.sufdFldName = sufdFldName;
		this.sufdFldValue = sufdFldValue;
		this.sufdFldPrompt = sufdFldPrompt;
		this.sufdValidate = sufdValidate;
		this.sufdModUserid = sufdModUserid;
		this.sufdModDate = sufdModDate;
		this.sufdUserc01 = sufdUserc01;
		this.sufdUserc02 = sufdUserc02;
		this.sufdQadc01 = sufdQadc01;
		this.sufdQadc02 = sufdQadc02;
		this.oidSufdDet = oidSufdDet;
	}

	// Property accessors

	public SufdDetId getId() {
		return this.id;
	}

	public void setId(SufdDetId id) {
		this.id = id;
	}

	public String getSufdAbsFldName() {
		return this.sufdAbsFldName;
	}

	public void setSufdAbsFldName(String sufdAbsFldName) {
		this.sufdAbsFldName = sufdAbsFldName;
	}

	public String getSufdFldName() {
		return this.sufdFldName;
	}

	public void setSufdFldName(String sufdFldName) {
		this.sufdFldName = sufdFldName;
	}

	public String getSufdFldValue() {
		return this.sufdFldValue;
	}

	public void setSufdFldValue(String sufdFldValue) {
		this.sufdFldValue = sufdFldValue;
	}

	public Boolean getSufdFldPrompt() {
		return this.sufdFldPrompt;
	}

	public void setSufdFldPrompt(Boolean sufdFldPrompt) {
		this.sufdFldPrompt = sufdFldPrompt;
	}

	public String getSufdValidate() {
		return this.sufdValidate;
	}

	public void setSufdValidate(String sufdValidate) {
		this.sufdValidate = sufdValidate;
	}

	public String getSufdModUserid() {
		return this.sufdModUserid;
	}

	public void setSufdModUserid(String sufdModUserid) {
		this.sufdModUserid = sufdModUserid;
	}

	public Date getSufdModDate() {
		return this.sufdModDate;
	}

	public void setSufdModDate(Date sufdModDate) {
		this.sufdModDate = sufdModDate;
	}

	public String getSufdUserc01() {
		return this.sufdUserc01;
	}

	public void setSufdUserc01(String sufdUserc01) {
		this.sufdUserc01 = sufdUserc01;
	}

	public String getSufdUserc02() {
		return this.sufdUserc02;
	}

	public void setSufdUserc02(String sufdUserc02) {
		this.sufdUserc02 = sufdUserc02;
	}

	public String getSufdQadc01() {
		return this.sufdQadc01;
	}

	public void setSufdQadc01(String sufdQadc01) {
		this.sufdQadc01 = sufdQadc01;
	}

	public String getSufdQadc02() {
		return this.sufdQadc02;
	}

	public void setSufdQadc02(String sufdQadc02) {
		this.sufdQadc02 = sufdQadc02;
	}

	public Double getOidSufdDet() {
		return this.oidSufdDet;
	}

	public void setOidSufdDet(Double oidSufdDet) {
		this.oidSufdDet = oidSufdDet;
	}

}