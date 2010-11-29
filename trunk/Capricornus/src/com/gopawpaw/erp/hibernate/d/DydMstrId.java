package com.gopawpaw.erp.hibernate.d;

/**
 * DydMstrId entity. @author MyEclipse Persistence Tools
 */
public class DydMstrId extends AbstractDydMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DydMstrId() {
	}

	/** full constructor */
	public DydMstrId(String dydDomain, String dydTrType, String dydDocType,
			String dydEntityFr, String dydEntityTo) {
		super(dydDomain, dydTrType, dydDocType, dydEntityFr, dydEntityTo);
	}

}
