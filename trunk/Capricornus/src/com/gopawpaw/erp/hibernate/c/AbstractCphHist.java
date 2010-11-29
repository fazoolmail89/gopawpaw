package com.gopawpaw.erp.hibernate.c;

/**
 * AbstractCphHist entity provides the base persistence definition of the
 * CphHist entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCphHist implements java.io.Serializable {

	// Fields

	private CphHistId id;

	// Constructors

	/** default constructor */
	public AbstractCphHist() {
	}

	/** full constructor */
	public AbstractCphHist(CphHistId id) {
		this.id = id;
	}

	// Property accessors

	public CphHistId getId() {
		return this.id;
	}

	public void setId(CphHistId id) {
		this.id = id;
	}

}