package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FaclCal entity. @author MyEclipse Persistence Tools
 */
public class FaclCal extends AbstractFaclCal implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FaclCal() {
	}

	/** minimal constructor */
	public FaclCal(FaclCalId id, String faclModUserid, Date faclModDate,
			String faclUser1, String faclUser2, String faclChr01,
			Double faclDec01, Boolean faclLog01, Integer faclInt01,
			String faclQadc01, Double faclQadd01, Boolean faclQadl01,
			Integer faclQadi01, Double oidFaclCal) {
		super(id, faclModUserid, faclModDate, faclUser1, faclUser2, faclChr01,
				faclDec01, faclLog01, faclInt01, faclQadc01, faclQadd01,
				faclQadl01, faclQadi01, oidFaclCal);
	}

	/** full constructor */
	public FaclCal(FaclCalId id, String faclModUserid, Date faclModDate,
			String faclUser1, String faclUser2, String faclChr01,
			Double faclDec01, Boolean faclLog01, Date faclDte01,
			Integer faclInt01, String faclQadc01, Double faclQadd01,
			Boolean faclQadl01, Integer faclQadi01, Date faclQadt01,
			Double oidFaclCal) {
		super(id, faclModUserid, faclModDate, faclUser1, faclUser2, faclChr01,
				faclDec01, faclLog01, faclDte01, faclInt01, faclQadc01,
				faclQadd01, faclQadl01, faclQadi01, faclQadt01, oidFaclCal);
	}

}
