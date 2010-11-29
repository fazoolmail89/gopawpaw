package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KbdtMstr entity. @author MyEclipse Persistence Tools
 */
public class KbdtMstr extends AbstractKbdtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbdtMstr() {
	}

	/** full constructor */
	public KbdtMstr(KbdtMstrId id, String kbdtDesc, String kbdtHistorySource,
			Integer kbdtHistoryDays, String kbdtFutureSource,
			Integer kbdtFutureDays, Date kbdtModDate, String kbdtModUserid,
			String kbdtUser1, String kbdtUser2, String kbdtQadc01,
			String kbdtQadc02, Double oidKbdtMstr) {
		super(id, kbdtDesc, kbdtHistorySource, kbdtHistoryDays,
				kbdtFutureSource, kbdtFutureDays, kbdtModDate, kbdtModUserid,
				kbdtUser1, kbdtUser2, kbdtQadc01, kbdtQadc02, oidKbdtMstr);
	}

}
