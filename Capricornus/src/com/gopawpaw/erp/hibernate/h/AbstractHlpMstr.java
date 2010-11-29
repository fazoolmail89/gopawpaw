package com.gopawpaw.erp.hibernate.h;

/**
 * AbstractHlpMstr entity provides the base persistence definition of the
 * HlpMstr entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractHlpMstr implements java.io.Serializable {

	// Fields

	private HlpMstrId id;

	// Constructors

	/** default constructor */
	public AbstractHlpMstr() {
	}

	/** full constructor */
	public AbstractHlpMstr(HlpMstrId id) {
		this.id = id;
	}

	// Property accessors

	public HlpMstrId getId() {
		return this.id;
	}

	public void setId(HlpMstrId id) {
		this.id = id;
	}

}