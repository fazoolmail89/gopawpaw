package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFrzdDet entity provides the base persistence definition of the
 * FrzdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrzdDet implements java.io.Serializable {

	// Fields

	private FrzdDetId id;
	private String frzdPostEn;
	private Date frzdEnd;
	private String frzdUser1;
	private String frzdUser2;
	private String frzdChr01;
	private String frzdChr02;
	private String frzdChr03;
	private String frzdChr04;
	private String frzdChr05;
	private String frzdChr06;
	private String frzdChr07;
	private String frzdChr08;
	private Double frzdDec01;
	private Double frzdDec02;
	private Date frzdDte01;
	private Date frzdDte02;
	private Boolean frzdLog01;
	private Boolean frzdLog02;
	private Double oidFrzdDet;

	// Constructors

	/** default constructor */
	public AbstractFrzdDet() {
	}

	/** minimal constructor */
	public AbstractFrzdDet(FrzdDetId id, Double oidFrzdDet) {
		this.id = id;
		this.oidFrzdDet = oidFrzdDet;
	}

	/** full constructor */
	public AbstractFrzdDet(FrzdDetId id, String frzdPostEn, Date frzdEnd,
			String frzdUser1, String frzdUser2, String frzdChr01,
			String frzdChr02, String frzdChr03, String frzdChr04,
			String frzdChr05, String frzdChr06, String frzdChr07,
			String frzdChr08, Double frzdDec01, Double frzdDec02,
			Date frzdDte01, Date frzdDte02, Boolean frzdLog01,
			Boolean frzdLog02, Double oidFrzdDet) {
		this.id = id;
		this.frzdPostEn = frzdPostEn;
		this.frzdEnd = frzdEnd;
		this.frzdUser1 = frzdUser1;
		this.frzdUser2 = frzdUser2;
		this.frzdChr01 = frzdChr01;
		this.frzdChr02 = frzdChr02;
		this.frzdChr03 = frzdChr03;
		this.frzdChr04 = frzdChr04;
		this.frzdChr05 = frzdChr05;
		this.frzdChr06 = frzdChr06;
		this.frzdChr07 = frzdChr07;
		this.frzdChr08 = frzdChr08;
		this.frzdDec01 = frzdDec01;
		this.frzdDec02 = frzdDec02;
		this.frzdDte01 = frzdDte01;
		this.frzdDte02 = frzdDte02;
		this.frzdLog01 = frzdLog01;
		this.frzdLog02 = frzdLog02;
		this.oidFrzdDet = oidFrzdDet;
	}

	// Property accessors

	public FrzdDetId getId() {
		return this.id;
	}

	public void setId(FrzdDetId id) {
		this.id = id;
	}

	public String getFrzdPostEn() {
		return this.frzdPostEn;
	}

	public void setFrzdPostEn(String frzdPostEn) {
		this.frzdPostEn = frzdPostEn;
	}

	public Date getFrzdEnd() {
		return this.frzdEnd;
	}

	public void setFrzdEnd(Date frzdEnd) {
		this.frzdEnd = frzdEnd;
	}

	public String getFrzdUser1() {
		return this.frzdUser1;
	}

	public void setFrzdUser1(String frzdUser1) {
		this.frzdUser1 = frzdUser1;
	}

	public String getFrzdUser2() {
		return this.frzdUser2;
	}

	public void setFrzdUser2(String frzdUser2) {
		this.frzdUser2 = frzdUser2;
	}

	public String getFrzdChr01() {
		return this.frzdChr01;
	}

	public void setFrzdChr01(String frzdChr01) {
		this.frzdChr01 = frzdChr01;
	}

	public String getFrzdChr02() {
		return this.frzdChr02;
	}

	public void setFrzdChr02(String frzdChr02) {
		this.frzdChr02 = frzdChr02;
	}

	public String getFrzdChr03() {
		return this.frzdChr03;
	}

	public void setFrzdChr03(String frzdChr03) {
		this.frzdChr03 = frzdChr03;
	}

	public String getFrzdChr04() {
		return this.frzdChr04;
	}

	public void setFrzdChr04(String frzdChr04) {
		this.frzdChr04 = frzdChr04;
	}

	public String getFrzdChr05() {
		return this.frzdChr05;
	}

	public void setFrzdChr05(String frzdChr05) {
		this.frzdChr05 = frzdChr05;
	}

	public String getFrzdChr06() {
		return this.frzdChr06;
	}

	public void setFrzdChr06(String frzdChr06) {
		this.frzdChr06 = frzdChr06;
	}

	public String getFrzdChr07() {
		return this.frzdChr07;
	}

	public void setFrzdChr07(String frzdChr07) {
		this.frzdChr07 = frzdChr07;
	}

	public String getFrzdChr08() {
		return this.frzdChr08;
	}

	public void setFrzdChr08(String frzdChr08) {
		this.frzdChr08 = frzdChr08;
	}

	public Double getFrzdDec01() {
		return this.frzdDec01;
	}

	public void setFrzdDec01(Double frzdDec01) {
		this.frzdDec01 = frzdDec01;
	}

	public Double getFrzdDec02() {
		return this.frzdDec02;
	}

	public void setFrzdDec02(Double frzdDec02) {
		this.frzdDec02 = frzdDec02;
	}

	public Date getFrzdDte01() {
		return this.frzdDte01;
	}

	public void setFrzdDte01(Date frzdDte01) {
		this.frzdDte01 = frzdDte01;
	}

	public Date getFrzdDte02() {
		return this.frzdDte02;
	}

	public void setFrzdDte02(Date frzdDte02) {
		this.frzdDte02 = frzdDte02;
	}

	public Boolean getFrzdLog01() {
		return this.frzdLog01;
	}

	public void setFrzdLog01(Boolean frzdLog01) {
		this.frzdLog01 = frzdLog01;
	}

	public Boolean getFrzdLog02() {
		return this.frzdLog02;
	}

	public void setFrzdLog02(Boolean frzdLog02) {
		this.frzdLog02 = frzdLog02;
	}

	public Double getOidFrzdDet() {
		return this.oidFrzdDet;
	}

	public void setOidFrzdDet(Double oidFrzdDet) {
		this.oidFrzdDet = oidFrzdDet;
	}

}