package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EscxDet entity. @author MyEclipse Persistence Tools
 */
public class EscxDet extends AbstractEscxDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscxDet() {
	}

	/** full constructor */
	public EscxDet(EscxDetId id, Double oidEscxDet, String escxXmlStamp,
			Date escxModDate, String escxModUserid, String escxUser1,
			String escxUser2, String escxQadc01, String escxQadc02) {
		super(id, oidEscxDet, escxXmlStamp, escxModDate, escxModUserid,
				escxUser1, escxUser2, escxQadc01, escxQadc02);
	}

}
