package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PsMstrId entity. @author MyEclipse Persistence Tools
 */
public class PsMstrId extends AbstractPsMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PsMstrId() {
	}

	/** minimal constructor */
	public PsMstrId(String psDomain, String psPar, String psComp) {
		super(psDomain, psPar, psComp);
	}

	/** full constructor */
	public PsMstrId(String psDomain, String psPar, String psComp, String psRef,
			Date psStart) {
		super(psDomain, psPar, psComp, psRef, psStart);
	}

}
