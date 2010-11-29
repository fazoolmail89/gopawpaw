package com.gopawpaw.erp.hibernate.c;

/**
 * CaMstrId entity. @author MyEclipse Persistence Tools
 */
public class CaMstrId extends AbstractCaMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CaMstrId() {
	}

	/** minimal constructor */
	public CaMstrId(String caDomain) {
		super(caDomain);
	}

	/** full constructor */
	public CaMstrId(String caDomain, String caCategory, String caNbr) {
		super(caDomain, caCategory, caNbr);
	}

}
