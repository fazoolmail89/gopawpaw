package com.gopawpaw.erp.hibernate.c;

/**
 * ChgMstrId entity. @author MyEclipse Persistence Tools
 */
public class ChgMstrId extends AbstractChgMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ChgMstrId() {
	}

	/** minimal constructor */
	public ChgMstrId(String chgDomain) {
		super(chgDomain);
	}

	/** full constructor */
	public ChgMstrId(String chgDomain, String chgSite, String chgLine,
			String chgFrom, String chgTo) {
		super(chgDomain, chgSite, chgLine, chgFrom, chgTo);
	}

}
