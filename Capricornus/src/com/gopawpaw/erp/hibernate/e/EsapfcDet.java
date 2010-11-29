package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapfcDet entity. @author MyEclipse Persistence Tools
 */
public class EsapfcDet extends AbstractEsapfcDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapfcDet() {
	}

	/** full constructor */
	public EsapfcDet(EsapfcDetId id, Double oidEsapfcDet, Date esapfcModDate,
			String esapfcModUserid, String esapfcUser1, String esapfcUser2,
			String esapfcQadc01, String esapfcQadc02) {
		super(id, oidEsapfcDet, esapfcModDate, esapfcModUserid, esapfcUser1,
				esapfcUser2, esapfcQadc01, esapfcQadc02);
	}

}
