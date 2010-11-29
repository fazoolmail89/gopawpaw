package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbssDetId entity. @author MyEclipse Persistence Tools
 */
public class AbssDetId extends AbstractAbssDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbssDetId() {
	}

	/** minimal constructor */
	public AbssDetId(String abssDomain) {
		super(abssDomain);
	}

	/** full constructor */
	public AbssDetId(String abssDomain, String abssAbsId, String abssShipfrom,
			String abssShipto, String abssRlseId, String abssCustJob,
			String abssCustSeq, String abssPart, Date abssDate,
			String abssTime, String abssCustRef, String abssDock,
			String abssLineFeed) {
		super(abssDomain, abssAbsId, abssShipfrom, abssShipto, abssRlseId,
				abssCustJob, abssCustSeq, abssPart, abssDate, abssTime,
				abssCustRef, abssDock, abssLineFeed);
	}

}
