package com.gopawpaw.erp.hibernate.b;

/**
 * BdldDet entity. @author MyEclipse Persistence Tools
 */
public class BdldDet extends AbstractBdldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BdldDet() {
	}

	/** minimal constructor */
	public BdldDet(BdldDetId id, Double oidBdldDet) {
		super(id, oidBdldDet);
	}

	/** full constructor */
	public BdldDet(BdldDetId id, String bdldData, String bdldUser1,
			String bdldUser2, String bdldQadc01, Double oidBdldDet) {
		super(id, bdldData, bdldUser1, bdldUser2, bdldQadc01, oidBdldDet);
	}

}
