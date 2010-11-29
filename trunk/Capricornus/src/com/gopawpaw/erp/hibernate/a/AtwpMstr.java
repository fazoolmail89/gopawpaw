package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtwpMstr entity. @author MyEclipse Persistence Tools
 */
public class AtwpMstr extends AbstractAtwpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtwpMstr() {
	}

	/** full constructor */
	public AtwpMstr(AtwpMstrId id, Double oidAtwpMstr, Boolean atwpAuditActive,
			String atwpFilterCriteria, Boolean atwpAllFields, Date atwpModDate,
			String atwpModUserid, String atwpUser1, String atwpUser2,
			String atwpQadc01, String atwpQadc02) {
		super(id, oidAtwpMstr, atwpAuditActive, atwpFilterCriteria,
				atwpAllFields, atwpModDate, atwpModUserid, atwpUser1,
				atwpUser2, atwpQadc01, atwpQadc02);
	}

}
