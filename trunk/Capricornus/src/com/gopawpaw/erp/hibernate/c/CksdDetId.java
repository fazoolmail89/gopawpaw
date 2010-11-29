package com.gopawpaw.erp.hibernate.c;

/**
 * CksdDetId entity. @author MyEclipse Persistence Tools
 */
public class CksdDetId extends AbstractCksdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CksdDetId() {
	}

	/** minimal constructor */
	public CksdDetId(String cksdDomain) {
		super(cksdDomain);
	}

	/** full constructor */
	public CksdDetId(String cksdDomain, String cksdBatch, Integer cksdLine,
			Integer cksdNbr) {
		super(cksdDomain, cksdBatch, cksdLine, cksdNbr);
	}

}
