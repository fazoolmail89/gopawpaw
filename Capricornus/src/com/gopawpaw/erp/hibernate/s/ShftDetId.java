package com.gopawpaw.erp.hibernate.s;

/**
 * ShftDetId entity. @author MyEclipse Persistence Tools
 */
public class ShftDetId extends AbstractShftDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShftDetId() {
	}

	/** minimal constructor */
	public ShftDetId(String shftDomain) {
		super(shftDomain);
	}

	/** full constructor */
	public ShftDetId(String shftDomain, String shftSite, String shftWkctr,
			String shftMch, Integer shftDay) {
		super(shftDomain, shftSite, shftWkctr, shftMch, shftDay);
	}

}
