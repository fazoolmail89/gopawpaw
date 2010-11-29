package com.gopawpaw.erp.hibernate.c;

/**
 * CclsMstrId entity. @author MyEclipse Persistence Tools
 */
public class CclsMstrId extends AbstractCclsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CclsMstrId() {
	}

	/** full constructor */
	public CclsMstrId(String cclsDomain, String cclsShipfrom, String cclsShipto) {
		super(cclsDomain, cclsShipfrom, cclsShipto);
	}

}
