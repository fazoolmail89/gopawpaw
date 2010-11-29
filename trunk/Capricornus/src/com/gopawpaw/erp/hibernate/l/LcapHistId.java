package com.gopawpaw.erp.hibernate.l;

/**
 * LcapHistId entity. @author MyEclipse Persistence Tools
 */
public class LcapHistId extends AbstractLcapHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public LcapHistId() {
	}

	/** full constructor */
	public LcapHistId(String lcapDb, String lcapTable, String lcapQualifier,
			String lcapPeriod) {
		super(lcapDb, lcapTable, lcapQualifier, lcapPeriod);
	}

}
