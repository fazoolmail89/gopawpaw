package com.gopawpaw.erp.hibernate.c;

/**
 * CpcdDetId entity. @author MyEclipse Persistence Tools
 */
public class CpcdDetId extends AbstractCpcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CpcdDetId() {
	}

	/** minimal constructor */
	public CpcdDetId(String cpcdDomain) {
		super(cpcdDomain);
	}

	/** full constructor */
	public CpcdDetId(String cpcdDomain, String cpcdCust, Integer cpcdYear,
			String cpcdType, Integer cpcdPer) {
		super(cpcdDomain, cpcdCust, cpcdYear, cpcdType, cpcdPer);
	}

}
