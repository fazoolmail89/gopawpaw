package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FabdDet entity. @author MyEclipse Persistence Tools
 */
public class FabdDet extends AbstractFabdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabdDet() {
	}

	/** minimal constructor */
	public FabdDet(FabdDetId id, String fabdFaId, String fabdFabkId,
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
		super(id, fabdFaId, fabdFabkId, fabdFalocId, fabdFaclsId, fabdYrper,
				fabdAdjYrper, fabdPost, fabdAccamt, fabdPeramt, fabdQadl03,
				fabdRetired, fabdTransfer, fabdResrv, fabdResrvType,
				fabdSuspend, fabdUpper, fabdAccup, fabdTrnLoc, fabdGlseq,
				fabdQadl04, fabdRtPeriod, fabdModUserid, fabdModDate,
				fabdUser1, fabdUser2, fabdChr01, fabdDec01, fabdLog01,
				fabdInt01, fabdQadc01, fabdQadc02, fabdQadd01, fabdQadl01,
				fabdQadi01, fabdQadd02, fabdQadi02, fabdQadl02, fabdEntity,
				fabdTrnGlseq, fabdTrnEntity, fabdMigrate, oidFabdDet);
	}

	/** full constructor */
	public FabdDet(FabdDetId id, String fabdFaId, String fabdFabkId,
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
		super(id, fabdFaId, fabdFabkId, fabdFalocId, fabdFaclsId, fabdYrper,
				fabdAdjYrper, fabdPost, fabdAccamt, fabdPeramt, fabdQadl03,
				fabdRetired, fabdTransfer, fabdResrv, fabdResrvType,
				fabdSuspend, fabdUpper, fabdAccup, fabdTrnLoc, fabdGlseq,
				fabdQadl04, fabdRtPeriod, fabdModUserid, fabdModDate,
				fabdUser1, fabdUser2, fabdChr01, fabdDec01, fabdLog01,
				fabdDte01, fabdInt01, fabdQadc01, fabdQadc02, fabdQadd01,
				fabdQadl01, fabdQadi01, fabdQadt01, fabdQadd02, fabdQadi02,
				fabdQadl02, fabdQadt02, fabdEntity, fabdTrnGlseq,
				fabdTrnEntity, fabdMigrate, oidFabdDet);
	}

}
