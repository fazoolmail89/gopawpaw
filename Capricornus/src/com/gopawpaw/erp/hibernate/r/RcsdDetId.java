package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RcsdDetId entity. @author MyEclipse Persistence Tools
 */
public class RcsdDetId extends AbstractRcsdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RcsdDetId() {
	}

	/** minimal constructor */
	public RcsdDetId(String rcsdDomain) {
		super(rcsdDomain);
	}

	/** full constructor */
	public RcsdDetId(String rcsdDomain, String rcsdShipfrom, String rcsdShipto,
			String rcsdRlseId, String rcsdCustJob, String rcsdCustSeq,
			String rcsdPart, Date rcsdDate, String rcsdTime,
			String rcsdCustRef, String rcsdDock, String rcsdLineFeed) {
		super(rcsdDomain, rcsdShipfrom, rcsdShipto, rcsdRlseId, rcsdCustJob,
				rcsdCustSeq, rcsdPart, rcsdDate, rcsdTime, rcsdCustRef,
				rcsdDock, rcsdLineFeed);
	}

}
