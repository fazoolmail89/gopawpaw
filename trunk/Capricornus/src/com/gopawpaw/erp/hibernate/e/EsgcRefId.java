package com.gopawpaw.erp.hibernate.e;

/**
 * EsgcRefId entity. @author MyEclipse Persistence Tools
 */
public class EsgcRefId extends AbstractEsgcRefId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EsgcRefId() {
	}

	/** full constructor */
	public EsgcRefId(Double oidEscatMstr, Double oidAtgMstr) {
		super(oidEscatMstr, oidAtgMstr);
	}

}
