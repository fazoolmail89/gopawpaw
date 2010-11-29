package com.gopawpaw.erp.hibernate.c;

/**
 * CsaMstr entity. @author MyEclipse Persistence Tools
 */
public class CsaMstr extends AbstractCsaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsaMstr() {
	}

	/** minimal constructor */
	public CsaMstr(CsaMstrId id, Double oidCsaMstr) {
		super(id, oidCsaMstr);
	}

	/** full constructor */
	public CsaMstr(CsaMstrId id, String csaName, String csaType,
			String csaGroup, Integer csaCmtindx, String csaUser1,
			String csaUser2, String csaQadc01, Double oidCsaMstr) {
		super(id, csaName, csaType, csaGroup, csaCmtindx, csaUser1, csaUser2,
				csaQadc01, oidCsaMstr);
	}

}
