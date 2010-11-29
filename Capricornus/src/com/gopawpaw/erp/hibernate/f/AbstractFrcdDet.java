package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFrcdDet entity provides the base persistence definition of the
 * FrcdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrcdDet implements java.io.Serializable {

	// Fields

	private FrcdDetId id;
	private Date frcdEnd;
	private String frcdUser1;
	private Double frcdMinWtc;
	private Double frcdTotWtc;
	private Double frcdXtrWtc;
	private String frcdUser2;
	private String frcdChr01;
	private String frcdChr02;
	private String frcdChr03;
	private String frcdChr04;
	private String frcdChr05;
	private String frcdChr06;
	private String frcdChr07;
	private String frcdChr08;
	private Double frcdDec01;
	private Double frcdDec02;
	private Date frcdDte01;
	private Double frcdMinWt;
	private Date frcdDte02;
	private Boolean frcdLog01;
	private Boolean frcdLog02;
	private Double oidFrcdDet;

	// Constructors

	/** default constructor */
	public AbstractFrcdDet() {
	}

	/** minimal constructor */
	public AbstractFrcdDet(FrcdDetId id, Double oidFrcdDet) {
		this.id = id;
		this.oidFrcdDet = oidFrcdDet;
	}

	/** full constructor */
	public AbstractFrcdDet(FrcdDetId id, Date frcdEnd, String frcdUser1,
			Double frcdMinWtc, Double frcdTotWtc, Double frcdXtrWtc,
			String frcdUser2, String frcdChr01, String frcdChr02,
			String frcdChr03, String frcdChr04, String frcdChr05,
			String frcdChr06, String frcdChr07, String frcdChr08,
			Double frcdDec01, Double frcdDec02, Date frcdDte01,
			Double frcdMinWt, Date frcdDte02, Boolean frcdLog01,
			Boolean frcdLog02, Double oidFrcdDet) {
		this.id = id;
		this.frcdEnd = frcdEnd;
		this.frcdUser1 = frcdUser1;
		this.frcdMinWtc = frcdMinWtc;
		this.frcdTotWtc = frcdTotWtc;
		this.frcdXtrWtc = frcdXtrWtc;
		this.frcdUser2 = frcdUser2;
		this.frcdChr01 = frcdChr01;
		this.frcdChr02 = frcdChr02;
		this.frcdChr03 = frcdChr03;
		this.frcdChr04 = frcdChr04;
		this.frcdChr05 = frcdChr05;
		this.frcdChr06 = frcdChr06;
		this.frcdChr07 = frcdChr07;
		this.frcdChr08 = frcdChr08;
		this.frcdDec01 = frcdDec01;
		this.frcdDec02 = frcdDec02;
		this.frcdDte01 = frcdDte01;
		this.frcdMinWt = frcdMinWt;
		this.frcdDte02 = frcdDte02;
		this.frcdLog01 = frcdLog01;
		this.frcdLog02 = frcdLog02;
		this.oidFrcdDet = oidFrcdDet;
	}

	// Property accessors

	public FrcdDetId getId() {
		return this.id;
	}

	public void setId(FrcdDetId id) {
		this.id = id;
	}

	public Date getFrcdEnd() {
		return this.frcdEnd;
	}

	public void setFrcdEnd(Date frcdEnd) {
		this.frcdEnd = frcdEnd;
	}

	public String getFrcdUser1() {
		return this.frcdUser1;
	}

	public void setFrcdUser1(String frcdUser1) {
		this.frcdUser1 = frcdUser1;
	}

	public Double getFrcdMinWtc() {
		return this.frcdMinWtc;
	}

	public void setFrcdMinWtc(Double frcdMinWtc) {
		this.frcdMinWtc = frcdMinWtc;
	}

	public Double getFrcdTotWtc() {
		return this.frcdTotWtc;
	}

	public void setFrcdTotWtc(Double frcdTotWtc) {
		this.frcdTotWtc = frcdTotWtc;
	}

	public Double getFrcdXtrWtc() {
		return this.frcdXtrWtc;
	}

	public void setFrcdXtrWtc(Double frcdXtrWtc) {
		this.frcdXtrWtc = frcdXtrWtc;
	}

	public String getFrcdUser2() {
		return this.frcdUser2;
	}

	public void setFrcdUser2(String frcdUser2) {
		this.frcdUser2 = frcdUser2;
	}

	public String getFrcdChr01() {
		return this.frcdChr01;
	}

	public void setFrcdChr01(String frcdChr01) {
		this.frcdChr01 = frcdChr01;
	}

	public String getFrcdChr02() {
		return this.frcdChr02;
	}

	public void setFrcdChr02(String frcdChr02) {
		this.frcdChr02 = frcdChr02;
	}

	public String getFrcdChr03() {
		return this.frcdChr03;
	}

	public void setFrcdChr03(String frcdChr03) {
		this.frcdChr03 = frcdChr03;
	}

	public String getFrcdChr04() {
		return this.frcdChr04;
	}

	public void setFrcdChr04(String frcdChr04) {
		this.frcdChr04 = frcdChr04;
	}

	public String getFrcdChr05() {
		return this.frcdChr05;
	}

	public void setFrcdChr05(String frcdChr05) {
		this.frcdChr05 = frcdChr05;
	}

	public String getFrcdChr06() {
		return this.frcdChr06;
	}

	public void setFrcdChr06(String frcdChr06) {
		this.frcdChr06 = frcdChr06;
	}

	public String getFrcdChr07() {
		return this.frcdChr07;
	}

	public void setFrcdChr07(String frcdChr07) {
		this.frcdChr07 = frcdChr07;
	}

	public String getFrcdChr08() {
		return this.frcdChr08;
	}

	public void setFrcdChr08(String frcdChr08) {
		this.frcdChr08 = frcdChr08;
	}

	public Double getFrcdDec01() {
		return this.frcdDec01;
	}

	public void setFrcdDec01(Double frcdDec01) {
		this.frcdDec01 = frcdDec01;
	}

	public Double getFrcdDec02() {
		return this.frcdDec02;
	}

	public void setFrcdDec02(Double frcdDec02) {
		this.frcdDec02 = frcdDec02;
	}

	public Date getFrcdDte01() {
		return this.frcdDte01;
	}

	public void setFrcdDte01(Date frcdDte01) {
		this.frcdDte01 = frcdDte01;
	}

	public Double getFrcdMinWt() {
		return this.frcdMinWt;
	}

	public void setFrcdMinWt(Double frcdMinWt) {
		this.frcdMinWt = frcdMinWt;
	}

	public Date getFrcdDte02() {
		return this.frcdDte02;
	}

	public void setFrcdDte02(Date frcdDte02) {
		this.frcdDte02 = frcdDte02;
	}

	public Boolean getFrcdLog01() {
		return this.frcdLog01;
	}

	public void setFrcdLog01(Boolean frcdLog01) {
		this.frcdLog01 = frcdLog01;
	}

	public Boolean getFrcdLog02() {
		return this.frcdLog02;
	}

	public void setFrcdLog02(Boolean frcdLog02) {
		this.frcdLog02 = frcdLog02;
	}

	public Double getOidFrcdDet() {
		return this.oidFrcdDet;
	}

	public void setOidFrcdDet(Double oidFrcdDet) {
		this.oidFrcdDet = oidFrcdDet;
	}

}