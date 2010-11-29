package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SapDet entity. @author MyEclipse Persistence Tools
 */
public class SapDet extends AbstractSapDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SapDet() {
	}

	/** minimal constructor */
	public SapDet(SapDetId id, Double oidSapDet) {
		super(id, oidSapDet);
	}

	/** full constructor */
	public SapDet(SapDetId id, Date sapActDate, String sapCaNbr,
			String sapDesc, String sapBomType, String sapUser1,
			String sapUser2, Boolean sapConfirmed, String sapGroup,
			Boolean sapMrp, String sapAssign, String sapModUserid,
			Date sapModDate, String sapQadc01, String sapQadc02,
			Date sapQadd01, Date sapQadd02, Boolean sapQadl01,
			Boolean sapQadl02, Integer sapQadi01, Integer sapQadi02,
			Double oidSapDet) {
		super(id, sapActDate, sapCaNbr, sapDesc, sapBomType, sapUser1,
				sapUser2, sapConfirmed, sapGroup, sapMrp, sapAssign,
				sapModUserid, sapModDate, sapQadc01, sapQadc02, sapQadd01,
				sapQadd02, sapQadl01, sapQadl02, sapQadi01, sapQadi02,
				oidSapDet);
	}

}
