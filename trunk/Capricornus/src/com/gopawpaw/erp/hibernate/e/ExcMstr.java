package com.gopawpaw.erp.hibernate.e;

/**
 * ExcMstr entity. @author MyEclipse Persistence Tools
 */
public class ExcMstr extends AbstractExcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ExcMstr() {
	}

	/** minimal constructor */
	public ExcMstr(ExcMstrId id, Double oidExcMstr) {
		super(id, oidExcMstr);
	}

	/** full constructor */
	public ExcMstr(ExcMstrId id, String excXcc, String excXacType,
			Boolean excXallCc, String excUser1, String excUser2,
			String excQadc01, Double oidExcMstr) {
		super(id, excXcc, excXacType, excXallCc, excUser1, excUser2, excQadc01,
				oidExcMstr);
	}

}
