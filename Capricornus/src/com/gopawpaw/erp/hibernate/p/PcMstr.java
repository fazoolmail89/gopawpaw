package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PcMstr entity. @author MyEclipse Persistence Tools
 */
public class PcMstr extends AbstractPcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PcMstr() {
	}

	/** minimal constructor */
	public PcMstr(PcMstrId id, Double oidPcMstr) {
		super(id, oidPcMstr);
	}

	/** full constructor */
	public PcMstr(PcMstrId id, Date pcExpire, String pcAmtType, String pcQad02,
			String pcMinQty, String pcAmt, Boolean pcTaxIn, Double pcQad01,
			String pcUser1, String pcUser2, String pcUserid, Date pcModDate,
			Double pcMinPrice, String pcMaxPrice, Double oidPcMstr) {
		super(id, pcExpire, pcAmtType, pcQad02, pcMinQty, pcAmt, pcTaxIn,
				pcQad01, pcUser1, pcUser2, pcUserid, pcModDate, pcMinPrice,
				pcMaxPrice, oidPcMstr);
	}

}
