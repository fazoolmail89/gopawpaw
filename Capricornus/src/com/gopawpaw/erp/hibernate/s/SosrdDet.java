package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SosrdDet entity. @author MyEclipse Persistence Tools
 */
public class SosrdDet extends AbstractSosrdDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SosrdDet() {
	}

	/** full constructor */
	public SosrdDet(SosrdDetId id, Date sosrdModDate, String sosrdModUserid,
			String sosrdRsnCode, String sosrdUser1, String sosrdUser2,
			String sosrdQadc01, String sosrdQadc02, Double oidSosrdDet) {
		super(id, sosrdModDate, sosrdModUserid, sosrdRsnCode, sosrdUser1,
				sosrdUser2, sosrdQadc01, sosrdQadc02, oidSosrdDet);
	}

}
