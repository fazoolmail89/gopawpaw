package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FtMstr entity. @author MyEclipse Persistence Tools
 */
public class FtMstr extends AbstractFtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FtMstr() {
	}

	/** minimal constructor */
	public FtMstr(FtMstrId id, String ftType, String ftAccrualLevel,
			String ftLcCharge, Double oidFtMstr) {
		super(id, ftType, ftAccrualLevel, ftLcCharge, oidFtMstr);
	}

	/** full constructor */
	public FtMstr(FtMstrId id, String ftType, String ftDesc, String ftUser1,
			String ftUser2, String ftChr01, String ftChr02, String ftChr03,
			String ftChr04, String ftChr05, String ftChr06, String ftChr07,
			String ftChr08, Double ftDec01, Double ftDec02, Date ftDte01,
			Date ftDte02, Boolean ftLog01, Boolean ftLog02,
			String ftAccrualLevel, String ftLcCharge, Double oidFtMstr) {
		super(id, ftType, ftDesc, ftUser1, ftUser2, ftChr01, ftChr02, ftChr03,
				ftChr04, ftChr05, ftChr06, ftChr07, ftChr08, ftDec01, ftDec02,
				ftDte01, ftDte02, ftLog01, ftLog02, ftAccrualLevel, ftLcCharge,
				oidFtMstr);
	}

}
