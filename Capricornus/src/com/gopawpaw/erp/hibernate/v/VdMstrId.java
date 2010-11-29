package com.gopawpaw.erp.hibernate.v;

/**
 * VdMstrId entity. @author MyEclipse Persistence Tools
 */
public class VdMstrId extends AbstractVdMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VdMstrId() {
	}

	/** minimal constructor */
	public VdMstrId(String vdDomain) {
		super(vdDomain);
	}

	/** full constructor */
	public VdMstrId(String vdDomain, String vdAddr) {
		super(vdDomain, vdAddr);
	}

}
