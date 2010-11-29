package com.gopawpaw.erp.hibernate.l;

import java.math.BigDecimal;
import java.util.Date;

/**
 * LcapHist entity. @author MyEclipse Persistence Tools
 */
public class LcapHist extends AbstractLcapHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LcapHist() {
	}

	/** minimal constructor */
	public LcapHist(LcapHistId id, BigDecimal lcapCount1,
			BigDecimal lcapCount2, BigDecimal lcapCount3,
			BigDecimal lcapCount4, String lcapHash, String lcapModUserid,
			Date lcapModDate, String lcapQadc01, String lcapQadc02,
			Date lcapQadt01, Integer lcapQadi01, Double lcapQadd01,
			Double lcapQadd02, Double oidLcapHist) {
		super(id, lcapCount1, lcapCount2, lcapCount3, lcapCount4, lcapHash,
				lcapModUserid, lcapModDate, lcapQadc01, lcapQadc02, lcapQadt01,
				lcapQadi01, lcapQadd01, lcapQadd02, oidLcapHist);
	}

	/** full constructor */
	public LcapHist(LcapHistId id, BigDecimal lcapCount1,
			BigDecimal lcapCount2, BigDecimal lcapCount3,
			BigDecimal lcapCount4, String lcapHash, String lcapModUserid,
			Date lcapModDate, String lcapQadc01, String lcapQadc02,
			Date lcapQadt01, Integer lcapQadi01, Double lcapQadd01,
			Double lcapQadd02, Boolean lcapQadl01, Double oidLcapHist) {
		super(id, lcapCount1, lcapCount2, lcapCount3, lcapCount4, lcapHash,
				lcapModUserid, lcapModDate, lcapQadc01, lcapQadc02, lcapQadt01,
				lcapQadi01, lcapQadd01, lcapQadd02, lcapQadl01, oidLcapHist);
	}

}
