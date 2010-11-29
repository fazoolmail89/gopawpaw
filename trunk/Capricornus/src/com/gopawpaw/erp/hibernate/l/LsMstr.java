package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LsMstr entity. @author MyEclipse Persistence Tools
 */
public class LsMstr extends AbstractLsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LsMstr() {
	}

	/** minimal constructor */
	public LsMstr(LsMstrId id, Double oidLsMstr) {
		super(id, oidLsMstr);
	}

	/** full constructor */
	public LsMstr(LsMstrId id, String lsUser1, String lsUser2, String lsQadc01,
			String lsAppOwner, Double lsDec01, Double lsDec02, Integer lsInt01,
			Integer lsInt02, Boolean lsLog01, Boolean lsLog02, Date lsDte01,
			Date lsDte02, String lsQadc02, String lsQadc03, String lsQadc04,
			Double lsQadd01, Double lsQadd02, Integer lsQadi01,
			Integer lsQadi02, Boolean lsQadl01, Boolean lsQadl02,
			Date lsQadt01, Date lsQadt02, Double oidLsMstr) {
		super(id, lsUser1, lsUser2, lsQadc01, lsAppOwner, lsDec01, lsDec02,
				lsInt01, lsInt02, lsLog01, lsLog02, lsDte01, lsDte02, lsQadc02,
				lsQadc03, lsQadc04, lsQadd01, lsQadd02, lsQadi01, lsQadi02,
				lsQadl01, lsQadl02, lsQadt01, lsQadt02, oidLsMstr);
	}

}
