package com.gopawpaw.erp.hibernate.c;

/**
 * CscMstrId entity. @author MyEclipse Persistence Tools
 */
public class CscMstrId extends AbstractCscMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CscMstrId() {
	}

	/** minimal constructor */
	public CscMstrId(String cscDomain) {
		super(cscDomain);
	}

	/** full constructor */
	public CscMstrId(String cscDomain, String cscCtryCode, String cscAuth,
			String cscAddr) {
		super(cscDomain, cscCtryCode, cscAuth, cscAddr);
	}

}
