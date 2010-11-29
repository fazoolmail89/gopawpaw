package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRegMstr entity provides the base persistence definition of the
 * RegMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRegMstr implements java.io.Serializable {

	// Fields

	private RegMstrId id;
	private String regType;
	private String regDesc;
	private String regChr01;
	private String regChr02;
	private String regChr03;
	private Double regDec01;
	private Double regDec02;
	private Date regDte01;
	private Date regDte02;
	private Boolean regLog01;
	private Boolean regLog02;
	private String regUser1;
	private String regUser2;
	private Boolean reg3rdParty;
	private String regLoc;
	private Boolean regRepair;
	private String regSite;
	private Integer regTimeZone;
	private String regLang;
	private String regProdLine;
	private String regSiteRtn;
	private String regLocRtn;
	private String regWkctr;
	private String regProject;
	private String regQadc05;
	private String regQadc04;
	private Date regModDate;
	private String regModUserid;
	private String regQadc01;
	private String regQadc02;
	private String regQadc03;
	private Boolean regQadl01;
	private Boolean regQadl02;
	private Date regQadt01;
	private Double regQade01;
	private Double oidRegMstr;

	// Constructors

	/** default constructor */
	public AbstractRegMstr() {
	}

	/** minimal constructor */
	public AbstractRegMstr(RegMstrId id, Boolean reg3rdParty,
			Boolean regRepair, String regSite, Integer regTimeZone,
			Double oidRegMstr) {
		this.id = id;
		this.reg3rdParty = reg3rdParty;
		this.regRepair = regRepair;
		this.regSite = regSite;
		this.regTimeZone = regTimeZone;
		this.oidRegMstr = oidRegMstr;
	}

	/** full constructor */
	public AbstractRegMstr(RegMstrId id, String regType, String regDesc,
			String regChr01, String regChr02, String regChr03, Double regDec01,
			Double regDec02, Date regDte01, Date regDte02, Boolean regLog01,
			Boolean regLog02, String regUser1, String regUser2,
			Boolean reg3rdParty, String regLoc, Boolean regRepair,
			String regSite, Integer regTimeZone, String regLang,
			String regProdLine, String regSiteRtn, String regLocRtn,
			String regWkctr, String regProject, String regQadc05,
			String regQadc04, Date regModDate, String regModUserid,
			String regQadc01, String regQadc02, String regQadc03,
			Boolean regQadl01, Boolean regQadl02, Date regQadt01,
			Double regQade01, Double oidRegMstr) {
		this.id = id;
		this.regType = regType;
		this.regDesc = regDesc;
		this.regChr01 = regChr01;
		this.regChr02 = regChr02;
		this.regChr03 = regChr03;
		this.regDec01 = regDec01;
		this.regDec02 = regDec02;
		this.regDte01 = regDte01;
		this.regDte02 = regDte02;
		this.regLog01 = regLog01;
		this.regLog02 = regLog02;
		this.regUser1 = regUser1;
		this.regUser2 = regUser2;
		this.reg3rdParty = reg3rdParty;
		this.regLoc = regLoc;
		this.regRepair = regRepair;
		this.regSite = regSite;
		this.regTimeZone = regTimeZone;
		this.regLang = regLang;
		this.regProdLine = regProdLine;
		this.regSiteRtn = regSiteRtn;
		this.regLocRtn = regLocRtn;
		this.regWkctr = regWkctr;
		this.regProject = regProject;
		this.regQadc05 = regQadc05;
		this.regQadc04 = regQadc04;
		this.regModDate = regModDate;
		this.regModUserid = regModUserid;
		this.regQadc01 = regQadc01;
		this.regQadc02 = regQadc02;
		this.regQadc03 = regQadc03;
		this.regQadl01 = regQadl01;
		this.regQadl02 = regQadl02;
		this.regQadt01 = regQadt01;
		this.regQade01 = regQade01;
		this.oidRegMstr = oidRegMstr;
	}

	// Property accessors

	public RegMstrId getId() {
		return this.id;
	}

	public void setId(RegMstrId id) {
		this.id = id;
	}

	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getRegDesc() {
		return this.regDesc;
	}

	public void setRegDesc(String regDesc) {
		this.regDesc = regDesc;
	}

	public String getRegChr01() {
		return this.regChr01;
	}

	public void setRegChr01(String regChr01) {
		this.regChr01 = regChr01;
	}

	public String getRegChr02() {
		return this.regChr02;
	}

	public void setRegChr02(String regChr02) {
		this.regChr02 = regChr02;
	}

	public String getRegChr03() {
		return this.regChr03;
	}

	public void setRegChr03(String regChr03) {
		this.regChr03 = regChr03;
	}

	public Double getRegDec01() {
		return this.regDec01;
	}

	public void setRegDec01(Double regDec01) {
		this.regDec01 = regDec01;
	}

	public Double getRegDec02() {
		return this.regDec02;
	}

	public void setRegDec02(Double regDec02) {
		this.regDec02 = regDec02;
	}

	public Date getRegDte01() {
		return this.regDte01;
	}

	public void setRegDte01(Date regDte01) {
		this.regDte01 = regDte01;
	}

	public Date getRegDte02() {
		return this.regDte02;
	}

	public void setRegDte02(Date regDte02) {
		this.regDte02 = regDte02;
	}

	public Boolean getRegLog01() {
		return this.regLog01;
	}

	public void setRegLog01(Boolean regLog01) {
		this.regLog01 = regLog01;
	}

	public Boolean getRegLog02() {
		return this.regLog02;
	}

	public void setRegLog02(Boolean regLog02) {
		this.regLog02 = regLog02;
	}

	public String getRegUser1() {
		return this.regUser1;
	}

	public void setRegUser1(String regUser1) {
		this.regUser1 = regUser1;
	}

	public String getRegUser2() {
		return this.regUser2;
	}

	public void setRegUser2(String regUser2) {
		this.regUser2 = regUser2;
	}

	public Boolean getReg3rdParty() {
		return this.reg3rdParty;
	}

	public void setReg3rdParty(Boolean reg3rdParty) {
		this.reg3rdParty = reg3rdParty;
	}

	public String getRegLoc() {
		return this.regLoc;
	}

	public void setRegLoc(String regLoc) {
		this.regLoc = regLoc;
	}

	public Boolean getRegRepair() {
		return this.regRepair;
	}

	public void setRegRepair(Boolean regRepair) {
		this.regRepair = regRepair;
	}

	public String getRegSite() {
		return this.regSite;
	}

	public void setRegSite(String regSite) {
		this.regSite = regSite;
	}

	public Integer getRegTimeZone() {
		return this.regTimeZone;
	}

	public void setRegTimeZone(Integer regTimeZone) {
		this.regTimeZone = regTimeZone;
	}

	public String getRegLang() {
		return this.regLang;
	}

	public void setRegLang(String regLang) {
		this.regLang = regLang;
	}

	public String getRegProdLine() {
		return this.regProdLine;
	}

	public void setRegProdLine(String regProdLine) {
		this.regProdLine = regProdLine;
	}

	public String getRegSiteRtn() {
		return this.regSiteRtn;
	}

	public void setRegSiteRtn(String regSiteRtn) {
		this.regSiteRtn = regSiteRtn;
	}

	public String getRegLocRtn() {
		return this.regLocRtn;
	}

	public void setRegLocRtn(String regLocRtn) {
		this.regLocRtn = regLocRtn;
	}

	public String getRegWkctr() {
		return this.regWkctr;
	}

	public void setRegWkctr(String regWkctr) {
		this.regWkctr = regWkctr;
	}

	public String getRegProject() {
		return this.regProject;
	}

	public void setRegProject(String regProject) {
		this.regProject = regProject;
	}

	public String getRegQadc05() {
		return this.regQadc05;
	}

	public void setRegQadc05(String regQadc05) {
		this.regQadc05 = regQadc05;
	}

	public String getRegQadc04() {
		return this.regQadc04;
	}

	public void setRegQadc04(String regQadc04) {
		this.regQadc04 = regQadc04;
	}

	public Date getRegModDate() {
		return this.regModDate;
	}

	public void setRegModDate(Date regModDate) {
		this.regModDate = regModDate;
	}

	public String getRegModUserid() {
		return this.regModUserid;
	}

	public void setRegModUserid(String regModUserid) {
		this.regModUserid = regModUserid;
	}

	public String getRegQadc01() {
		return this.regQadc01;
	}

	public void setRegQadc01(String regQadc01) {
		this.regQadc01 = regQadc01;
	}

	public String getRegQadc02() {
		return this.regQadc02;
	}

	public void setRegQadc02(String regQadc02) {
		this.regQadc02 = regQadc02;
	}

	public String getRegQadc03() {
		return this.regQadc03;
	}

	public void setRegQadc03(String regQadc03) {
		this.regQadc03 = regQadc03;
	}

	public Boolean getRegQadl01() {
		return this.regQadl01;
	}

	public void setRegQadl01(Boolean regQadl01) {
		this.regQadl01 = regQadl01;
	}

	public Boolean getRegQadl02() {
		return this.regQadl02;
	}

	public void setRegQadl02(Boolean regQadl02) {
		this.regQadl02 = regQadl02;
	}

	public Date getRegQadt01() {
		return this.regQadt01;
	}

	public void setRegQadt01(Date regQadt01) {
		this.regQadt01 = regQadt01;
	}

	public Double getRegQade01() {
		return this.regQade01;
	}

	public void setRegQade01(Double regQade01) {
		this.regQade01 = regQade01;
	}

	public Double getOidRegMstr() {
		return this.oidRegMstr;
	}

	public void setOidRegMstr(Double oidRegMstr) {
		this.oidRegMstr = oidRegMstr;
	}

}