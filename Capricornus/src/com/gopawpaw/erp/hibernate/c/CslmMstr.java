package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CslmMstr entity. @author MyEclipse Persistence Tools
 */
public class CslmMstr extends AbstractCslmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CslmMstr() {
	}

	/** minimal constructor */
	public CslmMstr(CslmMstrId id, Double oidCslmMstr) {
		super(id, oidCslmMstr);
	}

	/** full constructor */
	public CslmMstr(CslmMstrId id, String cslmGroup, Date cslmStart,
			Date cslmEnd, Double cslmMaxAmt, Double cslmTotAmt,
			Integer cslmMaxQty, Integer cslmTotQty, String cslmCurr,
			Integer cslmCmtindx, String cslmUser1, String cslmUser2,
			String cslmQadc01, Double oidCslmMstr) {
		super(id, cslmGroup, cslmStart, cslmEnd, cslmMaxAmt, cslmTotAmt,
				cslmMaxQty, cslmTotQty, cslmCurr, cslmCmtindx, cslmUser1,
				cslmUser2, cslmQadc01, oidCslmMstr);
	}

}
