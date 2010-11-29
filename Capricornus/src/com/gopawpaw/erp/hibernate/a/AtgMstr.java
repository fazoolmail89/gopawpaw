package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtgMstr entity. @author MyEclipse Persistence Tools
 */
public class AtgMstr extends AbstractAtgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtgMstr() {
	}

	/** full constructor */
	public AtgMstr(AtgMstrId id, Double oidAtgMstr, String atgGroupDesc,
			String atgOrigin, Date atgModDate, String atgModUserid,
			String atgUser1, String atgUser2, String atgQadc01, String atgQadc02) {
		super(id, oidAtgMstr, atgGroupDesc, atgOrigin, atgModDate,
				atgModUserid, atgUser1, atgUser2, atgQadc01, atgQadc02);
	}

}
