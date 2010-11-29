package com.gopawpaw.erp.hibernate.p;

/**
 * PrdDet entity. @author MyEclipse Persistence Tools
 */
public class PrdDet extends AbstractPrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PrdDet() {
	}

	/** minimal constructor */
	public PrdDet(String prdPath, Integer prdDestType, Double oidPrdDet) {
		super(prdPath, prdDestType, oidPrdDet);
	}

	/** full constructor */
	public PrdDet(String prdDesc, String prdSt80, String prdReset,
			String prdSt132, String prdStBc, String prdEndBc,
			String prdNegLine, Integer prdLength, Integer prdBlank,
			String prdPage, String prdType, Boolean prdSpooler, String prdPath,
			String prdInit, String prdInitPro, String prdRsetPro,
			String prdUser1, String prdUser2, String prdMapterm,
			Integer prdMaxPage, Boolean prdScrollOnly, String prdQad01,
			Integer prdDestType, Double oidPrdDet) {
		super(prdDesc, prdSt80, prdReset, prdSt132, prdStBc, prdEndBc,
				prdNegLine, prdLength, prdBlank, prdPage, prdType, prdSpooler,
				prdPath, prdInit, prdInitPro, prdRsetPro, prdUser1, prdUser2,
				prdMapterm, prdMaxPage, prdScrollOnly, prdQad01, prdDestType,
				oidPrdDet);
	}

}
