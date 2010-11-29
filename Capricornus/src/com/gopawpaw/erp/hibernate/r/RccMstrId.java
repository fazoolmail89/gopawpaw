package com.gopawpaw.erp.hibernate.r;

/**
 * RccMstrId entity. @author MyEclipse Persistence Tools
 */
public class RccMstrId extends AbstractRccMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RccMstrId() {
	}

	/** minimal constructor */
	public RccMstrId(String rccDomain) {
		super(rccDomain);
	}

	/** full constructor */
	public RccMstrId(String rccDomain, String rccAddr) {
		super(rccDomain, rccAddr);
	}

}
