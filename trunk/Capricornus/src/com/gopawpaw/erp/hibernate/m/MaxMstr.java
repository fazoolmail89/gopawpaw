package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MaxMstr entity. @author MyEclipse Persistence Tools
 */
public class MaxMstr extends AbstractMaxMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MaxMstr() {
	}

	/** minimal constructor */
	public MaxMstr(MaxMstrId id, Double oidMaxMstr) {
		super(id, oidMaxMstr);
	}

	/** full constructor */
	public MaxMstr(MaxMstrId id, String maxDesc, Date maxBegDate,
			Date maxEndDate, String maxBasis, Double maxMax, Double maxUsed,
			Double maxYrCost, Double maxCost, Double maxReduce,
			Integer maxBasisYr, Boolean maxTable, Double maxYrMax,
			Date maxModDate, String maxUserid, String maxQad02,
			String maxUser1, String maxUser2, Double oidMaxMstr) {
		super(id, maxDesc, maxBegDate, maxEndDate, maxBasis, maxMax, maxUsed,
				maxYrCost, maxCost, maxReduce, maxBasisYr, maxTable, maxYrMax,
				maxModDate, maxUserid, maxQad02, maxUser1, maxUser2, oidMaxMstr);
	}

}
