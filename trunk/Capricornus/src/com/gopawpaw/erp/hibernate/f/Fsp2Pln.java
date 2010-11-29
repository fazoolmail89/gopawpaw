package com.gopawpaw.erp.hibernate.f;

import java.util.Date;

/**
 * Fsp2Pln entity. @author MyEclipse Persistence Tools
 */
public class Fsp2Pln extends AbstractFsp2Pln implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Fsp2Pln() {
	}

	/** minimal constructor */
	public Fsp2Pln(Fsp2PlnId id, Double oidFsp2Pln) {
		super(id, oidFsp2Pln);
	}

	/** full constructor */
	public Fsp2Pln(Fsp2PlnId id, Double fsp2BegInv, String fsp2InvAct,
			String fsp2InvFcst, String fsp2OrdAct, String fsp2OrdFcst,
			Double fsp2Percent, Double fsp2ProdRate, Double fsp2SimRate,
			Double fsp2SrcPct, Double fsp2Target, String fsp2User1,
			String fsp2User2, String fsp2ModUserid, Date fsp2ModDate,
			String fsp2Qadc01, Double oidFsp2Pln) {
		super(id, fsp2BegInv, fsp2InvAct, fsp2InvFcst, fsp2OrdAct, fsp2OrdFcst,
				fsp2Percent, fsp2ProdRate, fsp2SimRate, fsp2SrcPct, fsp2Target,
				fsp2User1, fsp2User2, fsp2ModUserid, fsp2ModDate, fsp2Qadc01,
				oidFsp2Pln);
	}

}
