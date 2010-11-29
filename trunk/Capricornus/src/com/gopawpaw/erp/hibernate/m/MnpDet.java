package com.gopawpaw.erp.hibernate.m;

/**
 * MnpDet entity. @author MyEclipse Persistence Tools
 */
public class MnpDet extends AbstractMnpDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MnpDet() {
	}

	/** minimal constructor */
	public MnpDet(MnpDetId id, Double oidMnpDet) {
		super(id, oidMnpDet);
	}

	/** full constructor */
	public MnpDet(MnpDetId id, String mnpExec, String mnpMenu,
			Integer mnpSelect, String mnpRepeatGroup, String mnpUser1,
			String mnpUser2, String mnpQadc01, Double oidMnpDet) {
		super(id, mnpExec, mnpMenu, mnpSelect, mnpRepeatGroup, mnpUser1,
				mnpUser2, mnpQadc01, oidMnpDet);
	}

}
