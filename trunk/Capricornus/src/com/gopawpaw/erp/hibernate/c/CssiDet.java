package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CssiDet entity. @author MyEclipse Persistence Tools
 */
public class CssiDet extends AbstractCssiDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CssiDet() {
	}

	/** minimal constructor */
	public CssiDet(CssiDetId id, Double oidCssiDet) {
		super(id, oidCssiDet);
	}

	/** full constructor */
	public CssiDet(CssiDetId id, String cssiCur, String cssiUser1,
			String cssiUser2, String cssiUserid, Date cssiModDate,
			String cssiQadc01, Double oidCssiDet) {
		super(id, cssiCur, cssiUser1, cssiUser2, cssiUserid, cssiModDate,
				cssiQadc01, oidCssiDet);
	}

}
