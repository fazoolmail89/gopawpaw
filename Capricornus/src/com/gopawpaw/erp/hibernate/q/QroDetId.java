package com.gopawpaw.erp.hibernate.q;

/**
 * QroDetId entity. @author MyEclipse Persistence Tools
 */
public class QroDetId extends AbstractQroDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QroDetId() {
	}

	/** full constructor */
	public QroDetId(String qroDomain, String qroRouting, Integer qroOp) {
		super(qroDomain, qroRouting, qroOp);
	}

}
