package com.gopawpaw.erp.hibernate.w;

/**
 * WlMstrId entity. @author MyEclipse Persistence Tools
 */
public class WlMstrId extends AbstractWlMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WlMstrId() {
	}

	/** minimal constructor */
	public WlMstrId(String wlDomain, Integer wlProdbyOp) {
		super(wlDomain, wlProdbyOp);
	}

	/** full constructor */
	public WlMstrId(String wlDomain, String wlProdbyId, Integer wlProdbyOp,
			String wlLotser) {
		super(wlDomain, wlProdbyId, wlProdbyOp, wlLotser);
	}

}
