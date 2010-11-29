package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TotMstr entity. @author MyEclipse Persistence Tools
 */
public class TotMstr extends AbstractTotMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TotMstr() {
	}

	/** full constructor */
	public TotMstr(TotMstrId id, String totTermsDesc, String totModUserid,
			Date totModDate, String totUser1, String totUser2,
			String totQadc01, String totQadc02, Double oidTotMstr) {
		super(id, totTermsDesc, totModUserid, totModDate, totUser1, totUser2,
				totQadc01, totQadc02, oidTotMstr);
	}

}
