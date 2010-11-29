package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * FsuMstr entity. @author MyEclipse Persistence Tools
 */
public class FsuMstr extends AbstractFsuMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FsuMstr() {
	}

	/** minimal constructor */
	public FsuMstr(FsuMstrId id, Double oidFsuMstr) {
		super(id, oidFsuMstr);
	}

	/** full constructor */
	public FsuMstr(FsuMstrId id, Boolean fsuCaTimeWnd, Boolean fsuCaWoWnd,
			Integer fsuDfltPri, String fsuDfltQue, String fsuEscDflt,
			Integer fsuQueProg, String fsuQuoteQue, String fsuTimezone,
			String fsuQadc02, String fsuQadc03, String fsuQadc04,
			String fsuQadc05, Boolean fsuQadl01, Boolean fsuQadl02,
			Boolean fsuQadl03, Boolean fsuQadl04, Boolean fsuQadl05,
			Integer fsuQadi01, Integer fsuQadi02, Integer fsuQadi03,
			Integer fsuQadi04, Integer fsuQadi05, String fsuUser1,
			String fsuUser2, String fsuQadc06, Date fsuQadt01, Date fsuQadt02,
			Double oidFsuMstr) {
		super(id, fsuCaTimeWnd, fsuCaWoWnd, fsuDfltPri, fsuDfltQue, fsuEscDflt,
				fsuQueProg, fsuQuoteQue, fsuTimezone, fsuQadc02, fsuQadc03,
				fsuQadc04, fsuQadc05, fsuQadl01, fsuQadl02, fsuQadl03,
				fsuQadl04, fsuQadl05, fsuQadi01, fsuQadi02, fsuQadi03,
				fsuQadi04, fsuQadi05, fsuUser1, fsuUser2, fsuQadc06, fsuQadt01,
				fsuQadt02, oidFsuMstr);
	}

}
