package com.gopawpaw.erp.hibernate.f;

/**
 * FacCtrl entity. @author MyEclipse Persistence Tools
 */
public class FacCtrl extends AbstractFacCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FacCtrl() {
	}

	/** minimal constructor */
	public FacCtrl(Double oidFacCtrl) {
		super(oidFacCtrl);
	}

	/** full constructor */
	public FacCtrl(Integer facQadi01, Boolean facSoRec, Boolean facWoRec,
			Boolean facUnitQty, String facUser1, String facUser2,
			String facQadc01, Double oidFacCtrl) {
		super(facQadi01, facSoRec, facWoRec, facUnitQty, facUser1, facUser2,
				facQadc01, oidFacCtrl);
	}

}
