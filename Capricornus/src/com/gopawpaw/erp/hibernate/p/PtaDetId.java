package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PtaDetId entity. @author MyEclipse Persistence Tools
 */
public class PtaDetId extends AbstractPtaDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtaDetId() {
	}

	/** minimal constructor */
	public PtaDetId(String ptaDomain) {
		super(ptaDomain);
	}

	/** full constructor */
	public PtaDetId(String ptaDomain, String ptaItem, String ptaAssocType,
			String ptaUm, String ptaAssocItem, String ptaCurr, Date ptaStart) {
		super(ptaDomain, ptaItem, ptaAssocType, ptaUm, ptaAssocItem, ptaCurr,
				ptaStart);
	}

}
