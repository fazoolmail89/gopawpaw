package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RqmDetId entity. @author MyEclipse Persistence Tools
 */
public class RqmDetId extends AbstractRqmDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqmDetId() {
	}

	/** minimal constructor */
	public RqmDetId(String rqmDomain, Double oidRqmDet) {
		super(rqmDomain, oidRqmDet);
	}

	/** full constructor */
	public RqmDetId(String rqmReference, String rqmCat, String rqmValue,
			Integer rqmType, String rqmNbr, Integer rqmLine, String rqmRlseId,
			Date rqmDate, String rqmTime, String rqmInterval, String rqmUser1,
			String rqmUser2, String rqmQadc01, String rqmDomain,
			Double oidRqmDet) {
		super(rqmReference, rqmCat, rqmValue, rqmType, rqmNbr, rqmLine,
				rqmRlseId, rqmDate, rqmTime, rqmInterval, rqmUser1, rqmUser2,
				rqmQadc01, rqmDomain, oidRqmDet);
	}

}
