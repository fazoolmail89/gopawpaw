package com.gopawpaw.erp.hibernate.p;

/**
 * PtlsDetId entity. @author MyEclipse Persistence Tools
 */
public class PtlsDetId extends AbstractPtlsDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public PtlsDetId() {
	}

	/** minimal constructor */
	public PtlsDetId(String ptlsDomain) {
		super(ptlsDomain);
	}

	/** full constructor */
	public PtlsDetId(String ptlsDomain, String ptlsPart, String ptlsLotser,
			String ptlsRef) {
		super(ptlsDomain, ptlsPart, ptlsLotser, ptlsRef);
	}

}
