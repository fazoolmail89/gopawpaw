package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FaclsMstr entity. @author MyEclipse Persistence Tools
 */
public class FaclsMstr extends AbstractFaclsMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FaclsMstr() {
	}

	/** minimal constructor */
	public FaclsMstr(FaclsMstrId id, Boolean faclsDep, String faclsDesc,
			String faclsModUserid, Date faclsModDate, String faclsUser1,
			String faclsUser2, String faclsChr01, Double faclsDec01,
			Boolean faclsLog01, Integer faclsInt01, String faclsQadc01,
			Double faclsQadd01, Boolean faclsQadl01, Integer faclsQadi01,
			String faclsQadc02, Double oidFaclsMstr) {
		super(id, faclsDep, faclsDesc, faclsModUserid, faclsModDate,
				faclsUser1, faclsUser2, faclsChr01, faclsDec01, faclsLog01,
				faclsInt01, faclsQadc01, faclsQadd01, faclsQadl01, faclsQadi01,
				faclsQadc02, oidFaclsMstr);
	}

	/** full constructor */
	public FaclsMstr(FaclsMstrId id, Boolean faclsDep, String faclsDesc,
			String faclsModUserid, Date faclsModDate, String faclsUser1,
			String faclsUser2, String faclsChr01, Double faclsDec01,
			Boolean faclsLog01, Integer faclsInt01, Date faclsDte01,
			String faclsQadc01, Double faclsQadd01, Boolean faclsQadl01,
			Integer faclsQadi01, Date faclsQadt01, String faclsQadc02,
			Double oidFaclsMstr) {
		super(id, faclsDep, faclsDesc, faclsModUserid, faclsModDate,
				faclsUser1, faclsUser2, faclsChr01, faclsDec01, faclsLog01,
				faclsInt01, faclsDte01, faclsQadc01, faclsQadd01, faclsQadl01,
				faclsQadi01, faclsQadt01, faclsQadc02, oidFaclsMstr);
	}

}
