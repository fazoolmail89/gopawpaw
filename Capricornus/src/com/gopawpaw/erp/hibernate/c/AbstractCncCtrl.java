package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCncCtrl entity provides the base persistence definition of the
 * CncCtrl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCncCtrl implements java.io.Serializable {

	// Fields

	private String cncDomain;
	private Integer cncQadi01;
	private Boolean cncActive;
	private Boolean cncConsignFlag;
	private Integer cncMaxAgingDays;
	private String cncConsignLoc;
	private String cncIntransLoc;
	private Boolean cncAutoReplenish;
	private String cncModUserid;
	private Date cncModDate;
	private String cncUser1;
	private String cncUser2;
	private String cncQadc01;
	private String cncQadc02;
	private Double oidCncCtrl;

	// Constructors

	/** default constructor */
	public AbstractCncCtrl() {
	}

	/** full constructor */
	public AbstractCncCtrl(Integer cncQadi01, Boolean cncActive,
			Boolean cncConsignFlag, Integer cncMaxAgingDays,
			String cncConsignLoc, String cncIntransLoc,
			Boolean cncAutoReplenish, String cncModUserid, Date cncModDate,
			String cncUser1, String cncUser2, String cncQadc01,
			String cncQadc02, Double oidCncCtrl) {
		this.cncQadi01 = cncQadi01;
		this.cncActive = cncActive;
		this.cncConsignFlag = cncConsignFlag;
		this.cncMaxAgingDays = cncMaxAgingDays;
		this.cncConsignLoc = cncConsignLoc;
		this.cncIntransLoc = cncIntransLoc;
		this.cncAutoReplenish = cncAutoReplenish;
		this.cncModUserid = cncModUserid;
		this.cncModDate = cncModDate;
		this.cncUser1 = cncUser1;
		this.cncUser2 = cncUser2;
		this.cncQadc01 = cncQadc01;
		this.cncQadc02 = cncQadc02;
		this.oidCncCtrl = oidCncCtrl;
	}

	// Property accessors

	public String getCncDomain() {
		return this.cncDomain;
	}

	public void setCncDomain(String cncDomain) {
		this.cncDomain = cncDomain;
	}

	public Integer getCncQadi01() {
		return this.cncQadi01;
	}

	public void setCncQadi01(Integer cncQadi01) {
		this.cncQadi01 = cncQadi01;
	}

	public Boolean getCncActive() {
		return this.cncActive;
	}

	public void setCncActive(Boolean cncActive) {
		this.cncActive = cncActive;
	}

	public Boolean getCncConsignFlag() {
		return this.cncConsignFlag;
	}

	public void setCncConsignFlag(Boolean cncConsignFlag) {
		this.cncConsignFlag = cncConsignFlag;
	}

	public Integer getCncMaxAgingDays() {
		return this.cncMaxAgingDays;
	}

	public void setCncMaxAgingDays(Integer cncMaxAgingDays) {
		this.cncMaxAgingDays = cncMaxAgingDays;
	}

	public String getCncConsignLoc() {
		return this.cncConsignLoc;
	}

	public void setCncConsignLoc(String cncConsignLoc) {
		this.cncConsignLoc = cncConsignLoc;
	}

	public String getCncIntransLoc() {
		return this.cncIntransLoc;
	}

	public void setCncIntransLoc(String cncIntransLoc) {
		this.cncIntransLoc = cncIntransLoc;
	}

	public Boolean getCncAutoReplenish() {
		return this.cncAutoReplenish;
	}

	public void setCncAutoReplenish(Boolean cncAutoReplenish) {
		this.cncAutoReplenish = cncAutoReplenish;
	}

	public String getCncModUserid() {
		return this.cncModUserid;
	}

	public void setCncModUserid(String cncModUserid) {
		this.cncModUserid = cncModUserid;
	}

	public Date getCncModDate() {
		return this.cncModDate;
	}

	public void setCncModDate(Date cncModDate) {
		this.cncModDate = cncModDate;
	}

	public String getCncUser1() {
		return this.cncUser1;
	}

	public void setCncUser1(String cncUser1) {
		this.cncUser1 = cncUser1;
	}

	public String getCncUser2() {
		return this.cncUser2;
	}

	public void setCncUser2(String cncUser2) {
		this.cncUser2 = cncUser2;
	}

	public String getCncQadc01() {
		return this.cncQadc01;
	}

	public void setCncQadc01(String cncQadc01) {
		this.cncQadc01 = cncQadc01;
	}

	public String getCncQadc02() {
		return this.cncQadc02;
	}

	public void setCncQadc02(String cncQadc02) {
		this.cncQadc02 = cncQadc02;
	}

	public Double getOidCncCtrl() {
		return this.oidCncCtrl;
	}

	public void setOidCncCtrl(Double oidCncCtrl) {
		this.oidCncCtrl = oidCncCtrl;
	}

}