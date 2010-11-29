package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * Ecd3Det entity. @author MyEclipse Persistence Tools
 */
public class Ecd3Det extends AbstractEcd3Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd3Det() {
	}

	/** minimal constructor */
	public Ecd3Det(Ecd3DetId id, Double oidEcd3Det) {
		super(id, oidEcd3Det);
	}

	/** full constructor */
	public Ecd3Det(Ecd3DetId id, Integer ecd3Order, String ecd3Process,
			Boolean ecd3Qad01, Date ecd3Qad02, String ecd3Qad03,
			String ecd3Qad04, String ecd3Qad05, Date ecd3ModDate,
			String ecd3Userid, String ecd3User1, String ecd3User2,
			Double oidEcd3Det) {
		super(id, ecd3Order, ecd3Process, ecd3Qad01, ecd3Qad02, ecd3Qad03,
				ecd3Qad04, ecd3Qad05, ecd3ModDate, ecd3Userid, ecd3User1,
				ecd3User2, oidEcd3Det);
	}

}
