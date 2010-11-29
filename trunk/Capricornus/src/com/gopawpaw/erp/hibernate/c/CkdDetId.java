package com.gopawpaw.erp.hibernate.c;

/**
 * CkdDetId entity. @author MyEclipse Persistence Tools
 */
public class CkdDetId extends AbstractCkdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CkdDetId() {
	}

	/** minimal constructor */
	public CkdDetId(String ckdDomain) {
		super(ckdDomain);
	}

	/** full constructor */
	public CkdDetId(String ckdDomain, String ckdRef, String ckdVoucher,
			String ckdType, String ckdEntity, String ckdAcct, String ckdSub,
			String ckdCc, String ckdProject) {
		super(ckdDomain, ckdRef, ckdVoucher, ckdType, ckdEntity, ckdAcct,
				ckdSub, ckdCc, ckdProject);
	}

}
