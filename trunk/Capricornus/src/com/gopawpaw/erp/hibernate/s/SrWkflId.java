package com.gopawpaw.erp.hibernate.s;

/**
 * SrWkflId entity. @author MyEclipse Persistence Tools
 */
public class SrWkflId extends AbstractSrWkflId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SrWkflId() {
	}

	/** minimal constructor */
	public SrWkflId(String srDomain) {
		super(srDomain);
	}

	/** full constructor */
	public SrWkflId(String srDomain, String srUserid, String srLineid,
			String srSite, String srLoc, String srLotser, String srRef) {
		super(srDomain, srUserid, srLineid, srSite, srLoc, srLotser, srRef);
	}

}
