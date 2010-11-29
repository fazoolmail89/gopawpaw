package com.gopawpaw.erp.hibernate.c;

import java.util.Date;

/**
 * CildDet entity. @author MyEclipse Persistence Tools
 */
public class CildDet extends AbstractCildDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CildDet() {
	}

	/** full constructor */
	public CildDet(CildDetId id, Date cildModDate, String cildModUserid,
			String cildPrevInv, String cildPrevSoNbr, String cildUser1,
			String cildUser2, String cildQadc01, String cildQadc02,
			Integer cildPrevLine, Double oidCildDet) {
		super(id, cildModDate, cildModUserid, cildPrevInv, cildPrevSoNbr,
				cildUser1, cildUser2, cildQadc01, cildQadc02, cildPrevLine,
				oidCildDet);
	}

}
