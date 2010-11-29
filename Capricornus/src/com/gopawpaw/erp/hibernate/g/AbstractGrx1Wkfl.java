package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrx1Wkfl entity provides the base persistence definition of the
 * Grx1Wkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrx1Wkfl implements java.io.Serializable {

	// Fields

	private Grx1WkflId id;

	// Constructors

	/** default constructor */
	public AbstractGrx1Wkfl() {
	}

	/** full constructor */
	public AbstractGrx1Wkfl(Grx1WkflId id) {
		this.id = id;
	}

	// Property accessors

	public Grx1WkflId getId() {
		return this.id;
	}

	public void setId(Grx1WkflId id) {
		this.id = id;
	}

}