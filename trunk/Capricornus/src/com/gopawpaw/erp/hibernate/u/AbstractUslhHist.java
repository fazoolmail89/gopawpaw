package com.gopawpaw.erp.hibernate.u;

/**
 * AbstractUslhHist entity provides the base persistence definition of the
 * UslhHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUslhHist implements java.io.Serializable {

	// Fields

	private UslhHistId id;

	// Constructors

	/** default constructor */
	public AbstractUslhHist() {
	}

	/** full constructor */
	public AbstractUslhHist(UslhHistId id) {
		this.id = id;
	}

	// Property accessors

	public UslhHistId getId() {
		return this.id;
	}

	public void setId(UslhHistId id) {
		this.id = id;
	}

}