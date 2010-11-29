package com.gopawpaw.erp.hibernate.s;

/**
 * SfhHistId entity. @author MyEclipse Persistence Tools
 */
public class SfhHistId extends AbstractSfhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SfhHistId() {
	}

	/** minimal constructor */
	public SfhHistId(String sfhDomain) {
		super(sfhDomain);
	}

	/** full constructor */
	public SfhHistId(String sfhDomain, Integer sfhTrnbr) {
		super(sfhDomain, sfhTrnbr);
	}

}
