package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ArsdDet entity. @author MyEclipse Persistence Tools
 */
public class ArsdDet extends AbstractArsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArsdDet() {
	}

	/** full constructor */
	public ArsdDet(ArsdDetId id, String arsdAcct, String arsdSub,
			String arsdCc, Double arsdExRate, Double arsdExRate2,
			String arsdExRatetype, Integer arsdExruSeq, Date arsdModDate,
			String arsdModUserid, String arsdUser1, String arsdUser2,
			String arsdQadc01, String arsdQadc02, Double oidArsdDet) {
		super(id, arsdAcct, arsdSub, arsdCc, arsdExRate, arsdExRate2,
				arsdExRatetype, arsdExruSeq, arsdModDate, arsdModUserid,
				arsdUser1, arsdUser2, arsdQadc01, arsdQadc02, oidArsdDet);
	}

}
