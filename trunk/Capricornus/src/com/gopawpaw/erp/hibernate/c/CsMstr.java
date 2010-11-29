package com.gopawpaw.erp.hibernate.c;

/**
 * CsMstr entity. @author MyEclipse Persistence Tools
 */
public class CsMstr extends AbstractCsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CsMstr() {
	}

	/** minimal constructor */
	public CsMstr(CsMstrId id, String csType, Double oidCsMstr) {
		super(id, csType, oidCsMstr);
	}

	/** full constructor */
	public CsMstr(CsMstrId id, String csMethod, String csType, String csDesc,
			String csUser1, String csUser2, String csQadc01, Double oidCsMstr) {
		super(id, csMethod, csType, csDesc, csUser1, csUser2, csQadc01,
				oidCsMstr);
	}

}
