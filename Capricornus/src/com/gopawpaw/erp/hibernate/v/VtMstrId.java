package com.gopawpaw.erp.hibernate.v;

import java.util.Date;

/**
 * VtMstrId entity. @author MyEclipse Persistence Tools
 */
public class VtMstrId extends AbstractVtMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VtMstrId() {
	}

	/** full constructor */
	public VtMstrId(String vtClass, Date vtStart) {
		super(vtClass, vtStart);
	}

}
