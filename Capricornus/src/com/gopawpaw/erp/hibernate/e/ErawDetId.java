package com.gopawpaw.erp.hibernate.e;

/**
 * ErawDetId entity. @author MyEclipse Persistence Tools
 */
public class ErawDetId extends AbstractErawDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ErawDetId() {
	}

	/** minimal constructor */
	public ErawDetId(String erawDomain) {
		super(erawDomain);
	}

	/** full constructor */
	public ErawDetId(Integer erawDocId, Integer erawDocLine, String erawDomain) {
		super(erawDocId, erawDocLine, erawDomain);
	}

}
