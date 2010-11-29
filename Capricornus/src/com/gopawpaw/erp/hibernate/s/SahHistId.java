package com.gopawpaw.erp.hibernate.s;

/**
 * SahHistId entity. @author MyEclipse Persistence Tools
 */
public class SahHistId extends AbstractSahHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public SahHistId() {
	}

	/** minimal constructor */
	public SahHistId(String sahDomain) {
		super(sahDomain);
	}

	/** full constructor */
	public SahHistId(String sahDomain, Integer sahTrnbr) {
		super(sahDomain, sahTrnbr);
	}

}
