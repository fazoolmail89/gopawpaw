package com.gopawpaw.erp.hibernate.g;

/**
 * GrhdDetId entity. @author MyEclipse Persistence Tools
 */
public class GrhdDetId extends AbstractGrhdDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public GrhdDetId() {
	}

	/** minimal constructor */
	public GrhdDetId(String grhdDomain) {
		super(grhdDomain);
	}

	/** full constructor */
	public GrhdDetId(String grhdDomain, String grhdGroup, String grhdType,
			Integer grhdSeq, String grhdCode, Boolean grhdLink,
			String grhdLinkType) {
		super(grhdDomain, grhdGroup, grhdType, grhdSeq, grhdCode, grhdLink,
				grhdLinkType);
	}

}
