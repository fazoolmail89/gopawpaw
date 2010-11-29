package com.gopawpaw.erp.hibernate.i;

/**
 * AbstractIpdDet entity provides the base persistence definition of the IpdDet
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractIpdDet implements java.io.Serializable {

	// Fields

	private IpdDetId id;

	// Constructors

	/** default constructor */
	public AbstractIpdDet() {
	}

	/** full constructor */
	public AbstractIpdDet(IpdDetId id) {
		this.id = id;
	}

	// Property accessors

	public IpdDetId getId() {
		return this.id;
	}

	public void setId(IpdDetId id) {
		this.id = id;
	}

}