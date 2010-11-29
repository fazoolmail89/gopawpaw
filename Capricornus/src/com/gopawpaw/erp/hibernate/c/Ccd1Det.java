package com.gopawpaw.erp.hibernate.c;

/**
 * Ccd1Det entity. @author MyEclipse Persistence Tools
 */
public class Ccd1Det extends AbstractCcd1Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ccd1Det() {
	}

	/** minimal constructor */
	public Ccd1Det(Ccd1DetId id, Double oidCcd1Det) {
		super(id, oidCcd1Det);
	}

	/** full constructor */
	public Ccd1Det(Ccd1DetId id, String ccd1AccBeg, String ccd1AccEnd,
			String ccd1User1, String ccd1User2, String ccd1Qadc01,
			Double oidCcd1Det) {
		super(id, ccd1AccBeg, ccd1AccEnd, ccd1User1, ccd1User2, ccd1Qadc01,
				oidCcd1Det);
	}

}
