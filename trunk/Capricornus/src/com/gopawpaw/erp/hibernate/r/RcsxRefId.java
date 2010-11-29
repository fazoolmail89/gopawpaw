package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RcsxRefId entity. @author MyEclipse Persistence Tools
 */
public class RcsxRefId extends AbstractRcsxRefId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcsxRefId() {
	}

	/** minimal constructor */
	public RcsxRefId(String rcsxDomain) {
		super(rcsxDomain);
	}

	/** full constructor */
	public RcsxRefId(String rcsxDomain, String rcsxShipfrom, String rcsxShipto,
			String rcsxShippedRlseId, String rcsxShippedCustJob,
			String rcsxShippedCustSeq, String rcsxShippedPart,
			Date rcsxShippedDate, String rcsxShippedTime,
			String rcsxShippedCustRef, String rcsxShippedDock,
			String rcsxShippedLineFeed) {
		super(rcsxDomain, rcsxShipfrom, rcsxShipto, rcsxShippedRlseId,
				rcsxShippedCustJob, rcsxShippedCustSeq, rcsxShippedPart,
				rcsxShippedDate, rcsxShippedTime, rcsxShippedCustRef,
				rcsxShippedDock, rcsxShippedLineFeed);
	}

}
