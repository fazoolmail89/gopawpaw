package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtrDet entity. @author MyEclipse Persistence Tools
 */
public class PtrDet extends AbstractPtrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtrDet() {
	}

	/** minimal constructor */
	public PtrDet(PtrDetId id, Double oidPtrDet) {
		super(id, oidPtrDet);
	}

	/** full constructor */
	public PtrDet(PtrDetId id, Date ptrEnd, String ptrUser1, String ptrUser2,
			String ptrUserid, Date ptrModDate, Date ptrApprdate,
			String ptrApprId, Double ptrBatch, Double ptrBurden,
			Integer ptrCmtindx, Double ptrLabor, Double ptrMaterial,
			Double ptrOverhead, Double ptrSubcontract, Double ptrTotalCost,
			String ptrQadc01, Double oidPtrDet) {
		super(id, ptrEnd, ptrUser1, ptrUser2, ptrUserid, ptrModDate,
				ptrApprdate, ptrApprId, ptrBatch, ptrBurden, ptrCmtindx,
				ptrLabor, ptrMaterial, ptrOverhead, ptrSubcontract,
				ptrTotalCost, ptrQadc01, oidPtrDet);
	}

}
