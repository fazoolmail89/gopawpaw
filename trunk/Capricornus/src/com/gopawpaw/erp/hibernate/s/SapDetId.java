package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SapDetId entity. @author MyEclipse Persistence Tools
 */
public class SapDetId extends AbstractSapDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SapDetId() {
	}

	/** minimal constructor */
	public SapDetId(String sapDomain) {
		super(sapDomain);
	}

	/** full constructor */
	public SapDetId(String sapDomain, String sapNbr, String sapPrefix,
			Integer sapLine, Date sapSchedDate) {
		super(sapDomain, sapNbr, sapPrefix, sapLine, sapSchedDate);
	}

}
