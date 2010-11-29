package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EaMstr entity. @author MyEclipse Persistence Tools
 */
public class EaMstr extends AbstractEaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EaMstr() {
	}

	/** minimal constructor */
	public EaMstr(EaMstrId id, Double oidEaMstr) {
		super(id, oidEaMstr);
	}

	/** full constructor */
	public EaMstr(EaMstrId id, String eaDesc, String eaType, Double eaRate,
			Boolean eaFedYn, Boolean eaQad01, Boolean eaQad02, Boolean eaQad05,
			Boolean eaQad04, Boolean eaQad06, Boolean eaQad03, String eaUser1,
			String eaUser2, String eaAcc, String eaCc, Boolean eaPiece,
			String eaRegEarn, String eaUserid, Date eaModDate, String eaSub,
			Double oidEaMstr) {
		super(id, eaDesc, eaType, eaRate, eaFedYn, eaQad01, eaQad02, eaQad05,
				eaQad04, eaQad06, eaQad03, eaUser1, eaUser2, eaAcc, eaCc,
				eaPiece, eaRegEarn, eaUserid, eaModDate, eaSub, oidEaMstr);
	}

}
