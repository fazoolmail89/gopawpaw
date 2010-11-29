package com.gopawpaw.erp.hibernate.t;

import java.util.Date;

/**
 * TrqMstr entity. @author MyEclipse Persistence Tools
 */
public class TrqMstr extends AbstractTrqMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TrqMstr() {
	}

	/** full constructor */
	public TrqMstr(TrqMstrId id, String trqDocType, String trqDocRef,
			String trqAddRef, String trqMsgType, String trqModUserid,
			Date trqModDate, String trqUser1, String trqUser2,
			String trqQadc01, Double oidTrqMstr) {
		super(id, trqDocType, trqDocRef, trqAddRef, trqMsgType, trqModUserid,
				trqModDate, trqUser1, trqUser2, trqQadc01, oidTrqMstr);
	}

}
