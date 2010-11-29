package com.gopawpaw.erp.hibernate.r;

/**
 * AbstractRqmDet entity provides the base persistence definition of the RqmDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractRqmDet implements java.io.Serializable {

	// Fields

	private RqmDetId id;

	// Constructors

	/** default constructor */
	public AbstractRqmDet() {
	}

	/** full constructor */
	public AbstractRqmDet(RqmDetId id) {
		this.id = id;
	}

	// Property accessors

	public RqmDetId getId() {
		return this.id;
	}

	public void setId(RqmDetId id) {
		this.id = id;
	}

}