package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EscatMstr entity. @author MyEclipse Persistence Tools
 */
public class EscatMstr extends AbstractEscatMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EscatMstr() {
	}

	/** full constructor */
	public EscatMstr(Double oidEscatMstr, String escatPplib,
			String escatTopTableName, Boolean escatPreviewPrompt,
			Date escatModDate, String escatModUserid, String escatUser1,
			String escatUser2, String escatQadc01, String escatQadc02) {
		super(oidEscatMstr, escatPplib, escatTopTableName, escatPreviewPrompt,
				escatModDate, escatModUserid, escatUser1, escatUser2,
				escatQadc01, escatQadc02);
	}

}
