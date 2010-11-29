package com.gopawpaw.erp.hibernate.s;

/**
 * ScMstr entity. @author MyEclipse Persistence Tools
 */
public class ScMstr extends AbstractScMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ScMstr() {
	}

	/** minimal constructor */
	public ScMstr(ScMstrId id, Double oidScMstr) {
		super(id, oidScMstr);
	}

	/** full constructor */
	public ScMstr(ScMstrId id, String scDesc, String scCategory,
			String scUser1, String scUser2, String scQadc01, Double oidScMstr) {
		super(id, scDesc, scCategory, scUser1, scUser2, scQadc01, oidScMstr);
	}

}
