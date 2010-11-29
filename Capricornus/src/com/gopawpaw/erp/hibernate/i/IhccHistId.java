package com.gopawpaw.erp.hibernate.i;

/**
 * IhccHistId entity. @author MyEclipse Persistence Tools
 */
public class IhccHistId extends AbstractIhccHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IhccHistId() {
	}

	/** full constructor */
	public IhccHistId(String ihccDomain, String ihccInvNbr, String ihccCcNbr) {
		super(ihccDomain, ihccInvNbr, ihccCcNbr);
	}

}
