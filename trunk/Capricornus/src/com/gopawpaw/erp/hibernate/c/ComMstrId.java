package com.gopawpaw.erp.hibernate.c;

/**
 * ComMstrId entity. @author MyEclipse Persistence Tools
 */
public class ComMstrId extends AbstractComMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ComMstrId() {
	}

	/** full constructor */
	public ComMstrId(String comDomain, String comCommCode) {
		super(comDomain, comCommCode);
	}

}
