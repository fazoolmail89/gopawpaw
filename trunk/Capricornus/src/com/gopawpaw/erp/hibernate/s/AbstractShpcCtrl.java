package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractShpcCtrl entity provides the base persistence definition of the
 * ShpcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShpcCtrl implements java.io.Serializable {

	// Fields

	private String shpcDomain;
	private Integer shpcQadi01;
	private Boolean shpcActive;
	private Boolean shpcIncludeSo;
	private Boolean shpcIncludeSched;
	private Boolean shpcIncludeDo;
	private Boolean shpcUseCurrent;
	private Boolean shpcShipperReasons;
	private String shpcModUserid;
	private Date shpcModDate;
	private Integer shpcMeasSubtype;
	private Boolean shpcIncludeRma;
	private Integer shpcSchedType;
	private Boolean shpcIncludeMo;
	private String shpcQadc01;
	private String shpcQadc02;
	private String shpcUser1;
	private String shpcUser2;
	private Double oidShpcCtrl;

	// Constructors

	/** default constructor */
	public AbstractShpcCtrl() {
	}

	/** full constructor */
	public AbstractShpcCtrl(Integer shpcQadi01, Boolean shpcActive,
			Boolean shpcIncludeSo, Boolean shpcIncludeSched,
			Boolean shpcIncludeDo, Boolean shpcUseCurrent,
			Boolean shpcShipperReasons, String shpcModUserid, Date shpcModDate,
			Integer shpcMeasSubtype, Boolean shpcIncludeRma,
			Integer shpcSchedType, Boolean shpcIncludeMo, String shpcQadc01,
			String shpcQadc02, String shpcUser1, String shpcUser2,
			Double oidShpcCtrl) {
		this.shpcQadi01 = shpcQadi01;
		this.shpcActive = shpcActive;
		this.shpcIncludeSo = shpcIncludeSo;
		this.shpcIncludeSched = shpcIncludeSched;
		this.shpcIncludeDo = shpcIncludeDo;
		this.shpcUseCurrent = shpcUseCurrent;
		this.shpcShipperReasons = shpcShipperReasons;
		this.shpcModUserid = shpcModUserid;
		this.shpcModDate = shpcModDate;
		this.shpcMeasSubtype = shpcMeasSubtype;
		this.shpcIncludeRma = shpcIncludeRma;
		this.shpcSchedType = shpcSchedType;
		this.shpcIncludeMo = shpcIncludeMo;
		this.shpcQadc01 = shpcQadc01;
		this.shpcQadc02 = shpcQadc02;
		this.shpcUser1 = shpcUser1;
		this.shpcUser2 = shpcUser2;
		this.oidShpcCtrl = oidShpcCtrl;
	}

	// Property accessors

	public String getShpcDomain() {
		return this.shpcDomain;
	}

	public void setShpcDomain(String shpcDomain) {
		this.shpcDomain = shpcDomain;
	}

	public Integer getShpcQadi01() {
		return this.shpcQadi01;
	}

	public void setShpcQadi01(Integer shpcQadi01) {
		this.shpcQadi01 = shpcQadi01;
	}

	public Boolean getShpcActive() {
		return this.shpcActive;
	}

	public void setShpcActive(Boolean shpcActive) {
		this.shpcActive = shpcActive;
	}

	public Boolean getShpcIncludeSo() {
		return this.shpcIncludeSo;
	}

	public void setShpcIncludeSo(Boolean shpcIncludeSo) {
		this.shpcIncludeSo = shpcIncludeSo;
	}

	public Boolean getShpcIncludeSched() {
		return this.shpcIncludeSched;
	}

	public void setShpcIncludeSched(Boolean shpcIncludeSched) {
		this.shpcIncludeSched = shpcIncludeSched;
	}

	public Boolean getShpcIncludeDo() {
		return this.shpcIncludeDo;
	}

	public void setShpcIncludeDo(Boolean shpcIncludeDo) {
		this.shpcIncludeDo = shpcIncludeDo;
	}

	public Boolean getShpcUseCurrent() {
		return this.shpcUseCurrent;
	}

	public void setShpcUseCurrent(Boolean shpcUseCurrent) {
		this.shpcUseCurrent = shpcUseCurrent;
	}

	public Boolean getShpcShipperReasons() {
		return this.shpcShipperReasons;
	}

	public void setShpcShipperReasons(Boolean shpcShipperReasons) {
		this.shpcShipperReasons = shpcShipperReasons;
	}

	public String getShpcModUserid() {
		return this.shpcModUserid;
	}

	public void setShpcModUserid(String shpcModUserid) {
		this.shpcModUserid = shpcModUserid;
	}

	public Date getShpcModDate() {
		return this.shpcModDate;
	}

	public void setShpcModDate(Date shpcModDate) {
		this.shpcModDate = shpcModDate;
	}

	public Integer getShpcMeasSubtype() {
		return this.shpcMeasSubtype;
	}

	public void setShpcMeasSubtype(Integer shpcMeasSubtype) {
		this.shpcMeasSubtype = shpcMeasSubtype;
	}

	public Boolean getShpcIncludeRma() {
		return this.shpcIncludeRma;
	}

	public void setShpcIncludeRma(Boolean shpcIncludeRma) {
		this.shpcIncludeRma = shpcIncludeRma;
	}

	public Integer getShpcSchedType() {
		return this.shpcSchedType;
	}

	public void setShpcSchedType(Integer shpcSchedType) {
		this.shpcSchedType = shpcSchedType;
	}

	public Boolean getShpcIncludeMo() {
		return this.shpcIncludeMo;
	}

	public void setShpcIncludeMo(Boolean shpcIncludeMo) {
		this.shpcIncludeMo = shpcIncludeMo;
	}

	public String getShpcQadc01() {
		return this.shpcQadc01;
	}

	public void setShpcQadc01(String shpcQadc01) {
		this.shpcQadc01 = shpcQadc01;
	}

	public String getShpcQadc02() {
		return this.shpcQadc02;
	}

	public void setShpcQadc02(String shpcQadc02) {
		this.shpcQadc02 = shpcQadc02;
	}

	public String getShpcUser1() {
		return this.shpcUser1;
	}

	public void setShpcUser1(String shpcUser1) {
		this.shpcUser1 = shpcUser1;
	}

	public String getShpcUser2() {
		return this.shpcUser2;
	}

	public void setShpcUser2(String shpcUser2) {
		this.shpcUser2 = shpcUser2;
	}

	public Double getOidShpcCtrl() {
		return this.oidShpcCtrl;
	}

	public void setOidShpcCtrl(Double oidShpcCtrl) {
		this.oidShpcCtrl = oidShpcCtrl;
	}

}