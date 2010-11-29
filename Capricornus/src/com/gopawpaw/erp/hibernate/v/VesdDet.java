package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VesdDet entity. @author MyEclipse Persistence Tools
 */
public class VesdDet extends AbstractVesdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VesdDet() {
	}

	/** minimal constructor */
	public VesdDet(VesdDetId id, Double oidVesdDet) {
		super(id, oidVesdDet);
	}

	/** full constructor */
	public VesdDet(VesdDetId id, String vesdEvent, String vesdWeightCode,
			Double vesdEventQty, Date vesdTranDate, String vesdModUserid,
			Date vesdModDate, String vesdUser1, String vesdUser2,
			String vesdUser3, String vesdUser4, String vesdQadc01,
			String vesdQadc02, String vesdQadc03, String vesdQadc04,
			Double vesdQadd01, Double vesdQadd02, Boolean vesdQadl01,
			Boolean vesdQadl02, Date vesdQadt01, Date vesdQadt02,
			Integer vesdQadi01, Integer vesdQadi02, Double oidVesdDet) {
		super(id, vesdEvent, vesdWeightCode, vesdEventQty, vesdTranDate,
				vesdModUserid, vesdModDate, vesdUser1, vesdUser2, vesdUser3,
				vesdUser4, vesdQadc01, vesdQadc02, vesdQadc03, vesdQadc04,
				vesdQadd01, vesdQadd02, vesdQadl01, vesdQadl02, vesdQadt01,
				vesdQadt02, vesdQadi01, vesdQadi02, oidVesdDet);
	}

}
