package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CilMstr entity. @author MyEclipse Persistence Tools
 */
public class CilMstr extends AbstractCilMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CilMstr() {
	}

	/** full constructor */
	public CilMstr(CilMstrId id, String cilCorRsn, String cilModUserid,
			Date cilModDate, String cilMstrInv, String cilPrevSoNbr,
			String cilPrevInv, String cilUser1, String cilUser2,
			String cilQadc01, String cilQadc02, Double oidCilMstr) {
		super(id, cilCorRsn, cilModUserid, cilModDate, cilMstrInv,
				cilPrevSoNbr, cilPrevInv, cilUser1, cilUser2, cilQadc01,
				cilQadc02, oidCilMstr);
	}

}
