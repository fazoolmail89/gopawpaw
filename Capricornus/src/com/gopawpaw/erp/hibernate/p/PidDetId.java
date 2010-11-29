package com.gopawpaw.erp.hibernate.p;

/**
 * PidDetId entity. @author MyEclipse Persistence Tools
 */
public class PidDetId extends AbstractPidDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PidDetId() {
	}

	/** minimal constructor */
	public PidDetId(String pidDomain) {
		super(pidDomain);
	}

	/** full constructor */
	public PidDetId(String pidDomain, String pidListId, Double pidQty) {
		super(pidDomain, pidListId, pidQty);
	}

}
