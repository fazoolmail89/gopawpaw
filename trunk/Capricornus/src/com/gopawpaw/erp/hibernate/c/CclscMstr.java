package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CclscMstr entity. @author MyEclipse Persistence Tools
 */
public class CclscMstr extends AbstractCclscMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclscMstr() {
	}

	/** minimal constructor */
	public CclscMstr(CclscMstrId id, String cclscChargeType,
			String cclscModUserid, String cclscUserc01, String cclscUserc02,
			String cclscQadc01, String cclscQadc02, Double oidCclscMstr) {
		super(id, cclscChargeType, cclscModUserid, cclscUserc01, cclscUserc02,
				cclscQadc01, cclscQadc02, oidCclscMstr);
	}

	/** full constructor */
	public CclscMstr(CclscMstrId id, String cclscChargeType,
			String cclscModUserid, Date cclscModDate, String cclscUserc01,
			String cclscUserc02, String cclscQadc01, String cclscQadc02,
			Double oidCclscMstr) {
		super(id, cclscChargeType, cclscModUserid, cclscModDate, cclscUserc01,
				cclscUserc02, cclscQadc01, cclscQadc02, oidCclscMstr);
	}

}
