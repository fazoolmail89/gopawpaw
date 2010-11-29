package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpfDet entity. @author MyEclipse Persistence Tools
 */
public class EswpfDet extends AbstractEswpfDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpfDet() {
	}

	/** full constructor */
	public EswpfDet(EswpfDetId id, Double oidEswpfDet, String eswpfFieldName,
			Boolean eswpfInclude, Boolean eswpfLabelInline, String eswpfCode,
			Date eswpfModDate, String eswpfModUserid, String eswpfUser1,
			String eswpfUser2, String eswpfQadc01, String eswpfQadc02) {
		super(id, oidEswpfDet, eswpfFieldName, eswpfInclude, eswpfLabelInline,
				eswpfCode, eswpfModDate, eswpfModUserid, eswpfUser1,
				eswpfUser2, eswpfQadc01, eswpfQadc02);
	}

}
