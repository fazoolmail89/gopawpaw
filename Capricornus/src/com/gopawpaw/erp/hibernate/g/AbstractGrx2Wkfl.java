package com.gopawpaw.erp.hibernate.g;

/**
 * AbstractGrx2Wkfl entity provides the base persistence definition of the
 * Grx2Wkfl entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractGrx2Wkfl implements java.io.Serializable {

	// Fields

	private Grx2WkflId id;

	// Constructors

	/** default constructor */
	public AbstractGrx2Wkfl() {
	}

	/** full constructor */
	public AbstractGrx2Wkfl(Grx2WkflId id) {
		this.id = id;
	}

	// Property accessors

	public Grx2WkflId getId() {
		return this.id;
	}

	public void setId(Grx2WkflId id) {
		this.id = id;
	}

}