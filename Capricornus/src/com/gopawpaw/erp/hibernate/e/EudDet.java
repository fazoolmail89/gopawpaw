package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EudDet entity. @author MyEclipse Persistence Tools
 */
public class EudDet extends AbstractEudDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EudDet() {
	}

	/** minimal constructor */
	public EudDet(EudDetId id, String eudMailAddr, Double oidEudDet) {
		super(id, eudMailAddr, oidEudDet);
	}

	/** full constructor */
	public EudDet(EudDetId id, String eudAddr, String eudLsType,
			String eudSort, String eudPhone, String eudFax, String eudTitle,
			String eudType, Date eudUpdt, String eudNametype, String eudUser1,
			String eudUser2, String eudMailAddr, String eudModUserid,
			Date eudModDate, String eudChr01, String eudChr02, String eudChr03,
			Integer eudInt01, Date eudDte01, Boolean eudLog01,
			String eudQadc01, String eudQadc02, String eudQadc03,
			Integer eudQadi01, Date eudQadt01, Boolean eudQadl01,
			Double oidEudDet) {
		super(id, eudAddr, eudLsType, eudSort, eudPhone, eudFax, eudTitle,
				eudType, eudUpdt, eudNametype, eudUser1, eudUser2, eudMailAddr,
				eudModUserid, eudModDate, eudChr01, eudChr02, eudChr03,
				eudInt01, eudDte01, eudLog01, eudQadc01, eudQadc02, eudQadc03,
				eudQadi01, eudQadt01, eudQadl01, oidEudDet);
	}

}
