package com.gopawpaw.erp.hibernate.p;

import java.util.Date;

/**
 * PouldDet entity. @author MyEclipse Persistence Tools
 */
public class PouldDet extends AbstractPouldDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PouldDet() {
	}

	/** full constructor */
	public PouldDet(PouldDetId id, Integer pouldPreference,
			String pouldModUserid, Date pouldModDate, String pouldUser1,
			String pouldUser2, String pouldQadc01, String pouldQadc02,
			Double oidPouldDet) {
		super(id, pouldPreference, pouldModUserid, pouldModDate, pouldUser1,
				pouldUser2, pouldQadc01, pouldQadc02, oidPouldDet);
	}

}
