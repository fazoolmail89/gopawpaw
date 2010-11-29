package com.gopawpaw.erp.hibernate.c;

/**
 * CclscMstrId entity. @author MyEclipse Persistence Tools
 */
public class CclscMstrId extends AbstractCclscMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclscMstrId() {
	}

	/** full constructor */
	public CclscMstrId(String cclscDomain, String cclscShipto,
			String cclscPart, String cclscCurr) {
		super(cclscDomain, cclscShipto, cclscPart, cclscCurr);
	}

}
