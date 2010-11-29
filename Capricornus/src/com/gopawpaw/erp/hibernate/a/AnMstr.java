package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AnMstr entity. @author MyEclipse Persistence Tools
 */
public class AnMstr extends AbstractAnMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AnMstr() {
	}

	/** minimal constructor */
	public AnMstr(AnMstrId id, Double oidAnMstr) {
		super(id, oidAnMstr);
	}

	/** full constructor */
	public AnMstr(AnMstrId id, String anUserid, Integer anCmtindx,
			String anDesc, String anSecGroup, Date anModDate, Boolean anActive,
			String anUser1, String anUser2, String anQadc01, Double anQadd01,
			Double oidAnMstr) {
		super(id, anUserid, anCmtindx, anDesc, anSecGroup, anModDate, anActive,
				anUser1, anUser2, anQadc01, anQadd01, oidAnMstr);
	}

}
