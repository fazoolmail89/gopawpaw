package com.gopawpaw.erp.hibernate.e;

/**
 * EswpsDetId entity. @author MyEclipse Persistence Tools
 */
public class EswpsDetId extends AbstractEswpsDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpsDetId() {
	}

	/** full constructor */
	public EswpsDetId(Double oidEswpMstr, Double oidEswpsDetParent,
			Integer eswpsOrder) {
		super(oidEswpMstr, oidEswpsDetParent, eswpsOrder);
	}

}
