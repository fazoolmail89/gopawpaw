package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGlrdDet entity provides the base persistence definition of the
 * GlrdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGlrdDet implements java.io.Serializable {

	// Fields

	private GlrdDetId id;
	private String glrdAcct;
	private String glrdCc;
	private String glrdDesc;
	private Integer glrdSums;
	private Boolean glrdDrCr;
	private Boolean glrdPage;
	private Boolean glrdHeader;
	private Boolean glrdTotal;
	private String glrdEntity;
	private String glrdUser1;
	private String glrdUser2;
	private Boolean glrdUnderln;
	private Boolean glrdSkip;
	private String glrdSub;
	private String glrdAcct1;
	private String glrdCc1;
	private String glrdSub1;
	private String glrdQadc01;
	private Double oidGlrdDet;

	// Constructors

	/** default constructor */
	public AbstractGlrdDet() {
	}

	/** minimal constructor */
	public AbstractGlrdDet(GlrdDetId id, Double oidGlrdDet) {
		this.id = id;
		this.oidGlrdDet = oidGlrdDet;
	}

	/** full constructor */
	public AbstractGlrdDet(GlrdDetId id, String glrdAcct, String glrdCc,
			String glrdDesc, Integer glrdSums, Boolean glrdDrCr,
			Boolean glrdPage, Boolean glrdHeader, Boolean glrdTotal,
			String glrdEntity, String glrdUser1, String glrdUser2,
			Boolean glrdUnderln, Boolean glrdSkip, String glrdSub,
			String glrdAcct1, String glrdCc1, String glrdSub1,
			String glrdQadc01, Double oidGlrdDet) {
		this.id = id;
		this.glrdAcct = glrdAcct;
		this.glrdCc = glrdCc;
		this.glrdDesc = glrdDesc;
		this.glrdSums = glrdSums;
		this.glrdDrCr = glrdDrCr;
		this.glrdPage = glrdPage;
		this.glrdHeader = glrdHeader;
		this.glrdTotal = glrdTotal;
		this.glrdEntity = glrdEntity;
		this.glrdUser1 = glrdUser1;
		this.glrdUser2 = glrdUser2;
		this.glrdUnderln = glrdUnderln;
		this.glrdSkip = glrdSkip;
		this.glrdSub = glrdSub;
		this.glrdAcct1 = glrdAcct1;
		this.glrdCc1 = glrdCc1;
		this.glrdSub1 = glrdSub1;
		this.glrdQadc01 = glrdQadc01;
		this.oidGlrdDet = oidGlrdDet;
	}

	// Property accessors

	public GlrdDetId getId() {
		return this.id;
	}

	public void setId(GlrdDetId id) {
		this.id = id;
	}

	public String getGlrdAcct() {
		return this.glrdAcct;
	}

	public void setGlrdAcct(String glrdAcct) {
		this.glrdAcct = glrdAcct;
	}

	public String getGlrdCc() {
		return this.glrdCc;
	}

	public void setGlrdCc(String glrdCc) {
		this.glrdCc = glrdCc;
	}

	public String getGlrdDesc() {
		return this.glrdDesc;
	}

	public void setGlrdDesc(String glrdDesc) {
		this.glrdDesc = glrdDesc;
	}

	public Integer getGlrdSums() {
		return this.glrdSums;
	}

	public void setGlrdSums(Integer glrdSums) {
		this.glrdSums = glrdSums;
	}

	public Boolean getGlrdDrCr() {
		return this.glrdDrCr;
	}

	public void setGlrdDrCr(Boolean glrdDrCr) {
		this.glrdDrCr = glrdDrCr;
	}

	public Boolean getGlrdPage() {
		return this.glrdPage;
	}

	public void setGlrdPage(Boolean glrdPage) {
		this.glrdPage = glrdPage;
	}

	public Boolean getGlrdHeader() {
		return this.glrdHeader;
	}

	public void setGlrdHeader(Boolean glrdHeader) {
		this.glrdHeader = glrdHeader;
	}

	public Boolean getGlrdTotal() {
		return this.glrdTotal;
	}

	public void setGlrdTotal(Boolean glrdTotal) {
		this.glrdTotal = glrdTotal;
	}

	public String getGlrdEntity() {
		return this.glrdEntity;
	}

	public void setGlrdEntity(String glrdEntity) {
		this.glrdEntity = glrdEntity;
	}

	public String getGlrdUser1() {
		return this.glrdUser1;
	}

	public void setGlrdUser1(String glrdUser1) {
		this.glrdUser1 = glrdUser1;
	}

	public String getGlrdUser2() {
		return this.glrdUser2;
	}

	public void setGlrdUser2(String glrdUser2) {
		this.glrdUser2 = glrdUser2;
	}

	public Boolean getGlrdUnderln() {
		return this.glrdUnderln;
	}

	public void setGlrdUnderln(Boolean glrdUnderln) {
		this.glrdUnderln = glrdUnderln;
	}

	public Boolean getGlrdSkip() {
		return this.glrdSkip;
	}

	public void setGlrdSkip(Boolean glrdSkip) {
		this.glrdSkip = glrdSkip;
	}

	public String getGlrdSub() {
		return this.glrdSub;
	}

	public void setGlrdSub(String glrdSub) {
		this.glrdSub = glrdSub;
	}

	public String getGlrdAcct1() {
		return this.glrdAcct1;
	}

	public void setGlrdAcct1(String glrdAcct1) {
		this.glrdAcct1 = glrdAcct1;
	}

	public String getGlrdCc1() {
		return this.glrdCc1;
	}

	public void setGlrdCc1(String glrdCc1) {
		this.glrdCc1 = glrdCc1;
	}

	public String getGlrdSub1() {
		return this.glrdSub1;
	}

	public void setGlrdSub1(String glrdSub1) {
		this.glrdSub1 = glrdSub1;
	}

	public String getGlrdQadc01() {
		return this.glrdQadc01;
	}

	public void setGlrdQadc01(String glrdQadc01) {
		this.glrdQadc01 = glrdQadc01;
	}

	public Double getOidGlrdDet() {
		return this.oidGlrdDet;
	}

	public void setOidGlrdDet(Double oidGlrdDet) {
		this.oidGlrdDet = oidGlrdDet;
	}

}