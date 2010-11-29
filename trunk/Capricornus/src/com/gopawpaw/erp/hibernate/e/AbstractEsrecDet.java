package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEsrecDet entity provides the base persistence definition of the
 * EsrecDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEsrecDet implements java.io.Serializable {

	// Fields

	private EsrecDetId id;

	// Constructors

	/** default constructor */
	public AbstractEsrecDet() {
	}

	/** full constructor */
	public AbstractEsrecDet(EsrecDetId id) {
		this.id = id;
	}

	// Property accessors

	public EsrecDetId getId() {
		return this.id;
	}

	public void setId(EsrecDetId id) {
		this.id = id;
	}

}