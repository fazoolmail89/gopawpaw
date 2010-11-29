package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMfcCtrl entity provides the base persistence definition of the
 * MfcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMfcCtrl implements java.io.Serializable {

	// Fields

	private MfcCtrlId id;
	private String mfcModule;
	private Integer mfcSeq;
	private String mfcLabel;
	private String mfcDesc;
	private String mfcType;
	private Integer mfcInteger;
	private String mfcChar;
	private Double mfcDecimal;
	private Boolean mfcLogical;
	private Date mfcDate;
	private String mfcUser1;
	private String mfcUser2;
	private String mfcQadc01;
	private Double oidMfcCtrl;

	// Constructors

	/** default constructor */
	public AbstractMfcCtrl() {
	}

	/** minimal constructor */
	public AbstractMfcCtrl(MfcCtrlId id, Double oidMfcCtrl) {
		this.id = id;
		this.oidMfcCtrl = oidMfcCtrl;
	}

	/** full constructor */
	public AbstractMfcCtrl(MfcCtrlId id, String mfcModule, Integer mfcSeq,
			String mfcLabel, String mfcDesc, String mfcType,
			Integer mfcInteger, String mfcChar, Double mfcDecimal,
			Boolean mfcLogical, Date mfcDate, String mfcUser1, String mfcUser2,
			String mfcQadc01, Double oidMfcCtrl) {
		this.id = id;
		this.mfcModule = mfcModule;
		this.mfcSeq = mfcSeq;
		this.mfcLabel = mfcLabel;
		this.mfcDesc = mfcDesc;
		this.mfcType = mfcType;
		this.mfcInteger = mfcInteger;
		this.mfcChar = mfcChar;
		this.mfcDecimal = mfcDecimal;
		this.mfcLogical = mfcLogical;
		this.mfcDate = mfcDate;
		this.mfcUser1 = mfcUser1;
		this.mfcUser2 = mfcUser2;
		this.mfcQadc01 = mfcQadc01;
		this.oidMfcCtrl = oidMfcCtrl;
	}

	// Property accessors

	public MfcCtrlId getId() {
		return this.id;
	}

	public void setId(MfcCtrlId id) {
		this.id = id;
	}

	public String getMfcModule() {
		return this.mfcModule;
	}

	public void setMfcModule(String mfcModule) {
		this.mfcModule = mfcModule;
	}

	public Integer getMfcSeq() {
		return this.mfcSeq;
	}

	public void setMfcSeq(Integer mfcSeq) {
		this.mfcSeq = mfcSeq;
	}

	public String getMfcLabel() {
		return this.mfcLabel;
	}

	public void setMfcLabel(String mfcLabel) {
		this.mfcLabel = mfcLabel;
	}

	public String getMfcDesc() {
		return this.mfcDesc;
	}

	public void setMfcDesc(String mfcDesc) {
		this.mfcDesc = mfcDesc;
	}

	public String getMfcType() {
		return this.mfcType;
	}

	public void setMfcType(String mfcType) {
		this.mfcType = mfcType;
	}

	public Integer getMfcInteger() {
		return this.mfcInteger;
	}

	public void setMfcInteger(Integer mfcInteger) {
		this.mfcInteger = mfcInteger;
	}

	public String getMfcChar() {
		return this.mfcChar;
	}

	public void setMfcChar(String mfcChar) {
		this.mfcChar = mfcChar;
	}

	public Double getMfcDecimal() {
		return this.mfcDecimal;
	}

	public void setMfcDecimal(Double mfcDecimal) {
		this.mfcDecimal = mfcDecimal;
	}

	public Boolean getMfcLogical() {
		return this.mfcLogical;
	}

	public void setMfcLogical(Boolean mfcLogical) {
		this.mfcLogical = mfcLogical;
	}

	public Date getMfcDate() {
		return this.mfcDate;
	}

	public void setMfcDate(Date mfcDate) {
		this.mfcDate = mfcDate;
	}

	public String getMfcUser1() {
		return this.mfcUser1;
	}

	public void setMfcUser1(String mfcUser1) {
		this.mfcUser1 = mfcUser1;
	}

	public String getMfcUser2() {
		return this.mfcUser2;
	}

	public void setMfcUser2(String mfcUser2) {
		this.mfcUser2 = mfcUser2;
	}

	public String getMfcQadc01() {
		return this.mfcQadc01;
	}

	public void setMfcQadc01(String mfcQadc01) {
		this.mfcQadc01 = mfcQadc01;
	}

	public Double getOidMfcCtrl() {
		return this.oidMfcCtrl;
	}

	public void setOidMfcCtrl(Double oidMfcCtrl) {
		this.oidMfcCtrl = oidMfcCtrl;
	}

}