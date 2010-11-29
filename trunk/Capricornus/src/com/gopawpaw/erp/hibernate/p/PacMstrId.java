package com.gopawpaw.erp.hibernate.p;

/**
 * PacMstrId entity. @author MyEclipse Persistence Tools
 */
public class PacMstrId extends AbstractPacMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PacMstrId() {
	}

	/** minimal constructor */
	public PacMstrId(String pacDomain) {
		super(pacDomain);
	}

	/** full constructor */
	public PacMstrId(String pacDomain, String pacCode) {
		super(pacDomain, pacCode);
	}

}
