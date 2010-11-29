package com.gopawpaw.erp.hibernate.t;

/**
 * TypMstr entity. @author MyEclipse Persistence Tools
 */
public class TypMstr extends AbstractTypMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public TypMstr() {
	}

	/** minimal constructor */
	public TypMstr(Double oidTypMstr) {
		super(oidTypMstr);
	}

	/** full constructor */
	public TypMstr(String typDesc, String typMethod, Boolean typQad01,
			String typQad02, String typQad03, String typUser1, String typUser2,
			Double oidTypMstr) {
		super(typDesc, typMethod, typQad01, typQad02, typQad03, typUser1,
				typUser2, oidTypMstr);
	}

}
