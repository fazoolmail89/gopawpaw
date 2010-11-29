package com.gopawpaw.erp.hibernate.e;

/**
 * EcmMstrId entity. @author MyEclipse Persistence Tools
 */
public class EcmMstrId extends AbstractEcmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EcmMstrId() {
	}

	/** minimal constructor */
	public EcmMstrId(String ecmDomain) {
		super(ecmDomain);
	}

	/** full constructor */
	public EcmMstrId(String ecmDomain, String ecmNbr) {
		super(ecmDomain, ecmNbr);
	}

}
