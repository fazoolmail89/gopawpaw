package com.gopawpaw.erp.hibernate.q;

/**
 * QodDetId entity. @author MyEclipse Persistence Tools
 */
public class QodDetId extends AbstractQodDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QodDetId() {
	}

	/** minimal constructor */
	public QodDetId(String qodDomain, String qodNbr) {
		super(qodDomain, qodNbr);
	}

	/** full constructor */
	public QodDetId(String qodDomain, String qodNbr, Integer qodLine) {
		super(qodDomain, qodNbr, qodLine);
	}

}
