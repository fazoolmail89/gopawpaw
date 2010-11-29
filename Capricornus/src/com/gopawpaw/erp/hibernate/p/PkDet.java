package com.gopawpaw.erp.hibernate.p;

/**
 * PkDet entity. @author MyEclipse Persistence Tools
 */
public class PkDet extends AbstractPkDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PkDet() {
	}

	/** minimal constructor */
	public PkDet(PkDetId id, Double oidPkDet) {
		super(id, oidPkDet);
	}

	/** full constructor */
	public PkDet(PkDetId id, Double pkQty, String pkLoc, String pkLot,
			String pkUser1, String pkUser2, String pkQadc01, Double oidPkDet) {
		super(id, pkQty, pkLoc, pkLot, pkUser1, pkUser2, pkQadc01, oidPkDet);
	}

}
