package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtrDetId entity. @author MyEclipse Persistence Tools
 */
public class PtrDetId extends AbstractPtrDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtrDetId() {
	}

	/** minimal constructor */
	public PtrDetId(String ptrDomain, String ptrPart) {
		super(ptrDomain, ptrPart);
	}

	/** full constructor */
	public PtrDetId(String ptrDomain, String ptrPart, String ptrSite,
			String ptrRouting, String ptrBomCode, Date ptrStart) {
		super(ptrDomain, ptrPart, ptrSite, ptrRouting, ptrBomCode, ptrStart);
	}

}
