package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VerdDet entity. @author MyEclipse Persistence Tools
 */
public class VerdDet extends AbstractVerdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VerdDet() {
	}

	/** minimal constructor */
	public VerdDet(VerdDetId id, Double oidVerdDet) {
		super(id, oidVerdDet);
	}

	/** full constructor */
	public VerdDet(VerdDetId id, Boolean verdActiveFlag, String verdModUserid,
			Date verdModDate, String verdUser1, String verdUser2,
			String verdUser3, String verdUser4, String verdQadc01,
			String verdQadc02, String verdQadc03, String verdQadc04,
			Double verdQadd01, Double verdQadd02, Boolean verdQadl01,
			Boolean verdQadl02, Date verdQadt01, Date verdQadt02,
			Integer verdQadi01, Integer verdQadi02, Double oidVerdDet) {
		super(id, verdActiveFlag, verdModUserid, verdModDate, verdUser1,
				verdUser2, verdUser3, verdUser4, verdQadc01, verdQadc02,
				verdQadc03, verdQadc04, verdQadd01, verdQadd02, verdQadl01,
				verdQadl02, verdQadt01, verdQadt02, verdQadi01, verdQadi02,
				oidVerdDet);
	}

}
