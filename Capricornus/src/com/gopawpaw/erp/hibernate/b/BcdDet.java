package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BcdDet entity. @author MyEclipse Persistence Tools
 */
public class BcdDet extends AbstractBcdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BcdDet() {
	}

	/** minimal constructor */
	public BcdDet(BcdDetId id, String bcdMnuNbr, Integer bcdMnuSel,
			Double oidBcdDet) {
		super(id, bcdMnuNbr, bcdMnuSel, oidBcdDet);
	}

	/** full constructor */
	public BcdDet(BcdDetId id, Integer bcdPriority, String bcdExec,
			String bcdDev, Boolean bcdPerm, Boolean bcdProcess,
			Date bcdDateRun, String bcdTimeRun, String bcdRunStat,
			String bcdParm, String bcdUser1, String bcdUser2, String bcdMnuNbr,
			Integer bcdMnuSel, String bcdQadc01, Double oidBcdDet) {
		super(id, bcdPriority, bcdExec, bcdDev, bcdPerm, bcdProcess,
				bcdDateRun, bcdTimeRun, bcdRunStat, bcdParm, bcdUser1,
				bcdUser2, bcdMnuNbr, bcdMnuSel, bcdQadc01, oidBcdDet);
	}

}
