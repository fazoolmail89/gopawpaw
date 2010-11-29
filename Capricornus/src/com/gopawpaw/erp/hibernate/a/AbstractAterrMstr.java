package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAterrMstr entity provides the base persistence definition of the
 * AterrMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAterrMstr implements java.io.Serializable {

	// Fields

	private AterrMstrId id;

	// Constructors

	/** default constructor */
	public AbstractAterrMstr() {
	}

	/** full constructor */
	public AbstractAterrMstr(AterrMstrId id) {
		this.id = id;
	}

	// Property accessors

	public AterrMstrId getId() {
		return this.id;
	}

	public void setId(AterrMstrId id) {
		this.id = id;
	}

}