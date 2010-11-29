package com.gopawpaw.erp.hibernate.u;

import java.util.Date;

/**
 * UsrgMstr entity. @author MyEclipse Persistence Tools
 */
public class UsrgMstr extends AbstractUsrgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public UsrgMstr() {
	}

	/** full constructor */
	public UsrgMstr(String usrgGroupDesc, String usrgModUserid,
			Date usrgModDate, String usrgUser1, String usrgUser2,
			String usrgQadc01, String usrgQadc02, Double oidUsrgMstr) {
		super(usrgGroupDesc, usrgModUserid, usrgModDate, usrgUser1, usrgUser2,
				usrgQadc01, usrgQadc02, oidUsrgMstr);
	}

}
