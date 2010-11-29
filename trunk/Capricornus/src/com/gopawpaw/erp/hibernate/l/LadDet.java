package com.gopawpaw.erp.hibernate.l;

/**
 * LadDet entity. @author MyEclipse Persistence Tools
 */
public class LadDet extends AbstractLadDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LadDet() {
	}

	/** minimal constructor */
	public LadDet(LadDetId id, Double oidLadDet) {
		super(id, oidLadDet);
	}

	/** full constructor */
	public LadDet(LadDetId id, Double ladQtyAll, Double ladQtyPick,
			Double ladQtyChg, String ladUser1, String ladUser2,
			String ladOrdSite, String ladQadc01, Double oidLadDet) {
		super(id, ladQtyAll, ladQtyPick, ladQtyChg, ladUser1, ladUser2,
				ladOrdSite, ladQadc01, oidLadDet);
	}

}
