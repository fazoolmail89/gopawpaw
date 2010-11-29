package com.gopawpaw.erp.hibernate.g;

/**
 * GrcdDetId entity. @author MyEclipse Persistence Tools
 */
public class GrcdDetId extends AbstractGrcdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrcdDetId() {
	}

	/** minimal constructor */
	public GrcdDetId(String grcdDomain) {
		super(grcdDomain);
	}

	/** full constructor */
	public GrcdDetId(String grcdDomain, String grcdColGroup, Integer grcdCol) {
		super(grcdDomain, grcdColGroup, grcdCol);
	}

}
