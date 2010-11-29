package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbslDet entity. @author MyEclipse Persistence Tools
 */
public class AbslDet extends AbstractAbslDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbslDet() {
	}

	/** minimal constructor */
	public AbslDet(AbslDetId id, String abslInvNbr, String abslTrlCode,
			Double abslLcAmt, String abslChargeType, String abslRef,
			Boolean abslConfirmed, Boolean abslInvPost, Double abslExtPrice,
			String abslAcct, String abslCc, Boolean abslTaxable,
			String abslTaxc, String abslSub, String abslProject,
			String abslModUserid, String abslUserc01, String abslUserc02,
			String abslQadc01, String abslQadc02, Double oidAbslDet) {
		super(id, abslInvNbr, abslTrlCode, abslLcAmt, abslChargeType, abslRef,
				abslConfirmed, abslInvPost, abslExtPrice, abslAcct, abslCc,
				abslTaxable, abslTaxc, abslSub, abslProject, abslModUserid,
				abslUserc01, abslUserc02, abslQadc01, abslQadc02, oidAbslDet);
	}

	/** full constructor */
	public AbslDet(AbslDetId id, String abslInvNbr, String abslTrlCode,
			Double abslLcAmt, String abslChargeType, String abslRef,
			Boolean abslConfirmed, Boolean abslInvPost, Double abslExtPrice,
			String abslAcct, String abslCc, Boolean abslTaxable,
			String abslTaxc, String abslSub, String abslProject,
			String abslModUserid, Date abslModDate, String abslUserc01,
			String abslUserc02, String abslQadc01, String abslQadc02,
			Double oidAbslDet) {
		super(id, abslInvNbr, abslTrlCode, abslLcAmt, abslChargeType, abslRef,
				abslConfirmed, abslInvPost, abslExtPrice, abslAcct, abslCc,
				abslTaxable, abslTaxc, abslSub, abslProject, abslModUserid,
				abslModDate, abslUserc01, abslUserc02, abslQadc01, abslQadc02,
				oidAbslDet);
	}

}
