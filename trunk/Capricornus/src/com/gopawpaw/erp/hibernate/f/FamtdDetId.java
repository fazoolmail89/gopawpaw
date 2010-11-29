package com.gopawpaw.erp.hibernate.f;

/**
 * FamtdDetId entity. @author MyEclipse Persistence Tools
 */
public class FamtdDetId extends AbstractFamtdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FamtdDetId() {
	}

	/** full constructor */
	public FamtdDetId(String famtdDomain, String famtdFamtId,
			Integer famtdYear, Integer famtdPeriod) {
		super(famtdDomain, famtdFamtId, famtdYear, famtdPeriod);
	}

}
