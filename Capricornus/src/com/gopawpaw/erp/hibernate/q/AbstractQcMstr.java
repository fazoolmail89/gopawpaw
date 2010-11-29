package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * AbstractQcMstr entity provides the base persistence definition of the QcMstr
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractQcMstr implements java.io.Serializable {

	// Fields

	private QcMstrId id;
	private String qcRef;
	private Date qcOrdDate;
	private Date qcRelDate;
	private Date qcDueDate;
	private String qcProject;
	private String qcPart;
	private String qcType;
	private Double qcQtyOrd;
	private Double qcQtyComp;
	private Double qcQtyRjct;
	private String qcStatus;
	private String qcRmks;
	private Double qcLeadTime;
	private Integer qcCmtindx;
	private String qcUser1;
	private String qcUser2;
	private String qcLoc;
	private String qcSerial;
	private String qcTeststep;
	private String qcSite;
	private String qcChr01;
	private String qcChr02;
	private String qcChr03;
	private String qcChr04;
	private String qcChr05;
	private Date qcDte01;
	private Date qcDte02;
	private Double qcDec01;
	private Double qcDec02;
	private Boolean qcLog01;
	private String qcInspLoc;
	private String qcInvStat;
	private Boolean qcAutoissue;
	private String qcJob;
	private Double oidQcMstr;

	// Constructors

	/** default constructor */
	public AbstractQcMstr() {
	}

	/** minimal constructor */
	public AbstractQcMstr(QcMstrId id, Double oidQcMstr) {
		this.id = id;
		this.oidQcMstr = oidQcMstr;
	}

	/** full constructor */
	public AbstractQcMstr(QcMstrId id, String qcRef, Date qcOrdDate,
			Date qcRelDate, Date qcDueDate, String qcProject, String qcPart,
			String qcType, Double qcQtyOrd, Double qcQtyComp, Double qcQtyRjct,
			String qcStatus, String qcRmks, Double qcLeadTime,
			Integer qcCmtindx, String qcUser1, String qcUser2, String qcLoc,
			String qcSerial, String qcTeststep, String qcSite, String qcChr01,
			String qcChr02, String qcChr03, String qcChr04, String qcChr05,
			Date qcDte01, Date qcDte02, Double qcDec01, Double qcDec02,
			Boolean qcLog01, String qcInspLoc, String qcInvStat,
			Boolean qcAutoissue, String qcJob, Double oidQcMstr) {
		this.id = id;
		this.qcRef = qcRef;
		this.qcOrdDate = qcOrdDate;
		this.qcRelDate = qcRelDate;
		this.qcDueDate = qcDueDate;
		this.qcProject = qcProject;
		this.qcPart = qcPart;
		this.qcType = qcType;
		this.qcQtyOrd = qcQtyOrd;
		this.qcQtyComp = qcQtyComp;
		this.qcQtyRjct = qcQtyRjct;
		this.qcStatus = qcStatus;
		this.qcRmks = qcRmks;
		this.qcLeadTime = qcLeadTime;
		this.qcCmtindx = qcCmtindx;
		this.qcUser1 = qcUser1;
		this.qcUser2 = qcUser2;
		this.qcLoc = qcLoc;
		this.qcSerial = qcSerial;
		this.qcTeststep = qcTeststep;
		this.qcSite = qcSite;
		this.qcChr01 = qcChr01;
		this.qcChr02 = qcChr02;
		this.qcChr03 = qcChr03;
		this.qcChr04 = qcChr04;
		this.qcChr05 = qcChr05;
		this.qcDte01 = qcDte01;
		this.qcDte02 = qcDte02;
		this.qcDec01 = qcDec01;
		this.qcDec02 = qcDec02;
		this.qcLog01 = qcLog01;
		this.qcInspLoc = qcInspLoc;
		this.qcInvStat = qcInvStat;
		this.qcAutoissue = qcAutoissue;
		this.qcJob = qcJob;
		this.oidQcMstr = oidQcMstr;
	}

	// Property accessors

	public QcMstrId getId() {
		return this.id;
	}

	public void setId(QcMstrId id) {
		this.id = id;
	}

	public String getQcRef() {
		return this.qcRef;
	}

	public void setQcRef(String qcRef) {
		this.qcRef = qcRef;
	}

	public Date getQcOrdDate() {
		return this.qcOrdDate;
	}

	public void setQcOrdDate(Date qcOrdDate) {
		this.qcOrdDate = qcOrdDate;
	}

	public Date getQcRelDate() {
		return this.qcRelDate;
	}

	public void setQcRelDate(Date qcRelDate) {
		this.qcRelDate = qcRelDate;
	}

	public Date getQcDueDate() {
		return this.qcDueDate;
	}

	public void setQcDueDate(Date qcDueDate) {
		this.qcDueDate = qcDueDate;
	}

	public String getQcProject() {
		return this.qcProject;
	}

	public void setQcProject(String qcProject) {
		this.qcProject = qcProject;
	}

	public String getQcPart() {
		return this.qcPart;
	}

	public void setQcPart(String qcPart) {
		this.qcPart = qcPart;
	}

	public String getQcType() {
		return this.qcType;
	}

	public void setQcType(String qcType) {
		this.qcType = qcType;
	}

	public Double getQcQtyOrd() {
		return this.qcQtyOrd;
	}

	public void setQcQtyOrd(Double qcQtyOrd) {
		this.qcQtyOrd = qcQtyOrd;
	}

	public Double getQcQtyComp() {
		return this.qcQtyComp;
	}

	public void setQcQtyComp(Double qcQtyComp) {
		this.qcQtyComp = qcQtyComp;
	}

	public Double getQcQtyRjct() {
		return this.qcQtyRjct;
	}

	public void setQcQtyRjct(Double qcQtyRjct) {
		this.qcQtyRjct = qcQtyRjct;
	}

	public String getQcStatus() {
		return this.qcStatus;
	}

	public void setQcStatus(String qcStatus) {
		this.qcStatus = qcStatus;
	}

	public String getQcRmks() {
		return this.qcRmks;
	}

	public void setQcRmks(String qcRmks) {
		this.qcRmks = qcRmks;
	}

	public Double getQcLeadTime() {
		return this.qcLeadTime;
	}

	public void setQcLeadTime(Double qcLeadTime) {
		this.qcLeadTime = qcLeadTime;
	}

	public Integer getQcCmtindx() {
		return this.qcCmtindx;
	}

	public void setQcCmtindx(Integer qcCmtindx) {
		this.qcCmtindx = qcCmtindx;
	}

	public String getQcUser1() {
		return this.qcUser1;
	}

	public void setQcUser1(String qcUser1) {
		this.qcUser1 = qcUser1;
	}

	public String getQcUser2() {
		return this.qcUser2;
	}

	public void setQcUser2(String qcUser2) {
		this.qcUser2 = qcUser2;
	}

	public String getQcLoc() {
		return this.qcLoc;
	}

	public void setQcLoc(String qcLoc) {
		this.qcLoc = qcLoc;
	}

	public String getQcSerial() {
		return this.qcSerial;
	}

	public void setQcSerial(String qcSerial) {
		this.qcSerial = qcSerial;
	}

	public String getQcTeststep() {
		return this.qcTeststep;
	}

	public void setQcTeststep(String qcTeststep) {
		this.qcTeststep = qcTeststep;
	}

	public String getQcSite() {
		return this.qcSite;
	}

	public void setQcSite(String qcSite) {
		this.qcSite = qcSite;
	}

	public String getQcChr01() {
		return this.qcChr01;
	}

	public void setQcChr01(String qcChr01) {
		this.qcChr01 = qcChr01;
	}

	public String getQcChr02() {
		return this.qcChr02;
	}

	public void setQcChr02(String qcChr02) {
		this.qcChr02 = qcChr02;
	}

	public String getQcChr03() {
		return this.qcChr03;
	}

	public void setQcChr03(String qcChr03) {
		this.qcChr03 = qcChr03;
	}

	public String getQcChr04() {
		return this.qcChr04;
	}

	public void setQcChr04(String qcChr04) {
		this.qcChr04 = qcChr04;
	}

	public String getQcChr05() {
		return this.qcChr05;
	}

	public void setQcChr05(String qcChr05) {
		this.qcChr05 = qcChr05;
	}

	public Date getQcDte01() {
		return this.qcDte01;
	}

	public void setQcDte01(Date qcDte01) {
		this.qcDte01 = qcDte01;
	}

	public Date getQcDte02() {
		return this.qcDte02;
	}

	public void setQcDte02(Date qcDte02) {
		this.qcDte02 = qcDte02;
	}

	public Double getQcDec01() {
		return this.qcDec01;
	}

	public void setQcDec01(Double qcDec01) {
		this.qcDec01 = qcDec01;
	}

	public Double getQcDec02() {
		return this.qcDec02;
	}

	public void setQcDec02(Double qcDec02) {
		this.qcDec02 = qcDec02;
	}

	public Boolean getQcLog01() {
		return this.qcLog01;
	}

	public void setQcLog01(Boolean qcLog01) {
		this.qcLog01 = qcLog01;
	}

	public String getQcInspLoc() {
		return this.qcInspLoc;
	}

	public void setQcInspLoc(String qcInspLoc) {
		this.qcInspLoc = qcInspLoc;
	}

	public String getQcInvStat() {
		return this.qcInvStat;
	}

	public void setQcInvStat(String qcInvStat) {
		this.qcInvStat = qcInvStat;
	}

	public Boolean getQcAutoissue() {
		return this.qcAutoissue;
	}

	public void setQcAutoissue(Boolean qcAutoissue) {
		this.qcAutoissue = qcAutoissue;
	}

	public String getQcJob() {
		return this.qcJob;
	}

	public void setQcJob(String qcJob) {
		this.qcJob = qcJob;
	}

	public Double getOidQcMstr() {
		return this.oidQcMstr;
	}

	public void setOidQcMstr(Double oidQcMstr) {
		this.oidQcMstr = oidQcMstr;
	}

}