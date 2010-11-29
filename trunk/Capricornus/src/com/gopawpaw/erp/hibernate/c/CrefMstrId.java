package com.gopawpaw.erp.hibernate.c;

/**
 * CrefMstrId entity. @author MyEclipse Persistence Tools
 */
public class CrefMstrId extends AbstractCrefMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CrefMstrId() {
	}

	/** minimal constructor */
	public CrefMstrId(String crefDomain) {
		super(crefDomain);
	}

	/** full constructor */
	public CrefMstrId(String crefDomain, String crefRefType, String crefItem1,
			String crefItem2) {
		super(crefDomain, crefRefType, crefItem1, crefItem2);
	}

}
