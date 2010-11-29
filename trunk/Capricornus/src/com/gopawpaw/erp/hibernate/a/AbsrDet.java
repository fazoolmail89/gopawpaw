package com.gopawpaw.erp.hibernate.a;

/**
 * AbsrDet entity. @author MyEclipse Persistence Tools
 */
public class AbsrDet extends AbstractAbsrDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsrDet() {
	}

	/** minimal constructor */
	public AbsrDet(AbsrDetId id, Double oidAbsrDet) {
		super(id, oidAbsrDet);
	}

	/** full constructor */
	public AbsrDet(AbsrDetId id, Double absrQty, String absrShipId,
			Boolean absrCnfrmd, String absrUser1, String absrUser2,
			String absrQadc01, Double oidAbsrDet) {
		super(id, absrQty, absrShipId, absrCnfrmd, absrUser1, absrUser2,
				absrQadc01, oidAbsrDet);
	}

}
