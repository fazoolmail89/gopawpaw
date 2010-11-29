package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpfcDet entity. @author MyEclipse Persistence Tools
 */
public class EswpfcDet extends AbstractEswpfcDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpfcDet() {
	}

	/** full constructor */
	public EswpfcDet(EswpfcDetId id, Double oidEswpfcDet, Date eswpfcModDate,
			String eswpfcModUserid, String eswpfcUser1, String eswpfcUser2,
			String eswpfcQadc01, String eswpfcQadc02) {
		super(id, oidEswpfcDet, eswpfcModDate, eswpfcModUserid, eswpfcUser1,
				eswpfcUser2, eswpfcQadc01, eswpfcQadc02);
	}

}
