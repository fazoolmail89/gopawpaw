package com.gopawpaw.erp.hibernate.f;

/**
 * FslpPln entity. @author MyEclipse Persistence Tools
 */
public class FslpPln extends AbstractFslpPln implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FslpPln() {
	}

	/** minimal constructor */
	public FslpPln(FslpPlnId id, Double oidFslpPln) {
		super(id, oidFslpPln);
	}

	/** full constructor */
	public FslpPln(FslpPlnId id, String fslpProdFcst, String fslpProdAct,
			String fslpUser1, String fslpUser2, Double fslpDec01,
			Double fslpDec02, String fslpDec03, String fslpDec04,
			Double oidFslpPln) {
		super(id, fslpProdFcst, fslpProdAct, fslpUser1, fslpUser2, fslpDec01,
				fslpDec02, fslpDec03, fslpDec04, oidFslpPln);
	}

}
