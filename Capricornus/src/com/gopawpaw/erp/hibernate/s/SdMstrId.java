package com.gopawpaw.erp.hibernate.s;

import java.math.BigDecimal;
import java.util.Date;

/**
 * SdMstrId entity. @author MyEclipse Persistence Tools
 */
public class SdMstrId extends AbstractSdMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SdMstrId() {
	}

	/** minimal constructor */
	public SdMstrId(String sdDomain, BigDecimal sdAmt) {
		super(sdDomain, sdAmt);
	}

	/** full constructor */
	public SdMstrId(String sdDomain, String sdType, BigDecimal sdAmt,
			Date sdStart) {
		super(sdDomain, sdType, sdAmt, sdStart);
	}

}
