package com.gopawpaw.erp.hibernate.s;

/**
 * SaMstrId entity. @author MyEclipse Persistence Tools
 */
public class SaMstrId extends AbstractSaMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SaMstrId() {
	}

	/** minimal constructor */
	public SaMstrId(String saDomain, String saNbr) {
		super(saDomain, saNbr);
	}

	/** full constructor */
	public SaMstrId(String saDomain, String saNbr, String saPrefix) {
		super(saDomain, saNbr, saPrefix);
	}

}
