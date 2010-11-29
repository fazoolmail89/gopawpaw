package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CtMstr entity. @author MyEclipse Persistence Tools
 */
public class CtMstr extends AbstractCtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CtMstr() {
	}

	/** minimal constructor */
	public CtMstr(CtMstrId id, Boolean ctMtdDisc, Boolean ctMtdDue,
			Double oidCtMstr) {
		super(id, ctMtdDisc, ctMtdDue, oidCtMstr);
	}

	/** full constructor */
	public CtMstr(CtMstrId id, String ctDesc, Double ctDiscPct,
			Double ctDiscDays, Double ctDueDays, Date ctDueDate,
			Boolean ctXfromInv, Date ctDiscDate, Boolean ctXdueInv,
			Boolean ctDating, String ctUser1, String ctUser2, String ctUserid,
			Date ctModDate, Integer ctDueInv, Integer ctFromInv,
			Double ctTermsInt, Double ctLateInt, Date ctBaseDate,
			Integer ctBaseDays, Integer ctMinDays, Integer ctGraceDays,
			String ctQadc01, Boolean ctMtdDisc, Boolean ctMtdDue,
			Double oidCtMstr) {
		super(id, ctDesc, ctDiscPct, ctDiscDays, ctDueDays, ctDueDate,
				ctXfromInv, ctDiscDate, ctXdueInv, ctDating, ctUser1, ctUser2,
				ctUserid, ctModDate, ctDueInv, ctFromInv, ctTermsInt,
				ctLateInt, ctBaseDate, ctBaseDays, ctMinDays, ctGraceDays,
				ctQadc01, ctMtdDisc, ctMtdDue, oidCtMstr);
	}

}
