package com.gopawpaw.erp.hibernate.s;

/**
 * SorMstrId entity. @author MyEclipse Persistence Tools
 */
public class SorMstrId extends AbstractSorMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SorMstrId() {
	}

	/** minimal constructor */
	public SorMstrId(String sorDomain) {
		super(sorDomain);
	}

	/** full constructor */
	public SorMstrId(String sorDomain, String sorNbr, Integer sorSeq) {
		super(sorDomain, sorNbr, sorSeq);
	}

}
