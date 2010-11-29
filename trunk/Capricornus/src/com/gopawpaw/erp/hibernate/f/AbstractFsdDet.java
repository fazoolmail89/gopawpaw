package com.gopawpaw.erp.hibernate.f;

/**
 * AbstractFsdDet entity provides the base persistence definition of the FsdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFsdDet implements java.io.Serializable {

	// Fields

	private FsdDetId id;
	private String fsdLoc;
	private String fsdLotser;
	private Double fsdQtyTran;
	private String fsdSite;
	private String fsdUser1;
	private String fsdUser2;
	private String fsdRef;
	private String fsdRev;
	private String fsdStatus;
	private Double fsdQtyPost;
	private String fsdRetLoc;
	private String fsdRetSite;
	private String fsdChr01;
	private String fsdChr02;
	private Integer fsdInt01;
	private Double fsdDec01;
	private Boolean fsdLog01;
	private String fsdQadc01;
	private String fsdQadc02;
	private Integer fsdQadi01;
	private Double fsdQadd01;
	private Boolean fsdQadl01;
	private String fsdInvRef;
	private Integer fsdIsbRef;
	private String fsdQadc03;
	private Integer fsdQadi02;
	private Double fsdQadd02;
	private Boolean fsdQadl02;
	private Double oidFsdDet;

	// Constructors

	/** default constructor */
	public AbstractFsdDet() {
	}

	/** minimal constructor */
	public AbstractFsdDet(FsdDetId id, Double oidFsdDet) {
		this.id = id;
		this.oidFsdDet = oidFsdDet;
	}

	/** full constructor */
	public AbstractFsdDet(FsdDetId id, String fsdLoc, String fsdLotser,
			Double fsdQtyTran, String fsdSite, String fsdUser1,
			String fsdUser2, String fsdRef, String fsdRev, String fsdStatus,
			Double fsdQtyPost, String fsdRetLoc, String fsdRetSite,
			String fsdChr01, String fsdChr02, Integer fsdInt01,
			Double fsdDec01, Boolean fsdLog01, String fsdQadc01,
			String fsdQadc02, Integer fsdQadi01, Double fsdQadd01,
			Boolean fsdQadl01, String fsdInvRef, Integer fsdIsbRef,
			String fsdQadc03, Integer fsdQadi02, Double fsdQadd02,
			Boolean fsdQadl02, Double oidFsdDet) {
		this.id = id;
		this.fsdLoc = fsdLoc;
		this.fsdLotser = fsdLotser;
		this.fsdQtyTran = fsdQtyTran;
		this.fsdSite = fsdSite;
		this.fsdUser1 = fsdUser1;
		this.fsdUser2 = fsdUser2;
		this.fsdRef = fsdRef;
		this.fsdRev = fsdRev;
		this.fsdStatus = fsdStatus;
		this.fsdQtyPost = fsdQtyPost;
		this.fsdRetLoc = fsdRetLoc;
		this.fsdRetSite = fsdRetSite;
		this.fsdChr01 = fsdChr01;
		this.fsdChr02 = fsdChr02;
		this.fsdInt01 = fsdInt01;
		this.fsdDec01 = fsdDec01;
		this.fsdLog01 = fsdLog01;
		this.fsdQadc01 = fsdQadc01;
		this.fsdQadc02 = fsdQadc02;
		this.fsdQadi01 = fsdQadi01;
		this.fsdQadd01 = fsdQadd01;
		this.fsdQadl01 = fsdQadl01;
		this.fsdInvRef = fsdInvRef;
		this.fsdIsbRef = fsdIsbRef;
		this.fsdQadc03 = fsdQadc03;
		this.fsdQadi02 = fsdQadi02;
		this.fsdQadd02 = fsdQadd02;
		this.fsdQadl02 = fsdQadl02;
		this.oidFsdDet = oidFsdDet;
	}

	// Property accessors

	public FsdDetId getId() {
		return this.id;
	}

	public void setId(FsdDetId id) {
		this.id = id;
	}

	public String getFsdLoc() {
		return this.fsdLoc;
	}

	public void setFsdLoc(String fsdLoc) {
		this.fsdLoc = fsdLoc;
	}

	public String getFsdLotser() {
		return this.fsdLotser;
	}

	public void setFsdLotser(String fsdLotser) {
		this.fsdLotser = fsdLotser;
	}

	public Double getFsdQtyTran() {
		return this.fsdQtyTran;
	}

	public void setFsdQtyTran(Double fsdQtyTran) {
		this.fsdQtyTran = fsdQtyTran;
	}

	public String getFsdSite() {
		return this.fsdSite;
	}

	public void setFsdSite(String fsdSite) {
		this.fsdSite = fsdSite;
	}

	public String getFsdUser1() {
		return this.fsdUser1;
	}

	public void setFsdUser1(String fsdUser1) {
		this.fsdUser1 = fsdUser1;
	}

	public String getFsdUser2() {
		return this.fsdUser2;
	}

	public void setFsdUser2(String fsdUser2) {
		this.fsdUser2 = fsdUser2;
	}

	public String getFsdRef() {
		return this.fsdRef;
	}

	public void setFsdRef(String fsdRef) {
		this.fsdRef = fsdRef;
	}

	public String getFsdRev() {
		return this.fsdRev;
	}

	public void setFsdRev(String fsdRev) {
		this.fsdRev = fsdRev;
	}

	public String getFsdStatus() {
		return this.fsdStatus;
	}

	public void setFsdStatus(String fsdStatus) {
		this.fsdStatus = fsdStatus;
	}

	public Double getFsdQtyPost() {
		return this.fsdQtyPost;
	}

	public void setFsdQtyPost(Double fsdQtyPost) {
		this.fsdQtyPost = fsdQtyPost;
	}

	public String getFsdRetLoc() {
		return this.fsdRetLoc;
	}

	public void setFsdRetLoc(String fsdRetLoc) {
		this.fsdRetLoc = fsdRetLoc;
	}

	public String getFsdRetSite() {
		return this.fsdRetSite;
	}

	public void setFsdRetSite(String fsdRetSite) {
		this.fsdRetSite = fsdRetSite;
	}

	public String getFsdChr01() {
		return this.fsdChr01;
	}

	public void setFsdChr01(String fsdChr01) {
		this.fsdChr01 = fsdChr01;
	}

	public String getFsdChr02() {
		return this.fsdChr02;
	}

	public void setFsdChr02(String fsdChr02) {
		this.fsdChr02 = fsdChr02;
	}

	public Integer getFsdInt01() {
		return this.fsdInt01;
	}

	public void setFsdInt01(Integer fsdInt01) {
		this.fsdInt01 = fsdInt01;
	}

	public Double getFsdDec01() {
		return this.fsdDec01;
	}

	public void setFsdDec01(Double fsdDec01) {
		this.fsdDec01 = fsdDec01;
	}

	public Boolean getFsdLog01() {
		return this.fsdLog01;
	}

	public void setFsdLog01(Boolean fsdLog01) {
		this.fsdLog01 = fsdLog01;
	}

	public String getFsdQadc01() {
		return this.fsdQadc01;
	}

	public void setFsdQadc01(String fsdQadc01) {
		this.fsdQadc01 = fsdQadc01;
	}

	public String getFsdQadc02() {
		return this.fsdQadc02;
	}

	public void setFsdQadc02(String fsdQadc02) {
		this.fsdQadc02 = fsdQadc02;
	}

	public Integer getFsdQadi01() {
		return this.fsdQadi01;
	}

	public void setFsdQadi01(Integer fsdQadi01) {
		this.fsdQadi01 = fsdQadi01;
	}

	public Double getFsdQadd01() {
		return this.fsdQadd01;
	}

	public void setFsdQadd01(Double fsdQadd01) {
		this.fsdQadd01 = fsdQadd01;
	}

	public Boolean getFsdQadl01() {
		return this.fsdQadl01;
	}

	public void setFsdQadl01(Boolean fsdQadl01) {
		this.fsdQadl01 = fsdQadl01;
	}

	public String getFsdInvRef() {
		return this.fsdInvRef;
	}

	public void setFsdInvRef(String fsdInvRef) {
		this.fsdInvRef = fsdInvRef;
	}

	public Integer getFsdIsbRef() {
		return this.fsdIsbRef;
	}

	public void setFsdIsbRef(Integer fsdIsbRef) {
		this.fsdIsbRef = fsdIsbRef;
	}

	public String getFsdQadc03() {
		return this.fsdQadc03;
	}

	public void setFsdQadc03(String fsdQadc03) {
		this.fsdQadc03 = fsdQadc03;
	}

	public Integer getFsdQadi02() {
		return this.fsdQadi02;
	}

	public void setFsdQadi02(Integer fsdQadi02) {
		this.fsdQadi02 = fsdQadi02;
	}

	public Double getFsdQadd02() {
		return this.fsdQadd02;
	}

	public void setFsdQadd02(Double fsdQadd02) {
		this.fsdQadd02 = fsdQadd02;
	}

	public Boolean getFsdQadl02() {
		return this.fsdQadl02;
	}

	public void setFsdQadl02(Boolean fsdQadl02) {
		this.fsdQadl02 = fsdQadl02;
	}

	public Double getOidFsdDet() {
		return this.oidFsdDet;
	}

	public void setOidFsdDet(Double oidFsdDet) {
		this.oidFsdDet = oidFsdDet;
	}

}