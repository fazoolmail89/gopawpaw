package com.gopawpaw.erp.hibernate.g;

import java.util.Date;

/**
 * GlsdMstr entity. @author MyEclipse Persistence Tools
 */
public class GlsdMstr extends AbstractGlsdMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlsdMstr() {
	}

	/** full constructor */
	public GlsdMstr(GlsdMstrId id, String glsdSrcDesc, String glsdModUserid,
			Date glsdModDate, String glsdUser1, String glsdUser2,
			String glsdQadc01, String glsdQadc02, String glsdExec,
			Double oidGlsdMstr) {
		super(id, glsdSrcDesc, glsdModUserid, glsdModDate, glsdUser1,
				glsdUser2, glsdQadc01, glsdQadc02, glsdExec, oidGlsdMstr);
	}

}
