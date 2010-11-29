package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtapMstr entity. @author MyEclipse Persistence Tools
 */
public class AtapMstr extends AbstractAtapMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtapMstr() {
	}

	/** full constructor */
	public AtapMstr(AtapMstrId id, Double oidAtapMstr, Boolean atapAuditActive,
			String atapTableName, String atapFilterCriteria,
			Boolean atapAllFields, Date atapModDate, String atapModUserid,
			String atapUser1, String atapUser2, String atapQadc01,
			String atapQadc02) {
		super(id, oidAtapMstr, atapAuditActive, atapTableName,
				atapFilterCriteria, atapAllFields, atapModDate, atapModUserid,
				atapUser1, atapUser2, atapQadc01, atapQadc02);
	}

}
