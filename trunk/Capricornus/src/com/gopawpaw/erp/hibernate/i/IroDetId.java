package com.gopawpaw.erp.hibernate.i;

/**
 * IroDetId entity. @author MyEclipse Persistence Tools
 */
public class IroDetId extends AbstractIroDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IroDetId() {
	}

	/** full constructor */
	public IroDetId(String iroDomain, String iroPart, String iroSite,
			String iroCostSet, String iroRouting, Integer iroOp) {
		super(iroDomain, iroPart, iroSite, iroCostSet, iroRouting, iroOp);
	}

}
