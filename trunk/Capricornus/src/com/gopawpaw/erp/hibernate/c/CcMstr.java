package com.gopawpaw.erp.hibernate.c;

/**
 * CcMstr entity. @author MyEclipse Persistence Tools
 */
public class CcMstr extends AbstractCcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CcMstr() {
	}

	/** minimal constructor */
	public CcMstr(CcMstrId id, Double oidCcMstr) {
		super(id, oidCcMstr);
	}

	/** full constructor */
	public CcMstr(CcMstrId id, String ccDesc, String ccUser1, String ccUser2,
			String ccQadc01, Double oidCcMstr) {
		super(id, ccDesc, ccUser1, ccUser2, ccQadc01, oidCcMstr);
	}

}
