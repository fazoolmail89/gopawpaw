package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbsDetId entity. @author MyEclipse Persistence Tools
 */
public class KnbsDetId extends AbstractKnbsDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbsDetId() {
	}

	/** full constructor */
	public KnbsDetId(Double knbsKeyid, String knbsSourceType, String knbsRef1,
			String knbsRef2, String knbsRef3, String knbsRef4, String knbsRef5,
			Date knbsModDate, String knbsModUserid, String knbsUser1,
			String knbsUser2, String knbsQadc01, String knbsQadc02,
			String knbsDomain, Double oidKnbsDet) {
		super(knbsKeyid, knbsSourceType, knbsRef1, knbsRef2, knbsRef3,
				knbsRef4, knbsRef5, knbsModDate, knbsModUserid, knbsUser1,
				knbsUser2, knbsQadc01, knbsQadc02, knbsDomain, oidKnbsDet);
	}

}
