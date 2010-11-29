package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CncCtrl entity. @author MyEclipse Persistence Tools
 */
public class CncCtrl extends AbstractCncCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncCtrl() {
	}

	/** full constructor */
	public CncCtrl(Integer cncQadi01, Boolean cncActive,
			Boolean cncConsignFlag, Integer cncMaxAgingDays,
			String cncConsignLoc, String cncIntransLoc,
			Boolean cncAutoReplenish, String cncModUserid, Date cncModDate,
			String cncUser1, String cncUser2, String cncQadc01,
			String cncQadc02, Double oidCncCtrl) {
		super(cncQadi01, cncActive, cncConsignFlag, cncMaxAgingDays,
				cncConsignLoc, cncIntransLoc, cncAutoReplenish, cncModUserid,
				cncModDate, cncUser1, cncUser2, cncQadc01, cncQadc02,
				oidCncCtrl);
	}

}
