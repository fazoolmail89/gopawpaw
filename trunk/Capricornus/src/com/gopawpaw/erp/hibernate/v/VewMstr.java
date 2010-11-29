package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VewMstr entity. @author MyEclipse Persistence Tools
 */
public class VewMstr extends AbstractVewMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VewMstr() {
	}

	/** minimal constructor */
	public VewMstr(VewMstrId id, Double oidVewMstr) {
		super(id, oidVewMstr);
	}

	/** full constructor */
	public VewMstr(VewMstrId id, String vewName, String vewDesc,
			Double vewWeightFactor, String vewModUserid, Date vewModDate,
			String vewUser1, String vewUser2, String vewUser3, String vewUser4,
			String vewQadc01, String vewQadc02, String vewQadc03,
			String vewQadc04, Double vewQadd01, Double vewQadd02,
			Boolean vewQadl01, Boolean vewQadl02, Date vewQadt01,
			Date vewQadt02, Integer vewQadi01, Integer vewQadi02,
			Double oidVewMstr) {
		super(id, vewName, vewDesc, vewWeightFactor, vewModUserid, vewModDate,
				vewUser1, vewUser2, vewUser3, vewUser4, vewQadc01, vewQadc02,
				vewQadc03, vewQadc04, vewQadd01, vewQadd02, vewQadl01,
				vewQadl02, vewQadt01, vewQadt02, vewQadi01, vewQadi02,
				oidVewMstr);
	}

}
