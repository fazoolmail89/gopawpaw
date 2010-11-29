package com.gopawpaw.erp.hibernate.v;

/**
 * AbstractVodDet entity provides the base persistence definition of the VodDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractVodDet implements java.io.Serializable {

	// Fields

	private VodDetId id;
	private String vodAcct;
	private String vodCc;
	private String vodProject;
	private String vodDesc;
	private Double vodAmt;
	private String vodType;
	private String vodUser1;
	private String vodUser2;
	private String vodEntity;
	private String vodTaxAt;
	private String vodTax;
	private String vodTaxUsage;
	private String vodTaxc;
	private String vodExpAcct;
	private String vodExpCc;
	private String vodQadc01;
	private Boolean vodTaxable;
	private String vodTaxEnv;
	private Boolean vodTaxIn;
	private String vodDyCode;
	private String vodDyNum;
	private Double vodBaseAmt;
	private String vodSub;
	private String vodExpSub;
	private Integer vodPjsLine;
	private Double oidVodDet;

	// Constructors

	/** default constructor */
	public AbstractVodDet() {
	}

	/** minimal constructor */
	public AbstractVodDet(VodDetId id, String vodDyCode, String vodDyNum,
			Double vodBaseAmt, Integer vodPjsLine, Double oidVodDet) {
		this.id = id;
		this.vodDyCode = vodDyCode;
		this.vodDyNum = vodDyNum;
		this.vodBaseAmt = vodBaseAmt;
		this.vodPjsLine = vodPjsLine;
		this.oidVodDet = oidVodDet;
	}

	/** full constructor */
	public AbstractVodDet(VodDetId id, String vodAcct, String vodCc,
			String vodProject, String vodDesc, Double vodAmt, String vodType,
			String vodUser1, String vodUser2, String vodEntity,
			String vodTaxAt, String vodTax, String vodTaxUsage, String vodTaxc,
			String vodExpAcct, String vodExpCc, String vodQadc01,
			Boolean vodTaxable, String vodTaxEnv, Boolean vodTaxIn,
			String vodDyCode, String vodDyNum, Double vodBaseAmt,
			String vodSub, String vodExpSub, Integer vodPjsLine,
			Double oidVodDet) {
		this.id = id;
		this.vodAcct = vodAcct;
		this.vodCc = vodCc;
		this.vodProject = vodProject;
		this.vodDesc = vodDesc;
		this.vodAmt = vodAmt;
		this.vodType = vodType;
		this.vodUser1 = vodUser1;
		this.vodUser2 = vodUser2;
		this.vodEntity = vodEntity;
		this.vodTaxAt = vodTaxAt;
		this.vodTax = vodTax;
		this.vodTaxUsage = vodTaxUsage;
		this.vodTaxc = vodTaxc;
		this.vodExpAcct = vodExpAcct;
		this.vodExpCc = vodExpCc;
		this.vodQadc01 = vodQadc01;
		this.vodTaxable = vodTaxable;
		this.vodTaxEnv = vodTaxEnv;
		this.vodTaxIn = vodTaxIn;
		this.vodDyCode = vodDyCode;
		this.vodDyNum = vodDyNum;
		this.vodBaseAmt = vodBaseAmt;
		this.vodSub = vodSub;
		this.vodExpSub = vodExpSub;
		this.vodPjsLine = vodPjsLine;
		this.oidVodDet = oidVodDet;
	}

	// Property accessors

	public VodDetId getId() {
		return this.id;
	}

	public void setId(VodDetId id) {
		this.id = id;
	}

	public String getVodAcct() {
		return this.vodAcct;
	}

	public void setVodAcct(String vodAcct) {
		this.vodAcct = vodAcct;
	}

	public String getVodCc() {
		return this.vodCc;
	}

	public void setVodCc(String vodCc) {
		this.vodCc = vodCc;
	}

	public String getVodProject() {
		return this.vodProject;
	}

	public void setVodProject(String vodProject) {
		this.vodProject = vodProject;
	}

	public String getVodDesc() {
		return this.vodDesc;
	}

	public void setVodDesc(String vodDesc) {
		this.vodDesc = vodDesc;
	}

	public Double getVodAmt() {
		return this.vodAmt;
	}

	public void setVodAmt(Double vodAmt) {
		this.vodAmt = vodAmt;
	}

	public String getVodType() {
		return this.vodType;
	}

	public void setVodType(String vodType) {
		this.vodType = vodType;
	}

	public String getVodUser1() {
		return this.vodUser1;
	}

	public void setVodUser1(String vodUser1) {
		this.vodUser1 = vodUser1;
	}

	public String getVodUser2() {
		return this.vodUser2;
	}

	public void setVodUser2(String vodUser2) {
		this.vodUser2 = vodUser2;
	}

	public String getVodEntity() {
		return this.vodEntity;
	}

	public void setVodEntity(String vodEntity) {
		this.vodEntity = vodEntity;
	}

	public String getVodTaxAt() {
		return this.vodTaxAt;
	}

	public void setVodTaxAt(String vodTaxAt) {
		this.vodTaxAt = vodTaxAt;
	}

	public String getVodTax() {
		return this.vodTax;
	}

	public void setVodTax(String vodTax) {
		this.vodTax = vodTax;
	}

	public String getVodTaxUsage() {
		return this.vodTaxUsage;
	}

	public void setVodTaxUsage(String vodTaxUsage) {
		this.vodTaxUsage = vodTaxUsage;
	}

	public String getVodTaxc() {
		return this.vodTaxc;
	}

	public void setVodTaxc(String vodTaxc) {
		this.vodTaxc = vodTaxc;
	}

	public String getVodExpAcct() {
		return this.vodExpAcct;
	}

	public void setVodExpAcct(String vodExpAcct) {
		this.vodExpAcct = vodExpAcct;
	}

	public String getVodExpCc() {
		return this.vodExpCc;
	}

	public void setVodExpCc(String vodExpCc) {
		this.vodExpCc = vodExpCc;
	}

	public String getVodQadc01() {
		return this.vodQadc01;
	}

	public void setVodQadc01(String vodQadc01) {
		this.vodQadc01 = vodQadc01;
	}

	public Boolean getVodTaxable() {
		return this.vodTaxable;
	}

	public void setVodTaxable(Boolean vodTaxable) {
		this.vodTaxable = vodTaxable;
	}

	public String getVodTaxEnv() {
		return this.vodTaxEnv;
	}

	public void setVodTaxEnv(String vodTaxEnv) {
		this.vodTaxEnv = vodTaxEnv;
	}

	public Boolean getVodTaxIn() {
		return this.vodTaxIn;
	}

	public void setVodTaxIn(Boolean vodTaxIn) {
		this.vodTaxIn = vodTaxIn;
	}

	public String getVodDyCode() {
		return this.vodDyCode;
	}

	public void setVodDyCode(String vodDyCode) {
		this.vodDyCode = vodDyCode;
	}

	public String getVodDyNum() {
		return this.vodDyNum;
	}

	public void setVodDyNum(String vodDyNum) {
		this.vodDyNum = vodDyNum;
	}

	public Double getVodBaseAmt() {
		return this.vodBaseAmt;
	}

	public void setVodBaseAmt(Double vodBaseAmt) {
		this.vodBaseAmt = vodBaseAmt;
	}

	public String getVodSub() {
		return this.vodSub;
	}

	public void setVodSub(String vodSub) {
		this.vodSub = vodSub;
	}

	public String getVodExpSub() {
		return this.vodExpSub;
	}

	public void setVodExpSub(String vodExpSub) {
		this.vodExpSub = vodExpSub;
	}

	public Integer getVodPjsLine() {
		return this.vodPjsLine;
	}

	public void setVodPjsLine(Integer vodPjsLine) {
		this.vodPjsLine = vodPjsLine;
	}

	public Double getOidVodDet() {
		return this.oidVodDet;
	}

	public void setOidVodDet(Double oidVodDet) {
		this.oidVodDet = oidVodDet;
	}

}