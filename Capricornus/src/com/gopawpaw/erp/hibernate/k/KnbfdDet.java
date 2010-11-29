package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbfdDet entity. @author MyEclipse Persistence Tools
 */
public class KnbfdDet extends AbstractKnbfdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbfdDet() {
	}

	/** full constructor */
	public KnbfdDet(KnbfdDetId id, Double knbfdKnbKeyid, Integer knbfdSeq,
			Double knbfdKnpKeyid, Date knbfdModDate, String knbfdModUserid,
			String knbfdUser1, String knbfdUser2, String knbfdQadc01,
			String knbfdQadc02, Double knbfdKnbsKeyid, Double oidKnbfdDet) {
		super(id, knbfdKnbKeyid, knbfdSeq, knbfdKnpKeyid, knbfdModDate,
				knbfdModUserid, knbfdUser1, knbfdUser2, knbfdQadc01,
				knbfdQadc02, knbfdKnbsKeyid, oidKnbfdDet);
	}

}
