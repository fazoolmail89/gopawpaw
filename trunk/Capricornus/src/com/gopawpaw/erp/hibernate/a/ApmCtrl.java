package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * ApmCtrl entity. @author MyEclipse Persistence Tools
 */
public class ApmCtrl extends AbstractApmCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ApmCtrl() {
	}

	/** minimal constructor */
	public ApmCtrl(Double oidApmCtrl) {
		super(oidApmCtrl);
	}

	/** full constructor */
	public ApmCtrl(Integer apmQadi03, String apmDiv, Boolean apmMultiDiv,
			Boolean apmPrig1, Boolean apmPrig2, Boolean apmPlpri,
			String apmPlpriSseq, String apmPlpriDseq, Boolean apmManual,
			Boolean apmLineRel, String apmUser1, String apmUser2,
			String apmQadc01, String apmQadc02, String apmQadc03,
			Double apmQadd01, Double apmQadd02, Integer apmQadi01,
			Integer apmQadi02, Boolean apmQadl01, Boolean apmQadl02,
			Boolean apmQadl03, Date apmQadt01, Date apmQadt02, Double oidApmCtrl) {
		super(apmQadi03, apmDiv, apmMultiDiv, apmPrig1, apmPrig2, apmPlpri,
				apmPlpriSseq, apmPlpriDseq, apmManual, apmLineRel, apmUser1,
				apmUser2, apmQadc01, apmQadc02, apmQadc03, apmQadd01,
				apmQadd02, apmQadi01, apmQadi02, apmQadl01, apmQadl02,
				apmQadl03, apmQadt01, apmQadt02, oidApmCtrl);
	}

}
