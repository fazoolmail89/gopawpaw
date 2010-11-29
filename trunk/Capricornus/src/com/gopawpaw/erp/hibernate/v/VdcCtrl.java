package com.gopawpaw.erp.hibernate.v;

/**
 * VdcCtrl entity. @author MyEclipse Persistence Tools
 */
public class VdcCtrl extends AbstractVdcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VdcCtrl() {
	}

	/** minimal constructor */
	public VdcCtrl(Double oidVdcCtrl) {
		super(oidVdcCtrl);
	}

	/** full constructor */
	public VdcCtrl(Integer vdcNbr, String vdcUser1, String vdcUser2,
			Integer vdcQadi01, String vdcQadc01, Double oidVdcCtrl) {
		super(vdcNbr, vdcUser1, vdcUser2, vdcQadi01, vdcQadc01, oidVdcCtrl);
	}

}
