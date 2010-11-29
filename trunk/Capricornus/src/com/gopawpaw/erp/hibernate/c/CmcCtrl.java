package com.gopawpaw.erp.hibernate.c;

/**
 * CmcCtrl entity. @author MyEclipse Persistence Tools
 */
public class CmcCtrl extends AbstractCmcCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmcCtrl() {
	}

	/** minimal constructor */
	public CmcCtrl(Double oidCmcCtrl) {
		super(oidCmcCtrl);
	}

	/** full constructor */
	public CmcCtrl(Integer cmcNbr, String cmcUser1, String cmcUser2,
			Integer cmcQadi01, String cmcQadc01, Double oidCmcCtrl) {
		super(cmcNbr, cmcUser1, cmcUser2, cmcQadi01, cmcQadc01, oidCmcCtrl);
	}

}
