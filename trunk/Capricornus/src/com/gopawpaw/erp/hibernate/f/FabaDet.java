package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FabaDet entity. @author MyEclipse Persistence Tools
 */
public class FabaDet extends AbstractFabaDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FabaDet() {
	}

	/** minimal constructor */
	public FabaDet(FabaDetId id, String fabaAcct, String fabaSub,
			String fabaCc, String fabaProj, String fabaModUserid,
			Date fabaModDate, String fabaUser1, String fabaUser2,
			String fabaChr01, Double fabaDec01, Boolean fabaLog01,
			Integer fabaInt01, String fabaQadc01, Double fabaQadd01,
			Integer fabaQadi01, Boolean fabaQadl01, Double oidFabaDet) {
		super(id, fabaAcct, fabaSub, fabaCc, fabaProj, fabaModUserid,
				fabaModDate, fabaUser1, fabaUser2, fabaChr01, fabaDec01,
				fabaLog01, fabaInt01, fabaQadc01, fabaQadd01, fabaQadi01,
				fabaQadl01, oidFabaDet);
	}

	/** full constructor */
	public FabaDet(FabaDetId id, String fabaAcct, String fabaSub,
			String fabaCc, String fabaProj, String fabaModUserid,
			Date fabaModDate, String fabaUser1, String fabaUser2,
			String fabaChr01, Double fabaDec01, Boolean fabaLog01,
			Date fabaDte01, Integer fabaInt01, String fabaQadc01,
			Double fabaQadd01, Integer fabaQadi01, Boolean fabaQadl01,
			Date fabaQadt01, Double oidFabaDet) {
		super(id, fabaAcct, fabaSub, fabaCc, fabaProj, fabaModUserid,
				fabaModDate, fabaUser1, fabaUser2, fabaChr01, fabaDec01,
				fabaLog01, fabaDte01, fabaInt01, fabaQadc01, fabaQadd01,
				fabaQadi01, fabaQadl01, fabaQadt01, oidFabaDet);
	}

}
