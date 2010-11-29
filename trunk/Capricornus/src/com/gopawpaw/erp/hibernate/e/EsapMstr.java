package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EsapMstr entity. @author MyEclipse Persistence Tools
 */
public class EsapMstr extends AbstractEsapMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsapMstr() {
	}

	/** full constructor */
	public EsapMstr(EsapMstrId id, Double oidEsapMstr, Boolean esapEsigActive,
			String esapFilterMode, Boolean esapCommentPrompt,
			Boolean esapLatestDisplay, Boolean esapDataFrameOpt,
			Boolean esapPreviewPrompt, Date esapModDate, String esapModUserid,
			String esapUser1, String esapUser2, String esapQadc01,
			String esapQadc02) {
		super(id, oidEsapMstr, esapEsigActive, esapFilterMode,
				esapCommentPrompt, esapLatestDisplay, esapDataFrameOpt,
				esapPreviewPrompt, esapModDate, esapModUserid, esapUser1,
				esapUser2, esapQadc01, esapQadc02);
	}

}
