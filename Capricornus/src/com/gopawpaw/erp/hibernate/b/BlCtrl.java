package com.gopawpaw.erp.hibernate.b;

/**
 * BlCtrl entity. @author MyEclipse Persistence Tools
 */
public class BlCtrl extends AbstractBlCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BlCtrl() {
	}

	/** minimal constructor */
	public BlCtrl(BlCtrlId id, Double oidBlCtrl) {
		super(id, oidBlCtrl);
	}

	/** full constructor */
	public BlCtrl(BlCtrlId id, String blUser1, String blUser2, String blQadc01,
			Double oidBlCtrl) {
		super(id, blUser1, blUser2, blQadc01, oidBlCtrl);
	}

}
