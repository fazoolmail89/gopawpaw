package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RsuMstr entity. @author MyEclipse Persistence Tools
 */
public class RsuMstr extends AbstractRsuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsuMstr() {
	}

	/** minimal constructor */
	public RsuMstr(RsuMstrId id, String rsuApprCode, String rsuDocNbr,
			String rsuDocType, String rsuNotify2, String rsuUser1,
			String rsuUser2, String rsuNotify2Mail, Double oidRsuMstr) {
		super(id, rsuApprCode, rsuDocNbr, rsuDocType, rsuNotify2, rsuUser1,
				rsuUser2, rsuNotify2Mail, oidRsuMstr);
	}

	/** full constructor */
	public RsuMstr(RsuMstrId id, String rsuApprCode, String rsuDocNbr,
			String rsuDocType, Date rsuApprDate, Date rsuRouteDate,
			String rsuNotify2, String rsuUser1, String rsuUser2,
			String rsuNotify2Mail, String rsuQadc01, Double oidRsuMstr) {
		super(id, rsuApprCode, rsuDocNbr, rsuDocType, rsuApprDate,
				rsuRouteDate, rsuNotify2, rsuUser1, rsuUser2, rsuNotify2Mail,
				rsuQadc01, oidRsuMstr);
	}

}
