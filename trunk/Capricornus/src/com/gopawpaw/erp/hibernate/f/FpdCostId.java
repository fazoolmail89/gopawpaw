package com.gopawpaw.erp.hibernate.f;

/**
 * FpdCostId entity. @author MyEclipse Persistence Tools
 */
public class FpdCostId extends AbstractFpdCostId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpdCostId() {
	}

	/** minimal constructor */
	public FpdCostId(String fpdDomain) {
		super(fpdDomain);
	}

	/** full constructor */
	public FpdCostId(String fpdDomain, String fpdSim, String fpdSite,
			String fpdPart) {
		super(fpdDomain, fpdSim, fpdSite, fpdPart);
	}

}
