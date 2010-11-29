package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AtwkDet entity. @author MyEclipse Persistence Tools
 */
public class AtwkDet extends AbstractAtwkDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AtwkDet() {
	}

	/** full constructor */
	public AtwkDet(AtwkDetId id, Double oidAtwkDet, String atwkKeyType,
			Date atwkModDate, String atwkModUserid, String atwkUser1,
			String atwkUser2, String atwkQadc01, String atwkQadc02) {
		super(id, oidAtwkDet, atwkKeyType, atwkModDate, atwkModUserid,
				atwkUser1, atwkUser2, atwkQadc01, atwkQadc02);
	}

}
