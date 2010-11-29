package com.gopawpaw.erp.hibernate.p;

/**
 * PpPlanId entity. @author MyEclipse Persistence Tools
 */
public class PpPlanId extends AbstractPpPlanId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PpPlanId() {
	}

	/** minimal constructor */
	public PpPlanId(String ppDomain, String ppProdLine, Integer ppYear) {
		super(ppDomain, ppProdLine, ppYear);
	}

	/** full constructor */
	public PpPlanId(String ppDomain, String ppSite, String ppProdLine,
			Integer ppYear) {
		super(ppDomain, ppSite, ppProdLine, ppYear);
	}

}
