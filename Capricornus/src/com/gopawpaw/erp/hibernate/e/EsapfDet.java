package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapfDet entity. @author MyEclipse Persistence Tools
 */
public class EsapfDet extends AbstractEsapfDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapfDet() {
	}

	/** full constructor */
	public EsapfDet(EsapfDetId id, Double oidEsapfDet, String esapfFieldName,
			Boolean esapfInclude, Boolean esapfLabelInline, String esapfCode,
			Date esapfModDate, String esapfModUserid, String esapfUser1,
			String esapfUser2, String esapfQadc01, String esapfQadc02) {
		super(id, oidEsapfDet, esapfFieldName, esapfInclude, esapfLabelInline,
				esapfCode, esapfModDate, esapfModUserid, esapfUser1,
				esapfUser2, esapfQadc01, esapfQadc02);
	}

}
