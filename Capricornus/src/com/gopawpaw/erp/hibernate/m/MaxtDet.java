package com.gopawpaw.erp.hibernate.m;

/**
 * MaxtDet entity. @author MyEclipse Persistence Tools
 */
public class MaxtDet extends AbstractMaxtDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MaxtDet() {
	}

	/** minimal constructor */
	public MaxtDet(MaxtDetId id, Double oidMaxtDet) {
		super(id, oidMaxtDet);
	}

	/** full constructor */
	public MaxtDet(MaxtDetId id, Double maxtAmt, Boolean maxtQad01,
			String maxtQad02, String maxtQad03, String maxtUser1,
			String maxtUser2, Double oidMaxtDet) {
		super(id, maxtAmt, maxtQad01, maxtQad02, maxtQad03, maxtUser1,
				maxtUser2, oidMaxtDet);
	}

}
