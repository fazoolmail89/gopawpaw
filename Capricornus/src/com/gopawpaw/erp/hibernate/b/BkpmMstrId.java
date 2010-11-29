package com.gopawpaw.erp.hibernate.b;

/**
 * BkpmMstrId entity. @author MyEclipse Persistence Tools
 */
public class BkpmMstrId extends AbstractBkpmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BkpmMstrId() {
	}

	/** full constructor */
	public BkpmMstrId(String bkpmDomain, String bkpmBank, String bkpmPayMethod,
			String bkpmModule, Integer bkpmSeq) {
		super(bkpmDomain, bkpmBank, bkpmPayMethod, bkpmModule, bkpmSeq);
	}

}
