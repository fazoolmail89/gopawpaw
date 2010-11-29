package com.gopawpaw.erp.hibernate.k;

import java.util.Date;

/**
 * KnbsmMstr entity. @author MyEclipse Persistence Tools
 */
public class KnbsmMstr extends AbstractKnbsmMstr implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public KnbsmMstr() {
	}

	/** minimal constructor */
	public KnbsmMstr(KnbsmMstrId id, Double knbsmKeyid, String knbsmInvLoc,
			String knbsmInvLocType, String knbsmDestFax, String knbsmDestFax2,
			String knbsmDestEmail, Date knbsmModDate, String knbsmModUserid,
			String knbsmUser1, String knbsmUser2, String knbsmQadc01,
			String knbsmQadc02, Integer knbsmCmtindx, Double oidKnbsmMstr) {
		super(id, knbsmKeyid, knbsmInvLoc, knbsmInvLocType, knbsmDestFax,
				knbsmDestFax2, knbsmDestEmail, knbsmModDate, knbsmModUserid,
				knbsmUser1, knbsmUser2, knbsmQadc01, knbsmQadc02, knbsmCmtindx,
				oidKnbsmMstr);
	}

	/** full constructor */
	public KnbsmMstr(KnbsmMstrId id, String knbsmDesc, Double knbsmKeyid,
			String knbsmInvLoc, String knbsmInvLocType, String knbsmDestFax,
			String knbsmDestFax2, String knbsmDestEmail, Date knbsmModDate,
			String knbsmModUserid, String knbsmUser1, String knbsmUser2,
			String knbsmQadc01, String knbsmQadc02, Integer knbsmCmtindx,
			Double oidKnbsmMstr) {
		super(id, knbsmDesc, knbsmKeyid, knbsmInvLoc, knbsmInvLocType,
				knbsmDestFax, knbsmDestFax2, knbsmDestEmail, knbsmModDate,
				knbsmModUserid, knbsmUser1, knbsmUser2, knbsmQadc01,
				knbsmQadc02, knbsmCmtindx, oidKnbsmMstr);
	}

}
