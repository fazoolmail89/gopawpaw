package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGltDet entity provides the base persistence definition of the GltDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltDet implements java.io.Serializable {

	// Fields

	private GltDetId id;
	private String gltEntity;
	private String gltAcct;
	private String gltCc;
	private String gltDesc;
	private Date gltDate;
	private Date gltEffdate;
	private Double gltAmt;
	private String gltUserid;
	private String gltProject;
	private String gltBatch;
	private String gltCurr;
	private Double gltCurrAmt;
	private Boolean gltUnb;
	private String gltTrType;
	private String gltError;
	private Double gltExRate;
	private String gltAddr;
	private String gltDoc;
	private String gltDocType;
	private String gltUser1;
	private String gltUser2;
	private String gltFxInd;
	private String gltSub;
	private Double gltEcurAmt;
	private Double gltEnExrate;
	private Double gltEntrExrate;
	private Integer gltPer;
	private Integer gltYear;
	private String gltQadc01;
	private Boolean gltCorrection;
	private String gltDyCode;
	private String gltDyNum;
	private Double gltExRate2;
	private String gltExRatetype;
	private Double gltEnExrate2;
	private Integer gltExruSeq;
	private Integer gltEnExruSeq;
	private String gltSrcDesc;
	private Double oidGltDet;

	// Constructors

	/** default constructor */
	public AbstractGltDet() {
	}

	/** minimal constructor */
	public AbstractGltDet(GltDetId id, Double gltEntrExrate, Integer gltPer,
			Integer gltYear, Boolean gltCorrection, String gltDyCode,
			String gltDyNum, Double gltExRate2, String gltExRatetype,
			Double gltEnExrate2, Integer gltExruSeq, Integer gltEnExruSeq,
			String gltSrcDesc, Double oidGltDet) {
		this.id = id;
		this.gltEntrExrate = gltEntrExrate;
		this.gltPer = gltPer;
		this.gltYear = gltYear;
		this.gltCorrection = gltCorrection;
		this.gltDyCode = gltDyCode;
		this.gltDyNum = gltDyNum;
		this.gltExRate2 = gltExRate2;
		this.gltExRatetype = gltExRatetype;
		this.gltEnExrate2 = gltEnExrate2;
		this.gltExruSeq = gltExruSeq;
		this.gltEnExruSeq = gltEnExruSeq;
		this.gltSrcDesc = gltSrcDesc;
		this.oidGltDet = oidGltDet;
	}

	/** full constructor */
	public AbstractGltDet(GltDetId id, String gltEntity, String gltAcct,
			String gltCc, String gltDesc, Date gltDate, Date gltEffdate,
			Double gltAmt, String gltUserid, String gltProject,
			String gltBatch, String gltCurr, Double gltCurrAmt, Boolean gltUnb,
			String gltTrType, String gltError, Double gltExRate,
			String gltAddr, String gltDoc, String gltDocType, String gltUser1,
			String gltUser2, String gltFxInd, String gltSub, Double gltEcurAmt,
			Double gltEnExrate, Double gltEntrExrate, Integer gltPer,
			Integer gltYear, String gltQadc01, Boolean gltCorrection,
			String gltDyCode, String gltDyNum, Double gltExRate2,
			String gltExRatetype, Double gltEnExrate2, Integer gltExruSeq,
			Integer gltEnExruSeq, String gltSrcDesc, Double oidGltDet) {
		this.id = id;
		this.gltEntity = gltEntity;
		this.gltAcct = gltAcct;
		this.gltCc = gltCc;
		this.gltDesc = gltDesc;
		this.gltDate = gltDate;
		this.gltEffdate = gltEffdate;
		this.gltAmt = gltAmt;
		this.gltUserid = gltUserid;
		this.gltProject = gltProject;
		this.gltBatch = gltBatch;
		this.gltCurr = gltCurr;
		this.gltCurrAmt = gltCurrAmt;
		this.gltUnb = gltUnb;
		this.gltTrType = gltTrType;
		this.gltError = gltError;
		this.gltExRate = gltExRate;
		this.gltAddr = gltAddr;
		this.gltDoc = gltDoc;
		this.gltDocType = gltDocType;
		this.gltUser1 = gltUser1;
		this.gltUser2 = gltUser2;
		this.gltFxInd = gltFxInd;
		this.gltSub = gltSub;
		this.gltEcurAmt = gltEcurAmt;
		this.gltEnExrate = gltEnExrate;
		this.gltEntrExrate = gltEntrExrate;
		this.gltPer = gltPer;
		this.gltYear = gltYear;
		this.gltQadc01 = gltQadc01;
		this.gltCorrection = gltCorrection;
		this.gltDyCode = gltDyCode;
		this.gltDyNum = gltDyNum;
		this.gltExRate2 = gltExRate2;
		this.gltExRatetype = gltExRatetype;
		this.gltEnExrate2 = gltEnExrate2;
		this.gltExruSeq = gltExruSeq;
		this.gltEnExruSeq = gltEnExruSeq;
		this.gltSrcDesc = gltSrcDesc;
		this.oidGltDet = oidGltDet;
	}

	// Property accessors

	public GltDetId getId() {
		return this.id;
	}

	public void setId(GltDetId id) {
		this.id = id;
	}

	public String getGltEntity() {
		return this.gltEntity;
	}

	public void setGltEntity(String gltEntity) {
		this.gltEntity = gltEntity;
	}

	public String getGltAcct() {
		return this.gltAcct;
	}

	public void setGltAcct(String gltAcct) {
		this.gltAcct = gltAcct;
	}

	public String getGltCc() {
		return this.gltCc;
	}

	public void setGltCc(String gltCc) {
		this.gltCc = gltCc;
	}

	public String getGltDesc() {
		return this.gltDesc;
	}

	public void setGltDesc(String gltDesc) {
		this.gltDesc = gltDesc;
	}

	public Date getGltDate() {
		return this.gltDate;
	}

	public void setGltDate(Date gltDate) {
		this.gltDate = gltDate;
	}

	public Date getGltEffdate() {
		return this.gltEffdate;
	}

	public void setGltEffdate(Date gltEffdate) {
		this.gltEffdate = gltEffdate;
	}

	public Double getGltAmt() {
		return this.gltAmt;
	}

	public void setGltAmt(Double gltAmt) {
		this.gltAmt = gltAmt;
	}

	public String getGltUserid() {
		return this.gltUserid;
	}

	public void setGltUserid(String gltUserid) {
		this.gltUserid = gltUserid;
	}

	public String getGltProject() {
		return this.gltProject;
	}

	public void setGltProject(String gltProject) {
		this.gltProject = gltProject;
	}

	public String getGltBatch() {
		return this.gltBatch;
	}

	public void setGltBatch(String gltBatch) {
		this.gltBatch = gltBatch;
	}

	public String getGltCurr() {
		return this.gltCurr;
	}

	public void setGltCurr(String gltCurr) {
		this.gltCurr = gltCurr;
	}

	public Double getGltCurrAmt() {
		return this.gltCurrAmt;
	}

	public void setGltCurrAmt(Double gltCurrAmt) {
		this.gltCurrAmt = gltCurrAmt;
	}

	public Boolean getGltUnb() {
		return this.gltUnb;
	}

	public void setGltUnb(Boolean gltUnb) {
		this.gltUnb = gltUnb;
	}

	public String getGltTrType() {
		return this.gltTrType;
	}

	public void setGltTrType(String gltTrType) {
		this.gltTrType = gltTrType;
	}

	public String getGltError() {
		return this.gltError;
	}

	public void setGltError(String gltError) {
		this.gltError = gltError;
	}

	public Double getGltExRate() {
		return this.gltExRate;
	}

	public void setGltExRate(Double gltExRate) {
		this.gltExRate = gltExRate;
	}

	public String getGltAddr() {
		return this.gltAddr;
	}

	public void setGltAddr(String gltAddr) {
		this.gltAddr = gltAddr;
	}

	public String getGltDoc() {
		return this.gltDoc;
	}

	public void setGltDoc(String gltDoc) {
		this.gltDoc = gltDoc;
	}

	public String getGltDocType() {
		return this.gltDocType;
	}

	public void setGltDocType(String gltDocType) {
		this.gltDocType = gltDocType;
	}

	public String getGltUser1() {
		return this.gltUser1;
	}

	public void setGltUser1(String gltUser1) {
		this.gltUser1 = gltUser1;
	}

	public String getGltUser2() {
		return this.gltUser2;
	}

	public void setGltUser2(String gltUser2) {
		this.gltUser2 = gltUser2;
	}

	public String getGltFxInd() {
		return this.gltFxInd;
	}

	public void setGltFxInd(String gltFxInd) {
		this.gltFxInd = gltFxInd;
	}

	public String getGltSub() {
		return this.gltSub;
	}

	public void setGltSub(String gltSub) {
		this.gltSub = gltSub;
	}

	public Double getGltEcurAmt() {
		return this.gltEcurAmt;
	}

	public void setGltEcurAmt(Double gltEcurAmt) {
		this.gltEcurAmt = gltEcurAmt;
	}

	public Double getGltEnExrate() {
		return this.gltEnExrate;
	}

	public void setGltEnExrate(Double gltEnExrate) {
		this.gltEnExrate = gltEnExrate;
	}

	public Double getGltEntrExrate() {
		return this.gltEntrExrate;
	}

	public void setGltEntrExrate(Double gltEntrExrate) {
		this.gltEntrExrate = gltEntrExrate;
	}

	public Integer getGltPer() {
		return this.gltPer;
	}

	public void setGltPer(Integer gltPer) {
		this.gltPer = gltPer;
	}

	public Integer getGltYear() {
		return this.gltYear;
	}

	public void setGltYear(Integer gltYear) {
		this.gltYear = gltYear;
	}

	public String getGltQadc01() {
		return this.gltQadc01;
	}

	public void setGltQadc01(String gltQadc01) {
		this.gltQadc01 = gltQadc01;
	}

	public Boolean getGltCorrection() {
		return this.gltCorrection;
	}

	public void setGltCorrection(Boolean gltCorrection) {
		this.gltCorrection = gltCorrection;
	}

	public String getGltDyCode() {
		return this.gltDyCode;
	}

	public void setGltDyCode(String gltDyCode) {
		this.gltDyCode = gltDyCode;
	}

	public String getGltDyNum() {
		return this.gltDyNum;
	}

	public void setGltDyNum(String gltDyNum) {
		this.gltDyNum = gltDyNum;
	}

	public Double getGltExRate2() {
		return this.gltExRate2;
	}

	public void setGltExRate2(Double gltExRate2) {
		this.gltExRate2 = gltExRate2;
	}

	public String getGltExRatetype() {
		return this.gltExRatetype;
	}

	public void setGltExRatetype(String gltExRatetype) {
		this.gltExRatetype = gltExRatetype;
	}

	public Double getGltEnExrate2() {
		return this.gltEnExrate2;
	}

	public void setGltEnExrate2(Double gltEnExrate2) {
		this.gltEnExrate2 = gltEnExrate2;
	}

	public Integer getGltExruSeq() {
		return this.gltExruSeq;
	}

	public void setGltExruSeq(Integer gltExruSeq) {
		this.gltExruSeq = gltExruSeq;
	}

	public Integer getGltEnExruSeq() {
		return this.gltEnExruSeq;
	}

	public void setGltEnExruSeq(Integer gltEnExruSeq) {
		this.gltEnExruSeq = gltEnExruSeq;
	}

	public String getGltSrcDesc() {
		return this.gltSrcDesc;
	}

	public void setGltSrcDesc(String gltSrcDesc) {
		this.gltSrcDesc = gltSrcDesc;
	}

	public Double getOidGltDet() {
		return this.oidGltDet;
	}

	public void setOidGltDet(Double oidGltDet) {
		this.oidGltDet = oidGltDet;
	}

}