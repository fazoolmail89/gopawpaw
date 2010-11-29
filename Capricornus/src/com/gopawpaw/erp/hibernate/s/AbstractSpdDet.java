package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * AbstractSpdDet entity provides the base persistence definition of the SpdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractSpdDet implements java.io.Serializable {

	// Fields

	private SpdDetId id;
	private Double spdCommPct;
	private String spdUser1;
	private String spdUser2;
	private String spdChr01;
	private String spdChr02;
	private String spdChr03;
	private String spdChr04;
	private String spdChr05;
	private Date spdDte01;
	private Date spdDte02;
	private Double spdDec01;
	private Double spdDec02;
	private String spdUserid;
	private Date spdModDate;
	private Double oidSpdDet;

	// Constructors

	/** default constructor */
	public AbstractSpdDet() {
	}

	/** minimal constructor */
	public AbstractSpdDet(SpdDetId id, Double oidSpdDet) {
		this.id = id;
		this.oidSpdDet = oidSpdDet;
	}

	/** full constructor */
	public AbstractSpdDet(SpdDetId id, Double spdCommPct, String spdUser1,
			String spdUser2, String spdChr01, String spdChr02, String spdChr03,
			String spdChr04, String spdChr05, Date spdDte01, Date spdDte02,
			Double spdDec01, Double spdDec02, String spdUserid,
			Date spdModDate, Double oidSpdDet) {
		this.id = id;
		this.spdCommPct = spdCommPct;
		this.spdUser1 = spdUser1;
		this.spdUser2 = spdUser2;
		this.spdChr01 = spdChr01;
		this.spdChr02 = spdChr02;
		this.spdChr03 = spdChr03;
		this.spdChr04 = spdChr04;
		this.spdChr05 = spdChr05;
		this.spdDte01 = spdDte01;
		this.spdDte02 = spdDte02;
		this.spdDec01 = spdDec01;
		this.spdDec02 = spdDec02;
		this.spdUserid = spdUserid;
		this.spdModDate = spdModDate;
		this.oidSpdDet = oidSpdDet;
	}

	// Property accessors

	public SpdDetId getId() {
		return this.id;
	}

	public void setId(SpdDetId id) {
		this.id = id;
	}

	public Double getSpdCommPct() {
		return this.spdCommPct;
	}

	public void setSpdCommPct(Double spdCommPct) {
		this.spdCommPct = spdCommPct;
	}

	public String getSpdUser1() {
		return this.spdUser1;
	}

	public void setSpdUser1(String spdUser1) {
		this.spdUser1 = spdUser1;
	}

	public String getSpdUser2() {
		return this.spdUser2;
	}

	public void setSpdUser2(String spdUser2) {
		this.spdUser2 = spdUser2;
	}

	public String getSpdChr01() {
		return this.spdChr01;
	}

	public void setSpdChr01(String spdChr01) {
		this.spdChr01 = spdChr01;
	}

	public String getSpdChr02() {
		return this.spdChr02;
	}

	public void setSpdChr02(String spdChr02) {
		this.spdChr02 = spdChr02;
	}

	public String getSpdChr03() {
		return this.spdChr03;
	}

	public void setSpdChr03(String spdChr03) {
		this.spdChr03 = spdChr03;
	}

	public String getSpdChr04() {
		return this.spdChr04;
	}

	public void setSpdChr04(String spdChr04) {
		this.spdChr04 = spdChr04;
	}

	public String getSpdChr05() {
		return this.spdChr05;
	}

	public void setSpdChr05(String spdChr05) {
		this.spdChr05 = spdChr05;
	}

	public Date getSpdDte01() {
		return this.spdDte01;
	}

	public void setSpdDte01(Date spdDte01) {
		this.spdDte01 = spdDte01;
	}

	public Date getSpdDte02() {
		return this.spdDte02;
	}

	public void setSpdDte02(Date spdDte02) {
		this.spdDte02 = spdDte02;
	}

	public Double getSpdDec01() {
		return this.spdDec01;
	}

	public void setSpdDec01(Double spdDec01) {
		this.spdDec01 = spdDec01;
	}

	public Double getSpdDec02() {
		return this.spdDec02;
	}

	public void setSpdDec02(Double spdDec02) {
		this.spdDec02 = spdDec02;
	}

	public String getSpdUserid() {
		return this.spdUserid;
	}

	public void setSpdUserid(String spdUserid) {
		this.spdUserid = spdUserid;
	}

	public Date getSpdModDate() {
		return this.spdModDate;
	}

	public void setSpdModDate(Date spdModDate) {
		this.spdModDate = spdModDate;
	}

	public Double getOidSpdDet() {
		return this.oidSpdDet;
	}

	public void setOidSpdDet(Double oidSpdDet) {
		this.oidSpdDet = oidSpdDet;
	}

}