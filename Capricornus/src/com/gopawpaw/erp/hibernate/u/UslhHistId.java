package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UslhHistId entity. @author MyEclipse Persistence Tools
 */
public class UslhHistId extends AbstractUslhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public UslhHistId() {
	}

	/** full constructor */
	public UslhHistId(String uslhUserid, Date uslhDate, Integer uslhTime,
			Boolean uslhPasswdValid, String uslhStatusCode,
			String uslhModUserid, String uslhUser1, String uslhUser2,
			String uslhQadc01, String uslhQadc02, String uslhTimezone,
			Double oidUslhHist, Date uslhModDate, String uslhDomain,
			Integer uslhAccessType) {
		super(uslhUserid, uslhDate, uslhTime, uslhPasswdValid, uslhStatusCode,
				uslhModUserid, uslhUser1, uslhUser2, uslhQadc01, uslhQadc02,
				uslhTimezone, oidUslhHist, uslhModDate, uslhDomain,
				uslhAccessType);
	}

}
