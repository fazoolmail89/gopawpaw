package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TeMstr entity. @author MyEclipse Persistence Tools
 */
public class TeMstr extends AbstractTeMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TeMstr() {
	}

	/** minimal constructor */
	public TeMstr(TeMstrId id, Double oidTeMstr) {
		super(id, oidTeMstr);
	}

	/** full constructor */
	public TeMstr(TeMstrId id, String teExpType, String teUpdt, String teDest,
			String tePgm, String teUserid, Date teDate, String teTime,
			Date teDateExp, String teTimeExp, Date teDateDeliv,
			String teTimeDeliv, Integer tePgmErrs, Integer tePgmWarn,
			String tePgmMsgs, String teData, String teUser1, String teUser2,
			String teQadc01, String teQadc02, String teQadc03, String teQadc04,
			Integer teQadi05, Integer teQadi06, Double teQadd07,
			Double teQadd08, Date teQadt09, Date teQadt10, Boolean teQadl11,
			Boolean teQadl12, String teChr01, String teChr02, Double teDec01,
			Double teDec02, Date teDte01, Date teDte02, Boolean teLog01,
			Boolean teLog02, Double oidTeMstr) {
		super(id, teExpType, teUpdt, teDest, tePgm, teUserid, teDate, teTime,
				teDateExp, teTimeExp, teDateDeliv, teTimeDeliv, tePgmErrs,
				tePgmWarn, tePgmMsgs, teData, teUser1, teUser2, teQadc01,
				teQadc02, teQadc03, teQadc04, teQadi05, teQadi06, teQadd07,
				teQadd08, teQadt09, teQadt10, teQadl11, teQadl12, teChr01,
				teChr02, teDec01, teDec02, teDte01, teDte02, teLog01, teLog02,
				oidTeMstr);
	}

}
