package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGradDet entity provides the base persistence definition of the
 * GradDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGradDet implements java.io.Serializable {

	// Fields

	private GradDetId id;

	// Constructors

	/** default constructor */
	public AbstractGradDet() {
	}

	/** full constructor */
	public AbstractGradDet(GradDetId id) {
		this.id = id;
	}

	// Property accessors

	public GradDetId getId() {
		return this.id;
	}

	public void setId(GradDetId id) {
		this.id = id;
	}

}