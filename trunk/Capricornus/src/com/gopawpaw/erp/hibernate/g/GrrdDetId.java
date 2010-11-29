package com.gopawpaw.erp.hibernate.g;

/**
 * GrrdDetId entity. @author MyEclipse Persistence Tools
 */
public class GrrdDetId extends AbstractGrrdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrrdDetId() {
	}

	/** minimal constructor */
	public GrrdDetId(String grrdDomain) {
		super(grrdDomain);
	}

	/** full constructor */
	public GrrdDetId(String grrdDomain, String grrdRowGroup, Integer grrdRow) {
		super(grrdDomain, grrdRowGroup, grrdRow);
	}

}
