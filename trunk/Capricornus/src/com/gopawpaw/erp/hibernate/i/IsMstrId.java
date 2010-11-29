package com.gopawpaw.erp.hibernate.i;

/**
 * IsMstrId entity. @author MyEclipse Persistence Tools
 */
public class IsMstrId extends AbstractIsMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsMstrId() {
	}

	/** minimal constructor */
	public IsMstrId(String isDomain) {
		super(isDomain);
	}

	/** full constructor */
	public IsMstrId(String isDomain, String isStatus, Boolean isNettable) {
		super(isDomain, isStatus, isNettable);
	}

}
