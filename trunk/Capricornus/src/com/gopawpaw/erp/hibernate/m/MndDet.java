package com.gopawpaw.erp.hibernate.m;

/**
 * MndDet entity. @author MyEclipse Persistence Tools
 */
public class MndDet extends AbstractMndDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MndDet() {
	}

	/** minimal constructor */
	public MndDet(MndDetId id, String mndLabel, String mndExec,
			String mndCanrun, Double oidMndDet, String mndUri) {
		super(id, mndLabel, mndExec, mndCanrun, oidMndDet, mndUri);
	}

	/** full constructor */
	public MndDet(MndDetId id, String mndLabel, String mndExec,
			Integer mndFkey, String mndHelp, String mndCanrun, String mndName,
			String mndUser1, String mndUser2, String mndQadc01,
			Double oidMndDet, String mndUri) {
		super(id, mndLabel, mndExec, mndFkey, mndHelp, mndCanrun, mndName,
				mndUser1, mndUser2, mndQadc01, oidMndDet, mndUri);
	}

}
