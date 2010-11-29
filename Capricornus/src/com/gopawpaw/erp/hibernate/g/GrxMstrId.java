package com.gopawpaw.erp.hibernate.g;

/**
 * GrxMstrId entity. @author MyEclipse Persistence Tools
 */
public class GrxMstrId extends AbstractGrxMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrxMstrId() {
	}

	/** minimal constructor */
	public GrxMstrId(String grxDomain) {
		super(grxDomain);
	}

	/** full constructor */
	public GrxMstrId(String grxDomain, String grxReport) {
		super(grxDomain, grxReport);
	}

}
