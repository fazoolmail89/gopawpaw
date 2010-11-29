package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCclCtrl entity provides the base persistence definition of the
 * CclCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclCtrl implements java.io.Serializable {

	// Fields

	private String cclDomain;
	private Integer cclQadi01;
	private Boolean cclContActive;
	private Boolean cclLineActive;
	private Boolean cclEditLcShipper;
	private Boolean cclCcInvoice;
	private Boolean cclLcInvoice;
	private Boolean cclCcAsn;
	private Boolean cclLcAsn;
	private String cclChargeType;
	private String cclModUserid;
	private Date cclModDate;
	private String cclUserc01;
	private String cclUserc02;
	private String cclQadc01;
	private String cclQadc02;
	private Double oidCclCtrl;

	// Constructors

	/** default constructor */
	public AbstractCclCtrl() {
	}

	/** minimal constructor */
	public AbstractCclCtrl(Integer cclQadi01, Boolean cclContActive,
			Boolean cclLineActive, Boolean cclEditLcShipper,
			Boolean cclCcInvoice, Boolean cclLcInvoice, Boolean cclCcAsn,
			Boolean cclLcAsn, String cclChargeType, String cclModUserid,
			String cclUserc01, String cclUserc02, String cclQadc01,
			String cclQadc02, Double oidCclCtrl) {
		this.cclQadi01 = cclQadi01;
		this.cclContActive = cclContActive;
		this.cclLineActive = cclLineActive;
		this.cclEditLcShipper = cclEditLcShipper;
		this.cclCcInvoice = cclCcInvoice;
		this.cclLcInvoice = cclLcInvoice;
		this.cclCcAsn = cclCcAsn;
		this.cclLcAsn = cclLcAsn;
		this.cclChargeType = cclChargeType;
		this.cclModUserid = cclModUserid;
		this.cclUserc01 = cclUserc01;
		this.cclUserc02 = cclUserc02;
		this.cclQadc01 = cclQadc01;
		this.cclQadc02 = cclQadc02;
		this.oidCclCtrl = oidCclCtrl;
	}

	/** full constructor */
	public AbstractCclCtrl(Integer cclQadi01, Boolean cclContActive,
			Boolean cclLineActive, Boolean cclEditLcShipper,
			Boolean cclCcInvoice, Boolean cclLcInvoice, Boolean cclCcAsn,
			Boolean cclLcAsn, String cclChargeType, String cclModUserid,
			Date cclModDate, String cclUserc01, String cclUserc02,
			String cclQadc01, String cclQadc02, Double oidCclCtrl) {
		this.cclQadi01 = cclQadi01;
		this.cclContActive = cclContActive;
		this.cclLineActive = cclLineActive;
		this.cclEditLcShipper = cclEditLcShipper;
		this.cclCcInvoice = cclCcInvoice;
		this.cclLcInvoice = cclLcInvoice;
		this.cclCcAsn = cclCcAsn;
		this.cclLcAsn = cclLcAsn;
		this.cclChargeType = cclChargeType;
		this.cclModUserid = cclModUserid;
		this.cclModDate = cclModDate;
		this.cclUserc01 = cclUserc01;
		this.cclUserc02 = cclUserc02;
		this.cclQadc01 = cclQadc01;
		this.cclQadc02 = cclQadc02;
		this.oidCclCtrl = oidCclCtrl;
	}

	// Property accessors

	public String getCclDomain() {
		return this.cclDomain;
	}

	public void setCclDomain(String cclDomain) {
		this.cclDomain = cclDomain;
	}

	public Integer getCclQadi01() {
		return this.cclQadi01;
	}

	public void setCclQadi01(Integer cclQadi01) {
		this.cclQadi01 = cclQadi01;
	}

	public Boolean getCclContActive() {
		return this.cclContActive;
	}

	public void setCclContActive(Boolean cclContActive) {
		this.cclContActive = cclContActive;
	}

	public Boolean getCclLineActive() {
		return this.cclLineActive;
	}

	public void setCclLineActive(Boolean cclLineActive) {
		this.cclLineActive = cclLineActive;
	}

	public Boolean getCclEditLcShipper() {
		return this.cclEditLcShipper;
	}

	public void setCclEditLcShipper(Boolean cclEditLcShipper) {
		this.cclEditLcShipper = cclEditLcShipper;
	}

	public Boolean getCclCcInvoice() {
		return this.cclCcInvoice;
	}

	public void setCclCcInvoice(Boolean cclCcInvoice) {
		this.cclCcInvoice = cclCcInvoice;
	}

	public Boolean getCclLcInvoice() {
		return this.cclLcInvoice;
	}

	public void setCclLcInvoice(Boolean cclLcInvoice) {
		this.cclLcInvoice = cclLcInvoice;
	}

	public Boolean getCclCcAsn() {
		return this.cclCcAsn;
	}

	public void setCclCcAsn(Boolean cclCcAsn) {
		this.cclCcAsn = cclCcAsn;
	}

	public Boolean getCclLcAsn() {
		return this.cclLcAsn;
	}

	public void setCclLcAsn(Boolean cclLcAsn) {
		this.cclLcAsn = cclLcAsn;
	}

	public String getCclChargeType() {
		return this.cclChargeType;
	}

	public void setCclChargeType(String cclChargeType) {
		this.cclChargeType = cclChargeType;
	}

	public String getCclModUserid() {
		return this.cclModUserid;
	}

	public void setCclModUserid(String cclModUserid) {
		this.cclModUserid = cclModUserid;
	}

	public Date getCclModDate() {
		return this.cclModDate;
	}

	public void setCclModDate(Date cclModDate) {
		this.cclModDate = cclModDate;
	}

	public String getCclUserc01() {
		return this.cclUserc01;
	}

	public void setCclUserc01(String cclUserc01) {
		this.cclUserc01 = cclUserc01;
	}

	public String getCclUserc02() {
		return this.cclUserc02;
	}

	public void setCclUserc02(String cclUserc02) {
		this.cclUserc02 = cclUserc02;
	}

	public String getCclQadc01() {
		return this.cclQadc01;
	}

	public void setCclQadc01(String cclQadc01) {
		this.cclQadc01 = cclQadc01;
	}

	public String getCclQadc02() {
		return this.cclQadc02;
	}

	public void setCclQadc02(String cclQadc02) {
		this.cclQadc02 = cclQadc02;
	}

	public Double getOidCclCtrl() {
		return this.oidCclCtrl;
	}

	public void setOidCclCtrl(Double oidCclCtrl) {
		this.oidCclCtrl = oidCclCtrl;
	}

}