package com.gopawpaw.erp.hibernate.q;

/**
 * QodrDetId entity. @author MyEclipse Persistence Tools
 */
public class QodrDetId extends AbstractQodrDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public QodrDetId() {
	}

	/** minimal constructor */
	public QodrDetId(String qodrDomain) {
		super(qodrDomain);
	}

	/** full constructor */
	public QodrDetId(String qodrDomain, String qodrNbr, Integer qodrLine,
			Integer qodrSeq) {
		super(qodrDomain, qodrNbr, qodrLine, qodrSeq);
	}

}
