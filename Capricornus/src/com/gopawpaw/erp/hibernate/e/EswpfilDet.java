package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpfilDet entity. @author MyEclipse Persistence Tools
 */
public class EswpfilDet extends AbstractEswpfilDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpfilDet() {
	}

	/** full constructor */
	public EswpfilDet(EswpfilDetId id, Double oidEswpfilDet,
			Date eswpfilModDate, String eswpfilModUserid, String eswpfilUser1,
			String eswpfilUser2, String eswpfilQadc01, String eswpfilQadc02) {
		super(id, oidEswpfilDet, eswpfilModDate, eswpfilModUserid,
				eswpfilUser1, eswpfilUser2, eswpfilQadc01, eswpfilQadc02);
	}

}
