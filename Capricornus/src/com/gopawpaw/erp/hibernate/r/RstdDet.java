package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RstdDet entity. @author MyEclipse Persistence Tools
 */
public class RstdDet extends AbstractRstdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RstdDet() {
	}

	/** minimal constructor */
	public RstdDet(RstdDetId id, Integer rstdSequence, String rstdUserid,
			String rstdUser1, String rstdUser2, Boolean rstdNotifyNxt,
			Boolean rstdCanreroute, Integer rstdSvrtyLvl, Double oidRstdDet) {
		super(id, rstdSequence, rstdUserid, rstdUser1, rstdUser2,
				rstdNotifyNxt, rstdCanreroute, rstdSvrtyLvl, oidRstdDet);
	}

	/** full constructor */
	public RstdDet(RstdDetId id, Integer rstdSequence, Date rstdModDate,
			String rstdUserid, String rstdUser1, String rstdUser2,
			Boolean rstdNotifyNxt, Boolean rstdCanreroute,
			Integer rstdSvrtyLvl, String rstdQadc01, Double oidRstdDet) {
		super(id, rstdSequence, rstdModDate, rstdUserid, rstdUser1, rstdUser2,
				rstdNotifyNxt, rstdCanreroute, rstdSvrtyLvl, rstdQadc01,
				oidRstdDet);
	}

}
