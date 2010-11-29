package com.gopawpaw.erp.hibernate.q;

/**
 * QobDetId entity. @author MyEclipse Persistence Tools
 */
public class QobDetId extends AbstractQobDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QobDetId() {
	}

	/** minimal constructor */
	public QobDetId(String qobDomain) {
		super(qobDomain);
	}

	/** full constructor */
	public QobDetId(String qobDomain, String qobNbr, Integer qobLine,
			String qobFeature, String qobPart) {
		super(qobDomain, qobNbr, qobLine, qobFeature, qobPart);
	}

}
