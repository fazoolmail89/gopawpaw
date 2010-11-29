package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * AbstractDsrMstr entity provides the base persistence definition of the
 * DsrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDsrMstr implements java.io.Serializable {

	// Fields

	private DsrMstrId id;
	private Integer dsrCmtindx;
	private Date dsrDueDate;
	private String dsrLoc;
	private Date dsrOrdDate;
	private String dsrPart;
	private String dsrProject;
	private Double dsrQtyReq;
	private String dsrRev;
	private String dsrRmks;
	private String dsrSoJob;
	private String dsrStatus;
	private String dsrUser1;
	private String dsrUser2;
	private String dsrChr01;
	private String dsrChr02;
	private String dsrChr03;
	private String dsrChr04;
	private String dsrChr05;
	private Double dsrDec01;
	private Double dsrDec02;
	private Date dsrDte01;
	private Date dsrDte02;
	private Boolean dsrLog01;
	private String dsrAppOwner;
	private Double oidDsrMstr;

	// Constructors

	/** default constructor */
	public AbstractDsrMstr() {
	}

	/** minimal constructor */
	public AbstractDsrMstr(DsrMstrId id, String dsrAppOwner, Double oidDsrMstr) {
		this.id = id;
		this.dsrAppOwner = dsrAppOwner;
		this.oidDsrMstr = oidDsrMstr;
	}

	/** full constructor */
	public AbstractDsrMstr(DsrMstrId id, Integer dsrCmtindx, Date dsrDueDate,
			String dsrLoc, Date dsrOrdDate, String dsrPart, String dsrProject,
			Double dsrQtyReq, String dsrRev, String dsrRmks, String dsrSoJob,
			String dsrStatus, String dsrUser1, String dsrUser2,
			String dsrChr01, String dsrChr02, String dsrChr03, String dsrChr04,
			String dsrChr05, Double dsrDec01, Double dsrDec02, Date dsrDte01,
			Date dsrDte02, Boolean dsrLog01, String dsrAppOwner,
			Double oidDsrMstr) {
		this.id = id;
		this.dsrCmtindx = dsrCmtindx;
		this.dsrDueDate = dsrDueDate;
		this.dsrLoc = dsrLoc;
		this.dsrOrdDate = dsrOrdDate;
		this.dsrPart = dsrPart;
		this.dsrProject = dsrProject;
		this.dsrQtyReq = dsrQtyReq;
		this.dsrRev = dsrRev;
		this.dsrRmks = dsrRmks;
		this.dsrSoJob = dsrSoJob;
		this.dsrStatus = dsrStatus;
		this.dsrUser1 = dsrUser1;
		this.dsrUser2 = dsrUser2;
		this.dsrChr01 = dsrChr01;
		this.dsrChr02 = dsrChr02;
		this.dsrChr03 = dsrChr03;
		this.dsrChr04 = dsrChr04;
		this.dsrChr05 = dsrChr05;
		this.dsrDec01 = dsrDec01;
		this.dsrDec02 = dsrDec02;
		this.dsrDte01 = dsrDte01;
		this.dsrDte02 = dsrDte02;
		this.dsrLog01 = dsrLog01;
		this.dsrAppOwner = dsrAppOwner;
		this.oidDsrMstr = oidDsrMstr;
	}

	// Property accessors

	public DsrMstrId getId() {
		return this.id;
	}

	public void setId(DsrMstrId id) {
		this.id = id;
	}

	public Integer getDsrCmtindx() {
		return this.dsrCmtindx;
	}

	public void setDsrCmtindx(Integer dsrCmtindx) {
		this.dsrCmtindx = dsrCmtindx;
	}

	public Date getDsrDueDate() {
		return this.dsrDueDate;
	}

	public void setDsrDueDate(Date dsrDueDate) {
		this.dsrDueDate = dsrDueDate;
	}

	public String getDsrLoc() {
		return this.dsrLoc;
	}

	public void setDsrLoc(String dsrLoc) {
		this.dsrLoc = dsrLoc;
	}

	public Date getDsrOrdDate() {
		return this.dsrOrdDate;
	}

	public void setDsrOrdDate(Date dsrOrdDate) {
		this.dsrOrdDate = dsrOrdDate;
	}

	public String getDsrPart() {
		return this.dsrPart;
	}

	public void setDsrPart(String dsrPart) {
		this.dsrPart = dsrPart;
	}

	public String getDsrProject() {
		return this.dsrProject;
	}

	public void setDsrProject(String dsrProject) {
		this.dsrProject = dsrProject;
	}

	public Double getDsrQtyReq() {
		return this.dsrQtyReq;
	}

	public void setDsrQtyReq(Double dsrQtyReq) {
		this.dsrQtyReq = dsrQtyReq;
	}

	public String getDsrRev() {
		return this.dsrRev;
	}

	public void setDsrRev(String dsrRev) {
		this.dsrRev = dsrRev;
	}

	public String getDsrRmks() {
		return this.dsrRmks;
	}

	public void setDsrRmks(String dsrRmks) {
		this.dsrRmks = dsrRmks;
	}

	public String getDsrSoJob() {
		return this.dsrSoJob;
	}

	public void setDsrSoJob(String dsrSoJob) {
		this.dsrSoJob = dsrSoJob;
	}

	public String getDsrStatus() {
		return this.dsrStatus;
	}

	public void setDsrStatus(String dsrStatus) {
		this.dsrStatus = dsrStatus;
	}

	public String getDsrUser1() {
		return this.dsrUser1;
	}

	public void setDsrUser1(String dsrUser1) {
		this.dsrUser1 = dsrUser1;
	}

	public String getDsrUser2() {
		return this.dsrUser2;
	}

	public void setDsrUser2(String dsrUser2) {
		this.dsrUser2 = dsrUser2;
	}

	public String getDsrChr01() {
		return this.dsrChr01;
	}

	public void setDsrChr01(String dsrChr01) {
		this.dsrChr01 = dsrChr01;
	}

	public String getDsrChr02() {
		return this.dsrChr02;
	}

	public void setDsrChr02(String dsrChr02) {
		this.dsrChr02 = dsrChr02;
	}

	public String getDsrChr03() {
		return this.dsrChr03;
	}

	public void setDsrChr03(String dsrChr03) {
		this.dsrChr03 = dsrChr03;
	}

	public String getDsrChr04() {
		return this.dsrChr04;
	}

	public void setDsrChr04(String dsrChr04) {
		this.dsrChr04 = dsrChr04;
	}

	public String getDsrChr05() {
		return this.dsrChr05;
	}

	public void setDsrChr05(String dsrChr05) {
		this.dsrChr05 = dsrChr05;
	}

	public Double getDsrDec01() {
		return this.dsrDec01;
	}

	public void setDsrDec01(Double dsrDec01) {
		this.dsrDec01 = dsrDec01;
	}

	public Double getDsrDec02() {
		return this.dsrDec02;
	}

	public void setDsrDec02(Double dsrDec02) {
		this.dsrDec02 = dsrDec02;
	}

	public Date getDsrDte01() {
		return this.dsrDte01;
	}

	public void setDsrDte01(Date dsrDte01) {
		this.dsrDte01 = dsrDte01;
	}

	public Date getDsrDte02() {
		return this.dsrDte02;
	}

	public void setDsrDte02(Date dsrDte02) {
		this.dsrDte02 = dsrDte02;
	}

	public Boolean getDsrLog01() {
		return this.dsrLog01;
	}

	public void setDsrLog01(Boolean dsrLog01) {
		this.dsrLog01 = dsrLog01;
	}

	public String getDsrAppOwner() {
		return this.dsrAppOwner;
	}

	public void setDsrAppOwner(String dsrAppOwner) {
		this.dsrAppOwner = dsrAppOwner;
	}

	public Double getOidDsrMstr() {
		return this.oidDsrMstr;
	}

	public void setOidDsrMstr(Double oidDsrMstr) {
		this.oidDsrMstr = oidDsrMstr;
	}

}