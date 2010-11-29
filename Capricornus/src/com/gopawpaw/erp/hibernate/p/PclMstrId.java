package com.gopawpaw.erp.hibernate.p;

/**
 * PclMstrId entity. @author MyEclipse Persistence Tools
 */
public class PclMstrId extends AbstractPclMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PclMstrId() {
	}

	/** full constructor */
	public PclMstrId(String pclDomain, String pclGroup, String pclType) {
		super(pclDomain, pclGroup, pclType);
	}

}
