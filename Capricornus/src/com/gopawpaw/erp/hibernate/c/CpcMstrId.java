package com.gopawpaw.erp.hibernate.c;

/**
 * CpcMstrId entity. @author MyEclipse Persistence Tools
 */
public class CpcMstrId extends AbstractCpcMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CpcMstrId() {
	}

	/** minimal constructor */
	public CpcMstrId(String cpcDomain) {
		super(cpcDomain);
	}

	/** full constructor */
	public CpcMstrId(String cpcDomain, String cpcCust, Integer cpcYear,
			String cpcType) {
		super(cpcDomain, cpcCust, cpcYear, cpcType);
	}

}
