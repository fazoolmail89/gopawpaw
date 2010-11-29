package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbMstr entity. @author MyEclipse Persistence Tools
 */
public class KnbMstr extends AbstractKnbMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbMstr() {
	}

	/** full constructor */
	public KnbMstr(KnbMstrId id, Double knbKnbiKeyid, Double knbKnbsKeyid,
			Double knbKnbsmKeyid, String knbLoopType, Date knbModDate,
			String knbModUserid, String knbUser1, String knbUser2,
			String knbQadc01, String knbQadc02, Double oidKnbMstr) {
		super(id, knbKnbiKeyid, knbKnbsKeyid, knbKnbsmKeyid, knbLoopType,
				knbModDate, knbModUserid, knbUser1, knbUser2, knbQadc01,
				knbQadc02, oidKnbMstr);
	}

}
