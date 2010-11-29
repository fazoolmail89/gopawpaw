package com.gopawpaw.erp.hibernate.g;

/**
 * GraMstrId entity. @author MyEclipse Persistence Tools
 */
public class GraMstrId extends AbstractGraMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GraMstrId() {
	}

	/** minimal constructor */
	public GraMstrId(String graDomain) {
		super(graDomain);
	}

	/** full constructor */
	public GraMstrId(String graDomain, String graAnCode) {
		super(graDomain, graAnCode);
	}

}
