package com.gopawpaw.erp.hibernate.s;

/**
 * AbstractShcCtrl entity provides the base persistence definition of the
 * ShcCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractShcCtrl implements java.io.Serializable {

	// Fields

	private String shcDomain;
	private Integer shcQadi01;
	private String shcPreshipNrId;
	private String shcShipNrId;
	private String shcMasterNrId;
	private Boolean shcRequireInvMov;
	private Boolean shcTrlAmts;
	private String shcUser1;
	private String shcUser2;
	private String shcQadc01;
	private String shcFormat;
	private Boolean shcShipRcpt;
	private Double oidShcCtrl;

	// Constructors

	/** default constructor */
	public AbstractShcCtrl() {
	}

	/** minimal constructor */
	public AbstractShcCtrl(Integer shcQadi01, String shcPreshipNrId,
			String shcShipNrId, String shcMasterNrId, Boolean shcRequireInvMov,
			Boolean shcTrlAmts, Double oidShcCtrl) {
		this.shcQadi01 = shcQadi01;
		this.shcPreshipNrId = shcPreshipNrId;
		this.shcShipNrId = shcShipNrId;
		this.shcMasterNrId = shcMasterNrId;
		this.shcRequireInvMov = shcRequireInvMov;
		this.shcTrlAmts = shcTrlAmts;
		this.oidShcCtrl = oidShcCtrl;
	}

	/** full constructor */
	public AbstractShcCtrl(Integer shcQadi01, String shcPreshipNrId,
			String shcShipNrId, String shcMasterNrId, Boolean shcRequireInvMov,
			Boolean shcTrlAmts, String shcUser1, String shcUser2,
			String shcQadc01, String shcFormat, Boolean shcShipRcpt,
			Double oidShcCtrl) {
		this.shcQadi01 = shcQadi01;
		this.shcPreshipNrId = shcPreshipNrId;
		this.shcShipNrId = shcShipNrId;
		this.shcMasterNrId = shcMasterNrId;
		this.shcRequireInvMov = shcRequireInvMov;
		this.shcTrlAmts = shcTrlAmts;
		this.shcUser1 = shcUser1;
		this.shcUser2 = shcUser2;
		this.shcQadc01 = shcQadc01;
		this.shcFormat = shcFormat;
		this.shcShipRcpt = shcShipRcpt;
		this.oidShcCtrl = oidShcCtrl;
	}

	// Property accessors

	public String getShcDomain() {
		return this.shcDomain;
	}

	public void setShcDomain(String shcDomain) {
		this.shcDomain = shcDomain;
	}

	public Integer getShcQadi01() {
		return this.shcQadi01;
	}

	public void setShcQadi01(Integer shcQadi01) {
		this.shcQadi01 = shcQadi01;
	}

	public String getShcPreshipNrId() {
		return this.shcPreshipNrId;
	}

	public void setShcPreshipNrId(String shcPreshipNrId) {
		this.shcPreshipNrId = shcPreshipNrId;
	}

	public String getShcShipNrId() {
		return this.shcShipNrId;
	}

	public void setShcShipNrId(String shcShipNrId) {
		this.shcShipNrId = shcShipNrId;
	}

	public String getShcMasterNrId() {
		return this.shcMasterNrId;
	}

	public void setShcMasterNrId(String shcMasterNrId) {
		this.shcMasterNrId = shcMasterNrId;
	}

	public Boolean getShcRequireInvMov() {
		return this.shcRequireInvMov;
	}

	public void setShcRequireInvMov(Boolean shcRequireInvMov) {
		this.shcRequireInvMov = shcRequireInvMov;
	}

	public Boolean getShcTrlAmts() {
		return this.shcTrlAmts;
	}

	public void setShcTrlAmts(Boolean shcTrlAmts) {
		this.shcTrlAmts = shcTrlAmts;
	}

	public String getShcUser1() {
		return this.shcUser1;
	}

	public void setShcUser1(String shcUser1) {
		this.shcUser1 = shcUser1;
	}

	public String getShcUser2() {
		return this.shcUser2;
	}

	public void setShcUser2(String shcUser2) {
		this.shcUser2 = shcUser2;
	}

	public String getShcQadc01() {
		return this.shcQadc01;
	}

	public void setShcQadc01(String shcQadc01) {
		this.shcQadc01 = shcQadc01;
	}

	public String getShcFormat() {
		return this.shcFormat;
	}

	public void setShcFormat(String shcFormat) {
		this.shcFormat = shcFormat;
	}

	public Boolean getShcShipRcpt() {
		return this.shcShipRcpt;
	}

	public void setShcShipRcpt(Boolean shcShipRcpt) {
		this.shcShipRcpt = shcShipRcpt;
	}

	public Double getOidShcCtrl() {
		return this.oidShcCtrl;
	}

	public void setOidShcCtrl(Double oidShcCtrl) {
		this.oidShcCtrl = oidShcCtrl;
	}

}