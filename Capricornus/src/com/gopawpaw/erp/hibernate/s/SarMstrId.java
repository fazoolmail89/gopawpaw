package com.gopawpaw.erp.hibernate.s;

/**
 * SarMstrId entity. @author MyEclipse Persistence Tools
 */
public class SarMstrId extends AbstractSarMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SarMstrId() {
	}

	/** minimal constructor */
	public SarMstrId(String sarDomain, Integer sarSadLine) {
		super(sarDomain, sarSadLine);
	}

	/** full constructor */
	public SarMstrId(String sarDomain, String sarNbr, String sarPrefix,
			Integer sarSadLine, String sarSerial, String sarRef) {
		super(sarDomain, sarNbr, sarPrefix, sarSadLine, sarSerial, sarRef);
	}

}
