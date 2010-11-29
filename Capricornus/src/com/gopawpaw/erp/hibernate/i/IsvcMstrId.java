package com.gopawpaw.erp.hibernate.i;

/**
 * IsvcMstrId entity. @author MyEclipse Persistence Tools
 */
public class IsvcMstrId extends AbstractIsvcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsvcMstrId() {
	}

	/** full constructor */
	public IsvcMstrId(String isvcDomain, String isvcTermsDelivery,
			String isvcModeTransp, String isvcShipvia, String isvcFlow,
			String isvcCtryOrig, String isvcCtryDest) {
		super(isvcDomain, isvcTermsDelivery, isvcModeTransp, isvcShipvia,
				isvcFlow, isvcCtryOrig, isvcCtryDest);
	}

}
