package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EscfRef entity. @author MyEclipse Persistence Tools
 */
public class EscfRef extends AbstractEscfRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscfRef() {
	}

	/** full constructor */
	public EscfRef(EscfRefId id, Double oidEscfRef, Date escfModDate,
			String escfModUserid, String escfUser1, String escfUser2,
			String escfQadc01, String escfQadc02) {
		super(id, oidEscfRef, escfModDate, escfModUserid, escfUser1, escfUser2,
				escfQadc01, escfQadc02);
	}

}
