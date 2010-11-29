package com.gopawpaw.erp.hibernate.d;

import java.util.Date;

/**
 * DprMstr entity. @author MyEclipse Persistence Tools
 */
public class DprMstr extends AbstractDprMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DprMstr() {
	}

	/** minimal constructor */
	public DprMstr(Double oidDprMstr) {
		super(oidDprMstr);
	}

	/** full constructor */
	public DprMstr(String dprDesc, Date dprBegDate, Date dprEndDate,
			String dprBasis, String dprEq, Boolean dprTable, String dprUser1,
			String dprUser2, Boolean dprSwitch, Date dprModDate,
			String dprUserid, String dprOptMethod, Boolean dprQad01,
			String dprQad02, String dprQad03, Double oidDprMstr) {
		super(dprDesc, dprBegDate, dprEndDate, dprBasis, dprEq, dprTable,
				dprUser1, dprUser2, dprSwitch, dprModDate, dprUserid,
				dprOptMethod, dprQad01, dprQad02, dprQad03, oidDprMstr);
	}

}
