package com.gopawpaw.erp.hibernate.w;

/**
 * WldDetId entity. @author MyEclipse Persistence Tools
 */
public class WldDetId extends AbstractWldDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WldDetId() {
	}

	/** minimal constructor */
	public WldDetId(String wldDomain, Integer wldProdbyOp, String wldWkctr,
			Integer wldAllocOp) {
		super(wldDomain, wldProdbyOp, wldWkctr, wldAllocOp);
	}

	/** full constructor */
	public WldDetId(String wldDomain, String wldProdbyId, Integer wldProdbyOp,
			String wldLotser, String wldRef, String wldSite, String wldWkctr,
			String wldMch, String wldAllocId, Integer wldAllocOp,
			String wldAllocQue) {
		super(wldDomain, wldProdbyId, wldProdbyOp, wldLotser, wldRef, wldSite,
				wldWkctr, wldMch, wldAllocId, wldAllocOp, wldAllocQue);
	}

}
