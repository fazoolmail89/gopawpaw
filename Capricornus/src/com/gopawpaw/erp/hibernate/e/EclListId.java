package com.gopawpaw.erp.hibernate.e;

/**
 * EclListId entity. @author MyEclipse Persistence Tools
 */
public class EclListId extends AbstractEclListId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EclListId() {
	}

	/** minimal constructor */
	public EclListId(String eclDomain) {
		super(eclDomain);
	}

	/** full constructor */
	public EclListId(String eclDomain, String eclType, String eclGroup,
			String eclId) {
		super(eclDomain, eclType, eclGroup, eclId);
	}

}
