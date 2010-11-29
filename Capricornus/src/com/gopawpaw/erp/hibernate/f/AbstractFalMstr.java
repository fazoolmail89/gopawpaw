package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFalMstr entity provides the base persistence definition of the
 * FalMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFalMstr implements java.io.Serializable {

	// Fields

	private String falFaLoc;
	private String falLoc;
	private String falDesc;
	private String falBldg;
	private String falDept;
	private String falCc;
	private String falAcCc;
	private String falExpCc;
	private String falSub;
	private String falAcSub;
	private String falExpSub;
	private String falUserid;
	private Date falModDate;
	private Boolean falQad01;
	private String falQad02;
	private String falQad03;
	private String falUser1;
	private String falUser2;
	private Double oidFalMstr;

	// Constructors

	/** default constructor */
	public AbstractFalMstr() {
	}

	/** minimal constructor */
	public AbstractFalMstr(Double oidFalMstr) {
		this.oidFalMstr = oidFalMstr;
	}

	/** full constructor */
	public AbstractFalMstr(String falLoc, String falDesc, String falBldg,
			String falDept, String falCc, String falAcCc, String falExpCc,
			String falSub, String falAcSub, String falExpSub, String falUserid,
			Date falModDate, Boolean falQad01, String falQad02,
			String falQad03, String falUser1, String falUser2, Double oidFalMstr) {
		this.falLoc = falLoc;
		this.falDesc = falDesc;
		this.falBldg = falBldg;
		this.falDept = falDept;
		this.falCc = falCc;
		this.falAcCc = falAcCc;
		this.falExpCc = falExpCc;
		this.falSub = falSub;
		this.falAcSub = falAcSub;
		this.falExpSub = falExpSub;
		this.falUserid = falUserid;
		this.falModDate = falModDate;
		this.falQad01 = falQad01;
		this.falQad02 = falQad02;
		this.falQad03 = falQad03;
		this.falUser1 = falUser1;
		this.falUser2 = falUser2;
		this.oidFalMstr = oidFalMstr;
	}

	// Property accessors

	public String getFalFaLoc() {
		return this.falFaLoc;
	}

	public void setFalFaLoc(String falFaLoc) {
		this.falFaLoc = falFaLoc;
	}

	public String getFalLoc() {
		return this.falLoc;
	}

	public void setFalLoc(String falLoc) {
		this.falLoc = falLoc;
	}

	public String getFalDesc() {
		return this.falDesc;
	}

	public void setFalDesc(String falDesc) {
		this.falDesc = falDesc;
	}

	public String getFalBldg() {
		return this.falBldg;
	}

	public void setFalBldg(String falBldg) {
		this.falBldg = falBldg;
	}

	public String getFalDept() {
		return this.falDept;
	}

	public void setFalDept(String falDept) {
		this.falDept = falDept;
	}

	public String getFalCc() {
		return this.falCc;
	}

	public void setFalCc(String falCc) {
		this.falCc = falCc;
	}

	public String getFalAcCc() {
		return this.falAcCc;
	}

	public void setFalAcCc(String falAcCc) {
		this.falAcCc = falAcCc;
	}

	public String getFalExpCc() {
		return this.falExpCc;
	}

	public void setFalExpCc(String falExpCc) {
		this.falExpCc = falExpCc;
	}

	public String getFalSub() {
		return this.falSub;
	}

	public void setFalSub(String falSub) {
		this.falSub = falSub;
	}

	public String getFalAcSub() {
		return this.falAcSub;
	}

	public void setFalAcSub(String falAcSub) {
		this.falAcSub = falAcSub;
	}

	public String getFalExpSub() {
		return this.falExpSub;
	}

	public void setFalExpSub(String falExpSub) {
		this.falExpSub = falExpSub;
	}

	public String getFalUserid() {
		return this.falUserid;
	}

	public void setFalUserid(String falUserid) {
		this.falUserid = falUserid;
	}

	public Date getFalModDate() {
		return this.falModDate;
	}

	public void setFalModDate(Date falModDate) {
		this.falModDate = falModDate;
	}

	public Boolean getFalQad01() {
		return this.falQad01;
	}

	public void setFalQad01(Boolean falQad01) {
		this.falQad01 = falQad01;
	}

	public String getFalQad02() {
		return this.falQad02;
	}

	public void setFalQad02(String falQad02) {
		this.falQad02 = falQad02;
	}

	public String getFalQad03() {
		return this.falQad03;
	}

	public void setFalQad03(String falQad03) {
		this.falQad03 = falQad03;
	}

	public String getFalUser1() {
		return this.falUser1;
	}

	public void setFalUser1(String falUser1) {
		this.falUser1 = falUser1;
	}

	public String getFalUser2() {
		return this.falUser2;
	}

	public void setFalUser2(String falUser2) {
		this.falUser2 = falUser2;
	}

	public Double getOidFalMstr() {
		return this.oidFalMstr;
	}

	public void setOidFalMstr(Double oidFalMstr) {
		this.oidFalMstr = oidFalMstr;
	}

}