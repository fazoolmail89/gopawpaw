package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KbppMstr entity. @author MyEclipse Persistence Tools
 */
public class KbppMstr extends AbstractKbppMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public KbppMstr() {
	}

	/** full constructor */
	public KbppMstr(KbppMstrId id, String kbppDesc, Double kbppHours,
			String kbppModUserid, Date kbppModDate, String kbppUser1,
			String kbppUser2, String kbppQadc01, Integer kbppCalendarDays,
			Integer kbppWorkDays, Double oidKbppMstr) {
		super(id, kbppDesc, kbppHours, kbppModUserid, kbppModDate, kbppUser1,
				kbppUser2, kbppQadc01, kbppCalendarDays, kbppWorkDays,
				oidKbppMstr);
	}

}
