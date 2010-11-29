package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * Ecd1Det entity. @author MyEclipse Persistence Tools
 */
public class Ecd1Det extends AbstractEcd1Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd1Det() {
	}

	/** minimal constructor */
	public Ecd1Det(Ecd1DetId id, Double ecd1QtyPer, String ecd1BatchUm,
			Boolean ecd1Deactivate, String ecd1PsCode, Boolean ecd1Mandatory,
			Boolean ecd1Default, Integer ecd1LtOff, Double ecd1FcstPct,
			String ecd1Group, String ecd1Psprocess, Double oidEcd1Det) {
		super(id, ecd1QtyPer, ecd1BatchUm, ecd1Deactivate, ecd1PsCode,
				ecd1Mandatory, ecd1Default, ecd1LtOff, ecd1FcstPct, ecd1Group,
				ecd1Psprocess, oidEcd1Det);
	}

	/** full constructor */
	public Ecd1Det(Ecd1DetId id, String ecd1QtyType, Double ecd1QtyPer,
			Double ecd1ScrpPct, String ecd1Rmks, Integer ecd1Op,
			Integer ecd1ItemNo, Double ecd1QtyPerB, Double ecd1BatchPct,
			Double ecd1Batch, String ecd1BatchUm, Integer ecd1Cmtindx,
			Integer ecd1Recindx, String ecd1Process, Boolean ecd1Qad01,
			Date ecd1Qad02, String ecd1Qad03, String ecd1Qad04,
			String ecd1Qad05, Date ecd1ModDate, String ecd1Userid,
			String ecd1User1, String ecd1User2, Boolean ecd1Deactivate,
			Date ecd1Start, String ecd1PsCode, Boolean ecd1Mandatory,
			Boolean ecd1Default, Integer ecd1LtOff, Double ecd1FcstPct,
			String ecd1Group, String ecd1Psprocess, Double oidEcd1Det) {
		super(id, ecd1QtyType, ecd1QtyPer, ecd1ScrpPct, ecd1Rmks, ecd1Op,
				ecd1ItemNo, ecd1QtyPerB, ecd1BatchPct, ecd1Batch, ecd1BatchUm,
				ecd1Cmtindx, ecd1Recindx, ecd1Process, ecd1Qad01, ecd1Qad02,
				ecd1Qad03, ecd1Qad04, ecd1Qad05, ecd1ModDate, ecd1Userid,
				ecd1User1, ecd1User2, ecd1Deactivate, ecd1Start, ecd1PsCode,
				ecd1Mandatory, ecd1Default, ecd1LtOff, ecd1FcstPct, ecd1Group,
				ecd1Psprocess, oidEcd1Det);
	}

}
