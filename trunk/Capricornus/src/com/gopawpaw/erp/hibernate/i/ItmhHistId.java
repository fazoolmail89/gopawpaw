package com.gopawpaw.erp.hibernate.i;

/**
 * ItmhHistId entity. @author MyEclipse Persistence Tools
 */
public class ItmhHistId extends AbstractItmhHistId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public ItmhHistId() {
	}

	/** minimal constructor */
	public ItmhHistId(String itmhDomain) {
		super(itmhDomain);
	}

	/** full constructor */
	public ItmhHistId(String itmhDomain, String itmhNbr, String itmhPrefix,
			String itmhType, Integer itmhItmLine, Integer itmhLine) {
		super(itmhDomain, itmhNbr, itmhPrefix, itmhType, itmhItmLine, itmhLine);
	}

}
