package com.gopawpaw.erp.hibernate.i;

/**
 * IeMstrId entity. @author MyEclipse Persistence Tools
 */
public class IeMstrId extends AbstractIeMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IeMstrId() {
	}

	/** minimal constructor */
	public IeMstrId(String ieDomain) {
		super(ieDomain);
	}

	/** full constructor */
	public IeMstrId(String ieDomain, String ieType, String ieNbr) {
		super(ieDomain, ieType, ieNbr);
	}

}
