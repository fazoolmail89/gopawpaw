package com.gopawpaw.erp.hibernate.m;

/**
 * MpdDet entity. @author MyEclipse Persistence Tools
 */
public class MpdDet extends AbstractMpdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MpdDet() {
	}

	/** minimal constructor */
	public MpdDet(MpdDetId id, Double oidMpdDet) {
		super(id, oidMpdDet);
	}

	/** full constructor */
	public MpdDet(MpdDetId id, String mpdLabel, String mpdTol,
			String mpdTolType, Integer mpdCmtindx, String mpdUser1,
			String mpdUser2, String mpdChr01, String mpdChr02, String mpdChr03,
			String mpdChr04, String mpdChr05, Double mpdDec01, Double mpdDec02,
			Double oidMpdDet) {
		super(id, mpdLabel, mpdTol, mpdTolType, mpdCmtindx, mpdUser1, mpdUser2,
				mpdChr01, mpdChr02, mpdChr03, mpdChr04, mpdChr05, mpdDec01,
				mpdDec02, oidMpdDet);
	}

}
