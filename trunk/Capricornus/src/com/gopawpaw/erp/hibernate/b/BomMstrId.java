package com.gopawpaw.erp.hibernate.b;

/**
 * BomMstrId entity. @author MyEclipse Persistence Tools
 */
public class BomMstrId extends AbstractBomMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BomMstrId() {
	}

	/** full constructor */
	public BomMstrId(String bomDomain, String bomParent) {
		super(bomDomain, bomParent);
	}

}
