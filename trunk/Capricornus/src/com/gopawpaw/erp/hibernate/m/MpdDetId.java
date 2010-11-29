package com.gopawpaw.erp.hibernate.m;

/**
 * MpdDetId entity. @author MyEclipse Persistence Tools
 */
public class MpdDetId extends AbstractMpdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MpdDetId() {
	}

	/** minimal constructor */
	public MpdDetId(String mpdDomain) {
		super(mpdDomain);
	}

	/** full constructor */
	public MpdDetId(String mpdDomain, String mpdNbr, String mpdType) {
		super(mpdDomain, mpdNbr, mpdType);
	}

}
