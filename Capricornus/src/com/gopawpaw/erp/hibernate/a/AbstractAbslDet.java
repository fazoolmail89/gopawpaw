package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractAbslDet entity provides the base persistence definition of the
 * AbslDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAbslDet implements java.io.Serializable {

	// Fields

	private AbslDetId id;
	private String abslInvNbr;
	private String abslTrlCode;
	private Double abslLcAmt;
	private String abslChargeType;
	private String abslRef;
	private Boolean abslConfirmed;
	private Boolean abslInvPost;
	private Double abslExtPrice;
	private String abslAcct;
	private String abslCc;
	private Boolean abslTaxable;
	private String abslTaxc;
	private String abslSub;
	private String abslProject;
	private String abslModUserid;
	private Date abslModDate;
	private String abslUserc01;
	private String abslUserc02;
	private String abslQadc01;
	private String abslQadc02;
	private Double oidAbslDet;

	// Constructors

	/** default constructor */
	public AbstractAbslDet() {
	}

	/** minimal constructor */
	public AbstractAbslDet(AbslDetId id, String abslInvNbr, String abslTrlCode,
			Double abslLcAmt, String abslChargeType, String abslRef,
			Boolean abslConfirmed, Boolean abslInvPost, Double abslExtPrice,
			String abslAcct, String abslCc, Boolean abslTaxable,
			String abslTaxc, String abslSub, String abslProject,
			String abslModUserid, String abslUserc01, String abslUserc02,
			String abslQadc01, String abslQadc02, Double oidAbslDet) {
		this.id = id;
		this.abslInvNbr = abslInvNbr;
		this.abslTrlCode = abslTrlCode;
		this.abslLcAmt = abslLcAmt;
		this.abslChargeType = abslChargeType;
		this.abslRef = abslRef;
		this.abslConfirmed = abslConfirmed;
		this.abslInvPost = abslInvPost;
		this.abslExtPrice = abslExtPrice;
		this.abslAcct = abslAcct;
		this.abslCc = abslCc;
		this.abslTaxable = abslTaxable;
		this.abslTaxc = abslTaxc;
		this.abslSub = abslSub;
		this.abslProject = abslProject;
		this.abslModUserid = abslModUserid;
		this.abslUserc01 = abslUserc01;
		this.abslUserc02 = abslUserc02;
		this.abslQadc01 = abslQadc01;
		this.abslQadc02 = abslQadc02;
		this.oidAbslDet = oidAbslDet;
	}

	/** full constructor */
	public AbstractAbslDet(AbslDetId id, String abslInvNbr, String abslTrlCode,
			Double abslLcAmt, String abslChargeType, String abslRef,
			Boolean abslConfirmed, Boolean abslInvPost, Double abslExtPrice,
			String abslAcct, String abslCc, Boolean abslTaxable,
			String abslTaxc, String abslSub, String abslProject,
			String abslModUserid, Date abslModDate, String abslUserc01,
			String abslUserc02, String abslQadc01, String abslQadc02,
			Double oidAbslDet) {
		this.id = id;
		this.abslInvNbr = abslInvNbr;
		this.abslTrlCode = abslTrlCode;
		this.abslLcAmt = abslLcAmt;
		this.abslChargeType = abslChargeType;
		this.abslRef = abslRef;
		this.abslConfirmed = abslConfirmed;
		this.abslInvPost = abslInvPost;
		this.abslExtPrice = abslExtPrice;
		this.abslAcct = abslAcct;
		this.abslCc = abslCc;
		this.abslTaxable = abslTaxable;
		this.abslTaxc = abslTaxc;
		this.abslSub = abslSub;
		this.abslProject = abslProject;
		this.abslModUserid = abslModUserid;
		this.abslModDate = abslModDate;
		this.abslUserc01 = abslUserc01;
		this.abslUserc02 = abslUserc02;
		this.abslQadc01 = abslQadc01;
		this.abslQadc02 = abslQadc02;
		this.oidAbslDet = oidAbslDet;
	}

	// Property accessors

	public AbslDetId getId() {
		return this.id;
	}

	public void setId(AbslDetId id) {
		this.id = id;
	}

	public String getAbslInvNbr() {
		return this.abslInvNbr;
	}

	public void setAbslInvNbr(String abslInvNbr) {
		this.abslInvNbr = abslInvNbr;
	}

	public String getAbslTrlCode() {
		return this.abslTrlCode;
	}

	public void setAbslTrlCode(String abslTrlCode) {
		this.abslTrlCode = abslTrlCode;
	}

	public Double getAbslLcAmt() {
		return this.abslLcAmt;
	}

	public void setAbslLcAmt(Double abslLcAmt) {
		this.abslLcAmt = abslLcAmt;
	}

	public String getAbslChargeType() {
		return this.abslChargeType;
	}

	public void setAbslChargeType(String abslChargeType) {
		this.abslChargeType = abslChargeType;
	}

	public String getAbslRef() {
		return this.abslRef;
	}

	public void setAbslRef(String abslRef) {
		this.abslRef = abslRef;
	}

	public Boolean getAbslConfirmed() {
		return this.abslConfirmed;
	}

	public void setAbslConfirmed(Boolean abslConfirmed) {
		this.abslConfirmed = abslConfirmed;
	}

	public Boolean getAbslInvPost() {
		return this.abslInvPost;
	}

	public void setAbslInvPost(Boolean abslInvPost) {
		this.abslInvPost = abslInvPost;
	}

	public Double getAbslExtPrice() {
		return this.abslExtPrice;
	}

	public void setAbslExtPrice(Double abslExtPrice) {
		this.abslExtPrice = abslExtPrice;
	}

	public String getAbslAcct() {
		return this.abslAcct;
	}

	public void setAbslAcct(String abslAcct) {
		this.abslAcct = abslAcct;
	}

	public String getAbslCc() {
		return this.abslCc;
	}

	public void setAbslCc(String abslCc) {
		this.abslCc = abslCc;
	}

	public Boolean getAbslTaxable() {
		return this.abslTaxable;
	}

	public void setAbslTaxable(Boolean abslTaxable) {
		this.abslTaxable = abslTaxable;
	}

	public String getAbslTaxc() {
		return this.abslTaxc;
	}

	public void setAbslTaxc(String abslTaxc) {
		this.abslTaxc = abslTaxc;
	}

	public String getAbslSub() {
		return this.abslSub;
	}

	public void setAbslSub(String abslSub) {
		this.abslSub = abslSub;
	}

	public String getAbslProject() {
		return this.abslProject;
	}

	public void setAbslProject(String abslProject) {
		this.abslProject = abslProject;
	}

	public String getAbslModUserid() {
		return this.abslModUserid;
	}

	public void setAbslModUserid(String abslModUserid) {
		this.abslModUserid = abslModUserid;
	}

	public Date getAbslModDate() {
		return this.abslModDate;
	}

	public void setAbslModDate(Date abslModDate) {
		this.abslModDate = abslModDate;
	}

	public String getAbslUserc01() {
		return this.abslUserc01;
	}

	public void setAbslUserc01(String abslUserc01) {
		this.abslUserc01 = abslUserc01;
	}

	public String getAbslUserc02() {
		return this.abslUserc02;
	}

	public void setAbslUserc02(String abslUserc02) {
		this.abslUserc02 = abslUserc02;
	}

	public String getAbslQadc01() {
		return this.abslQadc01;
	}

	public void setAbslQadc01(String abslQadc01) {
		this.abslQadc01 = abslQadc01;
	}

	public String getAbslQadc02() {
		return this.abslQadc02;
	}

	public void setAbslQadc02(String abslQadc02) {
		this.abslQadc02 = abslQadc02;
	}

	public Double getOidAbslDet() {
		return this.oidAbslDet;
	}

	public void setOidAbslDet(Double oidAbslDet) {
		this.oidAbslDet = oidAbslDet;
	}

}