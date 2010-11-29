package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapfilDet entity. @author MyEclipse Persistence Tools
 */
public class EsapfilDet extends AbstractEsapfilDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapfilDet() {
	}

	/** full constructor */
	public EsapfilDet(EsapfilDetId id, Double oidEsapfilDet,
			Date esapfilModDate, String esapfilModUserid, String esapfilUser1,
			String esapfilUser2, String esapfilQadc01, String esapfilQadc02) {
		super(id, oidEsapfilDet, esapfilModDate, esapfilModUserid,
				esapfilUser1, esapfilUser2, esapfilQadc01, esapfilQadc02);
	}

}
