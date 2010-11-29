package com.gopawpaw.erp.hibernate.q;

/**
 * QorMstrId entity. @author MyEclipse Persistence Tools
 */
public class QorMstrId extends AbstractQorMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public QorMstrId() {
	}

	/** minimal constructor */
	public QorMstrId(String qorDomain) {
		super(qorDomain);
	}

	/** full constructor */
	public QorMstrId(String qorDomain, String qorNbr, Integer qorSeq) {
		super(qorDomain, qorNbr, qorSeq);
	}

}
