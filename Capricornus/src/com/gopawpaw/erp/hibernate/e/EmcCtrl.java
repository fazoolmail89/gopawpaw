package com.gopawpaw.erp.hibernate.e;

/**
 * EmcCtrl entity. @author MyEclipse Persistence Tools
 */
public class EmcCtrl extends AbstractEmcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EmcCtrl() {
	}

	/** minimal constructor */
	public EmcCtrl(Double oidEmcCtrl) {
		super(oidEmcCtrl);
	}

	/** full constructor */
	public EmcCtrl(Integer emcNbr, Integer emcQad01, String emcUser1,
			String emcUser2, Integer emcQadi01, Double oidEmcCtrl) {
		super(emcNbr, emcQad01, emcUser1, emcUser2, emcQadi01, oidEmcCtrl);
	}

}
