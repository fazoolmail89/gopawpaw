package com.gopawpaw.erp.hibernate.q;

/**
 * QcsMstrId entity. @author MyEclipse Persistence Tools
 */
public class QcsMstrId extends AbstractQcsMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public QcsMstrId() {
	}

	/** minimal constructor */
	public QcsMstrId(String qcsDomain) {
		super(qcsDomain);
	}

	/** full constructor */
	public QcsMstrId(String qcsDomain, String qcsPart) {
		super(qcsDomain, qcsPart);
	}

}
