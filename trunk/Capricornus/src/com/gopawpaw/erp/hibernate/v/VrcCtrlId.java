package com.gopawpaw.erp.hibernate.v;

/**
 * VrcCtrlId entity. @author MyEclipse Persistence Tools
 */
public class VrcCtrlId extends AbstractVrcCtrlId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public VrcCtrlId() {
	}

	/** minimal constructor */
	public VrcCtrlId(String vrcDomain) {
		super(vrcDomain);
	}

	/** full constructor */
	public VrcCtrlId(String vrcDomain, String vrcV86) {
		super(vrcDomain, vrcV86);
	}

}
