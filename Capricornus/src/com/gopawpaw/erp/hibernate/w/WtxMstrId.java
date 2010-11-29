package com.gopawpaw.erp.hibernate.w;

/**
 * WtxMstrId entity. @author MyEclipse Persistence Tools
 */
public class WtxMstrId extends AbstractWtxMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WtxMstrId() {
	}

	/** full constructor */
	public WtxMstrId(String wtxDomain, String wtxAddr, String wtxRef,
			Integer wtxLn, String wtxCheck) {
		super(wtxDomain, wtxAddr, wtxRef, wtxLn, wtxCheck);
	}

}
