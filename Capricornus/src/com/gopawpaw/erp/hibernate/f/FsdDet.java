package com.gopawpaw.erp.hibernate.f;

/**
 * FsdDet entity. @author MyEclipse Persistence Tools
 */
public class FsdDet extends AbstractFsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FsdDet() {
	}

	/** minimal constructor */
	public FsdDet(FsdDetId id, Double oidFsdDet) {
		super(id, oidFsdDet);
	}

	/** full constructor */
	public FsdDet(FsdDetId id, String fsdLoc, String fsdLotser,
			Double fsdQtyTran, String fsdSite, String fsdUser1,
			String fsdUser2, String fsdRef, String fsdRev, String fsdStatus,
			Double fsdQtyPost, String fsdRetLoc, String fsdRetSite,
			String fsdChr01, String fsdChr02, Integer fsdInt01,
			Double fsdDec01, Boolean fsdLog01, String fsdQadc01,
			String fsdQadc02, Integer fsdQadi01, Double fsdQadd01,
			Boolean fsdQadl01, String fsdInvRef, Integer fsdIsbRef,
			String fsdQadc03, Integer fsdQadi02, Double fsdQadd02,
			Boolean fsdQadl02, Double oidFsdDet) {
		super(id, fsdLoc, fsdLotser, fsdQtyTran, fsdSite, fsdUser1, fsdUser2,
				fsdRef, fsdRev, fsdStatus, fsdQtyPost, fsdRetLoc, fsdRetSite,
				fsdChr01, fsdChr02, fsdInt01, fsdDec01, fsdLog01, fsdQadc01,
				fsdQadc02, fsdQadi01, fsdQadd01, fsdQadl01, fsdInvRef,
				fsdIsbRef, fsdQadc03, fsdQadi02, fsdQadd02, fsdQadl02,
				oidFsdDet);
	}

}
