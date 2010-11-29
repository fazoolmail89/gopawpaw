package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUrlMstr entity provides the base persistence definition of the
 * UrlMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUrlMstr implements java.io.Serializable {

	// Fields

	private UrlMstrId id;
	private String urlDesc;
	private String urlQadc02;
	private String urlModUserid;
	private Date urlModDate;
	private String urlUser1;
	private String urlUser2;
	private String urlImage;
	private Integer urlQadi02;
	private String urlQadc03;
	private Integer urlQadi01;
	private Boolean urlQadl01;
	private Date urlQadt01;
	private Double urlQadd01;
	private Boolean urlPrimary;
	private Boolean urlDetermine;
	private Double oidUrlMstr;

	// Constructors

	/** default constructor */
	public AbstractUrlMstr() {
	}

	/** minimal constructor */
	public AbstractUrlMstr(UrlMstrId id, Integer urlQadi02, Double oidUrlMstr) {
		this.id = id;
		this.urlQadi02 = urlQadi02;
		this.oidUrlMstr = oidUrlMstr;
	}

	/** full constructor */
	public AbstractUrlMstr(UrlMstrId id, String urlDesc, String urlQadc02,
			String urlModUserid, Date urlModDate, String urlUser1,
			String urlUser2, String urlImage, Integer urlQadi02,
			String urlQadc03, Integer urlQadi01, Boolean urlQadl01,
			Date urlQadt01, Double urlQadd01, Boolean urlPrimary,
			Boolean urlDetermine, Double oidUrlMstr) {
		this.id = id;
		this.urlDesc = urlDesc;
		this.urlQadc02 = urlQadc02;
		this.urlModUserid = urlModUserid;
		this.urlModDate = urlModDate;
		this.urlUser1 = urlUser1;
		this.urlUser2 = urlUser2;
		this.urlImage = urlImage;
		this.urlQadi02 = urlQadi02;
		this.urlQadc03 = urlQadc03;
		this.urlQadi01 = urlQadi01;
		this.urlQadl01 = urlQadl01;
		this.urlQadt01 = urlQadt01;
		this.urlQadd01 = urlQadd01;
		this.urlPrimary = urlPrimary;
		this.urlDetermine = urlDetermine;
		this.oidUrlMstr = oidUrlMstr;
	}

	// Property accessors

	public UrlMstrId getId() {
		return this.id;
	}

	public void setId(UrlMstrId id) {
		this.id = id;
	}

	public String getUrlDesc() {
		return this.urlDesc;
	}

	public void setUrlDesc(String urlDesc) {
		this.urlDesc = urlDesc;
	}

	public String getUrlQadc02() {
		return this.urlQadc02;
	}

	public void setUrlQadc02(String urlQadc02) {
		this.urlQadc02 = urlQadc02;
	}

	public String getUrlModUserid() {
		return this.urlModUserid;
	}

	public void setUrlModUserid(String urlModUserid) {
		this.urlModUserid = urlModUserid;
	}

	public Date getUrlModDate() {
		return this.urlModDate;
	}

	public void setUrlModDate(Date urlModDate) {
		this.urlModDate = urlModDate;
	}

	public String getUrlUser1() {
		return this.urlUser1;
	}

	public void setUrlUser1(String urlUser1) {
		this.urlUser1 = urlUser1;
	}

	public String getUrlUser2() {
		return this.urlUser2;
	}

	public void setUrlUser2(String urlUser2) {
		this.urlUser2 = urlUser2;
	}

	public String getUrlImage() {
		return this.urlImage;
	}

	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}

	public Integer getUrlQadi02() {
		return this.urlQadi02;
	}

	public void setUrlQadi02(Integer urlQadi02) {
		this.urlQadi02 = urlQadi02;
	}

	public String getUrlQadc03() {
		return this.urlQadc03;
	}

	public void setUrlQadc03(String urlQadc03) {
		this.urlQadc03 = urlQadc03;
	}

	public Integer getUrlQadi01() {
		return this.urlQadi01;
	}

	public void setUrlQadi01(Integer urlQadi01) {
		this.urlQadi01 = urlQadi01;
	}

	public Boolean getUrlQadl01() {
		return this.urlQadl01;
	}

	public void setUrlQadl01(Boolean urlQadl01) {
		this.urlQadl01 = urlQadl01;
	}

	public Date getUrlQadt01() {
		return this.urlQadt01;
	}

	public void setUrlQadt01(Date urlQadt01) {
		this.urlQadt01 = urlQadt01;
	}

	public Double getUrlQadd01() {
		return this.urlQadd01;
	}

	public void setUrlQadd01(Double urlQadd01) {
		this.urlQadd01 = urlQadd01;
	}

	public Boolean getUrlPrimary() {
		return this.urlPrimary;
	}

	public void setUrlPrimary(Boolean urlPrimary) {
		this.urlPrimary = urlPrimary;
	}

	public Boolean getUrlDetermine() {
		return this.urlDetermine;
	}

	public void setUrlDetermine(Boolean urlDetermine) {
		this.urlDetermine = urlDetermine;
	}

	public Double getOidUrlMstr() {
		return this.oidUrlMstr;
	}

	public void setOidUrlMstr(Double oidUrlMstr) {
		this.oidUrlMstr = oidUrlMstr;
	}

}