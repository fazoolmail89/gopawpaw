package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GiapMstr entity. @author MyEclipse Persistence Tools
 */
public class GiapMstr extends AbstractGiapMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GiapMstr() {
	}

	/** full constructor */
	public GiapMstr(GiapMstrId id, String giapAppDesc, Integer giapRefKey,
			Date giapModDate, String giapModUserid, String giapUser1,
			String giapUser2, String giapQadc01, String giapQadc02,
			Double oidGiapMstr) {
		super(id, giapAppDesc, giapRefKey, giapModDate, giapModUserid,
				giapUser1, giapUser2, giapQadc01, giapQadc02, oidGiapMstr);
	}

}
