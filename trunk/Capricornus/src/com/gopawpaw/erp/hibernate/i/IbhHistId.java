package com.gopawpaw.erp.hibernate.i;

/**
 * IbhHistId entity. @author MyEclipse Persistence Tools
 */
public class IbhHistId extends AbstractIbhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public IbhHistId() {
	}

	/** minimal constructor */
	public IbhHistId(String ibhDomain) {
		super(ibhDomain);
	}

	/** full constructor */
	public IbhHistId(String ibhDomain, String ibhInvNbr, String ibhNbr,
			Integer ibhLine, String ibhFeature, String ibhPart) {
		super(ibhDomain, ibhInvNbr, ibhNbr, ibhLine, ibhFeature, ibhPart);
	}

}
