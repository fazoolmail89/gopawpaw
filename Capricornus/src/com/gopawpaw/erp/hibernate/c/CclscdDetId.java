package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CclscdDetId entity. @author MyEclipse Persistence Tools
 */
public class CclscdDetId extends AbstractCclscdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclscdDetId() {
	}

	/** minimal constructor */
	public CclscdDetId(String cclscdDomain, String cclscdShipto,
			String cclscdPart, String cclscdCurr) {
		super(cclscdDomain, cclscdShipto, cclscdPart, cclscdCurr);
	}

	/** full constructor */
	public CclscdDetId(String cclscdDomain, String cclscdShipto,
			String cclscdPart, String cclscdCurr, Date cclscdStart) {
		super(cclscdDomain, cclscdShipto, cclscdPart, cclscdCurr, cclscdStart);
	}

}
