package com.gopawpaw.erp.hibernate.w;

/**
 * WcrRouteId entity. @author MyEclipse Persistence Tools
 */
public class WcrRouteId extends AbstractWcrRouteId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WcrRouteId() {
	}

	/** minimal constructor */
	public WcrRouteId(String wcrDomain) {
		super(wcrDomain);
	}

	/** full constructor */
	public WcrRouteId(String wcrDomain, String wcrWkctr, String wcrMch,
			String wcrPart, Integer wcrOp) {
		super(wcrDomain, wcrWkctr, wcrMch, wcrPart, wcrOp);
	}

}
