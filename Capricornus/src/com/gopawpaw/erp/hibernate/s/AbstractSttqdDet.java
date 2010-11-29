package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSttqdDet entity provides the base persistence definition of the
 * SttqdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSttqdDet implements java.io.Serializable {

	// Fields

	private SttqdDetId id;
	private Boolean sttqdAcceptable;
	private Boolean sttqdActive;
	private Double sttqdMaxValue;
	private Double sttqdMinValue;
	private String sttqdTrackingMeasure;
	private Boolean sttqdUsePercent;
	private Date sttqdModDate;
	private String sttqdModUserid;
	private String sttqdUser1;
	private String sttqdUser2;
	private String sttqdQadc01;
	private String sttqdQadc02;
	private Double oidSttqdDet;

	// Constructors

	/** default constructor */
	public AbstractSttqdDet() {
	}

	/** full constructor */
	public AbstractSttqdDet(SttqdDetId id, Boolean sttqdAcceptable,
			Boolean sttqdActive, Double sttqdMaxValue, Double sttqdMinValue,
			String sttqdTrackingMeasure, Boolean sttqdUsePercent,
			Date sttqdModDate, String sttqdModUserid, String sttqdUser1,
			String sttqdUser2, String sttqdQadc01, String sttqdQadc02,
			Double oidSttqdDet) {
		this.id = id;
		this.sttqdAcceptable = sttqdAcceptable;
		this.sttqdActive = sttqdActive;
		this.sttqdMaxValue = sttqdMaxValue;
		this.sttqdMinValue = sttqdMinValue;
		this.sttqdTrackingMeasure = sttqdTrackingMeasure;
		this.sttqdUsePercent = sttqdUsePercent;
		this.sttqdModDate = sttqdModDate;
		this.sttqdModUserid = sttqdModUserid;
		this.sttqdUser1 = sttqdUser1;
		this.sttqdUser2 = sttqdUser2;
		this.sttqdQadc01 = sttqdQadc01;
		this.sttqdQadc02 = sttqdQadc02;
		this.oidSttqdDet = oidSttqdDet;
	}

	// Property accessors

	public SttqdDetId getId() {
		return this.id;
	}

	public void setId(SttqdDetId id) {
		this.id = id;
	}

	public Boolean getSttqdAcceptable() {
		return this.sttqdAcceptable;
	}

	public void setSttqdAcceptable(Boolean sttqdAcceptable) {
		this.sttqdAcceptable = sttqdAcceptable;
	}

	public Boolean getSttqdActive() {
		return this.sttqdActive;
	}

	public void setSttqdActive(Boolean sttqdActive) {
		this.sttqdActive = sttqdActive;
	}

	public Double getSttqdMaxValue() {
		return this.sttqdMaxValue;
	}

	public void setSttqdMaxValue(Double sttqdMaxValue) {
		this.sttqdMaxValue = sttqdMaxValue;
	}

	public Double getSttqdMinValue() {
		return this.sttqdMinValue;
	}

	public void setSttqdMinValue(Double sttqdMinValue) {
		this.sttqdMinValue = sttqdMinValue;
	}

	public String getSttqdTrackingMeasure() {
		return this.sttqdTrackingMeasure;
	}

	public void setSttqdTrackingMeasure(String sttqdTrackingMeasure) {
		this.sttqdTrackingMeasure = sttqdTrackingMeasure;
	}

	public Boolean getSttqdUsePercent() {
		return this.sttqdUsePercent;
	}

	public void setSttqdUsePercent(Boolean sttqdUsePercent) {
		this.sttqdUsePercent = sttqdUsePercent;
	}

	public Date getSttqdModDate() {
		return this.sttqdModDate;
	}

	public void setSttqdModDate(Date sttqdModDate) {
		this.sttqdModDate = sttqdModDate;
	}

	public String getSttqdModUserid() {
		return this.sttqdModUserid;
	}

	public void setSttqdModUserid(String sttqdModUserid) {
		this.sttqdModUserid = sttqdModUserid;
	}

	public String getSttqdUser1() {
		return this.sttqdUser1;
	}

	public void setSttqdUser1(String sttqdUser1) {
		this.sttqdUser1 = sttqdUser1;
	}

	public String getSttqdUser2() {
		return this.sttqdUser2;
	}

	public void setSttqdUser2(String sttqdUser2) {
		this.sttqdUser2 = sttqdUser2;
	}

	public String getSttqdQadc01() {
		return this.sttqdQadc01;
	}

	public void setSttqdQadc01(String sttqdQadc01) {
		this.sttqdQadc01 = sttqdQadc01;
	}

	public String getSttqdQadc02() {
		return this.sttqdQadc02;
	}

	public void setSttqdQadc02(String sttqdQadc02) {
		this.sttqdQadc02 = sttqdQadc02;
	}

	public Double getOidSttqdDet() {
		return this.oidSttqdDet;
	}

	public void setOidSttqdDet(Double oidSttqdDet) {
		this.oidSttqdDet = oidSttqdDet;
	}

}