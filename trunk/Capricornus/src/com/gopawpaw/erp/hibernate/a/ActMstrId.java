package com.gopawpaw.erp.hibernate.a;

/**
 * ActMstrId entity. @author MyEclipse Persistence Tools
 */
public class ActMstrId extends AbstractActMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ActMstrId() {
	}

	/** minimal constructor */
	public ActMstrId(String actDomain) {
		super(actDomain);
	}

	/** full constructor */
	public ActMstrId(String actDomain, String actNbr, Integer actLine,
			String actContPart) {
		super(actDomain, actNbr, actLine, actContPart);
	}

}
