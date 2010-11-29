package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PigMstr entity. @author MyEclipse Persistence Tools
 */
public class PigMstr extends AbstractPigMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PigMstr() {
	}

	/** minimal constructor */
	public PigMstr(PigMstrId id, Double oidPigMstr) {
		super(id, oidPigMstr);
	}

	/** full constructor */
	public PigMstr(PigMstrId id, Boolean pigAllCusts, Boolean pigAllItems,
			String pigCurr, String pigDesc, String pigDiv, Date pigExpire,
			String pigList, String pigListId, Integer pigPriority,
			String pigRefCode, Integer pigRefType, Date pigStart,
			String pigValType, String pigUser1, String pigUser2,
			String pigQadc01, String pigQadc02, String pigQadc03,
			Double pigQadd01, Double pigQadd02, Integer pigQadi01,
			Integer pigQadi02, Boolean pigQadl01, Boolean pigQadl02,
			Date pigQadt01, Date pigQadt02, Integer pigSrchType,
			Double oidPigMstr) {
		super(id, pigAllCusts, pigAllItems, pigCurr, pigDesc, pigDiv,
				pigExpire, pigList, pigListId, pigPriority, pigRefCode,
				pigRefType, pigStart, pigValType, pigUser1, pigUser2,
				pigQadc01, pigQadc02, pigQadc03, pigQadd01, pigQadd02,
				pigQadi01, pigQadi02, pigQadl01, pigQadl02, pigQadt01,
				pigQadt02, pigSrchType, oidPigMstr);
	}

}
