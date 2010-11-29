package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FlsdDetId entity. @author MyEclipse Persistence Tools
 */
public class FlsdDetId extends AbstractFlsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlsdDetId() {
	}

	/** minimal constructor */
	public FlsdDetId(String flsdDomain, String flsdSite,
			String flsdProductionLine, Integer flsdSeq) {
		super(flsdDomain, flsdSite, flsdProductionLine, flsdSeq);
	}

	/** full constructor */
	public FlsdDetId(String flsdDomain, String flsdSite,
			String flsdProductionLine, Date flsdDueDate, Integer flsdSeq) {
		super(flsdDomain, flsdSite, flsdProductionLine, flsdDueDate, flsdSeq);
	}

}
