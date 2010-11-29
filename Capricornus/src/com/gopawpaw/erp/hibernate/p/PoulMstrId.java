package com.gopawpaw.erp.hibernate.p;

/**
 * PoulMstrId entity. @author MyEclipse Persistence Tools
 */
public class PoulMstrId extends AbstractPoulMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PoulMstrId() {
	}

	/** full constructor */
	public PoulMstrId(String poulDomain, String poulPouCode, String poulSite,
			String poulWkctr, String poulMch) {
		super(poulDomain, poulPouCode, poulSite, poulWkctr, poulMch);
	}

}
