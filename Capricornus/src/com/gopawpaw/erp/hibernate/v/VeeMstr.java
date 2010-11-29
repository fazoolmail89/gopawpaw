package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VeeMstr entity. @author MyEclipse Persistence Tools
 */
public class VeeMstr extends AbstractVeeMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VeeMstr() {
	}

	/** minimal constructor */
	public VeeMstr(VeeMstrId id, Double oidVeeMstr) {
		super(id, oidVeeMstr);
	}

	/** full constructor */
	public VeeMstr(VeeMstrId id, String veeName, String veeDesc,
			Double veePoints, String veeModUserid, Date veeModDate,
			String veeUser1, String veeUser2, String veeUser3, String veeUser4,
			String veeQadc01, String veeQadc02, String veeQadc03,
			String veeQadc04, Double veeQadd01, Double veeQadd02,
			Boolean veeQadl01, Boolean veeQadl02, Date veeQadt01,
			Date veeQadt02, Integer veeQadi01, Integer veeQadi02,
			Double oidVeeMstr) {
		super(id, veeName, veeDesc, veePoints, veeModUserid, veeModDate,
				veeUser1, veeUser2, veeUser3, veeUser4, veeQadc01, veeQadc02,
				veeQadc03, veeQadc04, veeQadd01, veeQadd02, veeQadl01,
				veeQadl02, veeQadt01, veeQadt02, veeQadi01, veeQadi02,
				oidVeeMstr);
	}

}
