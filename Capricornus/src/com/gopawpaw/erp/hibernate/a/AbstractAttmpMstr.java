package com.gopawpaw.erp.hibernate.a;

/**
 * AbstractAttmpMstr entity provides the base persistence definition of the
 * AttmpMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAttmpMstr implements java.io.Serializable {

	// Fields

	private AttmpMstrId id;

	// Constructors

	/** default constructor */
	public AbstractAttmpMstr() {
	}

	/** full constructor */
	public AbstractAttmpMstr(AttmpMstrId id) {
		this.id = id;
	}

	// Property accessors

	public AttmpMstrId getId() {
		return this.id;
	}

	public void setId(AttmpMstrId id) {
		this.id = id;
	}

}