package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PcldDet entity. @author MyEclipse Persistence Tools
 */
public class PcldDet extends AbstractPcldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcldDet() {
	}

	/** minimal constructor */
	public PcldDet(PcldDetId id, String pcldDev, Integer pcldCopies,
			String pcldUser1, String pcldUser2, String pcldUserid,
			Double oidPcldDet) {
		super(id, pcldDev, pcldCopies, pcldUser1, pcldUser2, pcldUserid,
				oidPcldDet);
	}

	/** full constructor */
	public PcldDet(PcldDetId id, String pcldDev, Integer pcldCopies,
			String pcldUser1, String pcldUser2, Date pcldExpire,
			Date pcldModDate, String pcldUserid, String pcldQadc01,
			Double oidPcldDet) {
		super(id, pcldDev, pcldCopies, pcldUser1, pcldUser2, pcldExpire,
				pcldModDate, pcldUserid, pcldQadc01, oidPcldDet);
	}

}
