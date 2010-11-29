package com.gopawpaw.erp.hibernate.d;

/**
 * DssMstrId entity. @author MyEclipse Persistence Tools
 */
public class DssMstrId extends AbstractDssMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DssMstrId() {
	}

	/** minimal constructor */
	public DssMstrId(String dssDomain, String dssNbr) {
		super(dssDomain, dssNbr);
	}

	/** full constructor */
	public DssMstrId(String dssDomain, String dssNbr, String dssShipsite) {
		super(dssDomain, dssNbr, dssShipsite);
	}

}
