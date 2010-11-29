package com.gopawpaw.erp.hibernate.q;

/**
 * QadWkflId entity. @author MyEclipse Persistence Tools
 */
public class QadWkflId extends AbstractQadWkflId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public QadWkflId() {
	}

	/** minimal constructor */
	public QadWkflId(String qadDomain) {
		super(qadDomain);
	}

	/** full constructor */
	public QadWkflId(String qadDomain, String qadKey1, String qadKey2) {
		super(qadDomain, qadKey1, qadKey2);
	}

}
