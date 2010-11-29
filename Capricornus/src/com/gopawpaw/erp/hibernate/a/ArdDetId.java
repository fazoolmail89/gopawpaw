package com.gopawpaw.erp.hibernate.a;

/**
 * ArdDetId entity. @author MyEclipse Persistence Tools
 */
public class ArdDetId extends AbstractArdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ArdDetId() {
	}

	/** minimal constructor */
	public ArdDetId(String ardDomain) {
		super(ardDomain);
	}

	/** full constructor */
	public ArdDetId(String ardDomain, String ardNbr, String ardRef,
			String ardType, String ardTaxAt, String ardEntity, String ardAcct,
			String ardSub, String ardCc, String ardTax) {
		super(ardDomain, ardNbr, ardRef, ardType, ardTaxAt, ardEntity, ardAcct,
				ardSub, ardCc, ardTax);
	}

}
