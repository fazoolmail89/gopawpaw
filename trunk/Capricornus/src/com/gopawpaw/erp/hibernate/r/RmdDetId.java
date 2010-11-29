package com.gopawpaw.erp.hibernate.r;

/**
 * RmdDetId entity. @author MyEclipse Persistence Tools
 */
public class RmdDetId extends AbstractRmdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RmdDetId() {
	}

	/** minimal constructor */
	public RmdDetId(String rmdDomain, String rmdNbr) {
		super(rmdDomain, rmdNbr);
	}

	/** full constructor */
	public RmdDetId(String rmdDomain, String rmdNbr, String rmdPrefix,
			Integer rmdLine) {
		super(rmdDomain, rmdNbr, rmdPrefix, rmdLine);
	}

}
