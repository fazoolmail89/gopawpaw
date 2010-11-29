package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UsrlDet entity. @author MyEclipse Persistence Tools
 */
public class UsrlDet extends AbstractUsrlDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrlDet() {
	}

	/** minimal constructor */
	public UsrlDet(UsrlDetId id, Boolean usrlActive, String usrlDeactiveBy,
			String usrlModUserid, Date usrlModDate, String usrlUser1,
			String usrlUser2, String usrlQadc01, String usrlQadc02,
			Double usrlQadd01, Double oidUsrlDet) {
		super(id, usrlActive, usrlDeactiveBy, usrlModUserid, usrlModDate,
				usrlUser1, usrlUser2, usrlQadc01, usrlQadc02, usrlQadd01,
				oidUsrlDet);
	}

	/** full constructor */
	public UsrlDet(UsrlDetId id, Boolean usrlActive, Date usrlActiveDate,
			Date usrlDeactiveDate, String usrlDeactiveBy, String usrlModUserid,
			Date usrlModDate, String usrlUser1, String usrlUser2,
			String usrlQadc01, String usrlQadc02, Double usrlQadd01,
			Date usrlQadt01, Double oidUsrlDet) {
		super(id, usrlActive, usrlActiveDate, usrlDeactiveDate, usrlDeactiveBy,
				usrlModUserid, usrlModDate, usrlUser1, usrlUser2, usrlQadc01,
				usrlQadc02, usrlQadd01, usrlQadt01, oidUsrlDet);
	}

}
