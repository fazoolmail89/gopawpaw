package com.gopawpaw.erp.hibernate.c;

/**
 * ComMstr entity. @author MyEclipse Persistence Tools
 */
public class ComMstr extends AbstractComMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ComMstr() {
	}

	/** minimal constructor */
	public ComMstr(ComMstrId id, Boolean comSuppl, Double oidComMstr) {
		super(id, comSuppl, oidComMstr);
	}

	/** full constructor */
	public ComMstr(ComMstrId id, String comDesc, Boolean comSuppl,
			String comUom, String comQad01, String comQad02, String comUser1,
			String comUser2, Boolean comQad03, Boolean comLog01,
			Double oidComMstr) {
		super(id, comDesc, comSuppl, comUom, comQad01, comQad02, comUser1,
				comUser2, comQad03, comLog01, oidComMstr);
	}

}
