package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsfilMstr entity. @author MyEclipse Persistence Tools
 */
public class EsfilMstr extends AbstractEsfilMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsfilMstr() {
	}

	/** full constructor */
	public EsfilMstr(Double oidEsfilMstr, String esfilTableName,
			Date esfilModDate, String esfilModUserid, String esfilUser1,
			String esfilUser2, String esfilQadc01, String esfilQadc02) {
		super(oidEsfilMstr, esfilTableName, esfilModDate, esfilModUserid,
				esfilUser1, esfilUser2, esfilQadc01, esfilQadc02);
	}

}
