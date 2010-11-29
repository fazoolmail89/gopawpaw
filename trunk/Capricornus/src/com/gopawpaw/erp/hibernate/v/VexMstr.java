package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VexMstr entity. @author MyEclipse Persistence Tools
 */
public class VexMstr extends AbstractVexMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VexMstr() {
	}

	/** minimal constructor */
	public VexMstr(VexMstrId id, Double oidVexMstr) {
		super(id, oidVexMstr);
	}

	/** full constructor */
	public VexMstr(VexMstrId id, String vexToSite, String vexToVendor,
			String vexToVendorSource, String vexModUserid, Date vexModDate,
			String vexUser1, String vexUser2, String vexUser3, String vexUser4,
			String vexQadc01, String vexQadc02, String vexQadc03,
			String vexQadc04, Double vexQadd01, Double vexQadd02,
			Boolean vexQadl01, Boolean vexQadl02, Date vexQadt02,
			Date vexQadt01, Integer vexQadi01, Integer vexQadi02,
			Double oidVexMstr) {
		super(id, vexToSite, vexToVendor, vexToVendorSource, vexModUserid,
				vexModDate, vexUser1, vexUser2, vexUser3, vexUser4, vexQadc01,
				vexQadc02, vexQadc03, vexQadc04, vexQadd01, vexQadd02,
				vexQadl01, vexQadl02, vexQadt02, vexQadt01, vexQadi01,
				vexQadi02, oidVexMstr);
	}

}
