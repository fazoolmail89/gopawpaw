package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UrlMstr entity. @author MyEclipse Persistence Tools
 */
public class UrlMstr extends AbstractUrlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UrlMstr() {
	}

	/** minimal constructor */
	public UrlMstr(UrlMstrId id, Integer urlQadi02, Double oidUrlMstr) {
		super(id, urlQadi02, oidUrlMstr);
	}

	/** full constructor */
	public UrlMstr(UrlMstrId id, String urlDesc, String urlQadc02,
			String urlModUserid, Date urlModDate, String urlUser1,
			String urlUser2, String urlImage, Integer urlQadi02,
			String urlQadc03, Integer urlQadi01, Boolean urlQadl01,
			Date urlQadt01, Double urlQadd01, Boolean urlPrimary,
			Boolean urlDetermine, Double oidUrlMstr) {
		super(id, urlDesc, urlQadc02, urlModUserid, urlModDate, urlUser1,
				urlUser2, urlImage, urlQadi02, urlQadc03, urlQadi01, urlQadl01,
				urlQadt01, urlQadd01, urlPrimary, urlDetermine, oidUrlMstr);
	}

}
