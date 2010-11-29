package com.gopawpaw.erp.hibernate.s;

/**
 * SbiMstrId entity. @author MyEclipse Persistence Tools
 */
public class SbiMstrId extends AbstractSbiMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbiMstrId() {
	}

	/** full constructor */
	public SbiMstrId(String sbiDomain, String sbiBill, String sbiNbr) {
		super(sbiDomain, sbiBill, sbiNbr);
	}

}
