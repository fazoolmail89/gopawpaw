package com.gopawpaw.erp.hibernate.p;

import java.sql.Timestamp;

/**
 * ProMstr entity. @author MyEclipse Persistence Tools
 */
public class ProMstr extends AbstractProMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ProMstr() {
	}

	/** minimal constructor */
	public ProMstr(ProMstrId id) {
		super(id);
	}

	/** full constructor */
	public ProMstr(ProMstrId id, String proName, String proMd5,
			Timestamp proMdate) {
		super(id, proName, proMd5, proMdate);
	}

}
