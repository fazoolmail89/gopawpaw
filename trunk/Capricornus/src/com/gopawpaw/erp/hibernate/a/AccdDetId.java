package com.gopawpaw.erp.hibernate.a;

/**
 * AccdDetId entity. @author MyEclipse Persistence Tools
 */
public class AccdDetId extends AbstractAccdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AccdDetId() {
	}

	/** full constructor */
	public AccdDetId(String accdAsset, String accdBook, Integer accdLine) {
		super(accdAsset, accdBook, accdLine);
	}

}
