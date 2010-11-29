package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCccCtrl entity provides the base persistence definition of the
 * CccCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCccCtrl implements java.io.Serializable {

	// Fields

	private String cccDomain;
	private Integer cccQadi02;
	private String cccCcAppserverName;
	private String cccCcHoldStatus;
	private Integer cccCcAuthExpDays;
	private Boolean cccCcAutoCapture;
	private String cccModUserid;
	private Date cccModDate;
	private String cccUser1;
	private String cccUser2;
	private String cccQadc01;
	private Integer cccQadi01;
	private Double cccQadd01;
	private Boolean cccQadl01;
	private Date cccQadt01;
	private String cccQadc02;
	private String cccQadc03;
	private String cccQadc04;
	private String cccQadc05;
	private Double oidCccCtrl;

	// Constructors

	/** default constructor */
	public AbstractCccCtrl() {
	}

	/** minimal constructor */
	public AbstractCccCtrl(Integer cccQadi02, String cccCcAppserverName,
			String cccCcHoldStatus, Integer cccCcAuthExpDays,
			Boolean cccCcAutoCapture, String cccModUserid, Date cccModDate,
			Double oidCccCtrl) {
		this.cccQadi02 = cccQadi02;
		this.cccCcAppserverName = cccCcAppserverName;
		this.cccCcHoldStatus = cccCcHoldStatus;
		this.cccCcAuthExpDays = cccCcAuthExpDays;
		this.cccCcAutoCapture = cccCcAutoCapture;
		this.cccModUserid = cccModUserid;
		this.cccModDate = cccModDate;
		this.oidCccCtrl = oidCccCtrl;
	}

	/** full constructor */
	public AbstractCccCtrl(Integer cccQadi02, String cccCcAppserverName,
			String cccCcHoldStatus, Integer cccCcAuthExpDays,
			Boolean cccCcAutoCapture, String cccModUserid, Date cccModDate,
			String cccUser1, String cccUser2, String cccQadc01,
			Integer cccQadi01, Double cccQadd01, Boolean cccQadl01,
			Date cccQadt01, String cccQadc02, String cccQadc03,
			String cccQadc04, String cccQadc05, Double oidCccCtrl) {
		this.cccQadi02 = cccQadi02;
		this.cccCcAppserverName = cccCcAppserverName;
		this.cccCcHoldStatus = cccCcHoldStatus;
		this.cccCcAuthExpDays = cccCcAuthExpDays;
		this.cccCcAutoCapture = cccCcAutoCapture;
		this.cccModUserid = cccModUserid;
		this.cccModDate = cccModDate;
		this.cccUser1 = cccUser1;
		this.cccUser2 = cccUser2;
		this.cccQadc01 = cccQadc01;
		this.cccQadi01 = cccQadi01;
		this.cccQadd01 = cccQadd01;
		this.cccQadl01 = cccQadl01;
		this.cccQadt01 = cccQadt01;
		this.cccQadc02 = cccQadc02;
		this.cccQadc03 = cccQadc03;
		this.cccQadc04 = cccQadc04;
		this.cccQadc05 = cccQadc05;
		this.oidCccCtrl = oidCccCtrl;
	}

	// Property accessors

	public String getCccDomain() {
		return this.cccDomain;
	}

	public void setCccDomain(String cccDomain) {
		this.cccDomain = cccDomain;
	}

	public Integer getCccQadi02() {
		return this.cccQadi02;
	}

	public void setCccQadi02(Integer cccQadi02) {
		this.cccQadi02 = cccQadi02;
	}

	public String getCccCcAppserverName() {
		return this.cccCcAppserverName;
	}

	public void setCccCcAppserverName(String cccCcAppserverName) {
		this.cccCcAppserverName = cccCcAppserverName;
	}

	public String getCccCcHoldStatus() {
		return this.cccCcHoldStatus;
	}

	public void setCccCcHoldStatus(String cccCcHoldStatus) {
		this.cccCcHoldStatus = cccCcHoldStatus;
	}

	public Integer getCccCcAuthExpDays() {
		return this.cccCcAuthExpDays;
	}

	public void setCccCcAuthExpDays(Integer cccCcAuthExpDays) {
		this.cccCcAuthExpDays = cccCcAuthExpDays;
	}

	public Boolean getCccCcAutoCapture() {
		return this.cccCcAutoCapture;
	}

	public void setCccCcAutoCapture(Boolean cccCcAutoCapture) {
		this.cccCcAutoCapture = cccCcAutoCapture;
	}

	public String getCccModUserid() {
		return this.cccModUserid;
	}

	public void setCccModUserid(String cccModUserid) {
		this.cccModUserid = cccModUserid;
	}

	public Date getCccModDate() {
		return this.cccModDate;
	}

	public void setCccModDate(Date cccModDate) {
		this.cccModDate = cccModDate;
	}

	public String getCccUser1() {
		return this.cccUser1;
	}

	public void setCccUser1(String cccUser1) {
		this.cccUser1 = cccUser1;
	}

	public String getCccUser2() {
		return this.cccUser2;
	}

	public void setCccUser2(String cccUser2) {
		this.cccUser2 = cccUser2;
	}

	public String getCccQadc01() {
		return this.cccQadc01;
	}

	public void setCccQadc01(String cccQadc01) {
		this.cccQadc01 = cccQadc01;
	}

	public Integer getCccQadi01() {
		return this.cccQadi01;
	}

	public void setCccQadi01(Integer cccQadi01) {
		this.cccQadi01 = cccQadi01;
	}

	public Double getCccQadd01() {
		return this.cccQadd01;
	}

	public void setCccQadd01(Double cccQadd01) {
		this.cccQadd01 = cccQadd01;
	}

	public Boolean getCccQadl01() {
		return this.cccQadl01;
	}

	public void setCccQadl01(Boolean cccQadl01) {
		this.cccQadl01 = cccQadl01;
	}

	public Date getCccQadt01() {
		return this.cccQadt01;
	}

	public void setCccQadt01(Date cccQadt01) {
		this.cccQadt01 = cccQadt01;
	}

	public String getCccQadc02() {
		return this.cccQadc02;
	}

	public void setCccQadc02(String cccQadc02) {
		this.cccQadc02 = cccQadc02;
	}

	public String getCccQadc03() {
		return this.cccQadc03;
	}

	public void setCccQadc03(String cccQadc03) {
		this.cccQadc03 = cccQadc03;
	}

	public String getCccQadc04() {
		return this.cccQadc04;
	}

	public void setCccQadc04(String cccQadc04) {
		this.cccQadc04 = cccQadc04;
	}

	public String getCccQadc05() {
		return this.cccQadc05;
	}

	public void setCccQadc05(String cccQadc05) {
		this.cccQadc05 = cccQadc05;
	}

	public Double getOidCccCtrl() {
		return this.oidCccCtrl;
	}

	public void setOidCccCtrl(Double oidCccCtrl) {
		this.oidCccCtrl = oidCccCtrl;
	}

}