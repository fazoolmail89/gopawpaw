package com.gopawpaw.erp.hibernate.b;

/**
 * BlCtrlId entity. @author MyEclipse Persistence Tools
 */
public class BlCtrlId extends AbstractBlCtrlId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BlCtrlId() {
	}

	/** minimal constructor */
	public BlCtrlId(String blDomain) {
		super(blDomain);
	}

	/** full constructor */
	public BlCtrlId(String blDomain, String blMasterId) {
		super(blDomain, blMasterId);
	}

}
