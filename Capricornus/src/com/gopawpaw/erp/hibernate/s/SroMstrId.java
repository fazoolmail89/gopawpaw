package com.gopawpaw.erp.hibernate.s;

/**
 * SroMstrId entity. @author MyEclipse Persistence Tools
 */
public class SroMstrId extends AbstractSroMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SroMstrId() {
	}

	/** minimal constructor */
	public SroMstrId(String sroDomain) {
		super(sroDomain);
	}

	/** full constructor */
	public SroMstrId(String sroDomain, String sroNbr) {
		super(sroDomain, sroNbr);
	}

}
