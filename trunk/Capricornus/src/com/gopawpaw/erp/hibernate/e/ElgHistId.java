package com.gopawpaw.erp.hibernate.e;

/**
 * ElgHistId entity. @author MyEclipse Persistence Tools
 */
public class ElgHistId extends AbstractElgHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ElgHistId() {
	}

	/** minimal constructor */
	public ElgHistId(String elgDomain) {
		super(elgDomain);
	}

	/** full constructor */
	public ElgHistId(Integer elgDocId, Integer elgDocSufx, String elgDomain) {
		super(elgDocId, elgDocSufx, elgDomain);
	}

}
