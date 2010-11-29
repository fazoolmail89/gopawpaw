package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * Fsp3Pln entity. @author MyEclipse Persistence Tools
 */
public class Fsp3Pln extends AbstractFsp3Pln implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fsp3Pln() {
	}

	/** minimal constructor */
	public Fsp3Pln(Fsp3PlnId id, Double oidFsp3Pln) {
		super(id, oidFsp3Pln);
	}

	/** full constructor */
	public Fsp3Pln(Fsp3PlnId id, Double fsp3BegInv, String fsp3ProdAct,
			String fsp3ProdFcst, String fsp3ShipAct, String fsp3ShipFcst,
			Double fsp3Percent, Double fsp3ProdRate, Double fsp3SimRate,
			Double fsp3SrcPct, Double fsp3Target, String fsp3User1,
			String fsp3User2, String fsp3ModUserid, Date fsp3ModDate,
			String fsp3Qadc01, Double oidFsp3Pln) {
		super(id, fsp3BegInv, fsp3ProdAct, fsp3ProdFcst, fsp3ShipAct,
				fsp3ShipFcst, fsp3Percent, fsp3ProdRate, fsp3SimRate,
				fsp3SrcPct, fsp3Target, fsp3User1, fsp3User2, fsp3ModUserid,
				fsp3ModDate, fsp3Qadc01, oidFsp3Pln);
	}

}
