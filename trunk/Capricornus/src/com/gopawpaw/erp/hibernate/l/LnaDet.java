package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LnaDet entity. @author MyEclipse Persistence Tools
 */
public class LnaDet extends AbstractLnaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LnaDet() {
	}

	/** minimal constructor */
	public LnaDet(LnaDetId id, String lnaQadc01, String lnaQadc02,
			String lnaUser1, String lnaUser2, String lnaChr01, String lnaChr02,
			Double oidLnaDet) {
		super(id, lnaQadc01, lnaQadc02, lnaUser1, lnaUser2, lnaChr01, lnaChr02,
				oidLnaDet);
	}

	/** full constructor */
	public LnaDet(LnaDetId id, Double lnaAllocation, String lnaQadc01,
			String lnaQadc02, Double lnaQadd01, Double lnaQadd02,
			Integer lnaQadi01, Integer lnaQadi02, Boolean lnaQadl01,
			Boolean lnaQadl02, Date lnaQadt01, Date lnaQadt02, String lnaUser1,
			String lnaUser2, String lnaChr01, String lnaChr02, Double lnaDec01,
			Double lnaDec02, Date lnaDte01, Date lnaDte02, Boolean lnaLog01,
			Boolean lnaLog02, Double oidLnaDet) {
		super(id, lnaAllocation, lnaQadc01, lnaQadc02, lnaQadd01, lnaQadd02,
				lnaQadi01, lnaQadi02, lnaQadl01, lnaQadl02, lnaQadt01,
				lnaQadt02, lnaUser1, lnaUser2, lnaChr01, lnaChr02, lnaDec01,
				lnaDec02, lnaDte01, lnaDte02, lnaLog01, lnaLog02, oidLnaDet);
	}

}
