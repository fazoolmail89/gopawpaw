package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * ShvMstr entity. @author MyEclipse Persistence Tools
 */
public class ShvMstr extends AbstractShvMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ShvMstr() {
	}

	/** full constructor */
	public ShvMstr(ShvMstrId id, String shvModeTransp, String shvName,
			Boolean shvPortMandatory, Date shvModDate, String shvModUserid,
			String shvUser1, String shvUser2, String shvQadc01,
			String shvQadc02, Double oidShvMstr) {
		super(id, shvModeTransp, shvName, shvPortMandatory, shvModDate,
				shvModUserid, shvUser1, shvUser2, shvQadc01, shvQadc02,
				oidShvMstr);
	}

}
