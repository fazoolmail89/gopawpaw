package com.gopawpaw.erp.hibernate.c;

/**
 * CncudDetId entity. @author MyEclipse Persistence Tools
 */
public class CncudDetId extends AbstractCncudDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CncudDetId() {
	}

	/** full constructor */
	public CncudDetId(String cncudDomain, Integer cncudCncuPkey,
			Integer cncudCncixPkey) {
		super(cncudDomain, cncudCncuPkey, cncudCncixPkey);
	}

}
