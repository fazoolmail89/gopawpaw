package com.gopawpaw.erp.hibernate.r;

/**
 * RegMstrId entity. @author MyEclipse Persistence Tools
 */
public class RegMstrId extends AbstractRegMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RegMstrId() {
	}

	/** minimal constructor */
	public RegMstrId(String regDomain) {
		super(regDomain);
	}

	/** full constructor */
	public RegMstrId(String regDomain, String regCode) {
		super(regDomain, regCode);
	}

}
