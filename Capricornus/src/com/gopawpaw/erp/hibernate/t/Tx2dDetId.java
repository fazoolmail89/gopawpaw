package com.gopawpaw.erp.hibernate.t;

/**
 * Tx2dDetId entity. @author MyEclipse Persistence Tools
 */
public class Tx2dDetId extends AbstractTx2dDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Tx2dDetId() {
	}

	/** full constructor */
	public Tx2dDetId(String tx2dDomain, String tx2dRef, String tx2dNbr,
			Integer tx2dLine, String tx2dTrl, String tx2dTrType,
			String tx2dTaxCode) {
		super(tx2dDomain, tx2dRef, tx2dNbr, tx2dLine, tx2dTrl, tx2dTrType,
				tx2dTaxCode);
	}

}
