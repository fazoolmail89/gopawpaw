package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * AbstractFabdDet entity provides the base persistence definition of the
 * FabdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractFabdDet implements java.io.Serializable {

	// Fields

	private FabdDetId id;
	private String fabdFaId;
	private String fabdFabkId;
	private String fabdFalocId;
	private String fabdFaclsId;
	private String fabdYrper;
	private String fabdAdjYrper;
	private Boolean fabdPost;
	private Double fabdAccamt;
	private Double fabdPeramt;
	private Boolean fabdQadl03;
	private Boolean fabdRetired;
	private Boolean fabdTransfer;
	private Integer fabdResrv;
	private String fabdResrvType;
	private Boolean fabdSuspend;
	private Integer fabdUpper;
	private Integer fabdAccup;
	private String fabdTrnLoc;
	private Integer fabdGlseq;
	private Boolean fabdQadl04;
	private Boolean fabdRtPeriod;
	private String fabdModUserid;
	private Date fabdModDate;
	private String fabdUser1;
	private String fabdUser2;
	private String fabdChr01;
	private Double fabdDec01;
	private Boolean fabdLog01;
	private Date fabdDte01;
	private Integer fabdInt01;
	private String fabdQadc01;
	private String fabdQadc02;
	private Double fabdQadd01;
	private Boolean fabdQadl01;
	private Integer fabdQadi01;
	private Date fabdQadt01;
	private Double fabdQadd02;
	private Integer fabdQadi02;
	private Boolean fabdQadl02;
	private Date fabdQadt02;
	private String fabdEntity;
	private Integer fabdTrnGlseq;
	private String fabdTrnEntity;
	private Boolean fabdMigrate;
	private Double oidFabdDet;

	// Constructors

	/** default constructor */
	public AbstractFabdDet() {
	}

	/** minimal constructor */
	public AbstractFabdDet(FabdDetId id, String fabdFaId, String fabdFabkId,
			String fabdFalocId, String fabdFaclsId, String fabdYrper,
			String fabdAdjYrper, Boolean fabdPost, Double fabdAccamt,
			Double fabdPeramt, Boolean fabdQadl03, Boolean fabdRetired,
			Boolean fabdTransfer, Integer fabdResrv, String fabdResrvType,
			Boolean fabdSuspend, Integer fabdUpper, Integer fabdAccup,
			String fabdTrnLoc, Integer fabdGlseq, Boolean fabdQadl04,
			Boolean fabdRtPeriod, String fabdModUserid, Date fabdModDate,
			String fabdUser1, String fabdUser2, String fabdChr01,
			Double fabdDec01, Boolean fabdLog01, Integer fabdInt01,
			String fabdQadc01, String fabdQadc02, Double fabdQadd01,
			Boolean fabdQadl01, Integer fabdQadi01, Double fabdQadd02,
			Integer fabdQadi02, Boolean fabdQadl02, String fabdEntity,
			Integer fabdTrnGlseq, String fabdTrnEntity, Boolean fabdMigrate,
			Double oidFabdDet) {
		this.id = id;
		this.fabdFaId = fabdFaId;
		this.fabdFabkId = fabdFabkId;
		this.fabdFalocId = fabdFalocId;
		this.fabdFaclsId = fabdFaclsId;
		this.fabdYrper = fabdYrper;
		this.fabdAdjYrper = fabdAdjYrper;
		this.fabdPost = fabdPost;
		this.fabdAccamt = fabdAccamt;
		this.fabdPeramt = fabdPeramt;
		this.fabdQadl03 = fabdQadl03;
		this.fabdRetired = fabdRetired;
		this.fabdTransfer = fabdTransfer;
		this.fabdResrv = fabdResrv;
		this.fabdResrvType = fabdResrvType;
		this.fabdSuspend = fabdSuspend;
		this.fabdUpper = fabdUpper;
		this.fabdAccup = fabdAccup;
		this.fabdTrnLoc = fabdTrnLoc;
		this.fabdGlseq = fabdGlseq;
		this.fabdQadl04 = fabdQadl04;
		this.fabdRtPeriod = fabdRtPeriod;
		this.fabdModUserid = fabdModUserid;
		this.fabdModDate = fabdModDate;
		this.fabdUser1 = fabdUser1;
		this.fabdUser2 = fabdUser2;
		this.fabdChr01 = fabdChr01;
		this.fabdDec01 = fabdDec01;
		this.fabdLog01 = fabdLog01;
		this.fabdInt01 = fabdInt01;
		this.fabdQadc01 = fabdQadc01;
		this.fabdQadc02 = fabdQadc02;
		this.fabdQadd01 = fabdQadd01;
		this.fabdQadl01 = fabdQadl01;
		this.fabdQadi01 = fabdQadi01;
		this.fabdQadd02 = fabdQadd02;
		this.fabdQadi02 = fabdQadi02;
		this.fabdQadl02 = fabdQadl02;
		this.fabdEntity = fabdEntity;
		this.fabdTrnGlseq = fabdTrnGlseq;
		this.fabdTrnEntity = fabdTrnEntity;
		this.fabdMigrate = fabdMigrate;
		this.oidFabdDet = oidFabdDet;
	}

	/** full constructor */
	public AbstractFabdDet(FabdDetId id, String fabdFaId, String fabdFabkId,
			String fabdFalocId, String fabdFaclsId, String fabdYrper,
			String fabdAdjYrper, Boolean fabdPost, Double fabdAccamt,
			Double fabdPeramt, Boolean fabdQadl03, Boolean fabdRetired,
			Boolean fabdTransfer, Integer fabdResrv, String fabdResrvType,
			Boolean fabdSuspend, Integer fabdUpper, Integer fabdAccup,
			String fabdTrnLoc, Integer fabdGlseq, Boolean fabdQadl04,
			Boolean fabdRtPeriod, String fabdModUserid, Date fabdModDate,
			String fabdUser1, String fabdUser2, String fabdChr01,
			Double fabdDec01, Boolean fabdLog01, Date fabdDte01,
			Integer fabdInt01, String fabdQadc01, String fabdQadc02,
			Double fabdQadd01, Boolean fabdQadl01, Integer fabdQadi01,
			Date fabdQadt01, Double fabdQadd02, Integer fabdQadi02,
			Boolean fabdQadl02, Date fabdQadt02, String fabdEntity,
			Integer fabdTrnGlseq, String fabdTrnEntity, Boolean fabdMigrate,
			Double oidFabdDet) {
		this.id = id;
		this.fabdFaId = fabdFaId;
		this.fabdFabkId = fabdFabkId;
		this.fabdFalocId = fabdFalocId;
		this.fabdFaclsId = fabdFaclsId;
		this.fabdYrper = fabdYrper;
		this.fabdAdjYrper = fabdAdjYrper;
		this.fabdPost = fabdPost;
		this.fabdAccamt = fabdAccamt;
		this.fabdPeramt = fabdPeramt;
		this.fabdQadl03 = fabdQadl03;
		this.fabdRetired = fabdRetired;
		this.fabdTransfer = fabdTransfer;
		this.fabdResrv = fabdResrv;
		this.fabdResrvType = fabdResrvType;
		this.fabdSuspend = fabdSuspend;
		this.fabdUpper = fabdUpper;
		this.fabdAccup = fabdAccup;
		this.fabdTrnLoc = fabdTrnLoc;
		this.fabdGlseq = fabdGlseq;
		this.fabdQadl04 = fabdQadl04;
		this.fabdRtPeriod = fabdRtPeriod;
		this.fabdModUserid = fabdModUserid;
		this.fabdModDate = fabdModDate;
		this.fabdUser1 = fabdUser1;
		this.fabdUser2 = fabdUser2;
		this.fabdChr01 = fabdChr01;
		this.fabdDec01 = fabdDec01;
		this.fabdLog01 = fabdLog01;
		this.fabdDte01 = fabdDte01;
		this.fabdInt01 = fabdInt01;
		this.fabdQadc01 = fabdQadc01;
		this.fabdQadc02 = fabdQadc02;
		this.fabdQadd01 = fabdQadd01;
		this.fabdQadl01 = fabdQadl01;
		this.fabdQadi01 = fabdQadi01;
		this.fabdQadt01 = fabdQadt01;
		this.fabdQadd02 = fabdQadd02;
		this.fabdQadi02 = fabdQadi02;
		this.fabdQadl02 = fabdQadl02;
		this.fabdQadt02 = fabdQadt02;
		this.fabdEntity = fabdEntity;
		this.fabdTrnGlseq = fabdTrnGlseq;
		this.fabdTrnEntity = fabdTrnEntity;
		this.fabdMigrate = fabdMigrate;
		this.oidFabdDet = oidFabdDet;
	}

	// Property accessors

	public FabdDetId getId() {
		return this.id;
	}

	public void setId(FabdDetId id) {
		this.id = id;
	}

	public String getFabdFaId() {
		return this.fabdFaId;
	}

	public void setFabdFaId(String fabdFaId) {
		this.fabdFaId = fabdFaId;
	}

	public String getFabdFabkId() {
		return this.fabdFabkId;
	}

	public void setFabdFabkId(String fabdFabkId) {
		this.fabdFabkId = fabdFabkId;
	}

	public String getFabdFalocId() {
		return this.fabdFalocId;
	}

	public void setFabdFalocId(String fabdFalocId) {
		this.fabdFalocId = fabdFalocId;
	}

	public String getFabdFaclsId() {
		return this.fabdFaclsId;
	}

	public void setFabdFaclsId(String fabdFaclsId) {
		this.fabdFaclsId = fabdFaclsId;
	}

	public String getFabdYrper() {
		return this.fabdYrper;
	}

	public void setFabdYrper(String fabdYrper) {
		this.fabdYrper = fabdYrper;
	}

	public String getFabdAdjYrper() {
		return this.fabdAdjYrper;
	}

	public void setFabdAdjYrper(String fabdAdjYrper) {
		this.fabdAdjYrper = fabdAdjYrper;
	}

	public Boolean getFabdPost() {
		return this.fabdPost;
	}

	public void setFabdPost(Boolean fabdPost) {
		this.fabdPost = fabdPost;
	}

	public Double getFabdAccamt() {
		return this.fabdAccamt;
	}

	public void setFabdAccamt(Double fabdAccamt) {
		this.fabdAccamt = fabdAccamt;
	}

	public Double getFabdPeramt() {
		return this.fabdPeramt;
	}

	public void setFabdPeramt(Double fabdPeramt) {
		this.fabdPeramt = fabdPeramt;
	}

	public Boolean getFabdQadl03() {
		return this.fabdQadl03;
	}

	public void setFabdQadl03(Boolean fabdQadl03) {
		this.fabdQadl03 = fabdQadl03;
	}

	public Boolean getFabdRetired() {
		return this.fabdRetired;
	}

	public void setFabdRetired(Boolean fabdRetired) {
		this.fabdRetired = fabdRetired;
	}

	public Boolean getFabdTransfer() {
		return this.fabdTransfer;
	}

	public void setFabdTransfer(Boolean fabdTransfer) {
		this.fabdTransfer = fabdTransfer;
	}

	public Integer getFabdResrv() {
		return this.fabdResrv;
	}

	public void setFabdResrv(Integer fabdResrv) {
		this.fabdResrv = fabdResrv;
	}

	public String getFabdResrvType() {
		return this.fabdResrvType;
	}

	public void setFabdResrvType(String fabdResrvType) {
		this.fabdResrvType = fabdResrvType;
	}

	public Boolean getFabdSuspend() {
		return this.fabdSuspend;
	}

	public void setFabdSuspend(Boolean fabdSuspend) {
		this.fabdSuspend = fabdSuspend;
	}

	public Integer getFabdUpper() {
		return this.fabdUpper;
	}

	public void setFabdUpper(Integer fabdUpper) {
		this.fabdUpper = fabdUpper;
	}

	public Integer getFabdAccup() {
		return this.fabdAccup;
	}

	public void setFabdAccup(Integer fabdAccup) {
		this.fabdAccup = fabdAccup;
	}

	public String getFabdTrnLoc() {
		return this.fabdTrnLoc;
	}

	public void setFabdTrnLoc(String fabdTrnLoc) {
		this.fabdTrnLoc = fabdTrnLoc;
	}

	public Integer getFabdGlseq() {
		return this.fabdGlseq;
	}

	public void setFabdGlseq(Integer fabdGlseq) {
		this.fabdGlseq = fabdGlseq;
	}

	public Boolean getFabdQadl04() {
		return this.fabdQadl04;
	}

	public void setFabdQadl04(Boolean fabdQadl04) {
		this.fabdQadl04 = fabdQadl04;
	}

	public Boolean getFabdRtPeriod() {
		return this.fabdRtPeriod;
	}

	public void setFabdRtPeriod(Boolean fabdRtPeriod) {
		this.fabdRtPeriod = fabdRtPeriod;
	}

	public String getFabdModUserid() {
		return this.fabdModUserid;
	}

	public void setFabdModUserid(String fabdModUserid) {
		this.fabdModUserid = fabdModUserid;
	}

	public Date getFabdModDate() {
		return this.fabdModDate;
	}

	public void setFabdModDate(Date fabdModDate) {
		this.fabdModDate = fabdModDate;
	}

	public String getFabdUser1() {
		return this.fabdUser1;
	}

	public void setFabdUser1(String fabdUser1) {
		this.fabdUser1 = fabdUser1;
	}

	public String getFabdUser2() {
		return this.fabdUser2;
	}

	public void setFabdUser2(String fabdUser2) {
		this.fabdUser2 = fabdUser2;
	}

	public String getFabdChr01() {
		return this.fabdChr01;
	}

	public void setFabdChr01(String fabdChr01) {
		this.fabdChr01 = fabdChr01;
	}

	public Double getFabdDec01() {
		return this.fabdDec01;
	}

	public void setFabdDec01(Double fabdDec01) {
		this.fabdDec01 = fabdDec01;
	}

	public Boolean getFabdLog01() {
		return this.fabdLog01;
	}

	public void setFabdLog01(Boolean fabdLog01) {
		this.fabdLog01 = fabdLog01;
	}

	public Date getFabdDte01() {
		return this.fabdDte01;
	}

	public void setFabdDte01(Date fabdDte01) {
		this.fabdDte01 = fabdDte01;
	}

	public Integer getFabdInt01() {
		return this.fabdInt01;
	}

	public void setFabdInt01(Integer fabdInt01) {
		this.fabdInt01 = fabdInt01;
	}

	public String getFabdQadc01() {
		return this.fabdQadc01;
	}

	public void setFabdQadc01(String fabdQadc01) {
		this.fabdQadc01 = fabdQadc01;
	}

	public String getFabdQadc02() {
		return this.fabdQadc02;
	}

	public void setFabdQadc02(String fabdQadc02) {
		this.fabdQadc02 = fabdQadc02;
	}

	public Double getFabdQadd01() {
		return this.fabdQadd01;
	}

	public void setFabdQadd01(Double fabdQadd01) {
		this.fabdQadd01 = fabdQadd01;
	}

	public Boolean getFabdQadl01() {
		return this.fabdQadl01;
	}

	public void setFabdQadl01(Boolean fabdQadl01) {
		this.fabdQadl01 = fabdQadl01;
	}

	public Integer getFabdQadi01() {
		return this.fabdQadi01;
	}

	public void setFabdQadi01(Integer fabdQadi01) {
		this.fabdQadi01 = fabdQadi01;
	}

	public Date getFabdQadt01() {
		return this.fabdQadt01;
	}

	public void setFabdQadt01(Date fabdQadt01) {
		this.fabdQadt01 = fabdQadt01;
	}

	public Double getFabdQadd02() {
		return this.fabdQadd02;
	}

	public void setFabdQadd02(Double fabdQadd02) {
		this.fabdQadd02 = fabdQadd02;
	}

	public Integer getFabdQadi02() {
		return this.fabdQadi02;
	}

	public void setFabdQadi02(Integer fabdQadi02) {
		this.fabdQadi02 = fabdQadi02;
	}

	public Boolean getFabdQadl02() {
		return this.fabdQadl02;
	}

	public void setFabdQadl02(Boolean fabdQadl02) {
		this.fabdQadl02 = fabdQadl02;
	}

	public Date getFabdQadt02() {
		return this.fabdQadt02;
	}

	public void setFabdQadt02(Date fabdQadt02) {
		this.fabdQadt02 = fabdQadt02;
	}

	public String getFabdEntity() {
		return this.fabdEntity;
	}

	public void setFabdEntity(String fabdEntity) {
		this.fabdEntity = fabdEntity;
	}

	public Integer getFabdTrnGlseq() {
		return this.fabdTrnGlseq;
	}

	public void setFabdTrnGlseq(Integer fabdTrnGlseq) {
		this.fabdTrnGlseq = fabdTrnGlseq;
	}

	public String getFabdTrnEntity() {
		return this.fabdTrnEntity;
	}

	public void setFabdTrnEntity(String fabdTrnEntity) {
		this.fabdTrnEntity = fabdTrnEntity;
	}

	public Boolean getFabdMigrate() {
		return this.fabdMigrate;
	}

	public void setFabdMigrate(Boolean fabdMigrate) {
		this.fabdMigrate = fabdMigrate;
	}

	public Double getOidFabdDet() {
		return this.oidFabdDet;
	}

	public void setOidFabdDet(Double oidFabdDet) {
		this.oidFabdDet = oidFabdDet;
	}

}