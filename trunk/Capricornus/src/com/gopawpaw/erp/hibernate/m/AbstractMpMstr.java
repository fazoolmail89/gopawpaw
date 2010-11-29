package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * AbstractMpMstr entity provides the base persistence definition of the MpMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMpMstr implements java.io.Serializable {

	// Fields

	private MpMstrId id;
	private String mpDesc;
	private Date mpExpire;
	private String mpUser1;
	private String mpUser2;
	private String mpChr01;
	private String mpChr02;
	private String mpChr03;
	private String mpChr04;
	private String mpChr05;
	private Double mpDec01;
	private Double mpDec02;
	private Double oidMpMstr;

	// Constructors

	/** default constructor */
	public AbstractMpMstr() {
	}

	/** minimal constructor */
	public AbstractMpMstr(MpMstrId id, Double oidMpMstr) {
		this.id = id;
		this.oidMpMstr = oidMpMstr;
	}

	/** full constructor */
	public AbstractMpMstr(MpMstrId id, String mpDesc, Date mpExpire,
			String mpUser1, String mpUser2, String mpChr01, String mpChr02,
			String mpChr03, String mpChr04, String mpChr05, Double mpDec01,
			Double mpDec02, Double oidMpMstr) {
		this.id = id;
		this.mpDesc = mpDesc;
		this.mpExpire = mpExpire;
		this.mpUser1 = mpUser1;
		this.mpUser2 = mpUser2;
		this.mpChr01 = mpChr01;
		this.mpChr02 = mpChr02;
		this.mpChr03 = mpChr03;
		this.mpChr04 = mpChr04;
		this.mpChr05 = mpChr05;
		this.mpDec01 = mpDec01;
		this.mpDec02 = mpDec02;
		this.oidMpMstr = oidMpMstr;
	}

	// Property accessors

	public MpMstrId getId() {
		return this.id;
	}

	public void setId(MpMstrId id) {
		this.id = id;
	}

	public String getMpDesc() {
		return this.mpDesc;
	}

	public void setMpDesc(String mpDesc) {
		this.mpDesc = mpDesc;
	}

	public Date getMpExpire() {
		return this.mpExpire;
	}

	public void setMpExpire(Date mpExpire) {
		this.mpExpire = mpExpire;
	}

	public String getMpUser1() {
		return this.mpUser1;
	}

	public void setMpUser1(String mpUser1) {
		this.mpUser1 = mpUser1;
	}

	public String getMpUser2() {
		return this.mpUser2;
	}

	public void setMpUser2(String mpUser2) {
		this.mpUser2 = mpUser2;
	}

	public String getMpChr01() {
		return this.mpChr01;
	}

	public void setMpChr01(String mpChr01) {
		this.mpChr01 = mpChr01;
	}

	public String getMpChr02() {
		return this.mpChr02;
	}

	public void setMpChr02(String mpChr02) {
		this.mpChr02 = mpChr02;
	}

	public String getMpChr03() {
		return this.mpChr03;
	}

	public void setMpChr03(String mpChr03) {
		this.mpChr03 = mpChr03;
	}

	public String getMpChr04() {
		return this.mpChr04;
	}

	public void setMpChr04(String mpChr04) {
		this.mpChr04 = mpChr04;
	}

	public String getMpChr05() {
		return this.mpChr05;
	}

	public void setMpChr05(String mpChr05) {
		this.mpChr05 = mpChr05;
	}

	public Double getMpDec01() {
		return this.mpDec01;
	}

	public void setMpDec01(Double mpDec01) {
		this.mpDec01 = mpDec01;
	}

	public Double getMpDec02() {
		return this.mpDec02;
	}

	public void setMpDec02(Double mpDec02) {
		this.mpDec02 = mpDec02;
	}

	public Double getOidMpMstr() {
		return this.oidMpMstr;
	}

	public void setOidMpMstr(Double oidMpMstr) {
		this.oidMpMstr = oidMpMstr;
	}

}