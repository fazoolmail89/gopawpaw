package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbssDet entity. @author MyEclipse Persistence Tools
 */
public class AbssDet extends AbstractAbssDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbssDet() {
	}

	/** minimal constructor */
	public AbssDet(AbssDetId id, Double oidAbssDet) {
		super(id, oidAbssDet);
	}

	/** full constructor */
	public AbssDet(AbssDetId id, Double abssQty, String abssShipId,
			Boolean abssConfirmed, String abssStatus, String abssOrder,
			Integer abssLine, String abssInvoice, String abssModUserid,
			Date abssModDate, String abssModPgm, String abssUser1,
			String abssUser2, String abssQadc01, String abssQadc02,
			Double abssQadd01, Double abssQadd02, Integer abssQadi01,
			Integer abssQadi02, Boolean abssQadl01, Boolean abssQadl02,
			Date abssQadt01, Date abssQadt02, Double oidAbssDet) {
		super(id, abssQty, abssShipId, abssConfirmed, abssStatus, abssOrder,
				abssLine, abssInvoice, abssModUserid, abssModDate, abssModPgm,
				abssUser1, abssUser2, abssQadc01, abssQadc02, abssQadd01,
				abssQadd02, abssQadi01, abssQadi02, abssQadl01, abssQadl02,
				abssQadt01, abssQadt02, oidAbssDet);
	}

}
