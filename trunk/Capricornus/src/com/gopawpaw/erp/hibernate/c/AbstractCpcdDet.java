package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * AbstractCpcdDet entity provides the base persistence definition of the
 * CpcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCpcdDet implements java.io.Serializable {

	// Fields

	private CpcdDetId id;
	private Date cpcdStart;
	private Date cpcdEnd;
	private String cpcdChr01;
	private String cpcdChr02;
	private String cpcdChr03;
	private String cpcdChr04;
	private Double cpcdDec01;
	private Boolean cpcdLog01;
	private String cpcdUser1;
	private String cpcdUser2;
	private Double oidCpcdDet;

	// Constructors

	/** default constructor */
	public AbstractCpcdDet() {
	}

	/** minimal constructor */
	public AbstractCpcdDet(CpcdDetId id, Double oidCpcdDet) {
		this.id = id;
		this.oidCpcdDet = oidCpcdDet;
	}

	/** full constructor */
	public AbstractCpcdDet(CpcdDetId id, Date cpcdStart, Date cpcdEnd,
			String cpcdChr01, String cpcdChr02, String cpcdChr03,
			String cpcdChr04, Double cpcdDec01, Boolean cpcdLog01,
			String cpcdUser1, String cpcdUser2, Double oidCpcdDet) {
		this.id = id;
		this.cpcdStart = cpcdStart;
		this.cpcdEnd = cpcdEnd;
		this.cpcdChr01 = cpcdChr01;
		this.cpcdChr02 = cpcdChr02;
		this.cpcdChr03 = cpcdChr03;
		this.cpcdChr04 = cpcdChr04;
		this.cpcdDec01 = cpcdDec01;
		this.cpcdLog01 = cpcdLog01;
		this.cpcdUser1 = cpcdUser1;
		this.cpcdUser2 = cpcdUser2;
		this.oidCpcdDet = oidCpcdDet;
	}

	// Property accessors

	public CpcdDetId getId() {
		return this.id;
	}

	public void setId(CpcdDetId id) {
		this.id = id;
	}

	public Date getCpcdStart() {
		return this.cpcdStart;
	}

	public void setCpcdStart(Date cpcdStart) {
		this.cpcdStart = cpcdStart;
	}

	public Date getCpcdEnd() {
		return this.cpcdEnd;
	}

	public void setCpcdEnd(Date cpcdEnd) {
		this.cpcdEnd = cpcdEnd;
	}

	public String getCpcdChr01() {
		return this.cpcdChr01;
	}

	public void setCpcdChr01(String cpcdChr01) {
		this.cpcdChr01 = cpcdChr01;
	}

	public String getCpcdChr02() {
		return this.cpcdChr02;
	}

	public void setCpcdChr02(String cpcdChr02) {
		this.cpcdChr02 = cpcdChr02;
	}

	public String getCpcdChr03() {
		return this.cpcdChr03;
	}

	public void setCpcdChr03(String cpcdChr03) {
		this.cpcdChr03 = cpcdChr03;
	}

	public String getCpcdChr04() {
		return this.cpcdChr04;
	}

	public void setCpcdChr04(String cpcdChr04) {
		this.cpcdChr04 = cpcdChr04;
	}

	public Double getCpcdDec01() {
		return this.cpcdDec01;
	}

	public void setCpcdDec01(Double cpcdDec01) {
		this.cpcdDec01 = cpcdDec01;
	}

	public Boolean getCpcdLog01() {
		return this.cpcdLog01;
	}

	public void setCpcdLog01(Boolean cpcdLog01) {
		this.cpcdLog01 = cpcdLog01;
	}

	public String getCpcdUser1() {
		return this.cpcdUser1;
	}

	public void setCpcdUser1(String cpcdUser1) {
		this.cpcdUser1 = cpcdUser1;
	}

	public String getCpcdUser2() {
		return this.cpcdUser2;
	}

	public void setCpcdUser2(String cpcdUser2) {
		this.cpcdUser2 = cpcdUser2;
	}

	public Double getOidCpcdDet() {
		return this.oidCpcdDet;
	}

	public void setOidCpcdDet(Double oidCpcdDet) {
		this.oidCpcdDet = oidCpcdDet;
	}

}