package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpMstr entity. @author MyEclipse Persistence Tools
 */
public class EswpMstr extends AbstractEswpMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpMstr() {
	}

	/** full constructor */
	public EswpMstr(EswpMstrId id, Double oidEswpMstr, Boolean eswpEsigActive,
			Boolean eswpCommentPrompt, String eswpFilterMode,
			Boolean eswpLatestDisplay, Boolean eswpDataFrameOpt,
			Boolean eswpPreviewPrompt, Date eswpModDate, String eswpModUserid,
			String eswpUser1, String eswpUser2, String eswpQadc01,
			String eswpQadc02) {
		super(id, oidEswpMstr, eswpEsigActive, eswpCommentPrompt,
				eswpFilterMode, eswpLatestDisplay, eswpDataFrameOpt,
				eswpPreviewPrompt, eswpModDate, eswpModUserid, eswpUser1,
				eswpUser2, eswpQadc01, eswpQadc02);
	}

}
