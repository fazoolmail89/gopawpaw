package com.gopawpaw.erp.hibernate.i;

/**
 * IlgHistId entity. @author MyEclipse Persistence Tools
 */
public class IlgHistId extends AbstractIlgHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IlgHistId() {
	}

	/** minimal constructor */
	public IlgHistId(String ilgDomain) {
		super(ilgDomain);
	}

	/** full constructor */
	public IlgHistId(Integer ilgDocId, Integer ilgDocSufx, String ilgDomain) {
		super(ilgDocId, ilgDocSufx, ilgDomain);
	}

}
