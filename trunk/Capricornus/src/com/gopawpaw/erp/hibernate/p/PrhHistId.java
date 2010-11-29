package com.gopawpaw.erp.hibernate.p;

/**
 * PrhHistId entity. @author MyEclipse Persistence Tools
 */
public class PrhHistId extends AbstractPrhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PrhHistId() {
	}

	/** minimal constructor */
	public PrhHistId(String prhDomain) {
		super(prhDomain);
	}

	/** full constructor */
	public PrhHistId(String prhDomain, String prhNbr, String prhReceiver,
			Integer prhLine, String prhElement) {
		super(prhDomain, prhNbr, prhReceiver, prhLine, prhElement);
	}

}
