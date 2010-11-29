package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BkfmMstr entity. @author MyEclipse Persistence Tools
 */
public class BkfmMstr extends AbstractBkfmMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkfmMstr() {
	}

	/** full constructor */
	public BkfmMstr(BkfmMstrId id, Integer bkfmLength, Boolean bkfmMandatory,
			Boolean bkfmLeadZeros, String bkfmQadc01, String bkfmQadc02,
			String bkfmUser1, String bkfmUser2, Date bkfmModDate,
			String bkfmModUserid, Double oidBkfmMstr) {
		super(id, bkfmLength, bkfmMandatory, bkfmLeadZeros, bkfmQadc01,
				bkfmQadc02, bkfmUser1, bkfmUser2, bkfmModDate, bkfmModUserid,
				oidBkfmMstr);
	}

}
