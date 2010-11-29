package com.gopawpaw.erp.hibernate.l;

import java.util.Date;

/**
 * LacCtrl entity. @author MyEclipse Persistence Tools
 */
public class LacCtrl extends AbstractLacCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LacCtrl() {
	}

	/** full constructor */
	public LacCtrl(Boolean lacUseLogistics, Integer lacQadi01, Date lacModDate,
			String lacModUserid, String lacUser1, String lacUser2,
			String lacQadc01, String lacQadc02, String lacSoshipNrmId,
			String lacDoshipNrmId, Boolean lacBlankSuppliers, Double oidLacCtrl) {
		super(lacUseLogistics, lacQadi01, lacModDate, lacModUserid, lacUser1,
				lacUser2, lacQadc01, lacQadc02, lacSoshipNrmId, lacDoshipNrmId,
				lacBlankSuppliers, oidLacCtrl);
	}

}
