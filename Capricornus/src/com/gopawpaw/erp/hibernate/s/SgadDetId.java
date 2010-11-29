package com.gopawpaw.erp.hibernate.s;

/**
 * SgadDetId entity. @author MyEclipse Persistence Tools
 */
public class SgadDetId extends AbstractSgadDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgadDetId() {
	}

	/** full constructor */
	public SgadDetId(String sgadDomain, String sgadGrp, Boolean sgadIsSrc,
			String sgadAddr) {
		super(sgadDomain, sgadGrp, sgadIsSrc, sgadAddr);
	}

}
