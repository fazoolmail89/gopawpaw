package com.gopawpaw.erp.hibernate.s;

/**
 * SbMstr entity. @author MyEclipse Persistence Tools
 */
public class SbMstr extends AbstractSbMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SbMstr() {
	}

	/** minimal constructor */
	public SbMstr(SbMstrId id, Double oidSbMstr) {
		super(id, oidSbMstr);
	}

	/** full constructor */
	public SbMstr(SbMstrId id, String sbDesc, String sbUser1, String sbUser2,
			String sbQadc01, Double oidSbMstr) {
		super(id, sbDesc, sbUser1, sbUser2, sbQadc01, oidSbMstr);
	}

}
