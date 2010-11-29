package com.gopawpaw.erp.hibernate.b;

/**
 * BdlMstrId entity. @author MyEclipse Persistence Tools
 */
public class BdlMstrId extends AbstractBdlMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public BdlMstrId() {
	}

	/** minimal constructor */
	public BdlMstrId(String bdlDomain) {
		super(bdlDomain);
	}

	/** full constructor */
	public BdlMstrId(String bdlDomain, String bdlSource, Integer bdlId) {
		super(bdlDomain, bdlSource, bdlId);
	}

}
