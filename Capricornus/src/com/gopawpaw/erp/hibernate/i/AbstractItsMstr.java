package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * AbstractItsMstr entity provides the base persistence definition of the
 * ItsMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractItsMstr implements java.io.Serializable {

	// Fields

	private ItsMstrId id;
	private Date itsDate;
	private Integer itsTarget;
	private Double itsQtyOh;
	private String itsUser1;
	private String itsUser2;
	private Double itsDec01;
	private Double itsDec02;
	private Double itsDec03;
	private Double oidItsMstr;

	// Constructors

	/** default constructor */
	public AbstractItsMstr() {
	}

	/** minimal constructor */
	public AbstractItsMstr(ItsMstrId id, Double oidItsMstr) {
		this.id = id;
		this.oidItsMstr = oidItsMstr;
	}

	/** full constructor */
	public AbstractItsMstr(ItsMstrId id, Date itsDate, Integer itsTarget,
			Double itsQtyOh, String itsUser1, String itsUser2, Double itsDec01,
			Double itsDec02, Double itsDec03, Double oidItsMstr) {
		this.id = id;
		this.itsDate = itsDate;
		this.itsTarget = itsTarget;
		this.itsQtyOh = itsQtyOh;
		this.itsUser1 = itsUser1;
		this.itsUser2 = itsUser2;
		this.itsDec01 = itsDec01;
		this.itsDec02 = itsDec02;
		this.itsDec03 = itsDec03;
		this.oidItsMstr = oidItsMstr;
	}

	// Property accessors

	public ItsMstrId getId() {
		return this.id;
	}

	public void setId(ItsMstrId id) {
		this.id = id;
	}

	public Date getItsDate() {
		return this.itsDate;
	}

	public void setItsDate(Date itsDate) {
		this.itsDate = itsDate;
	}

	public Integer getItsTarget() {
		return this.itsTarget;
	}

	public void setItsTarget(Integer itsTarget) {
		this.itsTarget = itsTarget;
	}

	public Double getItsQtyOh() {
		return this.itsQtyOh;
	}

	public void setItsQtyOh(Double itsQtyOh) {
		this.itsQtyOh = itsQtyOh;
	}

	public String getItsUser1() {
		return this.itsUser1;
	}

	public void setItsUser1(String itsUser1) {
		this.itsUser1 = itsUser1;
	}

	public String getItsUser2() {
		return this.itsUser2;
	}

	public void setItsUser2(String itsUser2) {
		this.itsUser2 = itsUser2;
	}

	public Double getItsDec01() {
		return this.itsDec01;
	}

	public void setItsDec01(Double itsDec01) {
		this.itsDec01 = itsDec01;
	}

	public Double getItsDec02() {
		return this.itsDec02;
	}

	public void setItsDec02(Double itsDec02) {
		this.itsDec02 = itsDec02;
	}

	public Double getItsDec03() {
		return this.itsDec03;
	}

	public void setItsDec03(Double itsDec03) {
		this.itsDec03 = itsDec03;
	}

	public Double getOidItsMstr() {
		return this.oidItsMstr;
	}

	public void setOidItsMstr(Double oidItsMstr) {
		this.oidItsMstr = oidItsMstr;
	}

}