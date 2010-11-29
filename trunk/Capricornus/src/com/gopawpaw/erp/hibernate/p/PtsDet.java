package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtsDet entity. @author MyEclipse Persistence Tools
 */
public class PtsDet extends AbstractPtsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtsDet() {
	}

	/** minimal constructor */
	public PtsDet(PtsDetId id, Double oidPtsDet) {
		super(id, oidPtsDet);
	}

	/** full constructor */
	public PtsDet(PtsDetId id, Double ptsQtyPer, String ptsRmks,
			Integer ptsCmtindx, String ptsUser1, String ptsUser2,
			String ptsUserid, Date ptsModDate, String ptsQadc01,
			Double oidPtsDet) {
		super(id, ptsQtyPer, ptsRmks, ptsCmtindx, ptsUser1, ptsUser2,
				ptsUserid, ptsModDate, ptsQadc01, oidPtsDet);
	}

}
