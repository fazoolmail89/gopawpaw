package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDsdDet entity provides the base persistence definition of the DsdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDsdDet implements java.io.Serializable {

	// Fields

	private DsdDetId id;
	private String dsdGitSite;
	private Double dsdQtyConf;
	private Date dsdShipdate;
	private Date dsdDueDate;
	private Date dsdPerDate;
	private String dsdPart;
	private Double dsdQtyOrd;
	private Double dsdQtyRcvd;
	private Double dsdQtyShip;
	private Double dsdTransit;
	private String dsdStatus;
	private String dsdRmks;
	private String dsdRev;
	private String dsdGitAcct;
	private String dsdGitCc;
	private String dsdProject;
	private Integer dsdCmtindx;
	private Double dsdResidual;
	private String dsdLoc;
	private String dsdTransId;
	private Boolean dsdUpdated;
	private String dsdUser1;
	private String dsdUser2;
	private String dsdChr01;
	private String dsdChr02;
	private String dsdChr03;
	private String dsdChr04;
	private String dsdChr05;
	private Date dsdDte01;
	private Date dsdDte02;
	private Double dsdDec01;
	private Double dsdDec02;
	private Boolean dsdLog01;
	private String dsdNbr;
	private Double dsdQtyChg;
	private String dsdPoNbr;
	private Integer dsdPodLine;
	private String dsdGitSub;
	private Double oidDsdDet;

	// Constructors

	/** default constructor */
	public AbstractDsdDet() {
	}

	/** minimal constructor */
	public AbstractDsdDet(DsdDetId id, Double oidDsdDet) {
		this.id = id;
		this.oidDsdDet = oidDsdDet;
	}

	/** full constructor */
	public AbstractDsdDet(DsdDetId id, String dsdGitSite, Double dsdQtyConf,
			Date dsdShipdate, Date dsdDueDate, Date dsdPerDate, String dsdPart,
			Double dsdQtyOrd, Double dsdQtyRcvd, Double dsdQtyShip,
			Double dsdTransit, String dsdStatus, String dsdRmks, String dsdRev,
			String dsdGitAcct, String dsdGitCc, String dsdProject,
			Integer dsdCmtindx, Double dsdResidual, String dsdLoc,
			String dsdTransId, Boolean dsdUpdated, String dsdUser1,
			String dsdUser2, String dsdChr01, String dsdChr02, String dsdChr03,
			String dsdChr04, String dsdChr05, Date dsdDte01, Date dsdDte02,
			Double dsdDec01, Double dsdDec02, Boolean dsdLog01, String dsdNbr,
			Double dsdQtyChg, String dsdPoNbr, Integer dsdPodLine,
			String dsdGitSub, Double oidDsdDet) {
		this.id = id;
		this.dsdGitSite = dsdGitSite;
		this.dsdQtyConf = dsdQtyConf;
		this.dsdShipdate = dsdShipdate;
		this.dsdDueDate = dsdDueDate;
		this.dsdPerDate = dsdPerDate;
		this.dsdPart = dsdPart;
		this.dsdQtyOrd = dsdQtyOrd;
		this.dsdQtyRcvd = dsdQtyRcvd;
		this.dsdQtyShip = dsdQtyShip;
		this.dsdTransit = dsdTransit;
		this.dsdStatus = dsdStatus;
		this.dsdRmks = dsdRmks;
		this.dsdRev = dsdRev;
		this.dsdGitAcct = dsdGitAcct;
		this.dsdGitCc = dsdGitCc;
		this.dsdProject = dsdProject;
		this.dsdCmtindx = dsdCmtindx;
		this.dsdResidual = dsdResidual;
		this.dsdLoc = dsdLoc;
		this.dsdTransId = dsdTransId;
		this.dsdUpdated = dsdUpdated;
		this.dsdUser1 = dsdUser1;
		this.dsdUser2 = dsdUser2;
		this.dsdChr01 = dsdChr01;
		this.dsdChr02 = dsdChr02;
		this.dsdChr03 = dsdChr03;
		this.dsdChr04 = dsdChr04;
		this.dsdChr05 = dsdChr05;
		this.dsdDte01 = dsdDte01;
		this.dsdDte02 = dsdDte02;
		this.dsdDec01 = dsdDec01;
		this.dsdDec02 = dsdDec02;
		this.dsdLog01 = dsdLog01;
		this.dsdNbr = dsdNbr;
		this.dsdQtyChg = dsdQtyChg;
		this.dsdPoNbr = dsdPoNbr;
		this.dsdPodLine = dsdPodLine;
		this.dsdGitSub = dsdGitSub;
		this.oidDsdDet = oidDsdDet;
	}

	// Property accessors

	public DsdDetId getId() {
		return this.id;
	}

	public void setId(DsdDetId id) {
		this.id = id;
	}

	public String getDsdGitSite() {
		return this.dsdGitSite;
	}

	public void setDsdGitSite(String dsdGitSite) {
		this.dsdGitSite = dsdGitSite;
	}

	public Double getDsdQtyConf() {
		return this.dsdQtyConf;
	}

	public void setDsdQtyConf(Double dsdQtyConf) {
		this.dsdQtyConf = dsdQtyConf;
	}

	public Date getDsdShipdate() {
		return this.dsdShipdate;
	}

	public void setDsdShipdate(Date dsdShipdate) {
		this.dsdShipdate = dsdShipdate;
	}

	public Date getDsdDueDate() {
		return this.dsdDueDate;
	}

	public void setDsdDueDate(Date dsdDueDate) {
		this.dsdDueDate = dsdDueDate;
	}

	public Date getDsdPerDate() {
		return this.dsdPerDate;
	}

	public void setDsdPerDate(Date dsdPerDate) {
		this.dsdPerDate = dsdPerDate;
	}

	public String getDsdPart() {
		return this.dsdPart;
	}

	public void setDsdPart(String dsdPart) {
		this.dsdPart = dsdPart;
	}

	public Double getDsdQtyOrd() {
		return this.dsdQtyOrd;
	}

	public void setDsdQtyOrd(Double dsdQtyOrd) {
		this.dsdQtyOrd = dsdQtyOrd;
	}

	public Double getDsdQtyRcvd() {
		return this.dsdQtyRcvd;
	}

	public void setDsdQtyRcvd(Double dsdQtyRcvd) {
		this.dsdQtyRcvd = dsdQtyRcvd;
	}

	public Double getDsdQtyShip() {
		return this.dsdQtyShip;
	}

	public void setDsdQtyShip(Double dsdQtyShip) {
		this.dsdQtyShip = dsdQtyShip;
	}

	public Double getDsdTransit() {
		return this.dsdTransit;
	}

	public void setDsdTransit(Double dsdTransit) {
		this.dsdTransit = dsdTransit;
	}

	public String getDsdStatus() {
		return this.dsdStatus;
	}

	public void setDsdStatus(String dsdStatus) {
		this.dsdStatus = dsdStatus;
	}

	public String getDsdRmks() {
		return this.dsdRmks;
	}

	public void setDsdRmks(String dsdRmks) {
		this.dsdRmks = dsdRmks;
	}

	public String getDsdRev() {
		return this.dsdRev;
	}

	public void setDsdRev(String dsdRev) {
		this.dsdRev = dsdRev;
	}

	public String getDsdGitAcct() {
		return this.dsdGitAcct;
	}

	public void setDsdGitAcct(String dsdGitAcct) {
		this.dsdGitAcct = dsdGitAcct;
	}

	public String getDsdGitCc() {
		return this.dsdGitCc;
	}

	public void setDsdGitCc(String dsdGitCc) {
		this.dsdGitCc = dsdGitCc;
	}

	public String getDsdProject() {
		return this.dsdProject;
	}

	public void setDsdProject(String dsdProject) {
		this.dsdProject = dsdProject;
	}

	public Integer getDsdCmtindx() {
		return this.dsdCmtindx;
	}

	public void setDsdCmtindx(Integer dsdCmtindx) {
		this.dsdCmtindx = dsdCmtindx;
	}

	public Double getDsdResidual() {
		return this.dsdResidual;
	}

	public void setDsdResidual(Double dsdResidual) {
		this.dsdResidual = dsdResidual;
	}

	public String getDsdLoc() {
		return this.dsdLoc;
	}

	public void setDsdLoc(String dsdLoc) {
		this.dsdLoc = dsdLoc;
	}

	public String getDsdTransId() {
		return this.dsdTransId;
	}

	public void setDsdTransId(String dsdTransId) {
		this.dsdTransId = dsdTransId;
	}

	public Boolean getDsdUpdated() {
		return this.dsdUpdated;
	}

	public void setDsdUpdated(Boolean dsdUpdated) {
		this.dsdUpdated = dsdUpdated;
	}

	public String getDsdUser1() {
		return this.dsdUser1;
	}

	public void setDsdUser1(String dsdUser1) {
		this.dsdUser1 = dsdUser1;
	}

	public String getDsdUser2() {
		return this.dsdUser2;
	}

	public void setDsdUser2(String dsdUser2) {
		this.dsdUser2 = dsdUser2;
	}

	public String getDsdChr01() {
		return this.dsdChr01;
	}

	public void setDsdChr01(String dsdChr01) {
		this.dsdChr01 = dsdChr01;
	}

	public String getDsdChr02() {
		return this.dsdChr02;
	}

	public void setDsdChr02(String dsdChr02) {
		this.dsdChr02 = dsdChr02;
	}

	public String getDsdChr03() {
		return this.dsdChr03;
	}

	public void setDsdChr03(String dsdChr03) {
		this.dsdChr03 = dsdChr03;
	}

	public String getDsdChr04() {
		return this.dsdChr04;
	}

	public void setDsdChr04(String dsdChr04) {
		this.dsdChr04 = dsdChr04;
	}

	public String getDsdChr05() {
		return this.dsdChr05;
	}

	public void setDsdChr05(String dsdChr05) {
		this.dsdChr05 = dsdChr05;
	}

	public Date getDsdDte01() {
		return this.dsdDte01;
	}

	public void setDsdDte01(Date dsdDte01) {
		this.dsdDte01 = dsdDte01;
	}

	public Date getDsdDte02() {
		return this.dsdDte02;
	}

	public void setDsdDte02(Date dsdDte02) {
		this.dsdDte02 = dsdDte02;
	}

	public Double getDsdDec01() {
		return this.dsdDec01;
	}

	public void setDsdDec01(Double dsdDec01) {
		this.dsdDec01 = dsdDec01;
	}

	public Double getDsdDec02() {
		return this.dsdDec02;
	}

	public void setDsdDec02(Double dsdDec02) {
		this.dsdDec02 = dsdDec02;
	}

	public Boolean getDsdLog01() {
		return this.dsdLog01;
	}

	public void setDsdLog01(Boolean dsdLog01) {
		this.dsdLog01 = dsdLog01;
	}

	public String getDsdNbr() {
		return this.dsdNbr;
	}

	public void setDsdNbr(String dsdNbr) {
		this.dsdNbr = dsdNbr;
	}

	public Double getDsdQtyChg() {
		return this.dsdQtyChg;
	}

	public void setDsdQtyChg(Double dsdQtyChg) {
		this.dsdQtyChg = dsdQtyChg;
	}

	public String getDsdPoNbr() {
		return this.dsdPoNbr;
	}

	public void setDsdPoNbr(String dsdPoNbr) {
		this.dsdPoNbr = dsdPoNbr;
	}

	public Integer getDsdPodLine() {
		return this.dsdPodLine;
	}

	public void setDsdPodLine(Integer dsdPodLine) {
		this.dsdPodLine = dsdPodLine;
	}

	public String getDsdGitSub() {
		return this.dsdGitSub;
	}

	public void setDsdGitSub(String dsdGitSub) {
		this.dsdGitSub = dsdGitSub;
	}

	public Double getOidDsdDet() {
		return this.oidDsdDet;
	}

	public void setOidDsdDet(Double oidDsdDet) {
		this.oidDsdDet = oidDsdDet;
	}

}