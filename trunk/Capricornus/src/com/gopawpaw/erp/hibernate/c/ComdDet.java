package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * ComdDet entity. @author MyEclipse Persistence Tools
 */
public class ComdDet extends AbstractComdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ComdDet() {
	}

	/** minimal constructor */
	public ComdDet(ComdDetId id, Double oidComdDet) {
		super(id, oidComdDet);
	}

	/** full constructor */
	public ComdDet(ComdDetId id, String comdUser1, String comdUser2,
			String comdUser3, String comdUser4, String comdQadc01,
			String comdQadc02, String comdQadc03, String comdQadc04,
			Double comdQadd01, Double comdQadd02, Boolean comdQadl01,
			Boolean comdQadl02, Date comdQadt01, Date comdQadt02,
			Integer comdQadi01, Integer comdQadi02, Double oidComdDet) {
		super(id, comdUser1, comdUser2, comdUser3, comdUser4, comdQadc01,
				comdQadc02, comdQadc03, comdQadc04, comdQadd01, comdQadd02,
				comdQadl01, comdQadl02, comdQadt01, comdQadt02, comdQadi01,
				comdQadi02, oidComdDet);
	}

}
