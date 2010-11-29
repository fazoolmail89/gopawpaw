package com.gopawpaw.erp.hibernate.c;

/**
 * CrMstrId entity. @author MyEclipse Persistence Tools
 */
public class CrMstrId extends AbstractCrMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CrMstrId() {
	}

	/** full constructor */
	public CrMstrId(String crDomain, String crCode, String crType,
			String crCodeBeg, String crCodeEnd) {
		super(crDomain, crCode, crType, crCodeBeg, crCodeEnd);
	}

}
