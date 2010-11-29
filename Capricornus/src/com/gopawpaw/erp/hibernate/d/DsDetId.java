package com.gopawpaw.erp.hibernate.d;

/**
 * DsDetId entity. @author MyEclipse Persistence Tools
 */
public class DsDetId extends AbstractDsDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DsDetId() {
	}

	/** minimal constructor */
	public DsDetId(String dsDomain, String dsReqNbr) {
		super(dsDomain, dsReqNbr);
	}

	/** full constructor */
	public DsDetId(String dsDomain, String dsReqNbr, String dsSite,
			String dsShipsite) {
		super(dsDomain, dsReqNbr, dsSite, dsShipsite);
	}

}
