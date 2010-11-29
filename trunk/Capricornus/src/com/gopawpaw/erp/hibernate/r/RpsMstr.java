package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RpsMstr entity. @author MyEclipse Persistence Tools
 */
public class RpsMstr extends AbstractRpsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RpsMstr() {
	}

	/** minimal constructor */
	public RpsMstr(RpsMstrId id, Double oidRpsMstr) {
		super(id, oidRpsMstr);
	}

	/** full constructor */
	public RpsMstr(RpsMstrId id, Date rpsRelDate, Double rpsQtyReq,
			Double rpsQtyComp, Integer rpsRecord, String rpsUser1,
			String rpsUser2, String rpsBomCode, String rpsRouting,
			String rpsQadc01, Double oidRpsMstr) {
		super(id, rpsRelDate, rpsQtyReq, rpsQtyComp, rpsRecord, rpsUser1,
				rpsUser2, rpsBomCode, rpsRouting, rpsQadc01, oidRpsMstr);
	}

}
