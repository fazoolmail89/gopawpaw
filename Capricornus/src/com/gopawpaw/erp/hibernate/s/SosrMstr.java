package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SosrMstr entity. @author MyEclipse Persistence Tools
 */
public class SosrMstr extends AbstractSosrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SosrMstr() {
	}

	/** full constructor */
	public SosrMstr(SosrMstrId id, Integer sosrCmtindx, String sosrQadc01,
			String sosrQadc02, String sosrModUserid, Date sosrModDate,
			String sosrUser1, String sosrUser2, Double oidSosrMstr) {
		super(id, sosrCmtindx, sosrQadc01, sosrQadc02, sosrModUserid,
				sosrModDate, sosrUser1, sosrUser2, oidSosrMstr);
	}

}
