package com.gopawpaw.erp.hibernate.k;

/**
 * AbstractKnbsDet entity provides the base persistence definition of the
 * KnbsDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractKnbsDet implements java.io.Serializable {

	// Fields

	private KnbsDetId id;

	// Constructors

	/** default constructor */
	public AbstractKnbsDet() {
	}

	/** full constructor */
	public AbstractKnbsDet(KnbsDetId id) {
		this.id = id;
	}

	// Property accessors

	public KnbsDetId getId() {
		return this.id;
	}

	public void setId(KnbsDetId id) {
		this.id = id;
	}

}