package com.gopawpaw.erp.hibernate.s;

/**
 * SimDet entity. @author MyEclipse Persistence Tools
 */
public class SimDet extends AbstractSimDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SimDet() {
	}

	/** minimal constructor */
	public SimDet(SimDetId id, String simCanrun, Double oidSimDet) {
		super(id, simCanrun, oidSimDet);
	}

	/** full constructor */
	public SimDet(SimDetId id, String simCanrun, String simUser1,
			String simUser2, String simQadc01, Double oidSimDet) {
		super(id, simCanrun, simUser1, simUser2, simQadc01, oidSimDet);
	}

}
