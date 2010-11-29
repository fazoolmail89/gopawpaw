package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGltrHist entity provides the base persistence definition of the
 * GltrHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltrHist implements java.io.Serializable {

	// Fields

	private GltrHistId id;
	private String gltrAcc;
	private String gltrCtr;
	private String gltrTrType;
	private Date gltrEntDt;
	private Date gltrEffDt;
	private Double gltrAmt;
	private String gltrDesc;
	private Boolean gltrUnb;
	private String gltrUser;
	private String gltrProject;
	private String gltrError;
	private String gltrBatch;
	private String gltrCurr;
	private Double gltrCurramt;
	private String gltrEntity;
	private Double gltrExRate;
	private Boolean gltrExport;
	private String gltrAddr;
	private String gltrDoc;
	private String gltrDocTyp;
	private String gltrUser1;
	private String gltrUser2;
	private String gltrFxInd;
	private String gltrSub;
	private Double gltrEcurAmt;
	private Double gltrEnExrate;
	private String gltrQadc01;
	private Boolean gltrCorrection;
	private String gltrDyCode;
	private String gltrDyNum;
	private Double gltrExRate2;
	private String gltrExRatetype;
	private Double gltrEnExrate2;
	private Integer gltrExruSeq;
	private Integer gltrEnExruSeq;
	private String gltrSrcDesc;
	private Double oidGltrHist;

	// Constructors

	/** default constructor */
	public AbstractGltrHist() {
	}

	/** minimal constructor */
	public AbstractGltrHist(GltrHistId id, Boolean gltrCorrection,
			String gltrDyCode, String gltrDyNum, Double gltrExRate2,
			String gltrExRatetype, Double gltrEnExrate2, Integer gltrExruSeq,
			Integer gltrEnExruSeq, String gltrSrcDesc, Double oidGltrHist) {
		this.id = id;
		this.gltrCorrection = gltrCorrection;
		this.gltrDyCode = gltrDyCode;
		this.gltrDyNum = gltrDyNum;
		this.gltrExRate2 = gltrExRate2;
		this.gltrExRatetype = gltrExRatetype;
		this.gltrEnExrate2 = gltrEnExrate2;
		this.gltrExruSeq = gltrExruSeq;
		this.gltrEnExruSeq = gltrEnExruSeq;
		this.gltrSrcDesc = gltrSrcDesc;
		this.oidGltrHist = oidGltrHist;
	}

	/** full constructor */
	public AbstractGltrHist(GltrHistId id, String gltrAcc, String gltrCtr,
			String gltrTrType, Date gltrEntDt, Date gltrEffDt, Double gltrAmt,
			String gltrDesc, Boolean gltrUnb, String gltrUser,
			String gltrProject, String gltrError, String gltrBatch,
			String gltrCurr, Double gltrCurramt, String gltrEntity,
			Double gltrExRate, Boolean gltrExport, String gltrAddr,
			String gltrDoc, String gltrDocTyp, String gltrUser1,
			String gltrUser2, String gltrFxInd, String gltrSub,
			Double gltrEcurAmt, Double gltrEnExrate, String gltrQadc01,
			Boolean gltrCorrection, String gltrDyCode, String gltrDyNum,
			Double gltrExRate2, String gltrExRatetype, Double gltrEnExrate2,
			Integer gltrExruSeq, Integer gltrEnExruSeq, String gltrSrcDesc,
			Double oidGltrHist) {
		this.id = id;
		this.gltrAcc = gltrAcc;
		this.gltrCtr = gltrCtr;
		this.gltrTrType = gltrTrType;
		this.gltrEntDt = gltrEntDt;
		this.gltrEffDt = gltrEffDt;
		this.gltrAmt = gltrAmt;
		this.gltrDesc = gltrDesc;
		this.gltrUnb = gltrUnb;
		this.gltrUser = gltrUser;
		this.gltrProject = gltrProject;
		this.gltrError = gltrError;
		this.gltrBatch = gltrBatch;
		this.gltrCurr = gltrCurr;
		this.gltrCurramt = gltrCurramt;
		this.gltrEntity = gltrEntity;
		this.gltrExRate = gltrExRate;
		this.gltrExport = gltrExport;
		this.gltrAddr = gltrAddr;
		this.gltrDoc = gltrDoc;
		this.gltrDocTyp = gltrDocTyp;
		this.gltrUser1 = gltrUser1;
		this.gltrUser2 = gltrUser2;
		this.gltrFxInd = gltrFxInd;
		this.gltrSub = gltrSub;
		this.gltrEcurAmt = gltrEcurAmt;
		this.gltrEnExrate = gltrEnExrate;
		this.gltrQadc01 = gltrQadc01;
		this.gltrCorrection = gltrCorrection;
		this.gltrDyCode = gltrDyCode;
		this.gltrDyNum = gltrDyNum;
		this.gltrExRate2 = gltrExRate2;
		this.gltrExRatetype = gltrExRatetype;
		this.gltrEnExrate2 = gltrEnExrate2;
		this.gltrExruSeq = gltrExruSeq;
		this.gltrEnExruSeq = gltrEnExruSeq;
		this.gltrSrcDesc = gltrSrcDesc;
		this.oidGltrHist = oidGltrHist;
	}

	// Property accessors

	public GltrHistId getId() {
		return this.id;
	}

	public void setId(GltrHistId id) {
		this.id = id;
	}

	public String getGltrAcc() {
		return this.gltrAcc;
	}

	public void setGltrAcc(String gltrAcc) {
		this.gltrAcc = gltrAcc;
	}

	public String getGltrCtr() {
		return this.gltrCtr;
	}

	public void setGltrCtr(String gltrCtr) {
		this.gltrCtr = gltrCtr;
	}

	public String getGltrTrType() {
		return this.gltrTrType;
	}

	public void setGltrTrType(String gltrTrType) {
		this.gltrTrType = gltrTrType;
	}

	public Date getGltrEntDt() {
		return this.gltrEntDt;
	}

	public void setGltrEntDt(Date gltrEntDt) {
		this.gltrEntDt = gltrEntDt;
	}

	public Date getGltrEffDt() {
		return this.gltrEffDt;
	}

	public void setGltrEffDt(Date gltrEffDt) {
		this.gltrEffDt = gltrEffDt;
	}

	public Double getGltrAmt() {
		return this.gltrAmt;
	}

	public void setGltrAmt(Double gltrAmt) {
		this.gltrAmt = gltrAmt;
	}

	public String getGltrDesc() {
		return this.gltrDesc;
	}

	public void setGltrDesc(String gltrDesc) {
		this.gltrDesc = gltrDesc;
	}

	public Boolean getGltrUnb() {
		return this.gltrUnb;
	}

	public void setGltrUnb(Boolean gltrUnb) {
		this.gltrUnb = gltrUnb;
	}

	public String getGltrUser() {
		return this.gltrUser;
	}

	public void setGltrUser(String gltrUser) {
		this.gltrUser = gltrUser;
	}

	public String getGltrProject() {
		return this.gltrProject;
	}

	public void setGltrProject(String gltrProject) {
		this.gltrProject = gltrProject;
	}

	public String getGltrError() {
		return this.gltrError;
	}

	public void setGltrError(String gltrError) {
		this.gltrError = gltrError;
	}

	public String getGltrBatch() {
		return this.gltrBatch;
	}

	public void setGltrBatch(String gltrBatch) {
		this.gltrBatch = gltrBatch;
	}

	public String getGltrCurr() {
		return this.gltrCurr;
	}

	public void setGltrCurr(String gltrCurr) {
		this.gltrCurr = gltrCurr;
	}

	public Double getGltrCurramt() {
		return this.gltrCurramt;
	}

	public void setGltrCurramt(Double gltrCurramt) {
		this.gltrCurramt = gltrCurramt;
	}

	public String getGltrEntity() {
		return this.gltrEntity;
	}

	public void setGltrEntity(String gltrEntity) {
		this.gltrEntity = gltrEntity;
	}

	public Double getGltrExRate() {
		return this.gltrExRate;
	}

	public void setGltrExRate(Double gltrExRate) {
		this.gltrExRate = gltrExRate;
	}

	public Boolean getGltrExport() {
		return this.gltrExport;
	}

	public void setGltrExport(Boolean gltrExport) {
		this.gltrExport = gltrExport;
	}

	public String getGltrAddr() {
		return this.gltrAddr;
	}

	public void setGltrAddr(String gltrAddr) {
		this.gltrAddr = gltrAddr;
	}

	public String getGltrDoc() {
		return this.gltrDoc;
	}

	public void setGltrDoc(String gltrDoc) {
		this.gltrDoc = gltrDoc;
	}

	public String getGltrDocTyp() {
		return this.gltrDocTyp;
	}

	public void setGltrDocTyp(String gltrDocTyp) {
		this.gltrDocTyp = gltrDocTyp;
	}

	public String getGltrUser1() {
		return this.gltrUser1;
	}

	public void setGltrUser1(String gltrUser1) {
		this.gltrUser1 = gltrUser1;
	}

	public String getGltrUser2() {
		return this.gltrUser2;
	}

	public void setGltrUser2(String gltrUser2) {
		this.gltrUser2 = gltrUser2;
	}

	public String getGltrFxInd() {
		return this.gltrFxInd;
	}

	public void setGltrFxInd(String gltrFxInd) {
		this.gltrFxInd = gltrFxInd;
	}

	public String getGltrSub() {
		return this.gltrSub;
	}

	public void setGltrSub(String gltrSub) {
		this.gltrSub = gltrSub;
	}

	public Double getGltrEcurAmt() {
		return this.gltrEcurAmt;
	}

	public void setGltrEcurAmt(Double gltrEcurAmt) {
		this.gltrEcurAmt = gltrEcurAmt;
	}

	public Double getGltrEnExrate() {
		return this.gltrEnExrate;
	}

	public void setGltrEnExrate(Double gltrEnExrate) {
		this.gltrEnExrate = gltrEnExrate;
	}

	public String getGltrQadc01() {
		return this.gltrQadc01;
	}

	public void setGltrQadc01(String gltrQadc01) {
		this.gltrQadc01 = gltrQadc01;
	}

	public Boolean getGltrCorrection() {
		return this.gltrCorrection;
	}

	public void setGltrCorrection(Boolean gltrCorrection) {
		this.gltrCorrection = gltrCorrection;
	}

	public String getGltrDyCode() {
		return this.gltrDyCode;
	}

	public void setGltrDyCode(String gltrDyCode) {
		this.gltrDyCode = gltrDyCode;
	}

	public String getGltrDyNum() {
		return this.gltrDyNum;
	}

	public void setGltrDyNum(String gltrDyNum) {
		this.gltrDyNum = gltrDyNum;
	}

	public Double getGltrExRate2() {
		return this.gltrExRate2;
	}

	public void setGltrExRate2(Double gltrExRate2) {
		this.gltrExRate2 = gltrExRate2;
	}

	public String getGltrExRatetype() {
		return this.gltrExRatetype;
	}

	public void setGltrExRatetype(String gltrExRatetype) {
		this.gltrExRatetype = gltrExRatetype;
	}

	public Double getGltrEnExrate2() {
		return this.gltrEnExrate2;
	}

	public void setGltrEnExrate2(Double gltrEnExrate2) {
		this.gltrEnExrate2 = gltrEnExrate2;
	}

	public Integer getGltrExruSeq() {
		return this.gltrExruSeq;
	}

	public void setGltrExruSeq(Integer gltrExruSeq) {
		this.gltrExruSeq = gltrExruSeq;
	}

	public Integer getGltrEnExruSeq() {
		return this.gltrEnExruSeq;
	}

	public void setGltrEnExruSeq(Integer gltrEnExruSeq) {
		this.gltrEnExruSeq = gltrEnExruSeq;
	}

	public String getGltrSrcDesc() {
		return this.gltrSrcDesc;
	}

	public void setGltrSrcDesc(String gltrSrcDesc) {
		this.gltrSrcDesc = gltrSrcDesc;
	}

	public Double getOidGltrHist() {
		return this.oidGltrHist;
	}

	public void setOidGltrHist(Double oidGltrHist) {
		this.oidGltrHist = oidGltrHist;
	}

}