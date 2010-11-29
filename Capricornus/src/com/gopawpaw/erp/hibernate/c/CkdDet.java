package com.gopawpaw.erp.hibernate.c;

/**
 * CkdDet entity. @author MyEclipse Persistence Tools
 */
public class CkdDet extends AbstractCkdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CkdDet() {
	}

	/** minimal constructor */
	public CkdDet(CkdDetId id, String ckdDyCode, String ckdDyNum,
			Double ckdExRate2, String ckdExRatetype, Integer ckdExruSeq,
			String ckdUnappliedRef, Double oidCkdDet) {
		super(id, ckdDyCode, ckdDyNum, ckdExRate2, ckdExRatetype, ckdExruSeq,
				ckdUnappliedRef, oidCkdDet);
	}

	/** full constructor */
	public CkdDet(CkdDetId id, Double ckdAmt, Double ckdDisc, String ckdUser1,
			String ckdUser2, Double ckdCurAmt, Double ckdCurDisc,
			Double ckdExRate, String ckdQadc01, String ckdDyCode,
			String ckdDyNum, Double ckdExRate2, String ckdExRatetype,
			Integer ckdExruSeq, String ckdUnappliedRef, Double oidCkdDet) {
		super(id, ckdAmt, ckdDisc, ckdUser1, ckdUser2, ckdCurAmt, ckdCurDisc,
				ckdExRate, ckdQadc01, ckdDyCode, ckdDyNum, ckdExRate2,
				ckdExRatetype, ckdExruSeq, ckdUnappliedRef, oidCkdDet);
	}

}
