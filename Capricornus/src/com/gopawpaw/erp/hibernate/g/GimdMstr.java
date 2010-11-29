package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GimdMstr entity. @author MyEclipse Persistence Tools
 */
public class GimdMstr extends AbstractGimdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GimdMstr() {
	}

	/** full constructor */
	public GimdMstr(GimdMstrId id, Integer gimdRefKey, Date gimdModDate,
			String gimdModUserid, String gimdModelDesc, String gimdUser1,
			String gimdUser2, String gimdQadc01, String gimdQadc02,
			Double oidGimdMstr) {
		super(id, gimdRefKey, gimdModDate, gimdModUserid, gimdModelDesc,
				gimdUser1, gimdUser2, gimdQadc01, gimdQadc02, oidGimdMstr);
	}

}
