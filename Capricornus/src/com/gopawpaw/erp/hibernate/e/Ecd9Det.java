package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * Ecd9Det entity. @author MyEclipse Persistence Tools
 */
public class Ecd9Det extends AbstractEcd9Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd9Det() {
	}

	/** minimal constructor */
	public Ecd9Det(Ecd9DetId id, Double oidEcd9Det) {
		super(id, oidEcd9Det);
	}

	/** full constructor */
	public Ecd9Det(Ecd9DetId id, Boolean ecd9Approved, Date ecd9ApprDate,
			Integer ecd9Seq, Integer ecd9Cmtindx, String ecd9Status,
			String ecd9User1, String ecd9User2, Boolean ecd9Qad01,
			Date ecd9Qad02, String ecd9Qad03, String ecd9Qad04,
			String ecd9Qad05, Date ecd9ModDate, String ecd9Userid,
			Double oidEcd9Det) {
		super(id, ecd9Approved, ecd9ApprDate, ecd9Seq, ecd9Cmtindx, ecd9Status,
				ecd9User1, ecd9User2, ecd9Qad01, ecd9Qad02, ecd9Qad03,
				ecd9Qad04, ecd9Qad05, ecd9ModDate, ecd9Userid, oidEcd9Det);
	}

}
