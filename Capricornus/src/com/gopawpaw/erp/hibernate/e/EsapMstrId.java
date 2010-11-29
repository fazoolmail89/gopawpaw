package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapMstrId entity. @author MyEclipse Persistence Tools
 */
public class EsapMstrId extends AbstractEsapMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapMstrId() {
	}

	/** full constructor */
	public EsapMstrId(Double oidEscatMstr, Date esapBeginDate) {
		super(oidEscatMstr, esapBeginDate);
	}

}
