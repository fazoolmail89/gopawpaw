package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CacCtrl entity. @author MyEclipse Persistence Tools
 */
public class CacCtrl extends AbstractCacCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CacCtrl() {
	}

	/** minimal constructor */
	public CacCtrl(String cacExRatetype, Double oidCacCtrl) {
		super(cacExRatetype, oidCacCtrl);
	}

	/** full constructor */
	public CacCtrl(Integer cacNbr, String cacUser1, String cacUser2,
			Integer cacQadi01, String cacQadc01, String cacQadc02,
			Boolean cacQadl01, Boolean cacQadl02, String cacModUserid,
			Date cacModDate, Boolean cacUpdIsb, Integer cacQuote,
			Integer cacQuoteDays, String cacQuotePre, String cacQuoteQue,
			String cacExRatetype, Double oidCacCtrl) {
		super(cacNbr, cacUser1, cacUser2, cacQadi01, cacQadc01, cacQadc02,
				cacQadl01, cacQadl02, cacModUserid, cacModDate, cacUpdIsb,
				cacQuote, cacQuoteDays, cacQuotePre, cacQuoteQue,
				cacExRatetype, oidCacCtrl);
	}

}
