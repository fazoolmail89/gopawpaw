package com.gopawpaw.erp.hibernate.u;

/**
 * UmsgDet entity. @author MyEclipse Persistence Tools
 */
public class UmsgDet extends AbstractUmsgDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UmsgDet() {
	}

	/** minimal constructor */
	public UmsgDet(UmsgDetId id, Double oidUmsgDet) {
		super(id, oidUmsgDet);
	}

	/** full constructor */
	public UmsgDet(UmsgDetId id, Integer umsgLevel, String umsgExecPgm,
			String umsgUser1, String umsgUser2, String umsgQadc01,
			Double oidUmsgDet) {
		super(id, umsgLevel, umsgExecPgm, umsgUser1, umsgUser2, umsgQadc01,
				oidUmsgDet);
	}

}
