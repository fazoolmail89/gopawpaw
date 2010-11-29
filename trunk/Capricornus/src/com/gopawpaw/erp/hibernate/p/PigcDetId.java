package com.gopawpaw.erp.hibernate.p;

/**
 * PigcDetId entity. @author MyEclipse Persistence Tools
 */
public class PigcDetId extends AbstractPigcDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PigcDetId() {
	}

	/** minimal constructor */
	public PigcDetId(String pigcDomain) {
		super(pigcDomain);
	}

	/** full constructor */
	public PigcDetId(String pigcDomain, String pigcCode, Integer pigcMemType,
			String pigcMemRef, String pigcAmtType) {
		super(pigcDomain, pigcCode, pigcMemType, pigcMemRef, pigcAmtType);
	}

}
