package com.gopawpaw.erp.hibernate.r;

/**
 * RcsMstrId entity. @author MyEclipse Persistence Tools
 */
public class RcsMstrId extends AbstractRcsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcsMstrId() {
	}

	/** minimal constructor */
	public RcsMstrId(String rcsDomain) {
		super(rcsDomain);
	}

	/** full constructor */
	public RcsMstrId(String rcsDomain, String rcsShipfrom, String rcsShipto,
			String rcsRlseId) {
		super(rcsDomain, rcsShipfrom, rcsShipto, rcsRlseId);
	}

}
