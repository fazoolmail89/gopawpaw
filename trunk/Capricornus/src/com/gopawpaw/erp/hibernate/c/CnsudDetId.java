package com.gopawpaw.erp.hibernate.c;

/**
 * CnsudDetId entity. @author MyEclipse Persistence Tools
 */
public class CnsudDetId extends AbstractCnsudDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CnsudDetId() {
	}

	/** full constructor */
	public CnsudDetId(String cnsudDomain, Integer cnsudCnsuPkey,
			Integer cnsudCnsixPkey) {
		super(cnsudDomain, cnsudCnsuPkey, cnsudCnsixPkey);
	}

}
