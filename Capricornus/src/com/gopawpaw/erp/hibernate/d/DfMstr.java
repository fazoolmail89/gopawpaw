package com.gopawpaw.erp.hibernate.d;

/**
 * DfMstr entity. @author MyEclipse Persistence Tools
 */
public class DfMstr extends AbstractDfMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DfMstr() {
	}

	/** minimal constructor */
	public DfMstr(DfMstrId id, String dfDesc, String dfFormCode, Boolean dfInv,
			Double oidDfMstr) {
		super(id, dfDesc, dfFormCode, dfInv, oidDfMstr);
	}

	/** full constructor */
	public DfMstr(DfMstrId id, String dfDesc, String dfFormCode, Boolean dfInv,
			String dfUser1, String dfUser2, String dfQadc01, Double oidDfMstr) {
		super(id, dfDesc, dfFormCode, dfInv, dfUser1, dfUser2, dfQadc01,
				oidDfMstr);
	}

}
