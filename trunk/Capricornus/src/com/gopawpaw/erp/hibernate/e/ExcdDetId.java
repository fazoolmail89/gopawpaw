package com.gopawpaw.erp.hibernate.e;

/**
 * ExcdDetId entity. @author MyEclipse Persistence Tools
 */
public class ExcdDetId extends AbstractExcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExcdDetId() {
	}

	/** minimal constructor */
	public ExcdDetId(String excdDomain) {
		super(excdDomain);
	}

	/** full constructor */
	public ExcdDetId(String excdDomain, String excdCurr, String excdCurr2,
			String excdAcc, Integer excdYear, Integer excdPer) {
		super(excdDomain, excdCurr, excdCurr2, excdAcc, excdYear, excdPer);
	}

}
