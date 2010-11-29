package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * AbstractPtrDet entity provides the base persistence definition of the PtrDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPtrDet implements java.io.Serializable {

	// Fields

	private PtrDetId id;
	private Date ptrEnd;
	private String ptrUser1;
	private String ptrUser2;
	private String ptrUserid;
	private Date ptrModDate;
	private Date ptrApprdate;
	private String ptrApprId;
	private Double ptrBatch;
	private Double ptrBurden;
	private Integer ptrCmtindx;
	private Double ptrLabor;
	private Double ptrMaterial;
	private Double ptrOverhead;
	private Double ptrSubcontract;
	private Double ptrTotalCost;
	private String ptrQadc01;
	private Double oidPtrDet;

	// Constructors

	/** default constructor */
	public AbstractPtrDet() {
	}

	/** minimal constructor */
	public AbstractPtrDet(PtrDetId id, Double oidPtrDet) {
		this.id = id;
		this.oidPtrDet = oidPtrDet;
	}

	/** full constructor */
	public AbstractPtrDet(PtrDetId id, Date ptrEnd, String ptrUser1,
			String ptrUser2, String ptrUserid, Date ptrModDate,
			Date ptrApprdate, String ptrApprId, Double ptrBatch,
			Double ptrBurden, Integer ptrCmtindx, Double ptrLabor,
			Double ptrMaterial, Double ptrOverhead, Double ptrSubcontract,
			Double ptrTotalCost, String ptrQadc01, Double oidPtrDet) {
		this.id = id;
		this.ptrEnd = ptrEnd;
		this.ptrUser1 = ptrUser1;
		this.ptrUser2 = ptrUser2;
		this.ptrUserid = ptrUserid;
		this.ptrModDate = ptrModDate;
		this.ptrApprdate = ptrApprdate;
		this.ptrApprId = ptrApprId;
		this.ptrBatch = ptrBatch;
		this.ptrBurden = ptrBurden;
		this.ptrCmtindx = ptrCmtindx;
		this.ptrLabor = ptrLabor;
		this.ptrMaterial = ptrMaterial;
		this.ptrOverhead = ptrOverhead;
		this.ptrSubcontract = ptrSubcontract;
		this.ptrTotalCost = ptrTotalCost;
		this.ptrQadc01 = ptrQadc01;
		this.oidPtrDet = oidPtrDet;
	}

	// Property accessors

	public PtrDetId getId() {
		return this.id;
	}

	public void setId(PtrDetId id) {
		this.id = id;
	}

	public Date getPtrEnd() {
		return this.ptrEnd;
	}

	public void setPtrEnd(Date ptrEnd) {
		this.ptrEnd = ptrEnd;
	}

	public String getPtrUser1() {
		return this.ptrUser1;
	}

	public void setPtrUser1(String ptrUser1) {
		this.ptrUser1 = ptrUser1;
	}

	public String getPtrUser2() {
		return this.ptrUser2;
	}

	public void setPtrUser2(String ptrUser2) {
		this.ptrUser2 = ptrUser2;
	}

	public String getPtrUserid() {
		return this.ptrUserid;
	}

	public void setPtrUserid(String ptrUserid) {
		this.ptrUserid = ptrUserid;
	}

	public Date getPtrModDate() {
		return this.ptrModDate;
	}

	public void setPtrModDate(Date ptrModDate) {
		this.ptrModDate = ptrModDate;
	}

	public Date getPtrApprdate() {
		return this.ptrApprdate;
	}

	public void setPtrApprdate(Date ptrApprdate) {
		this.ptrApprdate = ptrApprdate;
	}

	public String getPtrApprId() {
		return this.ptrApprId;
	}

	public void setPtrApprId(String ptrApprId) {
		this.ptrApprId = ptrApprId;
	}

	public Double getPtrBatch() {
		return this.ptrBatch;
	}

	public void setPtrBatch(Double ptrBatch) {
		this.ptrBatch = ptrBatch;
	}

	public Double getPtrBurden() {
		return this.ptrBurden;
	}

	public void setPtrBurden(Double ptrBurden) {
		this.ptrBurden = ptrBurden;
	}

	public Integer getPtrCmtindx() {
		return this.ptrCmtindx;
	}

	public void setPtrCmtindx(Integer ptrCmtindx) {
		this.ptrCmtindx = ptrCmtindx;
	}

	public Double getPtrLabor() {
		return this.ptrLabor;
	}

	public void setPtrLabor(Double ptrLabor) {
		this.ptrLabor = ptrLabor;
	}

	public Double getPtrMaterial() {
		return this.ptrMaterial;
	}

	public void setPtrMaterial(Double ptrMaterial) {
		this.ptrMaterial = ptrMaterial;
	}

	public Double getPtrOverhead() {
		return this.ptrOverhead;
	}

	public void setPtrOverhead(Double ptrOverhead) {
		this.ptrOverhead = ptrOverhead;
	}

	public Double getPtrSubcontract() {
		return this.ptrSubcontract;
	}

	public void setPtrSubcontract(Double ptrSubcontract) {
		this.ptrSubcontract = ptrSubcontract;
	}

	public Double getPtrTotalCost() {
		return this.ptrTotalCost;
	}

	public void setPtrTotalCost(Double ptrTotalCost) {
		this.ptrTotalCost = ptrTotalCost;
	}

	public String getPtrQadc01() {
		return this.ptrQadc01;
	}

	public void setPtrQadc01(String ptrQadc01) {
		this.ptrQadc01 = ptrQadc01;
	}

	public Double getOidPtrDet() {
		return this.oidPtrDet;
	}

	public void setOidPtrDet(Double oidPtrDet) {
		this.oidPtrDet = oidPtrDet;
	}

}