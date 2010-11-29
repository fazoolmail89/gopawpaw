package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VecMstr entity. @author MyEclipse Persistence Tools
 */
public class VecMstr extends AbstractVecMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VecMstr() {
	}

	/** minimal constructor */
	public VecMstr(VecMstrId id, Double oidVecMstr) {
		super(id, oidVecMstr);
	}

	/** full constructor */
	public VecMstr(VecMstrId id, Boolean vecActiveFlag, String vecName,
			String vecDesc, Integer vecMaxPoints, Integer vecThresholdPoints,
			String vecCompMethod, Integer vecPpFactor, Boolean vecPpCounter,
			Boolean vecDiscreteType, Boolean vecTableLookupFlag,
			String vecModUserid, Date vecModDate, String vecUser1,
			String vecUser2, String vecUser3, String vecUser4,
			String vecQadc01, String vecQadc02, String vecQadc03,
			String vecQadc04, Double vecQadd01, Double vecQadd02,
			Boolean vecQadl01, Boolean vecQadl02, Date vecQadt01,
			Date vecQadt02, Integer vecQadi01, Integer vecQadi02,
			Double oidVecMstr) {
		super(id, vecActiveFlag, vecName, vecDesc, vecMaxPoints,
				vecThresholdPoints, vecCompMethod, vecPpFactor, vecPpCounter,
				vecDiscreteType, vecTableLookupFlag, vecModUserid, vecModDate,
				vecUser1, vecUser2, vecUser3, vecUser4, vecQadc01, vecQadc02,
				vecQadc03, vecQadc04, vecQadd01, vecQadd02, vecQadl01,
				vecQadl02, vecQadt01, vecQadt02, vecQadi01, vecQadi02,
				oidVecMstr);
	}

}
