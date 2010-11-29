package com.gopawpaw.erp.hibernate.c;

/**
 * CdDet entity. @author MyEclipse Persistence Tools
 */
public class CdDet extends AbstractCdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CdDet() {
	}

	/** minimal constructor */
	public CdDet(CdDetId id, Double oidCdDet) {
		super(id, oidCdDet);
	}

	/** full constructor */
	public CdDet(CdDetId id, String cdCmmt, String cdUser1, String cdUser2,
			String cdQadc01, Double oidCdDet) {
		super(id, cdCmmt, cdUser1, cdUser2, cdQadc01, oidCdDet);
	}

}
