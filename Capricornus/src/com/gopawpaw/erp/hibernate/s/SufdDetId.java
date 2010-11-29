package com.gopawpaw.erp.hibernate.s;

/**
 * SufdDetId entity. @author MyEclipse Persistence Tools
 */
public class SufdDetId extends AbstractSufdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SufdDetId() {
	}

	/** full constructor */
	public SufdDetId(String sufdDomain, String sufdShipfrom, String sufdShipto,
			Integer sufdLevel, Integer sufdFldSeq) {
		super(sufdDomain, sufdShipfrom, sufdShipto, sufdLevel, sufdFldSeq);
	}

}
