package com.gopawpaw.erp.hibernate.d;

/**
 * DsdDetId entity. @author MyEclipse Persistence Tools
 */
public class DsdDetId extends AbstractDsdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DsdDetId() {
	}

	/** minimal constructor */
	public DsdDetId(String dsdDomain, String dsdReqNbr) {
		super(dsdDomain, dsdReqNbr);
	}

	/** full constructor */
	public DsdDetId(String dsdDomain, String dsdSite, String dsdReqNbr,
			String dsdShipsite) {
		super(dsdDomain, dsdSite, dsdReqNbr, dsdShipsite);
	}

}
