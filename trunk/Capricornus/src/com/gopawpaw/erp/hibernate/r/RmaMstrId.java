package com.gopawpaw.erp.hibernate.r;

/**
 * RmaMstrId entity. @author MyEclipse Persistence Tools
 */
public class RmaMstrId extends AbstractRmaMstrId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public RmaMstrId() {
	}

	/** minimal constructor */
	public RmaMstrId(String rmaDomain, String rmaNbr) {
		super(rmaDomain, rmaNbr);
	}

	/** full constructor */
	public RmaMstrId(String rmaDomain, String rmaNbr, String rmaPrefix) {
		super(rmaDomain, rmaNbr, rmaPrefix);
	}

}
