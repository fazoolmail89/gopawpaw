package com.gopawpaw.erp.hibernate.f;

/**
 * FisMstrId entity. @author MyEclipse Persistence Tools
 */
public class FisMstrId extends AbstractFisMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public FisMstrId() {
	}

	/** minimal constructor */
	public FisMstrId(String fisDomain) {
		super(fisDomain);
	}

	/** full constructor */
	public FisMstrId(String fisDomain, String fisSort, String fisRowType) {
		super(fisDomain, fisSort, fisRowType);
	}

}
