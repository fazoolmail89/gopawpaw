package com.gopawpaw.erp.hibernate.p;

/**
 * PtvDetId entity. @author MyEclipse Persistence Tools
 */
public class PtvDetId extends AbstractPtvDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtvDetId() {
	}

	/** full constructor */
	public PtvDetId(String ptvDomain, String ptvPart, String ptvCtryExp,
			String ptvCtryImp) {
		super(ptvDomain, ptvPart, ptvCtryExp, ptvCtryImp);
	}

}
