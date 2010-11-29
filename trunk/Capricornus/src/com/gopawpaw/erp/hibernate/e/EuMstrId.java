package com.gopawpaw.erp.hibernate.e;

/**
 * EuMstrId entity. @author MyEclipse Persistence Tools
 */
public class EuMstrId extends AbstractEuMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EuMstrId() {
	}

	/** minimal constructor */
	public EuMstrId(String euDomain) {
		super(euDomain);
	}

	/** full constructor */
	public EuMstrId(String euDomain, String euAddr) {
		super(euDomain, euAddr);
	}

}
