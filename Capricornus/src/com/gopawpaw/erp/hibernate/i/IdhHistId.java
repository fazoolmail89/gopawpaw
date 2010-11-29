package com.gopawpaw.erp.hibernate.i;

/**
 * IdhHistId entity. @author MyEclipse Persistence Tools
 */
public class IdhHistId extends AbstractIdhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IdhHistId() {
	}

	/** minimal constructor */
	public IdhHistId(String idhDomain, String idhNbr) {
		super(idhDomain, idhNbr);
	}

	/** full constructor */
	public IdhHistId(String idhDomain, String idhInvNbr, String idhNbr,
			Integer idhLine) {
		super(idhDomain, idhInvNbr, idhNbr, idhLine);
	}

}
