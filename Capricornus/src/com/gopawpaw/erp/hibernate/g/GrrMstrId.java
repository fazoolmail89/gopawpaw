package com.gopawpaw.erp.hibernate.g;

/**
 * GrrMstrId entity. @author MyEclipse Persistence Tools
 */
public class GrrMstrId extends AbstractGrrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrrMstrId() {
	}

	/** minimal constructor */
	public GrrMstrId(String grrDomain) {
		super(grrDomain);
	}

	/** full constructor */
	public GrrMstrId(String grrDomain, String grrRowGroup) {
		super(grrDomain, grrRowGroup);
	}

}
