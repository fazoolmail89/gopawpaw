package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsigMstr entity provides the base persistence definition of the
 * EsigMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsigMstr implements java.io.Serializable {

	// Fields

	private EsigMstrId id;

	// Constructors

	/** default constructor */
	public AbstractEsigMstr() {
	}

	/** full constructor */
	public AbstractEsigMstr(EsigMstrId id) {
		this.id = id;
	}

	// Property accessors

	public EsigMstrId getId() {
		return this.id;
	}

	public void setId(EsigMstrId id) {
		this.id = id;
	}

}