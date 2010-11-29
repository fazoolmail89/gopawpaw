package com.gopawpaw.erp.hibernate.i;

/**
 * ItsdDet entity. @author MyEclipse Persistence Tools
 */
public class ItsdDet extends AbstractItsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItsdDet() {
	}

	/** minimal constructor */
	public ItsdDet(ItsdDetId id, Double oidItsdDet) {
		super(id, oidItsdDet);
	}

	/** full constructor */
	public ItsdDet(ItsdDetId id, Double itsdQty, String itsdUser1,
			String itsdUser2, String itsdRef, Boolean itsdLoaded,
			String itsdQadc01, Double oidItsdDet) {
		super(id, itsdQty, itsdUser1, itsdUser2, itsdRef, itsdLoaded,
				itsdQadc01, oidItsdDet);
	}

}
