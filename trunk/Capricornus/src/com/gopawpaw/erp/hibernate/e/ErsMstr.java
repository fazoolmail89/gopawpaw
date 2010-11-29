package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * ErsMstr entity. @author MyEclipse Persistence Tools
 */
public class ErsMstr extends AbstractErsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ErsMstr() {
	}

	/** minimal constructor */
	public ErsMstr(ErsMstrId id, Double oidErsMstr) {
		super(id, oidErsMstr);
	}

	/** full constructor */
	public ErsMstr(ErsMstrId id, String ersQadc01, Integer ersOpt,
			Integer ersPrLstTp, String ersUser1, String ersUser2,
			String ersQadc02, Date ersModDate, String ersModUserid,
			Double oidErsMstr) {
		super(id, ersQadc01, ersOpt, ersPrLstTp, ersUser1, ersUser2, ersQadc02,
				ersModDate, ersModUserid, oidErsMstr);
	}

}
