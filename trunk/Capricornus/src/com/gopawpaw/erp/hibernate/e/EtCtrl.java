package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EtCtrl entity. @author MyEclipse Persistence Tools
 */
public class EtCtrl extends AbstractEtCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EtCtrl() {
	}

	/** minimal constructor */
	public EtCtrl(String etBaseCurr, String etConvAcct, String etConvCc,
			String etQadc05, Date etGlEffDt, Boolean etQadl04,
			Boolean etPrintDc, Boolean etShowDiff, Boolean etStartConv,
			Boolean etQadl05, Boolean etRateActive, Integer etQadi04,
			String etUser1, String etUser2, Double etQadd01, Double etQadd02,
			Double etQadd03, Integer etQadi01, Integer etQadi02,
			Integer etQadi03, Boolean etQadl01, Boolean etQadl02,
			Boolean etQadl03, String etQadc01, String etQadc02,
			String etQadc03, Double oidEtCtrl) {
		super(etBaseCurr, etConvAcct, etConvCc, etQadc05, etGlEffDt, etQadl04,
				etPrintDc, etShowDiff, etStartConv, etQadl05, etRateActive,
				etQadi04, etUser1, etUser2, etQadd01, etQadd02, etQadd03,
				etQadi01, etQadi02, etQadi03, etQadl01, etQadl02, etQadl03,
				etQadc01, etQadc02, etQadc03, oidEtCtrl);
	}

	/** full constructor */
	public EtCtrl(String etBaseCurr, String etConvAcct, String etConvCc,
			String etQadc05, Date etGlEffDt, Date etQadt04, Boolean etQadl04,
			Boolean etPrintDc, Boolean etShowDiff, Boolean etStartConv,
			Boolean etQadl05, Boolean etRateActive, Integer etQadi04,
			String etUser1, String etUser2, Double etQadd01, Double etQadd02,
			Double etQadd03, Integer etQadi01, Integer etQadi02,
			Integer etQadi03, Boolean etQadl01, Boolean etQadl02,
			Boolean etQadl03, String etQadc01, String etQadc02,
			String etQadc03, Date etQadt01, Date etQadt02, Date etQadt03,
			String etConvSub, Double oidEtCtrl) {
		super(etBaseCurr, etConvAcct, etConvCc, etQadc05, etGlEffDt, etQadt04,
				etQadl04, etPrintDc, etShowDiff, etStartConv, etQadl05,
				etRateActive, etQadi04, etUser1, etUser2, etQadd01, etQadd02,
				etQadd03, etQadi01, etQadi02, etQadi03, etQadl01, etQadl02,
				etQadl03, etQadc01, etQadc02, etQadc03, etQadt01, etQadt02,
				etQadt03, etConvSub, oidEtCtrl);
	}

}
