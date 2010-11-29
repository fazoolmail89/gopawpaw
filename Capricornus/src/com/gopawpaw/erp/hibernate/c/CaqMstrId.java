package com.gopawpaw.erp.hibernate.c;

/**
 * CaqMstrId entity. @author MyEclipse Persistence Tools
 */
public class CaqMstrId extends AbstractCaqMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CaqMstrId() {
	}

	/** minimal constructor */
	public CaqMstrId(String caqDomain) {
		super(caqDomain);
	}

	/** full constructor */
	public CaqMstrId(String caqDomain, String caqQue, String caqFileType) {
		super(caqDomain, caqQue, caqFileType);
	}

}
