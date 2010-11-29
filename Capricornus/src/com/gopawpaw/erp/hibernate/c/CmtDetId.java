package com.gopawpaw.erp.hibernate.c;

/**
 * CmtDetId entity. @author MyEclipse Persistence Tools
 */
public class CmtDetId extends AbstractCmtDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CmtDetId() {
	}

	/** minimal constructor */
	public CmtDetId(String cmtDomain) {
		super(cmtDomain);
	}

	/** full constructor */
	public CmtDetId(String cmtDomain, Integer cmtIndx, Integer cmtSeq) {
		super(cmtDomain, cmtIndx, cmtSeq);
	}

}
