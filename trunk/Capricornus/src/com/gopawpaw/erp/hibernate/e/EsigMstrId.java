package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsigMstrId entity. @author MyEclipse Persistence Tools
 */
public class EsigMstrId extends AbstractEsigMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsigMstrId() {
	}

	/** minimal constructor */
	public EsigMstrId(Double oidEsigMstr, Date esigDate, Integer esigTime,
			String esigTimezone, String esigUserid, String esigUserName,
			String esigRsnCode, String esigComment, Date esigModDate,
			String esigModUserid, String esigUser1, String esigUser2,
			String esigQadc01, String esigQadc02, String esigExec) {
		super(oidEsigMstr, esigDate, esigTime, esigTimezone, esigUserid,
				esigUserName, esigRsnCode, esigComment, esigModDate,
				esigModUserid, esigUser1, esigUser2, esigQadc01, esigQadc02,
				esigExec);
	}

	/** full constructor */
	public EsigMstrId(Double oidEsigMstr, Date esigDate, Integer esigTime,
			String esigTimezone, String esigUserid, String esigUserName,
			String esigRsnCode, String esigComment, Date esigModDate,
			String esigModUserid, String esigUser1, String esigUser2,
			String esigQadc01, String esigQadc02, Boolean esigArchived,
			String esigExec) {
		super(oidEsigMstr, esigDate, esigTime, esigTimezone, esigUserid,
				esigUserName, esigRsnCode, esigComment, esigModDate,
				esigModUserid, esigUser1, esigUser2, esigQadc01, esigQadc02,
				esigArchived, esigExec);
	}

}
