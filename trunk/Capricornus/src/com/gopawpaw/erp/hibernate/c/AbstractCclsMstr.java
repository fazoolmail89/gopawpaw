package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCclsMstr entity provides the base persistence definition of the
 * CclsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCclsMstr implements java.io.Serializable {

	// Fields

	private CclsMstrId id;
	private Boolean cclsEditLcShipper;
	private Boolean cclsCcInvoice;
	private Boolean cclsLcInvoice;
	private Boolean cclsCcAsn;
	private Boolean cclsLcAsn;
	private String cclsChargeType;
	private String cclsModUserid;
	private Date cclsModDate;
	private String cclsUserc01;
	private String cclsUserc02;
	private String cclsQadc01;
	private String cclsQadc02;
	private Double oidCclsMstr;

	// Constructors

	/** default constructor */
	public AbstractCclsMstr() {
	}

	/** full constructor */
	public AbstractCclsMstr(CclsMstrId id, Boolean cclsEditLcShipper,
			Boolean cclsCcInvoice, Boolean cclsLcInvoice, Boolean cclsCcAsn,
			Boolean cclsLcAsn, String cclsChargeType, String cclsModUserid,
			Date cclsModDate, String cclsUserc01, String cclsUserc02,
			String cclsQadc01, String cclsQadc02, Double oidCclsMstr) {
		this.id = id;
		this.cclsEditLcShipper = cclsEditLcShipper;
		this.cclsCcInvoice = cclsCcInvoice;
		this.cclsLcInvoice = cclsLcInvoice;
		this.cclsCcAsn = cclsCcAsn;
		this.cclsLcAsn = cclsLcAsn;
		this.cclsChargeType = cclsChargeType;
		this.cclsModUserid = cclsModUserid;
		this.cclsModDate = cclsModDate;
		this.cclsUserc01 = cclsUserc01;
		this.cclsUserc02 = cclsUserc02;
		this.cclsQadc01 = cclsQadc01;
		this.cclsQadc02 = cclsQadc02;
		this.oidCclsMstr = oidCclsMstr;
	}

	// Property accessors

	public CclsMstrId getId() {
		return this.id;
	}

	public void setId(CclsMstrId id) {
		this.id = id;
	}

	public Boolean getCclsEditLcShipper() {
		return this.cclsEditLcShipper;
	}

	public void setCclsEditLcShipper(Boolean cclsEditLcShipper) {
		this.cclsEditLcShipper = cclsEditLcShipper;
	}

	public Boolean getCclsCcInvoice() {
		return this.cclsCcInvoice;
	}

	public void setCclsCcInvoice(Boolean cclsCcInvoice) {
		this.cclsCcInvoice = cclsCcInvoice;
	}

	public Boolean getCclsLcInvoice() {
		return this.cclsLcInvoice;
	}

	public void setCclsLcInvoice(Boolean cclsLcInvoice) {
		this.cclsLcInvoice = cclsLcInvoice;
	}

	public Boolean getCclsCcAsn() {
		return this.cclsCcAsn;
	}

	public void setCclsCcAsn(Boolean cclsCcAsn) {
		this.cclsCcAsn = cclsCcAsn;
	}

	public Boolean getCclsLcAsn() {
		return this.cclsLcAsn;
	}

	public void setCclsLcAsn(Boolean cclsLcAsn) {
		this.cclsLcAsn = cclsLcAsn;
	}

	public String getCclsChargeType() {
		return this.cclsChargeType;
	}

	public void setCclsChargeType(String cclsChargeType) {
		this.cclsChargeType = cclsChargeType;
	}

	public String getCclsModUserid() {
		return this.cclsModUserid;
	}

	public void setCclsModUserid(String cclsModUserid) {
		this.cclsModUserid = cclsModUserid;
	}

	public Date getCclsModDate() {
		return this.cclsModDate;
	}

	public void setCclsModDate(Date cclsModDate) {
		this.cclsModDate = cclsModDate;
	}

	public String getCclsUserc01() {
		return this.cclsUserc01;
	}

	public void setCclsUserc01(String cclsUserc01) {
		this.cclsUserc01 = cclsUserc01;
	}

	public String getCclsUserc02() {
		return this.cclsUserc02;
	}

	public void setCclsUserc02(String cclsUserc02) {
		this.cclsUserc02 = cclsUserc02;
	}

	public String getCclsQadc01() {
		return this.cclsQadc01;
	}

	public void setCclsQadc01(String cclsQadc01) {
		this.cclsQadc01 = cclsQadc01;
	}

	public String getCclsQadc02() {
		return this.cclsQadc02;
	}

	public void setCclsQadc02(String cclsQadc02) {
		this.cclsQadc02 = cclsQadc02;
	}

	public Double getOidCclsMstr() {
		return this.oidCclsMstr;
	}

	public void setOidCclsMstr(Double oidCclsMstr) {
		this.oidCclsMstr = oidCclsMstr;
	}

}