package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SmMstr entity. @author MyEclipse Persistence Tools
 */
public class SmMstr extends AbstractSmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SmMstr() {
	}

	/** minimal constructor */
	public SmMstr(SmMstrId id, Double oidSmMstr) {
		super(id, oidSmMstr);
	}

	/** full constructor */
	public SmMstr(SmMstrId id, Date smEnd, Double smPct, String smTrans,
			Double smLead, String smUser1, String smUser2, String smQadc01,
			Double oidSmMstr) {
		super(id, smEnd, smPct, smTrans, smLead, smUser1, smUser2, smQadc01,
				oidSmMstr);
	}

}
