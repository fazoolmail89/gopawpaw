package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDprMstr entity provides the base persistence definition of the
 * DprMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDprMstr implements java.io.Serializable {

	// Fields

	private String dprMethod;
	private String dprDesc;
	private Date dprBegDate;
	private Date dprEndDate;
	private String dprBasis;
	private String dprEq;
	private Boolean dprTable;
	private String dprUser1;
	private String dprUser2;
	private Boolean dprSwitch;
	private Date dprModDate;
	private String dprUserid;
	private String dprOptMethod;
	private Boolean dprQad01;
	private String dprQad02;
	private String dprQad03;
	private Double oidDprMstr;

	// Constructors

	/** default constructor */
	public AbstractDprMstr() {
	}

	/** minimal constructor */
	public AbstractDprMstr(Double oidDprMstr) {
		this.oidDprMstr = oidDprMstr;
	}

	/** full constructor */
	public AbstractDprMstr(String dprDesc, Date dprBegDate, Date dprEndDate,
			String dprBasis, String dprEq, Boolean dprTable, String dprUser1,
			String dprUser2, Boolean dprSwitch, Date dprModDate,
			String dprUserid, String dprOptMethod, Boolean dprQad01,
			String dprQad02, String dprQad03, Double oidDprMstr) {
		this.dprDesc = dprDesc;
		this.dprBegDate = dprBegDate;
		this.dprEndDate = dprEndDate;
		this.dprBasis = dprBasis;
		this.dprEq = dprEq;
		this.dprTable = dprTable;
		this.dprUser1 = dprUser1;
		this.dprUser2 = dprUser2;
		this.dprSwitch = dprSwitch;
		this.dprModDate = dprModDate;
		this.dprUserid = dprUserid;
		this.dprOptMethod = dprOptMethod;
		this.dprQad01 = dprQad01;
		this.dprQad02 = dprQad02;
		this.dprQad03 = dprQad03;
		this.oidDprMstr = oidDprMstr;
	}

	// Property accessors

	public String getDprMethod() {
		return this.dprMethod;
	}

	public void setDprMethod(String dprMethod) {
		this.dprMethod = dprMethod;
	}

	public String getDprDesc() {
		return this.dprDesc;
	}

	public void setDprDesc(String dprDesc) {
		this.dprDesc = dprDesc;
	}

	public Date getDprBegDate() {
		return this.dprBegDate;
	}

	public void setDprBegDate(Date dprBegDate) {
		this.dprBegDate = dprBegDate;
	}

	public Date getDprEndDate() {
		return this.dprEndDate;
	}

	public void setDprEndDate(Date dprEndDate) {
		this.dprEndDate = dprEndDate;
	}

	public String getDprBasis() {
		return this.dprBasis;
	}

	public void setDprBasis(String dprBasis) {
		this.dprBasis = dprBasis;
	}

	public String getDprEq() {
		return this.dprEq;
	}

	public void setDprEq(String dprEq) {
		this.dprEq = dprEq;
	}

	public Boolean getDprTable() {
		return this.dprTable;
	}

	public void setDprTable(Boolean dprTable) {
		this.dprTable = dprTable;
	}

	public String getDprUser1() {
		return this.dprUser1;
	}

	public void setDprUser1(String dprUser1) {
		this.dprUser1 = dprUser1;
	}

	public String getDprUser2() {
		return this.dprUser2;
	}

	public void setDprUser2(String dprUser2) {
		this.dprUser2 = dprUser2;
	}

	public Boolean getDprSwitch() {
		return this.dprSwitch;
	}

	public void setDprSwitch(Boolean dprSwitch) {
		this.dprSwitch = dprSwitch;
	}

	public Date getDprModDate() {
		return this.dprModDate;
	}

	public void setDprModDate(Date dprModDate) {
		this.dprModDate = dprModDate;
	}

	public String getDprUserid() {
		return this.dprUserid;
	}

	public void setDprUserid(String dprUserid) {
		this.dprUserid = dprUserid;
	}

	public String getDprOptMethod() {
		return this.dprOptMethod;
	}

	public void setDprOptMethod(String dprOptMethod) {
		this.dprOptMethod = dprOptMethod;
	}

	public Boolean getDprQad01() {
		return this.dprQad01;
	}

	public void setDprQad01(Boolean dprQad01) {
		this.dprQad01 = dprQad01;
	}

	public String getDprQad02() {
		return this.dprQad02;
	}

	public void setDprQad02(String dprQad02) {
		this.dprQad02 = dprQad02;
	}

	public String getDprQad03() {
		return this.dprQad03;
	}

	public void setDprQad03(String dprQad03) {
		this.dprQad03 = dprQad03;
	}

	public Double getOidDprMstr() {
		return this.oidDprMstr;
	}

	public void setOidDprMstr(Double oidDprMstr) {
		this.oidDprMstr = oidDprMstr;
	}

}