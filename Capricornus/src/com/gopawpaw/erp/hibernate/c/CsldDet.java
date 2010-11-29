package com.gopawpaw.erp.hibernate.c;

/**
 * CsldDet entity. @author MyEclipse Persistence Tools
 */
public class CsldDet extends AbstractCsldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsldDet() {
	}

	/** minimal constructor */
	public CsldDet(CsldDetId id, Double oidCsldDet) {
		super(id, oidCsldDet);
	}

	/** full constructor */
	public CsldDet(CsldDetId id, Double csldMaxAmt, Integer csldMaxQty,
			Double csldTotAmt, Integer csldTotQty, String csldCurr,
			Integer csldCmtindx, String csldUser1, String csldUser2,
			String csldQadc01, Double oidCsldDet) {
		super(id, csldMaxAmt, csldMaxQty, csldTotAmt, csldTotQty, csldCurr,
				csldCmtindx, csldUser1, csldUser2, csldQadc01, oidCsldDet);
	}

}
