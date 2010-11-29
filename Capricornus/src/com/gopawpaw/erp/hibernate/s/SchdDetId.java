package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SchdDetId entity. @author MyEclipse Persistence Tools
 */
public class SchdDetId extends AbstractSchdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SchdDetId() {
	}

	/** minimal constructor */
	public SchdDetId(String schdDomain) {
		super(schdDomain);
	}

	/** full constructor */
	public SchdDetId(String schdDomain, Integer schdType, String schdNbr,
			Integer schdLine, String schdRlseId, Date schdDate,
			String schdTime, String schdInterval, String schdReference) {
		super(schdDomain, schdType, schdNbr, schdLine, schdRlseId, schdDate,
				schdTime, schdInterval, schdReference);
	}

}
