package com.gopawpaw.erp.hibernate.g;

/**
 * GrtxDetId entity. @author MyEclipse Persistence Tools
 */
public class GrtxDetId extends AbstractGrtxDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrtxDetId() {
	}

	/** minimal constructor */
	public GrtxDetId(String grtxDomain) {
		super(grtxDomain);
	}

	/** full constructor */
	public GrtxDetId(String grtxDomain, Integer grtxIndx, Integer grtxSeq) {
		super(grtxDomain, grtxIndx, grtxSeq);
	}

}
