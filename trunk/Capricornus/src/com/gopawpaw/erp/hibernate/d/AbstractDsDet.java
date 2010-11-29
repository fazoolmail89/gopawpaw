package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDsDet entity provides the base persistence definition of the DsDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDsDet implements java.io.Serializable {

	// Fields

	private DsDetId id;
	private String dsNbr;
	private String dsGitSite;
	private Date dsShipdate;
	private Date dsDueDate;
	private Date dsPerDate;
	private String dsPart;
	private Double dsQtyOrd;
	private Double dsQtyConf;
	private Double dsQtyShip;
	private String dsStatus;
	private String dsRmks;
	private String dsRev;
	private String dsGitAcct;
	private String dsGitCc;
	private String dsProject;
	private Integer dsCmtindx;
	private Double dsResidual;
	private String dsSoNbr;
	private String dsLoc;
	private String dsTransId;
	private String dsUser1;
	private String dsUser2;
	private String dsChr01;
	private String dsChr02;
	private String dsChr03;
	private String dsChr04;
	private String dsChr05;
	private Date dsDte01;
	private Date dsDte02;
	private Double dsDec01;
	private Double dsDec02;
	private Boolean dsLog01;
	private Double dsQtyAll;
	private Double dsQtyPick;
	private Double dsQtyChg;
	private Integer dsSodLine;
	private String dsGitSub;
	private String dsOrderCategory;
	private Double dsFrRate;
	private Double dsFrWt;
	private String dsFrWtUm;
	private String dsFrClass;
	private Double dsFrChg;
	private String dsFrList;
	private Integer dsLine;
	private Double oidDsDet;

	// Constructors

	/** default constructor */
	public AbstractDsDet() {
	}

	/** minimal constructor */
	public AbstractDsDet(DsDetId id, String dsOrderCategory, Double dsFrRate,
			Double dsFrWt, String dsFrWtUm, String dsFrClass, Double dsFrChg,
			String dsFrList, Integer dsLine, Double oidDsDet) {
		this.id = id;
		this.dsOrderCategory = dsOrderCategory;
		this.dsFrRate = dsFrRate;
		this.dsFrWt = dsFrWt;
		this.dsFrWtUm = dsFrWtUm;
		this.dsFrClass = dsFrClass;
		this.dsFrChg = dsFrChg;
		this.dsFrList = dsFrList;
		this.dsLine = dsLine;
		this.oidDsDet = oidDsDet;
	}

	/** full constructor */
	public AbstractDsDet(DsDetId id, String dsNbr, String dsGitSite,
			Date dsShipdate, Date dsDueDate, Date dsPerDate, String dsPart,
			Double dsQtyOrd, Double dsQtyConf, Double dsQtyShip,
			String dsStatus, String dsRmks, String dsRev, String dsGitAcct,
			String dsGitCc, String dsProject, Integer dsCmtindx,
			Double dsResidual, String dsSoNbr, String dsLoc, String dsTransId,
			String dsUser1, String dsUser2, String dsChr01, String dsChr02,
			String dsChr03, String dsChr04, String dsChr05, Date dsDte01,
			Date dsDte02, Double dsDec01, Double dsDec02, Boolean dsLog01,
			Double dsQtyAll, Double dsQtyPick, Double dsQtyChg,
			Integer dsSodLine, String dsGitSub, String dsOrderCategory,
			Double dsFrRate, Double dsFrWt, String dsFrWtUm, String dsFrClass,
			Double dsFrChg, String dsFrList, Integer dsLine, Double oidDsDet) {
		this.id = id;
		this.dsNbr = dsNbr;
		this.dsGitSite = dsGitSite;
		this.dsShipdate = dsShipdate;
		this.dsDueDate = dsDueDate;
		this.dsPerDate = dsPerDate;
		this.dsPart = dsPart;
		this.dsQtyOrd = dsQtyOrd;
		this.dsQtyConf = dsQtyConf;
		this.dsQtyShip = dsQtyShip;
		this.dsStatus = dsStatus;
		this.dsRmks = dsRmks;
		this.dsRev = dsRev;
		this.dsGitAcct = dsGitAcct;
		this.dsGitCc = dsGitCc;
		this.dsProject = dsProject;
		this.dsCmtindx = dsCmtindx;
		this.dsResidual = dsResidual;
		this.dsSoNbr = dsSoNbr;
		this.dsLoc = dsLoc;
		this.dsTransId = dsTransId;
		this.dsUser1 = dsUser1;
		this.dsUser2 = dsUser2;
		this.dsChr01 = dsChr01;
		this.dsChr02 = dsChr02;
		this.dsChr03 = dsChr03;
		this.dsChr04 = dsChr04;
		this.dsChr05 = dsChr05;
		this.dsDte01 = dsDte01;
		this.dsDte02 = dsDte02;
		this.dsDec01 = dsDec01;
		this.dsDec02 = dsDec02;
		this.dsLog01 = dsLog01;
		this.dsQtyAll = dsQtyAll;
		this.dsQtyPick = dsQtyPick;
		this.dsQtyChg = dsQtyChg;
		this.dsSodLine = dsSodLine;
		this.dsGitSub = dsGitSub;
		this.dsOrderCategory = dsOrderCategory;
		this.dsFrRate = dsFrRate;
		this.dsFrWt = dsFrWt;
		this.dsFrWtUm = dsFrWtUm;
		this.dsFrClass = dsFrClass;
		this.dsFrChg = dsFrChg;
		this.dsFrList = dsFrList;
		this.dsLine = dsLine;
		this.oidDsDet = oidDsDet;
	}

	// Property accessors

	public DsDetId getId() {
		return this.id;
	}

	public void setId(DsDetId id) {
		this.id = id;
	}

	public String getDsNbr() {
		return this.dsNbr;
	}

	public void setDsNbr(String dsNbr) {
		this.dsNbr = dsNbr;
	}

	public String getDsGitSite() {
		return this.dsGitSite;
	}

	public void setDsGitSite(String dsGitSite) {
		this.dsGitSite = dsGitSite;
	}

	public Date getDsShipdate() {
		return this.dsShipdate;
	}

	public void setDsShipdate(Date dsShipdate) {
		this.dsShipdate = dsShipdate;
	}

	public Date getDsDueDate() {
		return this.dsDueDate;
	}

	public void setDsDueDate(Date dsDueDate) {
		this.dsDueDate = dsDueDate;
	}

	public Date getDsPerDate() {
		return this.dsPerDate;
	}

	public void setDsPerDate(Date dsPerDate) {
		this.dsPerDate = dsPerDate;
	}

	public String getDsPart() {
		return this.dsPart;
	}

	public void setDsPart(String dsPart) {
		this.dsPart = dsPart;
	}

	public Double getDsQtyOrd() {
		return this.dsQtyOrd;
	}

	public void setDsQtyOrd(Double dsQtyOrd) {
		this.dsQtyOrd = dsQtyOrd;
	}

	public Double getDsQtyConf() {
		return this.dsQtyConf;
	}

	public void setDsQtyConf(Double dsQtyConf) {
		this.dsQtyConf = dsQtyConf;
	}

	public Double getDsQtyShip() {
		return this.dsQtyShip;
	}

	public void setDsQtyShip(Double dsQtyShip) {
		this.dsQtyShip = dsQtyShip;
	}

	public String getDsStatus() {
		return this.dsStatus;
	}

	public void setDsStatus(String dsStatus) {
		this.dsStatus = dsStatus;
	}

	public String getDsRmks() {
		return this.dsRmks;
	}

	public void setDsRmks(String dsRmks) {
		this.dsRmks = dsRmks;
	}

	public String getDsRev() {
		return this.dsRev;
	}

	public void setDsRev(String dsRev) {
		this.dsRev = dsRev;
	}

	public String getDsGitAcct() {
		return this.dsGitAcct;
	}

	public void setDsGitAcct(String dsGitAcct) {
		this.dsGitAcct = dsGitAcct;
	}

	public String getDsGitCc() {
		return this.dsGitCc;
	}

	public void setDsGitCc(String dsGitCc) {
		this.dsGitCc = dsGitCc;
	}

	public String getDsProject() {
		return this.dsProject;
	}

	public void setDsProject(String dsProject) {
		this.dsProject = dsProject;
	}

	public Integer getDsCmtindx() {
		return this.dsCmtindx;
	}

	public void setDsCmtindx(Integer dsCmtindx) {
		this.dsCmtindx = dsCmtindx;
	}

	public Double getDsResidual() {
		return this.dsResidual;
	}

	public void setDsResidual(Double dsResidual) {
		this.dsResidual = dsResidual;
	}

	public String getDsSoNbr() {
		return this.dsSoNbr;
	}

	public void setDsSoNbr(String dsSoNbr) {
		this.dsSoNbr = dsSoNbr;
	}

	public String getDsLoc() {
		return this.dsLoc;
	}

	public void setDsLoc(String dsLoc) {
		this.dsLoc = dsLoc;
	}

	public String getDsTransId() {
		return this.dsTransId;
	}

	public void setDsTransId(String dsTransId) {
		this.dsTransId = dsTransId;
	}

	public String getDsUser1() {
		return this.dsUser1;
	}

	public void setDsUser1(String dsUser1) {
		this.dsUser1 = dsUser1;
	}

	public String getDsUser2() {
		return this.dsUser2;
	}

	public void setDsUser2(String dsUser2) {
		this.dsUser2 = dsUser2;
	}

	public String getDsChr01() {
		return this.dsChr01;
	}

	public void setDsChr01(String dsChr01) {
		this.dsChr01 = dsChr01;
	}

	public String getDsChr02() {
		return this.dsChr02;
	}

	public void setDsChr02(String dsChr02) {
		this.dsChr02 = dsChr02;
	}

	public String getDsChr03() {
		return this.dsChr03;
	}

	public void setDsChr03(String dsChr03) {
		this.dsChr03 = dsChr03;
	}

	public String getDsChr04() {
		return this.dsChr04;
	}

	public void setDsChr04(String dsChr04) {
		this.dsChr04 = dsChr04;
	}

	public String getDsChr05() {
		return this.dsChr05;
	}

	public void setDsChr05(String dsChr05) {
		this.dsChr05 = dsChr05;
	}

	public Date getDsDte01() {
		return this.dsDte01;
	}

	public void setDsDte01(Date dsDte01) {
		this.dsDte01 = dsDte01;
	}

	public Date getDsDte02() {
		return this.dsDte02;
	}

	public void setDsDte02(Date dsDte02) {
		this.dsDte02 = dsDte02;
	}

	public Double getDsDec01() {
		return this.dsDec01;
	}

	public void setDsDec01(Double dsDec01) {
		this.dsDec01 = dsDec01;
	}

	public Double getDsDec02() {
		return this.dsDec02;
	}

	public void setDsDec02(Double dsDec02) {
		this.dsDec02 = dsDec02;
	}

	public Boolean getDsLog01() {
		return this.dsLog01;
	}

	public void setDsLog01(Boolean dsLog01) {
		this.dsLog01 = dsLog01;
	}

	public Double getDsQtyAll() {
		return this.dsQtyAll;
	}

	public void setDsQtyAll(Double dsQtyAll) {
		this.dsQtyAll = dsQtyAll;
	}

	public Double getDsQtyPick() {
		return this.dsQtyPick;
	}

	public void setDsQtyPick(Double dsQtyPick) {
		this.dsQtyPick = dsQtyPick;
	}

	public Double getDsQtyChg() {
		return this.dsQtyChg;
	}

	public void setDsQtyChg(Double dsQtyChg) {
		this.dsQtyChg = dsQtyChg;
	}

	public Integer getDsSodLine() {
		return this.dsSodLine;
	}

	public void setDsSodLine(Integer dsSodLine) {
		this.dsSodLine = dsSodLine;
	}

	public String getDsGitSub() {
		return this.dsGitSub;
	}

	public void setDsGitSub(String dsGitSub) {
		this.dsGitSub = dsGitSub;
	}

	public String getDsOrderCategory() {
		return this.dsOrderCategory;
	}

	public void setDsOrderCategory(String dsOrderCategory) {
		this.dsOrderCategory = dsOrderCategory;
	}

	public Double getDsFrRate() {
		return this.dsFrRate;
	}

	public void setDsFrRate(Double dsFrRate) {
		this.dsFrRate = dsFrRate;
	}

	public Double getDsFrWt() {
		return this.dsFrWt;
	}

	public void setDsFrWt(Double dsFrWt) {
		this.dsFrWt = dsFrWt;
	}

	public String getDsFrWtUm() {
		return this.dsFrWtUm;
	}

	public void setDsFrWtUm(String dsFrWtUm) {
		this.dsFrWtUm = dsFrWtUm;
	}

	public String getDsFrClass() {
		return this.dsFrClass;
	}

	public void setDsFrClass(String dsFrClass) {
		this.dsFrClass = dsFrClass;
	}

	public Double getDsFrChg() {
		return this.dsFrChg;
	}

	public void setDsFrChg(Double dsFrChg) {
		this.dsFrChg = dsFrChg;
	}

	public String getDsFrList() {
		return this.dsFrList;
	}

	public void setDsFrList(String dsFrList) {
		this.dsFrList = dsFrList;
	}

	public Integer getDsLine() {
		return this.dsLine;
	}

	public void setDsLine(Integer dsLine) {
		this.dsLine = dsLine;
	}

	public Double getOidDsDet() {
		return this.oidDsDet;
	}

	public void setOidDsDet(Double oidDsDet) {
		this.oidDsDet = oidDsDet;
	}

}