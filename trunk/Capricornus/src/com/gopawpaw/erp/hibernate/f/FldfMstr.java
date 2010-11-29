package com.gopawpaw.erp.hibernate.f;

/**
 * FldfMstr entity. @author MyEclipse Persistence Tools
 */
public class FldfMstr extends AbstractFldfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FldfMstr() {
	}

	/** minimal constructor */
	public FldfMstr(FldfMstrId id, Double oidFldfMstr) {
		super(id, oidFldfMstr);
	}

	/** full constructor */
	public FldfMstr(FldfMstrId id, String fldfValue, String fldfDesc,
			String fldfUser1, String fldfUser2, String fldfQadc01,
			Double oidFldfMstr) {
		super(id, fldfValue, fldfDesc, fldfUser1, fldfUser2, fldfQadc01,
				oidFldfMstr);
	}

}
