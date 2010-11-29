package com.gopawpaw.erp.hibernate.u;

/**
 * UfdDet entity. @author MyEclipse Persistence Tools
 */
public class UfdDet extends AbstractUfdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UfdDet() {
	}

	/** minimal constructor */
	public UfdDet(UfdDetId id, String ufdLabel, Double oidUfdDet) {
		super(id, ufdLabel, oidUfdDet);
	}

	/** full constructor */
	public UfdDet(UfdDetId id, String ufdExec, String ufdNbr,
			Integer ufdSelect, String ufdUser1, String ufdUser2,
			String ufdNbrsel, String ufdLabel, String ufdQadc01,
			Double oidUfdDet) {
		super(id, ufdExec, ufdNbr, ufdSelect, ufdUser1, ufdUser2, ufdNbrsel,
				ufdLabel, ufdQadc01, oidUfdDet);
	}

}
