package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FpstMstr entity. @author MyEclipse Persistence Tools
 */
public class FpstMstr extends AbstractFpstMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FpstMstr() {
	}

	/** minimal constructor */
	public FpstMstr(FpstMstrId id, Double oidFpstMstr) {
		super(id, oidFpstMstr);
	}

	/** full constructor */
	public FpstMstr(FpstMstrId id, Boolean fpstReturn, String fpstDesc,
			Boolean fpstExchange, Boolean fpstGood, Boolean fpstScrap,
			Boolean fpstPending, Date fpstModDate, String fpstModUserid,
			String fpstUser1, String fpstUser2, String fpstChr01,
			String fpstChr02, Boolean fpstLog01, Boolean fpstLog02,
			Date fpstDte01, Double fpstDec01, String fpstQadc01,
			String fpstQadc02, Boolean fpstQadl01, Boolean fpstQadl02,
			Date fpstQadt01, Double fpstQade01, Double oidFpstMstr) {
		super(id, fpstReturn, fpstDesc, fpstExchange, fpstGood, fpstScrap,
				fpstPending, fpstModDate, fpstModUserid, fpstUser1, fpstUser2,
				fpstChr01, fpstChr02, fpstLog01, fpstLog02, fpstDte01,
				fpstDec01, fpstQadc01, fpstQadc02, fpstQadl01, fpstQadl02,
				fpstQadt01, fpstQade01, oidFpstMstr);
	}

}
