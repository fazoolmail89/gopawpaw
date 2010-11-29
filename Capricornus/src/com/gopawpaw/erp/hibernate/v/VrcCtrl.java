package com.gopawpaw.erp.hibernate.v;

/**
 * VrcCtrl entity. @author MyEclipse Persistence Tools
 */
public class VrcCtrl extends AbstractVrcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VrcCtrl() {
	}

	/** minimal constructor */
	public VrcCtrl(VrcCtrlId id, Double oidVrcCtrl) {
		super(id, oidVrcCtrl);
	}

	/** full constructor */
	public VrcCtrl(VrcCtrlId id, String vrcUser1, String vrcUser2,
			String vrcQadc01, Double oidVrcCtrl) {
		super(id, vrcUser1, vrcUser2, vrcQadc01, oidVrcCtrl);
	}

}
