package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEswpMstr entity provides the base persistence definition of the
 * EswpMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEswpMstr implements java.io.Serializable {

	// Fields

	private EswpMstrId id;
	private Double oidEswpMstr;
	private Boolean eswpEsigActive;
	private Boolean eswpCommentPrompt;
	private String eswpFilterMode;
	private Boolean eswpLatestDisplay;
	private Boolean eswpDataFrameOpt;
	private Boolean eswpPreviewPrompt;
	private Date eswpModDate;
	private String eswpModUserid;
	private String eswpUser1;
	private String eswpUser2;
	private String eswpQadc01;
	private String eswpQadc02;

	// Constructors

	/** default constructor */
	public AbstractEswpMstr() {
	}

	/** full constructor */
	public AbstractEswpMstr(EswpMstrId id, Double oidEswpMstr,
			Boolean eswpEsigActive, Boolean eswpCommentPrompt,
			String eswpFilterMode, Boolean eswpLatestDisplay,
			Boolean eswpDataFrameOpt, Boolean eswpPreviewPrompt,
			Date eswpModDate, String eswpModUserid, String eswpUser1,
			String eswpUser2, String eswpQadc01, String eswpQadc02) {
		this.id = id;
		this.oidEswpMstr = oidEswpMstr;
		this.eswpEsigActive = eswpEsigActive;
		this.eswpCommentPrompt = eswpCommentPrompt;
		this.eswpFilterMode = eswpFilterMode;
		this.eswpLatestDisplay = eswpLatestDisplay;
		this.eswpDataFrameOpt = eswpDataFrameOpt;
		this.eswpPreviewPrompt = eswpPreviewPrompt;
		this.eswpModDate = eswpModDate;
		this.eswpModUserid = eswpModUserid;
		this.eswpUser1 = eswpUser1;
		this.eswpUser2 = eswpUser2;
		this.eswpQadc01 = eswpQadc01;
		this.eswpQadc02 = eswpQadc02;
	}

	// Property accessors

	public EswpMstrId getId() {
		return this.id;
	}

	public void setId(EswpMstrId id) {
		this.id = id;
	}

	public Double getOidEswpMstr() {
		return this.oidEswpMstr;
	}

	public void setOidEswpMstr(Double oidEswpMstr) {
		this.oidEswpMstr = oidEswpMstr;
	}

	public Boolean getEswpEsigActive() {
		return this.eswpEsigActive;
	}

	public void setEswpEsigActive(Boolean eswpEsigActive) {
		this.eswpEsigActive = eswpEsigActive;
	}

	public Boolean getEswpCommentPrompt() {
		return this.eswpCommentPrompt;
	}

	public void setEswpCommentPrompt(Boolean eswpCommentPrompt) {
		this.eswpCommentPrompt = eswpCommentPrompt;
	}

	public String getEswpFilterMode() {
		return this.eswpFilterMode;
	}

	public void setEswpFilterMode(String eswpFilterMode) {
		this.eswpFilterMode = eswpFilterMode;
	}

	public Boolean getEswpLatestDisplay() {
		return this.eswpLatestDisplay;
	}

	public void setEswpLatestDisplay(Boolean eswpLatestDisplay) {
		this.eswpLatestDisplay = eswpLatestDisplay;
	}

	public Boolean getEswpDataFrameOpt() {
		return this.eswpDataFrameOpt;
	}

	public void setEswpDataFrameOpt(Boolean eswpDataFrameOpt) {
		this.eswpDataFrameOpt = eswpDataFrameOpt;
	}

	public Boolean getEswpPreviewPrompt() {
		return this.eswpPreviewPrompt;
	}

	public void setEswpPreviewPrompt(Boolean eswpPreviewPrompt) {
		this.eswpPreviewPrompt = eswpPreviewPrompt;
	}

	public Date getEswpModDate() {
		return this.eswpModDate;
	}

	public void setEswpModDate(Date eswpModDate) {
		this.eswpModDate = eswpModDate;
	}

	public String getEswpModUserid() {
		return this.eswpModUserid;
	}

	public void setEswpModUserid(String eswpModUserid) {
		this.eswpModUserid = eswpModUserid;
	}

	public String getEswpUser1() {
		return this.eswpUser1;
	}

	public void setEswpUser1(String eswpUser1) {
		this.eswpUser1 = eswpUser1;
	}

	public String getEswpUser2() {
		return this.eswpUser2;
	}

	public void setEswpUser2(String eswpUser2) {
		this.eswpUser2 = eswpUser2;
	}

	public String getEswpQadc01() {
		return this.eswpQadc01;
	}

	public void setEswpQadc01(String eswpQadc01) {
		this.eswpQadc01 = eswpQadc01;
	}

	public String getEswpQadc02() {
		return this.eswpQadc02;
	}

	public void setEswpQadc02(String eswpQadc02) {
		this.eswpQadc02 = eswpQadc02;
	}

}