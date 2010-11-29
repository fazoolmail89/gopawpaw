package com.gopawpaw.erp.hibernate.r;

/**
 * RndMstr entity. @author MyEclipse Persistence Tools
 */
public class RndMstr extends AbstractRndMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RndMstr() {
	}

	/** minimal constructor */
	public RndMstr(RndMstrId id, Double oidRndMstr) {
		super(id, oidRndMstr);
	}

	/** full constructor */
	public RndMstr(RndMstrId id, String rndDesc, Double rndUnit,
			Double rndThrshld, String rndDecPt, String rndQad01,
			String rndQad02, String rndQad03, String rndQad04, String rndChr01,
			String rndChr02, String rndChr03, String rndChr04, String rndUser1,
			String rndUser2, Double oidRndMstr) {
		super(id, rndDesc, rndUnit, rndThrshld, rndDecPt, rndQad01, rndQad02,
				rndQad03, rndQad04, rndChr01, rndChr02, rndChr03, rndChr04,
				rndUser1, rndUser2, oidRndMstr);
	}

}
