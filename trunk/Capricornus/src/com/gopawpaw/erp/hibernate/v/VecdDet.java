package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VecdDet entity. @author MyEclipse Persistence Tools
 */
public class VecdDet extends AbstractVecdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VecdDet() {
	}

	/** minimal constructor */
	public VecdDet(VecdDetId id, Double oidVecdDet) {
		super(id, oidVecdDet);
	}

	/** full constructor */
	public VecdDet(VecdDetId id, Double vecdValueTo, Double vecdPercent,
			String vecdModUserid, Date vecdModDate, String vecdUser1,
			String vecdUser2, String vecdUser3, String vecdUser4,
			String vecdQadc01, String vecdQadc02, String vecdQadc03,
			String vecdQadc04, Double vecdQadd01, Double vecdQadd02,
			Boolean vecdQadl01, Boolean vecdQadl02, Date vecdQadt01,
			Date vecdQadt02, Integer vecdQadi01, Integer vecdQadi02,
			Double oidVecdDet) {
		super(id, vecdValueTo, vecdPercent, vecdModUserid, vecdModDate,
				vecdUser1, vecdUser2, vecdUser3, vecdUser4, vecdQadc01,
				vecdQadc02, vecdQadc03, vecdQadc04, vecdQadd01, vecdQadd02,
				vecdQadl01, vecdQadl02, vecdQadt01, vecdQadt02, vecdQadi01,
				vecdQadi02, oidVecdDet);
	}

}
