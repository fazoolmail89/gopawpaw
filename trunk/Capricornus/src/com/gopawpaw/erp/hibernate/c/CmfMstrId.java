package com.gopawpaw.erp.hibernate.c;

/**
 * CmfMstrId entity. @author MyEclipse Persistence Tools
 */
public class CmfMstrId extends AbstractCmfMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmfMstrId() {
	}

	/** full constructor */
	public CmfMstrId(String cmfDomain, Integer cmfTransNbr) {
		super(cmfDomain, cmfTransNbr);
	}

}
