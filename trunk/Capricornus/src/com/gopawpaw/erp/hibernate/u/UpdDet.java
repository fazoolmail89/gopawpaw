package com.gopawpaw.erp.hibernate.u;

/**
 * UpdDet entity. @author MyEclipse Persistence Tools
 */
public class UpdDet extends AbstractUpdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UpdDet() {
	}

	/** minimal constructor */
	public UpdDet(UpdDetId id, Double oidUpdDet) {
		super(id, oidUpdDet);
	}

	/** full constructor */
	public UpdDet(UpdDetId id, String updExec, String updDev, String updUser1,
			String updUser2, String updQadc01, Double oidUpdDet) {
		super(id, updExec, updDev, updUser1, updUser2, updQadc01, oidUpdDet);
	}

}
