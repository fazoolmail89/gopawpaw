package com.gopawpaw.erp.hibernate.r;

/**
 * RhdHistId entity. @author MyEclipse Persistence Tools
 */
public class RhdHistId extends AbstractRhdHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RhdHistId() {
	}

	/** minimal constructor */
	public RhdHistId(String rhdDomain) {
		super(rhdDomain);
	}

	/** full constructor */
	public RhdHistId(String rhdDomain, String rhdFileType, Integer rhdTrnbr) {
		super(rhdDomain, rhdFileType, rhdTrnbr);
	}

}
