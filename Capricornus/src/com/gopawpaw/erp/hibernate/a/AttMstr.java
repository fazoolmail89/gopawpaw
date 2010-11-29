package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AttMstr entity. @author MyEclipse Persistence Tools
 */
public class AttMstr extends AbstractAttMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AttMstr() {
	}

	/** full constructor */
	public AttMstr(Double oidAttMstr, Boolean attAuditEnabled, Date attModDate,
			String attModUserid, String attUser1, String attUser2,
			String attQadc01, String attQadc02) {
		super(oidAttMstr, attAuditEnabled, attModDate, attModUserid, attUser1,
				attUser2, attQadc01, attQadc02);
	}

}
