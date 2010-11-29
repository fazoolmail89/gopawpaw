package com.gopawpaw.erp.hibernate.q;

/**
 * QpsDetId entity. @author MyEclipse Persistence Tools
 */
public class QpsDetId extends AbstractQpsDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QpsDetId() {
	}

	/** minimal constructor */
	public QpsDetId(String qpsDomain) {
		super(qpsDomain);
	}

	/** full constructor */
	public QpsDetId(String qpsDomain, String qpsRouting, Integer qpsOp,
			String qpsPart) {
		super(qpsDomain, qpsRouting, qpsOp, qpsPart);
	}

}
