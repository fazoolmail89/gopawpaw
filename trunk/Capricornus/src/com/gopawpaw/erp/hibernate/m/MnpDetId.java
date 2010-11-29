package com.gopawpaw.erp.hibernate.m;

/**
 * MnpDetId entity. @author MyEclipse Persistence Tools
 */
public class MnpDetId extends AbstractMnpDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MnpDetId() {
	}

	/** minimal constructor */
	public MnpDetId(String mnpDomain) {
		super(mnpDomain);
	}

	/** full constructor */
	public MnpDetId(String mnpDomain, String mnpProgram, String mnpUserid,
			Integer mnpSequence, String mnpProgType) {
		super(mnpDomain, mnpProgram, mnpUserid, mnpSequence, mnpProgType);
	}

}
