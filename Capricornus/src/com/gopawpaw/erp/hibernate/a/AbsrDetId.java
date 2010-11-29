package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbsrDetId entity. @author MyEclipse Persistence Tools
 */
public class AbsrDetId extends AbstractAbsrDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsrDetId() {
	}

	/** minimal constructor */
	public AbsrDetId(String absrDomain) {
		super(absrDomain);
	}

	/** full constructor */
	public AbsrDetId(String absrDomain, String absrShipfrom, String absrId,
			Integer absrType, String absrNbr, Integer absrLine,
			String absrRlseId, Date absrDate, String absrTime,
			String absrInterval, String absrReference) {
		super(absrDomain, absrShipfrom, absrId, absrType, absrNbr, absrLine,
				absrRlseId, absrDate, absrTime, absrInterval, absrReference);
	}

}
