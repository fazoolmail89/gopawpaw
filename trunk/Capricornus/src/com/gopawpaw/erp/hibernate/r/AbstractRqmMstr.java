package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * AbstractRqmMstr entity provides the base persistence definition of the
 * RqmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqmMstr implements java.io.Serializable {

	// Fields

	private RqmMstrId id;
	private Date rqmReqDate;
	private String rqmRqbyUserid;
	private String rqmEndUserid;
	private String rqmShip;
	private Integer rqmCmtindx;
	private String rqmReason;
	private String rqmEbyUserid;
	private String rqmStatus;
	private Boolean rqmPrint;
	private Date rqmDueDate;
	private Date rqmNeedDate;
	private String rqmVend;
	private String rqmAcct;
	private String rqmSub;
	private String rqmCc;
	private String rqmProject;
	private Boolean rqmFixPr;
	private String rqmCurr;
	private Double rqmExRate;
	private Date rqmEntDate;
	private String rqmSite;
	private String rqmLang;
	private Double rqmDiscPct;
	private String rqmBill;
	private String rqmContact;
	private Boolean rqmLnFmt;
	private String rqmType;
	private String rqmPrList;
	private Double rqmEntEx;
	private Boolean rqmRtdtoPurch;
	private Boolean rqmPartial;
	private String rqmBuyer;
	private String rqmJob;
	private String rqmCategory;
	private Boolean rqmFixRate;
	private String rqmRmks;
	private Boolean rqmDirect;
	private Integer rqmAprCmtindx;
	private String rqmRttoUserid;
	private String rqmPrevUserid;
	private String rqmFob;
	private String rqmShipvia;
	private String rqmEmailOpt;
	private String rqmEntity;
	private String rqmPentUserid;
	private Double rqmTotal;
	private Double rqmMaxTotal;
	private String rqmPrList2;
	private Date rqmRttoDate;
	private Integer rqmRttoTime;
	private Boolean rqmOpen;
	private Boolean rqmPrevRtp;
	private Date rqmClsDate;
	private String rqmChr01;
	private String rqmChr02;
	private String rqmChr03;
	private String rqmChr04;
	private Boolean rqmLog01;
	private Double rqmDec01;
	private String rqmQadc01;
	private String rqmQadc02;
	private String rqmQadc03;
	private String rqmQadc04;
	private String rqmAprvStat;
	private Double rqmExRate2;
	private String rqmExRatetype;
	private Integer rqmExruSeq;
	private Double oidRqmMstr;

	// Constructors

	/** default constructor */
	public AbstractRqmMstr() {
	}

	/** minimal constructor */
	public AbstractRqmMstr(RqmMstrId id, String rqmEndUserid,
			Double rqmExRate2, String rqmExRatetype, Integer rqmExruSeq,
			Double oidRqmMstr) {
		this.id = id;
		this.rqmEndUserid = rqmEndUserid;
		this.rqmExRate2 = rqmExRate2;
		this.rqmExRatetype = rqmExRatetype;
		this.rqmExruSeq = rqmExruSeq;
		this.oidRqmMstr = oidRqmMstr;
	}

	/** full constructor */
	public AbstractRqmMstr(RqmMstrId id, Date rqmReqDate, String rqmRqbyUserid,
			String rqmEndUserid, String rqmShip, Integer rqmCmtindx,
			String rqmReason, String rqmEbyUserid, String rqmStatus,
			Boolean rqmPrint, Date rqmDueDate, Date rqmNeedDate,
			String rqmVend, String rqmAcct, String rqmSub, String rqmCc,
			String rqmProject, Boolean rqmFixPr, String rqmCurr,
			Double rqmExRate, Date rqmEntDate, String rqmSite, String rqmLang,
			Double rqmDiscPct, String rqmBill, String rqmContact,
			Boolean rqmLnFmt, String rqmType, String rqmPrList,
			Double rqmEntEx, Boolean rqmRtdtoPurch, Boolean rqmPartial,
			String rqmBuyer, String rqmJob, String rqmCategory,
			Boolean rqmFixRate, String rqmRmks, Boolean rqmDirect,
			Integer rqmAprCmtindx, String rqmRttoUserid, String rqmPrevUserid,
			String rqmFob, String rqmShipvia, String rqmEmailOpt,
			String rqmEntity, String rqmPentUserid, Double rqmTotal,
			Double rqmMaxTotal, String rqmPrList2, Date rqmRttoDate,
			Integer rqmRttoTime, Boolean rqmOpen, Boolean rqmPrevRtp,
			Date rqmClsDate, String rqmChr01, String rqmChr02, String rqmChr03,
			String rqmChr04, Boolean rqmLog01, Double rqmDec01,
			String rqmQadc01, String rqmQadc02, String rqmQadc03,
			String rqmQadc04, String rqmAprvStat, Double rqmExRate2,
			String rqmExRatetype, Integer rqmExruSeq, Double oidRqmMstr) {
		this.id = id;
		this.rqmReqDate = rqmReqDate;
		this.rqmRqbyUserid = rqmRqbyUserid;
		this.rqmEndUserid = rqmEndUserid;
		this.rqmShip = rqmShip;
		this.rqmCmtindx = rqmCmtindx;
		this.rqmReason = rqmReason;
		this.rqmEbyUserid = rqmEbyUserid;
		this.rqmStatus = rqmStatus;
		this.rqmPrint = rqmPrint;
		this.rqmDueDate = rqmDueDate;
		this.rqmNeedDate = rqmNeedDate;
		this.rqmVend = rqmVend;
		this.rqmAcct = rqmAcct;
		this.rqmSub = rqmSub;
		this.rqmCc = rqmCc;
		this.rqmProject = rqmProject;
		this.rqmFixPr = rqmFixPr;
		this.rqmCurr = rqmCurr;
		this.rqmExRate = rqmExRate;
		this.rqmEntDate = rqmEntDate;
		this.rqmSite = rqmSite;
		this.rqmLang = rqmLang;
		this.rqmDiscPct = rqmDiscPct;
		this.rqmBill = rqmBill;
		this.rqmContact = rqmContact;
		this.rqmLnFmt = rqmLnFmt;
		this.rqmType = rqmType;
		this.rqmPrList = rqmPrList;
		this.rqmEntEx = rqmEntEx;
		this.rqmRtdtoPurch = rqmRtdtoPurch;
		this.rqmPartial = rqmPartial;
		this.rqmBuyer = rqmBuyer;
		this.rqmJob = rqmJob;
		this.rqmCategory = rqmCategory;
		this.rqmFixRate = rqmFixRate;
		this.rqmRmks = rqmRmks;
		this.rqmDirect = rqmDirect;
		this.rqmAprCmtindx = rqmAprCmtindx;
		this.rqmRttoUserid = rqmRttoUserid;
		this.rqmPrevUserid = rqmPrevUserid;
		this.rqmFob = rqmFob;
		this.rqmShipvia = rqmShipvia;
		this.rqmEmailOpt = rqmEmailOpt;
		this.rqmEntity = rqmEntity;
		this.rqmPentUserid = rqmPentUserid;
		this.rqmTotal = rqmTotal;
		this.rqmMaxTotal = rqmMaxTotal;
		this.rqmPrList2 = rqmPrList2;
		this.rqmRttoDate = rqmRttoDate;
		this.rqmRttoTime = rqmRttoTime;
		this.rqmOpen = rqmOpen;
		this.rqmPrevRtp = rqmPrevRtp;
		this.rqmClsDate = rqmClsDate;
		this.rqmChr01 = rqmChr01;
		this.rqmChr02 = rqmChr02;
		this.rqmChr03 = rqmChr03;
		this.rqmChr04 = rqmChr04;
		this.rqmLog01 = rqmLog01;
		this.rqmDec01 = rqmDec01;
		this.rqmQadc01 = rqmQadc01;
		this.rqmQadc02 = rqmQadc02;
		this.rqmQadc03 = rqmQadc03;
		this.rqmQadc04 = rqmQadc04;
		this.rqmAprvStat = rqmAprvStat;
		this.rqmExRate2 = rqmExRate2;
		this.rqmExRatetype = rqmExRatetype;
		this.rqmExruSeq = rqmExruSeq;
		this.oidRqmMstr = oidRqmMstr;
	}

	// Property accessors

	public RqmMstrId getId() {
		return this.id;
	}

	public void setId(RqmMstrId id) {
		this.id = id;
	}

	public Date getRqmReqDate() {
		return this.rqmReqDate;
	}

	public void setRqmReqDate(Date rqmReqDate) {
		this.rqmReqDate = rqmReqDate;
	}

	public String getRqmRqbyUserid() {
		return this.rqmRqbyUserid;
	}

	public void setRqmRqbyUserid(String rqmRqbyUserid) {
		this.rqmRqbyUserid = rqmRqbyUserid;
	}

	public String getRqmEndUserid() {
		return this.rqmEndUserid;
	}

	public void setRqmEndUserid(String rqmEndUserid) {
		this.rqmEndUserid = rqmEndUserid;
	}

	public String getRqmShip() {
		return this.rqmShip;
	}

	public void setRqmShip(String rqmShip) {
		this.rqmShip = rqmShip;
	}

	public Integer getRqmCmtindx() {
		return this.rqmCmtindx;
	}

	public void setRqmCmtindx(Integer rqmCmtindx) {
		this.rqmCmtindx = rqmCmtindx;
	}

	public String getRqmReason() {
		return this.rqmReason;
	}

	public void setRqmReason(String rqmReason) {
		this.rqmReason = rqmReason;
	}

	public String getRqmEbyUserid() {
		return this.rqmEbyUserid;
	}

	public void setRqmEbyUserid(String rqmEbyUserid) {
		this.rqmEbyUserid = rqmEbyUserid;
	}

	public String getRqmStatus() {
		return this.rqmStatus;
	}

	public void setRqmStatus(String rqmStatus) {
		this.rqmStatus = rqmStatus;
	}

	public Boolean getRqmPrint() {
		return this.rqmPrint;
	}

	public void setRqmPrint(Boolean rqmPrint) {
		this.rqmPrint = rqmPrint;
	}

	public Date getRqmDueDate() {
		return this.rqmDueDate;
	}

	public void setRqmDueDate(Date rqmDueDate) {
		this.rqmDueDate = rqmDueDate;
	}

	public Date getRqmNeedDate() {
		return this.rqmNeedDate;
	}

	public void setRqmNeedDate(Date rqmNeedDate) {
		this.rqmNeedDate = rqmNeedDate;
	}

	public String getRqmVend() {
		return this.rqmVend;
	}

	public void setRqmVend(String rqmVend) {
		this.rqmVend = rqmVend;
	}

	public String getRqmAcct() {
		return this.rqmAcct;
	}

	public void setRqmAcct(String rqmAcct) {
		this.rqmAcct = rqmAcct;
	}

	public String getRqmSub() {
		return this.rqmSub;
	}

	public void setRqmSub(String rqmSub) {
		this.rqmSub = rqmSub;
	}

	public String getRqmCc() {
		return this.rqmCc;
	}

	public void setRqmCc(String rqmCc) {
		this.rqmCc = rqmCc;
	}

	public String getRqmProject() {
		return this.rqmProject;
	}

	public void setRqmProject(String rqmProject) {
		this.rqmProject = rqmProject;
	}

	public Boolean getRqmFixPr() {
		return this.rqmFixPr;
	}

	public void setRqmFixPr(Boolean rqmFixPr) {
		this.rqmFixPr = rqmFixPr;
	}

	public String getRqmCurr() {
		return this.rqmCurr;
	}

	public void setRqmCurr(String rqmCurr) {
		this.rqmCurr = rqmCurr;
	}

	public Double getRqmExRate() {
		return this.rqmExRate;
	}

	public void setRqmExRate(Double rqmExRate) {
		this.rqmExRate = rqmExRate;
	}

	public Date getRqmEntDate() {
		return this.rqmEntDate;
	}

	public void setRqmEntDate(Date rqmEntDate) {
		this.rqmEntDate = rqmEntDate;
	}

	public String getRqmSite() {
		return this.rqmSite;
	}

	public void setRqmSite(String rqmSite) {
		this.rqmSite = rqmSite;
	}

	public String getRqmLang() {
		return this.rqmLang;
	}

	public void setRqmLang(String rqmLang) {
		this.rqmLang = rqmLang;
	}

	public Double getRqmDiscPct() {
		return this.rqmDiscPct;
	}

	public void setRqmDiscPct(Double rqmDiscPct) {
		this.rqmDiscPct = rqmDiscPct;
	}

	public String getRqmBill() {
		return this.rqmBill;
	}

	public void setRqmBill(String rqmBill) {
		this.rqmBill = rqmBill;
	}

	public String getRqmContact() {
		return this.rqmContact;
	}

	public void setRqmContact(String rqmContact) {
		this.rqmContact = rqmContact;
	}

	public Boolean getRqmLnFmt() {
		return this.rqmLnFmt;
	}

	public void setRqmLnFmt(Boolean rqmLnFmt) {
		this.rqmLnFmt = rqmLnFmt;
	}

	public String getRqmType() {
		return this.rqmType;
	}

	public void setRqmType(String rqmType) {
		this.rqmType = rqmType;
	}

	public String getRqmPrList() {
		return this.rqmPrList;
	}

	public void setRqmPrList(String rqmPrList) {
		this.rqmPrList = rqmPrList;
	}

	public Double getRqmEntEx() {
		return this.rqmEntEx;
	}

	public void setRqmEntEx(Double rqmEntEx) {
		this.rqmEntEx = rqmEntEx;
	}

	public Boolean getRqmRtdtoPurch() {
		return this.rqmRtdtoPurch;
	}

	public void setRqmRtdtoPurch(Boolean rqmRtdtoPurch) {
		this.rqmRtdtoPurch = rqmRtdtoPurch;
	}

	public Boolean getRqmPartial() {
		return this.rqmPartial;
	}

	public void setRqmPartial(Boolean rqmPartial) {
		this.rqmPartial = rqmPartial;
	}

	public String getRqmBuyer() {
		return this.rqmBuyer;
	}

	public void setRqmBuyer(String rqmBuyer) {
		this.rqmBuyer = rqmBuyer;
	}

	public String getRqmJob() {
		return this.rqmJob;
	}

	public void setRqmJob(String rqmJob) {
		this.rqmJob = rqmJob;
	}

	public String getRqmCategory() {
		return this.rqmCategory;
	}

	public void setRqmCategory(String rqmCategory) {
		this.rqmCategory = rqmCategory;
	}

	public Boolean getRqmFixRate() {
		return this.rqmFixRate;
	}

	public void setRqmFixRate(Boolean rqmFixRate) {
		this.rqmFixRate = rqmFixRate;
	}

	public String getRqmRmks() {
		return this.rqmRmks;
	}

	public void setRqmRmks(String rqmRmks) {
		this.rqmRmks = rqmRmks;
	}

	public Boolean getRqmDirect() {
		return this.rqmDirect;
	}

	public void setRqmDirect(Boolean rqmDirect) {
		this.rqmDirect = rqmDirect;
	}

	public Integer getRqmAprCmtindx() {
		return this.rqmAprCmtindx;
	}

	public void setRqmAprCmtindx(Integer rqmAprCmtindx) {
		this.rqmAprCmtindx = rqmAprCmtindx;
	}

	public String getRqmRttoUserid() {
		return this.rqmRttoUserid;
	}

	public void setRqmRttoUserid(String rqmRttoUserid) {
		this.rqmRttoUserid = rqmRttoUserid;
	}

	public String getRqmPrevUserid() {
		return this.rqmPrevUserid;
	}

	public void setRqmPrevUserid(String rqmPrevUserid) {
		this.rqmPrevUserid = rqmPrevUserid;
	}

	public String getRqmFob() {
		return this.rqmFob;
	}

	public void setRqmFob(String rqmFob) {
		this.rqmFob = rqmFob;
	}

	public String getRqmShipvia() {
		return this.rqmShipvia;
	}

	public void setRqmShipvia(String rqmShipvia) {
		this.rqmShipvia = rqmShipvia;
	}

	public String getRqmEmailOpt() {
		return this.rqmEmailOpt;
	}

	public void setRqmEmailOpt(String rqmEmailOpt) {
		this.rqmEmailOpt = rqmEmailOpt;
	}

	public String getRqmEntity() {
		return this.rqmEntity;
	}

	public void setRqmEntity(String rqmEntity) {
		this.rqmEntity = rqmEntity;
	}

	public String getRqmPentUserid() {
		return this.rqmPentUserid;
	}

	public void setRqmPentUserid(String rqmPentUserid) {
		this.rqmPentUserid = rqmPentUserid;
	}

	public Double getRqmTotal() {
		return this.rqmTotal;
	}

	public void setRqmTotal(Double rqmTotal) {
		this.rqmTotal = rqmTotal;
	}

	public Double getRqmMaxTotal() {
		return this.rqmMaxTotal;
	}

	public void setRqmMaxTotal(Double rqmMaxTotal) {
		this.rqmMaxTotal = rqmMaxTotal;
	}

	public String getRqmPrList2() {
		return this.rqmPrList2;
	}

	public void setRqmPrList2(String rqmPrList2) {
		this.rqmPrList2 = rqmPrList2;
	}

	public Date getRqmRttoDate() {
		return this.rqmRttoDate;
	}

	public void setRqmRttoDate(Date rqmRttoDate) {
		this.rqmRttoDate = rqmRttoDate;
	}

	public Integer getRqmRttoTime() {
		return this.rqmRttoTime;
	}

	public void setRqmRttoTime(Integer rqmRttoTime) {
		this.rqmRttoTime = rqmRttoTime;
	}

	public Boolean getRqmOpen() {
		return this.rqmOpen;
	}

	public void setRqmOpen(Boolean rqmOpen) {
		this.rqmOpen = rqmOpen;
	}

	public Boolean getRqmPrevRtp() {
		return this.rqmPrevRtp;
	}

	public void setRqmPrevRtp(Boolean rqmPrevRtp) {
		this.rqmPrevRtp = rqmPrevRtp;
	}

	public Date getRqmClsDate() {
		return this.rqmClsDate;
	}

	public void setRqmClsDate(Date rqmClsDate) {
		this.rqmClsDate = rqmClsDate;
	}

	public String getRqmChr01() {
		return this.rqmChr01;
	}

	public void setRqmChr01(String rqmChr01) {
		this.rqmChr01 = rqmChr01;
	}

	public String getRqmChr02() {
		return this.rqmChr02;
	}

	public void setRqmChr02(String rqmChr02) {
		this.rqmChr02 = rqmChr02;
	}

	public String getRqmChr03() {
		return this.rqmChr03;
	}

	public void setRqmChr03(String rqmChr03) {
		this.rqmChr03 = rqmChr03;
	}

	public String getRqmChr04() {
		return this.rqmChr04;
	}

	public void setRqmChr04(String rqmChr04) {
		this.rqmChr04 = rqmChr04;
	}

	public Boolean getRqmLog01() {
		return this.rqmLog01;
	}

	public void setRqmLog01(Boolean rqmLog01) {
		this.rqmLog01 = rqmLog01;
	}

	public Double getRqmDec01() {
		return this.rqmDec01;
	}

	public void setRqmDec01(Double rqmDec01) {
		this.rqmDec01 = rqmDec01;
	}

	public String getRqmQadc01() {
		return this.rqmQadc01;
	}

	public void setRqmQadc01(String rqmQadc01) {
		this.rqmQadc01 = rqmQadc01;
	}

	public String getRqmQadc02() {
		return this.rqmQadc02;
	}

	public void setRqmQadc02(String rqmQadc02) {
		this.rqmQadc02 = rqmQadc02;
	}

	public String getRqmQadc03() {
		return this.rqmQadc03;
	}

	public void setRqmQadc03(String rqmQadc03) {
		this.rqmQadc03 = rqmQadc03;
	}

	public String getRqmQadc04() {
		return this.rqmQadc04;
	}

	public void setRqmQadc04(String rqmQadc04) {
		this.rqmQadc04 = rqmQadc04;
	}

	public String getRqmAprvStat() {
		return this.rqmAprvStat;
	}

	public void setRqmAprvStat(String rqmAprvStat) {
		this.rqmAprvStat = rqmAprvStat;
	}

	public Double getRqmExRate2() {
		return this.rqmExRate2;
	}

	public void setRqmExRate2(Double rqmExRate2) {
		this.rqmExRate2 = rqmExRate2;
	}

	public String getRqmExRatetype() {
		return this.rqmExRatetype;
	}

	public void setRqmExRatetype(String rqmExRatetype) {
		this.rqmExRatetype = rqmExRatetype;
	}

	public Integer getRqmExruSeq() {
		return this.rqmExruSeq;
	}

	public void setRqmExruSeq(Integer rqmExruSeq) {
		this.rqmExruSeq = rqmExruSeq;
	}

	public Double getOidRqmMstr() {
		return this.oidRqmMstr;
	}

	public void setOidRqmMstr(Double oidRqmMstr) {
		this.oidRqmMstr = oidRqmMstr;
	}

}