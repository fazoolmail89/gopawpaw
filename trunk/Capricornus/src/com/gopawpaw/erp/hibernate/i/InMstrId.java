package com.gopawpaw.erp.hibernate.i;

/**
 * InMstrId entity. @author MyEclipse Persistence Tools
 */
public class InMstrId extends AbstractInMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public InMstrId() {
	}

	/** minimal constructor */
	public InMstrId(String inDomain, String inPart) {
		super(inDomain, inPart);
	}

	/** full constructor */
	public InMstrId(String inDomain, String inPart, String inSite) {
		super(inDomain, inPart, inSite);
	}

}
