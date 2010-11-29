package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpsDet entity. @author MyEclipse Persistence Tools
 */
public class EswpsDet extends AbstractEswpsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpsDet() {
	}

	/** full constructor */
	public EswpsDet(EswpsDetId id, Double oidEswpsDet, Boolean eswpsInclude,
			String eswpsTableName, String eswpsCode, Boolean eswpsMultiple,
			Date eswpsModDate, String eswpsModUserid, String eswpsUser1,
			String eswpsUser2, String eswpsQadc01, String eswpsQadc02) {
		super(id, oidEswpsDet, eswpsInclude, eswpsTableName, eswpsCode,
				eswpsMultiple, eswpsModDate, eswpsModUserid, eswpsUser1,
				eswpsUser2, eswpsQadc01, eswpsQadc02);
	}

}
