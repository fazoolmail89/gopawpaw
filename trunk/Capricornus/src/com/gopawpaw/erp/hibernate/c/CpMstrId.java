package com.gopawpaw.erp.hibernate.c;

/**
 * CpMstrId entity. @author MyEclipse Persistence Tools
 */
public class CpMstrId extends AbstractCpMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CpMstrId() {
	}

	/** minimal constructor */
	public CpMstrId(String cpDomain) {
		super(cpDomain);
	}

	/** full constructor */
	public CpMstrId(String cpDomain, String cpCust, String cpCustPart) {
		super(cpDomain, cpCust, cpCustPart);
	}

}
