package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * AbstractGltwWkfl entity provides the base persistence definition of the
 * GltwWkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGltwWkfl implements java.io.Serializable {

	// Fields

	private GltwWkflId id;
	private String gltwEntity;
	private String gltwAcct;
	private String gltwCc;
	private String gltwDesc;
	private Date gltwDate;
	private Date gltwEffdate;
	private Double gltwAmt;
	private String gltwUserid;
	private String gltwProject;
	private String gltwBatch;
	private String gltwAddr;
	private String gltwDoc;
	private String gltwDocTyp;
	private String gltwUser1;
	private String gltwUser2;
	private String gltwCurr;
	private Double gltwCurramt;
	private String gltwTrType;
	private Double gltwExRate;
	private String gltwFxInd;
	private String gltwSub;
	private Double gltwEcurAmt;
	private String gltwQadc01;
	private String gltwDyCode;
	private String gltwDyNum;
	private Boolean gltwCorrection;
	private Double gltwExRate2;
	private String gltwExRatetype;
	private Integer gltwExruSeq;
	private Double oidGltwWkfl;

	// Constructors

	/** default constructor */
	public AbstractGltwWkfl() {
	}

	/** minimal constructor */
	public AbstractGltwWkfl(GltwWkflId id, String gltwDyCode, String gltwDyNum,
			Boolean gltwCorrection, Double gltwExRate2, String gltwExRatetype,
			Integer gltwExruSeq, Double oidGltwWkfl) {
		this.id = id;
		this.gltwDyCode = gltwDyCode;
		this.gltwDyNum = gltwDyNum;
		this.gltwCorrection = gltwCorrection;
		this.gltwExRate2 = gltwExRate2;
		this.gltwExRatetype = gltwExRatetype;
		this.gltwExruSeq = gltwExruSeq;
		this.oidGltwWkfl = oidGltwWkfl;
	}

	/** full constructor */
	public AbstractGltwWkfl(GltwWkflId id, String gltwEntity, String gltwAcct,
			String gltwCc, String gltwDesc, Date gltwDate, Date gltwEffdate,
			Double gltwAmt, String gltwUserid, String gltwProject,
			String gltwBatch, String gltwAddr, String gltwDoc,
			String gltwDocTyp, String gltwUser1, String gltwUser2,
			String gltwCurr, Double gltwCurramt, String gltwTrType,
			Double gltwExRate, String gltwFxInd, String gltwSub,
			Double gltwEcurAmt, String gltwQadc01, String gltwDyCode,
			String gltwDyNum, Boolean gltwCorrection, Double gltwExRate2,
			String gltwExRatetype, Integer gltwExruSeq, Double oidGltwWkfl) {
		this.id = id;
		this.gltwEntity = gltwEntity;
		this.gltwAcct = gltwAcct;
		this.gltwCc = gltwCc;
		this.gltwDesc = gltwDesc;
		this.gltwDate = gltwDate;
		this.gltwEffdate = gltwEffdate;
		this.gltwAmt = gltwAmt;
		this.gltwUserid = gltwUserid;
		this.gltwProject = gltwProject;
		this.gltwBatch = gltwBatch;
		this.gltwAddr = gltwAddr;
		this.gltwDoc = gltwDoc;
		this.gltwDocTyp = gltwDocTyp;
		this.gltwUser1 = gltwUser1;
		this.gltwUser2 = gltwUser2;
		this.gltwCurr = gltwCurr;
		this.gltwCurramt = gltwCurramt;
		this.gltwTrType = gltwTrType;
		this.gltwExRate = gltwExRate;
		this.gltwFxInd = gltwFxInd;
		this.gltwSub = gltwSub;
		this.gltwEcurAmt = gltwEcurAmt;
		this.gltwQadc01 = gltwQadc01;
		this.gltwDyCode = gltwDyCode;
		this.gltwDyNum = gltwDyNum;
		this.gltwCorrection = gltwCorrection;
		this.gltwExRate2 = gltwExRate2;
		this.gltwExRatetype = gltwExRatetype;
		this.gltwExruSeq = gltwExruSeq;
		this.oidGltwWkfl = oidGltwWkfl;
	}

	// Property accessors

	public GltwWkflId getId() {
		return this.id;
	}

	public void setId(GltwWkflId id) {
		this.id = id;
	}

	public String getGltwEntity() {
		return this.gltwEntity;
	}

	public void setGltwEntity(String gltwEntity) {
		this.gltwEntity = gltwEntity;
	}

	public String getGltwAcct() {
		return this.gltwAcct;
	}

	public void setGltwAcct(String gltwAcct) {
		this.gltwAcct = gltwAcct;
	}

	public String getGltwCc() {
		return this.gltwCc;
	}

	public void setGltwCc(String gltwCc) {
		this.gltwCc = gltwCc;
	}

	public String getGltwDesc() {
		return this.gltwDesc;
	}

	public void setGltwDesc(String gltwDesc) {
		this.gltwDesc = gltwDesc;
	}

	public Date getGltwDate() {
		return this.gltwDate;
	}

	public void setGltwDate(Date gltwDate) {
		this.gltwDate = gltwDate;
	}

	public Date getGltwEffdate() {
		return this.gltwEffdate;
	}

	public void setGltwEffdate(Date gltwEffdate) {
		this.gltwEffdate = gltwEffdate;
	}

	public Double getGltwAmt() {
		return this.gltwAmt;
	}

	public void setGltwAmt(Double gltwAmt) {
		this.gltwAmt = gltwAmt;
	}

	public String getGltwUserid() {
		return this.gltwUserid;
	}

	public void setGltwUserid(String gltwUserid) {
		this.gltwUserid = gltwUserid;
	}

	public String getGltwProject() {
		return this.gltwProject;
	}

	public void setGltwProject(String gltwProject) {
		this.gltwProject = gltwProject;
	}

	public String getGltwBatch() {
		return this.gltwBatch;
	}

	public void setGltwBatch(String gltwBatch) {
		this.gltwBatch = gltwBatch;
	}

	public String getGltwAddr() {
		return this.gltwAddr;
	}

	public void setGltwAddr(String gltwAddr) {
		this.gltwAddr = gltwAddr;
	}

	public String getGltwDoc() {
		return this.gltwDoc;
	}

	public void setGltwDoc(String gltwDoc) {
		this.gltwDoc = gltwDoc;
	}

	public String getGltwDocTyp() {
		return this.gltwDocTyp;
	}

	public void setGltwDocTyp(String gltwDocTyp) {
		this.gltwDocTyp = gltwDocTyp;
	}

	public String getGltwUser1() {
		return this.gltwUser1;
	}

	public void setGltwUser1(String gltwUser1) {
		this.gltwUser1 = gltwUser1;
	}

	public String getGltwUser2() {
		return this.gltwUser2;
	}

	public void setGltwUser2(String gltwUser2) {
		this.gltwUser2 = gltwUser2;
	}

	public String getGltwCurr() {
		return this.gltwCurr;
	}

	public void setGltwCurr(String gltwCurr) {
		this.gltwCurr = gltwCurr;
	}

	public Double getGltwCurramt() {
		return this.gltwCurramt;
	}

	public void setGltwCurramt(Double gltwCurramt) {
		this.gltwCurramt = gltwCurramt;
	}

	public String getGltwTrType() {
		return this.gltwTrType;
	}

	public void setGltwTrType(String gltwTrType) {
		this.gltwTrType = gltwTrType;
	}

	public Double getGltwExRate() {
		return this.gltwExRate;
	}

	public void setGltwExRate(Double gltwExRate) {
		this.gltwExRate = gltwExRate;
	}

	public String getGltwFxInd() {
		return this.gltwFxInd;
	}

	public void setGltwFxInd(String gltwFxInd) {
		this.gltwFxInd = gltwFxInd;
	}

	public String getGltwSub() {
		return this.gltwSub;
	}

	public void setGltwSub(String gltwSub) {
		this.gltwSub = gltwSub;
	}

	public Double getGltwEcurAmt() {
		return this.gltwEcurAmt;
	}

	public void setGltwEcurAmt(Double gltwEcurAmt) {
		this.gltwEcurAmt = gltwEcurAmt;
	}

	public String getGltwQadc01() {
		return this.gltwQadc01;
	}

	public void setGltwQadc01(String gltwQadc01) {
		this.gltwQadc01 = gltwQadc01;
	}

	public String getGltwDyCode() {
		return this.gltwDyCode;
	}

	public void setGltwDyCode(String gltwDyCode) {
		this.gltwDyCode = gltwDyCode;
	}

	public String getGltwDyNum() {
		return this.gltwDyNum;
	}

	public void setGltwDyNum(String gltwDyNum) {
		this.gltwDyNum = gltwDyNum;
	}

	public Boolean getGltwCorrection() {
		return this.gltwCorrection;
	}

	public void setGltwCorrection(Boolean gltwCorrection) {
		this.gltwCorrection = gltwCorrection;
	}

	public Double getGltwExRate2() {
		return this.gltwExRate2;
	}

	public void setGltwExRate2(Double gltwExRate2) {
		this.gltwExRate2 = gltwExRate2;
	}

	public String getGltwExRatetype() {
		return this.gltwExRatetype;
	}

	public void setGltwExRatetype(String gltwExRatetype) {
		this.gltwExRatetype = gltwExRatetype;
	}

	public Integer getGltwExruSeq() {
		return this.gltwExruSeq;
	}

	public void setGltwExruSeq(Integer gltwExruSeq) {
		this.gltwExruSeq = gltwExruSeq;
	}

	public Double getOidGltwWkfl() {
		return this.oidGltwWkfl;
	}

	public void setOidGltwWkfl(Double oidGltwWkfl) {
		this.oidGltwWkfl = oidGltwWkfl;
	}

}