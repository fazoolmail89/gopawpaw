package com.gopawpaw.erp.hibernate.f;

/**
 * FlpwMstrId entity. @author MyEclipse Persistence Tools
 */
public class FlpwMstrId extends AbstractFlpwMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlpwMstrId() {
	}

	/** minimal constructor */
	public FlpwMstrId(String flpwDomain) {
		super(flpwDomain);
	}

	/** full constructor */
	public FlpwMstrId(String flpwDomain, String flpwField, String flpwUserid) {
		super(flpwDomain, flpwField, flpwUserid);
	}

}
