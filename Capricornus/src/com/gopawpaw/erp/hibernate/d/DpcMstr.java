package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DpcMstr entity. @author MyEclipse Persistence Tools
 */
public class DpcMstr extends AbstractDpcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DpcMstr() {
	}

	/** minimal constructor */
	public DpcMstr(Double oidDpcMstr) {
		super(oidDpcMstr);
	}

	/** full constructor */
	public DpcMstr(String dpcDesc, String dpcAcqPct, String dpcRtPct,
			Date dpcEndDate, String dpcUser1, String dpcUser2, Date dpcBegDate,
			String dpcQad01, String dpcQad02, Double oidDpcMstr) {
		super(dpcDesc, dpcAcqPct, dpcRtPct, dpcEndDate, dpcUser1, dpcUser2,
				dpcBegDate, dpcQad01, dpcQad02, oidDpcMstr);
	}

}
