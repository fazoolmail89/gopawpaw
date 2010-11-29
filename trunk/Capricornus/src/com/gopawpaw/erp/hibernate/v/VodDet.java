package com.gopawpaw.erp.hibernate.v;

/**
 * VodDet entity. @author MyEclipse Persistence Tools
 */
public class VodDet extends AbstractVodDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VodDet() {
	}

	/** minimal constructor */
	public VodDet(VodDetId id, String vodDyCode, String vodDyNum,
			Double vodBaseAmt, Integer vodPjsLine, Double oidVodDet) {
		super(id, vodDyCode, vodDyNum, vodBaseAmt, vodPjsLine, oidVodDet);
	}

	/** full constructor */
	public VodDet(VodDetId id, String vodAcct, String vodCc, String vodProject,
			String vodDesc, Double vodAmt, String vodType, String vodUser1,
			String vodUser2, String vodEntity, String vodTaxAt, String vodTax,
			String vodTaxUsage, String vodTaxc, String vodExpAcct,
			String vodExpCc, String vodQadc01, Boolean vodTaxable,
			String vodTaxEnv, Boolean vodTaxIn, String vodDyCode,
			String vodDyNum, Double vodBaseAmt, String vodSub,
			String vodExpSub, Integer vodPjsLine, Double oidVodDet) {
		super(id, vodAcct, vodCc, vodProject, vodDesc, vodAmt, vodType,
				vodUser1, vodUser2, vodEntity, vodTaxAt, vodTax, vodTaxUsage,
				vodTaxc, vodExpAcct, vodExpCc, vodQadc01, vodTaxable,
				vodTaxEnv, vodTaxIn, vodDyCode, vodDyNum, vodBaseAmt, vodSub,
				vodExpSub, vodPjsLine, oidVodDet);
	}

}
