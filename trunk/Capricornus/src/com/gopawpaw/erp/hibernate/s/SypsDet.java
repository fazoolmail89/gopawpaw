package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SypsDet entity. @author MyEclipse Persistence Tools
 */
public class SypsDet extends AbstractSypsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SypsDet() {
	}

	/** minimal constructor */
	public SypsDet(SypsDetId id, Double oidSypsDet) {
		super(id, oidSypsDet);
	}

	/** full constructor */
	public SypsDet(SypsDetId id, Boolean sypsTrigUpdt, String sypsModUserid,
			Date sypsModDate, String sypsUser1, String sypsUser2,
			String sypsChr01, String sypsChr02, Double sypsDec01,
			Double sypsDec02, Integer sypsInt01, Integer sypsInt02,
			Boolean sypsLog01, Boolean sypsLog02, Date sypsDte01,
			Date sypsDte02, String sypsQadc01, String sypsQadc02,
			String sypsQadc03, String sypsQadc04, Double sypsQadd01,
			Double sypsQadd02, Integer sypsQadi01, Integer sypsQadi02,
			Boolean sypsQadl01, Boolean sypsQadl02, Date sypsQadt01,
			Date sypsQadt02, Double oidSypsDet) {
		super(id, sypsTrigUpdt, sypsModUserid, sypsModDate, sypsUser1,
				sypsUser2, sypsChr01, sypsChr02, sypsDec01, sypsDec02,
				sypsInt01, sypsInt02, sypsLog01, sypsLog02, sypsDte01,
				sypsDte02, sypsQadc01, sypsQadc02, sypsQadc03, sypsQadc04,
				sypsQadd01, sypsQadd02, sypsQadi01, sypsQadi02, sypsQadl01,
				sypsQadl02, sypsQadt01, sypsQadt02, oidSypsDet);
	}

}
