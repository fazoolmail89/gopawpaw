package com.gopawpaw.erp.hibernate.d;

/**
 * DalMstrId entity. @author MyEclipse Persistence Tools
 */
public class DalMstrId extends AbstractDalMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public DalMstrId() {
	}

	/** minimal constructor */
	public DalMstrId(String dalDomain) {
		super(dalDomain);
	}

	/** full constructor */
	public DalMstrId(String dalDomain, String dalListId) {
		super(dalDomain, dalListId);
	}

}
