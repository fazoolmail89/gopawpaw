package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EshMstrId entity. @author MyEclipse Persistence Tools
 */
public class EshMstrId extends AbstractEshMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EshMstrId() {
	}

	/** minimal constructor */
	public EshMstrId(String eshDomain) {
		super(eshDomain);
	}

	/** full constructor */
	public EshMstrId(String eshDomain, String eshSchedule, Date eshStartEff) {
		super(eshDomain, eshSchedule, eshStartEff);
	}

}
