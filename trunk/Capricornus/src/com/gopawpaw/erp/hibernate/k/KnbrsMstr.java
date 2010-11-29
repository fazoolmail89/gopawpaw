package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbrsMstr entity. @author MyEclipse Persistence Tools
 */
public class KnbrsMstr extends AbstractKnbrsMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbrsMstr() {
	}

	/** minimal constructor */
	public KnbrsMstr(KnbrsMstrId id, Integer knbrsDispatchTime,
			Integer knbrsProcSess, Integer knbrsExportBatch,
			String knbrsModUserid, String knbrsUser1, String knbrsUser2,
			String knbrsQadc01, String knbrsQadc02, String knbrsQadc03,
			String knbrsQadc04, Boolean knbrsQadl01, Boolean knbrsQadl02,
			Double oidKnbrsMstr) {
		super(id, knbrsDispatchTime, knbrsProcSess, knbrsExportBatch,
				knbrsModUserid, knbrsUser1, knbrsUser2, knbrsQadc01,
				knbrsQadc02, knbrsQadc03, knbrsQadc04, knbrsQadl01,
				knbrsQadl02, oidKnbrsMstr);
	}

	/** full constructor */
	public KnbrsMstr(KnbrsMstrId id, Date knbrsDispatchDate,
			Integer knbrsDispatchTime, Integer knbrsProcSess,
			Integer knbrsExportBatch, Date knbrsModDate, String knbrsModUserid,
			String knbrsUser1, String knbrsUser2, String knbrsQadc01,
			String knbrsQadc02, String knbrsQadc03, String knbrsQadc04,
			Boolean knbrsQadl01, Boolean knbrsQadl02, Double oidKnbrsMstr) {
		super(id, knbrsDispatchDate, knbrsDispatchTime, knbrsProcSess,
				knbrsExportBatch, knbrsModDate, knbrsModUserid, knbrsUser1,
				knbrsUser2, knbrsQadc01, knbrsQadc02, knbrsQadc03, knbrsQadc04,
				knbrsQadl01, knbrsQadl02, oidKnbrsMstr);
	}

}
