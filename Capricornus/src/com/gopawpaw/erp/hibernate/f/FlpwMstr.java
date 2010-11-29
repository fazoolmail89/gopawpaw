package com.gopawpaw.erp.hibernate.f;

/**
 * FlpwMstr entity. @author MyEclipse Persistence Tools
 */
public class FlpwMstr extends AbstractFlpwMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FlpwMstr() {
	}

	/** minimal constructor */
	public FlpwMstr(FlpwMstrId id, Double oidFlpwMstr) {
		super(id, oidFlpwMstr);
	}

	/** full constructor */
	public FlpwMstr(FlpwMstrId id, String flpwCmmt, String flpwUser1,
			String flpwUser2, String flpwQadc01, Double oidFlpwMstr) {
		super(id, flpwCmmt, flpwUser1, flpwUser2, flpwQadc01, oidFlpwMstr);
	}

}
