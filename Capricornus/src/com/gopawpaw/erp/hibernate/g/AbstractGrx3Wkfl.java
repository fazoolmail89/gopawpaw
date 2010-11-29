package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrx3Wkfl entity provides the base persistence definition of the
 * Grx3Wkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrx3Wkfl implements java.io.Serializable {

	// Fields

	private Grx3WkflId id;

	// Constructors

	/** default constructor */
	public AbstractGrx3Wkfl() {
	}

	/** full constructor */
	public AbstractGrx3Wkfl(Grx3WkflId id) {
		this.id = id;
	}

	// Property accessors

	public Grx3WkflId getId() {
		return this.id;
	}

	public void setId(Grx3WkflId id) {
		this.id = id;
	}

}