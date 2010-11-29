package com.gopawpaw.erp.hibernate.a;

/**
 * AlmMstrId entity. @author MyEclipse Persistence Tools
 */
public class AlmMstrId extends AbstractAlmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AlmMstrId() {
	}

	/** minimal constructor */
	public AlmMstrId(String almDomain, String almLotGrp) {
		super(almDomain, almLotGrp);
	}

	/** full constructor */
	public AlmMstrId(String almDomain, String almLotGrp, String almSite) {
		super(almDomain, almLotGrp, almSite);
	}

}
