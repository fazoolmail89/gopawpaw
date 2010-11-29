package com.gopawpaw.erp.hibernate.c;

/**
 * CstMstr entity. @author MyEclipse Persistence Tools
 */
public class CstMstr extends AbstractCstMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CstMstr() {
	}

	/** minimal constructor */
	public CstMstr(Double oidCstMstr) {
		super(oidCstMstr);
	}

	/** full constructor */
	public CstMstr(String cstDesc, String cstQad01, String cstQad02,
			String cstUser1, String cstUser2, Double oidCstMstr) {
		super(cstDesc, cstQad01, cstQad02, cstUser1, cstUser2, oidCstMstr);
	}

}
