package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpmpRef entity. @author MyEclipse Persistence Tools
 */
public class EswpmpRef extends AbstractEswpmpRef implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpmpRef() {
	}

	/** full constructor */
	public EswpmpRef(EswpmpRefId id, Double oidEswpmpRef,
			Boolean eswpmpEsigActive, Date eswpmpModDate,
			String eswpmpModUserid, String eswpmpUser1, String eswpmpUser2,
			String eswpmpQadc01, String eswpmpQadc02) {
		super(id, oidEswpmpRef, eswpmpEsigActive, eswpmpModDate,
				eswpmpModUserid, eswpmpUser1, eswpmpUser2, eswpmpQadc01,
				eswpmpQadc02);
	}

}
