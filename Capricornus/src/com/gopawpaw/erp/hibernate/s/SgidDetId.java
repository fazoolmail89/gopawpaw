package com.gopawpaw.erp.hibernate.s;

/**
 * SgidDetId entity. @author MyEclipse Persistence Tools
 */
public class SgidDetId extends AbstractSgidDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgidDetId() {
	}

	/** full constructor */
	public SgidDetId(String sgidDomain, String sgidGrp, String sgidInvMov) {
		super(sgidDomain, sgidGrp, sgidInvMov);
	}

}
