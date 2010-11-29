package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSdMstr entity provides the base persistence definition of the SdMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSdMstr implements java.io.Serializable {

	// Fields

	private SdMstrId id;
	private String sdCurr;
	private Double sdDiscPct;
	private String sdAcct;
	private String sdCc;
	private String sdCust;
	private String sdLsType;
	private String sdProdline;
	private Date sdExpire;
	private String sdChr01;
	private String sdQad01;
	private String sdQad02;
	private String sdChr02;
	private String sdUser1;
	private String sdUser2;
	private String sdSub;
	private Double oidSdMstr;

	// Constructors

	/** default constructor */
	public AbstractSdMstr() {
	}

	/** minimal constructor */
	public AbstractSdMstr(SdMstrId id, Double oidSdMstr) {
		this.id = id;
		this.oidSdMstr = oidSdMstr;
	}

	/** full constructor */
	public AbstractSdMstr(SdMstrId id, String sdCurr, Double sdDiscPct,
			String sdAcct, String sdCc, String sdCust, String sdLsType,
			String sdProdline, Date sdExpire, String sdChr01, String sdQad01,
			String sdQad02, String sdChr02, String sdUser1, String sdUser2,
			String sdSub, Double oidSdMstr) {
		this.id = id;
		this.sdCurr = sdCurr;
		this.sdDiscPct = sdDiscPct;
		this.sdAcct = sdAcct;
		this.sdCc = sdCc;
		this.sdCust = sdCust;
		this.sdLsType = sdLsType;
		this.sdProdline = sdProdline;
		this.sdExpire = sdExpire;
		this.sdChr01 = sdChr01;
		this.sdQad01 = sdQad01;
		this.sdQad02 = sdQad02;
		this.sdChr02 = sdChr02;
		this.sdUser1 = sdUser1;
		this.sdUser2 = sdUser2;
		this.sdSub = sdSub;
		this.oidSdMstr = oidSdMstr;
	}

	// Property accessors

	public SdMstrId getId() {
		return this.id;
	}

	public void setId(SdMstrId id) {
		this.id = id;
	}

	public String getSdCurr() {
		return this.sdCurr;
	}

	public void setSdCurr(String sdCurr) {
		this.sdCurr = sdCurr;
	}

	public Double getSdDiscPct() {
		return this.sdDiscPct;
	}

	public void setSdDiscPct(Double sdDiscPct) {
		this.sdDiscPct = sdDiscPct;
	}

	public String getSdAcct() {
		return this.sdAcct;
	}

	public void setSdAcct(String sdAcct) {
		this.sdAcct = sdAcct;
	}

	public String getSdCc() {
		return this.sdCc;
	}

	public void setSdCc(String sdCc) {
		this.sdCc = sdCc;
	}

	public String getSdCust() {
		return this.sdCust;
	}

	public void setSdCust(String sdCust) {
		this.sdCust = sdCust;
	}

	public String getSdLsType() {
		return this.sdLsType;
	}

	public void setSdLsType(String sdLsType) {
		this.sdLsType = sdLsType;
	}

	public String getSdProdline() {
		return this.sdProdline;
	}

	public void setSdProdline(String sdProdline) {
		this.sdProdline = sdProdline;
	}

	public Date getSdExpire() {
		return this.sdExpire;
	}

	public void setSdExpire(Date sdExpire) {
		this.sdExpire = sdExpire;
	}

	public String getSdChr01() {
		return this.sdChr01;
	}

	public void setSdChr01(String sdChr01) {
		this.sdChr01 = sdChr01;
	}

	public String getSdQad01() {
		return this.sdQad01;
	}

	public void setSdQad01(String sdQad01) {
		this.sdQad01 = sdQad01;
	}

	public String getSdQad02() {
		return this.sdQad02;
	}

	public void setSdQad02(String sdQad02) {
		this.sdQad02 = sdQad02;
	}

	public String getSdChr02() {
		return this.sdChr02;
	}

	public void setSdChr02(String sdChr02) {
		this.sdChr02 = sdChr02;
	}

	public String getSdUser1() {
		return this.sdUser1;
	}

	public void setSdUser1(String sdUser1) {
		this.sdUser1 = sdUser1;
	}

	public String getSdUser2() {
		return this.sdUser2;
	}

	public void setSdUser2(String sdUser2) {
		this.sdUser2 = sdUser2;
	}

	public String getSdSub() {
		return this.sdSub;
	}

	public void setSdSub(String sdSub) {
		this.sdSub = sdSub;
	}

	public Double getOidSdMstr() {
		return this.oidSdMstr;
	}

	public void setOidSdMstr(Double oidSdMstr) {
		this.oidSdMstr = oidSdMstr;
	}

}