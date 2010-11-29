package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFrMstr entity provides the base persistence definition of the FrMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFrMstr implements java.io.Serializable {

	// Fields

	private FrMstrId id;
	private String frDesc;
	private Boolean frType;
	private String frUm;
	private String frTrlCd;
	private String frUser1;
	private String frUser2;
	private String frChr01;
	private String frChr02;
	private String frChr03;
	private String frChr04;
	private String frChr05;
	private String frChr06;
	private String frChr07;
	private String frChr08;
	private Double frDec01;
	private Double frDec02;
	private Date frDte01;
	private Date frDte02;
	private Boolean frLog01;
	private Boolean frLog02;
	private String frMode;
	private Double oidFrMstr;

	// Constructors

	/** default constructor */
	public AbstractFrMstr() {
	}

	/** minimal constructor */
	public AbstractFrMstr(FrMstrId id, Boolean frType, String frUm,
			String frTrlCd, Double oidFrMstr) {
		this.id = id;
		this.frType = frType;
		this.frUm = frUm;
		this.frTrlCd = frTrlCd;
		this.oidFrMstr = oidFrMstr;
	}

	/** full constructor */
	public AbstractFrMstr(FrMstrId id, String frDesc, Boolean frType,
			String frUm, String frTrlCd, String frUser1, String frUser2,
			String frChr01, String frChr02, String frChr03, String frChr04,
			String frChr05, String frChr06, String frChr07, String frChr08,
			Double frDec01, Double frDec02, Date frDte01, Date frDte02,
			Boolean frLog01, Boolean frLog02, String frMode, Double oidFrMstr) {
		this.id = id;
		this.frDesc = frDesc;
		this.frType = frType;
		this.frUm = frUm;
		this.frTrlCd = frTrlCd;
		this.frUser1 = frUser1;
		this.frUser2 = frUser2;
		this.frChr01 = frChr01;
		this.frChr02 = frChr02;
		this.frChr03 = frChr03;
		this.frChr04 = frChr04;
		this.frChr05 = frChr05;
		this.frChr06 = frChr06;
		this.frChr07 = frChr07;
		this.frChr08 = frChr08;
		this.frDec01 = frDec01;
		this.frDec02 = frDec02;
		this.frDte01 = frDte01;
		this.frDte02 = frDte02;
		this.frLog01 = frLog01;
		this.frLog02 = frLog02;
		this.frMode = frMode;
		this.oidFrMstr = oidFrMstr;
	}

	// Property accessors

	public FrMstrId getId() {
		return this.id;
	}

	public void setId(FrMstrId id) {
		this.id = id;
	}

	public String getFrDesc() {
		return this.frDesc;
	}

	public void setFrDesc(String frDesc) {
		this.frDesc = frDesc;
	}

	public Boolean getFrType() {
		return this.frType;
	}

	public void setFrType(Boolean frType) {
		this.frType = frType;
	}

	public String getFrUm() {
		return this.frUm;
	}

	public void setFrUm(String frUm) {
		this.frUm = frUm;
	}

	public String getFrTrlCd() {
		return this.frTrlCd;
	}

	public void setFrTrlCd(String frTrlCd) {
		this.frTrlCd = frTrlCd;
	}

	public String getFrUser1() {
		return this.frUser1;
	}

	public void setFrUser1(String frUser1) {
		this.frUser1 = frUser1;
	}

	public String getFrUser2() {
		return this.frUser2;
	}

	public void setFrUser2(String frUser2) {
		this.frUser2 = frUser2;
	}

	public String getFrChr01() {
		return this.frChr01;
	}

	public void setFrChr01(String frChr01) {
		this.frChr01 = frChr01;
	}

	public String getFrChr02() {
		return this.frChr02;
	}

	public void setFrChr02(String frChr02) {
		this.frChr02 = frChr02;
	}

	public String getFrChr03() {
		return this.frChr03;
	}

	public void setFrChr03(String frChr03) {
		this.frChr03 = frChr03;
	}

	public String getFrChr04() {
		return this.frChr04;
	}

	public void setFrChr04(String frChr04) {
		this.frChr04 = frChr04;
	}

	public String getFrChr05() {
		return this.frChr05;
	}

	public void setFrChr05(String frChr05) {
		this.frChr05 = frChr05;
	}

	public String getFrChr06() {
		return this.frChr06;
	}

	public void setFrChr06(String frChr06) {
		this.frChr06 = frChr06;
	}

	public String getFrChr07() {
		return this.frChr07;
	}

	public void setFrChr07(String frChr07) {
		this.frChr07 = frChr07;
	}

	public String getFrChr08() {
		return this.frChr08;
	}

	public void setFrChr08(String frChr08) {
		this.frChr08 = frChr08;
	}

	public Double getFrDec01() {
		return this.frDec01;
	}

	public void setFrDec01(Double frDec01) {
		this.frDec01 = frDec01;
	}

	public Double getFrDec02() {
		return this.frDec02;
	}

	public void setFrDec02(Double frDec02) {
		this.frDec02 = frDec02;
	}

	public Date getFrDte01() {
		return this.frDte01;
	}

	public void setFrDte01(Date frDte01) {
		this.frDte01 = frDte01;
	}

	public Date getFrDte02() {
		return this.frDte02;
	}

	public void setFrDte02(Date frDte02) {
		this.frDte02 = frDte02;
	}

	public Boolean getFrLog01() {
		return this.frLog01;
	}

	public void setFrLog01(Boolean frLog01) {
		this.frLog01 = frLog01;
	}

	public Boolean getFrLog02() {
		return this.frLog02;
	}

	public void setFrLog02(Boolean frLog02) {
		this.frLog02 = frLog02;
	}

	public String getFrMode() {
		return this.frMode;
	}

	public void setFrMode(String frMode) {
		this.frMode = frMode;
	}

	public Double getOidFrMstr() {
		return this.oidFrMstr;
	}

	public void setOidFrMstr(Double oidFrMstr) {
		this.oidFrMstr = oidFrMstr;
	}

}