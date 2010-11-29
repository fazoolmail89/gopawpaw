package com.gopawpaw.erp.hibernate.r;

import java.util.Date;

/**
 * RoDetId entity. @author MyEclipse Persistence Tools
 */
public class RoDetId extends AbstractRoDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RoDetId() {
	}

	/** minimal constructor */
	public RoDetId(String roDomain, String roRouting, Integer roOp) {
		super(roDomain, roRouting, roOp);
	}

	/** full constructor */
	public RoDetId(String roDomain, String roRouting, Integer roOp, Date roStart) {
		super(roDomain, roRouting, roOp, roStart);
	}

}
