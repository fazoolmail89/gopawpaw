package com.gopawpaw.erp.hibernate.d;

/**
 * DydMstr entity. @author MyEclipse Persistence Tools
 */
public class DydMstr extends AbstractDydMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public DydMstr() {
	}

	/** minimal constructor */
	public DydMstr(DydMstrId id, String dydDyCode, Double oidDydMstr) {
		super(id, dydDyCode, oidDydMstr);
	}

	/** full constructor */
	public DydMstr(DydMstrId id, String dydDyCode, String dydUser1,
			String dydUser2, String dydQadc01, Double oidDydMstr) {
		super(id, dydDyCode, dydUser1, dydUser2, dydQadc01, oidDydMstr);
	}

}
