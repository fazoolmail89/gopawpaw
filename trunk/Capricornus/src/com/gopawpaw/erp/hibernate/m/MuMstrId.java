package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MuMstrId entity. @author MyEclipse Persistence Tools
 */
public class MuMstrId extends AbstractMuMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MuMstrId() {
	}

	/** full constructor */
	public MuMstrId(String muDomain, String muMemberCurr, Date muStartDate) {
		super(muDomain, muMemberCurr, muStartDate);
	}

}
