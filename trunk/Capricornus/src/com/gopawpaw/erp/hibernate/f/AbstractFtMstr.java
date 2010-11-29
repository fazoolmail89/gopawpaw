package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFtMstr entity provides the base persistence definition of the FtMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFtMstr implements java.io.Serializable {

	// Fields

	private FtMstrId id;
	private String ftType;
	private String ftDesc;
	private String ftUser1;
	private String ftUser2;
	private String ftChr01;
	private String ftChr02;
	private String ftChr03;
	private String ftChr04;
	private String ftChr05;
	private String ftChr06;
	private String ftChr07;
	private String ftChr08;
	private Double ftDec01;
	private Double ftDec02;
	private Date ftDte01;
	private Date ftDte02;
	private Boolean ftLog01;
	private Boolean ftLog02;
	private String ftAccrualLevel;
	private String ftLcCharge;
	private Double oidFtMstr;

	// Constructors

	/** default constructor */
	public AbstractFtMstr() {
	}

	/** minimal constructor */
	public AbstractFtMstr(FtMstrId id, String ftType, String ftAccrualLevel,
			String ftLcCharge, Double oidFtMstr) {
		this.id = id;
		this.ftType = ftType;
		this.ftAccrualLevel = ftAccrualLevel;
		this.ftLcCharge = ftLcCharge;
		this.oidFtMstr = oidFtMstr;
	}

	/** full constructor */
	public AbstractFtMstr(FtMstrId id, String ftType, String ftDesc,
			String ftUser1, String ftUser2, String ftChr01, String ftChr02,
			String ftChr03, String ftChr04, String ftChr05, String ftChr06,
			String ftChr07, String ftChr08, Double ftDec01, Double ftDec02,
			Date ftDte01, Date ftDte02, Boolean ftLog01, Boolean ftLog02,
			String ftAccrualLevel, String ftLcCharge, Double oidFtMstr) {
		this.id = id;
		this.ftType = ftType;
		this.ftDesc = ftDesc;
		this.ftUser1 = ftUser1;
		this.ftUser2 = ftUser2;
		this.ftChr01 = ftChr01;
		this.ftChr02 = ftChr02;
		this.ftChr03 = ftChr03;
		this.ftChr04 = ftChr04;
		this.ftChr05 = ftChr05;
		this.ftChr06 = ftChr06;
		this.ftChr07 = ftChr07;
		this.ftChr08 = ftChr08;
		this.ftDec01 = ftDec01;
		this.ftDec02 = ftDec02;
		this.ftDte01 = ftDte01;
		this.ftDte02 = ftDte02;
		this.ftLog01 = ftLog01;
		this.ftLog02 = ftLog02;
		this.ftAccrualLevel = ftAccrualLevel;
		this.ftLcCharge = ftLcCharge;
		this.oidFtMstr = oidFtMstr;
	}

	// Property accessors

	public FtMstrId getId() {
		return this.id;
	}

	public void setId(FtMstrId id) {
		this.id = id;
	}

	public String getFtType() {
		return this.ftType;
	}

	public void setFtType(String ftType) {
		this.ftType = ftType;
	}

	public String getFtDesc() {
		return this.ftDesc;
	}

	public void setFtDesc(String ftDesc) {
		this.ftDesc = ftDesc;
	}

	public String getFtUser1() {
		return this.ftUser1;
	}

	public void setFtUser1(String ftUser1) {
		this.ftUser1 = ftUser1;
	}

	public String getFtUser2() {
		return this.ftUser2;
	}

	public void setFtUser2(String ftUser2) {
		this.ftUser2 = ftUser2;
	}

	public String getFtChr01() {
		return this.ftChr01;
	}

	public void setFtChr01(String ftChr01) {
		this.ftChr01 = ftChr01;
	}

	public String getFtChr02() {
		return this.ftChr02;
	}

	public void setFtChr02(String ftChr02) {
		this.ftChr02 = ftChr02;
	}

	public String getFtChr03() {
		return this.ftChr03;
	}

	public void setFtChr03(String ftChr03) {
		this.ftChr03 = ftChr03;
	}

	public String getFtChr04() {
		return this.ftChr04;
	}

	public void setFtChr04(String ftChr04) {
		this.ftChr04 = ftChr04;
	}

	public String getFtChr05() {
		return this.ftChr05;
	}

	public void setFtChr05(String ftChr05) {
		this.ftChr05 = ftChr05;
	}

	public String getFtChr06() {
		return this.ftChr06;
	}

	public void setFtChr06(String ftChr06) {
		this.ftChr06 = ftChr06;
	}

	public String getFtChr07() {
		return this.ftChr07;
	}

	public void setFtChr07(String ftChr07) {
		this.ftChr07 = ftChr07;
	}

	public String getFtChr08() {
		return this.ftChr08;
	}

	public void setFtChr08(String ftChr08) {
		this.ftChr08 = ftChr08;
	}

	public Double getFtDec01() {
		return this.ftDec01;
	}

	public void setFtDec01(Double ftDec01) {
		this.ftDec01 = ftDec01;
	}

	public Double getFtDec02() {
		return this.ftDec02;
	}

	public void setFtDec02(Double ftDec02) {
		this.ftDec02 = ftDec02;
	}

	public Date getFtDte01() {
		return this.ftDte01;
	}

	public void setFtDte01(Date ftDte01) {
		this.ftDte01 = ftDte01;
	}

	public Date getFtDte02() {
		return this.ftDte02;
	}

	public void setFtDte02(Date ftDte02) {
		this.ftDte02 = ftDte02;
	}

	public Boolean getFtLog01() {
		return this.ftLog01;
	}

	public void setFtLog01(Boolean ftLog01) {
		this.ftLog01 = ftLog01;
	}

	public Boolean getFtLog02() {
		return this.ftLog02;
	}

	public void setFtLog02(Boolean ftLog02) {
		this.ftLog02 = ftLog02;
	}

	public String getFtAccrualLevel() {
		return this.ftAccrualLevel;
	}

	public void setFtAccrualLevel(String ftAccrualLevel) {
		this.ftAccrualLevel = ftAccrualLevel;
	}

	public String getFtLcCharge() {
		return this.ftLcCharge;
	}

	public void setFtLcCharge(String ftLcCharge) {
		this.ftLcCharge = ftLcCharge;
	}

	public Double getOidFtMstr() {
		return this.oidFtMstr;
	}

	public void setOidFtMstr(Double oidFtMstr) {
		this.oidFtMstr = oidFtMstr;
	}

}