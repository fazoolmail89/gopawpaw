package com.gopawpaw.erp.hibernate.a;

/**
 * AscMstrId entity. @author MyEclipse Persistence Tools
 */
public class AscMstrId extends AbstractAscMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public AscMstrId() {
	}

	/** minimal constructor */
	public AscMstrId(String ascDomain) {
		super(ascDomain);
	}

	/** full constructor */
	public AscMstrId(String ascDomain, String ascAcc, String ascSub,
			String ascCc) {
		super(ascDomain, ascAcc, ascSub, ascCc);
	}

}
