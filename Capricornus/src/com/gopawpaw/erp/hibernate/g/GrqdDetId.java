package com.gopawpaw.erp.hibernate.g;

/**
 * GrqdDetId entity. @author MyEclipse Persistence Tools
 */
public class GrqdDetId extends AbstractGrqdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrqdDetId() {
	}

	/** minimal constructor */
	public GrqdDetId(String grqdDomain) {
		super(grqdDomain);
	}

	/** full constructor */
	public GrqdDetId(String grqdDomain, Integer grqdYear, Integer grqdQuarter) {
		super(grqdDomain, grqdYear, grqdQuarter);
	}

}
