package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapsDet entity. @author MyEclipse Persistence Tools
 */
public class EsapsDet extends AbstractEsapsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapsDet() {
	}

	/** full constructor */
	public EsapsDet(EsapsDetId id, Double oidEsapsDet, Boolean esapsInclude,
			String esapsTableName, String esapsCode, Boolean esapsMultiple,
			Date esapsModDate, String esapsModUserid, String esapsUser1,
			String esapsUser2, String esapsQadc01, String esapsQadc02) {
		super(id, oidEsapsDet, esapsInclude, esapsTableName, esapsCode,
				esapsMultiple, esapsModDate, esapsModUserid, esapsUser1,
				esapsUser2, esapsQadc01, esapsQadc02);
	}

}
