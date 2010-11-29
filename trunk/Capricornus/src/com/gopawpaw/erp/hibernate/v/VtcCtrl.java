package com.gopawpaw.erp.hibernate.v;

/**
 * VtcCtrl entity. @author MyEclipse Persistence Tools
 */
public class VtcCtrl extends AbstractVtcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public VtcCtrl() {
	}

	/** minimal constructor */
	public VtcCtrl(Double oidVtcCtrl) {
		super(oidVtcCtrl);
	}

	/** full constructor */
	public VtcCtrl(String vtcVtClass, Boolean vtcDisc, String vtcUser1,
			String vtcUser2, String vtcRound, Boolean vtcPmtDisc,
			Boolean vtcValReg, String vtcQadc01, Double oidVtcCtrl) {
		super(vtcVtClass, vtcDisc, vtcUser1, vtcUser2, vtcRound, vtcPmtDisc,
				vtcValReg, vtcQadc01, oidVtcCtrl);
	}

}
