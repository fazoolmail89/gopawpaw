package com.gopawpaw.erp.hibernate.g;

/**
 * GlrMstr entity. @author MyEclipse Persistence Tools
 */
public class GlrMstr extends AbstractGlrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GlrMstr() {
	}

	/** minimal constructor */
	public GlrMstr(GlrMstrId id, Double oidGlrMstr) {
		super(id, oidGlrMstr);
	}

	/** full constructor */
	public GlrMstr(GlrMstrId id, String glrTitle, String glrUser1,
			String glrUser2, String glrQadc01, Double oidGlrMstr) {
		super(id, glrTitle, glrUser1, glrUser2, glrQadc01, oidGlrMstr);
	}

}
