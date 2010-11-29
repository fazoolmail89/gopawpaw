package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EssMstr entity. @author MyEclipse Persistence Tools
 */
public class EssMstr extends AbstractEssMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EssMstr() {
	}

	/** minimal constructor */
	public EssMstr(EssMstrId id, Double oidEssMstr) {
		super(id, oidEssMstr);
	}

	/** full constructor */
	public EssMstr(EssMstrId id, String essDesc, Boolean essAvailable,
			String essUser1, String essUser2, Date essModDate,
			String essModUserid, String essChr01, Boolean essLog01,
			String essQadc01, Boolean essQadl01, Double oidEssMstr) {
		super(id, essDesc, essAvailable, essUser1, essUser2, essModDate,
				essModUserid, essChr01, essLog01, essQadc01, essQadl01,
				oidEssMstr);
	}

}
