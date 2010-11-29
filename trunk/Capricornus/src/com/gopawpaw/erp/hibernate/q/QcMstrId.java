package com.gopawpaw.erp.hibernate.q;

/**
 * QcMstrId entity. @author MyEclipse Persistence Tools
 */
public class QcMstrId extends AbstractQcMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QcMstrId() {
	}

	/** minimal constructor */
	public QcMstrId(String qcDomain, String qcNbr) {
		super(qcDomain, qcNbr);
	}

	/** full constructor */
	public QcMstrId(String qcDomain, String qcNbr, String qcLot) {
		super(qcDomain, qcNbr, qcLot);
	}

}
