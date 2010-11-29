package com.gopawpaw.erp.hibernate.w;

/**
 * WcrRoute entity. @author MyEclipse Persistence Tools
 */
public class WcrRoute extends AbstractWcrRoute implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WcrRoute() {
	}

	/** minimal constructor */
	public WcrRoute(WcrRouteId id, Double oidWcrRoute) {
		super(id, oidWcrRoute);
	}

	/** full constructor */
	public WcrRoute(WcrRouteId id, Integer wcrRate, String wcrUser1,
			String wcrUser2, String wcrQadc01, Double oidWcrRoute) {
		super(id, wcrRate, wcrUser1, wcrUser2, wcrQadc01, oidWcrRoute);
	}

}
