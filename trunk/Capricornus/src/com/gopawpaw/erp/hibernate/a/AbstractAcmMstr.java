package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAcmMstr entity provides the base persistence definition of the
 * AcmMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAcmMstr implements java.io.Serializable {

	// Fields

	private AcmMstrId id;

	// Constructors

	/** default constructor */
	public AbstractAcmMstr() {
	}

	/** full constructor */
	public AbstractAcmMstr(AcmMstrId id) {
		this.id = id;
	}

	// Property accessors

	public AcmMstrId getId() {
		return this.id;
	}

	public void setId(AcmMstrId id) {
		this.id = id;
	}

}