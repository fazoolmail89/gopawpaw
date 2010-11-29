package com.gopawpaw.erp.hibernate.i;

/**
 * ItmDetId entity. @author MyEclipse Persistence Tools
 */
public class ItmDetId extends AbstractItmDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItmDetId() {
	}

	/** minimal constructor */
	public ItmDetId(String itmDomain) {
		super(itmDomain);
	}

	/** full constructor */
	public ItmDetId(String itmDomain, String itmNbr, String itmPrefix,
			String itmType, Integer itmItmLine, Integer itmLine) {
		super(itmDomain, itmNbr, itmPrefix, itmType, itmItmLine, itmLine);
	}

}
