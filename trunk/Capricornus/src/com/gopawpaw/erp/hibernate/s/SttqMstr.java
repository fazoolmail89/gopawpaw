package com.gopawpaw.erp.hibernate.s;

import java.util.Date;

/**
 * SttqMstr entity. @author MyEclipse Persistence Tools
 */
public class SttqMstr extends AbstractSttqMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SttqMstr() {
	}

	/** full constructor */
	public SttqMstr(SttqMstrId id, String sttqDesc, String sttqQadc01,
			String sttqQadc02, String sttqModUserid, Date sttqModDate,
			String sttqUser1, String sttqUser2, Double oidSttqMstr) {
		super(id, sttqDesc, sttqQadc01, sttqQadc02, sttqModUserid, sttqModDate,
				sttqUser1, sttqUser2, oidSttqMstr);
	}

}
