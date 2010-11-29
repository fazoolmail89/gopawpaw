package com.gopawpaw.erp.hibernate.s;

/**
 * SodlcDetId entity. @author MyEclipse Persistence Tools
 */
public class SodlcDetId extends AbstractSodlcDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SodlcDetId() {
	}

	/** full constructor */
	public SodlcDetId(String sodlcDomain, String sodlcOrder,
			Integer sodlcOrdLine, Integer sodlcLcLine) {
		super(sodlcDomain, sodlcOrder, sodlcOrdLine, sodlcLcLine);
	}

}
