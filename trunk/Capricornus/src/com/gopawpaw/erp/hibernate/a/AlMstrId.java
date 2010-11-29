package com.gopawpaw.erp.hibernate.a;

/**
 * AlMstrId entity. @author MyEclipse Persistence Tools
 */
public class AlMstrId extends AbstractAlMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AlMstrId() {
	}

	/** minimal constructor */
	public AlMstrId(String alDomain) {
		super(alDomain);
	}

	/** full constructor */
	public AlMstrId(String alDomain, String alCode) {
		super(alDomain, alCode);
	}

}
