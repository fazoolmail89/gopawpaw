package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DjrcDet entity. @author MyEclipse Persistence Tools
 */
public class DjrcDet extends AbstractDjrcDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DjrcDet() {
	}

	/** minimal constructor */
	public DjrcDet(DjrcDetId id, String djrcModUserid, Date djrcModDate,
			Boolean djrcTotal, String djrcUser1, String djrcUser2,
			Double djrcUserd01, Integer djrcUseri01, Boolean djrcUserl01,
			String djrcQadc01, String djrcQadc02, Double djrcQadd01,
			Integer djrcQadi01, Boolean djrcQadl01, Double oidDjrcDet) {
		super(id, djrcModUserid, djrcModDate, djrcTotal, djrcUser1, djrcUser2,
				djrcUserd01, djrcUseri01, djrcUserl01, djrcQadc01, djrcQadc02,
				djrcQadd01, djrcQadi01, djrcQadl01, oidDjrcDet);
	}

	/** full constructor */
	public DjrcDet(DjrcDetId id, String djrcModUserid, Date djrcModDate,
			Boolean djrcTotal, String djrcUser1, String djrcUser2,
			Double djrcUserd01, Integer djrcUseri01, Boolean djrcUserl01,
			Date djrcUsert01, String djrcQadc01, String djrcQadc02,
			Double djrcQadd01, Integer djrcQadi01, Boolean djrcQadl01,
			Date djrcQadt01, Double oidDjrcDet) {
		super(id, djrcModUserid, djrcModDate, djrcTotal, djrcUser1, djrcUser2,
				djrcUserd01, djrcUseri01, djrcUserl01, djrcUsert01, djrcQadc01,
				djrcQadc02, djrcQadd01, djrcQadi01, djrcQadl01, djrcQadt01,
				oidDjrcDet);
	}

}
