package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FtchHist entity. @author MyEclipse Persistence Tools
 */
public class FtchHist extends AbstractFtchHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FtchHist() {
	}

	/** minimal constructor */
	public FtchHist(FtchHistId id, Double oidFtchHist) {
		super(id, oidFtchHist);
	}

	/** full constructor */
	public FtchHist(FtchHistId id, String ftchDesc, Date ftchEffDate,
			String ftchEngCode, Date ftchEntDate, String ftchModel,
			String ftchNbr, String ftchPart, String ftchSerial,
			Boolean ftchSwapped, String ftchTrans, Date ftchModDate,
			String ftchChr01, String ftchModUserid, Date ftchDte01,
			Boolean ftchLog01, String ftchPriorValue, Date ftchQadt01,
			Boolean ftchQadl01, String ftchUser1, String ftchUser2,
			String ftchQadc02, Double ftchQadd01, Double oidFtchHist) {
		super(id, ftchDesc, ftchEffDate, ftchEngCode, ftchEntDate, ftchModel,
				ftchNbr, ftchPart, ftchSerial, ftchSwapped, ftchTrans,
				ftchModDate, ftchChr01, ftchModUserid, ftchDte01, ftchLog01,
				ftchPriorValue, ftchQadt01, ftchQadl01, ftchUser1, ftchUser2,
				ftchQadc02, ftchQadd01, oidFtchHist);
	}

}
