package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtsDet entity provides the base persistence definition of the PtsDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtsDet implements java.io.Serializable {

	// Fields

	private PtsDetId id;
	private Double ptsQtyPer;
	private String ptsRmks;
	private Integer ptsCmtindx;
	private String ptsUser1;
	private String ptsUser2;
	private String ptsUserid;
	private Date ptsModDate;
	private String ptsQadc01;
	private Double oidPtsDet;

	// Constructors

	/** default constructor */
	public AbstractPtsDet() {
	}

	/** minimal constructor */
	public AbstractPtsDet(PtsDetId id, Double oidPtsDet) {
		this.id = id;
		this.oidPtsDet = oidPtsDet;
	}

	/** full constructor */
	public AbstractPtsDet(PtsDetId id, Double ptsQtyPer, String ptsRmks,
			Integer ptsCmtindx, String ptsUser1, String ptsUser2,
			String ptsUserid, Date ptsModDate, String ptsQadc01,
			Double oidPtsDet) {
		this.id = id;
		this.ptsQtyPer = ptsQtyPer;
		this.ptsRmks = ptsRmks;
		this.ptsCmtindx = ptsCmtindx;
		this.ptsUser1 = ptsUser1;
		this.ptsUser2 = ptsUser2;
		this.ptsUserid = ptsUserid;
		this.ptsModDate = ptsModDate;
		this.ptsQadc01 = ptsQadc01;
		this.oidPtsDet = oidPtsDet;
	}

	// Property accessors

	public PtsDetId getId() {
		return this.id;
	}

	public void setId(PtsDetId id) {
		this.id = id;
	}

	public Double getPtsQtyPer() {
		return this.ptsQtyPer;
	}

	public void setPtsQtyPer(Double ptsQtyPer) {
		this.ptsQtyPer = ptsQtyPer;
	}

	public String getPtsRmks() {
		return this.ptsRmks;
	}

	public void setPtsRmks(String ptsRmks) {
		this.ptsRmks = ptsRmks;
	}

	public Integer getPtsCmtindx() {
		return this.ptsCmtindx;
	}

	public void setPtsCmtindx(Integer ptsCmtindx) {
		this.ptsCmtindx = ptsCmtindx;
	}

	public String getPtsUser1() {
		return this.ptsUser1;
	}

	public void setPtsUser1(String ptsUser1) {
		this.ptsUser1 = ptsUser1;
	}

	public String getPtsUser2() {
		return this.ptsUser2;
	}

	public void setPtsUser2(String ptsUser2) {
		this.ptsUser2 = ptsUser2;
	}

	public String getPtsUserid() {
		return this.ptsUserid;
	}

	public void setPtsUserid(String ptsUserid) {
		this.ptsUserid = ptsUserid;
	}

	public Date getPtsModDate() {
		return this.ptsModDate;
	}

	public void setPtsModDate(Date ptsModDate) {
		this.ptsModDate = ptsModDate;
	}

	public String getPtsQadc01() {
		return this.ptsQadc01;
	}

	public void setPtsQadc01(String ptsQadc01) {
		this.ptsQadc01 = ptsQadc01;
	}

	public Double getOidPtsDet() {
		return this.oidPtsDet;
	}

	public void setOidPtsDet(Double oidPtsDet) {
		this.oidPtsDet = oidPtsDet;
	}

}