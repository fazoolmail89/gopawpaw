package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * AbstractUmMstr entity provides the base persistence definition of the UmMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUmMstr implements java.io.Serializable {

	// Fields

	private UmMstrId id;
	private Double umConv;
	private String umDesc;
	private Double umAltQty;
	private Integer umDecimals;
	private String umUser1;
	private String umUser2;
	private String umChr01;
	private String umChr02;
	private String umChr03;
	private String umChr04;
	private String umChr05;
	private String umChr06;
	private Double umDec01;
	private Double umDec02;
	private Date umDte01;
	private Date umDte02;
	private Boolean umLog01;
	private Boolean umLog02;
	private Double oidUmMstr;

	// Constructors

	/** default constructor */
	public AbstractUmMstr() {
	}

	/** minimal constructor */
	public AbstractUmMstr(UmMstrId id, Double oidUmMstr) {
		this.id = id;
		this.oidUmMstr = oidUmMstr;
	}

	/** full constructor */
	public AbstractUmMstr(UmMstrId id, Double umConv, String umDesc,
			Double umAltQty, Integer umDecimals, String umUser1,
			String umUser2, String umChr01, String umChr02, String umChr03,
			String umChr04, String umChr05, String umChr06, Double umDec01,
			Double umDec02, Date umDte01, Date umDte02, Boolean umLog01,
			Boolean umLog02, Double oidUmMstr) {
		this.id = id;
		this.umConv = umConv;
		this.umDesc = umDesc;
		this.umAltQty = umAltQty;
		this.umDecimals = umDecimals;
		this.umUser1 = umUser1;
		this.umUser2 = umUser2;
		this.umChr01 = umChr01;
		this.umChr02 = umChr02;
		this.umChr03 = umChr03;
		this.umChr04 = umChr04;
		this.umChr05 = umChr05;
		this.umChr06 = umChr06;
		this.umDec01 = umDec01;
		this.umDec02 = umDec02;
		this.umDte01 = umDte01;
		this.umDte02 = umDte02;
		this.umLog01 = umLog01;
		this.umLog02 = umLog02;
		this.oidUmMstr = oidUmMstr;
	}

	// Property accessors

	public UmMstrId getId() {
		return this.id;
	}

	public void setId(UmMstrId id) {
		this.id = id;
	}

	public Double getUmConv() {
		return this.umConv;
	}

	public void setUmConv(Double umConv) {
		this.umConv = umConv;
	}

	public String getUmDesc() {
		return this.umDesc;
	}

	public void setUmDesc(String umDesc) {
		this.umDesc = umDesc;
	}

	public Double getUmAltQty() {
		return this.umAltQty;
	}

	public void setUmAltQty(Double umAltQty) {
		this.umAltQty = umAltQty;
	}

	public Integer getUmDecimals() {
		return this.umDecimals;
	}

	public void setUmDecimals(Integer umDecimals) {
		this.umDecimals = umDecimals;
	}

	public String getUmUser1() {
		return this.umUser1;
	}

	public void setUmUser1(String umUser1) {
		this.umUser1 = umUser1;
	}

	public String getUmUser2() {
		return this.umUser2;
	}

	public void setUmUser2(String umUser2) {
		this.umUser2 = umUser2;
	}

	public String getUmChr01() {
		return this.umChr01;
	}

	public void setUmChr01(String umChr01) {
		this.umChr01 = umChr01;
	}

	public String getUmChr02() {
		return this.umChr02;
	}

	public void setUmChr02(String umChr02) {
		this.umChr02 = umChr02;
	}

	public String getUmChr03() {
		return this.umChr03;
	}

	public void setUmChr03(String umChr03) {
		this.umChr03 = umChr03;
	}

	public String getUmChr04() {
		return this.umChr04;
	}

	public void setUmChr04(String umChr04) {
		this.umChr04 = umChr04;
	}

	public String getUmChr05() {
		return this.umChr05;
	}

	public void setUmChr05(String umChr05) {
		this.umChr05 = umChr05;
	}

	public String getUmChr06() {
		return this.umChr06;
	}

	public void setUmChr06(String umChr06) {
		this.umChr06 = umChr06;
	}

	public Double getUmDec01() {
		return this.umDec01;
	}

	public void setUmDec01(Double umDec01) {
		this.umDec01 = umDec01;
	}

	public Double getUmDec02() {
		return this.umDec02;
	}

	public void setUmDec02(Double umDec02) {
		this.umDec02 = umDec02;
	}

	public Date getUmDte01() {
		return this.umDte01;
	}

	public void setUmDte01(Date umDte01) {
		this.umDte01 = umDte01;
	}

	public Date getUmDte02() {
		return this.umDte02;
	}

	public void setUmDte02(Date umDte02) {
		this.umDte02 = umDte02;
	}

	public Boolean getUmLog01() {
		return this.umLog01;
	}

	public void setUmLog01(Boolean umLog01) {
		this.umLog01 = umLog01;
	}

	public Boolean getUmLog02() {
		return this.umLog02;
	}

	public void setUmLog02(Boolean umLog02) {
		this.umLog02 = umLog02;
	}

	public Double getOidUmMstr() {
		return this.oidUmMstr;
	}

	public void setOidUmMstr(Double oidUmMstr) {
		this.oidUmMstr = oidUmMstr;
	}

}