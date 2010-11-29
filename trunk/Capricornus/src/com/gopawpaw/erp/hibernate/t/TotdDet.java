package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TotdDet entity. @author MyEclipse Persistence Tools
 */
public class TotdDet extends AbstractTotdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TotdDet() {
	}

	/** full constructor */
	public TotdDet(TotdDetId id, String totdResponsibility,
			String totdModUserid, Date totdModDate, String totdUser1,
			String totdUser2, String totdQadc01, String totdQadc02,
			Double oidTotdDet) {
		super(id, totdResponsibility, totdModUserid, totdModDate, totdUser1,
				totdUser2, totdQadc01, totdQadc02, oidTotdDet);
	}

}
