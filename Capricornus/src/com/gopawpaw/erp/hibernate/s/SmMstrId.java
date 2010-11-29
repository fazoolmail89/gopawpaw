package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SmMstrId entity. @author MyEclipse Persistence Tools
 */
public class SmMstrId extends AbstractSmMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SmMstrId() {
	}

	/** minimal constructor */
	public SmMstrId(String smDomain) {
		super(smDomain);
	}

	/** full constructor */
	public SmMstrId(String smDomain, String smPart, String smSupSite,
			String smMktgSite, Date smStart, String smType) {
		super(smDomain, smPart, smSupSite, smMktgSite, smStart, smType);
	}

}
