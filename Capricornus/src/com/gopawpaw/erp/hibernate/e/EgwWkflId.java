package com.gopawpaw.erp.hibernate.e;

/**
 * EgwWkflId entity. @author MyEclipse Persistence Tools
 */
public class EgwWkflId extends AbstractEgwWkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgwWkflId() {
	}

	/** minimal constructor */
	public EgwWkflId(String egwDomain) {
		super(egwDomain);
	}

	/** full constructor */
	public EgwWkflId(String egwDomain, String egwUserid, String egwEngCode) {
		super(egwDomain, egwUserid, egwEngCode);
	}

}
