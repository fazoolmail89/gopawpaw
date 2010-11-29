package com.gopawpaw.erp.hibernate.e;

/**
 * AbstractEscdDet entity provides the base persistence definition of the
 * EscdDet entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractEscdDet implements java.io.Serializable {

	// Fields

	private EscdDetId id;

	// Constructors

	/** default constructor */
	public AbstractEscdDet() {
	}

	/** full constructor */
	public AbstractEscdDet(EscdDetId id) {
		this.id = id;
	}

	// Property accessors

	public EscdDetId getId() {
		return this.id;
	}

	public void setId(EscdDetId id) {
		this.id = id;
	}

}