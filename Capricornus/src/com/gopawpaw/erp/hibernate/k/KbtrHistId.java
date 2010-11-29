package com.gopawpaw.erp.hibernate.k;

/**
 * KbtrHistId entity. @author MyEclipse Persistence Tools
 */
public class KbtrHistId extends AbstractKbtrHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbtrHistId() {
	}

	/** full constructor */
	public KbtrHistId(String kbtrDomain, Integer kbtrTransNbr) {
		super(kbtrDomain, kbtrTransNbr);
	}

}
