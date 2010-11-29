package com.gopawpaw.erp.hibernate.w;

/**
 * WocCtrl entity. @author MyEclipse Persistence Tools
 */
public class WocCtrl extends AbstractWocCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public WocCtrl() {
	}

	/** minimal constructor */
	public WocCtrl(Double oidWocCtrl) {
		super(oidWocCtrl);
	}

	/** full constructor */
	public WocCtrl(Boolean wocAutoNbr, Integer wocNbr, Integer wocQadi01,
			Boolean wocWcmmts, Boolean wocRcmmts, Boolean wocMove,
			Integer wocPaperLt, Boolean wocQadl02, Boolean wocQadl01,
			String wocUser1, String wocUser2, Integer wocQadi02,
			String wocSched, String wocTimeInd, Boolean wocLbrUp,
			Boolean wocBdnUp, Boolean wocGlLbr, Boolean wocGlBdn,
			Boolean wocVar, String wocNbrPre, Double oidWocCtrl) {
		super(wocAutoNbr, wocNbr, wocQadi01, wocWcmmts, wocRcmmts, wocMove,
				wocPaperLt, wocQadl02, wocQadl01, wocUser1, wocUser2,
				wocQadi02, wocSched, wocTimeInd, wocLbrUp, wocBdnUp, wocGlLbr,
				wocGlBdn, wocVar, wocNbrPre, oidWocCtrl);
	}

}
