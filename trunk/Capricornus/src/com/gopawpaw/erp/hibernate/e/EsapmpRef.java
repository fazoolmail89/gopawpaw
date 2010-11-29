package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapmpRef entity. @author MyEclipse Persistence Tools
 */
public class EsapmpRef extends AbstractEsapmpRef implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapmpRef() {
	}

	/** full constructor */
	public EsapmpRef(EsapmpRefId id, Double oidEsapmpRef,
			Boolean esapmpEsigActive, Date esapmpModDate,
			String esapmpModUserid, String esapmpUser1, String esapmpUser2,
			String esapmpQadc01, String esapmpQadc02) {
		super(id, oidEsapmpRef, esapmpEsigActive, esapmpModDate,
				esapmpModUserid, esapmpUser1, esapmpUser2, esapmpQadc01,
				esapmpQadc02);
	}

}
