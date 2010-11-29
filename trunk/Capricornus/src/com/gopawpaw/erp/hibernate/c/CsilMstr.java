package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CsilMstr entity. @author MyEclipse Persistence Tools
 */
public class CsilMstr extends AbstractCsilMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsilMstr() {
	}

	/** minimal constructor */
	public CsilMstr(CsilMstrId id, Double oidCsilMstr) {
		super(id, oidCsilMstr);
	}

	/** full constructor */
	public CsilMstr(CsilMstrId id, Date csilStart, Date csilEnd,
			String csilAddr1, String csilAddr2, String csilAddr3,
			Integer csilCmtindx, String csilAddr4, String csilUser1,
			String csilUser2, String csilQadc01, Double oidCsilMstr) {
		super(id, csilStart, csilEnd, csilAddr1, csilAddr2, csilAddr3,
				csilCmtindx, csilAddr4, csilUser1, csilUser2, csilQadc01,
				oidCsilMstr);
	}

}
