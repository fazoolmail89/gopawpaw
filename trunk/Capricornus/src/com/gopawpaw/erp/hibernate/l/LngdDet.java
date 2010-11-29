package com.gopawpaw.erp.hibernate.l;

/**
 * LngdDet entity. @author MyEclipse Persistence Tools
 */
public class LngdDet extends AbstractLngdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public LngdDet() {
	}

	/** minimal constructor */
	public LngdDet(LngdDetId id, Double oidLngdDet) {
		super(id, oidLngdDet);
	}

	/** full constructor */
	public LngdDet(LngdDetId id, String lngdTranslation, String lngdUser1,
			String lngdUser2, String lngdDesc, String lngdMnemonic,
			String lngdTranslate2, String lngdQadc01, Double oidLngdDet) {
		super(id, lngdTranslation, lngdUser1, lngdUser2, lngdDesc,
				lngdMnemonic, lngdTranslate2, lngdQadc01, oidLngdDet);
	}

}
