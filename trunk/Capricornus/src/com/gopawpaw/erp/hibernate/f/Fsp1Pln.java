package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * Fsp1Pln entity. @author MyEclipse Persistence Tools
 */
public class Fsp1Pln extends AbstractFsp1Pln implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fsp1Pln() {
	}

	/** minimal constructor */
	public Fsp1Pln(Fsp1PlnId id, Double oidFsp1Pln) {
		super(id, oidFsp1Pln);
	}

	/** full constructor */
	public Fsp1Pln(Fsp1PlnId id, Double fsp1BegInv, String fsp1BklgAct,
			String fsp1BklgFcst, String fsp1CostAct, String fsp1CostFcst,
			Double fsp1Percent, Double fsp1ProdRate, Double fsp1SimRate,
			Double fsp1SrcPct, Double fsp1Target, String fsp1User1,
			String fsp1User2, String fsp1ModUserid, Date fsp1ModDate,
			String fsp1Qadc01, Double oidFsp1Pln) {
		super(id, fsp1BegInv, fsp1BklgAct, fsp1BklgFcst, fsp1CostAct,
				fsp1CostFcst, fsp1Percent, fsp1ProdRate, fsp1SimRate,
				fsp1SrcPct, fsp1Target, fsp1User1, fsp1User2, fsp1ModUserid,
				fsp1ModDate, fsp1Qadc01, oidFsp1Pln);
	}

}
