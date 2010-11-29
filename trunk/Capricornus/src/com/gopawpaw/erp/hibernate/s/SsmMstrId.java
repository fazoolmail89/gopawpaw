package com.gopawpaw.erp.hibernate.s;

/**
 * SsmMstrId entity. @author MyEclipse Persistence Tools
 */
public class SsmMstrId extends AbstractSsmMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SsmMstrId() {
	}

	/** minimal constructor */
	public SsmMstrId(String ssmDomain) {
		super(ssmDomain);
	}

	/** full constructor */
	public SsmMstrId(String ssmDomain, String ssmNetwork) {
		super(ssmDomain, ssmNetwork);
	}

}
