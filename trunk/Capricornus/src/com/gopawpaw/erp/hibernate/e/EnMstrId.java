package com.gopawpaw.erp.hibernate.e;

/**
 * EnMstrId entity. @author MyEclipse Persistence Tools
 */
public class EnMstrId extends AbstractEnMstrId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EnMstrId() {
	}

	/** minimal constructor */
	public EnMstrId(String enDomain) {
		super(enDomain);
	}

	/** full constructor */
	public EnMstrId(String enDomain, String enEntity) {
		super(enDomain, enEntity);
	}

}
