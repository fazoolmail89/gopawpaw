package com.gopawpaw.erp.hibernate.r;

/**
 * RstdDetId entity. @author MyEclipse Persistence Tools
 */
public class RstdDetId extends AbstractRstdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RstdDetId() {
	}

	/** full constructor */
	public RstdDetId(String rstdDomain, String rstdApprCode, String rstdGroup) {
		super(rstdDomain, rstdApprCode, rstdGroup);
	}

}
