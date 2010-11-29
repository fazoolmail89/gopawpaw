package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CrefMstr entity. @author MyEclipse Persistence Tools
 */
public class CrefMstr extends AbstractCrefMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CrefMstr() {
	}

	/** minimal constructor */
	public CrefMstr(CrefMstrId id, Double oidCrefMstr) {
		super(id, oidCrefMstr);
	}

	/** full constructor */
	public CrefMstr(CrefMstrId id, String crefItem3, String crefItem4,
			String crefCset, Boolean crefQadLog01, Boolean crefQadLog02,
			Date crefQadDate1, Double crefQadDec01, Date crefQadDate2,
			Double crefQadDec02, String crefUser1, String crefUser2,
			String crefQadc01, Double oidCrefMstr) {
		super(id, crefItem3, crefItem4, crefCset, crefQadLog01, crefQadLog02,
				crefQadDate1, crefQadDec01, crefQadDate2, crefQadDec02,
				crefUser1, crefUser2, crefQadc01, oidCrefMstr);
	}

}
