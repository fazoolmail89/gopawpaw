package com.gopawpaw.erp.hibernate.c;

/**
 * CsimMstr entity. @author MyEclipse Persistence Tools
 */
public class CsimMstr extends AbstractCsimMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsimMstr() {
	}

	/** minimal constructor */
	public CsimMstr(CsimMstrId id, Double oidCsimMstr) {
		super(id, oidCsimMstr);
	}

	/** full constructor */
	public CsimMstr(CsimMstrId id, String csimDesc, String csimUm,
			Integer csimCmtindx, String csimUser1, String csimUser2,
			String csimQadc01, Double oidCsimMstr) {
		super(id, csimDesc, csimUm, csimCmtindx, csimUser1, csimUser2,
				csimQadc01, oidCsimMstr);
	}

}
