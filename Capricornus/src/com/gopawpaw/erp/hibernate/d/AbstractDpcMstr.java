package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDpcMstr entity provides the base persistence definition of the
 * DpcMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDpcMstr implements java.io.Serializable {

	// Fields

	private String dpcConv;
	private String dpcDesc;
	private String dpcAcqPct;
	private String dpcRtPct;
	private Date dpcEndDate;
	private String dpcUser1;
	private String dpcUser2;
	private Date dpcBegDate;
	private String dpcQad01;
	private String dpcQad02;
	private Double oidDpcMstr;

	// Constructors

	/** default constructor */
	public AbstractDpcMstr() {
	}

	/** minimal constructor */
	public AbstractDpcMstr(Double oidDpcMstr) {
		this.oidDpcMstr = oidDpcMstr;
	}

	/** full constructor */
	public AbstractDpcMstr(String dpcDesc, String dpcAcqPct, String dpcRtPct,
			Date dpcEndDate, String dpcUser1, String dpcUser2, Date dpcBegDate,
			String dpcQad01, String dpcQad02, Double oidDpcMstr) {
		this.dpcDesc = dpcDesc;
		this.dpcAcqPct = dpcAcqPct;
		this.dpcRtPct = dpcRtPct;
		this.dpcEndDate = dpcEndDate;
		this.dpcUser1 = dpcUser1;
		this.dpcUser2 = dpcUser2;
		this.dpcBegDate = dpcBegDate;
		this.dpcQad01 = dpcQad01;
		this.dpcQad02 = dpcQad02;
		this.oidDpcMstr = oidDpcMstr;
	}

	// Property accessors

	public String getDpcConv() {
		return this.dpcConv;
	}

	public void setDpcConv(String dpcConv) {
		this.dpcConv = dpcConv;
	}

	public String getDpcDesc() {
		return this.dpcDesc;
	}

	public void setDpcDesc(String dpcDesc) {
		this.dpcDesc = dpcDesc;
	}

	public String getDpcAcqPct() {
		return this.dpcAcqPct;
	}

	public void setDpcAcqPct(String dpcAcqPct) {
		this.dpcAcqPct = dpcAcqPct;
	}

	public String getDpcRtPct() {
		return this.dpcRtPct;
	}

	public void setDpcRtPct(String dpcRtPct) {
		this.dpcRtPct = dpcRtPct;
	}

	public Date getDpcEndDate() {
		return this.dpcEndDate;
	}

	public void setDpcEndDate(Date dpcEndDate) {
		this.dpcEndDate = dpcEndDate;
	}

	public String getDpcUser1() {
		return this.dpcUser1;
	}

	public void setDpcUser1(String dpcUser1) {
		this.dpcUser1 = dpcUser1;
	}

	public String getDpcUser2() {
		return this.dpcUser2;
	}

	public void setDpcUser2(String dpcUser2) {
		this.dpcUser2 = dpcUser2;
	}

	public Date getDpcBegDate() {
		return this.dpcBegDate;
	}

	public void setDpcBegDate(Date dpcBegDate) {
		this.dpcBegDate = dpcBegDate;
	}

	public String getDpcQad01() {
		return this.dpcQad01;
	}

	public void setDpcQad01(String dpcQad01) {
		this.dpcQad01 = dpcQad01;
	}

	public String getDpcQad02() {
		return this.dpcQad02;
	}

	public void setDpcQad02(String dpcQad02) {
		this.dpcQad02 = dpcQad02;
	}

	public Double getOidDpcMstr() {
		return this.oidDpcMstr;
	}

	public void setOidDpcMstr(Double oidDpcMstr) {
		this.oidDpcMstr = oidDpcMstr;
	}

}