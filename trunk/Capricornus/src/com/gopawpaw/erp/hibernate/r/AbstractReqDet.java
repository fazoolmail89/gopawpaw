package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractReqDet entity provides the base persistence definition of the ReqDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractReqDet implements java.io.Serializable {

	// Fields

	private ReqDetId id;
	private String reqPart;
	private Double reqQty;
	private Date reqRelDate;
	private Date reqNeed;
	private String reqUm;
	private Boolean reqPrint;
	private String reqSoJob;
	private String reqUser1;
	private String reqUser2;
	private String reqSite;
	private String reqAcct;
	private String reqCc;
	private Integer reqCmtindx;
	private String reqRequest;
	private String reqAprBy;
	private String reqChr01;
	private String reqChr02;
	private String reqChr03;
	private String reqChr04;
	private String reqChr05;
	private Date reqDte01;
	private Date reqDte02;
	private Double reqDec01;
	private Double reqDec02;
	private Boolean reqLog01;
	private String reqProject;
	private String reqAprCode;
	private Double reqPurCost;
	private Boolean reqAprPrnt;
	private Boolean reqApproved;
	private String reqAprEnt;
	private String reqPoSite;
	private String reqSub;
	private String reqAppOwner;
	private Double oidReqDet;

	// Constructors

	/** default constructor */
	public AbstractReqDet() {
	}

	/** minimal constructor */
	public AbstractReqDet(ReqDetId id, String reqAppOwner, Double oidReqDet) {
		this.id = id;
		this.reqAppOwner = reqAppOwner;
		this.oidReqDet = oidReqDet;
	}

	/** full constructor */
	public AbstractReqDet(ReqDetId id, String reqPart, Double reqQty,
			Date reqRelDate, Date reqNeed, String reqUm, Boolean reqPrint,
			String reqSoJob, String reqUser1, String reqUser2, String reqSite,
			String reqAcct, String reqCc, Integer reqCmtindx,
			String reqRequest, String reqAprBy, String reqChr01,
			String reqChr02, String reqChr03, String reqChr04, String reqChr05,
			Date reqDte01, Date reqDte02, Double reqDec01, Double reqDec02,
			Boolean reqLog01, String reqProject, String reqAprCode,
			Double reqPurCost, Boolean reqAprPrnt, Boolean reqApproved,
			String reqAprEnt, String reqPoSite, String reqSub,
			String reqAppOwner, Double oidReqDet) {
		this.id = id;
		this.reqPart = reqPart;
		this.reqQty = reqQty;
		this.reqRelDate = reqRelDate;
		this.reqNeed = reqNeed;
		this.reqUm = reqUm;
		this.reqPrint = reqPrint;
		this.reqSoJob = reqSoJob;
		this.reqUser1 = reqUser1;
		this.reqUser2 = reqUser2;
		this.reqSite = reqSite;
		this.reqAcct = reqAcct;
		this.reqCc = reqCc;
		this.reqCmtindx = reqCmtindx;
		this.reqRequest = reqRequest;
		this.reqAprBy = reqAprBy;
		this.reqChr01 = reqChr01;
		this.reqChr02 = reqChr02;
		this.reqChr03 = reqChr03;
		this.reqChr04 = reqChr04;
		this.reqChr05 = reqChr05;
		this.reqDte01 = reqDte01;
		this.reqDte02 = reqDte02;
		this.reqDec01 = reqDec01;
		this.reqDec02 = reqDec02;
		this.reqLog01 = reqLog01;
		this.reqProject = reqProject;
		this.reqAprCode = reqAprCode;
		this.reqPurCost = reqPurCost;
		this.reqAprPrnt = reqAprPrnt;
		this.reqApproved = reqApproved;
		this.reqAprEnt = reqAprEnt;
		this.reqPoSite = reqPoSite;
		this.reqSub = reqSub;
		this.reqAppOwner = reqAppOwner;
		this.oidReqDet = oidReqDet;
	}

	// Property accessors

	public ReqDetId getId() {
		return this.id;
	}

	public void setId(ReqDetId id) {
		this.id = id;
	}

	public String getReqPart() {
		return this.reqPart;
	}

	public void setReqPart(String reqPart) {
		this.reqPart = reqPart;
	}

	public Double getReqQty() {
		return this.reqQty;
	}

	public void setReqQty(Double reqQty) {
		this.reqQty = reqQty;
	}

	public Date getReqRelDate() {
		return this.reqRelDate;
	}

	public void setReqRelDate(Date reqRelDate) {
		this.reqRelDate = reqRelDate;
	}

	public Date getReqNeed() {
		return this.reqNeed;
	}

	public void setReqNeed(Date reqNeed) {
		this.reqNeed = reqNeed;
	}

	public String getReqUm() {
		return this.reqUm;
	}

	public void setReqUm(String reqUm) {
		this.reqUm = reqUm;
	}

	public Boolean getReqPrint() {
		return this.reqPrint;
	}

	public void setReqPrint(Boolean reqPrint) {
		this.reqPrint = reqPrint;
	}

	public String getReqSoJob() {
		return this.reqSoJob;
	}

	public void setReqSoJob(String reqSoJob) {
		this.reqSoJob = reqSoJob;
	}

	public String getReqUser1() {
		return this.reqUser1;
	}

	public void setReqUser1(String reqUser1) {
		this.reqUser1 = reqUser1;
	}

	public String getReqUser2() {
		return this.reqUser2;
	}

	public void setReqUser2(String reqUser2) {
		this.reqUser2 = reqUser2;
	}

	public String getReqSite() {
		return this.reqSite;
	}

	public void setReqSite(String reqSite) {
		this.reqSite = reqSite;
	}

	public String getReqAcct() {
		return this.reqAcct;
	}

	public void setReqAcct(String reqAcct) {
		this.reqAcct = reqAcct;
	}

	public String getReqCc() {
		return this.reqCc;
	}

	public void setReqCc(String reqCc) {
		this.reqCc = reqCc;
	}

	public Integer getReqCmtindx() {
		return this.reqCmtindx;
	}

	public void setReqCmtindx(Integer reqCmtindx) {
		this.reqCmtindx = reqCmtindx;
	}

	public String getReqRequest() {
		return this.reqRequest;
	}

	public void setReqRequest(String reqRequest) {
		this.reqRequest = reqRequest;
	}

	public String getReqAprBy() {
		return this.reqAprBy;
	}

	public void setReqAprBy(String reqAprBy) {
		this.reqAprBy = reqAprBy;
	}

	public String getReqChr01() {
		return this.reqChr01;
	}

	public void setReqChr01(String reqChr01) {
		this.reqChr01 = reqChr01;
	}

	public String getReqChr02() {
		return this.reqChr02;
	}

	public void setReqChr02(String reqChr02) {
		this.reqChr02 = reqChr02;
	}

	public String getReqChr03() {
		return this.reqChr03;
	}

	public void setReqChr03(String reqChr03) {
		this.reqChr03 = reqChr03;
	}

	public String getReqChr04() {
		return this.reqChr04;
	}

	public void setReqChr04(String reqChr04) {
		this.reqChr04 = reqChr04;
	}

	public String getReqChr05() {
		return this.reqChr05;
	}

	public void setReqChr05(String reqChr05) {
		this.reqChr05 = reqChr05;
	}

	public Date getReqDte01() {
		return this.reqDte01;
	}

	public void setReqDte01(Date reqDte01) {
		this.reqDte01 = reqDte01;
	}

	public Date getReqDte02() {
		return this.reqDte02;
	}

	public void setReqDte02(Date reqDte02) {
		this.reqDte02 = reqDte02;
	}

	public Double getReqDec01() {
		return this.reqDec01;
	}

	public void setReqDec01(Double reqDec01) {
		this.reqDec01 = reqDec01;
	}

	public Double getReqDec02() {
		return this.reqDec02;
	}

	public void setReqDec02(Double reqDec02) {
		this.reqDec02 = reqDec02;
	}

	public Boolean getReqLog01() {
		return this.reqLog01;
	}

	public void setReqLog01(Boolean reqLog01) {
		this.reqLog01 = reqLog01;
	}

	public String getReqProject() {
		return this.reqProject;
	}

	public void setReqProject(String reqProject) {
		this.reqProject = reqProject;
	}

	public String getReqAprCode() {
		return this.reqAprCode;
	}

	public void setReqAprCode(String reqAprCode) {
		this.reqAprCode = reqAprCode;
	}

	public Double getReqPurCost() {
		return this.reqPurCost;
	}

	public void setReqPurCost(Double reqPurCost) {
		this.reqPurCost = reqPurCost;
	}

	public Boolean getReqAprPrnt() {
		return this.reqAprPrnt;
	}

	public void setReqAprPrnt(Boolean reqAprPrnt) {
		this.reqAprPrnt = reqAprPrnt;
	}

	public Boolean getReqApproved() {
		return this.reqApproved;
	}

	public void setReqApproved(Boolean reqApproved) {
		this.reqApproved = reqApproved;
	}

	public String getReqAprEnt() {
		return this.reqAprEnt;
	}

	public void setReqAprEnt(String reqAprEnt) {
		this.reqAprEnt = reqAprEnt;
	}

	public String getReqPoSite() {
		return this.reqPoSite;
	}

	public void setReqPoSite(String reqPoSite) {
		this.reqPoSite = reqPoSite;
	}

	public String getReqSub() {
		return this.reqSub;
	}

	public void setReqSub(String reqSub) {
		this.reqSub = reqSub;
	}

	public String getReqAppOwner() {
		return this.reqAppOwner;
	}

	public void setReqAppOwner(String reqAppOwner) {
		this.reqAppOwner = reqAppOwner;
	}

	public Double getOidReqDet() {
		return this.oidReqDet;
	}

	public void setOidReqDet(Double oidReqDet) {
		this.oidReqDet = oidReqDet;
	}

}