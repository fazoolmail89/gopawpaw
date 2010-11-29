package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSufMstr entity provides the base persistence definition of the
 * SufMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSufMstr implements java.io.Serializable {

	// Fields

	private SufMstrId id;
	private String sufAbsFldName;
	private String sufFldName;
	private String sufFldValue;
	private Boolean sufFldPrompt;
	private String sufValidate;
	private String sufModUserid;
	private Date sufModDate;
	private String sufUserc01;
	private String sufUserc02;
	private String sufQadc01;
	private String sufQadc02;
	private Double oidSufMstr;

	// Constructors

	/** default constructor */
	public AbstractSufMstr() {
	}

	/** minimal constructor */
	public AbstractSufMstr(SufMstrId id, String sufAbsFldName,
			String sufFldName, String sufFldValue, Boolean sufFldPrompt,
			String sufValidate, String sufModUserid, String sufUserc01,
			String sufUserc02, String sufQadc01, String sufQadc02,
			Double oidSufMstr) {
		this.id = id;
		this.sufAbsFldName = sufAbsFldName;
		this.sufFldName = sufFldName;
		this.sufFldValue = sufFldValue;
		this.sufFldPrompt = sufFldPrompt;
		this.sufValidate = sufValidate;
		this.sufModUserid = sufModUserid;
		this.sufUserc01 = sufUserc01;
		this.sufUserc02 = sufUserc02;
		this.sufQadc01 = sufQadc01;
		this.sufQadc02 = sufQadc02;
		this.oidSufMstr = oidSufMstr;
	}

	/** full constructor */
	public AbstractSufMstr(SufMstrId id, String sufAbsFldName,
			String sufFldName, String sufFldValue, Boolean sufFldPrompt,
			String sufValidate, String sufModUserid, Date sufModDate,
			String sufUserc01, String sufUserc02, String sufQadc01,
			String sufQadc02, Double oidSufMstr) {
		this.id = id;
		this.sufAbsFldName = sufAbsFldName;
		this.sufFldName = sufFldName;
		this.sufFldValue = sufFldValue;
		this.sufFldPrompt = sufFldPrompt;
		this.sufValidate = sufValidate;
		this.sufModUserid = sufModUserid;
		this.sufModDate = sufModDate;
		this.sufUserc01 = sufUserc01;
		this.sufUserc02 = sufUserc02;
		this.sufQadc01 = sufQadc01;
		this.sufQadc02 = sufQadc02;
		this.oidSufMstr = oidSufMstr;
	}

	// Property accessors

	public SufMstrId getId() {
		return this.id;
	}

	public void setId(SufMstrId id) {
		this.id = id;
	}

	public String getSufAbsFldName() {
		return this.sufAbsFldName;
	}

	public void setSufAbsFldName(String sufAbsFldName) {
		this.sufAbsFldName = sufAbsFldName;
	}

	public String getSufFldName() {
		return this.sufFldName;
	}

	public void setSufFldName(String sufFldName) {
		this.sufFldName = sufFldName;
	}

	public String getSufFldValue() {
		return this.sufFldValue;
	}

	public void setSufFldValue(String sufFldValue) {
		this.sufFldValue = sufFldValue;
	}

	public Boolean getSufFldPrompt() {
		return this.sufFldPrompt;
	}

	public void setSufFldPrompt(Boolean sufFldPrompt) {
		this.sufFldPrompt = sufFldPrompt;
	}

	public String getSufValidate() {
		return this.sufValidate;
	}

	public void setSufValidate(String sufValidate) {
		this.sufValidate = sufValidate;
	}

	public String getSufModUserid() {
		return this.sufModUserid;
	}

	public void setSufModUserid(String sufModUserid) {
		this.sufModUserid = sufModUserid;
	}

	public Date getSufModDate() {
		return this.sufModDate;
	}

	public void setSufModDate(Date sufModDate) {
		this.sufModDate = sufModDate;
	}

	public String getSufUserc01() {
		return this.sufUserc01;
	}

	public void setSufUserc01(String sufUserc01) {
		this.sufUserc01 = sufUserc01;
	}

	public String getSufUserc02() {
		return this.sufUserc02;
	}

	public void setSufUserc02(String sufUserc02) {
		this.sufUserc02 = sufUserc02;
	}

	public String getSufQadc01() {
		return this.sufQadc01;
	}

	public void setSufQadc01(String sufQadc01) {
		this.sufQadc01 = sufQadc01;
	}

	public String getSufQadc02() {
		return this.sufQadc02;
	}

	public void setSufQadc02(String sufQadc02) {
		this.sufQadc02 = sufQadc02;
	}

	public Double getOidSufMstr() {
		return this.oidSufMstr;
	}

	public void setOidSufMstr(Double oidSufMstr) {
		this.oidSufMstr = oidSufMstr;
	}

}