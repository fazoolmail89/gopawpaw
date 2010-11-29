package com.gopawpaw.erp.hibernate.b;

import java.util.Date;

/**
 * BdlMstr entity. @author MyEclipse Persistence Tools
 */
public class BdlMstr extends AbstractBdlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BdlMstr() {
	}

	/** minimal constructor */
	public BdlMstr(BdlMstrId id, Double oidBdlMstr) {
		super(id, oidBdlMstr);
	}

	/** full constructor */
	public BdlMstr(BdlMstrId id, String bdlExec, Integer bdlPgmErrs,
			Integer bdlProErrs, Date bdlDateEnt, String bdlTimeEnt,
			Date bdlDatePro, String bdlTimePro, String bdlUser1,
			String bdlUser2, String bdlQadc01, Double oidBdlMstr) {
		super(id, bdlExec, bdlPgmErrs, bdlProErrs, bdlDateEnt, bdlTimeEnt,
				bdlDatePro, bdlTimePro, bdlUser1, bdlUser2, bdlQadc01,
				oidBdlMstr);
	}

}
