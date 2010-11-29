package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TrcsDet entity. @author MyEclipse Persistence Tools
 */
public class TrcsDet extends AbstractTrcsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrcsDet() {
	}

	/** minimal constructor */
	public TrcsDet(TrcsDetId id, Double oidTrcsDet) {
		super(id, oidTrcsDet);
	}

	/** full constructor */
	public TrcsDet(TrcsDetId id, Double trcsBdnStd, String trcsCurr,
			Double trcsExRate, Double trcsLbrStd, Double trcsMtlStd,
			Double trcsOvhStd, Double trcsPrice, Double trcsSubStd,
			String trcsUser1, String trcsUser2, String trcsUserid,
			String trcsQad01, String trcsQad02, String trcsQad03,
			Double trcsQad04, Double trcsQad05, Double trcsQad06,
			Date trcsQad07, Date trcsQad08, Date trcsQad09, Boolean trcsQad10,
			Double oidTrcsDet) {
		super(id, trcsBdnStd, trcsCurr, trcsExRate, trcsLbrStd, trcsMtlStd,
				trcsOvhStd, trcsPrice, trcsSubStd, trcsUser1, trcsUser2,
				trcsUserid, trcsQad01, trcsQad02, trcsQad03, trcsQad04,
				trcsQad05, trcsQad06, trcsQad07, trcsQad08, trcsQad09,
				trcsQad10, oidTrcsDet);
	}

}
