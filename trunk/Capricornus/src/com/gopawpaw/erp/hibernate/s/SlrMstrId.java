package com.gopawpaw.erp.hibernate.s;

/**
 * SlrMstrId entity. @author MyEclipse Persistence Tools
 */
public class SlrMstrId extends AbstractSlrMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SlrMstrId() {
	}

	/** full constructor */
	public SlrMstrId(String slrDomain, String slrInventorySite) {
		super(slrDomain, slrInventorySite);
	}

}
