package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * AbstractEsapMstr entity provides the base persistence definition of the
 * EsapMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsapMstr implements java.io.Serializable {

	// Fields

	private EsapMstrId id;
	private Double oidEsapMstr;
	private Boolean esapEsigActive;
	private String esapFilterMode;
	private Boolean esapCommentPrompt;
	private Boolean esapLatestDisplay;
	private Boolean esapDataFrameOpt;
	private Boolean esapPreviewPrompt;
	private Date esapModDate;
	private String esapModUserid;
	private String esapUser1;
	private String esapUser2;
	private String esapQadc01;
	private String esapQadc02;

	// Constructors

	/** default constructor */
	public AbstractEsapMstr() {
	}

	/** full constructor */
	public AbstractEsapMstr(EsapMstrId id, Double oidEsapMstr,
			Boolean esapEsigActive, String esapFilterMode,
			Boolean esapCommentPrompt, Boolean esapLatestDisplay,
			Boolean esapDataFrameOpt, Boolean esapPreviewPrompt,
			Date esapModDate, String esapModUserid, String esapUser1,
			String esapUser2, String esapQadc01, String esapQadc02) {
		this.id = id;
		this.oidEsapMstr = oidEsapMstr;
		this.esapEsigActive = esapEsigActive;
		this.esapFilterMode = esapFilterMode;
		this.esapCommentPrompt = esapCommentPrompt;
		this.esapLatestDisplay = esapLatestDisplay;
		this.esapDataFrameOpt = esapDataFrameOpt;
		this.esapPreviewPrompt = esapPreviewPrompt;
		this.esapModDate = esapModDate;
		this.esapModUserid = esapModUserid;
		this.esapUser1 = esapUser1;
		this.esapUser2 = esapUser2;
		this.esapQadc01 = esapQadc01;
		this.esapQadc02 = esapQadc02;
	}

	// Property accessors

	public EsapMstrId getId() {
		return this.id;
	}

	public void setId(EsapMstrId id) {
		this.id = id;
	}

	public Double getOidEsapMstr() {
		return this.oidEsapMstr;
	}

	public void setOidEsapMstr(Double oidEsapMstr) {
		this.oidEsapMstr = oidEsapMstr;
	}

	public Boolean getEsapEsigActive() {
		return this.esapEsigActive;
	}

	public void setEsapEsigActive(Boolean esapEsigActive) {
		this.esapEsigActive = esapEsigActive;
	}

	public String getEsapFilterMode() {
		return this.esapFilterMode;
	}

	public void setEsapFilterMode(String esapFilterMode) {
		this.esapFilterMode = esapFilterMode;
	}

	public Boolean getEsapCommentPrompt() {
		return this.esapCommentPrompt;
	}

	public void setEsapCommentPrompt(Boolean esapCommentPrompt) {
		this.esapCommentPrompt = esapCommentPrompt;
	}

	public Boolean getEsapLatestDisplay() {
		return this.esapLatestDisplay;
	}

	public void setEsapLatestDisplay(Boolean esapLatestDisplay) {
		this.esapLatestDisplay = esapLatestDisplay;
	}

	public Boolean getEsapDataFrameOpt() {
		return this.esapDataFrameOpt;
	}

	public void setEsapDataFrameOpt(Boolean esapDataFrameOpt) {
		this.esapDataFrameOpt = esapDataFrameOpt;
	}

	public Boolean getEsapPreviewPrompt() {
		return this.esapPreviewPrompt;
	}

	public void setEsapPreviewPrompt(Boolean esapPreviewPrompt) {
		this.esapPreviewPrompt = esapPreviewPrompt;
	}

	public Date getEsapModDate() {
		return this.esapModDate;
	}

	public void setEsapModDate(Date esapModDate) {
		this.esapModDate = esapModDate;
	}

	public String getEsapModUserid() {
		return this.esapModUserid;
	}

	public void setEsapModUserid(String esapModUserid) {
		this.esapModUserid = esapModUserid;
	}

	public String getEsapUser1() {
		return this.esapUser1;
	}

	public void setEsapUser1(String esapUser1) {
		this.esapUser1 = esapUser1;
	}

	public String getEsapUser2() {
		return this.esapUser2;
	}

	public void setEsapUser2(String esapUser2) {
		this.esapUser2 = esapUser2;
	}

	public String getEsapQadc01() {
		return this.esapQadc01;
	}

	public void setEsapQadc01(String esapQadc01) {
		this.esapQadc01 = esapQadc01;
	}

	public String getEsapQadc02() {
		return this.esapQadc02;
	}

	public void setEsapQadc02(String esapQadc02) {
		this.esapQadc02 = esapQadc02;
	}

}