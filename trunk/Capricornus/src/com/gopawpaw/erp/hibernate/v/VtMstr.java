package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VtMstr entity. @author MyEclipse Persistence Tools
 */
public class VtMstr extends AbstractVtMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VtMstr() {
	}

	/** minimal constructor */
	public VtMstr(VtMstrId id, Double oidVtMstr) {
		super(id, oidVtMstr);
	}

	/** full constructor */
	public VtMstr(VtMstrId id, Date vtEnd, Double vtTaxPct, String vtApAcct,
			String vtApCc, String vtArAcct, String vtArCc, String vtProject,
			String vtUser1, String vtUser2, String vtDesc, String vtQadc01,
			Double oidVtMstr) {
		super(id, vtEnd, vtTaxPct, vtApAcct, vtApCc, vtArAcct, vtArCc,
				vtProject, vtUser1, vtUser2, vtDesc, vtQadc01, oidVtMstr);
	}

}
