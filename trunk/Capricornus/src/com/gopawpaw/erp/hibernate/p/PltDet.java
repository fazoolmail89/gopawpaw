package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PltDet entity. @author MyEclipse Persistence Tools
 */
public class PltDet extends AbstractPltDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PltDet() {
	}

	/** minimal constructor */
	public PltDet(PltDetId id, Double oidPltDet) {
		super(id, oidPltDet);
	}

	/** full constructor */
	public PltDet(PltDetId id, String pltTaxc, Boolean pltTaxable,
			String pltUser1, String pltUser2, String pltUserid,
			Date pltModDate, String pltQadc01, Double oidPltDet) {
		super(id, pltTaxc, pltTaxable, pltUser1, pltUser2, pltUserid,
				pltModDate, pltQadc01, oidPltDet);
	}

}
