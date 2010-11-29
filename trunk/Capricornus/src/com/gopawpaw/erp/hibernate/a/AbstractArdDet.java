package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbstractArdDet entity provides the base persistence definition of the ArdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractArdDet implements java.io.Serializable {

	// Fields

	private ArdDetId id;
	private Double ardAmt;
	private String ardDesc;
	private Double ardDisc;
	private String ardUser1;
	private String ardUser2;
	private String ardQad02;
	private Date ardQad01;
	private String ardProject;
	private Double ardCurAmt;
	private Double ardCurDisc;
	private Double ardExRate;
	private String ardTaxUsage;
	private String ardTaxc;
	private String ardDyCode;
	private String ardDyNum;
	private Double ardExRate2;
	private String ardExRatetype;
	private Integer ardDedNbr;
	private Integer ardExruSeq;
	private Double oidArdDet;

	// Constructors

	/** default constructor */
	public AbstractArdDet() {
	}

	/** minimal constructor */
	public AbstractArdDet(ArdDetId id, String ardDyCode, String ardDyNum,
			Double ardExRate2, String ardExRatetype, Integer ardExruSeq,
			Double oidArdDet) {
		this.id = id;
		this.ardDyCode = ardDyCode;
		this.ardDyNum = ardDyNum;
		this.ardExRate2 = ardExRate2;
		this.ardExRatetype = ardExRatetype;
		this.ardExruSeq = ardExruSeq;
		this.oidArdDet = oidArdDet;
	}

	/** full constructor */
	public AbstractArdDet(ArdDetId id, Double ardAmt, String ardDesc,
			Double ardDisc, String ardUser1, String ardUser2, String ardQad02,
			Date ardQad01, String ardProject, Double ardCurAmt,
			Double ardCurDisc, Double ardExRate, String ardTaxUsage,
			String ardTaxc, String ardDyCode, String ardDyNum,
			Double ardExRate2, String ardExRatetype, Integer ardDedNbr,
			Integer ardExruSeq, Double oidArdDet) {
		this.id = id;
		this.ardAmt = ardAmt;
		this.ardDesc = ardDesc;
		this.ardDisc = ardDisc;
		this.ardUser1 = ardUser1;
		this.ardUser2 = ardUser2;
		this.ardQad02 = ardQad02;
		this.ardQad01 = ardQad01;
		this.ardProject = ardProject;
		this.ardCurAmt = ardCurAmt;
		this.ardCurDisc = ardCurDisc;
		this.ardExRate = ardExRate;
		this.ardTaxUsage = ardTaxUsage;
		this.ardTaxc = ardTaxc;
		this.ardDyCode = ardDyCode;
		this.ardDyNum = ardDyNum;
		this.ardExRate2 = ardExRate2;
		this.ardExRatetype = ardExRatetype;
		this.ardDedNbr = ardDedNbr;
		this.ardExruSeq = ardExruSeq;
		this.oidArdDet = oidArdDet;
	}

	// Property accessors

	public ArdDetId getId() {
		return this.id;
	}

	public void setId(ArdDetId id) {
		this.id = id;
	}

	public Double getArdAmt() {
		return this.ardAmt;
	}

	public void setArdAmt(Double ardAmt) {
		this.ardAmt = ardAmt;
	}

	public String getArdDesc() {
		return this.ardDesc;
	}

	public void setArdDesc(String ardDesc) {
		this.ardDesc = ardDesc;
	}

	public Double getArdDisc() {
		return this.ardDisc;
	}

	public void setArdDisc(Double ardDisc) {
		this.ardDisc = ardDisc;
	}

	public String getArdUser1() {
		return this.ardUser1;
	}

	public void setArdUser1(String ardUser1) {
		this.ardUser1 = ardUser1;
	}

	public String getArdUser2() {
		return this.ardUser2;
	}

	public void setArdUser2(String ardUser2) {
		this.ardUser2 = ardUser2;
	}

	public String getArdQad02() {
		return this.ardQad02;
	}

	public void setArdQad02(String ardQad02) {
		this.ardQad02 = ardQad02;
	}

	public Date getArdQad01() {
		return this.ardQad01;
	}

	public void setArdQad01(Date ardQad01) {
		this.ardQad01 = ardQad01;
	}

	public String getArdProject() {
		return this.ardProject;
	}

	public void setArdProject(String ardProject) {
		this.ardProject = ardProject;
	}

	public Double getArdCurAmt() {
		return this.ardCurAmt;
	}

	public void setArdCurAmt(Double ardCurAmt) {
		this.ardCurAmt = ardCurAmt;
	}

	public Double getArdCurDisc() {
		return this.ardCurDisc;
	}

	public void setArdCurDisc(Double ardCurDisc) {
		this.ardCurDisc = ardCurDisc;
	}

	public Double getArdExRate() {
		return this.ardExRate;
	}

	public void setArdExRate(Double ardExRate) {
		this.ardExRate = ardExRate;
	}

	public String getArdTaxUsage() {
		return this.ardTaxUsage;
	}

	public void setArdTaxUsage(String ardTaxUsage) {
		this.ardTaxUsage = ardTaxUsage;
	}

	public String getArdTaxc() {
		return this.ardTaxc;
	}

	public void setArdTaxc(String ardTaxc) {
		this.ardTaxc = ardTaxc;
	}

	public String getArdDyCode() {
		return this.ardDyCode;
	}

	public void setArdDyCode(String ardDyCode) {
		this.ardDyCode = ardDyCode;
	}

	public String getArdDyNum() {
		return this.ardDyNum;
	}

	public void setArdDyNum(String ardDyNum) {
		this.ardDyNum = ardDyNum;
	}

	public Double getArdExRate2() {
		return this.ardExRate2;
	}

	public void setArdExRate2(Double ardExRate2) {
		this.ardExRate2 = ardExRate2;
	}

	public String getArdExRatetype() {
		return this.ardExRatetype;
	}

	public void setArdExRatetype(String ardExRatetype) {
		this.ardExRatetype = ardExRatetype;
	}

	public Integer getArdDedNbr() {
		return this.ardDedNbr;
	}

	public void setArdDedNbr(Integer ardDedNbr) {
		this.ardDedNbr = ardDedNbr;
	}

	public Integer getArdExruSeq() {
		return this.ardExruSeq;
	}

	public void setArdExruSeq(Integer ardExruSeq) {
		this.ardExruSeq = ardExruSeq;
	}

	public Double getOidArdDet() {
		return this.oidArdDet;
	}

	public void setOidArdDet(Double oidArdDet) {
		this.oidArdDet = oidArdDet;
	}

}