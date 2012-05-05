package com.gopawpaw.frame.struct.m;

/**
 * MntDet entity. @author MyEclipse Persistence Tools
 */
public class MntDet extends AbstractMntDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MntDet() {
	}

	/** minimal constructor */
	public MntDet(MntDetId id, Double oidMntDet) {
		super(id, oidMntDet);
	}

	/** full constructor */
	public MntDet(MntDetId id, String mntLabel, String mntUser1,
			String mntUser2, String mntQadc01, Double oidMntDet) {
		super(id, mntLabel, mntUser1, mntUser2, mntQadc01, oidMntDet);
	}

}
