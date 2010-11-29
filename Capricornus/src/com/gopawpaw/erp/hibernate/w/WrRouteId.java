package com.gopawpaw.erp.hibernate.w;

/**
 * WrRouteId entity. @author MyEclipse Persistence Tools
 */
public class WrRouteId extends AbstractWrRouteId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public WrRouteId() {
	}

	/** minimal constructor */
	public WrRouteId(String wrDomain, String wrNbr, Integer wrOp) {
		super(wrDomain, wrNbr, wrOp);
	}

	/** full constructor */
	public WrRouteId(String wrDomain, String wrNbr, String wrLot, Integer wrOp) {
		super(wrDomain, wrNbr, wrLot, wrOp);
	}

}
