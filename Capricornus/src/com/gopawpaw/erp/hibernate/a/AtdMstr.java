package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtdMstr entity. @author MyEclipse Persistence Tools
 */
public class AtdMstr extends AbstractAtdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtdMstr() {
	}

	/** full constructor */
	public AtdMstr(AtdMstrId id, String atdDesc, String atdGroup,
			String atdModUserid, Date atdModDate, String atdUser1,
			String atdUser2, String atdQadc01, String atdQadc02,
			Double oidAtdMstr) {
		super(id, atdDesc, atdGroup, atdModUserid, atdModDate, atdUser1,
				atdUser2, atdQadc01, atdQadc02, oidAtdMstr);
	}

}
