package com.gopawpaw.erp.hibernate.p;

/**
 * PigpDetId entity. @author MyEclipse Persistence Tools
 */
public class PigpDetId extends AbstractPigpDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PigpDetId() {
	}

	/** minimal constructor */
	public PigpDetId(String pigpDomain) {
		super(pigpDomain);
	}

	/** full constructor */
	public PigpDetId(String pigpDomain, String pigpCode, Integer pigpProdType,
			String pigpProdRef, String pigpAmtType) {
		super(pigpDomain, pigpCode, pigpProdType, pigpProdRef, pigpAmtType);
	}

}
