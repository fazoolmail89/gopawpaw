package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGribDet entity provides the base persistence definition of the
 * GribDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGribDet implements java.io.Serializable {

	// Fields

	private GribDetId id;

	// Constructors

	/** default constructor */
	public AbstractGribDet() {
	}

	/** full constructor */
	public AbstractGribDet(GribDetId id) {
		this.id = id;
	}

	// Property accessors

	public GribDetId getId() {
		return this.id;
	}

	public void setId(GribDetId id) {
		this.id = id;
	}

}