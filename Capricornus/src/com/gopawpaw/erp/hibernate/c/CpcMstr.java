package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CpcMstr entity. @author MyEclipse Persistence Tools
 */
public class CpcMstr extends AbstractCpcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CpcMstr() {
	}

	/** minimal constructor */
	public CpcMstr(CpcMstrId id, Double oidCpcMstr) {
		super(id, oidCpcMstr);
	}

	/** full constructor */
	public CpcMstr(CpcMstrId id, String cpcDesc, String cpcChr01,
			String cpcChr02, String cpcChr03, String cpcChr04, Double cpcDec01,
			Boolean cpcLog01, Date cpcModDate, String cpcUserid,
			String cpcUser1, String cpcUser2, Double oidCpcMstr) {
		super(id, cpcDesc, cpcChr01, cpcChr02, cpcChr03, cpcChr04, cpcDec01,
				cpcLog01, cpcModDate, cpcUserid, cpcUser1, cpcUser2, oidCpcMstr);
	}

}
