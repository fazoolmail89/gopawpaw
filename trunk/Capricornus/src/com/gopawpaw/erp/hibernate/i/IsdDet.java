package com.gopawpaw.erp.hibernate.i;

/**
 * IsdDet entity. @author MyEclipse Persistence Tools
 */
public class IsdDet extends AbstractIsdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IsdDet() {
	}

	/** minimal constructor */
	public IsdDet(IsdDetId id, Boolean isdBdlAllowed, Double oidIsdDet) {
		super(id, isdBdlAllowed, oidIsdDet);
	}

	/** full constructor */
	public IsdDet(IsdDetId id, String isdUser1, String isdUser2,
			Boolean isdBdlAllowed, String isdQadc01, Double oidIsdDet) {
		super(id, isdUser1, isdUser2, isdBdlAllowed, isdQadc01, oidIsdDet);
	}

}
