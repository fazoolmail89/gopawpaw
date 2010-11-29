package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CostCalId entity. @author MyEclipse Persistence Tools
 */
public class CostCalId extends AbstractCostCalId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CostCalId() {
	}

	/** minimal constructor */
	public CostCalId(String costDomain) {
		super(costDomain);
	}

	/** full constructor */
	public CostCalId(String costDomain, Date costStart, String costSite) {
		super(costDomain, costStart, costSite);
	}

}
