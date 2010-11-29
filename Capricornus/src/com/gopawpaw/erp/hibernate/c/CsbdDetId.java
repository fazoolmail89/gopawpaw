package com.gopawpaw.erp.hibernate.c;

/**
 * CsbdDetId entity. @author MyEclipse Persistence Tools
 */
public class CsbdDetId extends AbstractCsbdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsbdDetId() {
	}

	/** full constructor */
	public CsbdDetId(String csbdDomain, String csbdAddr, String csbdBank,
			String csbdType) {
		super(csbdDomain, csbdAddr, csbdBank, csbdType);
	}

}
