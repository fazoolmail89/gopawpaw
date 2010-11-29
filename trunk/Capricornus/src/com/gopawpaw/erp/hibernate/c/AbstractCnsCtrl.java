package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCnsCtrl entity provides the base persistence definition of the
 * CnsCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCnsCtrl implements java.io.Serializable {

	// Fields

	private String cnsDomain;
	private Integer cnsQadi01;
	private Boolean cnsActive;
	private Boolean cnsConsignFlag;
	private Integer cnsMaxAgingDays;
	private String cnsPickingLogic;
	private String cnsTransferOwnership;
	private String cnsModUserid;
	private Date cnsModDate;
	private String cnsUser1;
	private String cnsUser2;
	private String cnsQadc01;
	private String cnsQadc02;
	private Double oidCnsCtrl;

	// Constructors

	/** default constructor */
	public AbstractCnsCtrl() {
	}

	/** full constructor */
	public AbstractCnsCtrl(Integer cnsQadi01, Boolean cnsActive,
			Boolean cnsConsignFlag, Integer cnsMaxAgingDays,
			String cnsPickingLogic, String cnsTransferOwnership,
			String cnsModUserid, Date cnsModDate, String cnsUser1,
			String cnsUser2, String cnsQadc01, String cnsQadc02,
			Double oidCnsCtrl) {
		this.cnsQadi01 = cnsQadi01;
		this.cnsActive = cnsActive;
		this.cnsConsignFlag = cnsConsignFlag;
		this.cnsMaxAgingDays = cnsMaxAgingDays;
		this.cnsPickingLogic = cnsPickingLogic;
		this.cnsTransferOwnership = cnsTransferOwnership;
		this.cnsModUserid = cnsModUserid;
		this.cnsModDate = cnsModDate;
		this.cnsUser1 = cnsUser1;
		this.cnsUser2 = cnsUser2;
		this.cnsQadc01 = cnsQadc01;
		this.cnsQadc02 = cnsQadc02;
		this.oidCnsCtrl = oidCnsCtrl;
	}

	// Property accessors

	public String getCnsDomain() {
		return this.cnsDomain;
	}

	public void setCnsDomain(String cnsDomain) {
		this.cnsDomain = cnsDomain;
	}

	public Integer getCnsQadi01() {
		return this.cnsQadi01;
	}

	public void setCnsQadi01(Integer cnsQadi01) {
		this.cnsQadi01 = cnsQadi01;
	}

	public Boolean getCnsActive() {
		return this.cnsActive;
	}

	public void setCnsActive(Boolean cnsActive) {
		this.cnsActive = cnsActive;
	}

	public Boolean getCnsConsignFlag() {
		return this.cnsConsignFlag;
	}

	public void setCnsConsignFlag(Boolean cnsConsignFlag) {
		this.cnsConsignFlag = cnsConsignFlag;
	}

	public Integer getCnsMaxAgingDays() {
		return this.cnsMaxAgingDays;
	}

	public void setCnsMaxAgingDays(Integer cnsMaxAgingDays) {
		this.cnsMaxAgingDays = cnsMaxAgingDays;
	}

	public String getCnsPickingLogic() {
		return this.cnsPickingLogic;
	}

	public void setCnsPickingLogic(String cnsPickingLogic) {
		this.cnsPickingLogic = cnsPickingLogic;
	}

	public String getCnsTransferOwnership() {
		return this.cnsTransferOwnership;
	}

	public void setCnsTransferOwnership(String cnsTransferOwnership) {
		this.cnsTransferOwnership = cnsTransferOwnership;
	}

	public String getCnsModUserid() {
		return this.cnsModUserid;
	}

	public void setCnsModUserid(String cnsModUserid) {
		this.cnsModUserid = cnsModUserid;
	}

	public Date getCnsModDate() {
		return this.cnsModDate;
	}

	public void setCnsModDate(Date cnsModDate) {
		this.cnsModDate = cnsModDate;
	}

	public String getCnsUser1() {
		return this.cnsUser1;
	}

	public void setCnsUser1(String cnsUser1) {
		this.cnsUser1 = cnsUser1;
	}

	public String getCnsUser2() {
		return this.cnsUser2;
	}

	public void setCnsUser2(String cnsUser2) {
		this.cnsUser2 = cnsUser2;
	}

	public String getCnsQadc01() {
		return this.cnsQadc01;
	}

	public void setCnsQadc01(String cnsQadc01) {
		this.cnsQadc01 = cnsQadc01;
	}

	public String getCnsQadc02() {
		return this.cnsQadc02;
	}

	public void setCnsQadc02(String cnsQadc02) {
		this.cnsQadc02 = cnsQadc02;
	}

	public Double getOidCnsCtrl() {
		return this.oidCnsCtrl;
	}

	public void setOidCnsCtrl(Double oidCnsCtrl) {
		this.oidCnsCtrl = oidCnsCtrl;
	}

}